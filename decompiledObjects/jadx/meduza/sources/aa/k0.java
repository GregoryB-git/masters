package aa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes.dex */
public final class k0 implements Runnable {
    public static final Object f = new Object();

    /* renamed from: o, reason: collision with root package name */
    public static Boolean f324o;

    /* renamed from: p, reason: collision with root package name */
    public static Boolean f325p;

    /* renamed from: a, reason: collision with root package name */
    public final Context f326a;

    /* renamed from: b, reason: collision with root package name */
    public final r f327b;

    /* renamed from: c, reason: collision with root package name */
    public final PowerManager.WakeLock f328c;

    /* renamed from: d, reason: collision with root package name */
    public final j0 f329d;

    /* renamed from: e, reason: collision with root package name */
    public final long f330e;

    public class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public k0 f331a;

        public a(k0 k0Var) {
            this.f331a = k0Var;
        }

        public final void a() {
            if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            k0.this.f326a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x002a A[Catch: all -> 0x0046, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0007, B:12:0x000f, B:14:0x0018, B:16:0x001e, B:21:0x002a, B:22:0x0031), top: B:2:0x0001 }] */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final synchronized void onReceive(android.content.Context r5, android.content.Intent r6) {
            /*
                r4 = this;
                monitor-enter(r4)
                aa.k0 r6 = r4.f331a     // Catch: java.lang.Throwable -> L46
                if (r6 != 0) goto L7
                monitor-exit(r4)
                return
            L7:
                boolean r6 = r6.d()     // Catch: java.lang.Throwable -> L46
                if (r6 != 0) goto Lf
                monitor-exit(r4)
                return
            Lf:
                java.lang.String r6 = "FirebaseMessaging"
                r0 = 3
                boolean r1 = android.util.Log.isLoggable(r6, r0)     // Catch: java.lang.Throwable -> L46
                if (r1 != 0) goto L27
                int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L46
                r2 = 23
                if (r1 != r2) goto L25
                boolean r6 = android.util.Log.isLoggable(r6, r0)     // Catch: java.lang.Throwable -> L46
                if (r6 == 0) goto L25
                goto L27
            L25:
                r6 = 0
                goto L28
            L27:
                r6 = 1
            L28:
                if (r6 == 0) goto L31
                java.lang.String r6 = "FirebaseMessaging"
                java.lang.String r0 = "Connectivity changed. Starting background sync."
                android.util.Log.d(r6, r0)     // Catch: java.lang.Throwable -> L46
            L31:
                aa.k0 r6 = r4.f331a     // Catch: java.lang.Throwable -> L46
                aa.j0 r0 = r6.f329d     // Catch: java.lang.Throwable -> L46
                r1 = 0
                java.util.concurrent.ScheduledExecutorService r0 = r0.f     // Catch: java.lang.Throwable -> L46
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L46
                r0.schedule(r6, r1, r3)     // Catch: java.lang.Throwable -> L46
                r5.unregisterReceiver(r4)     // Catch: java.lang.Throwable -> L46
                r5 = 0
                r4.f331a = r5     // Catch: java.lang.Throwable -> L46
                monitor-exit(r4)
                return
            L46:
                r5 = move-exception
                monitor-exit(r4)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: aa.k0.a.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    public k0(j0 j0Var, Context context, r rVar, long j10) {
        this.f329d = j0Var;
        this.f326a = context;
        this.f330e = j10;
        this.f327b = rVar;
        this.f328c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        synchronized (f) {
            Boolean bool = f325p;
            Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
            f325p = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z10;
    }

    public static boolean c(Context context) {
        boolean booleanValue;
        synchronized (f) {
            Boolean bool = f324o;
            Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
            f324o = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    public final synchronized boolean d() {
        boolean z10;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f326a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null) {
            z10 = activeNetworkInfo.isConnected();
        }
        return z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (c(this.f326a)) {
            this.f328c.acquire(f.f288a);
        }
        try {
            try {
                j0 j0Var = this.f329d;
                synchronized (j0Var) {
                    j0Var.f321g = true;
                }
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
                j0 j0Var2 = this.f329d;
                synchronized (j0Var2) {
                    j0Var2.f321g = false;
                    if (!c(this.f326a)) {
                        return;
                    }
                }
            }
            if (!this.f327b.c()) {
                j0 j0Var3 = this.f329d;
                synchronized (j0Var3) {
                    j0Var3.f321g = false;
                }
                if (c(this.f326a)) {
                    try {
                        this.f328c.release();
                        return;
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (a(this.f326a) && !d()) {
                new a(this).a();
                if (c(this.f326a)) {
                    try {
                        this.f328c.release();
                        return;
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (this.f329d.g()) {
                j0 j0Var4 = this.f329d;
                synchronized (j0Var4) {
                    j0Var4.f321g = false;
                }
            } else {
                this.f329d.h(this.f330e);
            }
            if (!c(this.f326a)) {
                return;
            }
            try {
                this.f328c.release();
            } catch (RuntimeException unused3) {
                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
            }
        } catch (Throwable th) {
            if (c(this.f326a)) {
                try {
                    this.f328c.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
