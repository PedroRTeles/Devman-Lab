package br.com.stampstudio.sqlitecrud.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "crud.db";
    private static final String TABLE = "user";
    private static final String ID = "_id";
    private static final String NAME = "name";
    private static final String ADDRESS = "address";
    private static final String AGE = "age";
    private static final String TELEPHONE = "telephone";
    private static final int VERSION = 1;

    public Database(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "CREATE TABLE " + TABLE + "("
                + ID + "integer primary key autoincrement,"
                + NAME + "text,"
                + ADDRESS + "text,"
                + AGE + "integer,"
                + TELEPHONE + "text"
                + ")";

        sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE);
        onCreate(sqLiteDatabase);
    }
}
