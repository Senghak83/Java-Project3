package com.sru.booksong.recyler_.song_apdater;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sru.booksong.R;

public class Song_horlder extends RecyclerView.ViewHolder {
    private ImageView songImage;
    private TextView songTitle;
    private TextView songDescr;
    private TextView songDownload;
    private TextView songRate;

    public Song_horlder(@NonNull View itemView) {
        super(itemView);
        //---- Reference object
        songImage = itemView.findViewById(R.id.song_image_list);
        songTitle = itemView.findViewById(R.id.song_title_list);
        songDescr = itemView.findViewById(R.id.song_desc_list);
        songDownload = itemView.findViewById(R.id.song_download_list);
        songRate = itemView.findViewById(R.id.song_rat_list);


    }

    public ImageView getSongImage() {
        return songImage;
    }

    public TextView getSongTitle() {
        return songTitle;
    }

    public TextView getSongDescr() {
        return songDescr;
    }

    public TextView getSongDownload() {
        return songDownload;
    }

    public TextView getSongRate() {
        return songRate;
    }
}
