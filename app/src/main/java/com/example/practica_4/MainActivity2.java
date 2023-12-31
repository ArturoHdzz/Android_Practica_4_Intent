package com.example.practica_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.ComponentName;


public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(this);

        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(this);

        btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(this);

        btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(this);

        btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(this);

        btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(this);

        btn7 = findViewById(R.id.btn7);
        btn7.setOnClickListener(this);

        btn8 = findViewById(R.id.btn8);
        btn8.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn1) {
            Intent i = new Intent(Intent.makeMainActivity(new ComponentName("com.facebook.katana", "com.facebook.katana.LoginActivity")));
            startActivity(i);
        }
        if (v.getId() == R.id.btn2) {
            Intent i = new Intent(Intent.makeMainActivity(new ComponentName("com.whatsapp", "com.whatsapp.Main")));
            startActivity(i);
        }
        if (v.getId() == R.id.btn3) {
            Intent i = new Intent(Intent.makeMainActivity(new ComponentName("com.google.android.youtube", "com.google.android.youtube.app.honeycomb.Shell$HomeActivity")));
            startActivity(i);
        }
        if (v.getId() == R.id.btn4) {
            Intent i = new Intent(Intent.makeMainActivity(new ComponentName("com.microsoft.office.word", "com.microsoft.office.apphost.LaunchActivity")));
            startActivity(i);
        }
        if (v.getId() == R.id.btn5) {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/studio"));
            startActivity(i);
        }
        if (v.getId() == R.id.btn6) {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 65.896, 75.865"));
            startActivity(i);
        }
        if (v.getId() == R.id.btn7) {
            Intent i = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            startActivity(i);
        }
        if (v.getId() == R.id.btn8) {
            Intent i = new Intent("android.media.action.IMAGE_CAPTURE");
            startActivity(i);
        }
    }
}