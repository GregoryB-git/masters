package k0;

import d0.AbstractC1170I;
import d0.C1194q;
import g0.AbstractC1297a;
import g0.InterfaceC1299c;
import k0.a1;
import l0.y1;
import x0.InterfaceC2142x;

/* renamed from: k0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1425n implements Y0, a1 {

    /* renamed from: B, reason: collision with root package name */
    public boolean f15834B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f15835C;

    /* renamed from: E, reason: collision with root package name */
    public a1.a f15837E;

    /* renamed from: p, reason: collision with root package name */
    public final int f15839p;

    /* renamed from: r, reason: collision with root package name */
    public b1 f15841r;

    /* renamed from: s, reason: collision with root package name */
    public int f15842s;

    /* renamed from: t, reason: collision with root package name */
    public y1 f15843t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC1299c f15844u;

    /* renamed from: v, reason: collision with root package name */
    public int f15845v;

    /* renamed from: w, reason: collision with root package name */
    public x0.Q f15846w;

    /* renamed from: x, reason: collision with root package name */
    public C1194q[] f15847x;

    /* renamed from: y, reason: collision with root package name */
    public long f15848y;

    /* renamed from: z, reason: collision with root package name */
    public long f15849z;

    /* renamed from: o, reason: collision with root package name */
    public final Object f15838o = new Object();

    /* renamed from: q, reason: collision with root package name */
    public final C1441v0 f15840q = new C1441v0();

    /* renamed from: A, reason: collision with root package name */
    public long f15833A = Long.MIN_VALUE;

    /* renamed from: D, reason: collision with root package name */
    public AbstractC1170I f15836D = AbstractC1170I.f12388a;

    public AbstractC1425n(int i7) {
        this.f15839p = i7;
    }

    @Override // k0.Y0
    public final boolean A() {
        return this.f15834B;
    }

    @Override // k0.Y0
    public A0 B() {
        return null;
    }

    @Override // k0.Y0
    public final void C(b1 b1Var, C1194q[] c1194qArr, x0.Q q7, long j7, boolean z7, boolean z8, long j8, long j9, InterfaceC2142x.b bVar) {
        AbstractC1297a.f(this.f15845v == 0);
        this.f15841r = b1Var;
        this.f15845v = 1;
        U(z7, z8);
        F(c1194qArr, q7, j8, j9, bVar);
        f0(j8, z7);
    }

    @Override // k0.Y0
    public final void D(int i7, y1 y1Var, InterfaceC1299c interfaceC1299c) {
        this.f15842s = i7;
        this.f15843t = y1Var;
        this.f15844u = interfaceC1299c;
        V();
    }

    @Override // k0.Y0
    public final void E(AbstractC1170I abstractC1170I) {
        if (g0.M.c(this.f15836D, abstractC1170I)) {
            return;
        }
        this.f15836D = abstractC1170I;
        d0(abstractC1170I);
    }

    @Override // k0.Y0
    public final void F(C1194q[] c1194qArr, x0.Q q7, long j7, long j8, InterfaceC2142x.b bVar) {
        AbstractC1297a.f(!this.f15834B);
        this.f15846w = q7;
        if (this.f15833A == Long.MIN_VALUE) {
            this.f15833A = j7;
        }
        this.f15847x = c1194qArr;
        this.f15848y = j8;
        c0(c1194qArr, j7, j8, bVar);
    }

    @Override // k0.Y0
    public /* synthetic */ void I(float f7, float f8) {
        X0.c(this, f7, f8);
    }

    public final C1438u J(Throwable th, C1194q c1194q, int i7) {
        return K(th, c1194q, false, i7);
    }

    public final C1438u K(Throwable th, C1194q c1194q, boolean z7, int i7) {
        int i8;
        if (c1194q != null && !this.f15835C) {
            this.f15835C = true;
            try {
                i8 = Z0.h(a(c1194q));
            } catch (C1438u unused) {
            } finally {
                this.f15835C = false;
            }
            return C1438u.b(th, d(), O(), c1194q, i8, z7, i7);
        }
        i8 = 4;
        return C1438u.b(th, d(), O(), c1194q, i8, z7, i7);
    }

    public final InterfaceC1299c L() {
        return (InterfaceC1299c) AbstractC1297a.e(this.f15844u);
    }

    public final b1 M() {
        return (b1) AbstractC1297a.e(this.f15841r);
    }

    public final C1441v0 N() {
        this.f15840q.a();
        return this.f15840q;
    }

    public final int O() {
        return this.f15842s;
    }

    public final long P() {
        return this.f15849z;
    }

    public final y1 Q() {
        return (y1) AbstractC1297a.e(this.f15843t);
    }

    public final C1194q[] R() {
        return (C1194q[]) AbstractC1297a.e(this.f15847x);
    }

    public final boolean S() {
        return p() ? this.f15834B : ((x0.Q) AbstractC1297a.e(this.f15846w)).e();
    }

    public abstract void T();

    public abstract void W(long j7, boolean z7);

    public final void Y() {
        a1.a aVar;
        synchronized (this.f15838o) {
            aVar = this.f15837E;
        }
        if (aVar != null) {
            aVar.a(this);
        }
    }

    @Override // k0.Y0
    public final void b() {
        AbstractC1297a.f(this.f15845v == 0);
        this.f15840q.a();
        Z();
    }

    public final int e0(C1441v0 c1441v0, j0.i iVar, int i7) {
        int j7 = ((x0.Q) AbstractC1297a.e(this.f15846w)).j(c1441v0, iVar, i7);
        if (j7 == -4) {
            if (iVar.p()) {
                this.f15833A = Long.MIN_VALUE;
                return this.f15834B ? -4 : -3;
            }
            long j8 = iVar.f15402t + this.f15848y;
            iVar.f15402t = j8;
            this.f15833A = Math.max(this.f15833A, j8);
        } else if (j7 == -5) {
            C1194q c1194q = (C1194q) AbstractC1297a.e(c1441v0.f16024b);
            if (c1194q.f12731s != Long.MAX_VALUE) {
                c1441v0.f16024b = c1194q.a().s0(c1194q.f12731s + this.f15848y).K();
            }
        }
        return j7;
    }

    public final void f0(long j7, boolean z7) {
        this.f15834B = false;
        this.f15849z = j7;
        this.f15833A = j7;
        W(j7, z7);
    }

    @Override // k0.Y0
    public final void g() {
        AbstractC1297a.f(this.f15845v == 1);
        this.f15840q.a();
        this.f15845v = 0;
        this.f15846w = null;
        this.f15847x = null;
        this.f15834B = false;
        T();
    }

    public int g0(long j7) {
        return ((x0.Q) AbstractC1297a.e(this.f15846w)).m(j7 - this.f15848y);
    }

    @Override // k0.Y0
    public final int getState() {
        return this.f15845v;
    }

    @Override // k0.Y0
    public final x0.Q i() {
        return this.f15846w;
    }

    @Override // k0.Y0
    public /* synthetic */ void j() {
        X0.a(this);
    }

    @Override // k0.Y0, k0.a1
    public final int l() {
        return this.f15839p;
    }

    @Override // k0.a1
    public final void o() {
        synchronized (this.f15838o) {
            this.f15837E = null;
        }
    }

    @Override // k0.Y0
    public final boolean p() {
        return this.f15833A == Long.MIN_VALUE;
    }

    @Override // k0.Y0
    public /* synthetic */ long q(long j7, long j8) {
        return X0.b(this, j7, j8);
    }

    @Override // k0.Y0
    public final void release() {
        AbstractC1297a.f(this.f15845v == 0);
        X();
    }

    @Override // k0.a1
    public int s() {
        return 0;
    }

    @Override // k0.Y0
    public final void start() {
        AbstractC1297a.f(this.f15845v == 1);
        this.f15845v = 2;
        a0();
    }

    @Override // k0.Y0
    public final void stop() {
        AbstractC1297a.f(this.f15845v == 2);
        this.f15845v = 1;
        b0();
    }

    @Override // k0.Y0
    public final void u() {
        this.f15834B = true;
    }

    @Override // k0.Y0
    public final void v() {
        ((x0.Q) AbstractC1297a.e(this.f15846w)).a();
    }

    @Override // k0.Y0
    public final long w() {
        return this.f15833A;
    }

    @Override // k0.a1
    public final void x(a1.a aVar) {
        synchronized (this.f15838o) {
            this.f15837E = aVar;
        }
    }

    @Override // k0.Y0
    public final void z(long j7) {
        f0(j7, false);
    }

    @Override // k0.Y0
    public final a1 G() {
        return this;
    }

    public void V() {
    }

    public void X() {
    }

    public void Z() {
    }

    public void a0() {
    }

    public void b0() {
    }

    public void d0(AbstractC1170I abstractC1170I) {
    }

    public void U(boolean z7, boolean z8) {
    }

    @Override // k0.V0.b
    public void t(int i7, Object obj) {
    }

    public void c0(C1194q[] c1194qArr, long j7, long j8, InterfaceC2142x.b bVar) {
    }
}
