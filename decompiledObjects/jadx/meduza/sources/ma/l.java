package ma;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final k f11029a;

    public l(k kVar) {
        Charset charset = a0.f10909a;
        if (kVar == null) {
            throw new NullPointerException("output");
        }
        this.f11029a = kVar;
        kVar.f11020b = this;
    }

    public final void a(int i10, boolean z10) {
        this.f11029a.U(i10, z10);
    }

    public final void b(int i10, h hVar) {
        this.f11029a.W(i10, hVar);
    }

    public final void c(int i10, double d10) {
        k kVar = this.f11029a;
        kVar.getClass();
        kVar.a0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void d(int i10, int i11) {
        this.f11029a.c0(i10, i11);
    }

    public final void e(int i10, int i11) {
        this.f11029a.Y(i10, i11);
    }

    public final void f(int i10, long j10) {
        this.f11029a.a0(i10, j10);
    }

    public final void g(float f, int i10) {
        k kVar = this.f11029a;
        kVar.getClass();
        kVar.Y(i10, Float.floatToRawIntBits(f));
    }

    public final void h(int i10, i1 i1Var, Object obj) {
        k kVar = this.f11029a;
        kVar.k0(i10, 3);
        i1Var.h((s0) obj, kVar.f11020b);
        kVar.k0(i10, 4);
    }

    public final void i(int i10, int i11) {
        this.f11029a.c0(i10, i11);
    }

    public final void j(int i10, long j10) {
        this.f11029a.n0(i10, j10);
    }

    public final void k(int i10, i1 i1Var, Object obj) {
        this.f11029a.e0(i10, (s0) obj, i1Var);
    }

    public final void l(int i10, Object obj) {
        if (obj instanceof h) {
            this.f11029a.h0(i10, (h) obj);
        } else {
            this.f11029a.g0(i10, (s0) obj);
        }
    }

    public final void m(int i10, int i11) {
        this.f11029a.Y(i10, i11);
    }

    public final void n(int i10, long j10) {
        this.f11029a.a0(i10, j10);
    }

    public final void o(int i10, int i11) {
        this.f11029a.l0(i10, (i11 >> 31) ^ (i11 << 1));
    }

    public final void p(int i10, long j10) {
        this.f11029a.n0(i10, (j10 >> 63) ^ (j10 << 1));
    }

    public final void q(int i10, int i11) {
        this.f11029a.l0(i10, i11);
    }

    public final void r(int i10, long j10) {
        this.f11029a.n0(i10, j10);
    }
}
