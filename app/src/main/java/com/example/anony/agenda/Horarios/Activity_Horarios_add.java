package com.example.anony.agenda.Horarios;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.anony.agenda.R;

public class Activity_Horarios_add extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity__horarios_add);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

      //  EditText Et_ApelidoD;
      //  Et_ApelidoD =(EditText) findViewById(R.id.Et_ApelidoD);
        //

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "salvo com sucesso", Snackbar.LENGTH_LONG)
                       .setAction("Action", null).show();


              //  Button bt1 ;
               // bt1= (Button) findViewById(R.id.bt_botao1_1);

                //bt1.setText(Et_ApelidoD);

              //  Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
              //          .setAction("Action", null).show();
            }
        });
    }

}
