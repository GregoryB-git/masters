package b5;

import a4.g;
import android.net.Uri;
import b5.i;
import com.google.android.exoplayer2.source.dash.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import t5.d0;
import t5.j0;
import t5.u;
import v3.i0;
import v5.e0;
import z4.a0;
import z4.b0;
import z4.c0;
import z4.d0;
import z4.q;
import z4.w;

/* loaded from: classes.dex */
public final class h<T extends i> implements c0, d0, d0.a<e>, d0.e {
    public long A;
    public long B;
    public int C;
    public b5.a D;
    public boolean E;

    /* renamed from: a, reason: collision with root package name */
    public final int f1871a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f1872b;

    /* renamed from: c, reason: collision with root package name */
    public final i0[] f1873c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f1874d;

    /* renamed from: e, reason: collision with root package name */
    public final T f1875e;
    public final d0.a<h<T>> f;

    /* renamed from: o, reason: collision with root package name */
    public final w.a f1876o;

    /* renamed from: p, reason: collision with root package name */
    public final t5.c0 f1877p;

    /* renamed from: q, reason: collision with root package name */
    public final t5.d0 f1878q;

    /* renamed from: r, reason: collision with root package name */
    public final g f1879r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList<b5.a> f1880s;
    public final List<b5.a> t;

    /* renamed from: u, reason: collision with root package name */
    public final b0 f1881u;

    /* renamed from: v, reason: collision with root package name */
    public final b0[] f1882v;

    /* renamed from: w, reason: collision with root package name */
    public final c f1883w;

    /* renamed from: x, reason: collision with root package name */
    public e f1884x;

    /* renamed from: y, reason: collision with root package name */
    public i0 f1885y;

    /* renamed from: z, reason: collision with root package name */
    public b<T> f1886z;

    public final class a implements c0 {

        /* renamed from: a, reason: collision with root package name */
        public final h<T> f1887a;

        /* renamed from: b, reason: collision with root package name */
        public final b0 f1888b;

        /* renamed from: c, reason: collision with root package name */
        public final int f1889c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f1890d;

        public a(h<T> hVar, b0 b0Var, int i10) {
            this.f1887a = hVar;
            this.f1888b = b0Var;
            this.f1889c = i10;
        }

        @Override // z4.c0
        public final void a() {
        }

        @Override // z4.c0
        public final boolean b() {
            return !h.this.x() && this.f1888b.q(h.this.E);
        }

        public final void c() {
            if (this.f1890d) {
                return;
            }
            h hVar = h.this;
            w.a aVar = hVar.f1876o;
            int[] iArr = hVar.f1872b;
            int i10 = this.f1889c;
            aVar.b(iArr[i10], hVar.f1873c[i10], 0, null, hVar.B);
            this.f1890d = true;
        }

        @Override // z4.c0
        public final int m(long j10) {
            if (h.this.x()) {
                return 0;
            }
            int o10 = this.f1888b.o(j10, h.this.E);
            b5.a aVar = h.this.D;
            if (aVar != null) {
                int e10 = aVar.e(this.f1889c + 1);
                b0 b0Var = this.f1888b;
                o10 = Math.min(o10, e10 - (b0Var.f17586q + b0Var.f17588s));
            }
            this.f1888b.y(o10);
            if (o10 > 0) {
                c();
            }
            return o10;
        }

        @Override // z4.c0
        public final int r(l3.l lVar, z3.g gVar, int i10) {
            if (h.this.x()) {
                return -3;
            }
            b5.a aVar = h.this.D;
            if (aVar != null) {
                int e10 = aVar.e(this.f1889c + 1);
                b0 b0Var = this.f1888b;
                if (e10 <= b0Var.f17586q + b0Var.f17588s) {
                    return -3;
                }
            }
            c();
            return this.f1888b.u(lVar, gVar, i10, h.this.E);
        }
    }

    public interface b<T extends i> {
    }

