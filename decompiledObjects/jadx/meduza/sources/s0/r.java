package s0;

import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;
import s0.a0;
import s0.o0;
import s0.r.a;
import s0.v;
import s0.x;

/* loaded from: classes.dex */
public final class r<T extends a<T>> {

    /* renamed from: d, reason: collision with root package name */
    public static final r f14072d = new r(0);

    /* renamed from: a, reason: collision with root package name */
    public final f1<T, Object> f14073a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14074b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14075c;

    public interface a<T extends a<T>> extends Comparable<T> {
        void a();

        void b();

        void c();

        o1 d();

        void e();

        v.a j(o0.a aVar, o0 o0Var);
    }

    public r() {
        int i10 = f1.f13966o;
        this.f14073a = new e1(16);
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

    public static int c(n1 n1Var, int i10, Object obj) {
        int N = j.N(i10);
        if (n1Var == n1.f14056d) {
            N *= 2;
        }
        return d(n1Var, obj) + N;
    }

    public static int d(n1 n1Var, Object obj) {
        switch (n1Var.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                Logger logger = j.f14024c;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                Logger logger2 = j.f14024c;
                return 4;
            case 2:
                return j.R(((Long) obj).longValue());
            case 3:
                return j.R(((Long) obj).longValue());
            case 4:
                return j.E(((Integer) obj).intValue());
            case 5:
            case 15:
                ((Long) obj).longValue();
                Logger logger3 = j.f14024c;
                return 8;
            case 6:
            case 14:
                ((Integer) obj).intValue();
                Logger logger22 = j.f14024c;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                Logger logger4 = j.f14024c;
                return 1;
            case 8:
                if (!(obj instanceof g)) {
                    return j.M((String) obj);
                }
                Logger logger5 = j.f14024c;
                int size = ((g) obj).size();
                return j.P(size) + size;
            case 9:
                Logger logger6 = j.f14024c;
                return ((o0) obj).d();
            case 10:
                if (obj instanceof a0) {
                    return j.G((a0) obj);
                }
                Logger logger7 = j.f14024c;
                int d10 = ((o0) obj).d();
                return j.P(d10) + d10;
            case 11:
                if (obj instanceof g) {
                    Logger logger8 = j.f14024c;
                    int size2 = ((g) obj).size();
                    return j.P(size2) + size2;
                }
                Logger logger9 = j.f14024c;
                int length = ((byte[]) obj).length;
                return j.P(length) + length;
            case 12:
                return j.P(((Integer) obj).intValue());
            case 13:
                return obj instanceof x.a ? j.E(((x.a) obj).a()) : j.E(((Integer) obj).intValue());
            case 16:
                int intValue = ((Integer) obj).intValue();
                return j.P((intValue >> 31) ^ (intValue << 1));
            case 17:
                long longValue = ((Long) obj).longValue();
                return j.R((longValue >> 63) ^ (longValue << 1));
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
        if (aVar.d() != o1.MESSAGE) {
            return e(aVar, value);
        }
        aVar.b();
        aVar.e();
        boolean z10 = value instanceof a0;
        ((a) entry.getKey()).a();
        if (z10) {
            return j.G((a0) value) + j.N(3) + j.O(2, 0) + (j.N(1) * 2);
        }
        int O = j.O(2, 0) + (j.N(1) * 2);
        int N = j.N(3);
        int d10 = ((o0) value).d();
        return j.P(d10) + d10 + N + O;
    }

    public static <T extends a<T>> boolean k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.d() == o1.MESSAGE) {
            key.b();
            Object value = entry.getValue();
            if (!(value instanceof o0)) {
                if (value instanceof a0) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            if (!((o0) value).f()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if ((r2 instanceof s0.x.a) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        if ((r2 instanceof byte[]) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if ((r2 instanceof s0.a0) == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void o(s0.n1 r1, java.lang.Object r2) {
        /*
            java.nio.charset.Charset r0 = s0.x.f14119a
            r2.getClass()
            s0.o1 r1 = r1.f14058a
            int r1 = r1.ordinal()
            r0 = 0
            switch(r1) {
                case 0: goto L3c;
                case 1: goto L39;
                case 2: goto L36;
                case 3: goto L33;
                case 4: goto L30;
                case 5: goto L2d;
                case 6: goto L22;
                case 7: goto L19;
                case 8: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L3e
        L10:
            boolean r1 = r2 instanceof s0.o0
            if (r1 != 0) goto L2a
            boolean r1 = r2 instanceof s0.a0
            if (r1 == 0) goto L3e
            goto L2a
        L19:
            boolean r1 = r2 instanceof java.lang.Integer
            if (r1 != 0) goto L2a
            boolean r1 = r2 instanceof s0.x.a
            if (r1 == 0) goto L3e
            goto L2a
        L22:
            boolean r1 = r2 instanceof s0.g
            if (r1 != 0) goto L2a
            boolean r1 = r2 instanceof byte[]
            if (r1 == 0) goto L3e
        L2a:
            r1 = 1
            r0 = r1
            goto L3e
        L2d:
            boolean r0 = r2 instanceof java.lang.String
            goto L3e
        L30:
            boolean r0 = r2 instanceof java.lang.Boolean
            goto L3e
        L33:
            boolean r0 = r2 instanceof java.lang.Double
            goto L3e
        L36:
            boolean r0 = r2 instanceof java.lang.Float
            goto L3e
        L39:
            boolean r0 = r2 instanceof java.lang.Long
            goto L3e
        L3c:
            boolean r0 = r2 instanceof java.lang.Integer
        L3e:
            if (r0 == 0) goto L41
            return
        L41:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Wrong object type used with protocol message reflection."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.r.o(s0.n1, java.lang.Object):void");
    }

    public static void p(j jVar, n1 n1Var, int i10, Object obj) {
        if (n1Var == n1.f14056d) {
            jVar.k0(i10, 3);
            ((o0) obj).g(jVar);
            jVar.k0(i10, 4);
            return;
        }
        jVar.k0(i10, n1Var.f14059b);
        switch (n1Var.ordinal()) {
            case 0:
                jVar.b0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                jVar.Z(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                jVar.o0(((Long) obj).longValue());
                return;
            case 3:
                jVar.o0(((Long) obj).longValue());
                return;
            case 4:
                jVar.d0(((Integer) obj).intValue());
                return;
            case 5:
                jVar.b0(((Long) obj).longValue());
                return;
            case 6:
                jVar.Z(((Integer) obj).intValue());
                return;
            case 7:
                jVar.T(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 8:
                if (!(obj instanceof g)) {
                    jVar.j0((String) obj);
                    return;
                }
                break;
            case 9:
                ((o0) obj).g(jVar);
                return;
            case 10:
                jVar.f0((o0) obj);
                return;
            case 11:
                if (!(obj instanceof g)) {
                    byte[] bArr = (byte[]) obj;
                    jVar.V(bArr, bArr.length);
                    return;
                }
                break;
            case 12:
                jVar.m0(((Integer) obj).intValue());
                return;
            case 13:
                jVar.d0(obj instanceof x.a ? ((x.a) obj).a() : ((Integer) obj).intValue());
                return;
            case 14:
                jVar.Z(((Integer) obj).intValue());
                return;
            case 15:
                jVar.b0(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                jVar.m0((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                jVar.o0((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
        jVar.X((g) obj);
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final r<T> clone() {
        r<T> rVar = new r<>();
        for (int i10 = 0; i10 < this.f14073a.e(); i10++) {
            Map.Entry<T, Object> d10 = this.f14073a.d(i10);
            rVar.n(d10.getKey(), d10.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f14073a.f()) {
            rVar.n(entry.getKey(), entry.getValue());
        }
        rVar.f14075c = this.f14075c;
        return rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return this.f14073a.equals(((r) obj).f14073a);
        }
        return false;
    }

    public final Object f(T t) {
        Object obj = this.f14073a.get(t);
        return obj instanceof a0 ? ((a0) obj).a(null) : obj;
    }

    public final int h() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f14073a.e(); i11++) {
            Map.Entry<T, Object> d10 = this.f14073a.d(i11);
            i10 += e(d10.getKey(), d10.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f14073a.f()) {
            i10 += e(entry.getKey(), entry.getValue());
        }
        return i10;
    }

    public final int hashCode() {
        return this.f14073a.hashCode();
    }

    public final boolean i() {
        return this.f14073a.isEmpty();
    }

    public final boolean j() {
        for (int i10 = 0; i10 < this.f14073a.e(); i10++) {
            if (!k(this.f14073a.d(i10))) {
                return false;
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.f14073a.f().iterator();
        while (it.hasNext()) {
            if (!k(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<Map.Entry<T, Object>> l() {
        return this.f14075c ? new a0.b(this.f14073a.entrySet().iterator()) : this.f14073a.entrySet().iterator();
    }

    public final void m(Map.Entry<T, Object> entry) {
        f1<T, Object> f1Var;
        Object b10;
        Object f;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof a0) {
            value = ((a0) value).a(null);
        }
        key.b();
        if (key.d() != o1.MESSAGE || (f = f(key)) == null) {
            f1Var = this.f14073a;
            b10 = b(value);
        } else {
            b10 = key.j(((o0) f).a(), (o0) value).h();
            f1Var = this.f14073a;
        }
        f1Var.put(key, b10);
    }

    public final void n(T t, Object obj) {
        t.b();
        t.c();
        o(null, obj);
        if (obj instanceof a0) {
            this.f14075c = true;
        }
        this.f14073a.put(t, obj);
    }

    public r(int i10) {
        int i11 = f1.f13966o;
        e1 e1Var = new e1(0);
        this.f14073a = e1Var;
        if (!this.f14074b) {
            e1Var.h();
            this.f14074b = true;
        }
        if (this.f14074b) {
            return;
        }
        e1Var.h();
        this.f14074b = true;
    }
}
