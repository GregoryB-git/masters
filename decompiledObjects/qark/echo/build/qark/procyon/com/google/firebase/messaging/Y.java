// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.messaging;

import android.content.pm.ServiceInfo;
import android.content.pm.ResolveInfo;
import android.content.ComponentName;
import android.util.Log;
import android.content.Intent;
import android.content.Context;
import java.util.ArrayDeque;
import java.util.Queue;

public class Y
{
    public static Y e;
    public String a;
    public Boolean b;
    public Boolean c;
    public final Queue d;
    
    public Y() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = new ArrayDeque();
    }
    
    public static Y b() {
        // monitorenter(Y.class)
        while (true) {
            try {
                if (Y.e == null) {
                    Y.e = new Y();
                }
                // monitorexit(Y.class)
                return Y.e;
                // monitorexit(Y.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final int a(final Context context, final Intent intent) {
        final String f = this.f(context, intent);
        if (f != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Restricting intent to a specific service: ");
                sb.append(f);
                Log.d("FirebaseMessaging", sb.toString());
            }
            intent.setClassName(context.getPackageName(), f);
        }
        while (true) {
            try {
                ComponentName componentName;
                if (this.e(context)) {
                    componentName = j0.h(context, intent);
                }
                else {
                    componentName = context.startService(intent);
                    Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                }
                if (componentName == null) {
                    Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                    return 404;
                }
                return -1;
                final SecurityException ex;
                Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", (Throwable)ex);
                return 401;
            }
            catch (IllegalStateException ex3) {}
            catch (SecurityException ex2) {}
            final SecurityException ex2;
            final SecurityException ex = ex2;
            continue;
        }
    }
    
    public Intent c() {
        return this.d.poll();
    }
    
    public boolean d(final Context context) {
        if (this.c == null) {
            this.c = (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.b && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.c;
    }
    
    public boolean e(final Context context) {
        if (this.b == null) {
            this.b = (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.b && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.b;
    }
    
    public final String f(final Context context, final Intent intent) {
        // monitorenter(this)
        while (true) {
            try {
                final String a = this.a;
                if (a != null) {
                    // monitorexit(this)
                    return a;
                }
                final ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
                if (resolveService != null) {
                    final ServiceInfo serviceInfo = resolveService.serviceInfo;
                    if (serviceInfo != null) {
                        if (context.getPackageName().equals(serviceInfo.packageName)) {
                            final String name = serviceInfo.name;
                            if (name != null) {
                                String a2;
                                if (name.startsWith(".")) {
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append(context.getPackageName());
                                    sb.append(serviceInfo.name);
                                    a2 = sb.toString();
                                }
                                else {
                                    a2 = serviceInfo.name;
                                }
                                this.a = a2;
                                // monitorexit(this)
                                return this.a;
                            }
                        }
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                        sb2.append(serviceInfo.packageName);
                        sb2.append("/");
                        sb2.append(serviceInfo.name);
                        Log.e("FirebaseMessaging", sb2.toString());
                        // monitorexit(this)
                        return null;
                    }
                }
                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                // monitorexit(this)
                return null;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public int g(final Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.d.offer(intent);
        intent = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent.setPackage(context.getPackageName());
        return this.a(context, intent);
    }
}
