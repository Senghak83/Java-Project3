package com.sru.booksong.main_book;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.sru.booksong.BasActi;
import com.sru.booksong.R;
import com.sru.booksong.frag_pageAdapter_.FageApdater;

public class Book_contant extends BasActi {

    private ViewPager vpg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_contant);

        vpg = findViewById(R.id.PVG);
        vpg.setAdapter(new FageApdater(getSupportFragmentManager(),1));

    }
}
