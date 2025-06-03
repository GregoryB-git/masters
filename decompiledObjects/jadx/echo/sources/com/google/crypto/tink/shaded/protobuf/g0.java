package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC1110z;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f11333a = A();

    /* renamed from: b, reason: collision with root package name */
    public static final k0 f11334b = B(false);

    /* renamed from: c, reason: collision with root package name */
    public static final k0 f11335c = B(true);

    /* renamed from: d, reason: collision with root package name */
    public static final k0 f11336d = new m0();

    public static Class A() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static k0 B(boolean z7) {
        try {
            Class C7 = C();
            if (C7 == null) {
                return null;
            }
            return (k0) C7.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z7));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class C() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void D(AbstractC1102q abstractC1102q, Object obj, Object obj2) {
        AbstractC1104t c7 = abstractC1102q.c(obj2);
        if (c7.d()) {
            return;
        }
        abstractC1102q.d(obj).h(c7);
    }

    public static void E(J j7, Object obj, Object obj2, long j8) {
        o0.R(obj, j8, j7.a(o0.C(obj, j8), o0.C(obj2, j8)));
    }

    public static void F(k0 k0Var, Object obj, Object obj2) {
        k0Var.p(obj, k0Var.k(k0Var.g(obj), k0Var.g(obj2)));
    }

    public static k0 G() {
        return f11334b;
    }

    public static k0 H() {
        return f11335c;
    }

    public static void I(Class cls) {
        Class cls2;
        if (!AbstractC1108x.class.isAssignableFrom(cls) && (cls2 = f11333a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    public static boolean J(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static Object K(Object obj, int i7, int i8, Object obj2, k0 k0Var) {
        if (obj2 == null) {
            obj2 = k0Var.f(obj);
        }
        k0Var.e(obj2, i7, i8);
        return obj2;
    }

    public static k0 L() {
        return f11336d;
    }

    public static void M(int i7, List list, r0 r0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.r(i7, list, z7);
    }

    public static void N(int i7, List list, r0 r0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.I(i7, list);
    }

    public static void O(int i7, List list, r0 r0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.G(i7, list, z7);
    }

    public static void P(int i7, List list, r0 r0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.F(i7, list, z7);
    }

    public static void Q(int i7, List list, r0 r0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.p(i7, list, z7);
    }

    public static void R(int i7, List list, r0 r0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.j(i7, list, z7);
    }

    public static void S(int i7, List list, r0 r0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.b(i7, list, z7);
    }

    public static void T(int i7, List list, r0 r0Var, e0 e0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.J(i7, list, e0Var);
    }

    public static void U(int i7, List list, r0 r0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.a(i7, list, z7);
    }

    public static void V(int i7, List list, r0 r0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.E(i7, list, z7);
    }

    public static void W(int i7, List list, r0 r0Var, e0 e0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.K(i7, list, e0Var);
    }

    public static void X(int i7, List list, r0 r0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.k(i7, list, z7);
    }

    public static void Y(int i7, List list, r0 r0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.o(i7, list, z7);
    }

    public static void Z(int i7, List list, r0 r0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.B(i7, list, z7);
    }

    public static int a(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z7 ? AbstractC1096k.L(i7) + AbstractC1096k.x(size) : size * AbstractC1096k.d(i7, true);
    }

    public static void a0(int i7, List list, r0 r0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.t(i7, list, z7);
    }

    public static int b(List list) {
        return list.size();
    }

    public static void b0(int i7, List list, r0 r0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.y(i7, list);
    }

    public static int c(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int L6 = size * AbstractC1096k.L(i7);
        for (int i8 = 0; i8 < list.size(); i8++) {
            L6 += AbstractC1096k.g((AbstractC1093h) list.get(i8));
        }
        return L6;
    }

    public static void c0(int i7, List list, r0 r0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.s(i7, list, z7);
    }

    public static int d(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e7 = e(list);
        int L6 = AbstractC1096k.L(i7);
        return z7 ? L6 + AbstractC1096k.x(e7) : e7 + (size * L6);
    }

    public static void d0(int i7, List list, r0 r0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.q(i7, list, z7);
    }

    public static int e(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1109y) {
            AbstractC1109y abstractC1109y = (AbstractC1109y) list;
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC1096k.k(abstractC1109y.F(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC1096k.k(((Integer) list.get(i8)).intValue());
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
        return z7 ? AbstractC1096k.L(i7) + AbstractC1096k.x(size * 4) : size * AbstractC1096k.l(i7, 0);
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z7 ? AbstractC1096k.L(i7) + AbstractC1096k.x(size * 8) : size * AbstractC1096k.n(i7, 0L);
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i7, List list, e0 e0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += AbstractC1096k.r(i7, (O) list.get(i9), e0Var);
        }
        return i8;
    }

    public static int k(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l7 = l(list);
        int L6 = AbstractC1096k.L(i7);
        return z7 ? L6 + AbstractC1096k.x(l7) : l7 + (size * L6);
    }

    public static int l(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1109y) {
            AbstractC1109y abstractC1109y = (AbstractC1109y) list;
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC1096k.u(abstractC1109y.F(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC1096k.u(((Integer) list.get(i8)).intValue());
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
        return z7 ? AbstractC1096k.L(i7) + AbstractC1096k.x(n7) : n7 + (list.size() * AbstractC1096k.L(i7));
    }

    public static int n(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof F) {
            F f7 = (F) list;
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC1096k.w(f7.f(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC1096k.w(((Long) list.get(i8)).longValue());
                i8++;
            }
        }
        return i7;
    }

    public static int o(int i7, Object obj, e0 e0Var) {
        return AbstractC1096k.y(i7, (O) obj, e0Var);
    }

    public static int p(int i7, List list, e0 e0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int L6 = AbstractC1096k.L(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            L6 += AbstractC1096k.z((O) list.get(i8), e0Var);
        }
        return L6;
    }

    public static int q(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r7 = r(list);
        int L6 = AbstractC1096k.L(i7);
        return z7 ? L6 + AbstractC1096k.x(r7) : r7 + (size * L6);
    }

    public static int r(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1109y) {
            AbstractC1109y abstractC1109y = (AbstractC1109y) list;
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC1096k.G(abstractC1109y.F(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC1096k.G(((Integer) list.get(i8)).intValue());
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
        int L6 = AbstractC1096k.L(i7);
        return z7 ? L6 + AbstractC1096k.x(t7) : t7 + (size * L6);
    }

    public static int t(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof F) {
            F f7 = (F) list;
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC1096k.I(f7.f(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC1096k.I(((Long) list.get(i8)).longValue());
                i8++;
            }
        }
        return i7;
    }

    public static int u(int i7, List list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        int L6 = AbstractC1096k.L(i7) * size;
        if (list instanceof D) {
            D d7 = (D) list;
            while (i8 < size) {
                Object n7 = d7.n(i8);
                L6 += n7 instanceof AbstractC1093h ? AbstractC1096k.g((AbstractC1093h) n7) : AbstractC1096k.K((String) n7);
                i8++;
            }
        } else {
            while (i8 < size) {
                Object obj = list.get(i8);
                L6 += obj instanceof AbstractC1093h ? AbstractC1096k.g((AbstractC1093h) obj) : AbstractC1096k.K((String) obj);
                i8++;
            }
        }
        return L6;
    }

    public static int v(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w7 = w(list);
        int L6 = AbstractC1096k.L(i7);
        return z7 ? L6 + AbstractC1096k.x(w7) : w7 + (size * L6);
    }

    public static int w(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1109y) {
            AbstractC1109y abstractC1109y = (AbstractC1109y) list;
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC1096k.N(abstractC1109y.F(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC1096k.N(((Integer) list.get(i8)).intValue());
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
        int L6 = AbstractC1096k.L(i7);
        return z7 ? L6 + AbstractC1096k.x(y7) : y7 + (size * L6);
    }

    public static int y(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof F) {
            F f7 = (F) list;
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC1096k.P(f7.f(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC1096k.P(((Long) list.get(i8)).longValue());
                i8++;
            }
        }
        return i7;
    }

    public static Object z(Object obj, int i7, List list, AbstractC1110z.c cVar, Object obj2, k0 k0Var) {
        if (cVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i8 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                Integer num = (Integer) list.get(i9);
                int intValue = num.intValue();
                if (cVar.a(intValue)) {
                    if (i9 != i8) {
                        list.set(i8, num);
                    }
                    i8++;
                } else {
                    obj2 = K(obj, i7, intValue, obj2, k0Var);
                }
            }
            if (i8 != size) {
                list.subList(i8, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!cVar.a(intValue2)) {
                    obj2 = K(obj, i7, intValue2, obj2, k0Var);
                    it.remove();
                }
            }
        }
        return obj2;
    }
}
