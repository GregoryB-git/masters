// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.ArrayList;

public abstract class C2
{
    public static double a(final double a) {
        if (Double.isNaN(a)) {
            return 0.0;
        }
        if (!Double.isInfinite(a)) {
            final double n = dcmpl(a, 0.0);
            if (n != 0) {
                if (a == 0.0) {
                    return a;
                }
                int n2;
                if (n > 0) {
                    n2 = 1;
                }
                else {
                    n2 = -1;
                }
                return n2 * Math.floor(Math.abs(a));
            }
        }
        return a;
    }
    
    public static int b(final f3 f3) {
        final int i = i(f3.c("runtime.counter").f() + 1.0);
        if (i <= 1000000) {
            f3.h("runtime.counter", new k((double)i));
            return i;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }
    
    public static Z c(final String s) {
        Z c;
        if (s != null && !s.isEmpty()) {
            c = Z.c(Integer.parseInt(s));
        }
        else {
            c = null;
        }
        if (c != null) {
            return c;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", s));
    }
    
    public static Object d(final s s) {
        if (s.e.equals(s)) {
            return null;
        }
        if (s.d.equals(s)) {
            return "";
        }
        if (s instanceof r) {
            return e((r)s);
        }
        if (s instanceof g) {
            final ArrayList<Object> list = new ArrayList<Object>();
            final Iterator iterator = ((g)s).iterator();
            while (iterator.hasNext()) {
                final Object d = d(iterator.next());
                if (d != null) {
                    list.add(d);
                }
            }
            return list;
        }
        if (!s.f().isNaN()) {
            return s.f();
        }
        return s.g();
    }
    
    public static Map e(final r r) {
        final HashMap<String, Object> hashMap = new HashMap<String, Object>();
        for (final String s : r.b()) {
            final Object d = d(r.i(s));
            if (d != null) {
                hashMap.put(s, d);
            }
        }
        return hashMap;
    }
    
    public static void f(final Z z, final int n, final List list) {
        g(z.name(), n, list);
    }
    
    public static void g(final String s, final int i, final List list) {
        if (list.size() == i) {
            return;
        }
        throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", s, i, list.size()));
    }
    
    public static boolean h(final s s, final s s2) {
        if (!s.getClass().equals(s2.getClass())) {
            return false;
        }
        if (s instanceof z) {
            return true;
        }
        if (s instanceof q) {
            return true;
        }
        if (s instanceof k) {
            return !Double.isNaN(s.f()) && !Double.isNaN(s2.f()) && s.f().equals(s2.f());
        }
        if (s instanceof u) {
            return s.g().equals(s2.g());
        }
        if (s instanceof h) {
            return s.d().equals(s2.d());
        }
        return s == s2;
    }
    
    public static int i(final double a) {
        if (!Double.isNaN(a) && !Double.isInfinite(a)) {
            final double n = dcmpl(a, 0.0);
            if (n != 0) {
                int n2;
                if (n > 0) {
                    n2 = 1;
                }
                else {
                    n2 = -1;
                }
                return (int)(n2 * Math.floor(Math.abs(a)) % 4.294967296E9);
            }
        }
        return 0;
    }
    
    public static void j(final Z z, final int n, final List list) {
        k(z.name(), n, list);
    }
    
    public static void k(final String s, final int i, final List list) {
        if (list.size() >= i) {
            return;
        }
        throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", s, i, list.size()));
    }
    
    public static boolean l(final s s) {
        if (s == null) {
            return false;
        }
        final Double f = s.f();
        return !f.isNaN() && f >= 0.0 && f.equals(Math.floor(f));
    }
    
    public static long m(final double n) {
        return (long)i(n) & 0xFFFFFFFFL;
    }
    
    public static void n(final String s, final int i, final List list) {
        if (list.size() <= i) {
            return;
        }
        throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", s, i, list.size()));
    }
}
