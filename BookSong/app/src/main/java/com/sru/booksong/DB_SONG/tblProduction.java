package com.sru.booksong.DB_SONG;

import android.content.Intent;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity


public class tblProduction {

    @PrimaryKey(autoGenerate = true)
    private int pid;
    @ColumnInfo(name = "Pname")
    private String Pname;
    @ColumnInfo(name = "url")
    private String url;
    @ColumnInfo(name = "desc")
    private String desc;

    public tblProduction(){}

    public tblProduction(String pname, String url, String desc) {
        Pname = pname;
        this.url = url;
        this.desc = desc;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String pname) {
        Pname = pname;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
