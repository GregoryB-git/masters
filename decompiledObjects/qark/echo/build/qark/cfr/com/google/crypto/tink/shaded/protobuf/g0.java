/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Constructor
 *  java.util.Iterator
 *  java.util.List
 *  java.util.RandomAccess
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.D;
import com.google.crypto.tink.shaded.protobuf.F;
import com.google.crypto.tink.shaded.protobuf.J;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.e0;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.k;
import com.google.crypto.tink.shaded.protobuf.k0;
import com.google.crypto.tink.shaded.protobuf.m0;
import com.google.crypto.tink.shaded.protobuf.o0;
import com.google.crypto.tink.shaded.protobuf.q;
import com.google.crypto.tink.shaded.protobuf.r0;
import com.google.crypto.tink.shaded.protobuf.t;
import com.google.crypto.tink.shaded.protobuf.x;
import com.google.crypto.tink.shaded.protobuf.y;
import com.google.crypto.tink.shaded.protobuf.z;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public abstract class g0 {
    public static final Class a = g0.A();
    public static final k0 b = g0.B(false);
    public static final k0 c = g0.B(true);
    public static final k0 d = new m0();

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Class A() {
        try {
            return Class.forName((String)"com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static k0 B(boolean bl) {
        Object object;
        block3 : {
            try {
                object = g0.C();
                if (object != null) break block3;
                return null;
            }
            catch (Throwable throwable) {
                return null;
            }
        }
        object = (k0)object.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{bl});
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Class C() {
        try {
            return Class.forName((String)"com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static void D(q q8, Object object, Object object2) {
        if (!(object2 = q8.c(object2)).d()) {
            q8.d(object).h((t)object2);
        }
    }

    public static void E(J j8, Object object, Object object2, long l8) {
        o0.R(object, l8, j8.a(o0.C(object, l8), o0.C(object2, l8)));
    }

    public static void F(k0 k02, Object object, Object object2) {
        k02.p(object, k02.k(k02.g(object), k02.g(object2)));
    }

    public static k0 G() {
        return b;
    }

    public static k0 H() {
        return c;
    }

    public static void I(Class class_) {
        Class class_2;
        if (!x.class.isAssignableFrom(class_) && (class_2 = a) != null) {
            if (class_2.isAssignableFrom(class_)) {
                return;
            }
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    public static boolean J(Object object, Object object2) {
        if (!(object == object2 || object != null && object.equals(object2))) {
            return false;
        }
        return true;
    }

    public static Object K(Object object, int n8, int n9, Object object2, k0 k02) {
        Object object3 = object2;
        if (object2 == null) {
            object3 = k02.f(object);
        }
        k02.e(object3, n8, n9);
        return object3;
    }

    public static k0 L() {
        return d;
    }

    public static void M(int n8, List list, r0 r02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            r02.r(n8, list, bl);
        }
    }

    public static void N(int n8, List list, r0 r02) {
        if (list != null && !list.isEmpty()) {
            r02.I(n8, list);
        }
    }

    public static void O(int n8, List list, r0 r02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            r02.G(n8, list, bl);
        }
    }

    public static void P(int n8, List list, r0 r02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            r02.F(n8, list, bl);
        }
    }

    public static void Q(int n8, List list, r0 r02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            r02.p(n8, list, bl);
        }
    }

    public static void R(int n8, List list, r0 r02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            r02.j(n8, list, bl);
        }
    }

    public static void S(int n8, List list, r0 r02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            r02.b(n8, list, bl);
        }
    }

    public static void T(int n8, List list, r0 r02, e0 e02) {
        if (list != null && !list.isEmpty()) {
            r02.J(n8, list, e02);
        }
    }

    public static void U(int n8, List list, r0 r02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            r02.a(n8, list, bl);
        }
    }

    public static void V(int n8, List list, r0 r02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            r02.E(n8, list, bl);
        }
    }

    public static void W(int n8, List list, r0 r02, e0 e02) {
        if (list != null && !list.isEmpty()) {
            r02.K(n8, list, e02);
        }
    }

    public static void X(int n8, List list, r0 r02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            r02.k(n8, list, bl);
        }
    }

    public static void Y(int n8, List list, r0 r02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            r02.o(n8, list, bl);
        }
    }

    public static void Z(int n8, List list, r0 r02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            r02.B(n8, list, bl);
        }
    }

    public static int a(int n8, List list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        if (bl) {
            return k.L(n8) + k.x(n9);
        }
        return n9 * k.d(n8, true);
    }

    public static void a0(int n8, List list, r0 r02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            r02.t(n8, list, bl);
        }
    }

    public static int b(List list) {
        return list.size();
    }

    public static void b0(int n8, List list, r0 r02) {
        if (list != null && !list.isEmpty()) {
            r02.y(n8, list);
        }
    }

    public static int c(int n8, List list) {
        int n9 = list.size();
        int n10 = 0;
        if (n9 == 0) {
            return 0;
        }
        n8 = n10;
        n10 = n9 *= k.L(n8);
        while (n8 < list.size()) {
            n10 += k.g((h)list.get(n8));
            ++n8;
        }
        return n10;
    }

    public static void c0(int n8, List list, r0 r02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            r02.s(n8, list, bl);
        }
    }

    public static int d(int n8, List list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        int n10 = g0.e(list);
        n8 = k.L(n8);
        if (bl) {
            return n8 + k.x(n10);
        }
        return n10 + n9 * n8;
    }

    public static void d0(int n8, List list, r0 r02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            r02.q(n8, list, bl);
        }
    }

    public static int e(List list) {
        int n8 = list.size();
        int n9 = 0;
        int n10 = 0;
        if (n8 == 0) {
            return 0;
        }
        if (list instanceof y) {
            list = (y)list;
            int n11 = 0;
            do {
                n9 = n11;
                if (n10 < n8) {
                    n11 += k.k(list.F(n10));
                    ++n10;
                    continue;
                }
                break;
            } while (true);
        } else {
            int n12 = 0;
            n10 = n9;
            do {
                n9 = n12;
                if (n10 >= n8) break;
                n12 += k.k((Integer)list.get(n10));
                ++n10;
            } while (true);
        }
        return n9;
    }

    public static int f(int n8, List list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        if (bl) {
            return k.L(n8) + k.x(n9 * 4);
        }
        return n9 * k.l(n8, 0);
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int n8, List list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        if (bl) {
            return k.L(n8) + k.x(n9 * 8);
        }
        return n9 * k.n(n8, 0L);
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int n8, List list, e0 e02) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        int n10 = 0;
        for (int i8 = 0; i8 < n9; ++i8) {
            n10 += k.r(n8, (O)list.get(i8), e02);
        }
        return n10;
    }

    public static int k(int n8, List list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        int n10 = g0.l(list);
        n8 = k.L(n8);
        if (bl) {
            return n8 + k.x(n10);
        }
        return n10 + n9 * n8;
    }

    public static int l(List list) {
        int n8 = list.size();
        int n9 = 0;
        int n10 = 0;
        if (n8 == 0) {
            return 0;
        }
        if (list instanceof y) {
            list = (y)list;
            int n11 = 0;
            do {
                n9 = n11;
                if (n10 < n8) {
                    n11 += k.u(list.F(n10));
                    ++n10;
                    continue;
                }
                break;
            } while (true);
        } else {
            int n12 = 0;
            n10 = n9;
            do {
                n9 = n12;
                if (n10 >= n8) break;
                n12 += k.u((Integer)list.get(n10));
                ++n10;
            } while (true);
        }
        return n9;
    }

    public static int m(int n8, List list, boolean bl) {
        if (list.size() == 0) {
            return 0;
        }
        int n9 = g0.n(list);
        if (bl) {
            return k.L(n8) + k.x(n9);
        }
        return n9 + list.size() * k.L(n8);
    }

    public static int n(List list) {
        int n8 = list.size();
        int n9 = 0;
        int n10 = 0;
        if (n8 == 0) {
            return 0;
        }
        if (list instanceof F) {
            list = (F)list;
            int n11 = 0;
            do {
                n9 = n11;
                if (n10 < n8) {
                    n11 += k.w(list.f(n10));
                    ++n10;
                    continue;
                }
                break;
            } while (true);
        } else {
            int n12 = 0;
            n10 = n9;
            do {
                n9 = n12;
                if (n10 >= n8) break;
                n12 += k.w((Long)list.get(n10));
                ++n10;
            } while (true);
        }
        return n9;
    }

    public static int o(int n8, Object object, e0 e02) {
        return k.y(n8, (O)object, e02);
    }

    public static int p(int n8, List list, e0 e02) {
        int n9 = list.size();
        int n10 = 0;
        if (n9 == 0) {
            return 0;
        }
        int n11 = k.L(n8) * n9;
        for (n8 = n10; n8 < n9; ++n8) {
            n11 += k.z((O)list.get(n8), e02);
        }
        return n11;
    }

    public static int q(int n8, List list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        int n10 = g0.r(list);
        n8 = k.L(n8);
        if (bl) {
            return n8 + k.x(n10);
        }
        return n10 + n9 * n8;
    }

    public static int r(List list) {
        int n8 = list.size();
        int n9 = 0;
        int n10 = 0;
        if (n8 == 0) {
            return 0;
        }
        if (list instanceof y) {
            list = (y)list;
            int n11 = 0;
            do {
                n9 = n11;
                if (n10 < n8) {
                    n11 += k.G(list.F(n10));
                    ++n10;
                    continue;
                }
                break;
            } while (true);
        } else {
            int n12 = 0;
            n10 = n9;
            do {
                n9 = n12;
                if (n10 >= n8) break;
                n12 += k.G((Integer)list.get(n10));
                ++n10;
            } while (true);
        }
        return n9;
    }

    public static int s(int n8, List list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        int n10 = g0.t(list);
        n8 = k.L(n8);
        if (bl) {
            return n8 + k.x(n10);
        }
        return n10 + n9 * n8;
    }

    public static int t(List list) {
        int n8 = list.size();
        int n9 = 0;
        int n10 = 0;
        if (n8 == 0) {
            return 0;
        }
        if (list instanceof F) {
            list = (F)list;
            int n11 = 0;
            do {
                n9 = n11;
                if (n10 < n8) {
                    n11 += k.I(list.f(n10));
                    ++n10;
                    continue;
                }
                break;
            } while (true);
        } else {
            int n12 = 0;
            n10 = n9;
            do {
                n9 = n12;
                if (n10 >= n8) break;
                n12 += k.I((Long)list.get(n10));
                ++n10;
            } while (true);
        }
        return n9;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int u(int n8, List list) {
        int n9;
        int n10 = list.size();
        int n11 = 0;
        int n12 = 0;
        if (n10 == 0) {
            return 0;
        }
        n8 = n9 = k.L(n8) * n10;
        if (list instanceof D) {
            list = (D)list;
            n8 = n9;
            n11 = n12;
            do {
                n9 = n8;
                if (n11 >= n10) return n9;
                {
                    Object object = list.n(n11);
                    n9 = object instanceof h ? k.g((h)object) : k.K((String)object);
                    n8 += n9;
                    ++n11;
                    continue;
                }
                break;
            } while (true);
        } else {
            do {
                n9 = n8;
                if (n11 >= n10) return n9;
                Object object = list.get(n11);
                n9 = object instanceof h ? k.g((h)object) : k.K((String)object);
                n8 += n9;
                ++n11;
            } while (true);
        }
    }

    public static int v(int n8, List list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        int n10 = g0.w(list);
        n8 = k.L(n8);
        if (bl) {
            return n8 + k.x(n10);
        }
        return n10 + n9 * n8;
    }

    public static int w(List list) {
        int n8 = list.size();
        int n9 = 0;
        int n10 = 0;
        if (n8 == 0) {
            return 0;
        }
        if (list instanceof y) {
            list = (y)list;
            int n11 = 0;
            do {
                n9 = n11;
                if (n10 < n8) {
                    n11 += k.N(list.F(n10));
                    ++n10;
                    continue;
                }
                break;
            } while (true);
        } else {
            int n12 = 0;
            n10 = n9;
            do {
                n9 = n12;
                if (n10 >= n8) break;
                n12 += k.N((Integer)list.get(n10));
                ++n10;
            } while (true);
        }
        return n9;
    }

    public static int x(int n8, List list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        int n10 = g0.y(list);
        n8 = k.L(n8);
        if (bl) {
            return n8 + k.x(n10);
        }
        return n10 + n9 * n8;
    }

    public static int y(List list) {
        int n8 = list.size();
        int n9 = 0;
        int n10 = 0;
        if (n8 == 0) {
            return 0;
        }
        if (list instanceof F) {
            list = (F)list;
            int n11 = 0;
            do {
                n9 = n11;
                if (n10 < n8) {
                    n11 += k.P(list.f(n10));
                    ++n10;
                    continue;
                }
                break;
            } while (true);
        } else {
            int n12 = 0;
            n10 = n9;
            do {
                n9 = n12;
                if (n10 >= n8) break;
                n12 += k.P((Long)list.get(n10));
                ++n10;
            } while (true);
        }
        return n9;
    }

    public static Object z(Object object, int n8, List list, z.c c8, Object object2, k0 k02) {
        Object object3;
        if (c8 == null) {
            return object2;
        }
        if (list instanceof RandomAccess) {
            int n9 = list.size();
            int n10 = 0;
            for (int i8 = 0; i8 < n9; ++i8) {
                object3 = (Integer)list.get(i8);
                int n11 = object3.intValue();
                if (c8.a(n11)) {
                    if (i8 != n10) {
                        list.set(n10, object3);
                    }
                    ++n10;
                    continue;
                }
                object2 = g0.K(object, n8, n11, object2, k02);
            }
            object3 = object2;
            if (n10 != n9) {
                list.subList(n10, n9).clear();
                return object2;
            }
        } else {
            list = list.iterator();
            do {
                object3 = object2;
                if (!list.hasNext()) break;
                int n12 = (Integer)list.next();
                if (c8.a(n12)) continue;
                object2 = g0.K(object, n8, n12, object2, k02);
                list.remove();
            } while (true);
        }
        return object3;
    }
}

