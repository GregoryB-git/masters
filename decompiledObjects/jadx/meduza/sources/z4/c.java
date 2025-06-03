package z4;

import v3.i0;
import v3.n1;
import z4.d;
import z4.r;

/* loaded from: classes.dex */
public final class c implements r, r.a {

    /* renamed from: a, reason: collision with root package name */
    public final r f17600a;

    /* renamed from: b, reason: collision with root package name */
    public r.a f17601b;

    /* renamed from: c, reason: collision with root package name */
    public a[] f17602c = new a[0];

    /* renamed from: d, reason: collision with root package name */
    public long f17603d;

    /* renamed from: e, reason: collision with root package name */
    public long f17604e;
    public long f;

    /* renamed from: o, reason: collision with root package name */
    public d.b f17605o;

    public final class a implements c0 {

        /* renamed from: a, reason: collision with root package name */
        public final c0 f17606a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f17607b;

        public a(c0 c0Var) {
            this.f17606a = c0Var;
        }

        @Override // z4.c0
        public final void a() {
            this.f17606a.a();
        }

        @Override // z4.c0
        public final boolean b() {
            return !c.this.f() && this.f17606a.b();
        }

        @Override // z4.c0
        public final int m(long j10) {
            if (c.this.f()) {
                return -3;
            }
            return this.f17606a.m(j10);
        }

        @Override // z4.c0
        public final int r(l3.l lVar, z3.g gVar, int i10) {
            if (c.this.f()) {
                return -3;
            }
            if (this.f17607b) {
                gVar.f17508a = 4;
                return -4;
            }
            int r10 = this.f17606a.r(lVar, gVar, i10);
            if (r10 != -5) {
                c cVar = c.this;
                long j10 = cVar.f;
                if (j10 == Long.MIN_VALUE || ((r10 != -4 || gVar.f17534e < j10) && !(r10 == -3 && cVar.g() == Long.MIN_VALUE && !gVar.f17533d))) {
                    return r10;
                }
                gVar.o();
                gVar.f17508a = 4;
                this.f17607b = true;
                return -4;
            }
            v3.i0 i0Var = (v3.i0) lVar.f9560b;
            i0Var.getClass();
            int i11 = i0Var.J;
            if (i11 != 0 || i0Var.K != 0) {
                c cVar2 = c.this;
                if (cVar2.f17604e != 0) {
                    i11 = 0;
                }
                int i12 = cVar2.f == Long.MIN_VALUE ? i0Var.K : 0;
                i0.a a10 = i0Var.a();
                a10.A = i11;
                a10.B = i12;
                lVar.f9560b = a10.a();
            }
            return -5;
        }
    }

    public c(r rVar, boolean z10, long j10, long j11) {
        this.f17600a = rVar;
        this.f17603d = z10 ? j10 : -9223372036854775807L;
        this.f17604e = j10;
        this.f = j11;
    }

    @Override // z4.d0.a
    public final void a(r rVar) {
        r.a aVar = this.f17601b;
        aVar.getClass();
        aVar.a(this);
    }

    @Override // z4.r.a
    public final void b(r rVar) {
        if (this.f17605o != null) {
            return;
        }
        r.a aVar = this.f17601b;
        aVar.getClass();
        aVar.b(this);
    }

