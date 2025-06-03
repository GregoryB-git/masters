package ma;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.logging.Logger;
import ma.a0;
import ma.s;

/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<?> f11015a;

    /* renamed from: b, reason: collision with root package name */
    public static final p1<?, ?> f11016b;

    /* renamed from: c, reason: collision with root package name */
    public static final r1 f11017c;

    static {
        Class<?> cls;
        Class<?> cls2;
        p1<?, ?> p1Var = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f11015a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                p1Var = (p1) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        f11016b = p1Var;
        f11017c = new r1();
    }

    public static <T, FT extends s.a<FT>> void A(p<FT> pVar, T t, T t10) {
        s<FT> c10 = pVar.c(t10);
        if (c10.i()) {
            return;
        }
        s<FT> d10 = pVar.d(t);
        d10.getClass();
        for (int i10 = 0; i10 < c10.f11073a.e(); i10++) {
            d10.n(c10.f11073a.d(i10));
        }
        Iterator<Map.Entry<FT, Object>> it = c10.f11073a.f().iterator();
        while (it.hasNext()) {
            d10.n(it.next());
        }
    }

    public static boolean B(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <UT, UB> UB C(Object obj, int i10, int i11, UB ub2, p1<UT, UB> p1Var) {
        if (ub2 == null) {
            ub2 = (UB) p1Var.f(obj);
        }
        p1Var.e(ub2, i10, i11);
        return ub2;
    }

    public static void D(int i10, List list, l lVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            lVar.getClass();
            while (i11 < list.size()) {
                lVar.f11029a.U(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        lVar.f11029a.k0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).booleanValue();
            Logger logger = k.f11018c;
            i12++;
        }
        lVar.f11029a.m0(i12);
        while (i11 < list.size()) {
            lVar.f11029a.T(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    public static void E(int i10, List list, l lVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        lVar.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            lVar.f11029a.W(i10, (h) list.get(i11));
        }
    }

    public static void F(int i10, List list, l lVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            lVar.getClass();
            while (i11 < list.size()) {
                k kVar = lVar.f11029a;
                double doubleValue = ((Double) list.get(i11)).doubleValue();
                kVar.getClass();
                kVar.a0(i10, Double.doubleToRawLongBits(doubleValue));
                i11++;
            }
            return;
        }
        lVar.f11029a.k0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).doubleValue();
            Logger logger = k.f11018c;
            i12 += 8;
        }
        lVar.f11029a.m0(i12);
        while (i11 < list.size()) {
            k kVar2 = lVar.f11029a;
            double doubleValue2 = ((Double) list.get(i11)).doubleValue();
            kVar2.getClass();
            kVar2.b0(Double.doubleToRawLongBits(doubleValue2));
            i11++;
        }
    }

    public static void G(int i10, List list, l lVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            lVar.getClass();
            while (i11 < list.size()) {
                lVar.f11029a.c0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        lVar.f11029a.k0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.E(((Integer) list.get(i13)).intValue());
        }
        lVar.f11029a.m0(i12);
        while (i11 < list.size()) {
            lVar.f11029a.d0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void H(int i10, List list, l lVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            lVar.getClass();
            while (i11 < list.size()) {
                lVar.f11029a.Y(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        lVar.f11029a.k0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).intValue();
            Logger logger = k.f11018c;
            i12 += 4;
        }
        lVar.f11029a.m0(i12);
        while (i11 < list.size()) {
            lVar.f11029a.Z(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void I(int i10, List list, l lVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            lVar.getClass();
            while (i11 < list.size()) {
                lVar.f11029a.a0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        lVar.f11029a.k0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).longValue();
            Logger logger = k.f11018c;
            i12 += 8;
        }
        lVar.f11029a.m0(i12);
        while (i11 < list.size()) {
            lVar.f11029a.b0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void J(int i10, List list, l lVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            lVar.getClass();
            while (i11 < list.size()) {
                k kVar = lVar.f11029a;
                float floatValue = ((Float) list.get(i11)).floatValue();
                kVar.getClass();
                kVar.Y(i10, Float.floatToRawIntBits(floatValue));
                i11++;
            }
            return;
        }
        lVar.f11029a.k0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).floatValue();
            Logger logger = k.f11018c;
            i12 += 4;
        }
        lVar.f11029a.m0(i12);
        while (i11 < list.size()) {
            k kVar2 = lVar.f11029a;
            float floatValue2 = ((Float) list.get(i11)).floatValue();
            kVar2.getClass();
            kVar2.Z(Float.floatToRawIntBits(floatValue2));
            i11++;
        }
    }

    public static void K(int i10, List list, l lVar, i1 i1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        lVar.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            lVar.h(i10, i1Var, list.get(i11));
        }
    }

    public static void L(int i10, List list, l lVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            lVar.getClass();
            while (i11 < list.size()) {
                lVar.f11029a.c0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        lVar.f11029a.k0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.E(((Integer) list.get(i13)).intValue());
        }
        lVar.f11029a.m0(i12);
        while (i11 < list.size()) {
            lVar.f11029a.d0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void M(int i10, List list, l lVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            lVar.getClass();
            while (i11 < list.size()) {
                lVar.f11029a.n0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        lVar.f11029a.k0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.R(((Long) list.get(i13)).longValue());
        }
        lVar.f11029a.m0(i12);
        while (i11 < list.size()) {
            lVar.f11029a.o0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void N(int i10, List list, l lVar, i1 i1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        lVar.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            lVar.k(i10, i1Var, list.get(i11));
        }
    }

    public static void O(int i10, List list, l lVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            lVar.getClass();
            while (i11 < list.size()) {
                lVar.f11029a.Y(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        lVar.f11029a.k0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).intValue();
            Logger logger = k.f11018c;
            i12 += 4;
        }
        lVar.f11029a.m0(i12);
        while (i11 < list.size()) {
            lVar.f11029a.Z(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void P(int i10, List list, l lVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            lVar.getClass();
            while (i11 < list.size()) {
                lVar.f11029a.a0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        lVar.f11029a.k0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).longValue();
            Logger logger = k.f11018c;
            i12 += 8;
        }
        lVar.f11029a.m0(i12);
        while (i11 < list.size()) {
            lVar.f11029a.b0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void Q(int i10, List list, l lVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            lVar.getClass();
            while (i11 < list.size()) {
                k kVar = lVar.f11029a;
                int intValue = ((Integer) list.get(i11)).intValue();
                kVar.l0(i10, (intValue >> 31) ^ (intValue << 1));
                i11++;
            }
            return;
        }
        lVar.f11029a.k0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            int intValue2 = ((Integer) list.get(i13)).intValue();
            i12 += k.P((intValue2 >> 31) ^ (intValue2 << 1));
        }
        lVar.f11029a.m0(i12);
        while (i11 < list.size()) {
            k kVar2 = lVar.f11029a;
            int intValue3 = ((Integer) list.get(i11)).intValue();
            kVar2.m0((intValue3 >> 31) ^ (intValue3 << 1));
            i11++;
        }
    }

    public static void R(int i10, List list, l lVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            lVar.getClass();
            while (i11 < list.size()) {
                k kVar = lVar.f11029a;
                long longValue = ((Long) list.get(i11)).longValue();
                kVar.n0(i10, (longValue >> 63) ^ (longValue << 1));
                i11++;
            }
            return;
        }
        lVar.f11029a.k0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            long longValue2 = ((Long) list.get(i13)).longValue();
            i12 += k.R((longValue2 >> 63) ^ (longValue2 << 1));
        }
        lVar.f11029a.m0(i12);
        while (i11 < list.size()) {
            k kVar2 = lVar.f11029a;
            long longValue3 = ((Long) list.get(i11)).longValue();
            kVar2.o0((longValue3 >> 63) ^ (longValue3 << 1));
            i11++;
        }
    }

    public static void S(int i10, List list, l lVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        lVar.getClass();
        int i11 = 0;
        if (!(list instanceof h0)) {
            while (i11 < list.size()) {
                lVar.f11029a.i0(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        h0 h0Var = (h0) list;
        while (i11 < list.size()) {
            Object f = h0Var.f(i11);
            if (f instanceof String) {
                lVar.f11029a.i0(i10, (String) f);
            } else {
                lVar.f11029a.W(i10, (h) f);
            }
            i11++;
        }
    }

    public static void T(int i10, List list, l lVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            lVar.getClass();
            while (i11 < list.size()) {
                lVar.f11029a.l0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        lVar.f11029a.k0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.P(((Integer) list.get(i13)).intValue());
        }
        lVar.f11029a.m0(i12);
        while (i11 < list.size()) {
            lVar.f11029a.m0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void U(int i10, List list, l lVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            lVar.getClass();
            while (i11 < list.size()) {
                lVar.f11029a.n0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        lVar.f11029a.k0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.R(((Long) list.get(i13)).longValue());
        }
        lVar.f11029a.m0(i12);
        while (i11 < list.size()) {
            lVar.f11029a.o0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static int a(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return k.v(i10) * size;
    }

    public static int b(List<?> list) {
        return list.size();
    }

    public static int c(int i10, List<h> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int N = k.N(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int size2 = list.get(i11).size();
            N += k.P(size2) + size2;
        }
        return N;
    }

    public static int d(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (k.N(i10) * size) + e(list);
    }

    public static int e(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z) {
            z zVar = (z) list;
            i10 = 0;
            while (i11 < size) {
                zVar.i(i11);
                i10 += k.E(zVar.f11144b[i11]);
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += k.E(list.get(i11).intValue());
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
        return k.z(i10) * size;
    }

    public static int g(List<?> list) {
        return list.size() * 4;
    }

    public static int h(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return k.A(i10) * size;
    }

    public static int i(List<?> list) {
        return list.size() * 8;
    }

    public static int j(int i10, List<s0> list, i1 i1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += k.C(i10, list.get(i12), i1Var);
        }
        return i11;
    }

    public static int k(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (k.N(i10) * size) + l(list);
    }

    public static int l(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z) {
            z zVar = (z) list;
            i10 = 0;
            while (i11 < size) {
                zVar.i(i11);
                i10 += k.E(zVar.f11144b[i11]);
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += k.E(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int m(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (k.N(i10) * list.size()) + n(list);
    }

    public static int n(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            i10 = 0;
            while (i11 < size) {
                j0Var.i(i11);
                i10 += k.R(j0Var.f11013b[i11]);
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += k.R(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int o(int i10, i1 i1Var, Object obj) {
        if (obj instanceof f0) {
            return k.G((f0) obj) + k.N(i10);
        }
        int N = k.N(i10);
        int m10 = ((a) ((s0) obj)).m(i1Var);
        return k.P(m10) + m10 + N;
    }

    public static int p(int i10, List<?> list, i1 i1Var) {
        int P;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int N = k.N(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof f0) {
                P = k.G((f0) obj);
            } else {
                int m10 = ((a) ((s0) obj)).m(i1Var);
                P = m10 + k.P(m10);
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
        return (k.N(i10) * size) + r(list);
    }

    public static int r(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z) {
            z zVar = (z) list;
            i10 = 0;
            while (i11 < size) {
                zVar.i(i11);
                int i12 = zVar.f11144b[i11];
                i10 += k.P((i12 >> 31) ^ (i12 << 1));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = list.get(i11).intValue();
                i10 += k.P((intValue >> 31) ^ (intValue << 1));
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
        return (k.N(i10) * size) + t(list);
    }

    public static int t(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            i10 = 0;
            while (i11 < size) {
                j0Var.i(i11);
                long j10 = j0Var.f11013b[i11];
                i10 += k.R((j10 >> 63) ^ (j10 << 1));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                long longValue = list.get(i11).longValue();
                i10 += k.R((longValue >> 63) ^ (longValue << 1));
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
        int N = k.N(i10) * size;
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            while (i11 < size) {
                Object f = h0Var.f(i11);
                if (f instanceof h) {
                    int size2 = ((h) f).size();
                    M2 = k.P(size2) + size2;
                } else {
                    M2 = k.M((String) f);
                }
                N += M2;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof h) {
                    int size3 = ((h) obj).size();
                    M = k.P(size3) + size3;
                } else {
                    M = k.M((String) obj);
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
        return (k.N(i10) * size) + w(list);
    }

    public static int w(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z) {
            z zVar = (z) list;
            i10 = 0;
            while (i11 < size) {
                zVar.i(i11);
                i10 += k.P(zVar.f11144b[i11]);
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += k.P(list.get(i11).intValue());
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
        return (k.N(i10) * size) + y(list);
    }

    public static int y(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            i10 = 0;
            while (i11 < size) {
                j0Var.i(i11);
                i10 += k.R(j0Var.f11013b[i11]);
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += k.R(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static <UT, UB> UB z(Object obj, int i10, List<Integer> list, a0.b bVar, UB ub2, p1<UT, UB> p1Var) {
        if (bVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (bVar.a()) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) C(obj, i10, intValue, ub2, p1Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!bVar.a()) {
                    ub2 = (UB) C(obj, i10, intValue2, ub2, p1Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }
}
