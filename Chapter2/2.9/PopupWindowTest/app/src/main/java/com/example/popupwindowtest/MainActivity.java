package com.example.popupwindowtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View root = this.getLayoutInflater().inflate(R.layout.popup, null);
        final PopupWindow popup = new PopupWindow(root, 840, 1080);
        Button button = (Button) findViewById(R.id.bn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup.showAtLocation(findViewById(R.id.bn), Gravity.CENTER, 20, 20);
            }
        });
        root.findViewById(R.id.close).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup.dismiss();
            }
        });
    }
}
