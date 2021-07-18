package com.sru.booksong.fragment_;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sru.booksong.DB_SONG.DB;
import com.sru.booksong.DB_SONG.SingerDAO;
import com.sru.booksong.DB_SONG.tblSinger;
import com.sru.booksong.R;
import com.sru.booksong.recyler_.sing_adapter.Singer_Adapter;
import com.sru.booksong.recyler_.song_apdater.Song_Apdater;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

/**
 * A simple {@link Fragment} subclass.
 */
public class fSing extends Fragment {

    private RecyclerView sing_recy;
    private ArrayList<tblSinger> ls = new ArrayList<>();
    public fSing() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment



        View v =  inflater.inflate(R.layout.fragment_f_sing, container, false);
        sing_recy = v.findViewById(R.id.SINGRCYL);
        sing_recy.setLayoutManager(new GridLayoutManager(getContext(),3));

        return v;

    }

    //--- Input it into onActivity


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for(int i=0 ; i<1000000 ; i++) {
                    ls.add(new tblSinger("Prasovat "+i, "www"));
                    ls.add(new tblSinger("Nob by", "www"));
                }

                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        sing_recy.setAdapter(new Singer_Adapter(ls));
                    }
                });


            }// end method run
        }; // end Runnalble

        Executors.newSingleThreadExecutor().execute(runnable);



    }// end OnActivityCreatedd
}
