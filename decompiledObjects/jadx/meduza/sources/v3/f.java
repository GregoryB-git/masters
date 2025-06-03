package v3;

import o4.p;
import v3.i0;

/* loaded from: classes.dex */
public abstract class f implements j1, k1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f15330a;

    /* renamed from: c, reason: collision with root package name */
    public l1 f15332c;

    /* renamed from: d, reason: collision with root package name */
    public int f15333d;

    /* renamed from: e, reason: collision with root package name */
    public w3.a0 f15334e;
    public int f;

    /* renamed from: o, reason: collision with root package name */
    public z4.c0 f15335o;

    /* renamed from: p, reason: collision with root package name */
    public i0[] f15336p;

    /* renamed from: q, reason: collision with root package name */
    public long f15337q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f15339s;
    public boolean t;

    /* renamed from: b, reason: collision with root package name */
    public final l3.l f15331b = new l3.l(1);

    /* renamed from: r, reason: collision with root package name */
    public long f15338r = Long.MIN_VALUE;

    public f(int i10) {
        this.f15330a = i10;
    }

    public final n A(p.b bVar, i0 i0Var) {
        return z(4002, i0Var, bVar, false);
    }

    public abstract void B();

    public void C(boolean z10, boolean z11) {
    }

    public abstract void D(long j10, boolean z10);

    public void E() {
    }

    public void F() {
    }

    public void G() {
    }

    public abstract void H(i0[] i0VarArr, long j10, long j11);

    public final int I(l3.l lVar, z3.g gVar, int i10) {
        z4.c0 c0Var = this.f15335o;
        c0Var.getClass();
        int r10 = c0Var.r(lVar, gVar, i10);
        if (r10 == -4) {
            if (gVar.m(4)) {
                this.f15338r = Long.MIN_VALUE;
                return this.f15339s ? -4 : -3;
            }
            long j10 = gVar.f17534e + this.f15337q;
            gVar.f17534e = j10;
            this.f15338r = Math.max(this.f15338r, j10);
        } else if (r10 == -5) {
            i0 i0Var = (i0) lVar.f9560b;
            i0Var.getClass();
            if (i0Var.f15460x != Long.MAX_VALUE) {
                i0.a a10 = i0Var.a();
                a10.f15476o = i0Var.f15460x + this.f15337q;
                lVar.f9560b = a10.a();
            }
        }
        return r10;
    }

    @Override // v3.j1
    public final int e() {
        return this.f;
    }

    @Override // v3.j1
    public final void g() {
        x6.b.H(this.f == 1);
        l3.l lVar = this.f15331b;
        lVar.f9559a = null;
        lVar.f9560b = null;
        this.f = 0;
        this.f15335o = null;
        this.f15336p = null;
        this.f15339s = false;
        B();
    }

    @Override // v3.j1
    public final boolean h() {
        return this.f15338r == Long.MIN_VALUE;
    }

    @Override // v3.j1
    public final void i(int i10, w3.a0 a0Var) {
        this.f15333d = i10;
        this.f15334e = a0Var;
    }

    @Override // v3.j1
    public final void j() {
        this.f15339s = true;
    }

    @Override // v3.j1
    public final f k() {
        return this;
    }

    @Override // v3.j1
    public /* synthetic */ void m(float f, float f10) {
    }

    @Override // v3.j1
    public final void n(i0[] i0VarArr, z4.c0 c0Var, long j10, long j11) {
        x6.b.H(!this.f15339s);
        this.f15335o = c0Var;
        if (this.f15338r == Long.MIN_VALUE) {
            this.f15338r = j10;
        }
        this.f15336p = i0VarArr;
        this.f15337q = j11;
        H(i0VarArr, j10, j11);
    }

    public int o() {
        return 0;
    }

    @Override // v3.g1.b
    public void q(int i10, Object obj) {
    }

    @Override // v3.j1
    public final z4.c0 r() {
        return this.f15335o;
    }

    @Override // v3.j1
    public final void reset() {
        x6.b.H(this.f == 0);
        l3.l lVar = this.f15331b;
        lVar.f9559a = null;
        lVar.f9560b = null;
        E();
    }

    @Override // v3.j1
    public final void s() {
        z4.c0 c0Var = this.f15335o;
        c0Var.getClass();
        c0Var.a();
    }

    @Override // v3.j1
    public final void start() {
        x6.b.H(this.f == 1);
        this.f = 2;
        F();
    }

    @Override // v3.j1
    public final void stop() {
        x6.b.H(this.f == 2);
        this.f = 1;
        G();
    }

    @Override // v3.j1
    public final long t() {
        return this.f15338r;
    }

    @Override // v3.j1
    public final void u(long j10) {
        this.f15339s = false;
        this.f15338r = j10;
        D(j10, false);
    }

    @Override // v3.j1
    public final boolean v() {
        return this.f15339s;
    }

    @Override // v3.j1
    public v5.o w() {
        return null;
    }

    @Override // v3.j1
    public final int x() {
        return this.f15330a;
    }

    @Override // v3.j1
    public final void y(l1 l1Var, i0[] i0VarArr, z4.c0 c0Var, long j10, boolean z10, boolean z11, long j11, long j12) {
        x6.b.H(this.f == 0);
        this.f15332c = l1Var;
        this.f = 1;
        C(z10, z11);
        n(i0VarArr, c0Var, j11, j12);
        this.f15339s = false;
        this.f15338r = j10;
        D(j10, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final v3.n z(int r13, v3.i0 r14, java.lang.Exception r15, boolean r16) {
        /*
            r12 = this;
            r1 = r12
            r0 = r14
            r2 = 4
            if (r0 == 0) goto L1d
            boolean r3 = r1.t
            if (r3 != 0) goto L1d
            r3 = 1
            r1.t = r3
            r3 = 0
            int r4 = r12.a(r14)     // Catch: java.lang.Throwable -> L16 v3.n -> L1b
            r4 = r4 & 7
            r1.t = r3
            goto L1e
        L16:
            r0 = move-exception
            r2 = r0
            r1.t = r3
            throw r2
        L1b:
            r1.t = r3
        L1d:
            r4 = r2
        L1e:
            java.lang.String r6 = r12.getName()
            int r7 = r1.f15333d
            v3.n r11 = new v3.n
            if (r0 != 0) goto L2a
            r9 = r2
            goto L2b
        L2a:
            r9 = r4
        L2b:
            r3 = 1
            r2 = r11
            r4 = r15
            r5 = r13
            r8 = r14
            r10 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.f.z(int, v3.i0, java.lang.Exception, boolean):v3.n");
    }
}
