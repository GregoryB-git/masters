package x0;

import d0.AbstractC1203z;
import d0.C1194q;
import g0.AbstractC1297a;
import k0.C1441v0;
import k0.C1447y0;
import k0.d1;
import x0.C2125f;
import x0.InterfaceC2140v;

/* renamed from: x0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2124e implements InterfaceC2140v, InterfaceC2140v.a {

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC2140v f20719o;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC2140v.a f20720p;

    /* renamed from: q, reason: collision with root package name */
    public a[] f20721q = new a[0];

    /* renamed from: r, reason: collision with root package name */
    public long f20722r;

    /* renamed from: s, reason: collision with root package name */
    public long f20723s;

    /* renamed from: t, reason: collision with root package name */
    public long f20724t;

    /* renamed from: u, reason: collision with root package name */
    public C2125f.b f20725u;

    /* renamed from: x0.e$a */
    public final class a implements Q {

        /* renamed from: o, reason: collision with root package name */
        public final Q f20726o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f20727p;

        public a(Q q7) {
            this.f20726o = q7;
        }

        @Override // x0.Q
        public void a() {
            this.f20726o.a();
        }

        public void b() {
            this.f20727p = false;
        }

        @Override // x0.Q
        public boolean e() {
            return !C2124e.this.j() && this.f20726o.e();
        }

        @Override // x0.Q
        public int j(C1441v0 c1441v0, j0.i iVar, int i7) {
            if (C2124e.this.j()) {
                return -3;
            }
            if (this.f20727p) {
                iVar.w(4);
                return -4;
            }
            long f7 = C2124e.this.f();
            int j7 = this.f20726o.j(c1441v0, iVar, i7);
            if (j7 == -5) {
                C1194q c1194q = (C1194q) AbstractC1297a.e(c1441v0.f16024b);
                int i8 = c1194q.f12705E;
                if (i8 != 0 || c1194q.f12706F != 0) {
                    C2124e c2124e = C2124e.this;
                    if (c2124e.f20723s != 0) {
                        i8 = 0;
                    }
                    c1441v0.f16024b = c1194q.a().V(i8).W(c2124e.f20724t == Long.MIN_VALUE ? c1194q.f12706F : 0).K();
                }
                return -5;
            }
            long j8 = C2124e.this.f20724t;
            if (j8 == Long.MIN_VALUE || ((j7 != -4 || iVar.f15402t < j8) && !(j7 == -3 && f7 == Long.MIN_VALUE && !iVar.f15401s))) {
                return j7;
            }
            iVar.m();
            iVar.w(4);
            this.f20727p = true;
            return -4;
        }

        @Override // x0.Q
        public int m(long j7) {
            if (C2124e.this.j()) {
                return -3;
            }
            return this.f20726o.m(j7);
        }
    }

    public C2124e(InterfaceC2140v interfaceC2140v, boolean z7, long j7, long j8) {
        this.f20719o = interfaceC2140v;
        this.f20722r = z7 ? j7 : -9223372036854775807L;
        this.f20723s = j7;
        this.f20724t = j8;
    }

    public static boolean v(long j7, A0.y[] yVarArr) {
        if (j7 != 0) {
            for (A0.y yVar : yVarArr) {
                if (yVar != null) {
                    C1194q m7 = yVar.m();
                    if (!AbstractC1203z.a(m7.f12726n, m7.f12722j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final d1 a(long j7, d1 d1Var) {
        long q7 = g0.M.q(d1Var.f15703a, 0L, j7 - this.f20723s);
        long j8 = d1Var.f15704b;
        long j9 = this.f20724t;
        long q8 = g0.M.q(j8, 0L, j9 == Long.MIN_VALUE ? Long.MAX_VALUE : j9 - j7);
        return (q7 == d1Var.f15703a && q8 == d1Var.f15704b) ? d1Var : new d1(q7, q8);
    }

    @Override // x0.InterfaceC2140v, x0.S
    public boolean b() {
        return this.f20719o.b();
    }

    @Override // x0.InterfaceC2140v, x0.S
    public long c() {
        long c7 = this.f20719o.c();
        if (c7 != Long.MIN_VALUE) {
            long j7 = this.f20724t;
            if (j7 == Long.MIN_VALUE || c7 < j7) {
                return c7;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // x0.InterfaceC2140v
    public long d(long j7, d1 d1Var) {
        long j8 = this.f20723s;
        if (j7 == j8) {
            return j8;
        }
        return this.f20719o.d(j7, a(j7, d1Var));
    }

    @Override // x0.InterfaceC2140v, x0.S
    public long f() {
        long f7 = this.f20719o.f();
        if (f7 != Long.MIN_VALUE) {
            long j7 = this.f20724t;
            if (j7 == Long.MIN_VALUE || f7 < j7) {
                return f7;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // x0.InterfaceC2140v, x0.S
    public boolean g(C1447y0 c1447y0) {
        return this.f20719o.g(c1447y0);
    }

    @Override // x0.InterfaceC2140v, x0.S
    public void h(long j7) {
        this.f20719o.h(j7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (r2 > r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    @Override // x0.InterfaceC2140v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long i(A0.y[] r13, boolean[] r14, x0.Q[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            x0.e$a[] r2 = new x0.C2124e.a[r2]
            r0.f20721q = r2
            int r2 = r1.length
            x0.Q[] r9 = new x0.Q[r2]
            r10 = 0
            r2 = r10
        Lc:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L21
            x0.e$a[] r3 = r0.f20721q
            r4 = r1[r2]
            x0.e$a r4 = (x0.C2124e.a) r4
            r3[r2] = r4
            if (r4 == 0) goto L1c
            x0.Q r11 = r4.f20726o
        L1c:
            r9[r2] = r11
            int r2 = r2 + 1
            goto Lc
        L21:
            x0.v r2 = r0.f20719o
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.i(r3, r4, r5, r6, r7)
            boolean r4 = r12.j()
            if (r4 == 0) goto L43
            long r4 = r0.f20723s
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L43
            r6 = r13
            boolean r4 = v(r4, r13)
            if (r4 == 0) goto L43
            r4 = r2
            goto L48
        L43:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L48:
            r0.f20722r = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L63
            long r4 = r0.f20723s
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L61
            long r4 = r0.f20724t
            r6 = -9223372036854775808
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L63
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L61
            goto L63
        L61:
            r4 = r10
            goto L64
        L63:
            r4 = 1
        L64:
            g0.AbstractC1297a.f(r4)
        L67:
            int r4 = r1.length
            if (r10 >= r4) goto L8d
            r4 = r9[r10]
            if (r4 != 0) goto L73
            x0.e$a[] r4 = r0.f20721q
            r4[r10] = r11
            goto L84
        L73:
            x0.e$a[] r5 = r0.f20721q
            r6 = r5[r10]
            if (r6 == 0) goto L7d
            x0.Q r6 = r6.f20726o
            if (r6 == r4) goto L84
        L7d:
            x0.e$a r6 = new x0.e$a
            r6.<init>(r4)
            r5[r10] = r6
        L84:
            x0.e$a[] r4 = r0.f20721q
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L67
        L8d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.C2124e.i(A0.y[], boolean[], x0.Q[], boolean[], long):long");
    }

    public boolean j() {
        return this.f20722r != -9223372036854775807L;
    }

    @Override // x0.InterfaceC2140v.a
    public void k(InterfaceC2140v interfaceC2140v) {
        if (this.f20725u != null) {
            return;
        }
        ((InterfaceC2140v.a) AbstractC1297a.e(this.f20720p)).k(this);
    }

    @Override // x0.InterfaceC2140v
    public long l() {
        if (j()) {
            long j7 = this.f20722r;
            this.f20722r = -9223372036854775807L;
            long l7 = l();
            return l7 != -9223372036854775807L ? l7 : j7;
        }
        long l8 = this.f20719o.l();
        if (l8 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        AbstractC1297a.f(l8 >= this.f20723s);
        long j8 = this.f20724t;
        AbstractC1297a.f(j8 == Long.MIN_VALUE || l8 <= j8);
        return l8;
    }

    @Override // x0.InterfaceC2140v
    public Z n() {
        return this.f20719o.n();
    }

    @Override // x0.InterfaceC2140v
    public void p() {
        C2125f.b bVar = this.f20725u;
        if (bVar != null) {
            throw bVar;
        }
        this.f20719o.p();
    }

    @Override // x0.InterfaceC2140v
    public void q(long j7, boolean z7) {
        this.f20719o.q(j7, z7);
    }

    @Override // x0.S.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void e(InterfaceC2140v interfaceC2140v) {
        ((InterfaceC2140v.a) AbstractC1297a.e(this.f20720p)).e(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r0 > r6) goto L17;
     */
    @Override // x0.InterfaceC2140v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long s(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f20722r = r0
            x0.e$a[] r0 = r5.f20721q
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.b()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            x0.v r0 = r5.f20719o
            long r0 = r0.s(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L34
            long r6 = r5.f20723s
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L35
            long r6 = r5.f20724t
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L34
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L35
        L34:
            r2 = 1
        L35:
            g0.AbstractC1297a.f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.C2124e.s(long):long");
    }

    public void t(C2125f.b bVar) {
        this.f20725u = bVar;
    }

    @Override // x0.InterfaceC2140v
    public void u(InterfaceC2140v.a aVar, long j7) {
        this.f20720p = aVar;
        this.f20719o.u(this, j7);
    }

    public void w(long j7, long j8) {
        this.f20723s = j7;
        this.f20724t = j8;
    }
}
