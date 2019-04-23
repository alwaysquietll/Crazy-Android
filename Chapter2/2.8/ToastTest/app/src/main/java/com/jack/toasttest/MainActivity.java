package com.jack.toasttest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button simple = (Button) findViewById(R.id.simple);
        simple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this,
                        "简单的提示信息",
                        Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        Button button = (Button) findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = new Toast(MainActivity.this);
                toast.setGravity(Gravity.CENTER, 0, 0);
                ImageView image = new ImageView(MainActivity.this);
                image.setImageResource(R.drawable.tools);
                LinearLayout linearLayout = new LinearLayout(MainActivity.this);
                linearLayout.addView(image);
                TextView textView = new TextView(MainActivity.this);
                textView.setText("带图片的提示信息");
                textView.setTextSize(24);
                textView.setTextColor(Color.MAGENTA);
                linearLayout.addView(textView);
                toast.setView(linearLayout);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }
}
