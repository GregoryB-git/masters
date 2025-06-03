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
import java.io.IOException;

/* loaded from: classes.dex */
public class h0 implements Runnable {

    /* renamed from: t, reason: collision with root package name */
    public static final Object f11774t = new Object();

    /* renamed from: u, reason: collision with root package name */
    public static Boolean f11775u;

    /* renamed from: v, reason: collision with root package name */
    public static Boolean f11776v;

    /* renamed from: o, reason: collision with root package name */
    public final Context f11777o;

    /* renamed from: p, reason: collision with root package name */
    public final K f11778p;

    /* renamed from: q, reason: collision with root package name */
    public final PowerManager.WakeLock f11779q;

    /* renamed from: r, reason: collision with root package name */
    public final g0 f11780r;

    /* renamed from: s, reason: collision with root package name */
    public final long f11781s;

    public class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public h0 f11782a;

        public a(h0 h0Var) {
            this.f11782a = h0Var;
        }

        public void a() {
            if (h0.j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            h0.this.f11777o.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            try {
                h0 h0Var = this.f11782a;
                if (h0Var == null) {
                    return;
                }
                if (h0Var.i()) {
                    if (h0.j()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.f11782a.f11780r.m(this.f11782a, 0L);
                    context.unregisterReceiver(this);
                    this.f11782a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public h0(g0 g0Var, Context context, K k7, long j7) {
        this.f11780r = g0Var;
        this.f11777o = context;
        this.f11781s = j7;
        this.f11778p = k7;
        this.f11779q = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    public static boolean f(Context context) {
        boolean booleanValue;
        synchronized (f11774t) {
            try {
                Boolean bool = f11776v;
                Boolean valueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f11776v = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z7 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z7 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", e(str));
        }
        return z7;
    }

    public static boolean h(Context context) {
        boolean booleanValue;
        synchronized (f11774t) {
            try {
                Boolean bool = f11775u;
                Boolean valueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f11775u = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    public final synchronized boolean i() {
        boolean z7;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f11777o.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z7 = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th) {
            throw th;
        }
        return z7;
    }

    @Override // java.lang.Runnable
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (h(this.f11777o)) {
            this.f11779q.acquire(AbstractC1115e.f11747a);
        }
        try {
            try {
                try {
                    this.f11780r.o(true);
                } catch (IOException e7) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e7.getMessage());
                    this.f11780r.o(false);
                    if (!h(this.f11777o)) {
                        return;
                    } else {
                        wakeLock = this.f11779q;
                    }
                }
                if (!this.f11778p.g()) {
                    this.f11780r.o(false);
                    if (h(this.f11777o)) {
                        try {
                            this.f11779q.release();
                            return;
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            return;
                        }
                    }
                    return;
                }
                if (f(this.f11777o) && !i()) {
                    new a(this).a();
                    if (h(this.f11777o)) {
                        try {
                            this.f11779q.release();
                            return;
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            return;
                        }
                    }
                    return;
                }
                if (this.f11780r.s()) {
                    this.f11780r.o(false);
                } else {
                    this.f11780r.t(this.f11781s);
                }
                if (h(this.f11777o)) {
                    wakeLock = this.f11779q;
                    wakeLock.release();
                }
            } catch (Throwable th) {
                if (h(this.f11777o)) {
                    try {
                        this.f11779q.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
                throw th;
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