    public h(int i10, int[] iArr, i0[] i0VarArr, T t, d0.a<h<T>> aVar, t5.b bVar, long j10, a4.h hVar, g.a aVar2, t5.c0 c0Var, w.a aVar3) {
        this.f1871a = i10;
        int i11 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f1872b = iArr;
        this.f1873c = i0VarArr == null ? new i0[0] : i0VarArr;
        this.f1875e = t;
        this.f = aVar;
        this.f1876o = aVar3;
        this.f1877p = c0Var;
        this.f1878q = new t5.d0("ChunkSampleStream");
        this.f1879r = new g(0);
        ArrayList<b5.a> arrayList = new ArrayList<>();
        this.f1880s = arrayList;
        this.t = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f1882v = new b0[length];
        this.f1874d = new boolean[length];
        int i12 = length + 1;
        int[] iArr2 = new int[i12];
        b0[] b0VarArr = new b0[i12];
        hVar.getClass();
        aVar2.getClass();
        b0 b0Var = new b0(bVar, hVar, aVar2);
        this.f1881u = b0Var;
        iArr2[0] = i10;
        b0VarArr[0] = b0Var;
        while (i11 < length) {
            b0 b0Var2 = new b0(bVar, null, null);
            this.f1882v[i11] = b0Var2;
            int i13 = i11 + 1;
            b0VarArr[i13] = b0Var2;
            iArr2[i13] = this.f1872b[i11];
            i11 = i13;
        }
        this.f1883w = new c(iArr2, b0VarArr);
        this.A = j10;
        this.B = j10;
    }

    public final void A(b<T> bVar) {
        this.f1886z = bVar;
        b0 b0Var = this.f1881u;
        b0Var.h();
        a4.e eVar = b0Var.f17577h;
        if (eVar != null) {
            eVar.f(b0Var.f17575e);
            b0Var.f17577h = null;
            b0Var.f17576g = null;
        }
        for (b0 b0Var2 : this.f1882v) {
            b0Var2.h();
            a4.e eVar2 = b0Var2.f17577h;
            if (eVar2 != null) {
                eVar2.f(b0Var2.f17575e);
                b0Var2.f17577h = null;
                b0Var2.f17576g = null;
            }
        }
        this.f1878q.e(this);
    }

    public final void B(long j10) {
        b5.a aVar;
        boolean x10;
        this.B = j10;
        if (x()) {
            this.A = j10;
            return;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f1880s.size(); i11++) {
            aVar = this.f1880s.get(i11);
            long j11 = aVar.f1866g;
            if (j11 == j10 && aVar.f1838k == -9223372036854775807L) {
                break;
            } else {
                if (j11 > j10) {
                    break;
                }
            }
        }
        aVar = null;
        if (aVar != null) {
            b0 b0Var = this.f1881u;
            int e10 = aVar.e(0);
            synchronized (b0Var) {
                synchronized (b0Var) {
                    b0Var.f17588s = 0;
                    a0 a0Var = b0Var.f17571a;
                    a0Var.f17565e = a0Var.f17564d;
                }
            }
            int i12 = b0Var.f17586q;
            if (e10 >= i12 && e10 <= b0Var.f17585p + i12) {
                b0Var.t = Long.MIN_VALUE;
                b0Var.f17588s = e10 - i12;
                x10 = true;
            }
            x10 = false;
        } else {
            x10 = this.f1881u.x(j10, j10 < c());
        }
        if (x10) {
            b0 b0Var2 = this.f1881u;
            this.C = z(b0Var2.f17586q + b0Var2.f17588s, 0);
            b0[] b0VarArr = this.f1882v;
            int length = b0VarArr.length;
            while (i10 < length) {
                b0VarArr[i10].x(j10, true);
                i10++;
            }
            return;
        }
        this.A = j10;
        this.E = false;
        this.f1880s.clear();
        this.C = 0;
        if (this.f1878q.d()) {
            this.f1881u.h();
            b0[] b0VarArr2 = this.f1882v;
            int length2 = b0VarArr2.length;
            while (i10 < length2) {
                b0VarArr2[i10].h();
                i10++;
            }
            this.f1878q.b();
            return;
        }
        this.f1878q.f14471c = null;
        this.f1881u.v(false);
        for (b0 b0Var3 : this.f1882v) {
            b0Var3.v(false);
        }
    }

