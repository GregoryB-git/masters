/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  java.lang.Long
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 */
package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1eSDK;

public class SingleInstallBroadcastReceiver
extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String string2;
        if (intent == null) {
            return;
        }
        try {
            string2 = intent.getStringExtra("referrer");
        }
        catch (Throwable throwable) {
            AFLogger.afErrorLog("error in BroadcastReceiver ", throwable);
            string2 = null;
        }
        if (string2 != null && AFa1eSDK.valueOf(context).getString("referrer", null) != null) {
            AFa1eSDK.valueOf().AFInAppEventType(context, string2);
            return;
        }
        string2 = AppsFlyerProperties.getInstance().getString("referrer_timestamp");
        long l8 = System.currentTimeMillis();
        if (string2 != null && l8 - Long.parseLong((String)string2) < 2000L) {
            return;
        }
        AFLogger.afInfoLog("SingleInstallBroadcastReceiver called");
        AFa1eSDK.valueOf().AFInAppEventType(context, intent);
        AppsFlyerProperties.getInstance().set("referrer_timestamp", String.valueOf((long)System.currentTimeMillis()));
    }
}

