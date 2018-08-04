package fistapplication.cls.com.assignmentsoundcloud;

import android.app.ListActivity;
import android.os.Trace;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;

import java.util.ArrayList;

import fistapplication.cls.com.assignmentsoundcloud.Adapters.LikesListAdapter;
import fistapplication.cls.com.assignmentsoundcloud.Base.MyBaseActivity;
import fistapplication.cls.com.assignmentsoundcloud.Model.Track;

public class LikesActivity extends MyBaseActivity {

    RecyclerView LikesList;
    LikesListAdapter adapter;
    LinearLayoutManager layoutManager;
    ArrayList<Track> tracks;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_likes);
        LoadTracks();
        LikesList=findViewById(R.id.likes_list);
        adapter=new LikesListAdapter(tracks);
        layoutManager=new LinearLayoutManager(activity);
        adapter.setOnItemClickListener(new LikesListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Track track, int position) {
              //  ShowConfirmationDialoge("warning","do you want to asd;ansdkads","yes","no");
              ShowProgressBar();
            }
        });
        adapter.setOntLikeClickListener(new LikesListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Track track, int position) {

            }
        });
        LikesList.setAdapter(adapter);
        LikesList.setLayoutManager(layoutManager);


        /**************************************/

        LikesFragment myFragment =new LikesFragment();

        FragmentManager fragmentManager= getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction transaction= fragmentManager.beginTransaction()
                .add(R.id.fragmentContainer,myFragment);
        transaction.commit();



    }

   void  LoadTracks(){
        tracks=new ArrayList<>();
        for(int i=0;i<50;i++)
            tracks.add(new Track("nabil","ay name "+i,"1/10/2020","123"));

    }
}
