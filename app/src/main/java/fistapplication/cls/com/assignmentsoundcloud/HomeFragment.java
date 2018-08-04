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

public class HomeFragment extends Fragment{

    public HomeFragment(){

    }

    View MainView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        MainView= inflater.inflate(R.layout.home_fragment,container,false);




        return MainView;


    }

}
