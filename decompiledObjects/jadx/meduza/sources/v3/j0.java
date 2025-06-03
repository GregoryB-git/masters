package v3;

import android.os.Looper;
import java.util.List;
import v3.f1;

/* loaded from: classes.dex */
public final class j0 implements f1 {

    /* renamed from: a, reason: collision with root package name */
    public final f1 f15499a;

    public static final class a implements f1.c {

        /* renamed from: a, reason: collision with root package name */
        public final j0 f15500a;

        /* renamed from: b, reason: collision with root package name */
        public final f1.c f15501b;

        public a(j0 j0Var, f1.c cVar) {
            this.f15500a = j0Var;
            this.f15501b = cVar;
        }

        @Override // v3.f1.c
        public final void D(boolean z10) {
            this.f15501b.I(z10);
        }

        @Override // v3.f1.c
        public final void F(f1.a aVar) {
            this.f15501b.F(aVar);
        }

        @Override // v3.f1.c
        public final void G(int i10, f1.d dVar, f1.d dVar2) {
            this.f15501b.G(i10, dVar, dVar2);
        }

        @Override // v3.f1.c
        public final void I(boolean z10) {
            this.f15501b.I(z10);
        }

        @Override // v3.f1.c
        public final void K(int i10, boolean z10) {
            this.f15501b.K(i10, z10);
        }

        @Override // v3.f1.c
        public final void L(float f) {
            this.f15501b.L(f);
        }

        @Override // v3.f1.c
        public final void N(int i10) {
            this.f15501b.N(i10);
        }

        @Override // v3.f1.c
        public final void R(p0 p0Var) {
            this.f15501b.R(p0Var);
        }

        @Override // v3.f1.c
        public final void T(boolean z10) {
            this.f15501b.T(z10);
        }

        @Override // v3.f1.c
        public final void W(int i10, boolean z10) {
            this.f15501b.W(i10, z10);
        }

        @Override // v3.f1.c
        public final void X(n nVar) {
            this.f15501b.X(nVar);
        }

        @Override // v3.f1.c
        public final void Y(r1 r1Var, int i10) {
            this.f15501b.Y(r1Var, i10);
        }

        @Override // v3.f1.c
        public final void Z(s1 s1Var) {
            this.f15501b.Z(s1Var);
        }

        @Override // v3.f1.c
        public final void a0(n nVar) {
            this.f15501b.a0(nVar);
        }

        @Override // v3.f1.c
        public final void b(w5.o oVar) {
            this.f15501b.b(oVar);
        }

        @Override // v3.f1.c
        public final void b0(int i10, boolean z10) {
            this.f15501b.b0(i10, z10);
        }

        @Override // v3.f1.c
        public final void c0(e1 e1Var) {
            this.f15501b.c0(e1Var);
        }

        @Override // v3.f1.c
        public final void d(int i10) {
            this.f15501b.d(i10);
        }

        @Override // v3.f1.c
        public final void d0(x3.d dVar) {
            this.f15501b.d0(dVar);
        }

        @Override // v3.f1.c
        public final void e0(f1 f1Var, f1.b bVar) {
            this.f15501b.e0(this.f15500a, bVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f15500a.equals(aVar.f15500a)) {
                return this.f15501b.equals(aVar.f15501b);
            }
            return false;
        }

        @Override // v3.f1.c
        public final void f() {
            this.f15501b.f();
        }

        public final int hashCode() {
            return this.f15501b.hashCode() + (this.f15500a.hashCode() * 31);
        }

        @Override // v3.f1.c
        public final void j(h5.c cVar) {
            this.f15501b.j(cVar);
        }

        @Override // v3.f1.c
        public final void k0(o0 o0Var, int i10) {
            this.f15501b.k0(o0Var, i10);
        }

        @Override // v3.f1.c
        public final void l0(m mVar) {
            this.f15501b.l0(mVar);
        }

        @Override // v3.f1.c
        public final void m() {
            this.f15501b.m();
        }

        @Override // v3.f1.c
        public final void m0(int i10, int i11) {
            this.f15501b.m0(i10, i11);
        }

        @Override // v3.f1.c
        public final void o(boolean z10) {
            this.f15501b.o(z10);
        }

        @Override // v3.f1.c
        public final void p0(boolean z10) {
            this.f15501b.p0(z10);
        }

        @Override // v3.f1.c
        public final void q(int i10) {
            this.f15501b.q(i10);
        }

        @Override // v3.f1.c
        public final void r(List<h5.a> list) {
            this.f15501b.r(list);
        }

