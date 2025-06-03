package com.google.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f12017a = z();

    /* renamed from: b, reason: collision with root package name */
    public static final g0 f12018b = A(false);

    /* renamed from: c, reason: collision with root package name */
    public static final g0 f12019c = A(true);

    /* renamed from: d, reason: collision with root package name */
    public static final g0 f12020d = new i0();

    public static g0 A(boolean z7) {
        try {
            Class B7 = B();
            if (B7 == null) {
                return null;
            }
            return (g0) B7.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z7));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class B() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void C(AbstractC1147l abstractC1147l, Object obj, Object obj2) {
        C1150o b7 = abstractC1147l.b(obj2);
        if (b7.j()) {
            return;
        }
        abstractC1147l.c(obj).p(b7);
    }

    public static void D(F f7, Object obj, Object obj2, long j7) {
        k0.R(obj, j7, f7.a(k0.C(obj, j7), k0.C(obj2, j7)));
    }

    public static void E(g0 g0Var, Object obj, Object obj2) {
        g0Var.f(obj, g0Var.e(g0Var.a(obj), g0Var.a(obj2)));
    }

    public static g0 F() {
        return f12018b;
    }

    public static g0 G() {
        return f12019c;
    }

    public static void H(Class cls) {
        Class cls2;
        if (!r.class.isAssignableFrom(cls) && (cls2 = f12017a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    public static boolean I(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static g0 J() {
        return f12020d;
    }

    public static void K(int i7, List list, n0 n0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.r(i7, list, z7);
    }

    public static void L(int i7, List list, n0 n0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.I(i7, list);
    }

    public static void M(int i7, List list, n0 n0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.G(i7, list, z7);
    }

    public static void N(int i7, List list, n0 n0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.F(i7, list, z7);
    }

    public static void O(int i7, List list, n0 n0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.p(i7, list, z7);
    }

    public static void P(int i7, List list, n0 n0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.j(i7, list, z7);
    }

    public static void Q(int i7, List list, n0 n0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.b(i7, list, z7);
    }

    public static void R(int i7, List list, n0 n0Var, Z z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.K(i7, list, z7);
    }

    public static void S(int i7, List list, n0 n0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.a(i7, list, z7);
    }

    public static void T(int i7, List list, n0 n0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.E(i7, list, z7);
    }

    public static void U(int i7, List list, n0 n0Var, Z z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.J(i7, list, z7);
    }

    public static void V(int i7, List list, n0 n0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.k(i7, list, z7);
    }

    public static void W(int i7, List list, n0 n0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.o(i7, list, z7);
    }

    public static void X(int i7, List list, n0 n0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.B(i7, list, z7);
    }

    public static void Y(int i7, List list, n0 n0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.t(i7, list, z7);
    }

    public static void Z(int i7, List list, n0 n0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.y(i7, list);
    }

    public static int a(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z7 ? AbstractC1143h.O(i7) + AbstractC1143h.z(size) : size * AbstractC1143h.d(i7, true);
    }

    public static void a0(int i7, List list, n0 n0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.s(i7, list, z7);
    }

    public static int b(List list) {
        return list.size();
    }

    public static void b0(int i7, List list, n0 n0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.q(i7, list, z7);
    }

    public static int c(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int O6 = size * AbstractC1143h.O(i7);
        for (int i8 = 0; i8 < list.size(); i8++) {
            O6 += AbstractC1143h.h((AbstractC1141f) list.get(i8));
        }
        return O6;
    }

    public static int d(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e7 = e(list);
        int O6 = AbstractC1143h.O(i7);
        return z7 ? O6 + AbstractC1143h.z(e7) : e7 + (size * O6);
    }

    public static int e(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1153s) {
            C1153s c1153s = (C1153s) list;
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC1143h.l(c1153s.F(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC1143h.l(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static int f(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z7 ? AbstractC1143h.O(i7) + AbstractC1143h.z(size * 4) : size * AbstractC1143h.m(i7, 0);
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z7 ? AbstractC1143h.O(i7) + AbstractC1143h.z(size * 8) : size * AbstractC1143h.o(i7, 0L);
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i7, List list, Z z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += AbstractC1143h.s(i7, (K) list.get(i9), z7);
        }
        return i8;
    }

    public static int k(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l7 = l(list);
        int O6 = AbstractC1143h.O(i7);
        return z7 ? O6 + AbstractC1143h.z(l7) : l7 + (size * O6);
    }

    public static int l(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1153s) {
            C1153s c1153s = (C1153s) list;
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC1143h.w(c1153s.F(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC1143h.w(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static int m(int i7, List list, boolean z7) {
        if (list.size() == 0) {
            return 0;
        }
        int n7 = n(list);
        return z7 ? AbstractC1143h.O(i7) + AbstractC1143h.z(n7) : n7 + (list.size() * AbstractC1143h.O(i7));
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof B) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += AbstractC1143h.y(((Long) list.get(i8)).longValue());
        }
        return i7;
    }

    public static int o(int i7, Object obj, Z z7) {
        return AbstractC1143h.A(i7, (K) obj, z7);
    }

    public static int p(int i7, List list, Z z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int O6 = AbstractC1143h.O(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            O6 += AbstractC1143h.C((K) list.get(i8), z7);
        }
        return O6;
    }

    public static int q(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r7 = r(list);
        int O6 = AbstractC1143h.O(i7);
        return z7 ? O6 + AbstractC1143h.z(r7) : r7 + (size * O6);
    }

    public static int r(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1153s) {
            C1153s c1153s = (C1153s) list;
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC1143h.J(c1153s.F(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC1143h.J(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static int s(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t7 = t(list);
        int O6 = AbstractC1143h.O(i7);
        return z7 ? O6 + AbstractC1143h.z(t7) : t7 + (size * O6);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof B) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += AbstractC1143h.L(((Long) list.get(i8)).longValue());
        }
        return i7;
    }

    public static int u(int i7, List list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        int O6 = AbstractC1143h.O(i7) * size;
        if (list instanceof InterfaceC1160z) {
            InterfaceC1160z interfaceC1160z = (InterfaceC1160z) list;
            while (i8 < size) {
                Object n7 = interfaceC1160z.n(i8);
                O6 += n7 instanceof AbstractC1141f ? AbstractC1143h.h((AbstractC1141f) n7) : AbstractC1143h.N((String) n7);
                i8++;
            }
        } else {
            while (i8 < size) {
                Object obj = list.get(i8);
                O6 += obj instanceof AbstractC1141f ? AbstractC1143h.h((AbstractC1141f) obj) : AbstractC1143h.N((String) obj);
                i8++;
            }
        }
        return O6;
    }

    public static int v(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w7 = w(list);
        int O6 = AbstractC1143h.O(i7);
        return z7 ? O6 + AbstractC1143h.z(w7) : w7 + (size * O6);
    }

    public static int w(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1153s) {
            C1153s c1153s = (C1153s) list;
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC1143h.Q(c1153s.F(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC1143h.Q(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static int x(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y7 = y(list);
        int O6 = AbstractC1143h.O(i7);
        return z7 ? O6 + AbstractC1143h.z(y7) : y7 + (size * O6);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof B) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += AbstractC1143h.S(((Long) list.get(i8)).longValue());
        }
        return i7;
    }

    public static Class z() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }
}
