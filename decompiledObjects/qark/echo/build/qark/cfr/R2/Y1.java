/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.util.Log
 *  android.util.Pair
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package R2;

import A2.n;
import E2.e;
import R2.C;
import R2.G2;
import R2.K;
import R2.N2;
import R2.P1;
import R2.S5;
import R2.X1;
import R2.a2;
import R2.b2;
import R2.d2;
import R2.f;
import R2.g;
import R2.l2;
import R2.l3;
import R2.m3;
import R2.p2;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.measurement.B6;

public final class Y1
extends l3 {
    public char c = '\u0000';
    public long d = -1L;
    public String e;
    public final a2 f;
    public final a2 g;
    public final a2 h;
    public final a2 i;
    public final a2 j;
    public final a2 k;
    public final a2 l;
    public final a2 m;
    public final a2 n;

    public Y1(N2 n22) {
        super(n22);
        this.f = new a2(this, 6, false, false);
        this.g = new a2(this, 6, true, false);
        this.h = new a2(this, 6, false, true);
        this.i = new a2(this, 5, false, false);
        this.j = new a2(this, 5, true, false);
        this.k = new a2(this, 5, false, true);
        this.l = new a2(this, 4, false, false);
        this.m = new a2(this, 3, false, false);
        this.n = new a2(this, 2, false, false);
    }

    public static String E(String string2) {
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return "";
        }
        int n8 = string2.lastIndexOf(46);
        if (n8 == -1) {
            if (B6.a() && ((Boolean)K.H0.a(null)).booleanValue()) {
                return "";
            }
            return string2;
        }
        return string2.substring(0, n8);
    }

    public static Object v(String string2) {
        if (string2 == null) {
            return null;
        }
        return new d2(string2);
    }

    public static String w(boolean bl, Object object) {
        String string2 = "";
        if (object == null) {
            return "";
        }
        StringBuilder stringBuilder = object;
        if (object instanceof Integer) {
            stringBuilder = Long.valueOf((long)((Integer)object).intValue());
        }
        boolean bl2 = stringBuilder instanceof Long;
        if (bl2) {
            if (!bl) {
                return String.valueOf((Object)stringBuilder);
            }
            Long l8 = (Long)stringBuilder;
            if (Math.abs((long)l8) < 100L) {
                return String.valueOf((Object)stringBuilder);
            }
            object = string2;
            if (String.valueOf((Object)stringBuilder).charAt(0) == '-') {
                object = "-";
            }
            stringBuilder = String.valueOf((long)Math.abs((long)l8));
            long l9 = Math.round((double)Math.pow((double)10.0, (double)(stringBuilder.length() - 1)));
            long l10 = Math.round((double)(Math.pow((double)10.0, (double)stringBuilder.length()) - 1.0));
            stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            stringBuilder.append(l9);
            stringBuilder.append("...");
            stringBuilder.append((String)object);
            stringBuilder.append(l10);
            return stringBuilder.toString();
        }
        if (stringBuilder instanceof Boolean) {
            return String.valueOf((Object)stringBuilder);
        }
        if (stringBuilder instanceof Throwable) {
            stringBuilder = (Throwable)stringBuilder;
            object = bl ? stringBuilder.getClass().getName() : stringBuilder.toString();
            object = new StringBuilder((String)object);
            string2 = Y1.E(N2.class.getCanonicalName());
            for (StackTraceElement stackTraceElement : stringBuilder.getStackTrace()) {
                String string3;
                if (stackTraceElement.isNativeMethod() || (string3 = stackTraceElement.getClassName()) == null || !Y1.E(string3).equals((Object)string2)) continue;
                object.append(": ");
                object.append((Object)stackTraceElement);
                break;
            }
            return object.toString();
        }
        if (stringBuilder instanceof d2) {
            return d2.a((d2)stringBuilder);
        }
        if (bl) {
            return "-";
        }
        return String.valueOf((Object)stringBuilder);
    }

    public static String x(boolean bl, String string2, Object object, Object object2, Object object3) {
        String string3 = "";
        String string4 = string2;
        if (string2 == null) {
            string4 = "";
        }
        String string5 = Y1.w(bl, object);
        String string6 = Y1.w(bl, object2);
        object3 = Y1.w(bl, object3);
        StringBuilder stringBuilder = new StringBuilder();
        string2 = string3;
        if (!TextUtils.isEmpty((CharSequence)string4)) {
            stringBuilder.append(string4);
            string2 = ": ";
        }
        bl = TextUtils.isEmpty((CharSequence)string5);
        object2 = ", ";
        object = string2;
        if (!bl) {
            stringBuilder.append(string2);
            stringBuilder.append(string5);
            object = ", ";
        }
        if (!TextUtils.isEmpty((CharSequence)string6)) {
            stringBuilder.append((String)object);
            stringBuilder.append(string6);
            object = object2;
        }
        if (!TextUtils.isEmpty((CharSequence)object3)) {
            stringBuilder.append((String)object);
            stringBuilder.append((String)object3);
        }
        return stringBuilder.toString();
    }

    public final boolean C(int n8) {
        return Log.isLoggable((String)this.P(), (int)n8);
    }

    public final a2 F() {
        return this.m;
    }

    public final a2 G() {
        return this.f;
    }

    public final a2 H() {
        return this.h;
    }

    public final a2 I() {
        return this.g;
    }

    public final a2 J() {
        return this.l;
    }

    public final a2 K() {
        return this.n;
    }

    public final a2 L() {
        return this.i;
    }

    public final a2 M() {
        return this.k;
    }

    public final a2 N() {
        return this.j;
    }

    public final String O() {
        if (this.i().d == null) {
            return null;
        }
        Object object = this.i().d.a();
        if (object != null) {
            if (object == l2.z) {
                return null;
            }
            String string2 = String.valueOf((Object)object.second);
            object = (String)object.first;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(":");
            stringBuilder.append((String)object);
            return stringBuilder.toString();
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String P() {
        synchronized (this) {
            try {
                if (this.e == null) {
                    String string2 = this.a.O() != null ? this.a.O() : "FA";
                    this.e = string2;
                }
                n.i(this.e);
                return this.e;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public final boolean s() {
        return false;
    }

    public final void y(int n8, String string2) {
        Log.println((int)n8, (String)this.P(), (String)string2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void z(int n8, boolean bl, boolean bl2, String string2, Object object, Object object2, Object object3) {
        block6 : {
            G2 g22;
            block9 : {
                block8 : {
                    block7 : {
                        if (!bl && this.C(n8)) {
                            this.y(n8, Y1.x(false, string2, object, object2, object3));
                        }
                        if (bl2 || n8 < 5) break block6;
                        n.i(string2);
                        g22 = this.a.G();
                        if (g22 != null) break block7;
                        string2 = "Scheduler not set. Not logging error/warn";
                        break block8;
                    }
                    if (g22.r()) break block9;
                    string2 = "Scheduler not initialized. Not logging error/warn";
                }
                this.y(6, string2);
                return;
            }
            int n9 = n8;
            if (n8 < 0) {
                n9 = 0;
            }
            n8 = n9;
            if (n9 >= 9) {
                n8 = 8;
            }
            g22.D(new b2(this, n8, string2, object, object2, object3));
        }
    }
}

