// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.BaseBundle;
import com.google.android.gms.internal.measurement.S6;
import com.google.android.gms.internal.measurement.N6;
import E2.e;
import android.content.Context;
import android.content.pm.PackageManager$NameNotFoundException;
import G2.d;
import android.content.pm.ApplicationInfo;
import E2.m;
import android.content.res.Resources$NotFoundException;
import java.util.Arrays;
import java.util.List;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import A2.n;

public final class g extends m3
{
    public Boolean b;
    public i c;
    public Boolean d;
    
    public g(final N2 n2) {
        super(n2);
        this.c = j.a;
    }
    
    public static long G() {
        return (long)K.f.a(null);
    }
    
    public static long M() {
        return (long)K.F.a(null);
    }
    
    private final String c(String s, final String s2) {
        while (true) {
            Label_0119: {
                Label_0105: {
                    Label_0091: {
                        try {
                            s = (String)Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, s, s2);
                            n.i(s);
                            return s;
                        }
                        catch (InvocationTargetException ex) {}
                        catch (IllegalAccessException ex) {
                            break Label_0091;
                        }
                        catch (NoSuchMethodException ex) {
                            break Label_0105;
                        }
                        catch (ClassNotFoundException ex) {
                            break Label_0119;
                        }
                        final a2 a2 = this.j().G();
                        final String s3 = "SystemProperties.get() threw an exception";
                        final InvocationTargetException ex;
                        a2.b(s3, ex);
                        return s2;
                    }
                    final a2 a2 = this.j().G();
                    final String s3 = "Could not access SystemProperties.get()";
                    continue;
                }
                final a2 a2 = this.j().G();
                final String s3 = "Could not find SystemProperties.get() method";
                continue;
            }
            final a2 a2 = this.j().G();
            final String s3 = "Could not find SystemProperties class";
            continue;
        }
    }
    
    public final int A(final String s) {
        return this.u(s, K.q);
    }
    
    public final boolean B(final String s, final P1 p2) {
        return this.D(s, p2);
    }
    
    public final long C(final String s) {
        return this.x(s, K.c);
    }
    
    public final boolean D(String c, final P1 p2) {
        if (c != null) {
            c = this.c.c(c, p2.b());
            if (!TextUtils.isEmpty((CharSequence)c)) {
                final Object o = p2.a("1".equals(c));
                return (boolean)o;
            }
        }
        final Object o = p2.a(null);
        return (boolean)o;
    }
    
    public final int E() {
        if (this.k().b0(201500000, true)) {
            return 100;
        }
        return 25;
    }
    
    public final Boolean F(final String s) {
        n.e(s);
        final Bundle u = this.U();
        if (u == null) {
            this.j().G().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (!((BaseBundle)u).containsKey(s)) {
            return null;
        }
        return ((BaseBundle)u).getBoolean(s);
    }
    
    public final String H(final String s) {
        return this.z(s, K.N);
    }
    
    public final List I(final String s) {
        n.e(s);
        final Bundle u = this.U();
        Integer value = null;
        Label_0051: {
            if (u == null) {
                this.j().G().a("Failed to load metadata: Metadata bundle is null");
            }
            else if (((BaseBundle)u).containsKey(s)) {
                value = ((BaseBundle)u).getInt(s);
                break Label_0051;
            }
            value = null;
        }
        if (value == null) {
            return null;
        }
        try {
            final String[] stringArray = this.a().getResources().getStringArray((int)value);
            if (stringArray == null) {
                return null;
            }
            return Arrays.asList(stringArray);
        }
        catch (Resources$NotFoundException ex) {
            this.j().G().b("Failed to load string array from metadata: resource not found", ex);
            return null;
        }
    }
    
    public final boolean J(final String s) {
        return this.D(s, K.M);
    }
    
    public final boolean K(final String s) {
        return "1".equals(this.c.c(s, "gaia_collection_enabled"));
    }
    
    public final boolean L(final String s) {
        return "1".equals(this.c.c(s, "measurement.event_sampling_enabled"));
    }
    
    public final String N() {
        return this.c("debug.firebase.analytics.app", "");
    }
    
    public final String O() {
        return this.c("debug.deferred.deeplink", "");
    }
    
    public final boolean P() {
        final Boolean f = this.F("google_analytics_adid_collection_enabled");
        return f == null || f;
    }
    
    public final boolean Q() {
        final Boolean f = this.F("google_analytics_automatic_screen_reporting_enabled");
        return f == null || f;
    }
    
    public final boolean R() {
        final Boolean f = this.F("firebase_analytics_collection_deactivated");
        return f != null && f;
    }
    
    public final boolean S() {
        if (this.b == null && (this.b = this.F("app_measurement_lite")) == null) {
            this.b = Boolean.FALSE;
        }
        return this.b || !super.a.t();
    }
    
    public final boolean T() {
        Label_0098: {
            if (this.d != null) {
                break Label_0098;
            }
            while (true) {
                // monitorenter(this)
                while (true) {
                    Label_0110: {
                        while (true) {
                            try {
                                if (this.d == null) {
                                    final ApplicationInfo applicationInfo = this.a().getApplicationInfo();
                                    final String a = m.a();
                                    if (applicationInfo != null) {
                                        final String processName = applicationInfo.processName;
                                        if (processName == null || !processName.equals(a)) {
                                            break Label_0110;
                                        }
                                        final boolean b = true;
                                        this.d = b;
                                    }
                                    if (this.d == null) {
                                        this.d = Boolean.TRUE;
                                        this.j().G().a("My process not in the list of running processes");
                                    }
                                }
                                // monitorexit(this)
                                return this.d;
                            }
                            // monitorexit(this)
                            finally {}
                            continue;
                        }
                    }
                    final boolean b = false;
                    continue;
                }
            }
        }
    }
    
    public final Bundle U() {
        while (true) {
            try {
                if (this.a().getPackageManager() == null) {
                    this.j().G().a("Failed to load metadata: PackageManager is null");
                    return null;
                }
                final ApplicationInfo c = G2.d.a(this.a()).c(this.a().getPackageName(), 128);
                if (c == null) {
                    this.j().G().a("Failed to load metadata: ApplicationInfo is null");
                    return null;
                }
                return c.metaData;
                final PackageManager$NameNotFoundException ex;
                this.j().G().b("Failed to load metadata: Package name not found", ex);
                return null;
            }
            catch (PackageManager$NameNotFoundException ex) {
                continue;
            }
            break;
        }
    }
    
    public final double o(String c, final P1 p2) {
        if (c != null) {
            c = this.c.c(c, p2.b());
            if (!TextUtils.isEmpty((CharSequence)c)) {
                try {
                    return (double)p2.a(Double.parseDouble(c));
                }
                catch (NumberFormatException ex) {}
            }
        }
        return (double)p2.a(null);
    }
    
    public final int p(final String s) {
        return this.q(s, K.J, 500, 2000);
    }
    
    public final int q(final String s, final P1 p4, final int b, final int b2) {
        return Math.max(Math.min(this.u(s, p4), b2), b);
    }
    
    public final void r(final i c) {
        this.c = c;
    }
    
    public final boolean s(final P1 p) {
        return this.D(null, p);
    }
    
    public final int t(final String s) {
        if (N6.a() && this.f().D(null, K.b1)) {
            return 500;
        }
        return 100;
    }
    
    public final int u(String c, final P1 p2) {
        if (c != null) {
            c = this.c.c(c, p2.b());
            if (!TextUtils.isEmpty((CharSequence)c)) {
                try {
                    return (int)p2.a(Integer.parseInt(c));
                }
                catch (NumberFormatException ex) {}
            }
        }
        return (int)p2.a(null);
    }
    
    public final int v() {
        if (S6.a() && this.f().D(null, K.I0) && this.k().b0(231100000, true)) {
            return 35;
        }
        return 0;
    }
    
    public final int w(final String s) {
        return Math.max(this.t(s), 256);
    }
    
    public final long x(String c, final P1 p2) {
        if (c != null) {
            c = this.c.c(c, p2.b());
            if (!TextUtils.isEmpty((CharSequence)c)) {
                try {
                    return (long)p2.a(Long.parseLong(c));
                }
                catch (NumberFormatException ex) {}
            }
        }
        return (long)p2.a(null);
    }
    
    public final int y(final String s) {
        return this.q(s, K.K, 25, 100);
    }
    
    public final String z(String c, final P1 p2) {
        if (c == null) {
            c = null;
        }
        else {
            c = this.c.c(c, p2.b());
        }
        return (String)p2.a(c);
    }
}
