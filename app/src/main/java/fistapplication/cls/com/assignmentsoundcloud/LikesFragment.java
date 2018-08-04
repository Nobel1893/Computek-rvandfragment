package fistapplication.cls.com.assignmentsoundcloud;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import fistapplication.cls.com.assignmentsoundcloud.Adapters.LikesListAdapter;
import fistapplication.cls.com.assignmentsoundcloud.Model.Track;

/**
 * Created by CLS on 8/4/2018.
 */

public class LikesFragment  extends Fragment{

    RecyclerView LikesList;
    LikesListAdapter adapter;
    LinearLayoutManager layoutManager;
    ArrayList<Track> tracks;

    public LikesFragment(){

    }

    View MainView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        MainView= inflater.inflate(R.layout.likes_fragment,container,false);


        LoadTracks();
        LikesList=MainView.findViewById(R.id.likes_list);
        adapter=new LikesListAdapter(tracks);
        layoutManager=new LinearLayoutManager(getContext());
        adapter.setOnItemClickListener(new LikesListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Track track, int position) {
                //  ShowConfirmationDialoge("warning","do you want to asd;ansdkads","yes","no");
              //  ShowProgressBar();
            }
        });
        adapter.setOntLikeClickListener(new LikesListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Track track, int position) {

            }
        });
        LikesList.setAdapter(adapter);
        LikesList.setLayoutManager(layoutManager);



        return MainView;


    }
    void  LoadTracks(){
        tracks=new ArrayList<>();
        for(int i=0;i<50;i++)
            tracks.add(new Track("nabil","ay name "+i,"1/10/2020","123"));

    }

}
