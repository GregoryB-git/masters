// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.messaging;

import android.os.BaseBundle;
import android.os.Bundle;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import E2.l;
import V2.j;
import android.app.NotificationManager;
import android.util.Log;
import java.util.concurrent.Executor;
import r1.m;
import android.os.Binder;
import V2.k;
import android.content.Context;

public abstract class Q
{
    public static boolean b(final Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }
    
    public static void c(final Context context) {
        if (S.b(context)) {
            return;
        }
        e(new m(), context, f(context));
    }
    
    public static j e(final Executor executor, final Context context, final boolean b) {
        if (!l.j()) {
            return V2.m.e(null);
        }
        final k k = new k();
        executor.execute(new P(context, b, k));
        return k.a();
    }
    
    public static boolean f(Context applicationContext) {
        try {
            applicationContext = applicationContext.getApplicationContext();
            final PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager != null) {
                final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128);
                if (applicationInfo != null) {
                    final Bundle metaData = applicationInfo.metaData;
                    if (metaData != null && ((BaseBundle)metaData).containsKey("firebase_messaging_notification_delegation_enabled")) {
                        return ((BaseBundle)applicationInfo.metaData).getBoolean("firebase_messaging_notification_delegation_enabled");
                    }
                }
            }
            return true;
        }
        catch (PackageManager$NameNotFoundException ex) {
            return true;
        }
    }
}
