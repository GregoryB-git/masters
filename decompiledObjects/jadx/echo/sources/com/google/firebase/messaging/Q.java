package com.google.firebase.messaging;

import V2.AbstractC0659j;
import V2.C0660k;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class Q {
    public static boolean b(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    public static void c(Context context) {
        if (S.b(context)) {
            return;
        }
        e(new r1.m(), context, f(context));
    }

    public static /* synthetic */ void d(Context context, boolean z7, C0660k c0660k) {
        String notificationDelegate;
        try {
            if (!b(context)) {
                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                return;
            }
            S.c(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z7) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else {
                notificationDelegate = notificationManager.getNotificationDelegate();
                if ("com.google.android.gms".equals(notificationDelegate)) {
                    notificationManager.setNotificationDelegate(null);
                }
            }
        } finally {
            c0660k.e(null);
        }
    }

    public static AbstractC0659j e(Executor executor, final Context context, final boolean z7) {
        if (!E2.l.j()) {
            return V2.m.e(null);
        }
        final C0660k c0660k = new C0660k();
        executor.execute(new Runnable() { // from class: com.google.firebase.messaging.P
            @Override // java.lang.Runnable
            public final void run() {
                Q.d(context, z7, c0660k);
            }
        });
        return c0660k.a();
    }

    public static boolean f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
