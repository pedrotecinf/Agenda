package com.example.anony.agenda.BD;

/**
 * Created by anony on 10/10/16.
 */
public class ScriptSQL_Tabelas {

    public static String getCreateDiciplinas(){

        StringBuilder sql = new StringBuilder();
        sql.append(" CREATE TABLE IF NOT EXISTS `Disciplinas` ( ");
        sql.append(" `_id` INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, ");
        sql.append(" `Disc_nome` TEXT NOT NULL, ");
        sql.append(" `Disc_abrev` TEXT NOT NULL, ");
        sql.append(" `Disc_prof` INTEGER ");
        sql.append(" `Disc_cargaH` INTEGER ");
        sql.append(" ); ");


    return sql.toString();
    }

}
