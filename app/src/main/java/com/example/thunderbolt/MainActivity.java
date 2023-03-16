package com.example.thunderbolt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn,btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         btn = findViewById(R.id.button);
         btn1 = findViewById(R.id.button1);
         btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                // Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_SHORT).show();
                 Intent i = new Intent(MainActivity.this,UicontrolActivity.class);
                 startActivity(i);
             }
         });

         btn1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent i = new Intent(MainActivity.this,DialingActivity.class);
                 startActivity(i);
             }
         });

    }
}
