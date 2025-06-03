// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.RandomAccess;
import java.util.List;

public abstract class a5
{
    public static final Class a;
    public static final x5 b;
    public static final x5 c;
    
    static {
        a = E();
        b = A();
        c = new z5();
    }
    
    public static x5 A() {
        try {
            final Class i = I();
            if (i == null) {}
            return i.getConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        finally {
            return null;
        }
    }
    
    public static void B(final int n, final List list, final T5 t5, final boolean b) {
        if (list != null && !list.isEmpty()) {
            t5.u(n, list, b);
        }
    }
    
    public static int C(final int n, final List list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * J3.P(n, 0L);
    }
    
    public static int D(final List list) {
        return list.size() << 3;
    }
    
    public static Class E() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        }
        finally {
            return null;
        }
    }
    
    public static void F(final int n, final List list, final T5 t5, final boolean b) {
        if (list != null && !list.isEmpty()) {
            t5.n(n, list, b);
        }
    }
    
    public static int G(final int n, final List list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return H(list) + size * J3.s0(n);
    }
    
    public static int H(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof c4) {
            final c4 c4 = (c4)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += J3.g0(c4.d(n2));
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
                n5 += J3.g0(list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    public static Class I() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        }
        finally {
            return null;
        }
    }
    
    public static void J(final int n, final List list, final T5 t5, final boolean b) {
        if (list != null && !list.isEmpty()) {
            t5.b(n, list, b);
        }
    }
    
    public static int K(final int n, final List list, final boolean b) {
        if (list.size() == 0) {
            return 0;
        }
        return L(list) + list.size() * J3.s0(n);
    }
    
    public static int L(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof w4) {
            final w4 w4 = (w4)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += J3.a0(w4.l(n2));
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
                n5 += J3.a0(list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    public static void M(final int n, final List list, final T5 t5, final boolean b) {
        if (list != null && !list.isEmpty()) {
            t5.D(n, list, b);
        }
    }
    
    public static int N(final int n, final List list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return O(list) + size * J3.s0(n);
    }
    
    public static int O(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof c4) {
            final c4 c4 = (c4)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += J3.o0(c4.d(n2));
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
                n5 += J3.o0(list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    public static void P(final int n, final List list, final T5 t5, final boolean b) {
        if (list != null && !list.isEmpty()) {
            t5.v(n, list, b);
        }
    }
    
    public static int Q(final int n, final List list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return R(list) + size * J3.s0(n);
    }
    
    public static int R(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof w4) {
            final w4 w4 = (w4)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += J3.j0(w4.l(n2));
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
                n5 += J3.j0(list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    public static void S(final int n, final List list, final T5 t5, final boolean b) {
        if (list != null && !list.isEmpty()) {
            t5.p(n, list, b);
        }
    }
    
    public static int T(final int n, final List list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return U(list) + size * J3.s0(n);
    }
    
    public static int U(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof c4) {
            final c4 c4 = (c4)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += J3.v0(c4.d(n2));
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
                n5 += J3.v0(list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    public static void V(final int n, final List list, final T5 t5, final boolean b) {
        if (list != null && !list.isEmpty()) {
            t5.g(n, list, b);
        }
    }
    
    public static int W(final int n, final List list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return X(list) + size * J3.s0(n);
    }
    
    public static int X(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof w4) {
            final w4 w4 = (w4)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += J3.n0(w4.l(n2));
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
                n5 += J3.n0(list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    public static void Y(final int n, final List list, final T5 t5, final boolean b) {
        if (list != null && !list.isEmpty()) {
            t5.F(n, list, b);
        }
    }
    
    public static void Z(final int n, final List list, final T5 t5, final boolean b) {
        if (list != null && !list.isEmpty()) {
            t5.H(n, list, b);
        }
    }
    
    public static int a(final int n, final Object o, final Z4 z4) {
        return J3.R(n, (I4)o, z4);
    }
    
    public static void a0(final int n, final List list, final T5 t5, final boolean b) {
        if (list != null && !list.isEmpty()) {
            t5.y(n, list, b);
        }
    }
    
    public static int b(int i, final List list) {
        final int size = list.size();
        final int n = 0;
        if (size == 0) {
            return 0;
        }
        final int n2 = size * J3.s0(i);
        i = n;
        int n3 = n2;
        while (i < list.size()) {
            n3 += J3.A(list.get(i));
            ++i;
        }
        return n3;
    }
    
    public static void b0(final int n, final List list, final T5 t5, final boolean b) {
        if (list != null && !list.isEmpty()) {
            t5.q(n, list, b);
        }
    }
    
    public static int c(final int n, final List list, final Z4 z4) {
        final int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int n2 = 0;
        while (i < size) {
            n2 += J3.x(n, list.get(i), z4);
            ++i;
        }
        return n2;
    }
    
    public static void c0(final int n, final List list, final T5 t5, final boolean b) {
        if (list != null && !list.isEmpty()) {
            t5.i(n, list, b);
        }
    }
    
    public static int d(final int n, final List list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * J3.z(n, true);
    }
    
    public static int e(final List list) {
        return list.size();
    }
    
    public static x5 f() {
        return a5.b;
    }
    
    public static Object g(final Object o, final int n, final int n2, final Object o2, final x5 x5) {
        Object i = o2;
        if (o2 == null) {
            i = x5.i(o);
        }
        x5.f(i, n, n2);
        return i;
    }
    
    public static Object h(final Object o, final int n, final List list, final g4 g4, Object o2, final x5 x5) {
        if (g4 == null) {
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
                if (g4.e(intValue)) {
                    if (i != n2) {
                        list.set(n2, n3);
                    }
                    ++n2;
                }
                else {
                    o2 = g(o, n, intValue, o2, x5);
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
                if (g4.e(intValue2)) {
                    continue;
                }
                o2 = g(o, n, intValue2, o2, x5);
                iterator.remove();
            }
        }
        return o3;
    }
    
    public static void i(final int n, final List list, final T5 t5) {
        if (list != null && !list.isEmpty()) {
            t5.J(n, list);
        }
    }
    
    public static void j(final int n, final List list, final T5 t5, final Z4 z4) {
        if (list != null && !list.isEmpty()) {
            t5.L(n, list, z4);
        }
    }
    
    public static void k(final int n, final List list, final T5 t5, final boolean b) {
        if (list != null && !list.isEmpty()) {
            t5.m(n, list, b);
        }
    }
    
    public static void l(final O3 o3, final Object o4, final Object o5) {
        final S3 b = o3.b(o5);
        if (!b.a.isEmpty()) {
            o3.e(o4).f(b);
        }
    }
    
    public static void m(final F4 f4, final Object o, final Object o2, final long n) {
        D5.j(o, n, f4.d(D5.B(o, n), D5.B(o2, n)));
    }
    
    public static void n(final x5 x5, final Object o, final Object o2) {
        x5.j(o, x5.b(x5.k(o), x5.k(o2)));
    }
    
    public static void o(final Class clazz) {
        if (!Y3.class.isAssignableFrom(clazz)) {
            final Class a = a5.a;
            if (a != null) {
                if (a.isAssignableFrom(clazz)) {
                    return;
                }
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
    }
    
    public static boolean p(final Object o, final Object obj) {
        return o == obj || (o != null && o.equals(obj));
    }
    
    public static int q(int n, final List list) {
        final int size = list.size();
        int n2 = 0;
        final int n3 = 0;
        if (size == 0) {
            return 0;
        }
        final int n4 = n = J3.s0(n) * size;
        int n7;
        if (list instanceof n4) {
            final n4 n5 = (n4)list;
            n = n4;
            int n6 = n3;
            while (true) {
                n7 = n;
                if (n6 >= size) {
                    break;
                }
                final Object l = n5.l(n6);
                int n8;
                if (l instanceof q3) {
                    n8 = J3.A((q3)l);
                }
                else {
                    n8 = J3.C((String)l);
                }
                n += n8;
                ++n6;
            }
        }
        else {
            while (true) {
                n7 = n;
                if (n2 >= size) {
                    break;
                }
                final q3 value = list.get(n2);
                int n9;
                if (value instanceof q3) {
                    n9 = J3.A(value);
                }
                else {
                    n9 = J3.C((String)value);
                }
                n += n9;
                ++n2;
            }
        }
        return n7;
    }
    
    public static int r(int i, final List list, final Z4 z4) {
        final int size = list.size();
        final int n = 0;
        if (size == 0) {
            return 0;
        }
        int n2 = J3.s0(i) * size;
        for (i = n; i < size; ++i) {
            n2 += J3.g(list.get(i), z4);
        }
        return n2;
    }
    
    public static int s(final int n, final List list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return t(list) + size * J3.s0(n);
    }
    
    public static int t(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof c4) {
            final c4 c4 = (c4)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += J3.X(c4.d(n2));
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
                n5 += J3.X(list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    public static x5 u() {
        return a5.c;
    }
    
    public static void v(final int n, final List list, final T5 t5) {
        if (list != null && !list.isEmpty()) {
            t5.w(n, list);
        }
    }
    
    public static void w(final int n, final List list, final T5 t5, final Z4 z4) {
        if (list != null && !list.isEmpty()) {
            t5.z(n, list, z4);
        }
    }
    
    public static void x(final int n, final List list, final T5 t5, final boolean b) {
        if (list != null && !list.isEmpty()) {
            t5.B(n, list, b);
        }
    }
    
    public static int y(final int n, final List list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * J3.h0(n, 0);
    }
    
    public static int z(final List list) {
        return list.size() << 2;
    }
}
