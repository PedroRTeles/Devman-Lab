package br.com.stampstudio.sqlitecrud;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnCreate;
    private Button btnUpdate;
    private Button btnDelete;
    private Button btnList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCreate = findViewById(R.id.btnCreate);
        btnUpdate = findViewById(R.id.btnUpdate);
        btnDelete = findViewById(R.id.btnDelete);
        btnList = findViewById(R.id.btnList);

        btnCreate.setOnClickListener(this);
        btnUpdate.setOnClickListener(this);
        btnDelete.setOnClickListener(this);
        btnList.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;

        if(view == btnCreate) {
            intent = new Intent(MainActivity.this, CreateActivity.class);
        }

        if(intent != null) {
            startActivity(intent);
        }
    }
}
