/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONObject
 */
package com.onesignal;

import androidx.annotation.NonNull;
import com.onesignal.OneSignalApiResponseHandler;
import org.json.JSONObject;

public interface OneSignalAPIClient {
    public void get(String var1, OneSignalApiResponseHandler var2, @NonNull String var3);

    public void getSync(String var1, OneSignalApiResponseHandler var2, @NonNull String var3);

    public void post(String var1, JSONObject var2, OneSignalApiResponseHandler var3);

    public void postSync(String var1, JSONObject var2, OneSignalApiResponseHandler var3);

    public void put(String var1, JSONObject var2, OneSignalApiResponseHandler var3);

    public void putSync(String var1, JSONObject var2, OneSignalApiResponseHandler var3);
}

