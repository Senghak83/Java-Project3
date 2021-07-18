package com.sru.booksong;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sru.booksong.main_book.Book_contant;

public class MainActivity extends AppCompatActivity {

    private ActionBar bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bar =getSupportActionBar();
        bar.setTitle("Main Story boad");
    }

    public void To_Book_contant(View view) {
        startActivity(new Intent(this, Book_contant.class));
    }
}
