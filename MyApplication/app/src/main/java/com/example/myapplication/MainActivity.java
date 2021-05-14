package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView helloText;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloText = (TextView) findViewById(R.id.hello); // hello id'sine sahip textView tipli ögenin ataması
        btn = (Button) findViewById(R.id.button);        // button id'sine sahip Button tipli ögenin ataması

        btn.setOnClickListener(new View.OnClickListener() { // Buton için dinleyici
            @Override
            public void onClick(View v) {                   // Tıklayınca
                helloText.setText("Starting...");
                helloText.setTextColor(Color.RED);
            }
        });
    }
}