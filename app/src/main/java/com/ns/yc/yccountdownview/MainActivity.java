package com.ns.yc.yccountdownview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.ns.yc.lib.CountDownView;
import com.ns.yc.lib.OnFinishListener;

public class MainActivity extends AppCompatActivity {

    private CountDownView cdvTime;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        initFindViewById();
        initCountDownView();
    }

    private void initFindViewById() {
        cdvTime = (CountDownView) findViewById(R.id.cdv_time);
        tv1 = findViewById(R.id.tv_1);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cdvTime.start();
            }
        });
    }

    private void initCountDownView() {
        cdvTime.setTime(5);
        cdvTime.setFinishListener(new OnFinishListener() {
            @Override
            public void finish() {
                Toast.makeText(MainActivity.this,"完成倒计时",Toast.LENGTH_SHORT).show();
            }
        });
        cdvTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cdvTime.stop();
            }
        });
    }


}
