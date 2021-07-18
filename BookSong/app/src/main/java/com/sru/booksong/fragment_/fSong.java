package com.sru.booksong.fragment_;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sru.booksong.R;
import com.sru.booksong.recyler_.song_apdater.Song_Apdater;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class fSong extends Fragment {

    private RecyclerView song_recy;

    public fSong() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_f_song, container, false);

        song_recy = v.findViewById(R.id.SRCYL);
        song_recy.setLayoutManager(new LinearLayoutManager(getContext()));
        song_recy.setAdapter(new Song_Apdater(new ArrayList()));


        return v;
    }

}
