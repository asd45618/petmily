/*package com.example.petmliy;
    public String noticeNo; //공고번호
    public String kindCd;   // 품종
    public String sexCd;    //성별
    public String colorCd;  //색
    public String noticeSd; //공고시작일
    public String age;  //나이(연도)
    public String specialMark;  //특이사항
    public int weight; //몸무게*/

package com.example.petmliy;

        import android.content.Context;
        import android.database.sqlite.SQLiteDatabase;
        import android.database.sqlite.SQLiteOpenHelper;
        import android.database.Cursor;
        import android.text.NoCopySpan;


public class pet_attribute extends SQLiteOpenHelper {
    public pet_attribute(Context context) {super(context, "pet_attribute", null, 1);}

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE pet_attribute ( noticeNo VARCHAR(30), kindCd VARCHAR(15), sexCd VARCHAR(5), colorCd VARCHAR(30), noticeSd VARCHAR(20), age VARCHAR(10), specialMark VARCHAR(500), weight VARCHAR(10));");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        String sql = "DROP TABLE IF EXISTS pet_attribute";
        db.execSQL(sql);
        onCreate(db);
    }

}