    @Override // z4.c0
    public final void a() {
        this.f1878q.a();
        this.f1881u.s();
        if (this.f1878q.d()) {
            return;
        }
        this.f1875e.a();
    }

    @Override // z4.c0
    public final boolean b() {
        return !x() && this.f1881u.q(this.E);
    }

    @Override // z4.d0
    public final long c() {
        if (x()) {
            return this.A;
        }
        if (this.E) {
            return Long.MIN_VALUE;
        }
        return v().f1867h;
    }

    @Override // z4.d0
    public final boolean d(long j10) {
        List<b5.a> list;
        long j11;
        int i10 = 0;
        if (this.E || this.f1878q.d() || this.f1878q.c()) {
            return false;
        }
        boolean x10 = x();
        if (x10) {
            list = Collections.emptyList();
            j11 = this.A;
        } else {
            list = this.t;
            j11 = v().f1867h;
        }
        this.f1875e.i(j10, j11, list, this.f1879r);
        g gVar = this.f1879r;
        boolean z10 = gVar.f1869a;
        e eVar = (e) gVar.f1870b;
        gVar.f1870b = null;
        gVar.f1869a = false;
        if (z10) {
            this.A = -9223372036854775807L;
            this.E = true;
            return true;
        }
        if (eVar == null) {
            return false;
        }
        this.f1884x = eVar;
        if (eVar instanceof b5.a) {
            b5.a aVar = (b5.a) eVar;
            if (x10) {
                long j12 = aVar.f1866g;
                long j13 = this.A;
                if (j12 != j13) {
                    this.f1881u.t = j13;
                    for (b0 b0Var : this.f1882v) {
                        b0Var.t = this.A;
                    }
                }
                this.A = -9223372036854775807L;
            }
            c cVar = this.f1883w;
            aVar.f1840m = cVar;
            int[] iArr = new int[cVar.f1846b.length];
            while (true) {
                b0[] b0VarArr = cVar.f1846b;
                if (i10 >= b0VarArr.length) {
                    break;
                }
                b0 b0Var2 = b0VarArr[i10];
                iArr[i10] = b0Var2.f17586q + b0Var2.f17585p;
                i10++;
            }
            aVar.f1841n = iArr;
            this.f1880s.add(aVar);
        } else if (eVar instanceof l) {
            ((l) eVar).f1900k = this.f1883w;
        }
        this.f1876o.n(new z4.n(eVar.f1861a, eVar.f1862b, this.f1878q.f(eVar, this, ((u) this.f1877p).b(eVar.f1863c))), eVar.f1863c, this.f1871a, eVar.f1864d, eVar.f1865e, eVar.f, eVar.f1866g, eVar.f1867h);
        return true;
    }

    @Override // t5.d0.e
    public final void f() {
        b0 b0Var = this.f1881u;
        b0Var.v(true);
        a4.e eVar = b0Var.f17577h;
        if (eVar != null) {
            eVar.f(b0Var.f17575e);
            b0Var.f17577h = null;
            b0Var.f17576g = null;
        }
        for (b0 b0Var2 : this.f1882v) {
            b0Var2.v(true);
            a4.e eVar2 = b0Var2.f17577h;
            if (eVar2 != null) {
                eVar2.f(b0Var2.f17575e);
                b0Var2.f17577h = null;
                b0Var2.f17576g = null;
            }
        }
        this.f1875e.release();
        b<T> bVar = this.f1886z;
        if (bVar != null) {
            com.google.android.exoplayer2.source.dash.b bVar2 = (com.google.android.exoplayer2.source.dash.b) bVar;
            synchronized (bVar2) {
                d.c remove = bVar2.f2601v.remove(this);
                if (remove != null) {
                    b0 b0Var3 = remove.f2641a;
                    b0Var3.v(true);
                    a4.e eVar3 = b0Var3.f17577h;
                    if (eVar3 != null) {
                        eVar3.f(b0Var3.f17575e);
                        b0Var3.f17577h = null;
                        b0Var3.f17576g = null;
                    }
                }
            }
        }
    }

