// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer;

import com.appsflyer.internal.AFa1eSDK;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class SingleInstallBroadcastReceiver extends BroadcastReceiver
{
    public void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        String s = null;
        try {
            intent.getStringExtra("referrer");
        }
        finally {
            final Throwable t;
            AFLogger.afErrorLog("error in BroadcastReceiver ", t);
            s = null;
        }
        if (s != null && AFa1eSDK.valueOf(context).getString("referrer", (String)null) != null) {
            AFa1eSDK.valueOf().AFInAppEventType(context, s);
            return;
        }
        final String string = AppsFlyerProperties.getInstance().getString("referrer_timestamp");
        final long currentTimeMillis = System.currentTimeMillis();
        if (string != null && currentTimeMillis - Long.parseLong(string) < 2000L) {
            return;
        }
        AFLogger.afInfoLog("SingleInstallBroadcastReceiver called");
        AFa1eSDK.valueOf().AFInAppEventType(context, intent);
        AppsFlyerProperties.getInstance().set("referrer_timestamp", String.valueOf(System.currentTimeMillis()));
    }
}
