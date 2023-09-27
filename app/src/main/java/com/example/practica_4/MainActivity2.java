package com.example.practica_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{

    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/studio"));
        startActivity(i);


    }
}