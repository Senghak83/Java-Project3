package com.sru.booksong.DB_SONG;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {tblProduction.class,tblSong.class,tblSinger.class},version = 1,exportSchema = true)
public abstract class DB extends RoomDatabase {

    private static  DB db_instant;
    // Singoton
    public static DB getInstance(Context con){
        if(db_instant== null){
            db_instant = Room.databaseBuilder(con,DB.class,"BookSong")
                    .fallbackToDestructiveMigration().build();
        }
        return db_instant;
    }// end Singleton

    //---  Reference DAO object use when Create DB

    public abstract SingerDAO getSinger();
    public abstract ProductionDAO getProduction();
    public abstract SongDAO getSong();




}
