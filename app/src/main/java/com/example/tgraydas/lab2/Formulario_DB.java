package com.example.tgraydas.lab2;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by tgraydas on 03-04-18.
 */
@Entity
public class Formulario_DB {
    @NonNull
    @PrimaryKey
    public String Nombre;
    public String Fecha;
    public String Comentario;
    public String Categoria;
    public Formulario_DB (String Nombre, String Fecha, String Comentario, String Categoria) {
        this.Nombre = Nombre;
        this.Fecha = Fecha;
        this.Comentario = Comentario;
        this.Categoria = Categoria;
    }

}
