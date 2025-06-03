package x0;

import g0.AbstractC1297a;
import k0.C1447y0;
import k0.d1;
import x0.InterfaceC2140v;
import x0.InterfaceC2142x;

/* renamed from: x0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2137s implements InterfaceC2140v, InterfaceC2140v.a {

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC2142x.b f20822o;

    /* renamed from: p, reason: collision with root package name */
    public final long f20823p;

    /* renamed from: q, reason: collision with root package name */
    public final B0.b f20824q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC2142x f20825r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC2140v f20826s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC2140v.a f20827t;

    /* renamed from: u, reason: collision with root package name */
    public long f20828u = -9223372036854775807L;

    public C2137s(InterfaceC2142x.b bVar, B0.b bVar2, long j7) {
        this.f20822o = bVar;
        this.f20824q = bVar2;
        this.f20823p = j7;
    }

    public void a(InterfaceC2142x.b bVar) {
        long t7 = t(this.f20823p);
        InterfaceC2140v f7 = ((InterfaceC2142x) AbstractC1297a.e(this.f20825r)).f(bVar, this.f20824q, t7);
        this.f20826s = f7;
        if (this.f20827t != null) {
            f7.u(this, t7);
        }
    }

    @Override // x0.InterfaceC2140v, x0.S
    public boolean b() {
        InterfaceC2140v interfaceC2140v = this.f20826s;
        return interfaceC2140v != null && interfaceC2140v.b();
    }

    @Override // x0.InterfaceC2140v, x0.S
    public long c() {
        return ((InterfaceC2140v) g0.M.i(this.f20826s)).c();
    }

    @Override // x0.InterfaceC2140v
    public long d(long j7, d1 d1Var) {
        return ((InterfaceC2140v) g0.M.i(this.f20826s)).d(j7, d1Var);
    }

    @Override // x0.InterfaceC2140v, x0.S
    public long f() {
        return ((InterfaceC2140v) g0.M.i(this.f20826s)).f();
    }

    @Override // x0.InterfaceC2140v, x0.S
    public boolean g(C1447y0 c1447y0) {
        InterfaceC2140v interfaceC2140v = this.f20826s;
        return interfaceC2140v != null && interfaceC2140v.g(c1447y0);
    }

    @Override // x0.InterfaceC2140v, x0.S
    public void h(long j7) {
        ((InterfaceC2140v) g0.M.i(this.f20826s)).h(j7);
    }

    @Override // x0.InterfaceC2140v
    public long i(A0.y[] yVarArr, boolean[] zArr, Q[] qArr, boolean[] zArr2, long j7) {
        long j8 = this.f20828u;
        long j9 = (j8 == -9223372036854775807L || j7 != this.f20823p) ? j7 : j8;
        this.f20828u = -9223372036854775807L;
        return ((InterfaceC2140v) g0.M.i(this.f20826s)).i(yVarArr, zArr, qArr, zArr2, j9);
    }

    public long j() {
        return this.f20828u;
    }

    @Override // x0.InterfaceC2140v.a
    public void k(InterfaceC2140v interfaceC2140v) {
        ((InterfaceC2140v.a) g0.M.i(this.f20827t)).k(this);
    }

    @Override // x0.InterfaceC2140v
    public long l() {
        return ((InterfaceC2140v) g0.M.i(this.f20826s)).l();
    }

    @Override // x0.InterfaceC2140v
    public Z n() {
        return ((InterfaceC2140v) g0.M.i(this.f20826s)).n();
    }

    @Override // x0.InterfaceC2140v
    public void p() {
        InterfaceC2140v interfaceC2140v = this.f20826s;
        if (interfaceC2140v != null) {
            interfaceC2140v.p();
            return;
        }
        InterfaceC2142x interfaceC2142x = this.f20825r;
        if (interfaceC2142x != null) {
            interfaceC2142x.h();
        }
    }

    @Override // x0.InterfaceC2140v
    public void q(long j7, boolean z7) {
        ((InterfaceC2140v) g0.M.i(this.f20826s)).q(j7, z7);
    }

    public long r() {
        return this.f20823p;
    }

    @Override // x0.InterfaceC2140v
    public long s(long j7) {
        return ((InterfaceC2140v) g0.M.i(this.f20826s)).s(j7);
    }

    public final long t(long j7) {
        long j8 = this.f20828u;
        return j8 != -9223372036854775807L ? j8 : j7;
    }

    @Override // x0.InterfaceC2140v
    public void u(InterfaceC2140v.a aVar, long j7) {
        this.f20827t = aVar;
        InterfaceC2140v interfaceC2140v = this.f20826s;
        if (interfaceC2140v != null) {
            interfaceC2140v.u(this, t(this.f20823p));
        }
    }

    @Override // x0.S.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void e(InterfaceC2140v interfaceC2140v) {
        ((InterfaceC2140v.a) g0.M.i(this.f20827t)).e(this);
    }

    public void w(long j7) {
        this.f20828u = j7;
    }

    public void x() {
        if (this.f20826s != null) {
            ((InterfaceC2142x) AbstractC1297a.e(this.f20825r)).e(this.f20826s);
        }
    }

    public void y(InterfaceC2142x interfaceC2142x) {
        AbstractC1297a.f(this.f20825r == null);
        this.f20825r = interfaceC2142x;
    }
}
