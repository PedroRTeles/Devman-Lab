package br.com.stampstudio.sqlitecrud;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

import br.com.stampstudio.sqlitecrud.model.Database;
import br.com.stampstudio.sqlitecrud.model.User;

public class DatabaseController {
    private SQLiteDatabase sqLiteDatabase;
    private Database database;

    public DatabaseController(Context context) {
        database = new Database(context);
    }

    public boolean insertUser(User user) {
        ContentValues values;
        long result;

        sqLiteDatabase = database.getWritableDatabase();

        values = new ContentValues();

        values.put("name", user.getName());
        values.put("address", user.getAddress());
        values.put("age", user.getAge());
        values.put("telephone", user.getTelephone());

        result = sqLiteDatabase.insert("user", null, values);

        return result != -1;

    }

    public Cursor selectUsers() {
        Cursor cursor;

        String[] fields = {"_id", "name"};

        sqLiteDatabase = database.getReadableDatabase();

        cursor = sqLiteDatabase.query("user", fields, null, null, null, null, null);

        if(cursor != null) {
            return cursor;
        }

        database.close();

        return null;
    }
}
