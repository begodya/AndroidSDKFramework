package com.begodya.bbsdkdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
//                Intent intent = new Intent(this, PierBaseActivity.class);
//                startActivity(intent);

//                BBSDKFramework.startPierPayAction(this);
                break;
            }
        }
    }
}
