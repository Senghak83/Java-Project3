package com.sru.booksong.DB_SONG;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;


import java.util.List;

@Dao
public interface SongDAO {
    @Query("Select * from tblSong")
    public List<tblSong> getAllSong();
    @Query("Delete from tblSong")
    public void deletAllSong();
    @Insert
    public void InsertAllSong(tblSong ... tblSongs);
    @Insert
    public void InsertAllSong(List<tblSong> ls);
    @Update
    public void updateSong(tblSong song);



}
