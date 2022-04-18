package com.example.studentapp;

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

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DisplayActivity.class);

                Bundle bundle = new Bundle();
                bundle.putString("firstName", ((EditText) findViewById(R.id.firstName)).getText().toString());
                bundle.putString("middleName", ((EditText) findViewById(R.id.middleName)).getText().toString());
                bundle.putString("lastName", ((EditText) findViewById(R.id.lastName)).getText().toString());
                bundle.putString("dob", ((EditText) findViewById(R.id.dob)).getText().toString());
                bundle.putString("email", ((EditText) findViewById(R.id.email)).getText().toString());
                bundle.putString("address", ((EditText) findViewById(R.id.address)).getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}