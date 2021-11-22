/*
    public String noticeNo; //공고번호
    public String careNm; //보호소이름
    public String careAddr; //주소
    public String officetel;    //전화번호
    public String processState; //보호상태
*/

package com.example.petmliy;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;
import android.text.NoCopySpan;


public class pet_search extends SQLiteOpenHelper {
    public pet_search(Context context) {super(context, "pet_search", null, 1);}

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE pet_search ( noticeNo VARCHAR(30), careNm VARCHAR(50), careAddr VARCHAR(100), officetel VARCHAR(30), processState VARCHAR(10));");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        String sql = "DROP TABLE IF EXISTS pet_search";
        db.execSQL(sql);
        onCreate(db);
    }

}