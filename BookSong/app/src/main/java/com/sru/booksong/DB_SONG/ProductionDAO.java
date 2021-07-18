package com.sru.booksong.DB_SONG;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ProductionDAO {
    @Query("Select * from tblProduction")
    List<tblProduction> getAllProduction();
    @Insert
    public void insertProduction(tblProduction ... tblProductions);
    @Insert
    public void insertProduction(List<tblProduction> ls);
    @Insert
    public void insertProduction(tblProduction tblProductions);
    @Delete
    public void deletProduction(tblProduction tblpro);
    @Query("Delete from tblProduction")
    public void deletAllProduction();
    @Update
    public void updateProduct(tblProduction prod);

}
