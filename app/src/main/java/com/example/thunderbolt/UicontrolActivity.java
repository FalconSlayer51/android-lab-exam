package com.example.thunderbolt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.thunderbolt.databinding.ActivityMainBinding;

import org.w3c.dom.Text;

public class UicontrolActivity extends AppCompatActivity {
   // private ActivityMainBinding binding;

    EditText ed;
    TextView tx;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_uicontrol);
        btn = findViewById(R.id.button4);
        tx = findViewById(R.id.textView3);
        ed = findViewById(R.id.editTextTextPersonName4);
        btn.setLongClickable(true);
        btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(UicontrolActivity.this, "long pressed", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        btn.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b)
                    Toast.makeText(UicontrolActivity.this, "Focus Listener", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(UicontrolActivity.this, "no focus", Toast.LENGTH_SHORT).show();
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tx.setText(ed.getText().toString());
                btn.requestFocus();
            }
        });
    }
}