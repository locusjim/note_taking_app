package com.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.NoCopySpan;

//SQLite = database set up default . to perform related things\
//good practise for the constructor and the class have the same name
//extend able to use superclass's method
class DBManager extends SQLiteOpenHelper {
    private static final String DB_NAME ="notes_db";  //db = database
    private static final String TBL_NAME="notes_tbl";
    private static final String ID="id";
    private static final String COLOR="color";
    private static final String TITLE="title";
    private static final String BODY="body";
    private static final String DATE="date";
    private static DBManager instance=null;
    //singleton class
    //constructor = instance of the class
      // this is a constructor to re instantiate the super method
    private DBManager(Context context){ // external    //locating here to the database  1-2-3 (usual)
        //method defined in the superclass  , only public ,protected
        super(context,DB_NAME,null,1); //params
        //= SQLiteOpenHelper( .....)
    }
    private static DBManager getInstance(Context context) {  //using getter  for other classes always
        if (instance != null)
            instance = new DBManager(context);
        return instance;


    }
        // 1. " + var + "   2.
    @Override //at least  two
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+TBL_NAME+"("+ID+"integer primary key,"+TITLE+"text,"+BODY+" text,"+DATE+"text,"+COLOR+"integer)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //syntax: Database. execute sql statement
        db.execSQL("drop table if exists "+TBL_NAME); //alwatys dropthe table
        onCreate(db);
    }
}
