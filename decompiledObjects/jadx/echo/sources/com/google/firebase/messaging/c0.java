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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class c0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final long f11734o;

    /* renamed from: p, reason: collision with root package name */
    public final PowerManager.WakeLock f11735p;

    /* renamed from: q, reason: collision with root package name */
    public final FirebaseMessaging f11736q;

    /* renamed from: r, reason: collision with root package name */
    public ExecutorService f11737r = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new F2.a("firebase-iid-executor"));

    public static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public c0 f11738a;

        public a(c0 c0Var) {
            this.f11738a = c0Var;
        }

        public void a() {
            if (c0.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f11738a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            c0 c0Var = this.f11738a;
            if (c0Var != null && c0Var.d()) {
                if (c0.c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f11738a.f11736q.p(this.f11738a, 0L);
                this.f11738a.b().unregisterReceiver(this);
                this.f11738a = null;
            }
        }
    }

    public c0(FirebaseMessaging firebaseMessaging, long j7) {
        this.f11736q = firebaseMessaging;
        this.f11734o = j7;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f11735p = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public static boolean c() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    public Context b() {
        return this.f11736q.q();
    }

    public boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean e() {
        String str;
        try {
            if (this.f11736q.n() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e7) {
            if (F.h(e7.getMessage())) {
                str = "Token retrieval failed: " + e7.getMessage() + ". Will retry token retrieval";
            } else {
                if (e7.getMessage() != null) {
                    throw e7;
                }
                str = "Token retrieval failed without exception message. Will retry token retrieval";
            }
            Log.w("FirebaseMessaging", str);
            return false;
        } catch (SecurityException unused) {
            str = "Token retrieval failed with SecurityException. Will retry token retrieval";
            Log.w("FirebaseMessaging", str);
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (Y.b().e(b())) {
            this.f11735p.acquire();
        }
        try {
            try {
                this.f11736q.O(true);
            } catch (IOException e7) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e7.getMessage() + ". Won't retry the operation.");
                this.f11736q.O(false);
                if (!Y.b().e(b())) {
                    return;
                }
            }
            if (!this.f11736q.z()) {
                this.f11736q.O(false);
                if (Y.b().e(b())) {
                    this.f11735p.release();
                    return;
                }
                return;
            }
            if (Y.b().d(b()) && !d()) {
                new a(this).a();
                if (Y.b().e(b())) {
                    this.f11735p.release();
                    return;
                }
                return;
            }
            if (e()) {
                this.f11736q.O(false);
            } else {
                this.f11736q.S(this.f11734o);
            }
            if (!Y.b().e(b())) {
                return;
            }
            this.f11735p.release();
        } catch (Throwable th) {
            if (Y.b().e(b())) {
                this.f11735p.release();
            }
            throw th;
        }
    }
}
