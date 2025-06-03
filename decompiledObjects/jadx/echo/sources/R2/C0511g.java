package R2;

import A2.AbstractC0328n;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.N6;
import com.google.android.gms.internal.measurement.S6;
import java.lang.reflect.InvocationTargetException;

/* renamed from: R2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0511g extends AbstractC0557m3 {

    /* renamed from: b, reason: collision with root package name */
    public Boolean f5299b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0525i f5300c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f5301d;

    public C0511g(N2 n22) {
        super(n22);
        this.f5300c = new InterfaceC0525i() { // from class: R2.j
            @Override // R2.InterfaceC0525i
            public final String c(String str, String str2) {
                return null;
            }
        };
    }

    public static long G() {
        return ((Long) K.f4830f.a(null)).longValue();
    }

    public static long M() {
        return ((Long) K.f4776F.a(null)).longValue();
    }

    private final String c(String str, String str2) {
        C0472a2 G6;
        String str3;
        try {
            String str4 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
            AbstractC0328n.i(str4);
            return str4;
        } catch (ClassNotFoundException e7) {
            e = e7;
            G6 = j().G();
            str3 = "Could not find SystemProperties class";
            G6.b(str3, e);
            return str2;
        } catch (IllegalAccessException e8) {
            e = e8;
            G6 = j().G();
            str3 = "Could not access SystemProperties.get()";
            G6.b(str3, e);
            return str2;
        } catch (NoSuchMethodException e9) {
            e = e9;
            G6 = j().G();
            str3 = "Could not find SystemProperties.get() method";
            G6.b(str3, e);
            return str2;
        } catch (InvocationTargetException e10) {
            e = e10;
            G6 = j().G();
            str3 = "SystemProperties.get() threw an exception";
            G6.b(str3, e);
            return str2;
        }
    }

    public final int A(String str) {
        return u(str, K.f4852q);
    }

    public final boolean B(String str, P1 p12) {
        return D(str, p12);
    }

    public final long C(String str) {
        return x(str, K.f4824c);
    }

    public final boolean D(String str, P1 p12) {
        Object a7;
        if (str != null) {
            String c7 = this.f5300c.c(str, p12.b());
            if (!TextUtils.isEmpty(c7)) {
                a7 = p12.a(Boolean.valueOf("1".equals(c7)));
                return ((Boolean) a7).booleanValue();
            }
        }
        a7 = p12.a(null);
        return ((Boolean) a7).booleanValue();
    }

    public final int E() {
        return k().b0(201500000, true) ? 100 : 25;
    }

    public final Boolean F(String str) {
        AbstractC0328n.e(str);
        Bundle U6 = U();
        if (U6 == null) {
            j().G().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (U6.containsKey(str)) {
            return Boolean.valueOf(U6.getBoolean(str));
        }
        return null;
    }

    public final String H(String str) {
        return z(str, K.f4792N);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List I(java.lang.String r4) {
        /*
            r3 = this;
            A2.AbstractC0328n.e(r4)
            android.os.Bundle r0 = r3.U()
            r1 = 0
            if (r0 != 0) goto L19
            R2.Y1 r4 = r3.j()
            R2.a2 r4 = r4.G()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L17:
            r4 = r1
            goto L28
        L19:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L20
            goto L17
        L20:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L28:
            if (r4 != 0) goto L2b
            return r1
        L2b:
            android.content.Context r0 = r3.a()     // Catch: android.content.res.Resources.NotFoundException -> L43
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L43
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L43
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            if (r4 != 0) goto L3e
            return r1
        L3e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            return r4
        L43:
            r4 = move-exception
            R2.Y1 r0 = r3.j()
            R2.a2 r0 = r0.G()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.C0511g.I(java.lang.String):java.util.List");
    }

    public final boolean J(String str) {
        return D(str, K.f4790M);
    }

    public final boolean K(String str) {
        return "1".equals(this.f5300c.c(str, "gaia_collection_enabled"));
    }

    public final boolean L(String str) {
        return "1".equals(this.f5300c.c(str, "measurement.event_sampling_enabled"));
    }

    public final String N() {
        return c("debug.firebase.analytics.app", "");
    }

    public final String O() {
        return c("debug.deferred.deeplink", "");
    }

    public final boolean P() {
        Boolean F6 = F("google_analytics_adid_collection_enabled");
        return F6 == null || F6.booleanValue();
    }

    public final boolean Q() {
        Boolean F6 = F("google_analytics_automatic_screen_reporting_enabled");
        return F6 == null || F6.booleanValue();
    }

    public final boolean R() {
        Boolean F6 = F("firebase_analytics_collection_deactivated");
        return F6 != null && F6.booleanValue();
    }

    public final boolean S() {
        if (this.f5299b == null) {
            Boolean F6 = F("app_measurement_lite");
            this.f5299b = F6;
            if (F6 == null) {
                this.f5299b = Boolean.FALSE;
            }
        }
        return this.f5299b.booleanValue() || !this.f5424a.t();
    }

    public final boolean T() {
        if (this.f5301d == null) {
            synchronized (this) {
                try {
                    if (this.f5301d == null) {
                        ApplicationInfo applicationInfo = a().getApplicationInfo();
                        String a7 = E2.m.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            this.f5301d = Boolean.valueOf(str != null && str.equals(a7));
                        }
                        if (this.f5301d == null) {
                            this.f5301d = Boolean.TRUE;
                            j().G().a("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.f5301d.booleanValue();
    }

    public final Bundle U() {
        try {
            if (a().getPackageManager() == null) {
                j().G().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c7 = G2.d.a(a()).c(a().getPackageName(), 128);
            if (c7 != null) {
                return c7.metaData;
            }
            j().G().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e7) {
            j().G().b("Failed to load metadata: Package name not found", e7);
            return null;
        }
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ E2.e b() {
        return super.b();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ C0504f d() {
        return super.d();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ G2 e() {
        return super.e();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C0511g f() {
        return super.f();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C g() {
        return super.g();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ X1 h() {
        return super.h();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C0549l2 i() {
        return super.i();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ Y1 j() {
        return super.j();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ S5 k() {
        return super.k();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    public final double o(String str, P1 p12) {
        if (str != null) {
            String c7 = this.f5300c.c(str, p12.b());
            if (!TextUtils.isEmpty(c7)) {
                try {
                    return ((Double) p12.a(Double.valueOf(Double.parseDouble(c7)))).doubleValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Double) p12.a(null)).doubleValue();
    }

    public final int p(String str) {
        return q(str, K.f4784J, 500, 2000);
    }

    public final int q(String str, P1 p12, int i7, int i8) {
        return Math.max(Math.min(u(str, p12), i8), i7);
    }

    public final void r(InterfaceC0525i interfaceC0525i) {
        this.f5300c = interfaceC0525i;
    }

    public final boolean s(P1 p12) {
        return D(null, p12);
    }

    public final int t(String str) {
        return (N6.a() && f().D(null, K.f4823b1)) ? 500 : 100;
    }

    public final int u(String str, P1 p12) {
        if (str != null) {
            String c7 = this.f5300c.c(str, p12.b());
            if (!TextUtils.isEmpty(c7)) {
                try {
                    return ((Integer) p12.a(Integer.valueOf(Integer.parseInt(c7)))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Integer) p12.a(null)).intValue();
    }

    public final int v() {
        return (S6.a() && f().D(null, K.f4783I0) && k().b0(231100000, true)) ? 35 : 0;
    }

    public final int w(String str) {
        return Math.max(t(str), 256);
    }

    public final long x(String str, P1 p12) {
        if (str != null) {
            String c7 = this.f5300c.c(str, p12.b());
            if (!TextUtils.isEmpty(c7)) {
                try {
                    return ((Long) p12.a(Long.valueOf(Long.parseLong(c7)))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Long) p12.a(null)).longValue();
    }

    public final int y(String str) {
        return q(str, K.f4786K, 25, 100);
    }

    public final String z(String str, P1 p12) {
        return (String) p12.a(str == null ? null : this.f5300c.c(str, p12.b()));
    }
}
