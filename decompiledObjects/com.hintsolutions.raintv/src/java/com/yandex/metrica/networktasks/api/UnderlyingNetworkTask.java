/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  javax.net.ssl.SSLSocketFactory
 */
package com.yandex.metrica.networktasks.api;

import com.yandex.metrica.networktasks.api.FullUrlFormer;
import com.yandex.metrica.networktasks.api.RequestDataHolder;
import com.yandex.metrica.networktasks.api.ResponseDataHolder;
import com.yandex.metrica.networktasks.api.RetryPolicyConfig;
import javax.net.ssl.SSLSocketFactory;

public interface UnderlyingNetworkTask {
    public String description();

    public FullUrlFormer getFullUrlFormer();

    public RequestDataHolder getRequestDataHolder();

    public ResponseDataHolder getResponseDataHolder();

    public RetryPolicyConfig getRetryPolicyConfig();

    public SSLSocketFactory getSslSocketFactory();

    public boolean onCreateTask();

    public void onPerformRequest();

    public void onPostRequestComplete(boolean var1);

    public boolean onRequestComplete();

    public void onRequestError(Throwable var1);

    public void onShouldNotExecute();

    public void onSuccessfulTaskFinished();

    public void onTaskAdded();

    public void onTaskFinished();

    public void onTaskRemoved();

    public void onUnsuccessfulTaskFinished();
}

