package x2;

import A2.AbstractC0328n;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

/* renamed from: x2.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2175E {

    /* renamed from: e, reason: collision with root package name */
    public static volatile A2.P f21143e;

    /* renamed from: g, reason: collision with root package name */
    public static Context f21145g;

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractBinderC2173C f21139a = new BinderC2209w(AbstractBinderC2171A.v("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractBinderC2173C f21140b = new BinderC2210x(AbstractBinderC2171A.v("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractBinderC2173C f21141c = new BinderC2211y(AbstractBinderC2171A.v("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractBinderC2173C f21142d = new BinderC2212z(AbstractBinderC2171A.v("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: f, reason: collision with root package name */
    public static final Object f21144f = new Object();

    public static C2185O a(String str, AbstractBinderC2171A abstractBinderC2171A, boolean z7, boolean z8) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, abstractBinderC2171A, z7, z8);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static C2185O b(String str, boolean z7, boolean z8, boolean z9) {
        return g(str, z7, false, false, true);
    }

    public static /* synthetic */ String c(boolean z7, String str, AbstractBinderC2171A abstractBinderC2171A) {
        String str2 = (z7 || !f(str, abstractBinderC2171A, true, false).f21161a) ? "not allowed" : "debug cert rejected";
        MessageDigest b7 = E2.a.b("SHA-256");
        AbstractC0328n.i(b7);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, E2.j.a(b7.digest(abstractBinderC2171A.Z0())), Boolean.valueOf(z7), "12451000.false");
    }

    public static synchronized void d(Context context) {
        synchronized (AbstractC2175E.class) {
            if (f21145g != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f21145g = context.getApplicationContext();
            }
        }
    }

    public static boolean e() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                h();
                return f21143e.h();
            } catch (RemoteException | DynamiteModule.a e7) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return false;
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static C2185O f(final String str, final AbstractBinderC2171A abstractBinderC2171A, final boolean z7, boolean z8) {
        try {
            h();
            AbstractC0328n.i(f21145g);
            try {
                return f21143e.e0(new C2180J(str, abstractBinderC2171A, z7, z8), H2.b.Z0(f21145g.getPackageManager())) ? C2185O.b() : new C2183M(new Callable() { // from class: x2.v
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return AbstractC2175E.c(z7, str, abstractBinderC2171A);
                    }
                }, null);
            } catch (RemoteException e7) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
                return C2185O.d("module call", e7);
            }
        } catch (DynamiteModule.a e8) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
            return C2185O.d("module init: ".concat(String.valueOf(e8.getMessage())), e8);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [H2.a, android.os.IBinder] */
    public static C2185O g(String str, boolean z7, boolean z8, boolean z9, boolean z10) {
        String concat;
        C2185O d7;
        C2176F c2176f;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            AbstractC0328n.i(f21145g);
            try {
                h();
                c2176f = new C2176F(str, z7, false, H2.b.Z0(f21145g), false);
            } catch (DynamiteModule.a e7) {
                e = e7;
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                concat = "module init: ".concat(String.valueOf(e.getMessage()));
            }
            try {
                C2178H B02 = z10 ? f21143e.B0(c2176f) : f21143e.i0(c2176f);
                if (B02.d()) {
                    d7 = C2185O.f(B02.f());
                } else {
                    String a7 = B02.a();
                    PackageManager.NameNotFoundException nameNotFoundException = B02.g() == 4 ? new PackageManager.NameNotFoundException() : null;
                    if (a7 == null) {
                        a7 = "error checking package certificate";
                    }
                    d7 = C2185O.g(B02.f(), B02.g(), a7, nameNotFoundException);
                }
            } catch (RemoteException e8) {
                e = e8;
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                concat = "module call";
                d7 = C2185O.d(concat, e);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return d7;
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return d7;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    public static void h() {
        if (f21143e != null) {
            return;
        }
        AbstractC0328n.i(f21145g);
        synchronized (f21144f) {
            try {
                if (f21143e == null) {
                    f21143e = A2.O.o(DynamiteModule.d(f21145g, DynamiteModule.f10269f, "com.google.android.gms.googlecertificates").c("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
