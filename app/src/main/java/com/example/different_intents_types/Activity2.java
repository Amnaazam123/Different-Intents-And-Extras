package com.example.different_intents_types;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        txt=findViewById(R.id.txt);
        Intent intent = getIntent();
        txt.setText(intent.getStringExtra("SS"));

    }
}