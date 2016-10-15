package com.example.anony.agenda.Horarios;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.anony.agenda.R;

public class Activity_Horarios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horarios);


    }

// Primeira linha
    public void bt_L1_C1(View view) {
        Intent intent =new Intent(this, Activity_Horarios_add.class);
        startActivity(intent);
    }

    public void bt_L1_C2(View view) {
        Intent intent =new Intent(this, Activity_Horarios_add.class);
        startActivity(intent);
    }

    public void bt_L1_C3(View view) {
        Intent intent =new Intent(this, Activity_Horarios_add.class);
        startActivity(intent);
    }

    public void bt_L1_C4(View view) {
        Intent intent =new Intent(this, Activity_Horarios_add.class);
        startActivity(intent);
    }

    public void bt_L1_C5(View view) {
        Intent intent =new Intent(this, Activity_Horarios_add.class);
        startActivity(intent);
    }

    public void bt_L1_C6(View view) {
        Intent intent =new Intent(this, Activity_Horarios_add.class);
        startActivity(intent);
    }

    public void bt_L1_C7(View view) {
        Intent intent =new Intent(this, Activity_Horarios_add.class);
        startActivity(intent);
    }

// ------------------------------------
// segunda linha
public void bt_L2_C1(View view) {
}

    public void bt_L2_C2(View view) {
    }

    public void bt_L2_C3(View view) {
    }

    public void bt_L2_C4(View view) {
    }

    public void bt_L2_C5(View view) {
    }

    public void bt_L2_C6(View view) {
    }

    public void bt_L2_C7(View view) {
    }
// ------------------------------------
}// Fim da classe