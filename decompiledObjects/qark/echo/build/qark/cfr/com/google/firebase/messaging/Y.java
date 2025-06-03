/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 *  android.content.pm.ServiceInfo
 *  android.util.Log
 *  java.lang.Boolean
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayDeque
 *  java.util.Queue
 */
package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.google.firebase.messaging.j0;
import java.util.ArrayDeque;
import java.util.Queue;

public class Y {
    public static Y e;
    public String a = null;
    public Boolean b = null;
    public Boolean c = null;
    public final Queue d = new ArrayDeque();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Y b() {
        synchronized (Y.class) {
            try {
                if (e != null) return e;
                e = new Y();
                return e;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final int a(Context context, Intent intent) {
        String string2 = this.f(context, intent);
        if (string2 != null) {
            if (Log.isLoggable((String)"FirebaseMessaging", (int)3)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Restricting intent to a specific service: ");
                stringBuilder.append(string2);
                Log.d((String)"FirebaseMessaging", (String)stringBuilder.toString());
            }
            intent.setClassName(context.getPackageName(), string2);
        }
        try {
            if (this.e(context)) {
                context = j0.h(context, intent);
            } else {
                context = context.startService(intent);
                Log.d((String)"FirebaseMessaging", (String)"Missing wake lock permission, service start may be delayed");
            }
            if (context != null) return -1;
            Log.e((String)"FirebaseMessaging", (String)"Error while delivering the message: ServiceIntent not found.");
            return 404;
        }
        catch (IllegalStateException illegalStateException) {}
        context = new StringBuilder();
        context.append("Failed to start service while in background: ");
        context.append((Object)illegalStateException);
        Log.e((String)"FirebaseMessaging", (String)context.toString());
        return 402;
        catch (SecurityException securityException) {}
        Log.e((String)"FirebaseMessaging", (String)"Error while delivering the message to the serviceIntent", (Throwable)securityException);
        return 401;
    }

    public Intent c() {
        return (Intent)this.d.poll();
    }

    public boolean d(Context context) {
        if (this.c == null) {
            boolean bl = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
            this.c = bl;
        }
        if (!this.b.booleanValue() && Log.isLoggable((String)"FirebaseMessaging", (int)3)) {
            Log.d((String)"FirebaseMessaging", (String)"Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.c;
    }

    public boolean e(Context context) {
        if (this.b == null) {
            boolean bl = context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0;
            this.b = bl;
        }
        if (!this.b.booleanValue() && Log.isLoggable((String)"FirebaseMessaging", (int)3)) {
            Log.d((String)"FirebaseMessaging", (String)"Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String f(Context object, Intent intent) {
        synchronized (this) {
            String string2;
            Throwable throwable2;
            block8 : {
                try {
                    string2 = this.a;
                    if (string2 == null) break block8;
                }
                catch (Throwable throwable2) {}
                return string2;
            }
            intent = object.getPackageManager().resolveService(intent, 0);
            if (intent != null && (intent = intent.serviceInfo) != null) {
                if (object.getPackageName().equals((Object)intent.packageName) && (string2 = intent.name) != null) {
                    if (string2.startsWith(".")) {
                        string2 = new StringBuilder();
                        string2.append(object.getPackageName());
                        string2.append(intent.name);
                        object = string2.toString();
                    } else {
                        object = intent.name;
                    }
                    this.a = object;
                    return this.a;
                }
                object = new StringBuilder();
                object.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                object.append(intent.packageName);
                object.append("/");
                object.append(intent.name);
                Log.e((String)"FirebaseMessaging", (String)object.toString());
                return null;
            }
            Log.e((String)"FirebaseMessaging", (String)"Failed to resolve target intent service, skipping classname enforcement");
            return null;
            throw throwable2;
        }
    }

    public int g(Context context, Intent intent) {
        if (Log.isLoggable((String)"FirebaseMessaging", (int)3)) {
            Log.d((String)"FirebaseMessaging", (String)"Starting service");
        }
        this.d.offer((Object)intent);
        intent = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent.setPackage(context.getPackageName());
        return this.a(context, intent);
    }
}

