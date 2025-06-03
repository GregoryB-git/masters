package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.a5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0861a5 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f10828a = E();

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC1067x5 f10829b = A();

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC1067x5 f10830c = new C1084z5();

    public static AbstractC1067x5 A() {
        try {
            Class I6 = I();
            if (I6 == null) {
                return null;
            }
            return (AbstractC1067x5) I6.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void B(int i7, List list, T5 t52, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t52.u(i7, list, z7);
    }

    public static int C(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * J3.P(i7, 0L);
    }

    public static int D(List list) {
        return list.size() << 3;
    }

    public static Class E() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void F(int i7, List list, T5 t52, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t52.n(i7, list, z7);
    }

    public static int G(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return H(list) + (size * J3.s0(i7));
    }

    public static int H(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0878c4) {
            C0878c4 c0878c4 = (C0878c4) list;
            i7 = 0;
            while (i8 < size) {
                i7 += J3.g0(c0878c4.d(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += J3.g0(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static Class I() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void J(int i7, List list, T5 t52, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t52.b(i7, list, z7);
    }

    public static int K(int i7, List list, boolean z7) {
        if (list.size() == 0) {
            return 0;
        }
        return L(list) + (list.size() * J3.s0(i7));
    }

    public static int L(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1057w4) {
            C1057w4 c1057w4 = (C1057w4) list;
            i7 = 0;
            while (i8 < size) {
                i7 += J3.a0(c1057w4.l(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += J3.a0(((Long) list.get(i8)).longValue());
                i8++;
            }
        }
        return i7;
    }

    public static void M(int i7, List list, T5 t52, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t52.D(i7, list, z7);
    }

    public static int N(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return O(list) + (size * J3.s0(i7));
    }

    public static int O(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0878c4) {
            C0878c4 c0878c4 = (C0878c4) list;
            i7 = 0;
            while (i8 < size) {
                i7 += J3.o0(c0878c4.d(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += J3.o0(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static void P(int i7, List list, T5 t52, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t52.v(i7, list, z7);
    }

    public static int Q(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return R(list) + (size * J3.s0(i7));
    }

    public static int R(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1057w4) {
            C1057w4 c1057w4 = (C1057w4) list;
            i7 = 0;
            while (i8 < size) {
                i7 += J3.j0(c1057w4.l(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += J3.j0(((Long) list.get(i8)).longValue());
                i8++;
            }
        }
        return i7;
    }

    public static void S(int i7, List list, T5 t52, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t52.p(i7, list, z7);
    }

    public static int T(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return U(list) + (size * J3.s0(i7));
    }

    public static int U(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0878c4) {
            C0878c4 c0878c4 = (C0878c4) list;
            i7 = 0;
            while (i8 < size) {
                i7 += J3.v0(c0878c4.d(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += J3.v0(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static void V(int i7, List list, T5 t52, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t52.g(i7, list, z7);
    }

    public static int W(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return X(list) + (size * J3.s0(i7));
    }

    public static int X(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1057w4) {
            C1057w4 c1057w4 = (C1057w4) list;
            i7 = 0;
            while (i8 < size) {
                i7 += J3.n0(c1057w4.l(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += J3.n0(((Long) list.get(i8)).longValue());
                i8++;
            }
        }
        return i7;
    }

    public static void Y(int i7, List list, T5 t52, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t52.F(i7, list, z7);
    }

    public static void Z(int i7, List list, T5 t52, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t52.H(i7, list, z7);
    }

    public static int a(int i7, Object obj, Z4 z42) {
        return J3.R(i7, (I4) obj, z42);
    }

    public static void a0(int i7, List list, T5 t52, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t52.y(i7, list, z7);
    }

    public static int b(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int s02 = size * J3.s0(i7);
        for (int i8 = 0; i8 < list.size(); i8++) {
            s02 += J3.A((AbstractC1003q3) list.get(i8));
        }
        return s02;
    }

    public static void b0(int i7, List list, T5 t52, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t52.q(i7, list, z7);
    }

    public static int c(int i7, List list, Z4 z42) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += J3.x(i7, (I4) list.get(i9), z42);
        }
        return i8;
    }

    public static void c0(int i7, List list, T5 t52, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t52.i(i7, list, z7);
    }

    public static int d(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * J3.z(i7, true);
    }

    public static int e(List list) {
        return list.size();
    }

    public static AbstractC1067x5 f() {
        return f10829b;
    }

    public static Object g(Object obj, int i7, int i8, Object obj2, AbstractC1067x5 abstractC1067x5) {
        if (obj2 == null) {
            obj2 = abstractC1067x5.i(obj);
        }
        abstractC1067x5.f(obj2, i7, i8);
        return obj2;
    }

    public static Object h(Object obj, int i7, List list, InterfaceC0914g4 interfaceC0914g4, Object obj2, AbstractC1067x5 abstractC1067x5) {
        if (interfaceC0914g4 == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i8 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                Integer num = (Integer) list.get(i9);
                int intValue = num.intValue();
                if (interfaceC0914g4.e(intValue)) {
                    if (i9 != i8) {
                        list.set(i8, num);
                    }
                    i8++;
                } else {
                    obj2 = g(obj, i7, intValue, obj2, abstractC1067x5);
                }
            }
            if (i8 != size) {
                list.subList(i8, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!interfaceC0914g4.e(intValue2)) {
                    obj2 = g(obj, i7, intValue2, obj2, abstractC1067x5);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static void i(int i7, List list, T5 t52) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t52.J(i7, list);
    }

    public static void j(int i7, List list, T5 t52, Z4 z42) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t52.L(i7, list, z42);
    }

    public static void k(int i7, List list, T5 t52, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t52.m(i7, list, z7);
    }

    public static void l(O3 o32, Object obj, Object obj2) {
        S3 b7 = o32.b(obj2);
        if (b7.f10581a.isEmpty()) {
            return;
        }
        o32.e(obj).f(b7);
    }

    public static void m(F4 f42, Object obj, Object obj2, long j7) {
        D5.j(obj, j7, f42.d(D5.B(obj, j7), D5.B(obj2, j7)));
    }

    public static void n(AbstractC1067x5 abstractC1067x5, Object obj, Object obj2) {
        abstractC1067x5.j(obj, abstractC1067x5.b(abstractC1067x5.k(obj), abstractC1067x5.k(obj2)));
    }

    public static void o(Class cls) {
        Class cls2;
        if (!Y3.class.isAssignableFrom(cls) && (cls2 = f10828a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean p(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int q(int i7, List list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        int s02 = J3.s0(i7) * size;
        if (list instanceof InterfaceC0977n4) {
            InterfaceC0977n4 interfaceC0977n4 = (InterfaceC0977n4) list;
            while (i8 < size) {
                Object l7 = interfaceC0977n4.l(i8);
                s02 += l7 instanceof AbstractC1003q3 ? J3.A((AbstractC1003q3) l7) : J3.C((String) l7);
                i8++;
            }
        } else {
            while (i8 < size) {
                Object obj = list.get(i8);
                s02 += obj instanceof AbstractC1003q3 ? J3.A((AbstractC1003q3) obj) : J3.C((String) obj);
                i8++;
            }
        }
        return s02;
    }

    public static int r(int i7, List list, Z4 z42) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int s02 = J3.s0(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            s02 += J3.g((I4) list.get(i8), z42);
        }
        return s02;
    }

    public static int s(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return t(list) + (size * J3.s0(i7));
    }

    public static int t(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0878c4) {
            C0878c4 c0878c4 = (C0878c4) list;
            i7 = 0;
            while (i8 < size) {
                i7 += J3.X(c0878c4.d(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += J3.X(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static AbstractC1067x5 u() {
        return f10830c;
    }

    public static void v(int i7, List list, T5 t52) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t52.w(i7, list);
    }

    public static void w(int i7, List list, T5 t52, Z4 z42) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t52.z(i7, list, z42);
    }

    public static void x(int i7, List list, T5 t52, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t52.B(i7, list, z7);
    }

    public static int y(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * J3.h0(i7, 0);
    }

    public static int z(List list) {
        return list.size() << 2;
    }
}
