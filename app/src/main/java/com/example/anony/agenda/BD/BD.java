package com.example.anony.agenda.BD;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.anony.agenda.Diciplinas.Disciplinas;

import java.util.ArrayList;
import java.util.List;

public class BD {
	private SQLiteDatabase bd;
	
	public BD(Context context){
		BDCore auxBd = new BDCore(context);
		bd = auxBd.getWritableDatabase();
	}




	public void Disc_insert(Disciplinas disciplina){
		ContentValues valores = new ContentValues();
		valores.put("Disc_nome", disciplina.getDisc_nome());
		valores.put("Disc_abrev", disciplina.getDisc_abreviacao());
		valores.put("Disc_prof", disciplina.getDisc_Prof());
		
		bd.insert("Disciplinas", null, valores);
	}
	
	
	public void Disc_update(Disciplinas disciplina){
		ContentValues valores = new ContentValues();
		valores.put("Disc_nome", disciplina.getDisc_nome());
		valores.put("Disc_abrev", disciplina.getDisc_abreviacao());
		valores.put("Disc_prof", disciplina.getDisc_Prof());

		bd.update("Disciplinas", valores, "_id = ?", new String[]{""+disciplina.getId()});
	}
	
	
	public void Disc_drop(Disciplinas disciplina){
		bd.delete("Diciplinas", "_id = "+ disciplina.getId(), null);
	}
	
	
	public List<Disciplinas> Disc_buscar(){
		List<Disciplinas> list = new ArrayList<Disciplinas>();
		String[] colunas = new String[]{"_id", "Disc_nome", "Disc_abrev"};
		
		Cursor cursor = bd.query("Diciplinas", colunas, null, null, null, null, "Disc_nome ASC");
		
		if(cursor.getCount() > 0){
			cursor.moveToFirst();
			
			do{
				
				Disciplinas N_D = new Disciplinas();
				N_D.setId(cursor.getLong(0));
				N_D.setDisc_nome(cursor.getString(1));
				N_D.setDisc_abreviacao(cursor.getString(2));
				list.add(N_D);
				
			}while(cursor.moveToNext());
		}
		
		return(list);
	}



}
