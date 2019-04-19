package com.softdev.barcodescanner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ScanIntroActivity
        extends AppCompatActivity {
    private Button mBtnScan = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_intro);

        initView();
        setViewHandler();
    }

    private void initView() {
        mBtnScan = findViewById(R.id.button_scan);
    }

    private void setViewHandler() {
        mBtnScan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent k = new Intent(ScanIntroActivity.this, ScanActivity.class);
                    startActivity(k);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
