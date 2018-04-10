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
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Resumen.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Resumen#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Resumen extends Fragment {


    public Resumen() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View the_view = inflater.inflate(R.layout.fragment_resumen, container, false);
        String DATABASE_NAME = "movies_db";
        final Database_PJ the_DB;
        the_DB = Room.databaseBuilder(getActivity().getApplicationContext(),
                Database_PJ.class, DATABASE_NAME).build();
        //GetDataForm(the_DB);
        return the_view;
    }
    public void GetDataForm(Database_PJ db){
        final Database_PJ the_db = db;
        new Thread(new Runnable() {
            @Override
            public void run() {
                TextView textView = getView().findViewById(R.id.textView2);
                List<Formulario_DB> elements = new ArrayList<Formulario_DB>();
                elements = the_db.daoAccess().fetchAllFormularios();
                textView.setText(elements.size());
            }

        }).start();
    }


}
