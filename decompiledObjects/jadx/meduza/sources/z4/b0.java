package z4;

import a4.e;
import a4.g;
import a4.h;
import c4.v;
import java.io.EOFException;
import v3.i0;
import z4.a0;

/* loaded from: classes.dex */
public class b0 implements c4.v {
    public v3.i0 A;
    public v3.i0 B;
    public int C;
    public boolean D;
    public boolean E;
    public long F;
    public boolean G;

    /* renamed from: a, reason: collision with root package name */
    public final a0 f17571a;

    /* renamed from: d, reason: collision with root package name */
    public final a4.h f17574d;

    /* renamed from: e, reason: collision with root package name */
    public final g.a f17575e;
    public c f;

    /* renamed from: g, reason: collision with root package name */
    public v3.i0 f17576g;

    /* renamed from: h, reason: collision with root package name */
    public a4.e f17577h;

    /* renamed from: p, reason: collision with root package name */
    public int f17585p;

    /* renamed from: q, reason: collision with root package name */
    public int f17586q;

    /* renamed from: r, reason: collision with root package name */
    public int f17587r;

    /* renamed from: s, reason: collision with root package name */
    public int f17588s;

    /* renamed from: w, reason: collision with root package name */
    public boolean f17591w;

    /* renamed from: z, reason: collision with root package name */
    public boolean f17594z;

    /* renamed from: b, reason: collision with root package name */
    public final a f17572b = new a();

    /* renamed from: i, reason: collision with root package name */
    public int f17578i = 1000;

    /* renamed from: j, reason: collision with root package name */
    public int[] f17579j = new int[1000];

    /* renamed from: k, reason: collision with root package name */
    public long[] f17580k = new long[1000];

    /* renamed from: n, reason: collision with root package name */
    public long[] f17583n = new long[1000];

    /* renamed from: m, reason: collision with root package name */
    public int[] f17582m = new int[1000];

    /* renamed from: l, reason: collision with root package name */
    public int[] f17581l = new int[1000];

    /* renamed from: o, reason: collision with root package name */
    public v.a[] f17584o = new v.a[1000];

    /* renamed from: c, reason: collision with root package name */
    public final h0<b> f17573c = new h0<>(new r3.j(12));
    public long t = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    public long f17589u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    public long f17590v = Long.MIN_VALUE;

    /* renamed from: y, reason: collision with root package name */
    public boolean f17593y = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f17592x = true;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f17595a;

        /* renamed from: b, reason: collision with root package name */
        public long f17596b;

        /* renamed from: c, reason: collision with root package name */
        public v.a f17597c;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final v3.i0 f17598a;

        /* renamed from: b, reason: collision with root package name */
        public final h.b f17599b;

