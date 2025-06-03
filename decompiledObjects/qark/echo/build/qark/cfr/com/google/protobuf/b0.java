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
 *  java.util.List
 */
package com.google.protobuf;

import com.google.protobuf.B;
import com.google.protobuf.F;
import com.google.protobuf.K;
import com.google.protobuf.Z;
import com.google.protobuf.f;
import com.google.protobuf.g0;
import com.google.protobuf.h;
import com.google.protobuf.i0;
import com.google.protobuf.k0;
import com.google.protobuf.l;
import com.google.protobuf.n0;
import com.google.protobuf.o;
import com.google.protobuf.r;
import com.google.protobuf.s;
import com.google.protobuf.z;
import java.lang.reflect.Constructor;
import java.util.List;

public abstract class b0 {
    public static final Class a = b0.z();
    public static final g0 b = b0.A(false);
    public static final g0 c = b0.A(true);
    public static final g0 d = new i0();

    public static g0 A(boolean bl) {
        Object object;
        block3 : {
            try {
                object = b0.B();
                if (object != null) break block3;
                return null;
            }
            catch (Throwable throwable) {
                return null;
            }
        }
        object = (g0)object.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{bl});
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Class B() {
        try {
            return Class.forName((String)"com.google.protobuf.UnknownFieldSetSchema");
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static void C(l l8, Object object, Object object2) {
        if (!(object2 = l8.b(object2)).j()) {
            l8.c(object).p((o)object2);
        }
    }

    public static void D(F f8, Object object, Object object2, long l8) {
        k0.R(object, l8, f8.a(k0.C(object, l8), k0.C(object2, l8)));
    }

    public static void E(g0 g02, Object object, Object object2) {
        g02.f(object, g02.e(g02.a(object), g02.a(object2)));
    }

    public static g0 F() {
        return b;
    }

    public static g0 G() {
        return c;
    }

    public static void H(Class class_) {
        Class class_2;
        if (!r.class.isAssignableFrom(class_) && (class_2 = a) != null) {
            if (class_2.isAssignableFrom(class_)) {
                return;
            }
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    public static boolean I(Object object, Object object2) {
        if (!(object == object2 || object != null && object.equals(object2))) {
            return false;
        }
        return true;
    }

    public static g0 J() {
        return d;
    }

    public static void K(int n8, List list, n0 n02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            n02.r(n8, list, bl);
        }
    }

    public static void L(int n8, List list, n0 n02) {
        if (list != null && !list.isEmpty()) {
            n02.I(n8, list);
        }
    }

    public static void M(int n8, List list, n0 n02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            n02.G(n8, list, bl);
        }
    }

    public static void N(int n8, List list, n0 n02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            n02.F(n8, list, bl);
        }
    }

    public static void O(int n8, List list, n0 n02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            n02.p(n8, list, bl);
        }
    }

