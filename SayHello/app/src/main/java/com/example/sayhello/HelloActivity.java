package com.example.sayhello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        TextView textView = findViewById(R.id.textView);

        Intent intent = getIntent();

        String message = intent.getStringExtra("message");

        textView.setText(message);
    }
}