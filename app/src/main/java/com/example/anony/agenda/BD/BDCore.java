package com.example.anony.agenda.BD;

/**
 * Created by anony on 10/10/16.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BDCore extends SQLiteOpenHelper {
    private static  final String BD_NAME="AGENDA";
    private static  final int BD_VESAO= 1 ;


    public BDCore(Context context) {
        super(context, BD_NAME, null, BD_VESAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ScriptSQL_Tabelas.getCreateDiciplinas());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
