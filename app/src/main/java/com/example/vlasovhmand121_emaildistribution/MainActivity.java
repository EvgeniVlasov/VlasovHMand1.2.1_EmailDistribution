package com.example.vlasovhmand121_emaildistribution;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void clickButtonOK(View view) {
        EditText editName = findViewById(R.id.editName);
        EditText editMail = findViewById(R.id.editMail);
        String name = editName.getText().toString();
        String mail = editMail.getText().toString();
        TextView txtComplite = findViewById(R.id.txtComplite);
        txtComplite.setText(null);
        if (name.isEmpty() || mail.isEmpty()) {
            return;
        }
        txtComplite.setText(String.format(getString(R.string.txtresult), name, mail));

    }

    public void clickButtonClear(View view) {
        EditText editName = findViewById(R.id.editName);
        EditText editMail = findViewById(R.id.editMail);
        TextView txtComplite = findViewById(R.id.txtComplite);
        editName.setText(null);
        editMail.setText(null);
        txtComplite.setText(null);
    }

}

