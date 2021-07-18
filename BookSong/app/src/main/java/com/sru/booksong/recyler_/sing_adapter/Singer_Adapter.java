package com.sru.booksong.recyler_.sing_adapter;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.sru.booksong.DB_SONG.tblSinger;
import com.sru.booksong.R;

import java.util.ArrayList;

public class Singer_Adapter extends RecyclerView.Adapter<Singer_horder> {

    private ArrayList<tblSinger> ls;
    private Fragment fragment;

    public Singer_Adapter(ArrayList<tblSinger> ls){

        this.ls = ls;
        //this.fragment = fragment;
    }

    @NonNull
    @Override
    public Singer_horder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater infl = LayoutInflater.from(parent.getContext());
        View v = infl.inflate(R.layout.sing_list,parent,false);


        return new Singer_horder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Singer_horder holder, int position) {

       // tblSinger singer= ls.get(position);

        holder.getSingerName().setText(ls.get(position).getName());

        //holder.getSingerName().setText(ls.get(position).getName());
        //holder.getSingerName().setText(ls.get(position).getName());
        //holder.getSingerImage().setImageResource(ls.get(position).getUrl());
        // get Image from server
//        Glide.with(fragment)
//                .load(ls.get(position).getUrl())
//                .into(holder.getSingerImage());


    }

    @Override
    public int getItemCount() {


        return ls.isEmpty() ? 0 : ls.size();
    }
}
