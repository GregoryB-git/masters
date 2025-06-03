package ma;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;
import ma.a0;
import ma.e0;
import ma.s.a;
import ma.s0;
import ma.w;

/* loaded from: classes.dex */
public final class s<T extends a<T>> {

    /* renamed from: d, reason: collision with root package name */
    public static final s f11072d = new s(0);

    /* renamed from: a, reason: collision with root package name */
    public final l1<T, Object> f11073a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11074b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11075c;

    public interface a<T extends a<T>> extends Comparable<T> {
        void a();

        void b();

        void c();

        w1 d();

        void e();

        w.a k(s0.a aVar, s0 s0Var);
    }

    public s() {
        int i10 = l1.f11037o;
        this.f11073a = new k1(16);
    }

    public static Object b(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int c(v1 v1Var, int i10, Object obj) {
        int N = k.N(i10);
        if (v1Var == v1.f11115d) {
            N *= 2;
        }
        return d(v1Var, obj) + N;
    }

    public static int d(v1 v1Var, Object obj) {
        switch (v1Var.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                Logger logger = k.f11018c;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                Logger logger2 = k.f11018c;
                return 4;
            case 2:
                return k.R(((Long) obj).longValue());
            case 3:
                return k.R(((Long) obj).longValue());
            case 4:
                return k.E(((Integer) obj).intValue());
            case 5:
            case 15:
                ((Long) obj).longValue();
                Logger logger3 = k.f11018c;
                return 8;
            case 6:
            case 14:
                ((Integer) obj).intValue();
                Logger logger22 = k.f11018c;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                Logger logger4 = k.f11018c;
                return 1;
            case 8:
                if (!(obj instanceof h)) {
                    return k.M((String) obj);
                }
                Logger logger5 = k.f11018c;
                int size = ((h) obj).size();
                return k.P(size) + size;
            case 9:
                Logger logger6 = k.f11018c;
                return ((s0) obj).d();
            case 10:
                if (obj instanceof e0) {
                    return k.G((e0) obj);
                }
                Logger logger7 = k.f11018c;
                int d10 = ((s0) obj).d();
                return k.P(d10) + d10;
            case 11:
                if (obj instanceof h) {
                    Logger logger8 = k.f11018c;
                    int size2 = ((h) obj).size();
                    return k.P(size2) + size2;
                }
                Logger logger9 = k.f11018c;
                int length = ((byte[]) obj).length;
                return k.P(length) + length;
            case 12:
                return k.P(((Integer) obj).intValue());
            case 13:
                return obj instanceof a0.a ? k.E(((a0.a) obj).a()) : k.E(((Integer) obj).intValue());
            case 16:
                int intValue = ((Integer) obj).intValue();
                return k.P((intValue >> 31) ^ (intValue << 1));
            case 17:
                long longValue = ((Long) obj).longValue();
                return k.R((longValue >> 63) ^ (longValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int e(a<?> aVar, Object obj) {
        aVar.c();
        aVar.a();
        aVar.b();
        return c(null, 0, obj);
    }

    public static int g(Map.Entry entry) {
        a aVar = (a) entry.getKey();
        Object value = entry.getValue();
        if (aVar.d() != w1.MESSAGE) {
            return e(aVar, value);
        }
        aVar.b();
        aVar.e();
        boolean z10 = value instanceof e0;
        ((a) entry.getKey()).a();
        if (z10) {
            return k.G((e0) value) + k.N(3) + k.O(2, 0) + (k.N(1) * 2);
        }
        int O = k.O(2, 0) + (k.N(1) * 2);
        int N = k.N(3);
        int d10 = ((s0) value).d();
        return k.P(d10) + d10 + N + O;
    }

    public static <T extends a<T>> boolean k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.d() != w1.MESSAGE) {
            return true;
        }
        key.b();
        Object value = entry.getValue();
        if (value instanceof t0) {
            return ((t0) value).f();
        }
        if (value instanceof e0) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static void p(a aVar, Object obj) {
        aVar.c();
        Charset charset = a0.f10909a;
        obj.getClass();
        throw null;
    }

    public static void q(k kVar, v1 v1Var, int i10, Object obj) {
        if (v1Var == v1.f11115d) {
            kVar.k0(i10, 3);
            ((s0) obj).i(kVar);
            kVar.k0(i10, 4);
            return;
        }
        kVar.k0(i10, v1Var.f11118b);
        switch (v1Var.ordinal()) {
            case 0:
                kVar.b0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                kVar.Z(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                kVar.o0(((Long) obj).longValue());
                return;
            case 3:
                kVar.o0(((Long) obj).longValue());
                return;
            case 4:
                kVar.d0(((Integer) obj).intValue());
                return;
            case 5:
                kVar.b0(((Long) obj).longValue());
                return;
            case 6:
                kVar.Z(((Integer) obj).intValue());
                return;
            case 7:
                kVar.T(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 8:
                if (!(obj instanceof h)) {
                    kVar.j0((String) obj);
                    return;
                }
                break;
            case 9:
                ((s0) obj).i(kVar);
                return;
            case 10:
                kVar.f0((s0) obj);
                return;
            case 11:
                if (!(obj instanceof h)) {
                    byte[] bArr = (byte[]) obj;
                    kVar.V(bArr, bArr.length);
                    return;
                }
                break;
            case 12:
                kVar.m0(((Integer) obj).intValue());
                return;
            case 13:
                kVar.d0(obj instanceof a0.a ? ((a0.a) obj).a() : ((Integer) obj).intValue());
                return;
            case 14:
                kVar.Z(((Integer) obj).intValue());
                return;
            case 15:
                kVar.b0(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                kVar.m0((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                kVar.o0((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
        kVar.X((h) obj);
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final s<T> clone() {
        s<T> sVar = new s<>();
        for (int i10 = 0; i10 < this.f11073a.e(); i10++) {
            Map.Entry<T, Object> d10 = this.f11073a.d(i10);
            sVar.o(d10.getKey(), d10.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f11073a.f()) {
            sVar.o(entry.getKey(), entry.getValue());
        }
        sVar.f11075c = this.f11075c;
        return sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            return this.f11073a.equals(((s) obj).f11073a);
        }
        return false;
    }

    public final Object f(T t) {
        Object obj = this.f11073a.get(t);
        return obj instanceof e0 ? ((e0) obj).a(null) : obj;
    }

    public final int h() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f11073a.e(); i11++) {
            Map.Entry<T, Object> d10 = this.f11073a.d(i11);
            i10 += e(d10.getKey(), d10.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f11073a.f()) {
            i10 += e(entry.getKey(), entry.getValue());
        }
        return i10;
    }

    public final int hashCode() {
        return this.f11073a.hashCode();
    }

    public final boolean i() {
        return this.f11073a.isEmpty();
    }

    public final boolean j() {
        for (int i10 = 0; i10 < this.f11073a.e(); i10++) {
            if (!k(this.f11073a.d(i10))) {
                return false;
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.f11073a.f().iterator();
        while (it.hasNext()) {
            if (!k(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<Map.Entry<T, Object>> l() {
        return this.f11075c ? new e0.b(this.f11073a.entrySet().iterator()) : this.f11073a.entrySet().iterator();
    }

    public final void m() {
        if (this.f11074b) {
            return;
        }
        for (int i10 = 0; i10 < this.f11073a.e(); i10++) {
            Map.Entry<T, Object> d10 = this.f11073a.d(i10);
            if (d10.getValue() instanceof w) {
                w wVar = (w) d10.getValue();
                wVar.getClass();
                d1 d1Var = d1.f10940c;
                d1Var.getClass();
                d1Var.a(wVar.getClass()).b(wVar);
                wVar.z();
            }
        }
        this.f11073a.h();
        this.f11074b = true;
    }

    public final void n(Map.Entry<T, Object> entry) {
        l1<T, Object> l1Var;
        Object b10;
        Object f;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof e0) {
            value = ((e0) value).a(null);
        }
        key.b();
        if (key.d() != w1.MESSAGE || (f = f(key)) == null) {
            l1Var = this.f11073a;
            b10 = b(value);
        } else {
            b10 = key.k(((s0) f).a(), (s0) value).k();
            l1Var = this.f11073a;
        }
        l1Var.put(key, b10);
    }

    public final void o(T t, Object obj) {
        t.b();
        p(t, obj);
        throw null;
    }

    public s(int i10) {
        int i11 = l1.f11037o;
        this.f11073a = new k1(0);
        m();
        m();
    }
}
