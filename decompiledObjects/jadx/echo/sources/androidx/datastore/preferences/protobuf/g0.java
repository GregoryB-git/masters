package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0777y;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f8960a = A();

    /* renamed from: b, reason: collision with root package name */
    public static final l0 f8961b = B(false);

    /* renamed from: c, reason: collision with root package name */
    public static final l0 f8962c = B(true);

    /* renamed from: d, reason: collision with root package name */
    public static final l0 f8963d = new n0();

    public static Class A() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static l0 B(boolean z7) {
        try {
            Class C7 = C();
            if (C7 == null) {
                return null;
            }
            return (l0) C7.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z7));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class C() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void D(AbstractC0769p abstractC0769p, Object obj, Object obj2) {
        C0771s c7 = abstractC0769p.c(obj2);
        if (c7.j()) {
            return;
        }
        abstractC0769p.d(obj).p(c7);
    }

    public static void E(J j7, Object obj, Object obj2, long j8) {
        p0.O(obj, j8, j7.a(p0.A(obj, j8), p0.A(obj2, j8)));
    }

    public static void F(l0 l0Var, Object obj, Object obj2) {
        l0Var.p(obj, l0Var.k(l0Var.g(obj), l0Var.g(obj2)));
    }

    public static l0 G() {
        return f8961b;
    }

    public static l0 H() {
        return f8962c;
    }

    public static void I(Class cls) {
        Class cls2;
        if (!AbstractC0775w.class.isAssignableFrom(cls) && (cls2 = f8960a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean J(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static Object K(int i7, int i8, Object obj, l0 l0Var) {
        if (obj == null) {
            obj = l0Var.n();
        }
        l0Var.e(obj, i7, i8);
        return obj;
    }

    public static l0 L() {
        return f8963d;
    }

    public static void M(int i7, List list, s0 s0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.r(i7, list, z7);
    }

    public static void N(int i7, List list, s0 s0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.I(i7, list);
    }

    public static void O(int i7, List list, s0 s0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.G(i7, list, z7);
    }

    public static void P(int i7, List list, s0 s0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.F(i7, list, z7);
    }

    public static void Q(int i7, List list, s0 s0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.p(i7, list, z7);
    }

    public static void R(int i7, List list, s0 s0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.j(i7, list, z7);
    }

    public static void S(int i7, List list, s0 s0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.b(i7, list, z7);
    }

    public static void T(int i7, List list, s0 s0Var, e0 e0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.M(i7, list, e0Var);
    }

    public static void U(int i7, List list, s0 s0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.a(i7, list, z7);
    }

    public static void V(int i7, List list, s0 s0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.E(i7, list, z7);
    }

    public static void W(int i7, List list, s0 s0Var, e0 e0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.L(i7, list, e0Var);
    }

    public static void X(int i7, List list, s0 s0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.k(i7, list, z7);
    }

    public static void Y(int i7, List list, s0 s0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.o(i7, list, z7);
    }

    public static void Z(int i7, List list, s0 s0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.B(i7, list, z7);
    }

    public static int a(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z7 ? AbstractC0763j.P(i7) + AbstractC0763j.y(size) : size * AbstractC0763j.c(i7, true);
    }

    public static void a0(int i7, List list, s0 s0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.t(i7, list, z7);
    }

    public static int b(List list) {
        return list.size();
    }

    public static void b0(int i7, List list, s0 s0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.y(i7, list);
    }

    public static int c(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int P6 = size * AbstractC0763j.P(i7);
        for (int i8 = 0; i8 < list.size(); i8++) {
            P6 += AbstractC0763j.g((AbstractC0760g) list.get(i8));
        }
        return P6;
    }

    public static void c0(int i7, List list, s0 s0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.s(i7, list, z7);
    }

    public static int d(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e7 = e(list);
        int P6 = AbstractC0763j.P(i7);
        return z7 ? P6 + AbstractC0763j.y(e7) : e7 + (size * P6);
    }

    public static void d0(int i7, List list, s0 s0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.q(i7, list, z7);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0776x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += AbstractC0763j.k(((Integer) list.get(i8)).intValue());
        }
        return i7;
    }

    public static int f(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z7 ? AbstractC0763j.P(i7) + AbstractC0763j.y(size * 4) : size * AbstractC0763j.l(i7, 0);
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z7 ? AbstractC0763j.P(i7) + AbstractC0763j.y(size * 8) : size * AbstractC0763j.n(i7, 0L);
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
            i8 += AbstractC0763j.r(i7, (O) list.get(i9), e0Var);
        }
        return i8;
    }

    public static int k(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l7 = l(list);
        int P6 = AbstractC0763j.P(i7);
        return z7 ? P6 + AbstractC0763j.y(l7) : l7 + (size * P6);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0776x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += AbstractC0763j.v(((Integer) list.get(i8)).intValue());
        }
        return i7;
    }

    public static int m(int i7, List list, boolean z7) {
        if (list.size() == 0) {
            return 0;
        }
        int n7 = n(list);
        return z7 ? AbstractC0763j.P(i7) + AbstractC0763j.y(n7) : n7 + (list.size() * AbstractC0763j.P(i7));
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof F) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += AbstractC0763j.x(((Long) list.get(i8)).longValue());
        }
        return i7;
    }

    public static int o(int i7, Object obj, e0 e0Var) {
        return AbstractC0763j.z(i7, (O) obj, e0Var);
    }

    public static int p(int i7, List list, e0 e0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int P6 = AbstractC0763j.P(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            P6 += AbstractC0763j.B((O) list.get(i8), e0Var);
        }
        return P6;
    }

    public static int q(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r7 = r(list);
        int P6 = AbstractC0763j.P(i7);
        return z7 ? P6 + AbstractC0763j.y(r7) : r7 + (size * P6);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0776x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += AbstractC0763j.K(((Integer) list.get(i8)).intValue());
        }
        return i7;
    }

    public static int s(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t7 = t(list);
        int P6 = AbstractC0763j.P(i7);
        return z7 ? P6 + AbstractC0763j.y(t7) : t7 + (size * P6);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof F) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += AbstractC0763j.M(((Long) list.get(i8)).longValue());
        }
        return i7;
    }

    public static int u(int i7, List list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        int P6 = AbstractC0763j.P(i7) * size;
        if (list instanceof D) {
            D d7 = (D) list;
            while (i8 < size) {
                Object n7 = d7.n(i8);
                P6 += n7 instanceof AbstractC0760g ? AbstractC0763j.g((AbstractC0760g) n7) : AbstractC0763j.O((String) n7);
                i8++;
            }
        } else {
            while (i8 < size) {
                Object obj = list.get(i8);
                P6 += obj instanceof AbstractC0760g ? AbstractC0763j.g((AbstractC0760g) obj) : AbstractC0763j.O((String) obj);
                i8++;
            }
        }
        return P6;
    }

    public static int v(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w7 = w(list);
        int P6 = AbstractC0763j.P(i7);
        return z7 ? P6 + AbstractC0763j.y(w7) : w7 + (size * P6);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0776x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += AbstractC0763j.R(((Integer) list.get(i8)).intValue());
        }
        return i7;
    }

    public static int x(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y7 = y(list);
        int P6 = AbstractC0763j.P(i7);
        return z7 ? P6 + AbstractC0763j.y(y7) : y7 + (size * P6);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof F) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += AbstractC0763j.T(((Long) list.get(i8)).longValue());
        }
        return i7;
    }

    public static Object z(int i7, List list, AbstractC0777y.a aVar, Object obj, l0 l0Var) {
        if (aVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i8 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                Integer num = (Integer) list.get(i9);
                int intValue = num.intValue();
                if (aVar.a(intValue)) {
                    if (i9 != i8) {
                        list.set(i8, num);
                    }
                    i8++;
                } else {
                    obj = K(i7, intValue, obj, l0Var);
                }
            }
            if (i8 != size) {
                list.subList(i8, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!aVar.a(intValue2)) {
                    obj = K(i7, intValue2, obj, l0Var);
                    it.remove();
                }
            }
        }
        return obj;
    }
}
