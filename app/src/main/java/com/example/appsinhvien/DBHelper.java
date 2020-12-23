package com.example.appsinhvien;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.strictmode.SqliteObjectLeakedViolation;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(@Nullable Context context) {
        super(context, "DBHelper", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE Sinhvien(" +
                "maso integer primary key, " +
                "ten text," +
                "diachi text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS Sinhvien");
        onCreate(sqLiteDatabase);
    }
    public int insertSinhvien(Sinhvien sv) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("maso", sv.getMaso());
        contentValues.put("ten", sv.getTen());
        contentValues.put("diachi", sv.getDiachi());
        int result = (int) db.insert("Sinhvien", null, contentValues);
        db.close();
        return result;
    }
}
