/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
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
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D5;
import com.google.android.gms.internal.measurement.F4;
import com.google.android.gms.internal.measurement.I4;
import com.google.android.gms.internal.measurement.J3;
import com.google.android.gms.internal.measurement.O3;
import com.google.android.gms.internal.measurement.S3;
import com.google.android.gms.internal.measurement.T5;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.Z4;
import com.google.android.gms.internal.measurement.c4;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.n4;
import com.google.android.gms.internal.measurement.q3;
import com.google.android.gms.internal.measurement.w4;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.z5;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public abstract class a5 {
    public static final Class a = a5.E();
    public static final x5 b = a5.A();
    public static final x5 c = new z5();

    public static x5 A() {
        Object object;
        block3 : {
            try {
                object = a5.I();
                if (object != null) break block3;
                return null;
            }
            catch (Throwable throwable) {
                return null;
            }
        }
        object = (x5)object.getConstructor(new Class[0]).newInstance(new Object[0]);
        return object;
    }

    public static void B(int n8, List list, T5 t52, boolean bl) {
        if (list != null && !list.isEmpty()) {
            t52.u(n8, list, bl);
        }
    }

    public static int C(int n8, List list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        return n9 * J3.P(n8, 0L);
    }

    public static int D(List list) {
        return list.size() << 3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Class E() {
        try {
            return Class.forName((String)"com.google.protobuf.GeneratedMessage");
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static void F(int n8, List list, T5 t52, boolean bl) {
        if (list != null && !list.isEmpty()) {
            t52.n(n8, list, bl);
        }
    }

    public static int G(int n8, List list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        return a5.H(list) + n9 * J3.s0(n8);
    }

    public static int H(List list) {
        int n8 = list.size();
        int n9 = 0;
        int n10 = 0;
        if (n8 == 0) {
            return 0;
        }
        if (list instanceof c4) {
            list = (c4)list;
            int n11 = 0;
            do {
                n9 = n11;
                if (n10 < n8) {
                    n11 += J3.g0(list.d(n10));
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
                n12 += J3.g0((Integer)list.get(n10));
                ++n10;
            } while (true);
        }
        return n9;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Class I() {
        try {
            return Class.forName((String)"com.google.protobuf.UnknownFieldSetSchema");
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static void J(int n8, List list, T5 t52, boolean bl) {
        if (list != null && !list.isEmpty()) {
            t52.b(n8, list, bl);
        }
    }

    public static int K(int n8, List list, boolean bl) {
        if (list.size() == 0) {
            return 0;
        }
        return a5.L(list) + list.size() * J3.s0(n8);
    }

    public static int L(List list) {
        int n8 = list.size();
        int n9 = 0;
        int n10 = 0;
        if (n8 == 0) {
            return 0;
        }
        if (list instanceof w4) {
            list = (w4)list;
            int n11 = 0;
            do {
                n9 = n11;
                if (n10 < n8) {
                    n11 += J3.a0(list.l(n10));
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
                n12 += J3.a0((Long)list.get(n10));
                ++n10;
            } while (true);
        }
        return n9;
    }

    public static void M(int n8, List list, T5 t52, boolean bl) {
        if (list != null && !list.isEmpty()) {
            t52.D(n8, list, bl);
        }
    }

    public static int N(int n8, List list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        return a5.O(list) + n9 * J3.s0(n8);
    }

    public static int O(List list) {
        int n8 = list.size();
        int n9 = 0;
        int n10 = 0;
        if (n8 == 0) {
            return 0;
        }
        if (list instanceof c4) {
            list = (c4)list;
            int n11 = 0;
            do {
                n9 = n11;
                if (n10 < n8) {
                    n11 += J3.o0(list.d(n10));
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
                n12 += J3.o0((Integer)list.get(n10));
                ++n10;
            } while (true);
        }
        return n9;
    }

    public static void P(int n8, List list, T5 t52, boolean bl) {
        if (list != null && !list.isEmpty()) {
            t52.v(n8, list, bl);
        }
    }

    public static int Q(int n8, List list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        return a5.R(list) + n9 * J3.s0(n8);
    }

    public static int R(List list) {
        int n8 = list.size();
        int n9 = 0;
        int n10 = 0;
        if (n8 == 0) {
            return 0;
        }
        if (list instanceof w4) {
            list = (w4)list;
            int n11 = 0;
            do {
                n9 = n11;
                if (n10 < n8) {
                    n11 += J3.j0(list.l(n10));
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
                n12 += J3.j0((Long)list.get(n10));
                ++n10;
            } while (true);
        }
        return n9;
    }

    public static void S(int n8, List list, T5 t52, boolean bl) {
        if (list != null && !list.isEmpty()) {
            t52.p(n8, list, bl);
        }
    }

    public static int T(int n8, List list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        return a5.U(list) + n9 * J3.s0(n8);
    }

    public static int U(List list) {
        int n8 = list.size();
        int n9 = 0;
        int n10 = 0;
        if (n8 == 0) {
            return 0;
        }
        if (list instanceof c4) {
            list = (c4)list;
            int n11 = 0;
            do {
                n9 = n11;
                if (n10 < n8) {
                    n11 += J3.v0(list.d(n10));
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
                n12 += J3.v0((Integer)list.get(n10));
                ++n10;
            } while (true);
        }
        return n9;
    }

    public static void V(int n8, List list, T5 t52, boolean bl) {
        if (list != null && !list.isEmpty()) {
            t52.g(n8, list, bl);
        }
    }

    public static int W(int n8, List list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        return a5.X(list) + n9 * J3.s0(n8);
    }

    public static int X(List list) {
        int n8 = list.size();
        int n9 = 0;
        int n10 = 0;
        if (n8 == 0) {
            return 0;
        }
        if (list instanceof w4) {
            list = (w4)list;
            int n11 = 0;
            do {
                n9 = n11;
                if (n10 < n8) {
                    n11 += J3.n0(list.l(n10));
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
                n12 += J3.n0((Long)list.get(n10));
                ++n10;
            } while (true);
        }
        return n9;
    }

    public static void Y(int n8, List list, T5 t52, boolean bl) {
        if (list != null && !list.isEmpty()) {
            t52.F(n8, list, bl);
        }
    }

    public static void Z(int n8, List list, T5 t52, boolean bl) {
        if (list != null && !list.isEmpty()) {
            t52.H(n8, list, bl);
        }
    }

    public static int a(int n8, Object object, Z4 z42) {
        return J3.R(n8, (I4)object, z42);
    }

    public static void a0(int n8, List list, T5 t52, boolean bl) {
        if (list != null && !list.isEmpty()) {
            t52.y(n8, list, bl);
        }
    }

    public static int b(int n8, List list) {
        int n9 = list.size();
        int n10 = 0;
        if (n9 == 0) {
            return 0;
        }
        n8 = n10;
        n10 = n9 *= J3.s0(n8);
        while (n8 < list.size()) {
            n10 += J3.A((q3)list.get(n8));
            ++n8;
        }
        return n10;
    }

    public static void b0(int n8, List list, T5 t52, boolean bl) {
        if (list != null && !list.isEmpty()) {
            t52.q(n8, list, bl);
        }
    }

    public static int c(int n8, List list, Z4 z42) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        int n10 = 0;
        for (int i8 = 0; i8 < n9; ++i8) {
            n10 += J3.x(n8, (I4)list.get(i8), z42);
        }
        return n10;
    }

    public static void c0(int n8, List list, T5 t52, boolean bl) {
        if (list != null && !list.isEmpty()) {
            t52.i(n8, list, bl);
        }
    }

    public static int d(int n8, List list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        return n9 * J3.z(n8, true);
    }

    public static int e(List list) {
        return list.size();
    }

    public static x5 f() {
        return b;
    }

    public static Object g(Object object, int n8, int n9, Object object2, x5 x52) {
        Object object3 = object2;
        if (object2 == null) {
            object3 = x52.i(object);
        }
        x52.f(object3, n8, n9);
        return object3;
    }

    public static Object h(Object object, int n8, List list, g4 g42, Object object2, x5 x52) {
        Object object3;
        if (g42 == null) {
            return object2;
        }
        if (list instanceof RandomAccess) {
            int n9 = list.size();
            int n10 = 0;
            for (int i8 = 0; i8 < n9; ++i8) {
                object3 = (Integer)list.get(i8);
                int n11 = object3.intValue();
                if (g42.e(n11)) {
                    if (i8 != n10) {
                        list.set(n10, object3);
                    }
                    ++n10;
                    continue;
                }
                object2 = a5.g(object, n8, n11, object2, x52);
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
                if (g42.e(n12)) continue;
                object2 = a5.g(object, n8, n12, object2, x52);
                list.remove();
            } while (true);
        }
        return object3;
    }

    public static void i(int n8, List list, T5 t52) {
        if (list != null && !list.isEmpty()) {
            t52.J(n8, list);
        }
    }

    public static void j(int n8, List list, T5 t52, Z4 z42) {
        if (list != null && !list.isEmpty()) {
            t52.L(n8, list, z42);
        }
    }

    public static void k(int n8, List list, T5 t52, boolean bl) {
        if (list != null && !list.isEmpty()) {
            t52.m(n8, list, bl);
        }
    }

    public static void l(O3 o32, Object object, Object object2) {
        object2 = o32.b(object2);
        if (!object2.a.isEmpty()) {
            o32.e(object).f((S3)object2);
        }
    }

    public static void m(F4 f42, Object object, Object object2, long l8) {
        D5.j(object, l8, f42.d(D5.B(object, l8), D5.B(object2, l8)));
    }

    public static void n(x5 x52, Object object, Object object2) {
        x52.j(object, x52.b(x52.k(object), x52.k(object2)));
    }

    public static void o(Class class_) {
        Class class_2;
        if (!Y3.class.isAssignableFrom(class_) && (class_2 = a) != null) {
            if (class_2.isAssignableFrom(class_)) {
                return;
            }
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean p(Object object, Object object2) {
        if (!(object == object2 || object != null && object.equals(object2))) {
            return false;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int q(int n8, List list) {
        int n9;
        int n10 = list.size();
        int n11 = 0;
        int n12 = 0;
        if (n10 == 0) {
            return 0;
        }
        n8 = n9 = J3.s0(n8) * n10;
        if (list instanceof n4) {
            list = (n4)list;
            n8 = n9;
            n11 = n12;
            do {
                n9 = n8;
                if (n11 >= n10) return n9;
                {
                    Object object = list.l(n11);
                    n9 = object instanceof q3 ? J3.A((q3)object) : J3.C((String)object);
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
                n9 = object instanceof q3 ? J3.A((q3)object) : J3.C((String)object);
                n8 += n9;
                ++n11;
            } while (true);
        }
    }

    public static int r(int n8, List list, Z4 z42) {
        int n9 = list.size();
        int n10 = 0;
        if (n9 == 0) {
            return 0;
        }
        int n11 = J3.s0(n8) * n9;
        for (n8 = n10; n8 < n9; ++n8) {
            n11 += J3.g((I4)list.get(n8), z42);
        }
        return n11;
    }

    public static int s(int n8, List list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        return a5.t(list) + n9 * J3.s0(n8);
    }

    public static int t(List list) {
        int n8 = list.size();
        int n9 = 0;
        int n10 = 0;
        if (n8 == 0) {
            return 0;
        }
        if (list instanceof c4) {
            list = (c4)list;
            int n11 = 0;
            do {
                n9 = n11;
                if (n10 < n8) {
                    n11 += J3.X(list.d(n10));
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
                n12 += J3.X((Integer)list.get(n10));
                ++n10;
            } while (true);
        }
        return n9;
    }

    public static x5 u() {
        return c;
    }

    public static void v(int n8, List list, T5 t52) {
        if (list != null && !list.isEmpty()) {
            t52.w(n8, list);
        }
    }

    public static void w(int n8, List list, T5 t52, Z4 z42) {
        if (list != null && !list.isEmpty()) {
            t52.z(n8, list, z42);
        }
    }

    public static void x(int n8, List list, T5 t52, boolean bl) {
        if (list != null && !list.isEmpty()) {
            t52.B(n8, list, bl);
        }
    }

    public static int y(int n8, List list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        return n9 * J3.h0(n8, 0);
    }

    public static int z(List list) {
        return list.size() << 2;
    }
}

