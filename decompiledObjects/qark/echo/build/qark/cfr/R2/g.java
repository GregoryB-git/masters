/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.os.Bundle
 *  android.text.TextUtils
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Double
 *  java.lang.IllegalAccessException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.NoSuchMethodException
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.util.Arrays
 *  java.util.List
 */
package R2;

import A2.n;
import E2.e;
import E2.m;
import G2.d;
import R2.C;
import R2.G2;
import R2.K;
import R2.N2;
import R2.P1;
import R2.S5;
import R2.X1;
import R2.Y1;
import R2.a2;
import R2.f;
import R2.i;
import R2.j;
import R2.l2;
import R2.m3;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.N6;
import com.google.android.gms.internal.measurement.S6;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public final class g
extends m3 {
    public Boolean b;
    public i c = j.a;
    public Boolean d;

    public g(N2 n22) {
        super(n22);
    }

    public static long G() {
        return (Long)K.f.a(null);
    }

    public static long M() {
        return (Long)K.F.a(null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final String c(String object, String string2) {
        void var4_7;
        String string3;
        block8 : {
            block7 : {
                block6 : {
                    block5 : {
                        try {
                            object = (String)Class.forName((String)"android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke((Object)null, new Object[]{object, string2});
                            n.i(object);
                            return object;
                        }
                        catch (InvocationTargetException invocationTargetException) {
                        }
                        catch (IllegalAccessException illegalAccessException) {
                            break block5;
                        }
                        catch (NoSuchMethodException noSuchMethodException) {
                            break block6;
                        }
                        catch (ClassNotFoundException classNotFoundException) {
                            break block7;
                        }
                        object = this.j().G();
                        string3 = "SystemProperties.get() threw an exception";
                        break block8;
                    }
                    object = this.j().G();
                    string3 = "Could not access SystemProperties.get()";
                    break block8;
                }
                object = this.j().G();
                string3 = "Could not find SystemProperties.get() method";
                break block8;
            }
            object = this.j().G();
            string3 = "Could not find SystemProperties class";
        }
        object.b(string3, var4_7);
        return string2;
    }

    public final int A(String string2) {
        return this.u(string2, K.q);
    }

    public final boolean B(String string2, P1 p12) {
        return this.D(string2, p12);
    }

    public final long C(String string2) {
        return this.x(string2, K.c);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean D(String object, P1 p12) {
        if (object != null && !TextUtils.isEmpty((CharSequence)(object = this.c.c((String)object, p12.b())))) {
            object = p12.a("1".equals(object));
            return (Boolean)object;
        }
        object = p12.a(null);
        return (Boolean)object;
    }

    public final int E() {
        if (this.k().b0(201500000, true)) {
            return 100;
        }
        return 25;
    }

    public final Boolean F(String string2) {
        n.e(string2);
        Bundle bundle = this.U();
        if (bundle == null) {
            this.j().G().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (!bundle.containsKey(string2)) {
            return null;
        }
        return bundle.getBoolean(string2);
    }

    public final String H(String string2) {
        return this.z(string2, K.N);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List I(String list) {
        n.e((String)list);
        Bundle bundle = this.U();
        if (bundle == null) {
            this.j().G().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (!bundle.containsKey((String)list)) {
            return null;
        }
        if ((list = Integer.valueOf((int)bundle.getInt((String)list))) == null) {
            return null;
        }
        try {
            list = this.a().getResources().getStringArray(list.intValue());
            if (list != null) return Arrays.asList((Object[])list);
            return null;
        }
        catch (Resources.NotFoundException notFoundException) {
            this.j().G().b("Failed to load string array from metadata: resource not found", (Object)notFoundException);
            return null;
        }
    }

    public final boolean J(String string2) {
        return this.D(string2, K.M);
    }

    public final boolean K(String string2) {
        return "1".equals((Object)this.c.c(string2, "gaia_collection_enabled"));
    }

    public final boolean L(String string2) {
        return "1".equals((Object)this.c.c(string2, "measurement.event_sampling_enabled"));
    }

    public final String N() {
        return this.c("debug.firebase.analytics.app", "");
    }

    public final String O() {
        return this.c("debug.deferred.deeplink", "");
    }

    public final boolean P() {
        Boolean bl = this.F("google_analytics_adid_collection_enabled");
        if (bl != null && !bl.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean Q() {
        Boolean bl = this.F("google_analytics_automatic_screen_reporting_enabled");
        if (bl != null && !bl.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean R() {
        Boolean bl = this.F("firebase_analytics_collection_deactivated");
        if (bl != null && bl.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean S() {
        if (this.b == null) {
            Boolean bl;
            this.b = bl = this.F("app_measurement_lite");
            if (bl == null) {
                this.b = Boolean.FALSE;
            }
        }
        if (!this.b.booleanValue() && this.a.t()) {
            return false;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean T() {
        if (this.d != null) return this.d;
        synchronized (this) {
            try {
                if (this.d != null) return this.d;
                Object object = this.a().getApplicationInfo();
                String string2 = m.a();
                if (object != null) {
                    object = object.processName;
                    boolean bl = object != null && object.equals((Object)string2);
                    this.d = bl;
                }
                if (this.d != null) return this.d;
                this.d = Boolean.TRUE;
                this.j().G().a("My process not in the list of running processes");
                return this.d;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Bundle U() {
        try {
            if (this.a().getPackageManager() == null) {
                this.j().G().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = d.a(this.a()).c(this.a().getPackageName(), 128);
            if (applicationInfo != null) return applicationInfo.metaData;
            this.j().G().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {}
        this.j().G().b("Failed to load metadata: Package name not found", (Object)nameNotFoundException);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final double o(String string2, P1 p12) {
        if (string2 == null) {
            return (Double)p12.a(null);
        }
        if (TextUtils.isEmpty((CharSequence)(string2 = this.c.c(string2, p12.b())))) {
            return (Double)p12.a(null);
        }
        try {
            return (Double)p12.a(Double.parseDouble((String)string2));
        }
        catch (NumberFormatException numberFormatException) {
            return (Double)p12.a(null);
        }
    }

    public final int p(String string2) {
        return this.q(string2, K.J, 500, 2000);
    }

    public final int q(String string2, P1 p12, int n8, int n9) {
        return Math.max((int)Math.min((int)this.u(string2, p12), (int)n9), (int)n8);
    }

    public final void r(i i8) {
        this.c = i8;
    }

    public final boolean s(P1 p12) {
        return this.D(null, p12);
    }

    public final int t(String string2) {
        if (N6.a() && this.f().D(null, K.b1)) {
            return 500;
        }
        return 100;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int u(String string2, P1 p12) {
        if (string2 == null) {
            return (Integer)p12.a(null);
        }
        if (TextUtils.isEmpty((CharSequence)(string2 = this.c.c(string2, p12.b())))) {
            return (Integer)p12.a(null);
        }
        try {
            return (Integer)p12.a(Integer.parseInt((String)string2));
        }
        catch (NumberFormatException numberFormatException) {
            return (Integer)p12.a(null);
        }
    }

    public final int v() {
        if (S6.a() && this.f().D(null, K.I0) && this.k().b0(231100000, true)) {
            return 35;
        }
        return 0;
    }

    public final int w(String string2) {
        return Math.max((int)this.t(string2), (int)256);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long x(String string2, P1 p12) {
        if (string2 == null) {
            return (Long)p12.a(null);
        }
        if (TextUtils.isEmpty((CharSequence)(string2 = this.c.c(string2, p12.b())))) {
            return (Long)p12.a(null);
        }
        try {
            return (Long)p12.a(Long.parseLong((String)string2));
        }
        catch (NumberFormatException numberFormatException) {
            return (Long)p12.a(null);
        }
    }

    public final int y(String string2) {
        return this.q(string2, K.K, 25, 100);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String z(String string2, P1 p12) {
        if (string2 == null) {
            string2 = null;
            do {
                return (String)p12.a(string2);
                break;
            } while (true);
        }
        string2 = this.c.c(string2, p12.b());
        return (String)p12.a(string2);
    }
}

