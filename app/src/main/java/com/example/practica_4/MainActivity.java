package com.example.practica_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.CountDownTimer;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    TextView txt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt4 = findViewById(R.id.txt4);

        new CountDownTimer(5000, 1000) { // 5000 milisegundos = 5 segundos

            public void onTick(long millisUntilFinished) {
                txt4.setText("Segundos: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
            }
        }.start();
    }

    @Override
    public void onClick(View v) {

    }
}