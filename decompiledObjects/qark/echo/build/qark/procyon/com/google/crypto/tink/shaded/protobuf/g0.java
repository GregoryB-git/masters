// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.RandomAccess;
import java.util.List;

public abstract class g0
{
    public static final Class a;
    public static final k0 b;
    public static final k0 c;
    public static final k0 d;
    
    static {
        a = A();
        b = B(false);
        c = B(true);
        d = new m0();
    }
    
    public static Class A() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        }
        finally {
            return null;
        }
    }
    
    public static k0 B(final boolean b) {
        try {
            final Class c = C();
            if (c == null) {}
            return c.getConstructor(Boolean.TYPE).newInstance(b);
        }
        finally {
            return null;
        }
    }
    
    public static Class C() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        }
        finally {
            return null;
        }
    }
    
    public static void D(final q q, final Object o, final Object o2) {
        final t c = q.c(o2);
        if (!c.d()) {
            q.d(o).h(c);
        }
    }
    
    public static void E(final J j, final Object o, final Object o2, final long n) {
        o0.R(o, n, j.a(o0.C(o, n), o0.C(o2, n)));
    }
    
    public static void F(final k0 k0, final Object o, final Object o2) {
        k0.p(o, k0.k(k0.g(o), k0.g(o2)));
    }
    
    public static k0 G() {
        return g0.b;
    }
    
    public static k0 H() {
        return g0.c;
    }
    
    public static void I(final Class clazz) {
        if (!x.class.isAssignableFrom(clazz)) {
            final Class a = g0.a;
            if (a != null) {
                if (a.isAssignableFrom(clazz)) {
                    return;
                }
                throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
            }
        }
    }
    
    public static boolean J(final Object o, final Object obj) {
        return o == obj || (o != null && o.equals(obj));
    }
    
    public static Object K(final Object o, final int n, final int n2, final Object o2, final k0 k0) {
        Object f = o2;
        if (o2 == null) {
            f = k0.f(o);
        }
        k0.e(f, n, n2);
        return f;
    }
    
    public static k0 L() {
        return g0.d;
    }
    
    public static void M(final int n, final List list, final r0 r0, final boolean b) {
        if (list != null && !list.isEmpty()) {
            r0.r(n, list, b);
        }
    }
    
    public static void N(final int n, final List list, final r0 r0) {
        if (list != null && !list.isEmpty()) {
            r0.I(n, list);
        }
    }
    
    public static void O(final int n, final List list, final r0 r0, final boolean b) {
        if (list != null && !list.isEmpty()) {
            r0.G(n, list, b);
        }
    }
    
    public static void P(final int n, final List list, final r0 r0, final boolean b) {
        if (list != null && !list.isEmpty()) {
            r0.F(n, list, b);
        }
    }
    
    public static void Q(final int n, final List list, final r0 r0, final boolean b) {
        if (list != null && !list.isEmpty()) {
            r0.p(n, list, b);
        }
    }
    
    public static void R(final int n, final List list, final r0 r0, final boolean b) {
        if (list != null && !list.isEmpty()) {
            r0.j(n, list, b);
        }
    }
    
    public static void S(final int n, final List list, final r0 r0, final boolean b) {
        if (list != null && !list.isEmpty()) {
            r0.b(n, list, b);
        }
    }
    
    public static void T(final int n, final List list, final r0 r0, final e0 e0) {
        if (list != null && !list.isEmpty()) {
            r0.J(n, list, e0);
        }
    }
    
    public static void U(final int n, final List list, final r0 r0, final boolean b) {
        if (list != null && !list.isEmpty()) {
            r0.a(n, list, b);
        }
    }
    
    public static void V(final int n, final List list, final r0 r0, final boolean b) {
        if (list != null && !list.isEmpty()) {
            r0.E(n, list, b);
        }
    }
    
    public static void W(final int n, final List list, final r0 r0, final e0 e0) {
        if (list != null && !list.isEmpty()) {
            r0.K(n, list, e0);
        }
    }
    
    public static void X(final int n, final List list, final r0 r0, final boolean b) {
        if (list != null && !list.isEmpty()) {
            r0.k(n, list, b);
        }
    }
    
    public static void Y(final int n, final List list, final r0 r0, final boolean b) {
        if (list != null && !list.isEmpty()) {
            r0.o(n, list, b);
        }
    }
    
    public static void Z(final int n, final List list, final r0 r0, final boolean b) {
        if (list != null && !list.isEmpty()) {
            r0.B(n, list, b);
        }
    }
    
    public static int a(final int n, final List list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (b) {
            return k.L(n) + k.x(size);
        }
        return size * k.d(n, true);
    }
    
    public static void a0(final int n, final List list, final r0 r0, final boolean b) {
        if (list != null && !list.isEmpty()) {
            r0.t(n, list, b);
        }
    }
    
    public static int b(final List list) {
        return list.size();
    }
    
    public static void b0(final int n, final List list, final r0 r0) {
        if (list != null && !list.isEmpty()) {
            r0.y(n, list);
        }
    }
    
    public static int c(int i, final List list) {
        final int size = list.size();
        final int n = 0;
        if (size == 0) {
            return 0;
        }
        final int n2 = size * k.L(i);
        i = n;
        int n3 = n2;
        while (i < list.size()) {
            n3 += k.g(list.get(i));
            ++i;
        }
        return n3;
    }
    
    public static void c0(final int n, final List list, final r0 r0, final boolean b) {
        if (list != null && !list.isEmpty()) {
            r0.s(n, list, b);
        }
    }
    
    public static int d(int l, final List list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        final int e = e(list);
        l = k.L(l);
        if (b) {
            return l + k.x(e);
        }
        return e + size * l;
    }
    
    public static void d0(final int n, final List list, final r0 r0, final boolean b) {
        if (list != null && !list.isEmpty()) {
            r0.q(n, list, b);
        }
    }
    
    public static int e(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof y) {
            final y y = (y)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += k.k(y.F(n2));
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
                n5 += k.k(list.get(n6));
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
            return k.L(n) + k.x(size * 4);
        }
        return size * k.l(n, 0);
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
            return k.L(n) + k.x(size * 8);
        }
        return size * k.n(n, 0L);
    }
    
    public static int i(final List list) {
        return list.size() * 8;
    }
    
    public static int j(final int n, final List list, final e0 e0) {
        final int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int n2 = 0;
        while (i < size) {
            n2 += k.r(n, list.get(i), e0);
            ++i;
        }
        return n2;
    }
    
    public static int k(int l, final List list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        final int i = l(list);
        l = k.L(l);
        if (b) {
            return l + k.x(i);
        }
        return i + size * l;
    }
    
    public static int l(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof y) {
            final y y = (y)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += k.u(y.F(n2));
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
                n5 += k.u(list.get(n6));
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
            return k.L(n) + k.x(n2);
        }
        return n2 + list.size() * k.L(n);
    }
    
    public static int n(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof F) {
            final F f = (F)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += k.w(f.f(n2));
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
                n5 += k.w(list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    public static int o(final int n, final Object o, final e0 e0) {
        return k.y(n, (O)o, e0);
    }
    
    public static int p(int i, final List list, final e0 e0) {
        final int size = list.size();
        final int n = 0;
        if (size == 0) {
            return 0;
        }
        int n2 = k.L(i) * size;
        for (i = n; i < size; ++i) {
            n2 += k.z(list.get(i), e0);
        }
        return n2;
    }
    
    public static int q(int l, final List list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        final int r = r(list);
        l = k.L(l);
        if (b) {
            return l + k.x(r);
        }
        return r + size * l;
    }
    
    public static int r(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof y) {
            final y y = (y)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += k.G(y.F(n2));
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
                n5 += k.G(list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    public static int s(int l, final List list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        final int t = t(list);
        l = k.L(l);
        if (b) {
            return l + k.x(t);
        }
        return t + size * l;
    }
    
    public static int t(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof F) {
            final F f = (F)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += k.I(f.f(n2));
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
                n5 += k.I(list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    public static int u(int n, final List list) {
        final int size = list.size();
        int n2 = 0;
        final int n3 = 0;
        if (size == 0) {
            return 0;
        }
        final int n4 = n = k.L(n) * size;
        int n6;
        if (list instanceof D) {
            final D d = (D)list;
            n = n4;
            int n5 = n3;
            while (true) {
                n6 = n;
                if (n5 >= size) {
                    break;
                }
                final Object n7 = d.n(n5);
                int n8;
                if (n7 instanceof h) {
                    n8 = k.g((h)n7);
                }
                else {
                    n8 = k.K((String)n7);
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
                final h value = list.get(n2);
                int n9;
                if (value instanceof h) {
                    n9 = k.g(value);
                }
                else {
                    n9 = k.K((String)value);
                }
                n += n9;
                ++n2;
            }
        }
        return n6;
    }
    
    public static int v(int l, final List list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        final int w = w(list);
        l = k.L(l);
        if (b) {
            return l + k.x(w);
        }
        return w + size * l;
    }
    
    public static int w(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof y) {
            final y y = (y)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += k.N(y.F(n2));
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
                n5 += k.N(list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    public static int x(int l, final List list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        final int y = y(list);
        l = k.L(l);
        if (b) {
            return l + k.x(y);
        }
        return y + size * l;
    }
    
    public static int y(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof F) {
            final F f = (F)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += k.P(f.f(n2));
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
                n5 += k.P(list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    public static Object z(final Object o, final int n, final List list, final z.c c, Object o2, final k0 k0) {
        if (c == null) {
            return o2;
        }
        Object o3;
        if (list instanceof RandomAccess) {
            final int size = list.size();
            int i = 0;
            int n2 = 0;
            while (i < size) {
                final Integer n3 = list.get(i);
                final int intValue = n3;
                if (c.a(intValue)) {
                    if (i != n2) {
                        list.set(n2, n3);
                    }
                    ++n2;
                }
                else {
                    o2 = K(o, n, intValue, o2, k0);
                }
                ++i;
            }
            o3 = o2;
            if (n2 != size) {
                list.subList(n2, size).clear();
                return o2;
            }
        }
        else {
            final Iterator<Integer> iterator = list.iterator();
            while (true) {
                o3 = o2;
                if (!iterator.hasNext()) {
                    break;
                }
                final int intValue2 = iterator.next();
                if (c.a(intValue2)) {
                    continue;
                }
                o2 = K(o, n, intValue2, o2, k0);
                iterator.remove();
            }
        }
        return o3;
    }
}
