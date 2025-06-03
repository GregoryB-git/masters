package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
public class Y {

    /* renamed from: e, reason: collision with root package name */
    public static Y f11694e;

    /* renamed from: a, reason: collision with root package name */
    public String f11695a = null;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f11696b = null;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f11697c = null;

    /* renamed from: d, reason: collision with root package name */
    public final Queue f11698d = new ArrayDeque();

    public static synchronized Y b() {
        Y y7;
        synchronized (Y.class) {
            try {
                if (f11694e == null) {
                    f11694e = new Y();
                }
                y7 = f11694e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return y7;
    }

    public final int a(Context context, Intent intent) {
        ComponentName startService;
        String f7 = f(context, intent);
        if (f7 != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + f7);
            }
            intent.setClassName(context.getPackageName(), f7);
        }
        try {
            if (e(context)) {
                startService = j0.h(context, intent);
            } else {
                startService = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (startService != null) {
                return -1;
            }
            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (IllegalStateException e7) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e7);
            return 402;
        } catch (SecurityException e8) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e8);
            return 401;
        }
    }

    public Intent c() {
        return (Intent) this.f11698d.poll();
    }

    public boolean d(Context context) {
        if (this.f11697c == null) {
            this.f11697c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f11696b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f11697c.booleanValue();
    }

    public boolean e(Context context) {
        if (this.f11696b == null) {
            this.f11696b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f11696b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f11696b.booleanValue();
    }

    public final synchronized String f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        String str2;
        try {
            String str3 = this.f11695a;
            if (str3 != null) {
                return str3;
            }
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                    if (str.startsWith(".")) {
                        str2 = context.getPackageName() + serviceInfo.name;
                    } else {
                        str2 = serviceInfo.name;
                    }
                    this.f11695a = str2;
                    return this.f11695a;
                }
                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                return null;
            }
            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public int g(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f11698d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }
}
