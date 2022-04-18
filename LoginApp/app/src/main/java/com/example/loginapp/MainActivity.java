package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText emailText = findViewById(R.id.textEmail);
        EditText passwordText = findViewById(R.id.textPassword);

        Button loginBtn = findViewById(R.id.button);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoggedInActivity.class);
                intent.putExtra("message", "Login Successful!");
                startActivity(intent);
            }
        });
    }
}