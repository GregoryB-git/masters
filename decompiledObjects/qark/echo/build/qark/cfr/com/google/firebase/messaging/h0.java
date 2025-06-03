/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.PowerManager
 *  android.os.PowerManager$WakeLock
 *  android.util.Log
 *  java.io.IOException
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.K;
import com.google.firebase.messaging.e;
import com.google.firebase.messaging.g0;
import java.io.IOException;

public class h0
implements Runnable {
    public static final Object t = new Object();
    public static Boolean u;
    public static Boolean v;
    public final Context o;
    public final K p;
    public final PowerManager.WakeLock q;
    public final g0 r;
    public final long s;

    public h0(g0 g02, Context context, K k8, long l8) {
        this.r = g02;
        this.o = context;
        this.s = l8;
        this.p = k8;
        this.q = ((PowerManager)context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static String e(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Missing Permission: ");
        stringBuilder.append(string2);
        stringBuilder.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean f(Context context) {
        Object object = t;
        synchronized (object) {
            try {
                Boolean bl = v;
                boolean bl2 = bl == null ? h0.g(context, "android.permission.ACCESS_NETWORK_STATE", bl) : bl;
                context = Boolean.valueOf((boolean)bl2);
                v = context;
                return context.booleanValue();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static boolean g(Context context, String string2, Boolean bl) {
        if (bl != null) {
            return bl;
        }
        boolean bl2 = context.checkCallingOrSelfPermission(string2) == 0;
        if (!bl2 && Log.isLoggable((String)"FirebaseMessaging", (int)3)) {
            Log.d((String)"FirebaseMessaging", (String)h0.e(string2));
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean h(Context context) {
        Object object = t;
        synchronized (object) {
            try {
                Boolean bl = u;
                boolean bl2 = bl == null ? h0.g(context, "android.permission.WAKE_LOCK", bl) : bl;
                context = Boolean.valueOf((boolean)bl2);
                u = context;
                return context.booleanValue();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static boolean j() {
        if (!(Log.isLoggable((String)"FirebaseMessaging", (int)3) || Build.VERSION.SDK_INT == 23 && Log.isLoggable((String)"FirebaseMessaging", (int)3))) {
            return false;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean i() {
        synchronized (this) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager)this.o.getSystemService("connectivity");
                if (connectivityManager == null) return false;
                connectivityManager = connectivityManager.getActiveNetworkInfo();
                if (connectivityManager == null) return false;
                boolean bl = connectivityManager.isConnected();
                if (!bl) return false;
                return true;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void run() {
        Throwable throwable222;
        block20 : {
            PowerManager.WakeLock wakeLock;
            block21 : {
                block19 : {
                    block18 : {
                        block17 : {
                            if (h0.h(this.o)) {
                                this.q.acquire(e.a);
                            }
                            this.r.o(true);
                            if (this.p.g()) break block17;
                            this.r.o(false);
                            if (!h0.h(this.o)) return;
                            this.q.release();
                            return;
                            {
                                catch (RuntimeException runtimeException) {}
                            }
                        }
                        if (!h0.f(this.o) || this.i()) break block18;
                        new a(this).a();
                        if (!h0.h(this.o)) return;
                        this.q.release();
                        return;
                        {
                            catch (RuntimeException runtimeException) {}
                        }
                    }
                    if (this.r.s()) {
                        this.r.o(false);
                        break block19;
                    }
                    this.r.t(this.s);
                }
                if (!h0.h(this.o)) return;
                wakeLock = this.q;
                break block21;
                Log.i((String)"FirebaseMessaging", (String)"TopicsSyncTask's wakelock was already released due to timeout.");
                return;
                Log.i((String)"FirebaseMessaging", (String)"TopicsSyncTask's wakelock was already released due to timeout.");
                return;
                catch (Throwable throwable222) {
                    break block20;
                }
                catch (IOException iOException) {}
                {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed to sync topics. Won't retry sync. ");
                    stringBuilder.append(iOException.getMessage());
                    Log.e((String)"FirebaseMessaging", (String)stringBuilder.toString());
                    this.r.o(false);
                }
                if (!h0.h(this.o)) return;
                wakeLock = this.q;
            }
            wakeLock.release();
            return;
        }
        if (!h0.h(this.o)) throw throwable222;
        try {
            this.q.release();
            throw throwable222;
        }
        catch (RuntimeException runtimeException) {}
        catch (RuntimeException runtimeException) {}
        Log.i((String)"FirebaseMessaging", (String)"TopicsSyncTask's wakelock was already released due to timeout.");
        return;
        Log.i((String)"FirebaseMessaging", (String)"TopicsSyncTask's wakelock was already released due to timeout.");
        throw throwable222;
    }

    public class a
    extends BroadcastReceiver {
        public h0 a;

        public a(h0 h03) {
            this.a = h03;
        }

        public void a() {
            if (h0.j()) {
                Log.d((String)"FirebaseMessaging", (String)"Connectivity change received registered");
            }
            h0.this.o.registerReceiver((BroadcastReceiver)this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void onReceive(Context context, Intent object) {
            synchronized (this) {
                Throwable throwable2;
                block7 : {
                    block6 : {
                        try {
                            object = this.a;
                            if (object != null) break block6;
                        }
                        catch (Throwable throwable2) {}
                        return;
                    }
                    boolean bl = ((h0)object).i();
                    if (bl) break block7;
                    return;
                }
                if (h0.j()) {
                    Log.d((String)"FirebaseMessaging", (String)"Connectivity changed. Starting background sync.");
                }
                this.a.r.m(this.a, 0L);
                context.unregisterReceiver((BroadcastReceiver)this);
                this.a = null;
                return;
                throw throwable2;
            }
        }
    }

}

