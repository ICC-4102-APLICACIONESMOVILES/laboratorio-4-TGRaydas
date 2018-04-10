package com.example.tgraydas.lab2; /**
 * Created by tgraydas on 03-04-18.
 */

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database (entities = {Formulario_DB.class, User.class}, version = 1, exportSchema = false)
    public abstract class Database_PJ extends RoomDatabase {
    public abstract DaoAccess daoAccess();
}
