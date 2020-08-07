package com.example.vlasovhmand121_emaildistribution;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editName;
    EditText editMail;
    TextView txtComplite;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editName = findViewById(R.id.editName);
        editMail = findViewById(R.id.editMail);
        txtComplite = findViewById(R.id.txtComplite);


    }

    public void clickButtonOK(View view) {
        String name = editName.getText().toString();
        String mail = editMail.getText().toString();
        txtComplite.setText("");
        if (name.isEmpty() || mail.isEmpty()) {
            return;
        }
        txtComplite.setText(String.format(getString(R.string.txtresult), name, mail));
    }

    public void clickButtonClear(View view) {
        editName.setText("");
        editMail.setText("");
        txtComplite.setText("");
    }

}

