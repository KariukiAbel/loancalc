package com.nabesh.loancalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView tv,tv2,tv3;
    EditText ed,ed2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        tv = findViewById(R.id.textView);
        tv2 = findViewById(R.id.textView2);
        tv3 = findViewById(R.id.textView3);
        ed = findViewById(R.id.editText);
        ed2 = findViewById(R.id.editText2);
    }

    public void reveal(View view) {
        double basic = Double.parseDouble(ed.getText().toString());
        double net = Double.parseDouble(ed2.getText().toString());
        double basic_over_three = basic / 3;
        double net_minus_basic_division = net -basic_over_three;
        tv3.setText(String.valueOf(net_minus_basic_division));

    }
}
