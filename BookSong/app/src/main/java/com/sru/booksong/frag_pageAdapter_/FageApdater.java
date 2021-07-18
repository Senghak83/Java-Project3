package com.sru.booksong.frag_pageAdapter_;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.sru.booksong.fragment_.fSing;
import com.sru.booksong.fragment_.fSong;
import com.sru.booksong.fragment_.fpro;

import java.util.ArrayList;

public class FageApdater extends FragmentPagerAdapter {

    private ArrayList<Fragment> ls;
    private String t[]={"Producion","Song","Singer"};
    public FageApdater(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        ls = new ArrayList<>();
        ls.add(new fpro());
        ls.add(new fSong());
        ls.add(new fSing());
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        return ls.isEmpty()? null : ls.get(position);
    }

    @Override
    public int getCount() {
        return ls.isEmpty()? 0 : ls.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return t[position];
    }
}
