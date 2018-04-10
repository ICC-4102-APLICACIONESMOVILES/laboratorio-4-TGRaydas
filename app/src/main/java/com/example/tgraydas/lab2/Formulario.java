package com.example.tgraydas.lab2;

import android.arch.persistence.room.Room;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Formulario.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Formulario#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Formulario extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View the_view = inflater.inflate(R.layout.fragment_blank, container, false);
        String DATABASE_NAME = "movies_db";
        final Database_PJ the_DB;
        the_DB = Room.databaseBuilder(getActivity().getApplicationContext(),
                Database_PJ.class, DATABASE_NAME).build();
        Button the_button = the_view.findViewById(R.id.save);
        the_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SaveForm(the_view, the_DB);
            }
        });
        return the_view;
    }
    public void SaveForm(View view, Database_PJ db){
        final Database_PJ the_db = db;
        final EditText name = view.findViewById(R.id.nombre);
        final EditText category = view.findViewById(R.id.category_T);
        final EditText date = view.findViewById(R.id.date_T);
        final EditText comment = view.findViewById(R.id.comentario);
        new Thread(new Runnable() {
            @Override
            public void run() {
            Formulario_DB formulario_db = new Formulario_DB(name.getText().toString(),
                    comment.getText().toString(),
                    date.getText().toString(),
                    category.getText().toString());
            the_db.daoAccess().insertOneFormulario(formulario_db);
            }

        }).start();
    }
}
