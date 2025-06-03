// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.protobuf;

import java.util.List;

public abstract class b0
{
    public static final Class a;
    public static final g0 b;
    public static final g0 c;
    public static final g0 d;
    
    static {
        a = z();
        b = A(false);
        c = A(true);
        d = new i0();
    }
    
    public static g0 A(final boolean b) {
        try {
            final Class b2 = B();
            if (b2 == null) {}
            return b2.getConstructor(Boolean.TYPE).newInstance(b);
        }
        finally {
            return null;
        }
    }
    
    public static Class B() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        }
        finally {
            return null;
        }
    }
    
    public static void C(final l l, final Object o, final Object o2) {
        final o b = l.b(o2);
        if (!b.j()) {
            l.c(o).p(b);
        }
    }
    
    public static void D(final F f, final Object o, final Object o2, final long n) {
        k0.R(o, n, f.a(k0.C(o, n), k0.C(o2, n)));
    }
    
    public static void E(final g0 g0, final Object o, final Object o2) {
        g0.f(o, g0.e(g0.a(o), g0.a(o2)));
    }
    
    public static g0 F() {
        return b0.b;
    }
    
    public static g0 G() {
        return b0.c;
    }
    
    public static void H(final Class clazz) {
        if (!r.class.isAssignableFrom(clazz)) {
            final Class a = b0.a;
            if (a != null) {
                if (a.isAssignableFrom(clazz)) {
                    return;
                }
                throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
            }
        }
    }
    
    public static boolean I(final Object o, final Object obj) {
        return o == obj || (o != null && o.equals(obj));
    }
    
    public static g0 J() {
        return b0.d;
    }
    
    public static void K(final int n, final List list, final n0 n2, final boolean b) {
        if (list != null && !list.isEmpty()) {
            n2.r(n, list, b);
        }
    }
    
    public static void L(final int n, final List list, final n0 n2) {
        if (list != null && !list.isEmpty()) {
            n2.I(n, list);
        }
    }
    
    public static void M(final int n, final List list, final n0 n2, final boolean b) {
        if (list != null && !list.isEmpty()) {
            n2.G(n, list, b);
        }
    }
    
    public static void N(final int n, final List list, final n0 n2, final boolean b) {
        if (list != null && !list.isEmpty()) {
            n2.F(n, list, b);
        }
    }
    
    public static void O(final int n, final List list, final n0 n2, final boolean b) {
        if (list != null && !list.isEmpty()) {
            n2.p(n, list, b);
        }
    }
    
    public static void P(final int n, final List list, final n0 n2, final boolean b) {
        if (list != null && !list.isEmpty()) {
            n2.j(n, list, b);
        }
    }
    
    public static void Q(final int n, final List list, final n0 n2, final boolean b) {
        if (list != null && !list.isEmpty()) {
            n2.b(n, list, b);
        }
    }
    
    public static void R(final int n, final List list, final n0 n2, final Z z) {
        if (list != null && !list.isEmpty()) {
            n2.K(n, list, z);
        }
    }
    
    public static void S(final int n, final List list, final n0 n2, final boolean b) {
        if (list != null && !list.isEmpty()) {
            n2.a(n, list, b);
        }
    }
    
    public static void T(final int n, final List list, final n0 n2, final boolean b) {
        if (list != null && !list.isEmpty()) {
            n2.E(n, list, b);
        }
    }
    
    public static void U(final int n, final List list, final n0 n2, final Z z) {
        if (list != null && !list.isEmpty()) {
            n2.J(n, list, z);
        }
    }
    
    public static void V(final int n, final List list, final n0 n2, final boolean b) {
        if (list != null && !list.isEmpty()) {
            n2.k(n, list, b);
        }
    }
    
    public static void W(final int n, final List list, final n0 n2, final boolean b) {
        if (list != null && !list.isEmpty()) {
            n2.o(n, list, b);
        }
    }
    
    public static void X(final int n, final List list, final n0 n2, final boolean b) {
        if (list != null && !list.isEmpty()) {
            n2.B(n, list, b);
        }
    }
    
    public static void Y(final int n, final List list, final n0 n2, final boolean b) {
        if (list != null && !list.isEmpty()) {
            n2.t(n, list, b);
        }
    }
    
    public static void Z(final int n, final List list, final n0 n2) {
        if (list != null && !list.isEmpty()) {
            n2.y(n, list);
        }
    }
    
    public static int a(final int n, final List list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (b) {
            return h.O(n) + h.z(size);
        }
        return size * h.d(n, true);
    }
    
    public static void a0(final int n, final List list, final n0 n2, final boolean b) {
        if (list != null && !list.isEmpty()) {
            n2.s(n, list, b);
        }
    }
    
    public static int b(final List list) {
        return list.size();
    }
    
    public static void b0(final int n, final List list, final n0 n2, final boolean b) {
        if (list != null && !list.isEmpty()) {
            n2.q(n, list, b);
        }
    }
    
    public static int c(int i, final List list) {
        final int size = list.size();
        final int n = 0;
        if (size == 0) {
            return 0;
        }
        final int n2 = size * h.O(i);
        i = n;
        int n3 = n2;
        while (i < list.size()) {
            n3 += h.h(list.get(i));
            ++i;
        }
        return n3;
    }
    
    public static int d(int o, final List list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        final int e = e(list);
        o = h.O(o);
        if (b) {
            return o + h.z(e);
        }
        return e + size * o;
    }
    
    public static int e(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof s) {
            final s s = (s)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += h.l(s.F(n2));
                ++n2;
            }
        }
        else {
            int n5 = 0;
            int n6 = n;
            while (true) {
                n4 = n5;
                if (n6 >= size) {
                    break;
                }
                n5 += h.l(list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    public static int f(final int n, final List list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (b) {
            return h.O(n) + h.z(size * 4);
        }
        return size * h.m(n, 0);
    }
    
    public static int g(final List list) {
        return list.size() * 4;
    }
    
    public static int h(final int n, final List list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (b) {
            return h.O(n) + h.z(size * 8);
        }
        return size * h.o(n, 0L);
    }
    
    public static int i(final List list) {
        return list.size() * 8;
    }
    
    public static int j(final int n, final List list, final Z z) {
        final int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int n2 = 0;
        while (i < size) {
            n2 += h.s(n, list.get(i), z);
            ++i;
        }
        return n2;
    }
    
    public static int k(int o, final List list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        final int l = l(list);
        o = h.O(o);
        if (b) {
            return o + h.z(l);
        }
        return l + size * o;
    }
    
    public static int l(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof s) {
            final s s = (s)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += h.w(s.F(n2));
                ++n2;
            }
        }
        else {
            int n5 = 0;
            int n6 = n;
            while (true) {
                n4 = n5;
                if (n6 >= size) {
                    break;
                }
                n5 += h.w(list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    public static int m(final int n, final List list, final boolean b) {
        if (list.size() == 0) {
            return 0;
        }
        final int n2 = n(list);
        if (b) {
            return h.O(n) + h.z(n2);
        }
        return n2 + list.size() * h.O(n);
    }
    
    public static int n(final List list) {
        final int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof B)) {
            int n = 0;
            while (i < size) {
                n += h.y(list.get(i));
                ++i;
            }
            return n;
        }
        final B b = (B)list;
        if (size <= 0) {
            return 0;
        }
        throw null;
    }
    
    public static int o(final int n, final Object o, final Z z) {
        return h.A(n, (K)o, z);
    }
    
    public static int p(int i, final List list, final Z z) {
        final int size = list.size();
        final int n = 0;
        if (size == 0) {
            return 0;
        }
        int n2 = h.O(i) * size;
        for (i = n; i < size; ++i) {
            n2 += h.C(list.get(i), z);
        }
        return n2;
    }
    
    public static int q(int o, final List list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        final int r = r(list);
        o = h.O(o);
        if (b) {
            return o + h.z(r);
        }
        return r + size * o;
    }
    
    public static int r(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof s) {
            final s s = (s)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += h.J(s.F(n2));
                ++n2;
            }
        }
        else {
            int n5 = 0;
            int n6 = n;
            while (true) {
                n4 = n5;
                if (n6 >= size) {
                    break;
                }
                n5 += h.J(list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    public static int s(int o, final List list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        final int t = t(list);
        o = h.O(o);
        if (b) {
            return o + h.z(t);
        }
        return t + size * o;
    }
    
    public static int t(final List list) {
        final int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof B)) {
            int n = 0;
            while (i < size) {
                n += h.L(list.get(i));
                ++i;
            }
            return n;
        }
        final B b = (B)list;
        if (size <= 0) {
            return 0;
        }
        throw null;
    }
    
    public static int u(int n, final List list) {
        final int size = list.size();
        int n2 = 0;
        final int n3 = 0;
        if (size == 0) {
            return 0;
        }
        final int n4 = n = h.O(n) * size;
        int n6;
        if (list instanceof z) {
            final z z = (z)list;
            n = n4;
            int n5 = n3;
            while (true) {
                n6 = n;
                if (n5 >= size) {
                    break;
                }
                final Object n7 = z.n(n5);
                int n8;
                if (n7 instanceof f) {
                    n8 = h.h((f)n7);
                }
                else {
                    n8 = h.N((String)n7);
                }
                n += n8;
                ++n5;
            }
        }
        else {
            while (true) {
                n6 = n;
                if (n2 >= size) {
                    break;
                }
                final f value = list.get(n2);
                int n9;
                if (value instanceof f) {
                    n9 = h.h(value);
                }
                else {
                    n9 = h.N((String)value);
                }
                n += n9;
                ++n2;
            }
        }
        return n6;
    }
    
    public static int v(int o, final List list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        final int w = w(list);
        o = h.O(o);
        if (b) {
            return o + h.z(w);
        }
        return w + size * o;
    }
    
    public static int w(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof s) {
            final s s = (s)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += h.Q(s.F(n2));
                ++n2;
            }
        }
        else {
            int n5 = 0;
            int n6 = n;
            while (true) {
                n4 = n5;
                if (n6 >= size) {
                    break;
                }
                n5 += h.Q(list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    public static int x(int o, final List list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        final int y = y(list);
        o = h.O(o);
        if (b) {
            return o + h.z(y);
        }
        return y + size * o;
    }
    
    public static int y(final List list) {
        final int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof B)) {
            int n = 0;
            while (i < size) {
                n += h.S(list.get(i));
                ++i;
            }
            return n;
        }
        final B b = (B)list;
        if (size <= 0) {
            return 0;
        }
        throw null;
    }
    
    public static Class z() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        }
        finally {
            return null;
        }
    }
}
