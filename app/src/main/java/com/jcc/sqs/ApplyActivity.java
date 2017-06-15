package com.jcc.sqs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

public class ApplyActivity extends AppCompatActivity {

    private TextView apply_back;
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        apply_back = (TextView) findViewById(R.id.apply_back);
        lv = (ListView) findViewById(R.id.lv);
    }
}
