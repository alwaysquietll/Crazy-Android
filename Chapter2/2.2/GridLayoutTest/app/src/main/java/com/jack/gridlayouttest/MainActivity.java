package com.jack.gridlayouttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {

    GridLayout gridLayout;
    String[] chars = new String[]{
            "7","8","9","%","4","5","6","*","1","2","3","-",".","0","=","+"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridLayout = (GridLayout) findViewById(R.id.root);
        for (int i = 0;i < chars.length;i++){
            Button btn = new Button(this);
            btn.setText(chars[i]);
            btn.setTextSize(40);
            btn.setPadding(5,35,5,35);
            GridLayout.Spec rowSpec = GridLayout.spec(i / 4 + 2);
            GridLayout.Spec columnSpec = GridLayout.spec(i % 4);
            GridLayout.LayoutParams params = new GridLayout.LayoutParams(
                    rowSpec , columnSpec
            );
            params.setGravity(Gravity.FILL);
            gridLayout.addView(btn,params);
        }
    }
}
