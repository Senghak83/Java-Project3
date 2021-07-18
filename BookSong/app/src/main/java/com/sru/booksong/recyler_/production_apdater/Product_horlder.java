package com.sru.booksong.recyler_.production_apdater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sru.booksong.R;

public class Product_horlder extends RecyclerView.ViewHolder {

      private ImageView image;
      private TextView title;
      private TextView desc;

    public Product_horlder(@NonNull View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.product_image);
        title = itemView.findViewById(R.id.product_title);
        desc = itemView.findViewById(R.id.product_descr);
    }

    //----- set get method

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }

    public TextView getTitle() {
        return title;
    }

    public void setTitle(TextView title) {
        this.title = title;
    }

    public TextView getDesc() {
        return desc;
    }

    public void setDesc(TextView desc) {
        this.desc = desc;
    }
}
