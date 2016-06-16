package com.begodya.bbsdkframework;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.begodya.bbsdkframework.widget.SDKH5Activity;

/**
 * Created by wangbei on 6/16/16.
 */
public class BBSDKFramework {
    public  final static String PAY_KEY = "com.begodya.bbsdkframework";

    public static void startBBSDKAction(Context context, String url) {
        Intent intent = new Intent(context, SDKH5Activity.class);
        Bundle bundle = new Bundle();
        bundle.putString("url", url);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    public static void startBBSDKAction(Context context) {
        Intent intent = new Intent(context, BBBaseActivity.class);
        context.startActivity(intent);
    }
}
