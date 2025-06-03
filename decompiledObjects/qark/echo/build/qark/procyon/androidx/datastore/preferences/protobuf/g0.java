// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.RandomAccess;
import java.util.List;

public abstract class g0
{
    public static final Class a;
    public static final l0 b;
    public static final l0 c;
    public static final l0 d;
    
    static {
        a = A();
        b = B(false);
        c = B(true);
        d = new n0();
    }
    
    public static Class A() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        }
        finally {
            return null;
        }
    }
    
    public static l0 B(final boolean b) {
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
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        }
        finally {
            return null;
        }
    }
    
    public static void D(final p p3, final Object o, final Object o2) {
        final s c = p3.c(o2);
        if (!c.j()) {
            p3.d(o).p(c);
        }
    }
    
    public static void E(final J j, final Object o, final Object o2, final long n) {
        p0.O(o, n, j.a(p0.A(o, n), p0.A(o2, n)));
    }
    
    public static void F(final l0 l0, final Object o, final Object o2) {
        l0.p(o, l0.k(l0.g(o), l0.g(o2)));
    }
    
    public static l0 G() {
        return g0.b;
    }
    
    public static l0 H() {
        return g0.c;
    }
    
    public static void I(final Class clazz) {
        if (!w.class.isAssignableFrom(clazz)) {
            final Class a = g0.a;
            if (a != null) {
                if (a.isAssignableFrom(clazz)) {
                    return;
                }
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
    }
    
    public static boolean J(final Object o, final Object obj) {
        return o == obj || (o != null && o.equals(obj));
    }
    
    public static Object K(final int n, final int n2, final Object o, final l0 l0) {
        Object n3 = o;
        if (o == null) {
            n3 = l0.n();
        }
        l0.e(n3, n, n2);
        return n3;
    }
    
    public static l0 L() {
        return g0.d;
    }
    
    public static void M(final int n, final List list, final s0 s0, final boolean b) {
        if (list != null && !list.isEmpty()) {
            s0.r(n, list, b);
        }
    }
    
    public static void N(final int n, final List list, final s0 s0) {
        if (list != null && !list.isEmpty()) {
            s0.I(n, list);
        }
    }
    
    public static void O(final int n, final List list, final s0 s0, final boolean b) {
        if (list != null && !list.isEmpty()) {
            s0.G(n, list, b);
        }
    }
    
    public static void P(final int n, final List list, final s0 s0, final boolean b) {
        if (list != null && !list.isEmpty()) {
            s0.F(n, list, b);
        }
    }
    
    public static void Q(final int n, final List list, final s0 s0, final boolean b) {
        if (list != null && !list.isEmpty()) {
            s0.p(n, list, b);
        }
    }
    
    public static void R(final int n, final List list, final s0 s0, final boolean b) {
        if (list != null && !list.isEmpty()) {
            s0.j(n, list, b);
        }
    }
    
    public static void S(final int n, final List list, final s0 s0, final boolean b) {
        if (list != null && !list.isEmpty()) {
            s0.b(n, list, b);
        }
    }
    
    public static void T(final int n, final List list, final s0 s0, final e0 e0) {
        if (list != null && !list.isEmpty()) {
            s0.M(n, list, e0);
        }
    }
    
    public static void U(final int n, final List list, final s0 s0, final boolean b) {
        if (list != null && !list.isEmpty()) {
            s0.a(n, list, b);
        }
    }
    
    public static void V(final int n, final List list, final s0 s0, final boolean b) {
        if (list != null && !list.isEmpty()) {
            s0.E(n, list, b);
        }
    }
    
    public static void W(final int n, final List list, final s0 s0, final e0 e0) {
        if (list != null && !list.isEmpty()) {
            s0.L(n, list, e0);
        }
    }
    
    public static void X(final int n, final List list, final s0 s0, final boolean b) {
        if (list != null && !list.isEmpty()) {
            s0.k(n, list, b);
        }
    }
    
    public static void Y(final int n, final List list, final s0 s0, final boolean b) {
        if (list != null && !list.isEmpty()) {
            s0.o(n, list, b);
        }
    }
    
    public static void Z(final int n, final List list, final s0 s0, final boolean b) {
        if (list != null && !list.isEmpty()) {
            s0.B(n, list, b);
        }
    }
    
    public static int a(final int n, final List list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (b) {
            return j.P(n) + j.y(size);
        }
        return size * j.c(n, true);
    }
    
    public static void a0(final int n, final List list, final s0 s0, final boolean b) {
        if (list != null && !list.isEmpty()) {
            s0.t(n, list, b);
        }
    }
    
    public static int b(final List list) {
        return list.size();
    }
    
    public static void b0(final int n, final List list, final s0 s0) {
        if (list != null && !list.isEmpty()) {
            s0.y(n, list);
        }
    }
    
    public static int c(int i, final List list) {
        final int size = list.size();
        final int n = 0;
        if (size == 0) {
            return 0;
        }
        final int n2 = size * j.P(i);
        i = n;
        int n3 = n2;
        while (i < list.size()) {
            n3 += j.g(list.get(i));
            ++i;
        }
        return n3;
    }
    
    public static void c0(final int n, final List list, final s0 s0, final boolean b) {
        if (list != null && !list.isEmpty()) {
            s0.s(n, list, b);
        }
    }
    
    public static int d(int p3, final List list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        final int e = e(list);
        p3 = j.P(p3);
        if (b) {
            return p3 + j.y(e);
        }
        return e + size * p3;
    }
    
    public static void d0(final int n, final List list, final s0 s0, final boolean b) {
        if (list != null && !list.isEmpty()) {
            s0.q(n, list, b);
        }
    }
    
    public static int e(final List list) {
        final int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof x)) {
            int n = 0;
            while (i < size) {
                n += j.k(list.get(i));
                ++i;
            }
            return n;
        }
        final x x = (x)list;
        if (size <= 0) {
            return 0;
        }
        throw null;
    }
    
    public static int f(final int n, final List list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (b) {
            return j.P(n) + j.y(size * 4);
        }
        return size * j.l(n, 0);
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
            return j.P(n) + j.y(size * 8);
        }
        return size * j.n(n, 0L);
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
            n2 += j.r(n, list.get(i), e0);
            ++i;
        }
        return n2;
    }
    
    public static int k(int p3, final List list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        final int l = l(list);
        p3 = j.P(p3);
        if (b) {
            return p3 + j.y(l);
        }
        return l + size * p3;
    }
    
    public static int l(final List list) {
        final int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof x)) {
            int n = 0;
            while (i < size) {
                n += j.v(list.get(i));
                ++i;
            }
            return n;
        }
        final x x = (x)list;
        if (size <= 0) {
            return 0;
        }
        throw null;
    }
    
    public static int m(final int n, final List list, final boolean b) {
        if (list.size() == 0) {
            return 0;
        }
        final int n2 = n(list);
        if (b) {
            return j.P(n) + j.y(n2);
        }
        return n2 + list.size() * j.P(n);
    }
    
    public static int n(final List list) {
        final int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof F)) {
            int n = 0;
            while (i < size) {
                n += j.x(list.get(i));
                ++i;
            }
            return n;
        }
        final F f = (F)list;
        if (size <= 0) {
            return 0;
        }
        throw null;
    }
    
    public static int o(final int n, final Object o, final e0 e0) {
        return j.z(n, (O)o, e0);
    }
    
    public static int p(int i, final List list, final e0 e0) {
        final int size = list.size();
        final int n = 0;
        if (size == 0) {
            return 0;
        }
        int n2 = j.P(i) * size;
        for (i = n; i < size; ++i) {
            n2 += j.B(list.get(i), e0);
        }
        return n2;
    }
    
    public static int q(int p3, final List list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        final int r = r(list);
        p3 = j.P(p3);
        if (b) {
            return p3 + j.y(r);
        }
        return r + size * p3;
    }
    
    public static int r(final List list) {
        final int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof x)) {
            int n = 0;
            while (i < size) {
                n += j.K(list.get(i));
                ++i;
            }
            return n;
        }
        final x x = (x)list;
        if (size <= 0) {
            return 0;
        }
        throw null;
    }
    
    public static int s(int p3, final List list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        final int t = t(list);
        p3 = j.P(p3);
        if (b) {
            return p3 + j.y(t);
        }
        return t + size * p3;
    }
    
    public static int t(final List list) {
        final int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof F)) {
            int n = 0;
            while (i < size) {
                n += j.M(list.get(i));
                ++i;
            }
            return n;
        }
        final F f = (F)list;
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
        final int n4 = n = j.P(n) * size;
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
                if (n7 instanceof g) {
                    n8 = j.g((g)n7);
                }
                else {
                    n8 = j.O((String)n7);
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
                final g value = list.get(n2);
                int n9;
                if (value instanceof g) {
                    n9 = j.g(value);
                }
                else {
                    n9 = j.O((String)value);
                }
                n += n9;
                ++n2;
            }
        }
        return n6;
    }
    
    public static int v(int p3, final List list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        final int w = w(list);
        p3 = j.P(p3);
        if (b) {
            return p3 + j.y(w);
        }
        return w + size * p3;
    }
    
    public static int w(final List list) {
        final int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof x)) {
            int n = 0;
            while (i < size) {
                n += j.R(list.get(i));
                ++i;
            }
            return n;
        }
        final x x = (x)list;
        if (size <= 0) {
            return 0;
        }
        throw null;
    }
    
    public static int x(int p3, final List list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        final int y = y(list);
        p3 = j.P(p3);
        if (b) {
            return p3 + j.y(y);
        }
        return y + size * p3;
    }
    
    public static int y(final List list) {
        final int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof F)) {
            int n = 0;
            while (i < size) {
                n += j.T(list.get(i));
                ++i;
            }
            return n;
        }
        final F f = (F)list;
        if (size <= 0) {
            return 0;
        }
        throw null;
    }
    
    public static Object z(final int n, final List list, final y.a a, Object o, final l0 l0) {
        if (a == null) {
            return o;
        }
        Object o2;
        if (list instanceof RandomAccess) {
            final int size = list.size();
            int i = 0;
            int n2 = 0;
            while (i < size) {
                final Integer n3 = list.get(i);
                final int intValue = n3;
                if (a.a(intValue)) {
                    if (i != n2) {
                        list.set(n2, n3);
                    }
                    ++n2;
                }
                else {
                    o = K(n, intValue, o, l0);
                }
                ++i;
            }
            o2 = o;
            if (n2 != size) {
                list.subList(n2, size).clear();
                return o;
            }
        }
        else {
            final Iterator<Integer> iterator = list.iterator();
            while (true) {
                o2 = o;
                if (!iterator.hasNext()) {
                    break;
                }
                final int intValue2 = iterator.next();
                if (a.a(intValue2)) {
                    continue;
                }
                o = K(n, intValue2, o, l0);
                iterator.remove();
            }
        }
        return o2;
    }
}
