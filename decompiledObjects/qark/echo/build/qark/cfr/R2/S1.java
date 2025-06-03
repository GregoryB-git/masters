/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.ClassNotFoundException
 *  java.lang.Exception
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.reflect.Method
 *  java.math.BigInteger
 *  java.security.SecureRandom
 *  java.util.List
 *  java.util.Locale
 */
package R2;

import A2.n;
import E2.e;
import R2.B;
import R2.C;
import R2.C3;
import R2.D4;
import R2.G1;
import R2.G2;
import R2.K;
import R2.N2;
import R2.P1;
import R2.S5;
import R2.V1;
import R2.W5;
import R2.X1;
import R2.Y1;
import R2.a2;
import R2.f;
import R2.f1;
import R2.g;
import R2.l2;
import R2.l5;
import R2.m3;
import R2.o3;
import R2.q2;
import R2.q3;
import R2.v4;
import R2.z;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.measurement.F7;
import com.google.android.gms.internal.measurement.g7;
import com.google.android.gms.internal.measurement.n6;
import com.google.android.gms.internal.measurement.s7;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.List;
import java.util.Locale;

public final class S1
extends f1 {
    public String c;
    public String d;
    public int e;
    public String f;
    public String g;
    public long h;
    public long i;
    public List j;
    public String k;
    public int l;
    public String m;
    public String n;
    public String o;
    public long p = 0L;
    public String q = null;

    public S1(N2 n22, long l8) {
        super(n22);
        this.i = l8;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private final String J() {
        Object object;
        a2 a22;
        block10 : {
            if (F7.a() && this.f().s(K.n0)) {
                a22 = this.j().K();
                object = "Disabled IID for tests.";
            } else {
                Class class_;
                block9 : {
                    block8 : {
                        try {
                            class_ = this.a().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                            if (class_ != null) break block8;
                            return null;
                        }
                        catch (ClassNotFoundException classNotFoundException) {
                            return null;
                        }
                    }
                    try {
                        object = class_.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object)null, new Object[]{this.a()});
                        if (object != null) break block9;
                        return null;
                    }
                    catch (Exception exception) {}
                }
                return (String)class_.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(object, new Object[0]);
                a22 = this.j().N();
                object = "Failed to obtain Firebase Analytics instance";
            }
            break block10;
            catch (Exception exception) {}
            a22 = this.j().M();
            object = "Failed to retrieve Firebase Instance Id";
        }
        a22.a((String)object);
        return null;
    }

    @Override
    public final boolean A() {
        return true;
    }

    public final W5 B(String string2) {
        int n8;
        String string3;
        long l8;
        int n9;
        long l9;
        this.n();
        Object object = this.i().J();
        if (n6.a() && this.f().s(K.S0)) {
            string3 = this.i().I().i();
            n9 = object.b();
        } else {
            string3 = "";
            n9 = 100;
        }
        String string4 = this.F();
        String string5 = this.G();
        this.v();
        String string6 = this.d;
        long l10 = this.D();
        this.v();
        n.i(this.f);
        String string7 = this.f;
        this.v();
        this.n();
        if (this.h == 0L) {
            this.h = this.a.L().A(this.a(), this.a().getPackageName());
        }
        long l11 = this.h;
        boolean bl = this.a.p();
        boolean bl2 = this.i().r;
        this.n();
        String string8 = !this.a.p() ? null : this.J();
        o3 o32 = this.a;
        long l12 = o32.F().e.a();
        l12 = l12 == 0L ? o32.H : Math.min((long)o32.H, (long)l12);
        int n10 = this.C();
        boolean bl3 = this.f().P();
        o32 = this.i();
        o32.n();
        boolean bl4 = o32.F().getBoolean("deferred_analytics_collection", false);
        String string9 = this.E();
        o32 = this.f().F("google_analytics_default_allow_ad_personalization_signals");
        o32 = o32 == null ? null : Boolean.valueOf((boolean)(o32.booleanValue() ^ true));
        long l13 = this.i;
        List list = this.j;
        String string10 = object.v();
        if (this.k == null) {
            this.k = this.k().S0();
        }
        String string11 = this.k;
        if (s7.a() && this.f().s(K.x0)) {
            this.n();
            if (this.p != 0L) {
                l9 = this.b().a();
                l8 = this.p;
                if (this.o != null && l9 - l8 > 86400000L && this.q == null) {
                    this.I();
                }
            }
            if (this.o == null) {
                this.I();
            }
            object = this.o;
        } else {
            object = null;
        }
        Boolean bl5 = this.f().F("google_analytics_sgtm_upload_enabled");
        boolean bl6 = bl5 == null ? false : bl5;
        l8 = this.k().z0(this.F());
        if (g7.a() && this.f().s(K.M0)) {
            this.k();
            n8 = S5.y0();
        } else {
            n8 = 0;
        }
        l9 = g7.a() && this.f().s(K.M0) ? this.k().I0() : 0L;
        return new W5(string4, string5, string6, l10, string7, 82001L, l11, string2, bl, bl2 ^ true, string8, 0L, l12, n10, bl3, bl4, string9, (Boolean)o32, l13, list, null, string10, string11, (String)object, bl6, l8, n9, string3, n8, l9);
    }

    public final int C() {
        this.v();
        return this.l;
    }

    public final int D() {
        this.v();
        return this.e;
    }

    public final String E() {
        this.v();
        return this.n;
    }

    public final String F() {
        this.v();
        n.i(this.c);
        return this.c;
    }

    public final String G() {
        this.n();
        this.v();
        n.i(this.m);
        return this.m;
    }

    public final List H() {
        return this.j;
    }

    public final void I() {
        Object object;
        this.n();
        if (!this.i().J().l(q3.a.q)) {
            this.j().F().a("Analytics Storage consent is not granted");
            object = null;
        } else {
            object = new byte[16];
            this.k().U0().nextBytes((byte[])object);
            object = String.format((Locale)Locale.US, (String)"%032x", (Object[])new Object[]{new BigInteger(1, (byte[])object)});
        }
        a2 a22 = this.j().F();
        String string2 = object == null ? "null" : "not null";
        a22.a(String.format((String)"Resetting session stitching token to %s", (Object[])new Object[]{string2}));
        this.o = object;
        this.p = this.b().a();
    }

    public final boolean K(String string2) {
        String string3 = this.q;
        boolean bl = string3 != null && !string3.equals((Object)string2);
        this.q = string2;
        return bl;
    }

    @Override
    public final void y() {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }
}

