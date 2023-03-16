package com.example.thunderbolt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DialingActivity extends AppCompatActivity {
    Button b1,b2;
    EditText t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialing);
        b1 = findViewById(R.id.button6);
        b2 = findViewById(R.id.button7);

        t1 = findViewById(R.id.editTextTextPersonName2);
        t2 = findViewById(R.id.editTextPhone3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneNumber="+919100392853";
                String message = t1.getText().toString();

                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("smsto:"+phoneNumber));
                intent.putExtra("sms_body",message);

                startActivity(intent);
            }
        });
//First permission enable cheayli
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = "+919704624678";
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:"+number));

                startActivity(intent);
            }
        });
    }
}