    @Override // z4.d0
    public final long g() {
        long j10;
        if (this.E) {
            return Long.MIN_VALUE;
        }
        if (x()) {
            return this.A;
        }
        long j11 = this.B;
        b5.a v10 = v();
        if (!v10.d()) {
            if (this.f1880s.size() > 1) {
                v10 = this.f1880s.get(r2.size() - 2);
            } else {
                v10 = null;
            }
        }
        if (v10 != null) {
            j11 = Math.max(j11, v10.f1867h);
        }
        b0 b0Var = this.f1881u;
        synchronized (b0Var) {
            j10 = b0Var.f17590v;
        }
        return Math.max(j11, j10);
    }

    @Override // z4.d0
    public final void h(long j10) {
        if (this.f1878q.c() || x()) {
            return;
        }
        if (this.f1878q.d()) {
            e eVar = this.f1884x;
            eVar.getClass();
            boolean z10 = eVar instanceof b5.a;
            if (!(z10 && w(this.f1880s.size() - 1)) && this.f1875e.f(j10, eVar, this.t)) {
                this.f1878q.b();
                if (z10) {
                    this.D = (b5.a) eVar;
                    return;
                }
                return;
            }
            return;
        }
        int h10 = this.f1875e.h(j10, this.t);
        if (h10 < this.f1880s.size()) {
            x6.b.H(!this.f1878q.d());
            int size = this.f1880s.size();
            while (true) {
                if (h10 >= size) {
                    h10 = -1;
                    break;
                } else if (!w(h10)) {
                    break;
                } else {
                    h10++;
                }
            }
            if (h10 == -1) {
                return;
            }
            long j11 = v().f1867h;
            b5.a t = t(h10);
            if (this.f1880s.isEmpty()) {
                this.A = this.B;
            }
            this.E = false;
            w.a aVar = this.f1876o;
            aVar.p(new q(1, this.f1871a, null, 3, null, aVar.a(t.f1866g), aVar.a(j11)));
        }
    }

    @Override // z4.d0
    public final boolean isLoading() {
        return this.f1878q.d();
    }

    @Override // t5.d0.a
    public final void k(e eVar, long j10, long j11, boolean z10) {
        e eVar2 = eVar;
        this.f1884x = null;
        this.D = null;
        long j12 = eVar2.f1861a;
        j0 j0Var = eVar2.f1868i;
        Uri uri = j0Var.f14525c;
        z4.n nVar = new z4.n(j0Var.f14526d);
        this.f1877p.getClass();
        this.f1876o.e(nVar, eVar2.f1863c, this.f1871a, eVar2.f1864d, eVar2.f1865e, eVar2.f, eVar2.f1866g, eVar2.f1867h);
        if (z10) {
            return;
        }
        if (x()) {
            this.f1881u.v(false);
            for (b0 b0Var : this.f1882v) {
                b0Var.v(false);
            }
        } else if (eVar2 instanceof b5.a) {
            t(this.f1880s.size() - 1);
            if (this.f1880s.isEmpty()) {
                this.A = this.B;
            }
        }
        this.f.a(this);
    }

    @Override // z4.c0
    public final int m(long j10) {
        if (x()) {
            return 0;
        }
        int o10 = this.f1881u.o(j10, this.E);
        b5.a aVar = this.D;
        if (aVar != null) {
            int e10 = aVar.e(0);
            b0 b0Var = this.f1881u;
            o10 = Math.min(o10, e10 - (b0Var.f17586q + b0Var.f17588s));
        }
        this.f1881u.y(o10);
        y();
        return o10;
    }