    @Override // z4.r, z4.d0
    public final long c() {
        long c10 = this.f17600a.c();
        if (c10 != Long.MIN_VALUE) {
            long j10 = this.f;
            if (j10 == Long.MIN_VALUE || c10 < j10) {
                return c10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // z4.r, z4.d0
    public final boolean d(long j10) {
        return this.f17600a.d(j10);
    }

    @Override // z4.r
    public final long e(long j10, n1 n1Var) {
        long j11 = this.f17604e;
        if (j10 == j11) {
            return j11;
        }
        long j12 = v5.e0.j(n1Var.f15526a, 0L, j10 - j11);
        long j13 = n1Var.f15527b;
        long j14 = this.f;
        long j15 = v5.e0.j(j13, 0L, j14 == Long.MIN_VALUE ? Long.MAX_VALUE : j14 - j10);
        if (j12 != n1Var.f15526a || j15 != n1Var.f15527b) {
            n1Var = new n1(j12, j15);
        }
        return this.f17600a.e(j10, n1Var);
    }

    public final boolean f() {
        return this.f17603d != -9223372036854775807L;
    }

    @Override // z4.r, z4.d0
    public final long g() {
        long g10 = this.f17600a.g();
        if (g10 != Long.MIN_VALUE) {
            long j10 = this.f;
            if (j10 == Long.MIN_VALUE || g10 < j10) {
                return g10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // z4.r, z4.d0
    public final void h(long j10) {
        this.f17600a.h(j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
    
        if (r1 > r5) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    @Override // z4.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long i(r5.h[] r16, boolean[] r17, z4.c0[] r18, boolean[] r19, long r20) {
        /*
            r15 = this;
            r0 = r15
            r8 = r16
            r9 = r18
            int r1 = r9.length
            z4.c$a[] r1 = new z4.c.a[r1]
            r0.f17602c = r1
            int r1 = r9.length
            z4.c0[] r10 = new z4.c0[r1]
            r11 = 0
            r1 = r11
        Lf:
            int r2 = r9.length
            r12 = 0
            if (r1 >= r2) goto L24
            z4.c$a[] r2 = r0.f17602c
            r3 = r9[r1]
            z4.c$a r3 = (z4.c.a) r3
            r2[r1] = r3
            if (r3 == 0) goto L1f
            z4.c0 r12 = r3.f17606a
        L1f:
            r10[r1] = r12
            int r1 = r1 + 1
            goto Lf
        L24:
            z4.r r1 = r0.f17600a
            r2 = r16
            r3 = r17
            r4 = r10
            r5 = r19
            r6 = r20
            long r1 = r1.i(r2, r3, r4, r5, r6)
            boolean r3 = r15.f()
            r4 = 1
            if (r3 == 0) goto L66
            long r5 = r0.f17604e
            int r3 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r3 != 0) goto L66
            r13 = 0
            int r3 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r3 == 0) goto L61
            int r3 = r8.length
            r5 = r11
        L48:
            if (r5 >= r3) goto L61
            r6 = r8[r5]
            if (r6 == 0) goto L5e
            v3.i0 r6 = r6.p()
            java.lang.String r7 = r6.t
            java.lang.String r6 = r6.f15454q
            boolean r6 = v5.p.a(r7, r6)
            if (r6 != 0) goto L5e
            r3 = r4
            goto L62
        L5e:
            int r5 = r5 + 1
            goto L48
        L61:
            r3 = r11
        L62:
            if (r3 == 0) goto L66
            r5 = r1
            goto L6b
        L66:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L6b:
            r0.f17603d = r5
            int r3 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r3 == 0) goto L85
            long r5 = r0.f17604e
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 < 0) goto L84
            long r5 = r0.f
            r7 = -9223372036854775808
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L85
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 > 0) goto L84
            goto L85
        L84:
            r4 = r11
        L85:
            x6.b.H(r4)
        L88:
            int r3 = r9.length
            if (r11 >= r3) goto Lae
            r3 = r10[r11]
            if (r3 != 0) goto L94
            z4.c$a[] r3 = r0.f17602c
            r3[r11] = r12
            goto La5
        L94:
            z4.c$a[] r4 = r0.f17602c
            r5 = r4[r11]
            if (r5 == 0) goto L9e
            z4.c0 r5 = r5.f17606a
            if (r5 == r3) goto La5
        L9e:
            z4.c$a r5 = new z4.c$a
            r5.<init>(r3)
            r4[r11] = r5
        La5:
            z4.c$a[] r3 = r0.f17602c
            r3 = r3[r11]
            r9[r11] = r3
            int r11 = r11 + 1
            goto L88
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.c.i(r5.h[], boolean[], z4.c0[], boolean[], long):long");
    }

    @Override // z4.r, z4.d0
    public final boolean isLoading() {
        return this.f17600a.isLoading();
    }

    @Override // z4.r
    public final void j() {
        d.b bVar = this.f17605o;
        if (bVar != null) {
            throw bVar;
        }
        this.f17600a.j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r0 > r6) goto L17;
     */
    @Override // z4.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long l(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f17603d = r0
            z4.c$a[] r0 = r5.f17602c
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.f17607b = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            z4.r r0 = r5.f17600a
            long r0 = r0.l(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L33
            long r6 = r5.f17604e
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L34
            long r6 = r5.f
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L33
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L34
        L33:
            r2 = 1
        L34:
            x6.b.H(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.c.l(long):long");
    }

    @Override // z4.r
    public final void n(r.a aVar, long j10) {
        this.f17601b = aVar;
        this.f17600a.n(this, j10);
    }

    @Override // z4.r
    public final long o() {
        if (f()) {
            long j10 = this.f17603d;
            this.f17603d = -9223372036854775807L;
            long o10 = o();
            return o10 != -9223372036854775807L ? o10 : j10;
        }
        long o11 = this.f17600a.o();
        if (o11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z10 = true;
        x6.b.H(o11 >= this.f17604e);
        long j11 = this.f;
        if (j11 != Long.MIN_VALUE && o11 > j11) {
            z10 = false;
        }
        x6.b.H(z10);
        return o11;
    }

    @Override // z4.r
    public final j0 q() {
        return this.f17600a.q();
    }

    @Override // z4.r
    public final void s(long j10, boolean z10) {
        this.f17600a.s(j10, z10);
    }
}