        public b(v3.i0 i0Var, h.b bVar) {
            this.f17598a = i0Var;
            this.f17599b = bVar;
        }
    }

    public interface c {
        void a();
    }

    public b0(t5.b bVar, a4.h hVar, g.a aVar) {
        this.f17574d = hVar;
        this.f17575e = aVar;
        this.f17571a = new a0(bVar);
    }

    @Override // c4.v
    public final void a(int i10, v5.u uVar) {
        a0 a0Var = this.f17571a;
        while (i10 > 0) {
            int c10 = a0Var.c(i10);
            a0.a aVar = a0Var.f;
            t5.a aVar2 = aVar.f17569c;
            uVar.d(aVar2.f14445a, ((int) (a0Var.f17566g - aVar.f17567a)) + aVar2.f14446b, c10);
            i10 -= c10;
            long j10 = a0Var.f17566g + c10;
            a0Var.f17566g = j10;
            a0.a aVar3 = a0Var.f;
            if (j10 == aVar3.f17568b) {
                a0Var.f = aVar3.f17570d;
            }
        }
        a0Var.getClass();
    }

    @Override // c4.v
    public final void b(int i10, v5.u uVar) {
        a(i10, uVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0131, code lost:
    
        if (r16.f17573c.f17679b.valueAt(r0.size() - 1).f17598a.equals(r16.B) == false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // c4.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(long r17, int r19, int r20, int r21, c4.v.a r22) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.b0.c(long, int, int, int, c4.v$a):void");
    }

    @Override // c4.v
    public final void d(v3.i0 i0Var) {
        v3.i0 l10 = l(i0Var);
        boolean z10 = false;
        this.f17594z = false;
        this.A = i0Var;
        synchronized (this) {
            this.f17593y = false;
            if (!v5.e0.a(l10, this.B)) {
                if (!(this.f17573c.f17679b.size() == 0)) {
                    if (this.f17573c.f17679b.valueAt(r5.size() - 1).f17598a.equals(l10)) {
                        l10 = this.f17573c.f17679b.valueAt(r5.size() - 1).f17598a;
                    }
                }
                this.B = l10;
                this.D = v5.p.a(l10.t, l10.f15454q);
                this.E = false;
                z10 = true;
            }
        }
        c cVar = this.f;
        if (cVar == null || !z10) {
            return;
        }
        cVar.a();
    }

    @Override // c4.v
    public final int e(t5.h hVar, int i10, boolean z10) {
        return w(hVar, i10, z10);
    }

    public final long f(int i10) {
        this.f17589u = Math.max(this.f17589u, m(i10));
        this.f17585p -= i10;
        int i11 = this.f17586q + i10;
        this.f17586q = i11;
        int i12 = this.f17587r + i10;
        this.f17587r = i12;
        int i13 = this.f17578i;
        if (i12 >= i13) {
            this.f17587r = i12 - i13;
        }
        int i14 = this.f17588s - i10;
        this.f17588s = i14;
        int i15 = 0;
        if (i14 < 0) {
            this.f17588s = 0;
        }
        h0<b> h0Var = this.f17573c;
        while (i15 < h0Var.f17679b.size() - 1) {
            int i16 = i15 + 1;
            if (i11 < h0Var.f17679b.keyAt(i16)) {
                break;
            }
            h0Var.f17680c.accept(h0Var.f17679b.valueAt(i15));
            h0Var.f17679b.removeAt(i15);
            int i17 = h0Var.f17678a;
            if (i17 > 0) {
                h0Var.f17678a = i17 - 1;
            }
            i15 = i16;
        }
        if (this.f17585p != 0) {
            return this.f17580k[this.f17587r];
        }
        int i18 = this.f17587r;
        if (i18 == 0) {
            i18 = this.f17578i;
        }
        return this.f17580k[i18 - 1] + this.f17581l[r6];
    }

    public final void g(long j10, boolean z10, boolean z11) {
        long j11;
        int i10;
        a0 a0Var = this.f17571a;
        synchronized (this) {
            int i11 = this.f17585p;
            j11 = -1;
            if (i11 != 0) {
                long[] jArr = this.f17583n;
                int i12 = this.f17587r;
                if (j10 >= jArr[i12]) {
                    if (z11 && (i10 = this.f17588s) != i11) {
                        i11 = i10 + 1;
                    }
                    int k10 = k(i12, i11, j10, z10);
                    if (k10 != -1) {
                        j11 = f(k10);
                    }
                }
            }
        }
        a0Var.b(j11);
    }

    public final void h() {
        long f;
        a0 a0Var = this.f17571a;
        synchronized (this) {
            int i10 = this.f17585p;
            f = i10 == 0 ? -1L : f(i10);
        }
        a0Var.b(f);
    }

    public final long i(int i10) {
        int i11 = this.f17586q;
        int i12 = this.f17585p;
        int i13 = (i11 + i12) - i10;
        boolean z10 = false;
        x6.b.q(i13 >= 0 && i13 <= i12 - this.f17588s);
        int i14 = this.f17585p - i13;
        this.f17585p = i14;
        this.f17590v = Math.max(this.f17589u, m(i14));
        if (i13 == 0 && this.f17591w) {
            z10 = true;
        }
        this.f17591w = z10;
        h0<b> h0Var = this.f17573c;
        for (int size = h0Var.f17679b.size() - 1; size >= 0 && i10 < h0Var.f17679b.keyAt(size); size--) {
            h0Var.f17680c.accept(h0Var.f17679b.valueAt(size));
            h0Var.f17679b.removeAt(size);
        }
        h0Var.f17678a = h0Var.f17679b.size() > 0 ? Math.min(h0Var.f17678a, h0Var.f17679b.size() - 1) : -1;
        int i15 = this.f17585p;
        if (i15 == 0) {
            return 0L;
        }
        return this.f17580k[n(i15 - 1)] + this.f17581l[r9];
    }

    public final void j(int i10) {
        a0 a0Var = this.f17571a;
        long i11 = i(i10);
        x6.b.q(i11 <= a0Var.f17566g);
        a0Var.f17566g = i11;
        if (i11 != 0) {
            a0.a aVar = a0Var.f17564d;
            if (i11 != aVar.f17567a) {
                while (a0Var.f17566g > aVar.f17568b) {
                    aVar = aVar.f17570d;
                }
                a0.a aVar2 = aVar.f17570d;
                aVar2.getClass();
                a0Var.a(aVar2);
                a0.a aVar3 = new a0.a(a0Var.f17562b, aVar.f17568b);
                aVar.f17570d = aVar3;
                if (a0Var.f17566g == aVar.f17568b) {
                    aVar = aVar3;
                }
                a0Var.f = aVar;
                if (a0Var.f17565e == aVar2) {
                    a0Var.f17565e = aVar3;
                    return;
                }
                return;
            }
        }
        a0Var.a(a0Var.f17564d);
        a0.a aVar4 = new a0.a(a0Var.f17562b, a0Var.f17566g);
        a0Var.f17564d = aVar4;
        a0Var.f17565e = aVar4;
        a0Var.f = aVar4;
    }

    public final int k(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f17583n[i10];
            if (j11 > j10) {
                return i12;
            }
            if (!z10 || (this.f17582m[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f17578i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public v3.i0 l(v3.i0 i0Var) {
        if (this.F == 0 || i0Var.f15460x == Long.MAX_VALUE) {
            return i0Var;
        }
        i0.a a10 = i0Var.a();
        a10.f15476o = i0Var.f15460x + this.F;
        return a10.a();
    }

    public final long m(int i10) {
        long j10 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int n2 = n(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.f17583n[n2]);
            if ((this.f17582m[n2] & 1) != 0) {
                break;
            }
            n2--;
            if (n2 == -1) {
                n2 = this.f17578i - 1;
            }
        }
        return j10;
    }

    public final int n(int i10) {
        int i11 = this.f17587r + i10;
        int i12 = this.f17578i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    public final synchronized int o(long j10, boolean z10) {
        int n2 = n(this.f17588s);
        int i10 = this.f17588s;
        int i11 = this.f17585p;
        if ((i10 != i11) && j10 >= this.f17583n[n2]) {
            if (j10 > this.f17590v && z10) {
                return i11 - i10;
            }
            int k10 = k(n2, i11 - i10, j10, true);
            if (k10 == -1) {
                return 0;
            }
            return k10;
        }
        return 0;
    }

    public final synchronized v3.i0 p() {
        return this.f17593y ? null : this.B;
    }

    public final synchronized boolean q(boolean z10) {
        v3.i0 i0Var;
        int i10 = this.f17588s;
        boolean z11 = true;
        if (i10 != this.f17585p) {
            if (this.f17573c.b(this.f17586q + i10).f17598a != this.f17576g) {
                return true;
            }
            return r(n(this.f17588s));
        }
        if (!z10 && !this.f17591w && ((i0Var = this.B) == null || i0Var == this.f17576g)) {
            z11 = false;
        }
        return z11;
    }

    public final boolean r(int i10) {
        a4.e eVar = this.f17577h;
        return eVar == null || eVar.e() == 4 || ((this.f17582m[i10] & 1073741824) == 0 && this.f17577h.i());
    }

    public final void s() {
        a4.e eVar = this.f17577h;
        if (eVar == null || eVar.e() != 1) {
            return;
        }
        e.a k10 = this.f17577h.k();
        k10.getClass();
        throw k10;
    }

    public final void t(v3.i0 i0Var, l3.l lVar) {
        v3.i0 i0Var2 = this.f17576g;
        boolean z10 = i0Var2 == null;
        a4.d dVar = z10 ? null : i0Var2.f15459w;
        this.f17576g = i0Var;
        a4.d dVar2 = i0Var.f15459w;
        a4.h hVar = this.f17574d;
        lVar.f9560b = hVar != null ? i0Var.b(hVar.e(i0Var)) : i0Var;
        lVar.f9559a = this.f17577h;
        if (this.f17574d == null) {
            return;
        }
        if (z10 || !v5.e0.a(dVar, dVar2)) {
            a4.e eVar = this.f17577h;
            a4.e d10 = this.f17574d.d(this.f17575e, i0Var);
            this.f17577h = d10;
            lVar.f9559a = d10;
            if (eVar != null) {
                eVar.f(this.f17575e);
            }
        }
    }

    public final int u(l3.l lVar, z3.g gVar, int i10, boolean z10) {
        int i11;
        boolean z11 = (i10 & 2) != 0;
        a aVar = this.f17572b;
        synchronized (this) {
            gVar.f17533d = false;
            int i12 = this.f17588s;
            i11 = -5;
            if (i12 != this.f17585p) {
                v3.i0 i0Var = this.f17573c.b(this.f17586q + i12).f17598a;
                if (!z11 && i0Var == this.f17576g) {
                    int n2 = n(this.f17588s);
                    if (r(n2)) {
                        gVar.f17508a = this.f17582m[n2];
                        if (this.f17588s == this.f17585p - 1 && (z10 || this.f17591w)) {
                            gVar.l(536870912);
                        }
                        long j10 = this.f17583n[n2];
                        gVar.f17534e = j10;
                        if (j10 < this.t) {
                            gVar.l(Integer.MIN_VALUE);
                        }
                        aVar.f17595a = this.f17581l[n2];
                        aVar.f17596b = this.f17580k[n2];
                        aVar.f17597c = this.f17584o[n2];
                        i11 = -4;
                    } else {
                        gVar.f17533d = true;
                        i11 = -3;
                    }
                }
                t(i0Var, lVar);
            } else {
                if (!z10 && !this.f17591w) {
                    v3.i0 i0Var2 = this.B;
                    if (i0Var2 != null && (z11 || i0Var2 != this.f17576g)) {
                        t(i0Var2, lVar);
                    }
                    i11 = -3;
                }
                gVar.f17508a = 4;
                i11 = -4;
            }
        }
        if (i11 == -4 && !gVar.m(4)) {
            boolean z12 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                a0 a0Var = this.f17571a;
                a aVar2 = this.f17572b;
                if (z12) {
                    a0.f(a0Var.f17565e, gVar, aVar2, a0Var.f17563c);
                } else {
                    a0Var.f17565e = a0.f(a0Var.f17565e, gVar, aVar2, a0Var.f17563c);
                }
            }
            if (!z12) {
                this.f17588s++;
            }
        }
        return i11;
    }

    public final void v(boolean z10) {
        a0 a0Var = this.f17571a;
        a0Var.a(a0Var.f17564d);
        a0.a aVar = a0Var.f17564d;
        int i10 = a0Var.f17562b;
        x6.b.H(aVar.f17569c == null);
        aVar.f17567a = 0L;
        aVar.f17568b = i10 + 0;
        a0.a aVar2 = a0Var.f17564d;
        a0Var.f17565e = aVar2;
        a0Var.f = aVar2;
        a0Var.f17566g = 0L;
        ((t5.o) a0Var.f17561a).a();
        this.f17585p = 0;
        this.f17586q = 0;
        this.f17587r = 0;
        this.f17588s = 0;
        this.f17592x = true;
        this.t = Long.MIN_VALUE;
        this.f17589u = Long.MIN_VALUE;
        this.f17590v = Long.MIN_VALUE;
        this.f17591w = false;
        h0<b> h0Var = this.f17573c;
        for (int i11 = 0; i11 < h0Var.f17679b.size(); i11++) {
            h0Var.f17680c.accept(h0Var.f17679b.valueAt(i11));
        }
        h0Var.f17678a = -1;
        h0Var.f17679b.clear();
        if (z10) {
            this.A = null;
            this.B = null;
            this.f17593y = true;
        }
    }

    public final int w(t5.h hVar, int i10, boolean z10) {
        a0 a0Var = this.f17571a;
        int c10 = a0Var.c(i10);
        a0.a aVar = a0Var.f;
        t5.a aVar2 = aVar.f17569c;
        int read = hVar.read(aVar2.f14445a, ((int) (a0Var.f17566g - aVar.f17567a)) + aVar2.f14446b, c10);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j10 = a0Var.f17566g + read;
        a0Var.f17566g = j10;
        a0.a aVar3 = a0Var.f;
        if (j10 != aVar3.f17568b) {
            return read;
        }
        a0Var.f = aVar3.f17570d;
        return read;
    }

    public final synchronized boolean x(long j10, boolean z10) {
        synchronized (this) {
            this.f17588s = 0;
            a0 a0Var = this.f17571a;
            a0Var.f17565e = a0Var.f17564d;
        }
        int n2 = n(0);
        int i10 = this.f17588s;
        int i11 = this.f17585p;
        if ((i10 != i11) && j10 >= this.f17583n[n2] && (j10 <= this.f17590v || z10)) {
            int k10 = k(n2, i11 - i10, j10, true);
            if (k10 == -1) {
                return false;
            }
            this.t = j10;
            this.f17588s += k10;
            return true;
        }
        return false;
    }

    public final synchronized void y(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f17588s + i10 <= this.f17585p) {
                    z10 = true;
                    x6.b.q(z10);
                    this.f17588s += i10;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z10 = false;
        x6.b.q(z10);
        this.f17588s += i10;
    }
}