    @Override // t5.d0.a
    public final void p(e eVar, long j10, long j11) {
        e eVar2 = eVar;
        this.f1884x = null;
        this.f1875e.j(eVar2);
        long j12 = eVar2.f1861a;
        j0 j0Var = eVar2.f1868i;
        Uri uri = j0Var.f14525c;
        z4.n nVar = new z4.n(j0Var.f14526d);
        this.f1877p.getClass();
        this.f1876o.h(nVar, eVar2.f1863c, this.f1871a, eVar2.f1864d, eVar2.f1865e, eVar2.f, eVar2.f1866g, eVar2.f1867h);
        this.f.a(this);
    }

    @Override // z4.c0
    public final int r(l3.l lVar, z3.g gVar, int i10) {
        if (x()) {
            return -3;
        }
        b5.a aVar = this.D;
        if (aVar != null) {
            int e10 = aVar.e(0);
            b0 b0Var = this.f1881u;
            if (e10 <= b0Var.f17586q + b0Var.f17588s) {
                return -3;
            }
        }
        y();
        return this.f1881u.u(lVar, gVar, i10, this.E);
    }

    public final void s(long j10, boolean z10) {
        long j11;
        if (x()) {
            return;
        }
        b0 b0Var = this.f1881u;
        int i10 = b0Var.f17586q;
        b0Var.g(j10, z10, true);
        b0 b0Var2 = this.f1881u;
        int i11 = b0Var2.f17586q;
        if (i11 > i10) {
            synchronized (b0Var2) {
                j11 = b0Var2.f17585p == 0 ? Long.MIN_VALUE : b0Var2.f17583n[b0Var2.f17587r];
            }
            int i12 = 0;
            while (true) {
                b0[] b0VarArr = this.f1882v;
                if (i12 >= b0VarArr.length) {
                    break;
                }
                b0VarArr[i12].g(j11, z10, this.f1874d[i12]);
                i12++;
            }
        }
        int min = Math.min(z(i11, 0), this.C);
        if (min > 0) {
            e0.N(0, min, this.f1880s);
            this.C -= min;
        }
    }

