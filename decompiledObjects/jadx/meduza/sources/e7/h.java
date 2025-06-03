package e7;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class h extends d2.q {

    /* renamed from: c, reason: collision with root package name */
    public Boolean f4227c;

    /* renamed from: d, reason: collision with root package name */
    public String f4228d;

    /* renamed from: e, reason: collision with root package name */
    public j f4229e;
    public Boolean f;

    public h(j2 j2Var) {
        super(j2Var);
        this.f4229e = new p2.m0();
    }

    public static long z() {
        return h0.N.a(null).longValue();
    }

    public final boolean A() {
        Boolean v10 = v("google_analytics_automatic_screen_reporting_enabled");
        return v10 == null || v10.booleanValue();
    }

    public final boolean B() {
        Boolean v10 = v("firebase_analytics_collection_deactivated");
        return v10 != null && v10.booleanValue();
    }

    public final boolean C() {
        if (this.f4227c == null) {
            Boolean v10 = v("app_measurement_lite");
            this.f4227c = v10;
            if (v10 == null) {
                this.f4227c = Boolean.FALSE;
            }
        }
        return this.f4227c.booleanValue() || !((j2) this.f3407b).f4364e;
    }

    public final String b(String str, String str2) {
        b1 b1Var;
        String str3;
        try {
            String str4 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            m6.j.i(str4);
            return str4;
        } catch (ClassNotFoundException e10) {
            e = e10;
            b1Var = zzj().f4060o;
            str3 = "Could not find SystemProperties class";
            b1Var.c(str3, e);
            return "";
        } catch (IllegalAccessException e11) {
            e = e11;
            b1Var = zzj().f4060o;
            str3 = "Could not access SystemProperties.get()";
            b1Var.c(str3, e);
            return "";
        } catch (NoSuchMethodException e12) {
            e = e12;
            b1Var = zzj().f4060o;
            str3 = "Could not find SystemProperties.get() method";
            b1Var.c(str3, e);
            return "";
        } catch (InvocationTargetException e13) {
            e = e13;
            b1Var = zzj().f4060o;
            str3 = "SystemProperties.get() threw an exception";
            b1Var.c(str3, e);
            return "";
        }
    }

    public final int m(String str, m0<Integer> m0Var, int i10, int i11) {
        return Math.max(Math.min(q(str, m0Var), i11), i10);
    }

    public final int n(String str, boolean z10) {
        if (z10) {
            return m(str, h0.f4237c0, 100, 500);
        }
        return 500;
    }

    public final boolean o(m0<Boolean> m0Var) {
        return x(null, m0Var);
    }

    public final Bundle p() {
        try {
            if (zza().getPackageManager() == null) {
                zzj().f4060o.b("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a10 = x6.d.a(zza()).a(128, zza().getPackageName());
            if (a10 != null) {
                return a10.metaData;
            }
            zzj().f4060o.b("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            zzj().f4060o.c("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    public final int q(String str, m0<Integer> m0Var) {
        if (!TextUtils.isEmpty(str)) {
            String b10 = this.f4229e.b(str, m0Var.f4477a);
            if (!TextUtils.isEmpty(b10)) {
                try {
                    return m0Var.a(Integer.valueOf(Integer.parseInt(b10))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return m0Var.a(null).intValue();
    }

    public final int r(String str, boolean z10) {
        return Math.max(n(str, z10), 256);
    }

    public final long s(String str, m0<Long> m0Var) {
        if (!TextUtils.isEmpty(str)) {
            String b10 = this.f4229e.b(str, m0Var.f4477a);
            if (!TextUtils.isEmpty(b10)) {
                try {
                    return m0Var.a(Long.valueOf(Long.parseLong(b10))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return m0Var.a(null).longValue();
    }

    public final g3 t(String str, boolean z10) {
        Object obj;
        g3 g3Var = g3.UNINITIALIZED;
        m6.j.e(str);
        Bundle p10 = p();
        if (p10 == null) {
            zzj().f4060o.b("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = p10.get(str);
        }
        if (obj == null) {
            return g3Var;
        }
        if (Boolean.TRUE.equals(obj)) {
            return g3.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return g3.DENIED;
        }
        if (z10 && "eu_consent_policy".equals(obj)) {
            return g3.POLICY;
        }
        zzj().f4063r.c("Invalid manifest metadata for", str);
        return g3Var;
    }

    public final String u(String str, m0<String> m0Var) {
        return m0Var.a(TextUtils.isEmpty(str) ? null : this.f4229e.b(str, m0Var.f4477a));
    }

    public final Boolean v(String str) {
        m6.j.e(str);
        Bundle p10 = p();
        if (p10 == null) {
            zzj().f4060o.b("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (p10.containsKey(str)) {
            return Boolean.valueOf(p10.getBoolean(str));
        }
        return null;
    }

    public final boolean w(String str, m0<Boolean> m0Var) {
        return x(str, m0Var);
    }

    public final boolean x(String str, m0<Boolean> m0Var) {
        Boolean a10;
        if (!TextUtils.isEmpty(str)) {
            String b10 = this.f4229e.b(str, m0Var.f4477a);
            if (!TextUtils.isEmpty(b10)) {
                a10 = m0Var.a(Boolean.valueOf("1".equals(b10)));
                return a10.booleanValue();
            }
        }
        a10 = m0Var.a(null);
        return a10.booleanValue();
    }

    public final boolean y(String str) {
        return "1".equals(this.f4229e.b(str, "measurement.event_sampling_enabled"));
    }
}
