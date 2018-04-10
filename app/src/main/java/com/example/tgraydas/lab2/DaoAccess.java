package com.example.tgraydas.lab2;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by tgraydas on 03-04-18.
 */
@Dao
public interface DaoAccess {
    @Insert
    void insertOneFormulario (Formulario_DB formulario_db);
    @Query ("select * from Formulario_DB")
    List<Formulario_DB> fetchAllFormularios();
    @Insert
    void InsertNewUser(User user);
}