    public static void P(int n8, List list, n0 n02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            n02.j(n8, list, bl);
        }
    }

    public static void Q(int n8, List list, n0 n02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            n02.b(n8, list, bl);
        }
    }

    public static void R(int n8, List list, n0 n02, Z z8) {
        if (list != null && !list.isEmpty()) {
            n02.K(n8, list, z8);
        }
    }

    public static void S(int n8, List list, n0 n02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            n02.a(n8, list, bl);
        }
    }

    public static void T(int n8, List list, n0 n02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            n02.E(n8, list, bl);
        }
    }

    public static void U(int n8, List list, n0 n02, Z z8) {
        if (list != null && !list.isEmpty()) {
            n02.J(n8, list, z8);
        }
    }

    public static void V(int n8, List list, n0 n02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            n02.k(n8, list, bl);
        }
    }

    public static void W(int n8, List list, n0 n02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            n02.o(n8, list, bl);
        }
    }

    public static void X(int n8, List list, n0 n02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            n02.B(n8, list, bl);
        }
    }

    public static void Y(int n8, List list, n0 n02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            n02.t(n8, list, bl);
        }
    }

    public static void Z(int n8, List list, n0 n02) {
        if (list != null && !list.isEmpty()) {
            n02.y(n8, list);
        }
    }

    public static int a(int n8, List list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        if (bl) {
            return h.O(n8) + h.z(n9);
        }
        return n9 * h.d(n8, true);
    }

    public static void a0(int n8, List list, n0 n02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            n02.s(n8, list, bl);
        }
    }

    public static int b(List list) {
        return list.size();
    }

    public static void b0(int n8, List list, n0 n02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            n02.q(n8, list, bl);
        }
    }

    public static int c(int n8, List list) {
        int n9 = list.size();
        int n10 = 0;
        if (n9 == 0) {
            return 0;
        }
        n8 = n10;
        n10 = n9 *= h.O(n8);
        while (n8 < list.size()) {
            n10 += h.h((f)list.get(n8));
            ++n8;
        }
        return n10;
    }

    public static int d(int n8, List list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        int n10 = b0.e(list);
        n8 = h.O(n8);
        if (bl) {
            return n8 + h.z(n10);
        }
        return n10 + n9 * n8;
    }

    public static int e(List list) {
        int n8 = list.size();
        int n9 = 0;
        int n10 = 0;
        if (n8 == 0) {
            return 0;
        }
        if (list instanceof s) {
            list = (s)list;
            int n11 = 0;
            do {
                n9 = n11;
                if (n10 < n8) {
                    n11 += h.l(list.F(n10));
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
                n12 += h.l((Integer)list.get(n10));
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
            return h.O(n8) + h.z(n9 * 4);
        }
        return n9 * h.m(n8, 0);
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
            return h.O(n8) + h.z(n9 * 8);
        }
        return n9 * h.o(n8, 0L);
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int n8, List list, Z z8) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        int n10 = 0;
        for (int i8 = 0; i8 < n9; ++i8) {
            n10 += h.s(n8, (K)list.get(i8), z8);
        }
        return n10;
    }

    public static int k(int n8, List list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        int n10 = b0.l(list);
        n8 = h.O(n8);
        if (bl) {
            return n8 + h.z(n10);
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
        if (list instanceof s) {
            list = (s)list;
            int n11 = 0;
            do {
                n9 = n11;
                if (n10 < n8) {
                    n11 += h.w(list.F(n10));
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
                n12 += h.w((Integer)list.get(n10));
                ++n10;
            } while (true);
        }
        return n9;
    }

    public static int m(int n8, List list, boolean bl) {
        if (list.size() == 0) {
            return 0;
        }
        int n9 = b0.n(list);
        if (bl) {
            return h.O(n8) + h.z(n9);
        }
        return n9 + list.size() * h.O(n8);
    }

    public static int n(List list) {
        int n8 = list.size();
        if (n8 == 0) {
            return 0;
        }
        if (list instanceof B) {
            list = (B)list;
            if (n8 <= 0) {
                return 0;
            }
            throw null;
        }
        int n9 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            n9 += h.y((Long)list.get(i8));
        }
        return n9;
    }

    public static int o(int n8, Object object, Z z8) {
        return h.A(n8, (K)object, z8);
    }

    public static int p(int n8, List list, Z z8) {
        int n9 = list.size();
        int n10 = 0;
        if (n9 == 0) {
            return 0;
        }
        int n11 = h.O(n8) * n9;
        for (n8 = n10; n8 < n9; ++n8) {
            n11 += h.C((K)list.get(n8), z8);
        }
        return n11;
    }

    public static int q(int n8, List list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        int n10 = b0.r(list);
        n8 = h.O(n8);
        if (bl) {
            return n8 + h.z(n10);
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
        if (list instanceof s) {
            list = (s)list;
            int n11 = 0;
            do {
                n9 = n11;
                if (n10 < n8) {
                    n11 += h.J(list.F(n10));
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
                n12 += h.J((Integer)list.get(n10));
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
        int n10 = b0.t(list);
        n8 = h.O(n8);
        if (bl) {
            return n8 + h.z(n10);
        }
        return n10 + n9 * n8;
    }

    public static int t(List list) {
        int n8 = list.size();
        if (n8 == 0) {
            return 0;
        }
        if (list instanceof B) {
            list = (B)list;
            if (n8 <= 0) {
                return 0;
            }
            throw null;
        }
        int n9 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            n9 += h.L((Long)list.get(i8));
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
        n8 = n9 = h.O(n8) * n10;
        if (list instanceof z) {
            list = (z)list;
            n8 = n9;
            n11 = n12;
            do {
                n9 = n8;
                if (n11 >= n10) return n9;
                {
                    Object object = list.n(n11);
                    n9 = object instanceof f ? h.h((f)object) : h.N((String)object);
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
                n9 = object instanceof f ? h.h((f)object) : h.N((String)object);
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
        int n10 = b0.w(list);
        n8 = h.O(n8);
        if (bl) {
            return n8 + h.z(n10);
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
        if (list instanceof s) {
            list = (s)list;
            int n11 = 0;
            do {
                n9 = n11;
                if (n10 < n8) {
                    n11 += h.Q(list.F(n10));
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
                n12 += h.Q((Integer)list.get(n10));
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
        int n10 = b0.y(list);
        n8 = h.O(n8);
        if (bl) {
            return n8 + h.z(n10);
        }
        return n10 + n9 * n8;
    }

    public static int y(List list) {
        int n8 = list.size();
        if (n8 == 0) {
            return 0;
        }
        if (list instanceof B) {
            list = (B)list;
            if (n8 <= 0) {
                return 0;
            }
            throw null;
        }
        int n9 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            n9 += h.S((Long)list.get(i8));
        }
        return n9;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Class z() {
        try {
            return Class.forName((String)"com.google.protobuf.GeneratedMessageV3");
        }
        catch (Throwable throwable) {
            return null;
        }
    }
}

