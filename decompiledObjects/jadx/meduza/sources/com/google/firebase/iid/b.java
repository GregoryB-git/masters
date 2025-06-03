package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import b.a0;
import com.google.firebase.iid.a;
import java.io.IOException;
import r9.h;
import r9.j;
import u7.f;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f3220a;

    /* renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f3221b;

    /* renamed from: c, reason: collision with root package name */
    public final FirebaseInstanceId f3222c;

    public static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public b f3223a;

        public a(b bVar) {
            this.f3223a = bVar;
        }

        public final void a() {
            com.google.firebase.iid.a aVar = FirebaseInstanceId.f3203j;
            boolean z10 = false;
            if (Log.isLoggable("FirebaseInstanceId", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3))) {
                z10 = true;
            }
            if (z10) {
                Log.d("FirebaseInstanceId", "Connectivity change received registered");
            }
            this.f3223a.a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            b bVar = this.f3223a;
            if (bVar != null && bVar.b()) {
                boolean z10 = false;
                if (Log.isLoggable("FirebaseInstanceId", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3))) {
                    z10 = true;
                }
                if (z10) {
                    Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
                }
                b bVar2 = this.f3223a;
                bVar2.f3222c.getClass();
                FirebaseInstanceId.e(bVar2, 0L);
                this.f3223a.a().unregisterReceiver(this);
                this.f3223a = null;
            }
        }
    }

    public b(FirebaseInstanceId firebaseInstanceId, long j10) {
        a0.x();
        this.f3222c = firebaseInstanceId;
        this.f3220a = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f3221b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final Context a() {
        f fVar = this.f3222c.f3207b;
        fVar.a();
        return fVar.f15084a;
    }

    public final boolean b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean c() {
        a.C0054a b10;
        String str;
        FirebaseInstanceId firebaseInstanceId = this.f3222c;
        String a10 = h.a(firebaseInstanceId.f3207b);
        com.google.firebase.iid.a aVar = FirebaseInstanceId.f3203j;
        String g10 = firebaseInstanceId.g();
        synchronized (aVar) {
            b10 = a.C0054a.b(aVar.f3214a.getString(com.google.firebase.iid.a.b(g10, a10, "*"), null));
        }
        boolean z10 = true;
        if (!this.f3222c.k(b10)) {
            return true;
        }
        try {
            if (this.f3222c.c() == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            return true;
        } catch (IOException e10) {
            String message = e10.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                z10 = false;
            }
            if (z10) {
                String message2 = e10.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message2).length() + 52);
                sb2.append("Token retrieval failed: ");
                sb2.append(message2);
                sb2.append(". Will retry token retrieval");
                str = sb2.toString();
            } else {
                if (e10.getMessage() != null) {
                    throw e10;
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
    public final void run() {
        if (j.a().c(a())) {
            this.f3221b.acquire();
        }
        try {
            try {
                FirebaseInstanceId firebaseInstanceId = this.f3222c;
                synchronized (firebaseInstanceId) {
                    firebaseInstanceId.f3211g = true;
                }
                if (!this.f3222c.i()) {
                    FirebaseInstanceId firebaseInstanceId2 = this.f3222c;
                    synchronized (firebaseInstanceId2) {
                        firebaseInstanceId2.f3211g = false;
                    }
                    if (!j.a().c(a())) {
                        return;
                    }
                } else if (!j.a().b(a()) || b()) {
                    if (c()) {
                        FirebaseInstanceId firebaseInstanceId3 = this.f3222c;
                        synchronized (firebaseInstanceId3) {
                            firebaseInstanceId3.f3211g = false;
                        }
                    } else {
                        this.f3222c.j(this.f3220a);
                    }
                    if (!j.a().c(a())) {
                        return;
                    }
                } else {
                    new a(this).a();
                    if (!j.a().c(a())) {
                        return;
                    }
                }
            } catch (IOException e10) {
                String message = e10.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 93);
                sb2.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb2.append(message);
                sb2.append(". Won't retry the operation.");
                Log.e("FirebaseInstanceId", sb2.toString());
                FirebaseInstanceId firebaseInstanceId4 = this.f3222c;
                synchronized (firebaseInstanceId4) {
                    firebaseInstanceId4.f3211g = false;
                    if (!j.a().c(a())) {
                        return;
                    }
                }
            }
            this.f3221b.release();
        } catch (Throwable th) {
            if (j.a().c(a())) {
                this.f3221b.release();
            }
            throw th;
        }
    }
}
