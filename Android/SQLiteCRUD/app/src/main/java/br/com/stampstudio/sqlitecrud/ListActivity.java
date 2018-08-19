package br.com.stampstudio.sqlitecrud;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class ListActivity extends AppCompatActivity {
    private ListView lstUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        lstUsers = findViewById(R.id.lstUsers);

        DatabaseController dbController = new DatabaseController(getBaseContext());

        Cursor cursor = dbController.selectUsers();

        String fields[] = {"_id", "name"};
        int[] idViews = {R.id.txtId, R.id.txtName};

        SimpleCursorAdapter adapter = new SimpleCursorAdapter(getBaseContext(), R.layout.user_list, cursor, fields, idViews, 0);

        lstUsers.setAdapter(adapter);
    }
}
