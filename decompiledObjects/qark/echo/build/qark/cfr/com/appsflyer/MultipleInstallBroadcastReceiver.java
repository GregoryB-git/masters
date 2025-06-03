/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ActivityInfo
 *  android.content.pm.PackageItemInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.List
 */
package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFa1eSDK;
import java.util.List;

public class MultipleInstallBroadcastReceiver
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
        AFLogger.afInfoLog("MultipleInstallBroadcastReceiver called");
        AFa1eSDK.valueOf().AFInAppEventType(context, intent);
        for (ResolveInfo resolveInfo : context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.vending.INSTALL_REFERRER"), 0)) {
            String string3 = intent.getAction();
            if (!resolveInfo.activityInfo.packageName.equals((Object)context.getPackageName()) || !"com.android.vending.INSTALL_REFERRER".equals((Object)string3) || this.getClass().getName().equals((Object)resolveInfo.activityInfo.name)) continue;
            string3 = new StringBuilder("trigger onReceive: class: ");
            string3.append(resolveInfo.activityInfo.name);
            AFLogger.afInfoLog(string3.toString());
            try {
                ((BroadcastReceiver)Class.forName((String)resolveInfo.activityInfo.name).newInstance()).onReceive(context, intent);
            }
            catch (Throwable throwable) {
                StringBuilder stringBuilder = new StringBuilder("error in BroadcastReceiver ");
                stringBuilder.append(resolveInfo.activityInfo.name);
                AFLogger.afErrorLog(stringBuilder.toString(), throwable);
            }
        }
    }
}

