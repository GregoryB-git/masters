/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  org.json.JSONObject
 */
package com.onesignal;

import androidx.annotation.NonNull;
import com.onesignal.OneSignalAPIClient;
import com.onesignal.OneSignalApiResponseHandler;
import com.onesignal.OneSignalRestClient;
import org.json.JSONObject;

class OneSignalRestClientWrapper
implements OneSignalAPIClient {
    @Override
    public void get(String string2, OneSignalApiResponseHandler oneSignalApiResponseHandler, @NonNull String string3) {
        OneSignalRestClient.get(string2, new OneSignalRestClient.ResponseHandler(this, oneSignalApiResponseHandler){
            public final OneSignalRestClientWrapper this$0;
            public final OneSignalApiResponseHandler val$responseHandler;
            {
                this.this$0 = oneSignalRestClientWrapper;
                this.val$responseHandler = oneSignalApiResponseHandler;
            }

            @Override
            public void onFailure(int n, String string2, Throwable throwable) {
                this.val$responseHandler.onFailure(n, string2, throwable);
            }

            @Override
            public void onSuccess(String string2) {
                this.val$responseHandler.onSuccess(string2);
            }
        }, string3);
    }

    @Override
    public void getSync(String string2, OneSignalApiResponseHandler oneSignalApiResponseHandler, @NonNull String string3) {
        OneSignalRestClient.getSync(string2, new OneSignalRestClient.ResponseHandler(this, oneSignalApiResponseHandler){
            public final OneSignalRestClientWrapper this$0;
            public final OneSignalApiResponseHandler val$responseHandler;
            {
                this.this$0 = oneSignalRestClientWrapper;
                this.val$responseHandler = oneSignalApiResponseHandler;
            }

            @Override
            public void onFailure(int n, String string2, Throwable throwable) {
                this.val$responseHandler.onFailure(n, string2, throwable);
            }

            @Override
            public void onSuccess(String string2) {
                this.val$responseHandler.onSuccess(string2);
            }
        }, string3);
    }

    @Override
    public void post(String string2, JSONObject jSONObject, OneSignalApiResponseHandler oneSignalApiResponseHandler) {
        OneSignalRestClient.post(string2, jSONObject, new OneSignalRestClient.ResponseHandler(this, oneSignalApiResponseHandler){
            public final OneSignalRestClientWrapper this$0;
            public final OneSignalApiResponseHandler val$responseHandler;
            {
                this.this$0 = oneSignalRestClientWrapper;
                this.val$responseHandler = oneSignalApiResponseHandler;
            }

            @Override
            public void onFailure(int n, String string2, Throwable throwable) {
                this.val$responseHandler.onFailure(n, string2, throwable);
            }

            @Override
            public void onSuccess(String string2) {
                this.val$responseHandler.onSuccess(string2);
            }
        });
    }

    @Override
    public void postSync(String string2, JSONObject jSONObject, OneSignalApiResponseHandler oneSignalApiResponseHandler) {
        OneSignalRestClient.postSync(string2, jSONObject, new OneSignalRestClient.ResponseHandler(this, oneSignalApiResponseHandler){
            public final OneSignalRestClientWrapper this$0;
            public final OneSignalApiResponseHandler val$responseHandler;
            {
                this.this$0 = oneSignalRestClientWrapper;
                this.val$responseHandler = oneSignalApiResponseHandler;
            }

            @Override
            public void onFailure(int n, String string2, Throwable throwable) {
                this.val$responseHandler.onFailure(n, string2, throwable);
            }

            @Override
            public void onSuccess(String string2) {
                this.val$responseHandler.onSuccess(string2);
            }
        });
    }

    @Override
    public void put(String string2, JSONObject jSONObject, OneSignalApiResponseHandler oneSignalApiResponseHandler) {
        OneSignalRestClient.put(string2, jSONObject, new OneSignalRestClient.ResponseHandler(this, oneSignalApiResponseHandler){
            public final OneSignalRestClientWrapper this$0;
            public final OneSignalApiResponseHandler val$responseHandler;
            {
                this.this$0 = oneSignalRestClientWrapper;
                this.val$responseHandler = oneSignalApiResponseHandler;
            }

            @Override
            public void onFailure(int n, String string2, Throwable throwable) {
                this.val$responseHandler.onFailure(n, string2, throwable);
            }

            @Override
            public void onSuccess(String string2) {
                this.val$responseHandler.onSuccess(string2);
            }
        });
    }

    @Override
    public void putSync(String string2, JSONObject jSONObject, OneSignalApiResponseHandler oneSignalApiResponseHandler) {
        OneSignalRestClient.putSync(string2, jSONObject, new OneSignalRestClient.ResponseHandler(this, oneSignalApiResponseHandler){
            public final OneSignalRestClientWrapper this$0;
            public final OneSignalApiResponseHandler val$responseHandler;
            {
                this.this$0 = oneSignalRestClientWrapper;
                this.val$responseHandler = oneSignalApiResponseHandler;
            }

            @Override
            public void onFailure(int n, String string2, Throwable throwable) {
                this.val$responseHandler.onFailure(n, string2, throwable);
            }

            @Override
            public void onSuccess(String string2) {
                this.val$responseHandler.onSuccess(string2);
            }
        });
    }
}

