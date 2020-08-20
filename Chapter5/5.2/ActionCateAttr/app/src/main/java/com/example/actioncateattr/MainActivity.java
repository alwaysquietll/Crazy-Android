package com.example.actioncateattr;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // 定义一个Action常量
    final static String CRAZYIT_ACTION =
            "com.example.intent.action.CRAZYIT_ACTION";
    // 定义一个Category常量
    final static String CRAZYIT_CATEGORY =
            "com.example.intent.category.CRAZYIT_CATEGORY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(MainActivity.CRAZYIT_ACTION);
                intent.addCategory(MainActivity.CRAZYIT_CATEGORY);
                startActivity(intent);
            }
        });
    }
}
