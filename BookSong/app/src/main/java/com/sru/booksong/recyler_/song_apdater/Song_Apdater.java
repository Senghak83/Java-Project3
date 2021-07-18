package com.sru.booksong.recyler_.song_apdater;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sru.booksong.R;

import java.util.ArrayList;

public class Song_Apdater extends RecyclerView.Adapter<Song_horlder> {


    private ArrayList ls;
    public Song_Apdater( ArrayList ls){

        this.ls = ls;
    }

    @NonNull
    @Override
    public Song_horlder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater infl = LayoutInflater.from(parent.getContext());
        View v = infl.inflate(R.layout.song_list,parent,false);
        return new Song_horlder(v);

        //return null;
    }

    @Override
    public void onBindViewHolder(@NonNull Song_horlder holder, int position) {

    }

    @Override
    public int getItemCount() {

        return 10;
    }
}
