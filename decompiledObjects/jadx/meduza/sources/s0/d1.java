package s0;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import s0.r;

/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<?> f13952a;

    /* renamed from: b, reason: collision with root package name */
    public static final h1<?, ?> f13953b;

    /* renamed from: c, reason: collision with root package name */
    public static final h1<?, ?> f13954c;

    /* renamed from: d, reason: collision with root package name */
    public static final j1 f13955d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f13952a = cls;
        f13953b = z(false);
        f13954c = z(true);
        f13955d = new j1();
    }

    public static <T, FT extends r.a<FT>> void A(o<FT> oVar, T t, T t10) {
        r<FT> c10 = oVar.c(t10);
        if (c10.i()) {
            return;
        }
        r<FT> d10 = oVar.d(t);
        d10.getClass();
        for (int i10 = 0; i10 < c10.f14073a.e(); i10++) {
            d10.m(c10.f14073a.d(i10));
        }
        Iterator<Map.Entry<FT, Object>> it = c10.f14073a.f().iterator();
        while (it.hasNext()) {
            d10.m(it.next());
        }
    }

    public static boolean B(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <UT, UB> UB C(int i10, int i11, UB ub2, h1<UT, UB> h1Var) {
        if (ub2 == null) {
            ub2 = (UB) h1Var.m();
        }
        h1Var.e(ub2, i10, i11);
        return ub2;
    }

    public static void D(int i10, List list, k kVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            kVar.getClass();
            while (i11 < list.size()) {
                kVar.f14032a.U(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        kVar.f14032a.k0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).booleanValue();
            Logger logger = j.f14024c;
            i12++;
        }
        kVar.f14032a.m0(i12);
        while (i11 < list.size()) {
            kVar.f14032a.T(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    public static void E(int i10, List list, k kVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kVar.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            kVar.f14032a.W(i10, (g) list.get(i11));
        }
    }

    public static void F(int i10, List list, k kVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            kVar.getClass();
            while (i11 < list.size()) {
                j jVar = kVar.f14032a;
                double doubleValue = ((Double) list.get(i11)).doubleValue();
                jVar.getClass();
                jVar.a0(i10, Double.doubleToRawLongBits(doubleValue));
                i11++;
            }
            return;
        }
        kVar.f14032a.k0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).doubleValue();
            Logger logger = j.f14024c;
            i12 += 8;
        }
        kVar.f14032a.m0(i12);
        while (i11 < list.size()) {
            j jVar2 = kVar.f14032a;
            double doubleValue2 = ((Double) list.get(i11)).doubleValue();
            jVar2.getClass();
            jVar2.b0(Double.doubleToRawLongBits(doubleValue2));
            i11++;
        }
    }

    public static void G(int i10, List list, k kVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            kVar.getClass();
            while (i11 < list.size()) {
                kVar.f14032a.c0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        kVar.f14032a.k0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += j.E(((Integer) list.get(i13)).intValue());
        }
        kVar.f14032a.m0(i12);
        while (i11 < list.size()) {
            kVar.f14032a.d0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void H(int i10, List list, k kVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            kVar.getClass();
            while (i11 < list.size()) {
                kVar.f14032a.Y(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        kVar.f14032a.k0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).intValue();
            Logger logger = j.f14024c;
            i12 += 4;
        }
        kVar.f14032a.m0(i12);
        while (i11 < list.size()) {
            kVar.f14032a.Z(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void I(int i10, List list, k kVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            kVar.getClass();
            while (i11 < list.size()) {
                kVar.f14032a.a0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        kVar.f14032a.k0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).longValue();
            Logger logger = j.f14024c;
            i12 += 8;
        }
        kVar.f14032a.m0(i12);
        while (i11 < list.size()) {
            kVar.f14032a.b0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void J(int i10, List list, k kVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            kVar.getClass();
            while (i11 < list.size()) {
                j jVar = kVar.f14032a;
                float floatValue = ((Float) list.get(i11)).floatValue();
                jVar.getClass();
                jVar.Y(i10, Float.floatToRawIntBits(floatValue));
                i11++;
            }
            return;
        }
        kVar.f14032a.k0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).floatValue();
            Logger logger = j.f14024c;
            i12 += 4;
        }
        kVar.f14032a.m0(i12);
        while (i11 < list.size()) {
            j jVar2 = kVar.f14032a;
            float floatValue2 = ((Float) list.get(i11)).floatValue();
            jVar2.getClass();
            jVar2.Z(Float.floatToRawIntBits(floatValue2));
            i11++;
        }
    }

    public static void K(int i10, List list, k kVar, c1 c1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kVar.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            kVar.h(i10, c1Var, list.get(i11));
        }
    }

    public static void L(int i10, List list, k kVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            kVar.getClass();
            while (i11 < list.size()) {
                kVar.f14032a.c0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        kVar.f14032a.k0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += j.E(((Integer) list.get(i13)).intValue());
        }
        kVar.f14032a.m0(i12);
        while (i11 < list.size()) {
            kVar.f14032a.d0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void M(int i10, List list, k kVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            kVar.getClass();
            while (i11 < list.size()) {
                kVar.f14032a.n0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        kVar.f14032a.k0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += j.R(((Long) list.get(i13)).longValue());
        }
        kVar.f14032a.m0(i12);
        while (i11 < list.size()) {
            kVar.f14032a.o0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void N(int i10, List list, k kVar, c1 c1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kVar.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            kVar.k(i10, c1Var, list.get(i11));
        }
    }

    public static void O(int i10, List list, k kVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            kVar.getClass();
            while (i11 < list.size()) {
                kVar.f14032a.Y(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        kVar.f14032a.k0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).intValue();
            Logger logger = j.f14024c;
            i12 += 4;
        }
        kVar.f14032a.m0(i12);
        while (i11 < list.size()) {
            kVar.f14032a.Z(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void P(int i10, List list, k kVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            kVar.getClass();
            while (i11 < list.size()) {
                kVar.f14032a.a0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        kVar.f14032a.k0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).longValue();
            Logger logger = j.f14024c;
            i12 += 8;
        }
        kVar.f14032a.m0(i12);
        while (i11 < list.size()) {
            kVar.f14032a.b0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void Q(int i10, List list, k kVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            kVar.getClass();
            while (i11 < list.size()) {
                j jVar = kVar.f14032a;
                int intValue = ((Integer) list.get(i11)).intValue();
                jVar.l0(i10, (intValue >> 31) ^ (intValue << 1));
                i11++;
            }
            return;
        }
        kVar.f14032a.k0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            int intValue2 = ((Integer) list.get(i13)).intValue();
            i12 += j.P((intValue2 >> 31) ^ (intValue2 << 1));
        }
        kVar.f14032a.m0(i12);
        while (i11 < list.size()) {
            j jVar2 = kVar.f14032a;
            int intValue3 = ((Integer) list.get(i11)).intValue();
            jVar2.m0((intValue3 >> 31) ^ (intValue3 << 1));
            i11++;
        }
    }

    public static void R(int i10, List list, k kVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            kVar.getClass();
            while (i11 < list.size()) {
                j jVar = kVar.f14032a;
                long longValue = ((Long) list.get(i11)).longValue();
                jVar.n0(i10, (longValue >> 63) ^ (longValue << 1));
                i11++;
            }
            return;
        }
        kVar.f14032a.k0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            long longValue2 = ((Long) list.get(i13)).longValue();
            i12 += j.R((longValue2 >> 63) ^ (longValue2 << 1));
        }
        kVar.f14032a.m0(i12);
        while (i11 < list.size()) {
            j jVar2 = kVar.f14032a;
            long longValue3 = ((Long) list.get(i11)).longValue();
            jVar2.o0((longValue3 >> 63) ^ (longValue3 << 1));
            i11++;
        }
    }

    public static void S(int i10, List list, k kVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kVar.getClass();
        int i11 = 0;
        if (!(list instanceof d0)) {
            while (i11 < list.size()) {
                kVar.f14032a.i0(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        d0 d0Var = (d0) list;
        while (i11 < list.size()) {
            Object f = d0Var.f(i11);
            if (f instanceof String) {
                kVar.f14032a.i0(i10, (String) f);
            } else {
                kVar.f14032a.W(i10, (g) f);
            }
            i11++;
        }
    }

    public static void T(int i10, List list, k kVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            kVar.getClass();
            while (i11 < list.size()) {
                kVar.f14032a.l0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        kVar.f14032a.k0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += j.P(((Integer) list.get(i13)).intValue());
        }
        kVar.f14032a.m0(i12);
        while (i11 < list.size()) {
            kVar.f14032a.m0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void U(int i10, List list, k kVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            kVar.getClass();
            while (i11 < list.size()) {
                kVar.f14032a.n0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        kVar.f14032a.k0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += j.R(((Long) list.get(i13)).longValue());
        }
        kVar.f14032a.m0(i12);
        while (i11 < list.size()) {
            kVar.f14032a.o0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static int a(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return j.v(i10) * size;
    }

    public static int b(List<?> list) {
        return list.size();
    }

    public static int c(int i10, List<g> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int N = j.N(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int size2 = list.get(i11).size();
            N += j.P(size2) + size2;
        }
        return N;
    }

    public static int d(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j.N(i10) * size) + e(list);
    }

    public static int e(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof w) {
            w wVar = (w) list;
            i10 = 0;
            while (i11 < size) {
                wVar.i(i11);
                i10 += j.E(wVar.f14117b[i11]);
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += j.E(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int f(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return j.z(i10) * size;
    }

    public static int g(List<?> list) {
        return list.size() * 4;
    }

    public static int h(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return j.A(i10) * size;
    }

    public static int i(List<?> list) {
        return list.size() * 8;
    }

    public static int j(int i10, List<o0> list, c1 c1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += j.C(i10, list.get(i12), c1Var);
        }
        return i11;
    }

    public static int k(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j.N(i10) * size) + l(list);
    }

    public static int l(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof w) {
            w wVar = (w) list;
            i10 = 0;
            while (i11 < size) {
                wVar.i(i11);
                i10 += j.E(wVar.f14117b[i11]);
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += j.E(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int m(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (j.N(i10) * list.size()) + n(list);
    }

    public static int n(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof f0) {
            f0 f0Var = (f0) list;
            i10 = 0;
            while (i11 < size) {
                f0Var.i(i11);
                i10 += j.R(f0Var.f13964b[i11]);
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += j.R(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int o(int i10, c1 c1Var, Object obj) {
        if (obj instanceof b0) {
            return j.G((b0) obj) + j.N(i10);
        }
        int N = j.N(i10);
        int i11 = ((a) ((o0) obj)).i(c1Var);
        return j.P(i11) + i11 + N;
    }

    public static int p(int i10, List<?> list, c1 c1Var) {
        int P;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int N = j.N(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof b0) {
                P = j.G((b0) obj);
            } else {
                int i12 = ((a) ((o0) obj)).i(c1Var);
                P = i12 + j.P(i12);
            }
            N += P;
        }
        return N;
    }

    public static int q(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j.N(i10) * size) + r(list);
    }

    public static int r(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof w) {
            w wVar = (w) list;
            i10 = 0;
            while (i11 < size) {
                wVar.i(i11);
                int i12 = wVar.f14117b[i11];
                i10 += j.P((i12 >> 31) ^ (i12 << 1));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = list.get(i11).intValue();
                i10 += j.P((intValue >> 31) ^ (intValue << 1));
                i11++;
            }
        }
        return i10;
    }

    public static int s(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j.N(i10) * size) + t(list);
    }

    public static int t(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof f0) {
            f0 f0Var = (f0) list;
            i10 = 0;
            while (i11 < size) {
                f0Var.i(i11);
                long j10 = f0Var.f13964b[i11];
                i10 += j.R((j10 >> 63) ^ (j10 << 1));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                long longValue = list.get(i11).longValue();
                i10 += j.R((longValue >> 63) ^ (longValue << 1));
                i11++;
            }
        }
        return i10;
    }

    public static int u(int i10, List<?> list) {
        int M;
        int M2;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int N = j.N(i10) * size;
        if (list instanceof d0) {
            d0 d0Var = (d0) list;
            while (i11 < size) {
                Object f = d0Var.f(i11);
                if (f instanceof g) {
                    int size2 = ((g) f).size();
                    M2 = j.P(size2) + size2;
                } else {
                    M2 = j.M((String) f);
                }
                N += M2;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof g) {
                    int size3 = ((g) obj).size();
                    M = j.P(size3) + size3;
                } else {
                    M = j.M((String) obj);
                }
                N += M;
                i11++;
            }
        }
        return N;
    }

    public static int v(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j.N(i10) * size) + w(list);
    }

    public static int w(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof w) {
            w wVar = (w) list;
            i10 = 0;
            while (i11 < size) {
                wVar.i(i11);
                i10 += j.P(wVar.f14117b[i11]);
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += j.P(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int x(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j.N(i10) * size) + y(list);
    }

    public static int y(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof f0) {
            f0 f0Var = (f0) list;
            i10 = 0;
            while (i11 < size) {
                f0Var.i(i11);
                i10 += j.R(f0Var.f13964b[i11]);
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += j.R(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static h1<?, ?> z(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (h1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }
}
