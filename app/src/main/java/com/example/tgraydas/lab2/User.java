package com.example.tgraydas.lab2;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by tgraydas on 03-04-18.
 */
@Entity
public class User {
    @NonNull
    @PrimaryKey
    public String email;
    public String password;
    public User (String email, String password){
        this.email = email;
        this.password = password;
    }
}
