package gb;

import gb.d1;
import java.io.InputStream;
import n7.g;

/* loaded from: classes.dex */
public abstract class n0 implements s {
    @Override // gb.m3
    public final void a(eb.l lVar) {
        ((d1.b.a) this).f6278a.a(lVar);
    }

    @Override // gb.m3
    public final boolean b() {
        return ((d1.b.a) this).f6278a.b();
    }

    @Override // gb.m3
    public final void d(InputStream inputStream) {
        ((d1.b.a) this).f6278a.d(inputStream);
    }

    @Override // gb.m3
    public final void e() {
        ((d1.b.a) this).f6278a.e();
    }

    @Override // gb.m3
    public final void f(int i10) {
        ((d1.b.a) this).f6278a.f(i10);
    }

    @Override // gb.m3
    public final void flush() {
        ((d1.b.a) this).f6278a.flush();
    }

    @Override // gb.s
    public final void g(int i10) {
        ((d1.b.a) this).f6278a.g(i10);
    }

    @Override // gb.s
    public final void h(int i10) {
        ((d1.b.a) this).f6278a.h(i10);
    }

    @Override // gb.s
    public final void i(d2.q qVar) {
        ((d1.b.a) this).f6278a.i(qVar);
    }

    @Override // gb.s
    public final void j(eb.q qVar) {
        ((d1.b.a) this).f6278a.j(qVar);
    }

    @Override // gb.s
    public final void k(String str) {
        ((d1.b.a) this).f6278a.k(str);
    }

    @Override // gb.s
    public final void m() {
        ((d1.b.a) this).f6278a.m();
    }

    @Override // gb.s
    public final void n(eb.e1 e1Var) {
        ((d1.b.a) this).f6278a.n(e1Var);
    }

    @Override // gb.s
    public final void o(eb.s sVar) {
        ((d1.b.a) this).f6278a.o(sVar);
    }

    @Override // gb.s
    public final void p(boolean z10) {
        ((d1.b.a) this).f6278a.p(z10);
    }

    public final String toString() {
        g.a b10 = n7.g.b(this);
        b10.a(((d1.b.a) this).f6278a, "delegate");
        return b10.toString();
    }
}
