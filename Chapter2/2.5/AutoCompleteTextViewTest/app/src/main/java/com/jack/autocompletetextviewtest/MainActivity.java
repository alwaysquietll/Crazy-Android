package com.jack.autocompletetextviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView actv;
    MultiAutoCompleteTextView mauto;
    String[] books = new String[]{
            "疯狂Java讲义",
            "疯狂Ajax讲义",
            "疯狂XML讲义",
            "疯狂Workflow讲义"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> aa = new ArrayAdapter<>(this,android.R.layout.simple_dropdown_item_1line,books);
        actv = (AutoCompleteTextView) findViewById(R.id.auto);
        actv.setAdapter(aa);
        mauto = (MultiAutoCompleteTextView) findViewById(R.id.mauto);
        mauto.setAdapter(aa);
        mauto.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}
