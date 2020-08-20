package com.example.activitylistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText show;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show = (EditText) findViewById(R.id.show);
        btn = (Button) findViewById(R.id.bn);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        show.setText("btn按钮被单击了！");
    }
}
