package com.sru.booksong.fragment_;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sru.booksong.R;
import com.sru.booksong.recyler_.production_apdater.Production_Apdater;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class fpro extends Fragment {

    private RecyclerView p_recy;

    public fpro() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view =  inflater.inflate(R.layout.fragment_fpro, container, false);
        p_recy = view.findViewById(R.id.production_recycler);
        p_recy.setLayoutManager(new LinearLayoutManager(getContext()));
        p_recy.setAdapter(new Production_Apdater(R.layout.production_list,new ArrayList( )));
        return view;
    }

}
