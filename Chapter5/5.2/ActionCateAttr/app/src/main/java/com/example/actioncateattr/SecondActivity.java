package com.example.actioncateattr;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import java.util.Set;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        EditText show = (EditText)findViewById(R.id.show);
        String action = getIntent().getAction();
        show.setText("Action为：" + action);
        EditText cate = (EditText) findViewById(R.id.cate);
        Set<String> cates = getIntent().getCategories();
        cate.setText("Category属性为：" + cates);
    }
}
