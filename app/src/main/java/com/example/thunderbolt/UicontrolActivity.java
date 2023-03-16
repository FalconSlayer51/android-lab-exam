package com.example.thunderbolt;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.thunderbolt.databinding.ActivityMainBinding;

import org.w3c.dom.Text;

public class UicontrolActivity extends AppCompatActivity {
   // private ActivityMainBinding binding;

    EditText ed;
    TextView tx;
    Button btn;
    ToggleButton tgb;
    ImageButton imgbtn;
    CheckBox chk;
    RadioButton rb;
    RadioGroup radioGroup;
    Spinner spinner;
    DatePicker dt;

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_uicontrol);
        String[] options = {"idli","vada","sambar"};
        btn = findViewById(R.id.button4);
        tx = findViewById(R.id.textView3);
        tgb = findViewById(R.id.toggleButton);
        ed = findViewById(R.id.editTextTextPersonName4);
        imgbtn = findViewById(R.id.imageButton);
        chk = findViewById(R.id.checkBox);
        radioGroup = findViewById(R.id.my_radiogroup);
        spinner = findViewById(R.id.spinner);
        dt= findViewById(R.id.datePicker);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,options);

        spinner.setAdapter(adapter);

        dt.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
                Toast.makeText(UicontrolActivity.this,Integer.toString(i)+"-"+Integer.toString(i1+1)+"-"+Integer.toString(i2), Toast.LENGTH_SHORT).show();
            }
        });
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedOption =(String) adapterView.getItemAtPosition(i);
                Toast.makeText(UicontrolActivity.this, selectedOption, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.radioButton2:
                        Toast.makeText(UicontrolActivity.this, "1st radio button clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton3:
                        Toast.makeText(UicontrolActivity.this, "2nd radio button clicked", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });

        chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                    Toast.makeText(UicontrolActivity.this, "check box checked", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(UicontrolActivity.this, "check box unchecked", Toast.LENGTH_SHORT).show();
            }
        });
        btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(UicontrolActivity.this, "long pressed", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(UicontrolActivity.this, "image button pressed", Toast.LENGTH_SHORT).show();
            }
        });
        tgb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tgb.isChecked()){
                    Toast.makeText(UicontrolActivity.this, "checked", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(UicontrolActivity.this, "un checked", Toast.LENGTH_SHORT).show();
                }
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