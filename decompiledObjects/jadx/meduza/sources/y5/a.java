package y5;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import j6.f;
import j6.g;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import m6.j;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public j6.a f17431a;

    /* renamed from: b, reason: collision with root package name */
    public zzf f17432b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17433c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f17434d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public c f17435e;
    public final Context f;

    /* renamed from: g, reason: collision with root package name */
    public final long f17436g;

    /* renamed from: y5.a$a, reason: collision with other inner class name */
    public static final class C0264a {

        /* renamed from: a, reason: collision with root package name */
        public final String f17437a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f17438b;

        @Deprecated
        public C0264a(String str, boolean z10) {
            this.f17437a = str;
            this.f17438b = z10;
        }

        public final String toString() {
            String str = this.f17437a;
            boolean z10 = this.f17438b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
            sb2.append("{");
            sb2.append(str);
            sb2.append("}");
            sb2.append(z10);
            return sb2.toString();
        }
    }

    public a(Context context) {
        j.i(context);
        Context applicationContext = context.getApplicationContext();
        this.f = applicationContext != null ? applicationContext : context;
        this.f17433c = false;
        this.f17436g = -1L;
    }

    public static C0264a a(Context context) {
        a aVar = new a(context);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.c();
            C0264a e10 = aVar.e();
            d(e10, SystemClock.elapsedRealtime() - elapsedRealtime, null);
            return e10;
        } finally {
        }
    }

    public static void d(C0264a c0264a, long j10, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            hashMap.put("app_context", "1");
            if (c0264a != null) {
                hashMap.put("limit_ad_tracking", true != c0264a.f17438b ? "0" : "1");
                String str = c0264a.f17437a;
                if (str != null) {
                    hashMap.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j10));
            new b(hashMap).start();
        }
    }

    public final void b() {
        j.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f == null || this.f17431a == null) {
                return;
            }
            try {
                if (this.f17433c) {
                    u6.a.b().c(this.f, this.f17431a);
                }
            } catch (Throwable th) {
                Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
            }
            this.f17433c = false;
            this.f17432b = null;
            this.f17431a = null;
        }
    }

    public final void c() {
        j.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f17433c) {
                b();
            }
            Context context = this.f;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int c10 = f.f8490b.c(context, 12451000);
                if (c10 != 0 && c10 != 2) {
                    throw new IOException("Google Play services not available");
                }
                j6.a aVar = new j6.a();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (!u6.a.b().a(context, intent, aVar, 1)) {
                        throw new IOException("Connection failure");
                    }
                    this.f17431a = aVar;
                    try {
                        this.f17432b = zze.zza(aVar.b(TimeUnit.MILLISECONDS));
                        this.f17433c = true;
                    } catch (InterruptedException unused) {
                        throw new IOException("Interrupted exception");
                    } catch (Throwable th) {
                        throw new IOException(th);
                    }
                } finally {
                    IOException iOException = new IOException(th);
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new g(9);
            }
        }
    }

    public final C0264a e() {
        C0264a c0264a;
        j.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f17433c) {
                synchronized (this.f17434d) {
                    c cVar = this.f17435e;
                    if (cVar == null || !cVar.f17443d) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    c();
                    if (!this.f17433c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e10) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                }
            }
            j.i(this.f17431a);
            j.i(this.f17432b);
            try {
                c0264a = new C0264a(this.f17432b.zzc(), this.f17432b.zze(true));
            } catch (RemoteException e11) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                throw new IOException("Remote exception");
            }
        }
        f();
        return c0264a;
    }

    public final void f() {
        synchronized (this.f17434d) {
            c cVar = this.f17435e;
            if (cVar != null) {
                cVar.f17442c.countDown();
                try {
                    this.f17435e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j10 = this.f17436g;
            if (j10 > 0) {
                this.f17435e = new c(this, j10);
            }
        }
    }

    public final void finalize() {
        b();
        super.finalize();
    }
}
