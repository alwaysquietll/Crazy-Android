package com.example.activitymenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        SubMenu prog = menu.addSubMenu("启动程序");
        prog.setHeaderIcon(R.drawable.tools);
        prog.setHeaderTitle("选择您要启动的程序");
        MenuItem item = prog.add("查看Swift");
        item.setIntent(new Intent(this , OtherActivity.class));
        return super.onCreateOptionsMenu(menu);
    }
}
