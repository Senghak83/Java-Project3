package com.sru.booksong.recyler_.sing_adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sru.booksong.R;

public class Singer_horder extends RecyclerView.ViewHolder {
    private ImageView singerImage;
    private TextView singerName;

    public Singer_horder(@NonNull View itemView) {
        super(itemView);

        singerImage = itemView.findViewById(R.id.sing_image_list);
        singerName = itemView.findViewById(R.id.sing_name_list);
    }

    public ImageView getSingerImage() {
        return singerImage;
    }

    public void setSingerImage(ImageView singerImage) {
        this.singerImage = singerImage;
    }

    public TextView getSingerName() {
        return singerName;
    }

    public void setSingerName(TextView singerName) {
        this.singerName = singerName;
    }
}
