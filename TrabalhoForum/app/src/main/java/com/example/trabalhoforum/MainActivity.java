package com.example.trabalhoforum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String name;
    EditText tName;
    Button tButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tName = findViewById(R.id.editTextTextPersonName);

        tButton = findViewById(R.id.button);
        tButton.setOnClickListener(view -> {
            name = tName.getText().toString();

            Intent intent = new Intent(this, SegundaActivity.class);
            intent.putExtra("name", name);
            startActivity(intent);
        });
    }
}