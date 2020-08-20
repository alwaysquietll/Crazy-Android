package com.example.sendsms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText address;
    EditText content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        address = (EditText)findViewById(R.id.address);
        content = (EditText)findViewById(R.id.content);
        Button btn = (Button)findViewById(R.id.send);
        btn.setOnLongClickListener(new SendSmsListener(this, address, content));
    }
}
