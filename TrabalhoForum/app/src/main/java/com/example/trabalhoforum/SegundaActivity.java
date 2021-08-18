package com.example.trabalhoforum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    TextView tTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        tTextView = findViewById(R.id.textView);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");

        if ( name != null ) {
            tTextView.setText("Seja muito bem Vindo " + name);
        }
    }
}