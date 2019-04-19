package com.softdev.barcodescanner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DriverActivity
        extends AppCompatActivity {
    private Button mBtnDriver = null;
    private Button mBtnDelivery = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver);

        initView();
        setViewHandler();
    }

    private void initView() {
        mBtnDriver = findViewById(R.id.button_driver);
        mBtnDelivery = findViewById(R.id.button_delivery);
    }

    private void setViewHandler() {
        this.mBtnDriver.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent k = new Intent(DriverActivity.this, ScanActivity.class);
                    startActivity(k);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        this.mBtnDelivery.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent k = new Intent(DriverActivity.this, DeliveryActivity.class);
                    startActivity(k);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
