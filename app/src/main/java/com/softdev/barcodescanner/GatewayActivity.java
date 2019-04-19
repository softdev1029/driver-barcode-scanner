package com.softdev.barcodescanner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class GatewayActivity
        extends AppCompatActivity {
    private Button mBtnAirport = null;
    private Button mBtnDeparture = null;
    private Button mBtnArrival = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gateway);

        initView();
        setViewHandler();
    }

    private void initView() {
        mBtnAirport = findViewById(R.id.button_airport);
        mBtnDeparture = findViewById(R.id.button_departure);
        mBtnArrival = findViewById(R.id.button_arrival);
    }

    private void setViewHandler() {
        mBtnAirport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent k = new Intent(GatewayActivity.this, ScanIntroActivity.class);
                    startActivity(k);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        this.mBtnDeparture.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent k = new Intent(GatewayActivity.this, ScanIntroActivity.class);
                    startActivity(k);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        this.mBtnArrival.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent k = new Intent(GatewayActivity.this, ScanIntroActivity.class);
                    startActivity(k);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
