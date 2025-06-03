/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.huawei.hms.push.RemoteMessage
 *  com.onesignal.PushRegistratorHMS
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.concurrent.atomic.AtomicBoolean
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.push.RemoteMessage;
import com.onesignal.NotificationPayloadProcessorHMS;
import com.onesignal.OneSignal;
import com.onesignal.PushRegistratorHMS;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class OneSignalHmsEventBridge {
    public static final String HMS_SENT_TIME_KEY = "hms.sent_time";
    public static final String HMS_TTL_KEY = "hms.ttl";
    private static final AtomicBoolean firstToken = new AtomicBoolean(true);

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void onMessageReceived(@NonNull Context context, @NonNull RemoteMessage object) {
        void var1_5;
        String string2 = object.getData();
        try {
            JSONObject jSONObject = new JSONObject(object.getData());
            int n = object.getTtl();
            if (n == 0) {
                jSONObject.put(HMS_TTL_KEY, 259200);
            } else {
                jSONObject.put(HMS_TTL_KEY, object.getTtl());
            }
            long l = object.getSentTime();
            if (l == 0L) {
                jSONObject.put(HMS_SENT_TIME_KEY, OneSignal.getTime().getCurrentTimeMillis());
            } else {
                jSONObject.put(HMS_SENT_TIME_KEY, object.getSentTime());
            }
            String string3 = jSONObject.toString();
        }
        catch (JSONException jSONException) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "OneSignalHmsEventBridge error when trying to create RemoteMessage data JSON");
            String string4 = string2;
        }
        NotificationPayloadProcessorHMS.processDataMessageReceived(context, (String)var1_5);
    }

    @Deprecated
    public static void onNewToken(@NonNull Context context, @NonNull String string2) {
        OneSignalHmsEventBridge.onNewToken(context, string2, null);
    }

    public static void onNewToken(@NonNull Context object, @NonNull String string2, @Nullable Bundle bundle) {
        if (firstToken.compareAndSet(true, false)) {
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.INFO;
            object = new StringBuilder();
            object.append("OneSignalHmsEventBridge onNewToken - HMS token: ");
            object.append(string2);
            object.append(" Bundle: ");
            object.append((Object)bundle);
            OneSignal.Log(lOG_LEVEL, object.toString());
            PushRegistratorHMS.fireCallback((String)string2);
        } else {
            object = OneSignal.LOG_LEVEL.INFO;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("OneSignalHmsEventBridge ignoring onNewToken - HMS token: ");
            stringBuilder.append(string2);
            stringBuilder.append(" Bundle: ");
            stringBuilder.append((Object)bundle);
            OneSignal.Log((OneSignal.LOG_LEVEL)((Object)object), stringBuilder.toString());
        }
    }
}

