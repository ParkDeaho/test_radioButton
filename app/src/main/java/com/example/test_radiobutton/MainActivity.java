package com.example.test_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg;
    RadioButton rbMan, rbWoman;
    Button btnResult;
    String strResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = (RadioGroup) findViewById(R.id.radioGroup);
        rbMan = (RadioButton) findViewById(R.id.rbMan);
        rbWoman = (RadioButton) findViewById(R.id.rbWoman);
        btnResult = (Button) findViewById(R.id.btnResult);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbMan) {
                    Toast.makeText(MainActivity.this, "남자", Toast.LENGTH_SHORT).show();
                    strResult = rbMan.getText().toString();
                } else {
                    Toast.makeText(MainActivity.this, "여자", Toast.LENGTH_SHORT).show();
                    strResult = rbWoman.getText().toString();
                }
            }
        });

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (strResult != null) {
                    Toast.makeText(MainActivity.this, "결과는 " + strResult, Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}