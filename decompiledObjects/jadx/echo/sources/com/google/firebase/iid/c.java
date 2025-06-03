package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import p4.AbstractC1810b;
import p4.C1819k;
import p4.C1827s;

/* loaded from: classes.dex */
public class c implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final long f11599o;

    /* renamed from: p, reason: collision with root package name */
    public final PowerManager.WakeLock f11600p;

    /* renamed from: q, reason: collision with root package name */
    public final FirebaseInstanceId f11601q;

    /* renamed from: r, reason: collision with root package name */
    public ExecutorService f11602r = AbstractC1810b.b();

    public static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public c f11603a;

        public a(c cVar) {
            this.f11603a = cVar;
        }

        public void a() {
            if (FirebaseInstanceId.r()) {
                Log.d("FirebaseInstanceId", "Connectivity change received registered");
            }
            this.f11603a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            c cVar = this.f11603a;
            if (cVar != null && cVar.c()) {
                if (FirebaseInstanceId.r()) {
                    Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
                }
                this.f11603a.f11601q.g(this.f11603a, 0L);
                this.f11603a.b().unregisterReceiver(this);
                this.f11603a = null;
            }
        }
    }

    public c(FirebaseInstanceId firebaseInstanceId, long j7) {
        this.f11601q = firebaseInstanceId;
        this.f11599o = j7;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f11600p = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public Context b() {
        return this.f11601q.h().m();
    }

    public boolean c() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean d() {
        String str;
        if (!this.f11601q.F(this.f11601q.p())) {
            return true;
        }
        try {
            if (this.f11601q.d() == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            return true;
        } catch (IOException e7) {
            if (C1819k.g(e7.getMessage())) {
                String message = e7.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 52);
                sb.append("Token retrieval failed: ");
                sb.append(message);
                sb.append(". Will retry token retrieval");
                str = sb.toString();
            } else {
                if (e7.getMessage() != null) {
                    throw e7;
                }
                str = "Token retrieval failed without exception message. Will retry token retrieval";
            }
            Log.w("FirebaseInstanceId", str);
            return false;
        } catch (SecurityException unused) {
            str = "Token retrieval failed with SecurityException. Will retry token retrieval";
            Log.w("FirebaseInstanceId", str);
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (C1827s.a().c(b())) {
            this.f11600p.acquire();
        }
        try {
            try {
                this.f11601q.C(true);
                if (!this.f11601q.s()) {
                    this.f11601q.C(false);
                    if (!C1827s.a().c(b())) {
                        return;
                    }
                } else if (!C1827s.a().b(b()) || c()) {
                    if (d()) {
                        this.f11601q.C(false);
                    } else {
                        this.f11601q.E(this.f11599o);
                    }
                    if (!C1827s.a().c(b())) {
                        return;
                    }
                } else {
                    new a(this).a();
                    if (!C1827s.a().c(b())) {
                        return;
                    }
                }
            } catch (IOException e7) {
                String message = e7.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
                sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb.append(message);
                sb.append(". Won't retry the operation.");
                Log.e("FirebaseInstanceId", sb.toString());
                this.f11601q.C(false);
                if (!C1827s.a().c(b())) {
                    return;
                }
            }
            this.f11600p.release();
        } catch (Throwable th) {
            if (C1827s.a().c(b())) {
                this.f11600p.release();
            }
            throw th;
        }
    }
}
