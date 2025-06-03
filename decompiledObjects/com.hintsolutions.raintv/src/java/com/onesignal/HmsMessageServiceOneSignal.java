/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  com.huawei.hms.push.HmsMessageService
 *  com.huawei.hms.push.RemoteMessage
 *  com.onesignal.OneSignalHmsEventBridge
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.onesignal;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.push.HmsMessageService;
import com.huawei.hms.push.RemoteMessage;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalHmsEventBridge;

public class HmsMessageServiceOneSignal
extends HmsMessageService {
    public void onMessageReceived(RemoteMessage remoteMessage) {
        OneSignalHmsEventBridge.onMessageReceived((Context)this, (RemoteMessage)remoteMessage);
    }

    @Deprecated
    public void onNewToken(String string2) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HmsMessageServiceOneSignal onNewToken refresh token:");
        stringBuilder.append(string2);
        OneSignal.onesignalLog(lOG_LEVEL, stringBuilder.toString());
        OneSignalHmsEventBridge.onNewToken((Context)this, (String)string2);
    }

    public void onNewToken(String string2, Bundle bundle) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HmsMessageServiceOneSignal onNewToken refresh token:");
        stringBuilder.append(string2);
        OneSignal.onesignalLog(lOG_LEVEL, stringBuilder.toString());
        OneSignalHmsEventBridge.onNewToken((Context)this, (String)string2, (Bundle)bundle);
    }
}

