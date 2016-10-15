package com.example.anony.agenda.Diciplinas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.anony.agenda.BD.BD;
import com.example.anony.agenda.R;

import java.util.ArrayList;
import java.util.List;


// public class MainActivity_Disciplinas extends AppCompatActivity {
public class MainActivity_Disciplinas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main_activity__disciplinas);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        BD bd = new BD(this);
        List<DisciplinaAdapter> list = new ArrayList<DisciplinaAdapter>();
        ListView lv =(ListView) findViewById(R.id.Lv);
        lv.setAdapter();
        lv.setAdapter((ListAdapter) list);



       /* BD bd = new BD(this);
        List<Disciplinas> list = new ArrayList<Disciplinas>();
        setListAdapter(new DisciplinaAdapter(this, list));
        */


       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */
    }

public void Tela_adicionar_disciplina(View v){
    Intent intent = new Intent(this, Activity_Disciplias_add.class);
    startActivity(intent);
}



}
