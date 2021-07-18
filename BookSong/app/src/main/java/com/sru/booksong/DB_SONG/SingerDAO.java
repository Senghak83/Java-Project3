package com.sru.booksong.DB_SONG;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;


import java.util.List;

@Dao
public interface SingerDAO {
    @Query("Select * from tblSinger")
    public List<tblSinger> getAllSinger();
    @Query("Delete from tblSinger")
    public void deletAllSinger();
    @Insert
    public void intsertAllSinger(tblSinger ... tblSingers);
    @Insert
    public void intsertAllSinger(List<tblSinger> ls);
    @Update
    public void updateSinger(tblSinger sing);

}
