package s2;

import A2.AbstractC0328n;
import J2.e;
import J2.f;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import x2.AbstractC2200n;
import x2.C2197k;
import x2.C2198l;
import x2.ServiceConnectionC2187a;

/* renamed from: s2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1939a {

    /* renamed from: a, reason: collision with root package name */
    public ServiceConnectionC2187a f19216a;

    /* renamed from: b, reason: collision with root package name */
    public f f19217b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19218c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f19219d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public C1941c f19220e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f19221f;

    /* renamed from: g, reason: collision with root package name */
    public final long f19222g;

    /* renamed from: s2.a$a, reason: collision with other inner class name */
    public static final class C0266a {

        /* renamed from: a, reason: collision with root package name */
        public final String f19223a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f19224b;

        public C0266a(String str, boolean z7) {
            this.f19223a = str;
            this.f19224b = z7;
        }

        public String a() {
            return this.f19223a;
        }

        public boolean b() {
            return this.f19224b;
        }

        public String toString() {
            String str = this.f19223a;
            boolean z7 = this.f19224b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z7);
            return sb.toString();
        }
    }

    public C1939a(Context context, long j7, boolean z7, boolean z8) {
        Context applicationContext;
        AbstractC0328n.i(context);
        if (z7 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f19221f = context;
        this.f19218c = false;
        this.f19222g = j7;
    }

    public static C0266a a(Context context) {
        C1939a c1939a = new C1939a(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c1939a.d(false);
            C0266a f7 = c1939a.f(-1);
            c1939a.e(f7, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
            return f7;
        } finally {
        }
    }

    public final void c() {
        AbstractC0328n.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f19221f == null || this.f19216a == null) {
                    return;
                }
                try {
                    if (this.f19218c) {
                        D2.b.b().c(this.f19221f, this.f19216a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f19218c = false;
                this.f19217b = null;
                this.f19216a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(boolean z7) {
        AbstractC0328n.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f19218c) {
                    c();
                }
                Context context = this.f19221f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int h7 = C2197k.f().h(context, AbstractC2200n.f21186a);
                    if (h7 != 0 && h7 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC2187a serviceConnectionC2187a = new ServiceConnectionC2187a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!D2.b.b().a(context, intent, serviceConnectionC2187a, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f19216a = serviceConnectionC2187a;
                        try {
                            this.f19217b = e.n(serviceConnectionC2187a.a(10000L, TimeUnit.MILLISECONDS));
                            this.f19218c = true;
                            if (z7) {
                                g();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new C2198l(9);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean e(C0266a c0266a, boolean z7, float f7, long j7, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app_context", "1");
        if (c0266a != null) {
            hashMap.put("limit_ad_tracking", true != c0266a.b() ? "0" : "1");
            String a7 = c0266a.a();
            if (a7 != null) {
                hashMap.put("ad_id_size", Integer.toString(a7.length()));
            }
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j7));
        new C1940b(this, hashMap).start();
        return true;
    }

    public final C0266a f(int i7) {
        C0266a c0266a;
        AbstractC0328n.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f19218c) {
                    synchronized (this.f19219d) {
                        C1941c c1941c = this.f19220e;
                        if (c1941c == null || !c1941c.f19229r) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        d(false);
                        if (!this.f19218c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e7) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e7);
                    }
                }
                AbstractC0328n.i(this.f19216a);
                AbstractC0328n.i(this.f19217b);
                try {
                    c0266a = new C0266a(this.f19217b.c(), this.f19217b.a0(true));
                } catch (RemoteException e8) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e8);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g();
        return c0266a;
    }

    public final void finalize() {
        c();
        super.finalize();
    }

    public final void g() {
        synchronized (this.f19219d) {
            C1941c c1941c = this.f19220e;
            if (c1941c != null) {
                c1941c.f19228q.countDown();
                try {
                    this.f19220e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j7 = this.f19222g;
            if (j7 > 0) {
                this.f19220e = new C1941c(this, j7);
            }
        }
    }

    public static void b(boolean z7) {
    }
}
