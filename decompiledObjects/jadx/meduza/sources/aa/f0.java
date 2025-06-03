package aa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class f0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f289a;

    /* renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f290b;

    /* renamed from: c, reason: collision with root package name */
    public final FirebaseMessaging f291c;

    public static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public f0 f292a;

        public a(f0 f0Var) {
            this.f292a = f0Var;
        }

        public final void a() {
            if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f292a.f291c.f3234c.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            f0 f0Var = this.f292a;
            if (f0Var != null && f0Var.a()) {
                if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                f0 f0Var2 = this.f292a;
                f0Var2.f291c.getClass();
                FirebaseMessaging.c(f0Var2, 0L);
                this.f292a.f291c.f3234c.unregisterReceiver(this);
                this.f292a = null;
            }
        }
    }

    public f0(FirebaseMessaging firebaseMessaging, long j10) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new w6.a("firebase-iid-executor"));
        this.f291c = firebaseMessaging;
        this.f289a = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.f3234c.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f290b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f291c.f3234c.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean b() {
        String str;
        boolean z10 = true;
        try {
            if (this.f291c.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
            }
            return true;
        } catch (IOException e10) {
            String message = e10.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                z10 = false;
            }
            if (z10) {
                StringBuilder l10 = defpackage.f.l("Token retrieval failed: ");
                l10.append(e10.getMessage());
                l10.append(". Will retry token retrieval");
                str = l10.toString();
            } else {
                if (e10.getMessage() != null) {
                    throw e10;
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
    public final void run() {
        if (d0.a().c(this.f291c.f3234c)) {
            this.f290b.acquire();
        }
        try {
            try {
                FirebaseMessaging firebaseMessaging = this.f291c;
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f3241k = true;
                }
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
                FirebaseMessaging firebaseMessaging2 = this.f291c;
                synchronized (firebaseMessaging2) {
                    firebaseMessaging2.f3241k = false;
                    if (!d0.a().c(this.f291c.f3234c)) {
                        return;
                    }
                }
            }
            if (!this.f291c.f3240j.c()) {
                FirebaseMessaging firebaseMessaging3 = this.f291c;
                synchronized (firebaseMessaging3) {
                    firebaseMessaging3.f3241k = false;
                }
                if (d0.a().c(this.f291c.f3234c)) {
                    this.f290b.release();
                    return;
                }
                return;
            }
            if (d0.a().b(this.f291c.f3234c) && !a()) {
                new a(this).a();
                if (d0.a().c(this.f291c.f3234c)) {
                    this.f290b.release();
                    return;
                }
                return;
            }
            if (b()) {
                FirebaseMessaging firebaseMessaging4 = this.f291c;
                synchronized (firebaseMessaging4) {
                    firebaseMessaging4.f3241k = false;
                }
            } else {
                this.f291c.n(this.f289a);
            }
        } finally {
            if (d0.a().c(this.f291c.f3234c)) {
                this.f290b.release();
            }
        }
    }
}
