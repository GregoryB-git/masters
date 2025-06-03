/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.onesignal.OneSignalRestClient
 *  com.onesignal.OneSignalRestClient$ResponseHandler
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalRestClient;
import org.json.JSONException;
import org.json.JSONObject;

class OSReceiveReceiptRepository {
    private static final String APP_ID = "app_id";
    private static final String DEVICE_TYPE = "device_type";
    private static final String PLAYER_ID = "player_id";

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void sendReceiveReceipt(@NonNull String string2, @NonNull String string3, @Nullable Integer n, @NonNull String string4, @NonNull OneSignalRestClient.ResponseHandler responseHandler) {
        try {
            JSONObject jSONObject = new JSONObject();
            string2 = jSONObject.put(APP_ID, (Object)string2).put(PLAYER_ID, (Object)string3);
            if (n != null) {
                string2.put(DEVICE_TYPE, (Object)n);
            }
            string3 = new StringBuilder();
            string3.append("notifications/");
            string3.append(string4);
            string3.append("/report_received");
            OneSignalRestClient.put((String)string3.toString(), (JSONObject)string2, (OneSignalRestClient.ResponseHandler)responseHandler);
            return;
        }
        catch (JSONException jSONException) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Generating direct receive receipt:JSON Failed.", jSONException);
        }
    }
}

