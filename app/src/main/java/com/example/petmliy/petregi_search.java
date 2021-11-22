/*
    public String orgNm;    //보호소이름
    public String orgAddr;  //주소
    public String tel;  //전화번호
*/

package com.example.petmliy;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;
import android.text.NoCopySpan;


public class petregi_search extends SQLiteOpenHelper {
    public petregi_search(Context context) {super(context, "petregi_search", null, 1);}

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE petregi_search ( orgNm VARCHAR(30), orgAddr VARCHAR(50), tel VARCHAR(30));");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        String sql = "DROP TABLE IF EXISTS petregi_search";
        db.execSQL(sql);
        //DB에 저장


        onCreate(db);
    }

}
