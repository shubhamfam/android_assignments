package com.example.sayhello;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(v -> {

            String message = "Hello";

            Intent intent = new Intent(getApplicationContext(), HelloActivity.class);

            intent.putExtra("message", message);
            startActivity(intent);

        });
    }
}