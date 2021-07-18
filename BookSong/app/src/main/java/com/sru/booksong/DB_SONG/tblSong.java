package com.sru.booksong.DB_SONG;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class tblSong {
    @PrimaryKey(autoGenerate = true)
    private int songid;
    @ColumnInfo(name = "songDescription")
    private String songDescription;
    @ColumnInfo(name = "rate")
    private int rate;
    @ColumnInfo(name = "url")
    private String url;

    public tblSong(String songDescription, int rate, String url) {
        this.songDescription = songDescription;
        this.rate = rate;
        this.url = url;
    }

    public int getSongid() {
        return songid;
    }

    public void setSongid(int songid) {
        this.songid = songid;
    }

    public String getSongDescription() {
        return songDescription;
    }

    public void setSongDescription(String songDescription) {
        this.songDescription = songDescription;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
