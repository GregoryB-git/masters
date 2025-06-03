/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Z;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.g;
import com.google.android.gms.internal.measurement.h;
import com.google.android.gms.internal.measurement.k;
import com.google.android.gms.internal.measurement.q;
import com.google.android.gms.internal.measurement.r;
import com.google.android.gms.internal.measurement.s;
import com.google.android.gms.internal.measurement.u;
import com.google.android.gms.internal.measurement.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class C2 {
    public static double a(double d8) {
        double d9;
        if (Double.isNaN((double)d8)) {
            return 0.0;
        }
        if (!Double.isInfinite((double)d8) && (d9 = (d8 DCMPL 0.0)) != false) {
            if (d8 == 0.0) {
                return d8;
            }
            d9 = d9 > 0 ? (double)true : (double)-1;
            return (double)d9 * Math.floor((double)Math.abs((double)d8));
        }
        return d8;
    }

    public static int b(f3 f32) {
        int n8 = C2.i(f32.c("runtime.counter").f() + 1.0);
        if (n8 <= 1000000) {
            f32.h("runtime.counter", new k((double)n8));
            return n8;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    public static Z c(String string2) {
        Z z8 = string2 != null && !string2.isEmpty() ? Z.c(Integer.parseInt((String)string2)) : null;
        if (z8 != null) {
            return z8;
        }
        throw new IllegalArgumentException(String.format((String)"Unsupported commandId %s", (Object[])new Object[]{string2}));
    }

    public static Object d(s s8) {
        if (s.e.equals((Object)s8)) {
            return null;
        }
        if (s.d.equals((Object)s8)) {
            return "";
        }
        if (s8 instanceof r) {
            return C2.e((r)s8);
        }
        if (s8 instanceof g) {
            ArrayList arrayList = new ArrayList();
            s8 = ((g)s8).iterator();
            while (s8.hasNext()) {
                Object object = C2.d((s)s8.next());
                if (object == null) continue;
                arrayList.add(object);
            }
            return arrayList;
        }
        if (!s8.f().isNaN()) {
            return s8.f();
        }
        return s8.g();
    }

    public static Map e(r r8) {
        HashMap hashMap = new HashMap();
        for (String string2 : r8.b()) {
            Object object = C2.d(r8.i(string2));
            if (object == null) continue;
            hashMap.put((Object)string2, object);
        }
        return hashMap;
    }

    public static void f(Z z8, int n8, List list) {
        C2.g(z8.name(), n8, list);
    }

    public static void g(String string2, int n8, List list) {
        if (list.size() == n8) {
            return;
        }
        throw new IllegalArgumentException(String.format((String)"%s operation requires %s parameters found %s", (Object[])new Object[]{string2, n8, list.size()}));
    }

    public static boolean h(s s8, s s9) {
        if (!s8.getClass().equals((Object)s9.getClass())) {
            return false;
        }
        if (!(s8 instanceof z)) {
            if (s8 instanceof q) {
                return true;
            }
            if (s8 instanceof k) {
                if (!Double.isNaN((double)s8.f())) {
                    if (Double.isNaN((double)s9.f())) {
                        return false;
                    }
                    return s8.f().equals((Object)s9.f());
                }
                return false;
            }
            if (s8 instanceof u) {
                return s8.g().equals((Object)s9.g());
            }
            if (s8 instanceof h) {
                return s8.d().equals((Object)s9.d());
            }
            if (s8 == s9) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static int i(double d8) {
        double d9;
        if (!Double.isNaN((double)d8) && !Double.isInfinite((double)d8) && (d9 = (d8 DCMPL 0.0)) != false) {
            d9 = d9 > 0 ? (double)true : (double)-1;
            return (int)((double)d9 * Math.floor((double)Math.abs((double)d8)) % 4.294967296E9);
        }
        return 0;
    }

    public static void j(Z z8, int n8, List list) {
        C2.k(z8.name(), n8, list);
    }

    public static void k(String string2, int n8, List list) {
        if (list.size() >= n8) {
            return;
        }
        throw new IllegalArgumentException(String.format((String)"%s operation requires at least %s parameters found %s", (Object[])new Object[]{string2, n8, list.size()}));
    }

    public static boolean l(s s8) {
        if (s8 == null) {
            return false;
        }
        if (!(s8 = s8.f()).isNaN() && s8.doubleValue() >= 0.0 && s8.equals((Object)Math.floor((double)s8.doubleValue()))) {
            return true;
        }
        return false;
    }

    public static long m(double d8) {
        return (long)C2.i(d8) & 0xFFFFFFFFL;
    }

    public static void n(String string2, int n8, List list) {
        if (list.size() <= n8) {
            return;
        }
        throw new IllegalArgumentException(String.format((String)"%s operation requires at most %s parameters found %s", (Object[])new Object[]{string2, n8, list.size()}));
    }
}

