package br.com.stampstudio.sqlitecrud;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.com.stampstudio.sqlitecrud.model.User;

public class CreateActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText edtName;
    private EditText edtAddress;
    private EditText edtAge;
    private EditText edtPhone;
    private Button btnCreate;
    private Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        edtName = findViewById(R.id.edtName);
        edtAddress = findViewById(R.id.edtAddress);
        edtAge = findViewById(R.id.edtAge);
        edtPhone = findViewById(R.id.edtPhone);
        btnCreate = findViewById(R.id.btnCreate);
        btnCancel = findViewById(R.id.btnCancel);

        btnCreate.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == btnCreate) {
            User user = new User();

            user.setName(edtName.getText().toString());
            user.setAddress(edtAddress.getText().toString());
            user.setAge(Integer.parseInt(edtAge.getText().toString()));
            user.setTelephone(edtPhone.getText().toString());


        } else if(view == btnCancel) {
            finish();
        }
    }
}
