package s0;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final j f14032a;

    public k(j jVar) {
        Charset charset = x.f14119a;
        if (jVar == null) {
            throw new NullPointerException("output");
        }
        this.f14032a = jVar;
        jVar.f14026b = this;
    }

    public final void a(int i10, boolean z10) {
        this.f14032a.U(i10, z10);
    }

    public final void b(int i10, g gVar) {
        this.f14032a.W(i10, gVar);
    }

    public final void c(int i10, double d10) {
        j jVar = this.f14032a;
        jVar.getClass();
        jVar.a0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void d(int i10, int i11) {
        this.f14032a.c0(i10, i11);
    }

    public final void e(int i10, int i11) {
        this.f14032a.Y(i10, i11);
    }

    public final void f(int i10, long j10) {
        this.f14032a.a0(i10, j10);
    }

    public final void g(float f, int i10) {
        j jVar = this.f14032a;
        jVar.getClass();
        jVar.Y(i10, Float.floatToRawIntBits(f));
    }

    public final void h(int i10, c1 c1Var, Object obj) {
        j jVar = this.f14032a;
        jVar.k0(i10, 3);
        c1Var.h((o0) obj, jVar.f14026b);
        jVar.k0(i10, 4);
    }

    public final void i(int i10, int i11) {
        this.f14032a.c0(i10, i11);
    }

    public final void j(int i10, long j10) {
        this.f14032a.n0(i10, j10);
    }

    public final void k(int i10, c1 c1Var, Object obj) {
        this.f14032a.e0(i10, (o0) obj, c1Var);
    }

    public final void l(int i10, Object obj) {
        if (obj instanceof g) {
            this.f14032a.h0(i10, (g) obj);
        } else {
            this.f14032a.g0(i10, (o0) obj);
        }
    }

    public final void m(int i10, int i11) {
        this.f14032a.Y(i10, i11);
    }

    public final void n(int i10, long j10) {
        this.f14032a.a0(i10, j10);
    }

    public final void o(int i10, int i11) {
        this.f14032a.l0(i10, (i11 >> 31) ^ (i11 << 1));
    }

    public final void p(int i10, long j10) {
        this.f14032a.n0(i10, (j10 >> 63) ^ (j10 << 1));
    }

    public final void q(int i10, int i11) {
        this.f14032a.l0(i10, i11);
    }

    public final void r(int i10, long j10) {
        this.f14032a.n0(i10, j10);
    }
}
