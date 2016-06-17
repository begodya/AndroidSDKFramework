package com.begodya.bbsdkdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.begodya.bbsdkframework.BBSDKFramework;

public class BBSDKDemoActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbsdkdemo);

        Button startButton = (Button)findViewById(R.id.start_button);
        startButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.start_button: {
//                Intent intent = new Intent(this, SDKH5Activity.class);
//                startActivity(intent);

                BBSDKFramework.startBBSDKAction(this);
                break;
            }
        }
    }
}
