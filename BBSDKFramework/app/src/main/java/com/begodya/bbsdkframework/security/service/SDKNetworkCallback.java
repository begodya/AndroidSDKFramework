package com.begodya.bbsdkframework.security.service;

import com.begodya.bbsdkframework.security.network.HttpResponse;

/**
 * Created by wangbei on 12/11/15.
 */
public interface SDKNetworkCallback {

    void onSuccess(HttpResponse response);

    void onFailure(HttpResponse response);
}
