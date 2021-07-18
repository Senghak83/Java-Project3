package com.sru.booksong.recyler_.production_apdater;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Production_Apdater extends RecyclerView.Adapter<Product_horlder> {

    private int layout;
    private ArrayList ls;

    //----- constructor ---
    public Production_Apdater(int layout, ArrayList ls ){
        this.layout = layout;
        this.ls = ls;
    }

    @NonNull
    @Override
    public Product_horlder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater infl = LayoutInflater.from(parent.getContext());
        View view = infl.inflate(layout,parent,false);

        return new Product_horlder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Product_horlder holder, int position) {

    }

    @Override
    public int getItemCount() {

        return 10;
       // return ls.isEmpty()?0 : ls.size();
    }
}
