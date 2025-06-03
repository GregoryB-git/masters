package A0;

import A0.y;
import X2.AbstractC0703v;
import X2.J;
import d0.AbstractC1170I;
import d0.C1171J;
import d0.C1194q;
import g0.InterfaceC1299c;
import g0.M;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import x0.InterfaceC2142x;

/* renamed from: A0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0310a extends AbstractC0312c {

    /* renamed from: h, reason: collision with root package name */
    public final B0.e f46h;

    /* renamed from: i, reason: collision with root package name */
    public final long f47i;

    /* renamed from: j, reason: collision with root package name */
    public final long f48j;

    /* renamed from: k, reason: collision with root package name */
    public final long f49k;

    /* renamed from: l, reason: collision with root package name */
    public final int f50l;

    /* renamed from: m, reason: collision with root package name */
    public final int f51m;

    /* renamed from: n, reason: collision with root package name */
    public final float f52n;

    /* renamed from: o, reason: collision with root package name */
    public final float f53o;

    /* renamed from: p, reason: collision with root package name */
    public final AbstractC0703v f54p;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC1299c f55q;

    /* renamed from: r, reason: collision with root package name */
    public float f56r;

    /* renamed from: s, reason: collision with root package name */
    public int f57s;

    /* renamed from: t, reason: collision with root package name */
    public int f58t;

    /* renamed from: u, reason: collision with root package name */
    public long f59u;

    /* renamed from: v, reason: collision with root package name */
    public y0.m f60v;

    /* renamed from: w, reason: collision with root package name */
    public long f61w;

    /* renamed from: A0.a$a, reason: collision with other inner class name */
    public static final class C0000a {

        /* renamed from: a, reason: collision with root package name */
        public final long f62a;

        /* renamed from: b, reason: collision with root package name */
        public final long f63b;

        public C0000a(long j7, long j8) {
            this.f62a = j7;
            this.f63b = j8;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0000a)) {
                return false;
            }
            C0000a c0000a = (C0000a) obj;
            return this.f62a == c0000a.f62a && this.f63b == c0000a.f63b;
        }

        public int hashCode() {
            return (((int) this.f62a) * 31) + ((int) this.f63b);
        }
    }

    /* renamed from: A0.a$b */
    public static class b implements y.b {

        /* renamed from: a, reason: collision with root package name */
        public final int f64a;

        /* renamed from: b, reason: collision with root package name */
        public final int f65b;

        /* renamed from: c, reason: collision with root package name */
        public final int f66c;

        /* renamed from: d, reason: collision with root package name */
        public final int f67d;

        /* renamed from: e, reason: collision with root package name */
        public final int f68e;

        /* renamed from: f, reason: collision with root package name */
        public final float f69f;

        /* renamed from: g, reason: collision with root package name */
        public final float f70g;

        /* renamed from: h, reason: collision with root package name */
        public final InterfaceC1299c f71h;

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }

        @Override // A0.y.b
        public final y[] a(y.a[] aVarArr, B0.e eVar, InterfaceC2142x.b bVar, AbstractC1170I abstractC1170I) {
            AbstractC0703v B7 = C0310a.B(aVarArr);
            y[] yVarArr = new y[aVarArr.length];
            for (int i7 = 0; i7 < aVarArr.length; i7++) {
                y.a aVar = aVarArr[i7];
                if (aVar != null) {
                    int[] iArr = aVar.f210b;
                    if (iArr.length != 0) {
                        yVarArr[i7] = iArr.length == 1 ? new z(aVar.f209a, iArr[0], aVar.f211c) : b(aVar.f209a, iArr, aVar.f211c, eVar, (AbstractC0703v) B7.get(i7));
                    }
                }
            }
            return yVarArr;
        }

        public C0310a b(C1171J c1171j, int[] iArr, int i7, B0.e eVar, AbstractC0703v abstractC0703v) {
            return new C0310a(c1171j, iArr, i7, eVar, this.f64a, this.f65b, this.f66c, this.f67d, this.f68e, this.f69f, this.f70g, abstractC0703v, this.f71h);
        }

        public b(int i7, int i8, int i9, float f7) {
            this(i7, i8, i9, 1279, 719, f7, 0.75f, InterfaceC1299c.f14278a);
        }

        public b(int i7, int i8, int i9, int i10, int i11, float f7, float f8, InterfaceC1299c interfaceC1299c) {
            this.f64a = i7;
            this.f65b = i8;
            this.f66c = i9;
            this.f67d = i10;
            this.f68e = i11;
            this.f69f = f7;
            this.f70g = f8;
            this.f71h = interfaceC1299c;
        }
    }

    public C0310a(C1171J c1171j, int[] iArr, int i7, B0.e eVar, long j7, long j8, long j9, int i8, int i9, float f7, float f8, List list, InterfaceC1299c interfaceC1299c) {
        super(c1171j, iArr, i7);
        B0.e eVar2;
        long j10;
        if (j9 < j7) {
            g0.o.h("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            eVar2 = eVar;
            j10 = j7;
        } else {
            eVar2 = eVar;
            j10 = j9;
        }
        this.f46h = eVar2;
        this.f47i = j7 * 1000;
        this.f48j = j8 * 1000;
        this.f49k = j10 * 1000;
        this.f50l = i8;
        this.f51m = i9;
        this.f52n = f7;
        this.f53o = f8;
        this.f54p = AbstractC0703v.U(list);
        this.f55q = interfaceC1299c;
        this.f56r = 1.0f;
        this.f58t = 0;
        this.f59u = -9223372036854775807L;
        this.f61w = -2147483647L;
    }

    public static AbstractC0703v B(y.a[] aVarArr) {
        AbstractC0703v.a aVar;
        ArrayList arrayList = new ArrayList();
        for (y.a aVar2 : aVarArr) {
            if (aVar2 == null || aVar2.f210b.length <= 1) {
                aVar = null;
            } else {
                aVar = AbstractC0703v.M();
                aVar.a(new C0000a(0L, 0L));
            }
            arrayList.add(aVar);
        }
        long[][] G6 = G(aVarArr);
        int[] iArr = new int[G6.length];
        long[] jArr = new long[G6.length];
        for (int i7 = 0; i7 < G6.length; i7++) {
            long[] jArr2 = G6[i7];
            jArr[i7] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        y(arrayList, jArr);
        AbstractC0703v H6 = H(G6);
        for (int i8 = 0; i8 < H6.size(); i8++) {
            int intValue = ((Integer) H6.get(i8)).intValue();
            int i9 = iArr[intValue] + 1;
            iArr[intValue] = i9;
            jArr[intValue] = G6[intValue][i9];
            y(arrayList, jArr);
        }
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            if (arrayList.get(i10) != null) {
                jArr[i10] = jArr[i10] * 2;
            }
        }
        y(arrayList, jArr);
        AbstractC0703v.a M6 = AbstractC0703v.M();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            AbstractC0703v.a aVar3 = (AbstractC0703v.a) arrayList.get(i11);
            M6.a(aVar3 == null ? AbstractC0703v.Y() : aVar3.k());
        }
        return M6.k();
    }

    public static long[][] G(y.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i7 = 0; i7 < aVarArr.length; i7++) {
            y.a aVar = aVarArr[i7];
            if (aVar == null) {
                jArr[i7] = new long[0];
            } else {
                jArr[i7] = new long[aVar.f210b.length];
                int i8 = 0;
                while (true) {
                    int[] iArr = aVar.f210b;
                    if (i8 >= iArr.length) {
                        break;
                    }
                    long j7 = aVar.f209a.a(iArr[i8]).f12721i;
                    long[] jArr2 = jArr[i7];
                    if (j7 == -1) {
                        j7 = 0;
                    }
                    jArr2[i8] = j7;
                    i8++;
                }
                Arrays.sort(jArr[i7]);
            }
        }
        return jArr;
    }

    public static AbstractC0703v H(long[][] jArr) {
        X2.D c7 = J.a().a().c();
        for (int i7 = 0; i7 < jArr.length; i7++) {
            long[] jArr2 = jArr[i7];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i8 = 0;
                while (true) {
                    long[] jArr3 = jArr[i7];
                    double d7 = 0.0d;
                    if (i8 >= jArr3.length) {
                        break;
                    }
                    long j7 = jArr3[i8];
                    if (j7 != -1) {
                        d7 = Math.log(j7);
                    }
                    dArr[i8] = d7;
                    i8++;
                }
                int i9 = length - 1;
                double d8 = dArr[i9] - dArr[0];
                int i10 = 0;
                while (i10 < i9) {
                    double d9 = dArr[i10];
                    i10++;
                    c7.put(Double.valueOf(d8 == 0.0d ? 1.0d : (((d9 + dArr[i10]) * 0.5d) - dArr[0]) / d8), Integer.valueOf(i7));
                }
            }
        }
        return AbstractC0703v.U(c7.values());
    }

    public static void y(List list, long[] jArr) {
        long j7 = 0;
        for (long j8 : jArr) {
            j7 += j8;
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            AbstractC0703v.a aVar = (AbstractC0703v.a) list.get(i7);
            if (aVar != null) {
                aVar.a(new C0000a(j7, jArr[i7]));
            }
        }
    }

    public final int A(long j7, long j8) {
        long C7 = C(j8);
        int i7 = 0;
        for (int i8 = 0; i8 < this.f73b; i8++) {
            if (j7 == Long.MIN_VALUE || !i(i8, j7)) {
                C1194q b7 = b(i8);
                if (z(b7, b7.f12721i, C7)) {
                    return i8;
                }
                i7 = i8;
            }
        }
        return i7;
    }

    public final long C(long j7) {
        long I6 = I(j7);
        if (this.f54p.isEmpty()) {
            return I6;
        }
        int i7 = 1;
        while (i7 < this.f54p.size() - 1 && ((C0000a) this.f54p.get(i7)).f62a < I6) {
            i7++;
        }
        C0000a c0000a = (C0000a) this.f54p.get(i7 - 1);
        C0000a c0000a2 = (C0000a) this.f54p.get(i7);
        long j8 = c0000a.f62a;
        float f7 = (I6 - j8) / (c0000a2.f62a - j8);
        return c0000a.f63b + ((long) (f7 * (c0000a2.f63b - r2)));
    }

    public final long D(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        y0.m mVar = (y0.m) X2.B.d(list);
        long j7 = mVar.f21258g;
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j8 = mVar.f21259h;
        if (j8 != -9223372036854775807L) {
            return j8 - j7;
        }
        return -9223372036854775807L;
    }

    public long E() {
        return this.f49k;
    }

    public final long F(y0.n[] nVarArr, List list) {
        int i7 = this.f57s;
        if (i7 < nVarArr.length && nVarArr[i7].next()) {
            y0.n nVar = nVarArr[this.f57s];
            return nVar.a() - nVar.b();
        }
        for (y0.n nVar2 : nVarArr) {
            if (nVar2.next()) {
                return nVar2.a() - nVar2.b();
            }
        }
        return D(list);
    }

    public final long I(long j7) {
        long d7 = this.f46h.d();
        this.f61w = d7;
        long j8 = (long) (d7 * this.f52n);
        long b7 = this.f46h.b();
        if (b7 == -9223372036854775807L || j7 == -9223372036854775807L) {
            return (long) (j8 / this.f56r);
        }
        float f7 = j7;
        return (long) ((j8 * Math.max((f7 / this.f56r) - b7, 0.0f)) / f7);
    }

    public final long J(long j7, long j8) {
        if (j7 == -9223372036854775807L) {
            return this.f47i;
        }
        if (j8 != -9223372036854775807L) {
            j7 -= j8;
        }
        return Math.min((long) (j7 * this.f53o), this.f47i);
    }

    public boolean K(long j7, List list) {
        long j8 = this.f59u;
        return j8 == -9223372036854775807L || j7 - j8 >= 1000 || !(list.isEmpty() || ((y0.m) X2.B.d(list)).equals(this.f60v));
    }

    @Override // A0.AbstractC0312c, A0.y
    public void g() {
        this.f60v = null;
    }

    @Override // A0.AbstractC0312c, A0.y
    public void j() {
        this.f59u = -9223372036854775807L;
        this.f60v = null;
    }

    @Override // A0.AbstractC0312c, A0.y
    public int k(long j7, List list) {
        int i7;
        int i8;
        long b7 = this.f55q.b();
        if (!K(b7, list)) {
            return list.size();
        }
        this.f59u = b7;
        this.f60v = list.isEmpty() ? null : (y0.m) X2.B.d(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long h02 = M.h0(((y0.m) list.get(size - 1)).f21258g - j7, this.f56r);
        long E6 = E();
        if (h02 < E6) {
            return size;
        }
        C1194q b8 = b(A(b7, D(list)));
        for (int i9 = 0; i9 < size; i9++) {
            y0.m mVar = (y0.m) list.get(i9);
            C1194q c1194q = mVar.f21255d;
            if (M.h0(mVar.f21258g - j7, this.f56r) >= E6 && c1194q.f12721i < b8.f12721i && (i7 = c1194q.f12733u) != -1 && i7 <= this.f51m && (i8 = c1194q.f12732t) != -1 && i8 <= this.f50l && i7 < b8.f12733u) {
                return i9;
            }
        }
        return size;
    }

    @Override // A0.y
    public int n() {
        return this.f58t;
    }

    @Override // A0.y
    public int o() {
        return this.f57s;
    }

    @Override // A0.AbstractC0312c, A0.y
    public void r(float f7) {
        this.f56r = f7;
    }

    @Override // A0.y
    public Object s() {
        return null;
    }

    @Override // A0.y
    public void v(long j7, long j8, long j9, List list, y0.n[] nVarArr) {
        long b7 = this.f55q.b();
        long F6 = F(nVarArr, list);
        int i7 = this.f58t;
        if (i7 == 0) {
            this.f58t = 1;
            this.f57s = A(b7, F6);
            return;
        }
        int i8 = this.f57s;
        int a7 = list.isEmpty() ? -1 : a(((y0.m) X2.B.d(list)).f21255d);
        if (a7 != -1) {
            i7 = ((y0.m) X2.B.d(list)).f21256e;
            i8 = a7;
        }
        int A7 = A(b7, F6);
        if (A7 != i8 && !i(i8, b7)) {
            C1194q b8 = b(i8);
            C1194q b9 = b(A7);
            long J6 = J(j9, F6);
            int i9 = b9.f12721i;
            int i10 = b8.f12721i;
            if ((i9 > i10 && j8 < J6) || (i9 < i10 && j8 >= this.f48j)) {
                A7 = i8;
            }
        }
        if (A7 != i8) {
            i7 = 3;
        }
        this.f58t = i7;
        this.f57s = A7;
    }

    public boolean z(C1194q c1194q, int i7, long j7) {
        return ((long) i7) <= j7;
    }
}
