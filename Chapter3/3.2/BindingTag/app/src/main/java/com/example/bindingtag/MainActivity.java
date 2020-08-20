package com.example.bindingtag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickHandler(View source){
        EditText show = (EditText)findViewById(R.id.show);
        show.setText("bn按钮被单击了！");
    }
}
