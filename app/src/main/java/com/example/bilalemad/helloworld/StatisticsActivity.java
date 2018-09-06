package com.example.bilalemad.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StatisticsActivity extends AppCompatActivity {

    int adrenaline = 5;
    int masks = 7;
    TextView adrenalineValue;
    TextView maskValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);
        adrenalineValue = findViewById(R.id.adrenalineValue);
        maskValue = findViewById(R.id.maskValue);
        adrenalineValue.setText(Integer.toString(adrenaline));
        maskValue.setText(Integer.toString(masks));
    }
}
