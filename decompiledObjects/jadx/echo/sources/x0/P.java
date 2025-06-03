package x0;

import F0.T;
import d0.AbstractC1203z;
import d0.C1190m;
import d0.C1194q;
import d0.InterfaceC1186i;
import g0.AbstractC1297a;
import g0.InterfaceC1303g;
import k0.C1441v0;
import p0.InterfaceC1782n;
import p0.v;
import p0.x;
import x0.P;

/* loaded from: classes.dex */
public class P implements F0.T {

    /* renamed from: A, reason: collision with root package name */
    public C1194q f20627A;

    /* renamed from: B, reason: collision with root package name */
    public C1194q f20628B;

    /* renamed from: C, reason: collision with root package name */
    public long f20629C;

    /* renamed from: E, reason: collision with root package name */
    public boolean f20631E;

    /* renamed from: F, reason: collision with root package name */
    public long f20632F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f20633G;

    /* renamed from: a, reason: collision with root package name */
    public final N f20634a;

    /* renamed from: d, reason: collision with root package name */
    public final p0.x f20637d;

    /* renamed from: e, reason: collision with root package name */
    public final v.a f20638e;

    /* renamed from: f, reason: collision with root package name */
    public d f20639f;

    /* renamed from: g, reason: collision with root package name */
    public C1194q f20640g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1782n f20641h;

    /* renamed from: p, reason: collision with root package name */
    public int f20649p;

    /* renamed from: q, reason: collision with root package name */
    public int f20650q;

    /* renamed from: r, reason: collision with root package name */
    public int f20651r;

    /* renamed from: s, reason: collision with root package name */
    public int f20652s;

    /* renamed from: w, reason: collision with root package name */
    public boolean f20656w;

    /* renamed from: z, reason: collision with root package name */
    public boolean f20659z;

    /* renamed from: b, reason: collision with root package name */
    public final b f20635b = new b();

    /* renamed from: i, reason: collision with root package name */
    public int f20642i = 1000;

    /* renamed from: j, reason: collision with root package name */
    public long[] f20643j = new long[1000];

    /* renamed from: k, reason: collision with root package name */
    public long[] f20644k = new long[1000];

    /* renamed from: n, reason: collision with root package name */
    public long[] f20647n = new long[1000];

    /* renamed from: m, reason: collision with root package name */
    public int[] f20646m = new int[1000];

    /* renamed from: l, reason: collision with root package name */
    public int[] f20645l = new int[1000];

    /* renamed from: o, reason: collision with root package name */
    public T.a[] f20648o = new T.a[1000];

    /* renamed from: c, reason: collision with root package name */
    public final W f20636c = new W(new InterfaceC1303g() { // from class: x0.O
        @Override // g0.InterfaceC1303g
        public final void accept(Object obj) {
            P.M((P.c) obj);
        }
    });

    /* renamed from: t, reason: collision with root package name */
    public long f20653t = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    public long f20654u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    public long f20655v = Long.MIN_VALUE;

    /* renamed from: y, reason: collision with root package name */
    public boolean f20658y = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f20657x = true;

    /* renamed from: D, reason: collision with root package name */
    public boolean f20630D = true;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f20660a;

        /* renamed from: b, reason: collision with root package name */
        public long f20661b;

        /* renamed from: c, reason: collision with root package name */
        public T.a f20662c;
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final C1194q f20663a;

        /* renamed from: b, reason: collision with root package name */
        public final x.b f20664b;

