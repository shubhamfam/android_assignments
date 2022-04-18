package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class LoggedInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_in);

        // retrieve message from intent
        Intent intent = getIntent();
        String message = intent.getStringExtra("message");

        //set message to textview
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
}