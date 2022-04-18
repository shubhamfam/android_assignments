package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        TextView name = findViewById(R.id.nameView);
        TextView dob = findViewById(R.id.dobView);
        TextView email = findViewById(R.id.emailView);
        TextView address = findViewById(R.id.addressView);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        String n = bundle.getString("firstName") + " " +
                bundle.getString("middleName") + " " +
                bundle.getString("lastName");
        name.setText(n);
        dob.setText(bundle.getString("dob").toString());
        email.setText(bundle.getString("email").toString());
        address.setText(bundle.getString("address").toString());

    }
}