package com.example.eventqs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bn = (Button) findViewById(R.id.bn);
        bn.setOnClickListener(new MyClickListener());
    }
    class MyClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            EditText txt = (EditText) findViewById(R.id.txt);
            txt.setText("bn按钮被单击了！");
        }
    }
}
