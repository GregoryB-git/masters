/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.NotificationManager
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Binder
 *  android.os.Bundle
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.concurrent.Executor
 */
package com.google.firebase.messaging;

import E2.l;
import V2.j;
import V2.k;
import V2.m;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.N;
import com.google.firebase.messaging.O;
import com.google.firebase.messaging.P;
import com.google.firebase.messaging.S;
import java.util.concurrent.Executor;

public abstract class Q {
    public static /* synthetic */ void a(Context context, boolean bl, k k8) {
        Q.d(context, bl, k8);
    }

    public static boolean b(Context context) {
        if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
            return true;
        }
        return false;
    }

    public static void c(Context context) {
        if (S.b(context)) {
            return;
        }
        Q.e(new r1.m(), context, Q.f(context));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void d(Context context, boolean bl, k k8) {
        Throwable throwable2;
        block7 : {
            block6 : {
                block5 : {
                    block4 : {
                        try {
                            if (Q.b(context)) break block4;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("error configuring notification delegate for package ");
                            stringBuilder.append(context.getPackageName());
                            Log.e((String)"FirebaseMessaging", (String)stringBuilder.toString());
                        }
                        catch (Throwable throwable2) {}
                        k8.e(null);
                        return;
                    }
                    S.c(context, true);
                    context = (NotificationManager)context.getSystemService(NotificationManager.class);
                    if (!bl) break block5;
                    N.a((NotificationManager)context, "com.google.android.gms");
                    break block6;
                    break block7;
                }
                if ("com.google.android.gms".equals((Object)O.a((NotificationManager)context))) {
                    N.a((NotificationManager)context, null);
                }
            }
            k8.e(null);
            return;
        }
        k8.e(null);
        throw throwable2;
    }

    public static j e(Executor executor, Context context, boolean bl) {
        if (!l.j()) {
            return m.e(null);
        }
        k k8 = new k();
        executor.execute((Runnable)new P(context, bl, k8));
        return k8.a();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean f(Context context) {
        PackageManager packageManager;
        try {
            context = context.getApplicationContext();
            packageManager = context.getPackageManager();
            if (packageManager == null) return true;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return true;
        }
        context = packageManager.getApplicationInfo(context.getPackageName(), 128);
        if (context == null) return true;
        packageManager = context.metaData;
        if (packageManager == null) return true;
        if (!packageManager.containsKey("firebase_messaging_notification_delegation_enabled")) return true;
        return context.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
    }
}

