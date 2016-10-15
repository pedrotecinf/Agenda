package com.example.anony.agenda.Diciplinas;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import com.example.anony.agenda.BD.BD;
import com.example.anony.agenda.R;

public class Activity_Disciplias_add extends AppCompatActivity {
    private Disciplinas disciplinas = new Disciplinas();
    private EditText Et_Disc_nome;
    private EditText Et_Disc_abre;
    private EditText Et_Disc_prof;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity__disciplias_add);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // setando  as variaveis os valores recebidos nos campos do xml
        Et_Disc_nome = (EditText) findViewById(R.id.Et_Disc_nome);
        Et_Disc_abre = (EditText) findViewById(R.id.Et_Disc_abrev);
        Et_Disc_prof = (EditText) findViewById(R.id.Et_Disc_prof);

        Intent intent = getIntent();
        if (intent != null) {
            Bundle bundle = intent.getExtras();
            if (bundle != null) {
                disciplinas.setId(bundle.getLong("id"));
                disciplinas.setDisc_nome(bundle.getString("Disc_nome"));

            }
        }


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

    public void add_Disciplina(View v){
        disciplinas.setDisc_nome(Et_Disc_nome.getText().toString());
        disciplinas.setDisc_abreviacao(Et_Disc_abre.getText().toString());
        disciplinas.setDisc_Prof(Et_Disc_prof.getText().toString());

                BD bd = new BD(this);
                bd.Disc_insert(disciplinas);


        Snackbar.make(v, "Disciplina cadastrada com Sucesso !", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
        // verificar se finalizo ou nao a activity
        finish();
    }

}
