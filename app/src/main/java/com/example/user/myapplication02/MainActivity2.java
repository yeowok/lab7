package com.example.user.myapplication02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {
    protected EditText tall;
    protected EditText weight;
    protected RadioButton boy;
    protected RadioButton girl;
    protected RadioGroup radioGroup;
    protected Button button;
    protected TextView standardWeight;
    protected TextView bodyfat;

    int gender = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tall=(EditText) findViewById(R.id.editText2);
        weight=(EditText) findViewById(R.id.editText);
        boy=(RadioButton) findViewById(R.id.radioButton);
        girl=(RadioButton) findViewById(R.id.radioButton2);
        radioGroup=(RadioGroup) findViewById(R.id.radioGroup);
        button=(Button) findViewById(R.id.button2);
        standardWeight=(TextView) findViewById(R.id.textView8);
        bodyfat=(TextView) findViewById(R.id.textView12);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (radioGroup.getCheckedRadioButtonId()){
                    case R.id.boy:
                        gender=1;
                        break;

                }

            }
        });
    }
}
