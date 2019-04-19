package com.softdev.barcodescanner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ScanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        initView();
        setViewHandler();
    }

    private void initView() {
    }

    private void setViewHandler() {
    }

    @Override
    public void onBackPressed() {
    }
}