        public c(C1194q c1194q, x.b bVar) {
            this.f20663a = c1194q;
            this.f20664b = bVar;
        }
    }

    public interface d {
        void m(C1194q c1194q);
    }

    public P(B0.b bVar, p0.x xVar, v.a aVar) {
        this.f20637d = xVar;
        this.f20638e = aVar;
        this.f20634a = new N(bVar);
    }

    public static /* synthetic */ void M(c cVar) {
        cVar.f20664b.release();
    }

    public static P k(B0.b bVar, p0.x xVar, v.a aVar) {
        return new P(bVar, (p0.x) AbstractC1297a.e(xVar), (v.a) AbstractC1297a.e(aVar));
    }

    public static P l(B0.b bVar) {
        return new P(bVar, null, null);
    }

    public final synchronized long A() {
        return this.f20655v;
    }

    public final synchronized long B() {
        return Math.max(this.f20654u, C(this.f20652s));
    }

    public final long C(int i7) {
        long j7 = Long.MIN_VALUE;
        if (i7 == 0) {
            return Long.MIN_VALUE;
        }
        int E6 = E(i7 - 1);
        for (int i8 = 0; i8 < i7; i8++) {
            j7 = Math.max(j7, this.f20647n[E6]);
            if ((this.f20646m[E6] & 1) != 0) {
                break;
            }
            E6--;
            if (E6 == -1) {
                E6 = this.f20642i - 1;
            }
        }
        return j7;
    }

    public final int D() {
        return this.f20650q + this.f20652s;
    }

    public final int E(int i7) {
        int i8 = this.f20651r + i7;
        int i9 = this.f20642i;
        return i8 < i9 ? i8 : i8 - i9;
    }

    public final synchronized int F(long j7, boolean z7) {
        int E6 = E(this.f20652s);
        if (I() && j7 >= this.f20647n[E6]) {
            if (j7 > this.f20655v && z7) {
                return this.f20649p - this.f20652s;
            }
            int w7 = w(E6, this.f20649p - this.f20652s, j7, true);
            if (w7 == -1) {
                return 0;
            }
            return w7;
        }
        return 0;
    }

    public final synchronized C1194q G() {
        return this.f20658y ? null : this.f20628B;
    }

    public final int H() {
        return this.f20650q + this.f20649p;
    }

    public final boolean I() {
        return this.f20652s != this.f20649p;
    }

    public final void J() {
        this.f20659z = true;
    }

    public final synchronized boolean K() {
        return this.f20656w;
    }

    public synchronized boolean L(boolean z7) {
        C1194q c1194q;
        boolean z8 = true;
        if (I()) {
            if (((c) this.f20636c.e(D())).f20663a != this.f20640g) {
                return true;
            }
            return N(E(this.f20652s));
        }
        if (!z7 && !this.f20656w && ((c1194q = this.f20628B) == null || c1194q == this.f20640g)) {
            z8 = false;
        }
        return z8;
    }

    public final boolean N(int i7) {
        InterfaceC1782n interfaceC1782n = this.f20641h;
        return interfaceC1782n == null || interfaceC1782n.getState() == 4 || ((this.f20646m[i7] & 1073741824) == 0 && this.f20641h.b());
    }

    public void O() {
        InterfaceC1782n interfaceC1782n = this.f20641h;
        if (interfaceC1782n != null && interfaceC1782n.getState() == 1) {
            throw ((InterfaceC1782n.a) AbstractC1297a.e(this.f20641h.g()));
        }
    }

    public final void P(C1194q c1194q, C1441v0 c1441v0) {
        C1194q c1194q2 = this.f20640g;
        boolean z7 = c1194q2 == null;
        C1190m c1190m = c1194q2 == null ? null : c1194q2.f12730r;
        this.f20640g = c1194q;
        C1190m c1190m2 = c1194q.f12730r;
        p0.x xVar = this.f20637d;
        c1441v0.f16024b = xVar != null ? c1194q.b(xVar.b(c1194q)) : c1194q;
        c1441v0.f16023a = this.f20641h;
        if (this.f20637d == null) {
            return;
        }
        if (z7 || !g0.M.c(c1190m, c1190m2)) {
            InterfaceC1782n interfaceC1782n = this.f20641h;
            InterfaceC1782n c7 = this.f20637d.c(this.f20638e, c1194q);
            this.f20641h = c7;
            c1441v0.f16023a = c7;
            if (interfaceC1782n != null) {
                interfaceC1782n.e(this.f20638e);
            }
        }
    }

    public final synchronized int Q(C1441v0 c1441v0, j0.i iVar, boolean z7, boolean z8, b bVar) {
        try {
            iVar.f15401s = false;
            if (!I()) {
                if (!z8 && !this.f20656w) {
                    C1194q c1194q = this.f20628B;
                    if (c1194q == null || (!z7 && c1194q == this.f20640g)) {
                        return -3;
                    }
                    P((C1194q) AbstractC1297a.e(c1194q), c1441v0);
                    return -5;
                }
                iVar.w(4);
                iVar.f15402t = Long.MIN_VALUE;
                return -4;
            }
            C1194q c1194q2 = ((c) this.f20636c.e(D())).f20663a;
            if (!z7 && c1194q2 == this.f20640g) {
                int E6 = E(this.f20652s);
                if (!N(E6)) {
                    iVar.f15401s = true;
                    return -3;
                }
                iVar.w(this.f20646m[E6]);
                if (this.f20652s == this.f20649p - 1 && (z8 || this.f20656w)) {
                    iVar.l(536870912);
                }
                iVar.f15402t = this.f20647n[E6];
                bVar.f20660a = this.f20645l[E6];
                bVar.f20661b = this.f20644k[E6];
                bVar.f20662c = this.f20648o[E6];
                return -4;
            }
            P(c1194q2, c1441v0);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long R() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return I() ? this.f20643j[E(this.f20652s)] : this.f20629C;
    }

    public void S() {
        r();
        V();
    }

    public int T(C1441v0 c1441v0, j0.i iVar, int i7, boolean z7) {
        int Q6 = Q(c1441v0, iVar, (i7 & 2) != 0, z7, this.f20635b);
        if (Q6 == -4 && !iVar.p()) {
            boolean z8 = (i7 & 1) != 0;
            if ((i7 & 4) == 0) {
                N n7 = this.f20634a;
                b bVar = this.f20635b;
                if (z8) {
                    n7.f(iVar, bVar);
                } else {
                    n7.m(iVar, bVar);
                }
            }
            if (!z8) {
                this.f20652s++;
            }
        }
        return Q6;
    }

    public void U() {
        X(true);
        V();
    }

    public final void V() {
        InterfaceC1782n interfaceC1782n = this.f20641h;
        if (interfaceC1782n != null) {
            interfaceC1782n.e(this.f20638e);
            this.f20641h = null;
            this.f20640g = null;
        }
    }

    public final void W() {
        X(false);
    }

    public void X(boolean z7) {
        this.f20634a.n();
        this.f20649p = 0;
        this.f20650q = 0;
        this.f20651r = 0;
        this.f20652s = 0;
        this.f20657x = true;
        this.f20653t = Long.MIN_VALUE;
        this.f20654u = Long.MIN_VALUE;
        this.f20655v = Long.MIN_VALUE;
        this.f20656w = false;
        this.f20636c.b();
        if (z7) {
            this.f20627A = null;
            this.f20628B = null;
            this.f20658y = true;
            this.f20630D = true;
        }
    }

    public final synchronized void Y() {
        this.f20652s = 0;
        this.f20634a.o();
    }

    public final synchronized boolean Z(int i7) {
        Y();
        int i8 = this.f20650q;
        if (i7 >= i8 && i7 <= this.f20649p + i8) {
            this.f20653t = Long.MIN_VALUE;
            this.f20652s = i7 - i8;
            return true;
        }
        return false;
    }

    @Override // F0.T
    public final void a(g0.z zVar, int i7, int i8) {
        this.f20634a.q(zVar, i7);
    }

    public final synchronized boolean a0(long j7, boolean z7) {
        try {
            Y();
            int E6 = E(this.f20652s);
            if (I() && j7 >= this.f20647n[E6] && (j7 <= this.f20655v || z7)) {
                int v7 = this.f20630D ? v(E6, this.f20649p - this.f20652s, j7, z7) : w(E6, this.f20649p - this.f20652s, j7, true);
                if (v7 == -1) {
                    return false;
                }
                this.f20653t = j7;
                this.f20652s += v7;
                return true;
            }
            return false;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    @Override // F0.T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(long r12, int r14, int r15, int r16, F0.T.a r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.f20659z
            if (r0 == 0) goto L10
            d0.q r0 = r8.f20627A
            java.lang.Object r0 = g0.AbstractC1297a.h(r0)
            d0.q r0 = (d0.C1194q) r0
            r11.d(r0)
        L10:
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            r3 = r2
            goto L19
        L18:
            r3 = r1
        L19:
            boolean r4 = r8.f20657x
            if (r4 == 0) goto L22
            if (r3 != 0) goto L20
            return
        L20:
            r8.f20657x = r1
        L22:
            long r4 = r8.f20632F
            long r4 = r4 + r12
            boolean r6 = r8.f20630D
            if (r6 == 0) goto L54
            long r6 = r8.f20653t
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L30
            return
        L30:
            if (r0 != 0) goto L54
            boolean r0 = r8.f20631E
            if (r0 != 0) goto L50
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r0.append(r6)
            d0.q r6 = r8.f20628B
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "SampleQueue"
            g0.o.h(r6, r0)
            r8.f20631E = r2
        L50:
            r0 = r14 | 1
            r6 = r0
            goto L55
        L54:
            r6 = r14
        L55:
            boolean r0 = r8.f20633G
            if (r0 == 0) goto L66
            if (r3 == 0) goto L65
            boolean r0 = r11.h(r4)
            if (r0 != 0) goto L62
            goto L65
        L62:
            r8.f20633G = r1
            goto L66
        L65:
            return
        L66:
            x0.N r0 = r8.f20634a
            long r0 = r0.e()
            r7 = r15
            long r2 = (long) r7
            long r0 = r0 - r2
            r2 = r16
            long r2 = (long) r2
            long r9 = r0 - r2
            r0 = r11
            r1 = r4
            r3 = r6
            r4 = r9
            r6 = r15
            r7 = r17
            r0.i(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.P.b(long, int, int, int, F0.T$a):void");
    }

    public final void b0(long j7) {
        if (this.f20632F != j7) {
            this.f20632F = j7;
            J();
        }
    }

    @Override // F0.T
    public final int c(InterfaceC1186i interfaceC1186i, int i7, boolean z7, int i8) {
        return this.f20634a.p(interfaceC1186i, i7, z7);
    }

    public final void c0(long j7) {
        this.f20653t = j7;
    }

    @Override // F0.T
    public final void d(C1194q c1194q) {
        C1194q x7 = x(c1194q);
        this.f20659z = false;
        this.f20627A = c1194q;
        boolean d02 = d0(x7);
        d dVar = this.f20639f;
        if (dVar == null || !d02) {
            return;
        }
        dVar.m(x7);
    }

    public final synchronized boolean d0(C1194q c1194q) {
        try {
            this.f20658y = false;
            if (g0.M.c(c1194q, this.f20628B)) {
                return false;
            }
            if (!this.f20636c.g() && ((c) this.f20636c.f()).f20663a.equals(c1194q)) {
                c1194q = ((c) this.f20636c.f()).f20663a;
            }
            this.f20628B = c1194q;
            boolean z7 = this.f20630D;
            C1194q c1194q2 = this.f20628B;
            this.f20630D = z7 & AbstractC1203z.a(c1194q2.f12726n, c1194q2.f12722j);
            this.f20631E = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // F0.T
    public /* synthetic */ void e(g0.z zVar, int i7) {
        F0.S.b(this, zVar, i7);
    }

    public final void e0(d dVar) {
        this.f20639f = dVar;
    }

    @Override // F0.T
    public /* synthetic */ int f(InterfaceC1186i interfaceC1186i, int i7, boolean z7) {
        return F0.S.a(this, interfaceC1186i, i7, z7);
    }

    public final synchronized void f0(int i7) {
        boolean z7;
        if (i7 >= 0) {
            try {
                if (this.f20652s + i7 <= this.f20649p) {
                    z7 = true;
                    AbstractC1297a.a(z7);
                    this.f20652s += i7;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z7 = false;
        AbstractC1297a.a(z7);
        this.f20652s += i7;
    }

    public final void g0(long j7) {
        this.f20629C = j7;
    }

    public final synchronized boolean h(long j7) {
        if (this.f20649p == 0) {
            return j7 > this.f20654u;
        }
        if (B() >= j7) {
            return false;
        }
        t(this.f20650q + j(j7));
        return true;
    }

    public final void h0() {
        this.f20633G = true;
    }

    public final synchronized void i(long j7, int i7, long j8, int i8, T.a aVar) {
        try {
            int i9 = this.f20649p;
            if (i9 > 0) {
                int E6 = E(i9 - 1);
                AbstractC1297a.a(this.f20644k[E6] + ((long) this.f20645l[E6]) <= j8);
            }
            this.f20656w = (536870912 & i7) != 0;
            this.f20655v = Math.max(this.f20655v, j7);
            int E7 = E(this.f20649p);
            this.f20647n[E7] = j7;
            this.f20644k[E7] = j8;
            this.f20645l[E7] = i8;
            this.f20646m[E7] = i7;
            this.f20648o[E7] = aVar;
            this.f20643j[E7] = this.f20629C;
            if (this.f20636c.g() || !((c) this.f20636c.f()).f20663a.equals(this.f20628B)) {
                C1194q c1194q = (C1194q) AbstractC1297a.e(this.f20628B);
                p0.x xVar = this.f20637d;
                this.f20636c.a(H(), new c(c1194q, xVar != null ? xVar.d(this.f20638e, c1194q) : x.b.f18349a));
            }
            int i10 = this.f20649p + 1;
            this.f20649p = i10;
            int i11 = this.f20642i;
            if (i10 == i11) {
                int i12 = i11 + 1000;
                long[] jArr = new long[i12];
                long[] jArr2 = new long[i12];
                long[] jArr3 = new long[i12];
                int[] iArr = new int[i12];
                int[] iArr2 = new int[i12];
                T.a[] aVarArr = new T.a[i12];
                int i13 = this.f20651r;
                int i14 = i11 - i13;
                System.arraycopy(this.f20644k, i13, jArr2, 0, i14);
                System.arraycopy(this.f20647n, this.f20651r, jArr3, 0, i14);
                System.arraycopy(this.f20646m, this.f20651r, iArr, 0, i14);
                System.arraycopy(this.f20645l, this.f20651r, iArr2, 0, i14);
                System.arraycopy(this.f20648o, this.f20651r, aVarArr, 0, i14);
                System.arraycopy(this.f20643j, this.f20651r, jArr, 0, i14);
                int i15 = this.f20651r;
                System.arraycopy(this.f20644k, 0, jArr2, i14, i15);
                System.arraycopy(this.f20647n, 0, jArr3, i14, i15);
                System.arraycopy(this.f20646m, 0, iArr, i14, i15);
                System.arraycopy(this.f20645l, 0, iArr2, i14, i15);
                System.arraycopy(this.f20648o, 0, aVarArr, i14, i15);
                System.arraycopy(this.f20643j, 0, jArr, i14, i15);
                this.f20644k = jArr2;
                this.f20647n = jArr3;
                this.f20646m = iArr;
                this.f20645l = iArr2;
                this.f20648o = aVarArr;
                this.f20643j = jArr;
                this.f20651r = 0;
                this.f20642i = i12;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final int j(long j7) {
        int i7 = this.f20649p;
        int E6 = E(i7 - 1);
        while (i7 > this.f20652s && this.f20647n[E6] >= j7) {
            i7--;
            E6--;
            if (E6 == -1) {
                E6 = this.f20642i - 1;
            }
        }
        return i7;
    }

    public final synchronized long m(long j7, boolean z7, boolean z8) {
        int i7;
        try {
            int i8 = this.f20649p;
            if (i8 != 0) {
                long[] jArr = this.f20647n;
                int i9 = this.f20651r;
                if (j7 >= jArr[i9]) {
                    if (z8 && (i7 = this.f20652s) != i8) {
                        i8 = i7 + 1;
                    }
                    int w7 = w(i9, i8, j7, z7);
                    if (w7 == -1) {
                        return -1L;
                    }
                    return p(w7);
                }
            }
            return -1L;
        } finally {
        }
    }

    public final synchronized long n() {
        int i7 = this.f20649p;
        if (i7 == 0) {
            return -1L;
        }
        return p(i7);
    }

    public synchronized long o() {
        int i7 = this.f20652s;
        if (i7 == 0) {
            return -1L;
        }
        return p(i7);
    }

    public final long p(int i7) {
        this.f20654u = Math.max(this.f20654u, C(i7));
        this.f20649p -= i7;
        int i8 = this.f20650q + i7;
        this.f20650q = i8;
        int i9 = this.f20651r + i7;
        this.f20651r = i9;
        int i10 = this.f20642i;
        if (i9 >= i10) {
            this.f20651r = i9 - i10;
        }
        int i11 = this.f20652s - i7;
        this.f20652s = i11;
        if (i11 < 0) {
            this.f20652s = 0;
        }
        this.f20636c.d(i8);
        if (this.f20649p != 0) {
            return this.f20644k[this.f20651r];
        }
        int i12 = this.f20651r;
        if (i12 == 0) {
            i12 = this.f20642i;
        }
        return this.f20644k[i12 - 1] + this.f20645l[r6];
    }

    public final void q(long j7, boolean z7, boolean z8) {
        this.f20634a.b(m(j7, z7, z8));
    }

    public final void r() {
        this.f20634a.b(n());
    }

    public final void s() {
        this.f20634a.b(o());
    }

    public final long t(int i7) {
        int H6 = H() - i7;
        boolean z7 = false;
        AbstractC1297a.a(H6 >= 0 && H6 <= this.f20649p - this.f20652s);
        int i8 = this.f20649p - H6;
        this.f20649p = i8;
        this.f20655v = Math.max(this.f20654u, C(i8));
        if (H6 == 0 && this.f20656w) {
            z7 = true;
        }
        this.f20656w = z7;
        this.f20636c.c(i7);
        int i9 = this.f20649p;
        if (i9 == 0) {
            return 0L;
        }
        return this.f20644k[E(i9 - 1)] + this.f20645l[r9];
    }

    public final void u(int i7) {
        this.f20634a.c(t(i7));
    }

    public final int v(int i7, int i8, long j7, boolean z7) {
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f20647n[i7] >= j7) {
                return i9;
            }
            i7++;
            if (i7 == this.f20642i) {
                i7 = 0;
            }
        }
        if (z7) {
            return i8;
        }
        return -1;
    }

    public final int w(int i7, int i8, long j7, boolean z7) {
        int i9 = -1;
        for (int i10 = 0; i10 < i8; i10++) {
            long j8 = this.f20647n[i7];
            if (j8 > j7) {
                return i9;
            }
            if (!z7 || (this.f20646m[i7] & 1) != 0) {
                if (j8 == j7) {
                    return i10;
                }
                i9 = i10;
            }
            i7++;
            if (i7 == this.f20642i) {
                i7 = 0;
            }
        }
        return i9;
    }

    public C1194q x(C1194q c1194q) {
        return (this.f20632F == 0 || c1194q.f12731s == Long.MAX_VALUE) ? c1194q : c1194q.a().s0(c1194q.f12731s + this.f20632F).K();
    }

    public final int y() {
        return this.f20650q;
    }

    public final synchronized long z() {
        return this.f20649p == 0 ? Long.MIN_VALUE : this.f20647n[this.f20651r];
    }
}