    public final b5.a t(int i10) {
        b5.a aVar = this.f1880s.get(i10);
        ArrayList<b5.a> arrayList = this.f1880s;
        e0.N(i10, arrayList.size(), arrayList);
        this.C = Math.max(this.C, this.f1880s.size());
        b0 b0Var = this.f1881u;
        int i11 = 0;
        while (true) {
            b0Var.j(aVar.e(i11));
            b0[] b0VarArr = this.f1882v;
            if (i11 >= b0VarArr.length) {
                return aVar;
            }
            b0Var = b0VarArr[i11];
            i11++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7  */
    @Override // t5.d0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final t5.d0.b u(b5.e r21, long r22, long r24, java.io.IOException r26, int r27) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            b5.e r1 = (b5.e) r1
            t5.j0 r2 = r1.f1868i
            long r2 = r2.f14524b
            boolean r4 = r1 instanceof b5.a
            java.util.ArrayList<b5.a> r5 = r0.f1880s
            int r5 = r5.size()
            int r5 = r5 + (-1)
            r6 = 0
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            r3 = 1
            r6 = 0
            if (r2 == 0) goto L27
            if (r4 == 0) goto L27
            boolean r2 = r0.w(r5)
            if (r2 != 0) goto L25
            goto L27
        L25:
            r2 = r6
            goto L28
        L27:
            r2 = r3
        L28:
            z4.n r8 = new z4.n
            t5.j0 r7 = r1.f1868i
            android.net.Uri r9 = r7.f14525c
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7 = r7.f14526d
            r8.<init>(r7)
            long r9 = r1.f1866g
            v5.e0.R(r9)
            long r9 = r1.f1867h
            v5.e0.R(r9)
            t5.c0$c r7 = new t5.c0$c
            r14 = r26
            r9 = r27
            r7.<init>(r14, r9)
            T extends b5.i r9 = r0.f1875e
            t5.c0 r10 = r0.f1877p
            boolean r9 = r9.g(r1, r2, r7, r10)
            r15 = 0
            if (r9 == 0) goto L77
            if (r2 == 0) goto L70
            t5.d0$b r2 = t5.d0.f14468e
            if (r4 == 0) goto L78
            b5.a r4 = r0.t(r5)
            if (r4 != r1) goto L5f
            r4 = r3
            goto L60
        L5f:
            r4 = r6
        L60:
            x6.b.H(r4)
            java.util.ArrayList<b5.a> r4 = r0.f1880s
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L78
            long r4 = r0.B
            r0.A = r4
            goto L78
        L70:
            java.lang.String r2 = "ChunkSampleStream"
            java.lang.String r4 = "Ignoring attempt to cancel non-cancelable load."
            v5.m.f(r2, r4)
        L77:
            r2 = r15
        L78:
            if (r2 != 0) goto L93
            t5.c0 r2 = r0.f1877p
            t5.u r2 = (t5.u) r2
            long r4 = r2.c(r7)
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r2 == 0) goto L91
            t5.d0$b r2 = new t5.d0$b
            r2.<init>(r6, r4)
            goto L93
        L91:
            t5.d0$b r2 = t5.d0.f
        L93:
            boolean r4 = r2.a()
            r3 = r3 ^ r4
            z4.w$a r7 = r0.f1876o
            int r9 = r1.f1863c
            int r10 = r0.f1871a
            v3.i0 r11 = r1.f1864d
            int r12 = r1.f1865e
            java.lang.Object r13 = r1.f
            long r4 = r1.f1866g
            r21 = r2
            long r1 = r1.f1867h
            r6 = r15
            r14 = r4
            r16 = r1
            r18 = r26
            r19 = r3
            r7.j(r8, r9, r10, r11, r12, r13, r14, r16, r18, r19)
            if (r3 == 0) goto Lc3
            r0.f1884x = r6
            t5.c0 r1 = r0.f1877p
            r1.getClass()
            z4.d0$a<b5.h<T extends b5.i>> r1 = r0.f
            r1.a(r0)
        Lc3:
            return r21
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.h.u(t5.d0$d, long, long, java.io.IOException, int):t5.d0$b");
    }

    public final b5.a v() {
        return this.f1880s.get(r0.size() - 1);
    }

    public final boolean w(int i10) {
        b0 b0Var;
        b5.a aVar = this.f1880s.get(i10);
        b0 b0Var2 = this.f1881u;
        if (b0Var2.f17586q + b0Var2.f17588s > aVar.e(0)) {
            return true;
        }
        int i11 = 0;
        do {
            b0[] b0VarArr = this.f1882v;
            if (i11 >= b0VarArr.length) {
                return false;
            }
            b0Var = b0VarArr[i11];
            i11++;
        } while (b0Var.f17586q + b0Var.f17588s <= aVar.e(i11));
        return true;
    }

    public final boolean x() {
        return this.A != -9223372036854775807L;
    }

    public final void y() {
        b0 b0Var = this.f1881u;
        int z10 = z(b0Var.f17586q + b0Var.f17588s, this.C - 1);
        while (true) {
            int i10 = this.C;
            if (i10 > z10) {
                return;
            }
            this.C = i10 + 1;
            b5.a aVar = this.f1880s.get(i10);
            i0 i0Var = aVar.f1864d;
            if (!i0Var.equals(this.f1885y)) {
                this.f1876o.b(this.f1871a, i0Var, aVar.f1865e, aVar.f, aVar.f1866g);
            }
            this.f1885y = i0Var;
        }
    }

    public final int z(int i10, int i11) {
        do {
            i11++;
            if (i11 >= this.f1880s.size()) {
                return this.f1880s.size() - 1;
            }
        } while (this.f1880s.get(i11).e(0) <= i10);
        return i11 - 1;
    }
}