        @Override // v3.f1.c
        public final void w(p4.a aVar) {
            this.f15501b.w(aVar);
        }

        @Override // v3.f1.c
        public final void x(int i10) {
            this.f15501b.x(i10);
        }
    }

    public j0(d0 d0Var) {
        this.f15499a = d0Var;
    }

    @Override // v3.f1
    public final boolean A() {
        return this.f15499a.A();
    }

    @Override // v3.f1
    public final s1 B() {
        return this.f15499a.B();
    }

    @Override // v3.f1
    public final boolean C() {
        return this.f15499a.C();
    }

    @Override // v3.f1
    public final boolean D() {
        return this.f15499a.D();
    }

    @Override // v3.f1
    public final int E() {
        return this.f15499a.E();
    }

    @Override // v3.f1
    public final int F() {
        return this.f15499a.F();
    }

    @Override // v3.f1
    public final boolean G(int i10) {
        return this.f15499a.G(i10);
    }

    @Override // v3.f1
    public final boolean H() {
        return this.f15499a.H();
    }

    @Override // v3.f1
    public final int I() {
        return this.f15499a.I();
    }

    @Override // v3.f1
    public final r1 J() {
        return this.f15499a.J();
    }

    @Override // v3.f1
    public final Looper K() {
        return this.f15499a.K();
    }

    @Override // v3.f1
    public final boolean L() {
        return this.f15499a.L();
    }

    @Override // v3.f1
    public final void M() {
        this.f15499a.M();
    }

    @Override // v3.f1
    public final void N() {
        this.f15499a.N();
    }

    @Override // v3.f1
    public final void O() {
        this.f15499a.O();
    }

    @Override // v3.f1
    public final long P() {
        return this.f15499a.P();
    }

    @Override // v3.f1
    public final boolean Q() {
        return this.f15499a.Q();
    }

    @Override // v3.f1
    public final void a() {
        this.f15499a.a();
    }

    @Override // v3.f1
    public final void b() {
        this.f15499a.b();
    }

    @Override // v3.f1
    public final void c(e1 e1Var) {
        this.f15499a.c(e1Var);
    }

    @Override // v3.f1
    public final int d() {
        return this.f15499a.d();
    }

    @Override // v3.f1
    public final e1 f() {
        return this.f15499a.f();
    }

    @Override // v3.f1
    public final boolean g() {
        return this.f15499a.g();
    }

    @Override // v3.f1
    public final long getDuration() {
        return this.f15499a.getDuration();
    }

    @Override // v3.f1
    public final void h(f1.c cVar) {
        this.f15499a.h(new a(this, cVar));
    }

    @Override // v3.f1
    public final long i() {
        return this.f15499a.i();
    }

    @Override // v3.f1
    public final void j(int i10, long j10) {
        this.f15499a.j(i10, j10);
    }

    @Override // v3.f1
    public final boolean k() {
        return this.f15499a.k();
    }

    @Override // v3.f1
    public final void l() {
        this.f15499a.l();
    }

    @Override // v3.f1
    public final o0 m() {
        return this.f15499a.m();
    }

    @Override // v3.f1
    public final void n(boolean z10) {
        this.f15499a.n(z10);
    }

    @Override // v3.f1
    @Deprecated
    public final void o(boolean z10) {
        this.f15499a.o(true);
    }

    @Override // v3.f1
    public final int p() {
        return this.f15499a.p();
    }

    @Override // v3.f1
    public final void pause() {
        this.f15499a.pause();
    }

    @Override // v3.f1
    public final boolean q() {
        return this.f15499a.q();
    }

    @Override // v3.f1
    public final int r() {
        return this.f15499a.r();
    }

    @Override // v3.f1
    public final void s(f1.c cVar) {
        this.f15499a.s(new a(this, cVar));
    }

    @Override // v3.f1
    public final void stop() {
        this.f15499a.stop();
    }

    @Override // v3.f1
    public final void t() {
        this.f15499a.t();
    }

    @Override // v3.f1
    public final void u(int i10) {
        this.f15499a.u(i10);
    }

    @Override // v3.f1
    public final c1 v() {
        return this.f15499a.v();
    }

    @Override // v3.f1
    public final void w(int i10) {
        this.f15499a.w(i10);
    }

    @Override // v3.f1
    public final int x() {
        return this.f15499a.x();
    }

    @Override // v3.f1
    public final long y() {
        return this.f15499a.y();
    }

    @Override // v3.f1
    public final long z() {
        return this.f15499a.z();
    }
}
