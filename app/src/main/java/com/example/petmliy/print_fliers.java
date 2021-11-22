/*
    public String pet_name; //이름
    public String pet_date; //날짜
    public String pet_place;    //장소
    public String pet_special;  //상세설명
    public String phone_number; //전화번호
*/

package com.example.petmliy;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class print_fliers extends SQLiteOpenHelper {
    public print_fliers(Context context) {super(context, "print_fliers", null, 1);}

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE print_fliers ( pet_name VARCHAR(10), pet_date VARCHAR(20), pet_place VARCHAR(30), pet_special VARCHAR(150), phone_number VARCHAR(20));");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        String sql = "DROP TABLE IF EXISTS print_fliers";
        db.execSQL(sql);
        onCreate(db);
    }


}
