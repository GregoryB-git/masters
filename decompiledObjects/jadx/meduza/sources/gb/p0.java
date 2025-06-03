package gb;

import gb.h2;
import gb.o1;
import n7.g;

/* loaded from: classes.dex */
public abstract class p0 implements x {
    public abstract x a();

    @Override // gb.h2
    public void c(eb.e1 e1Var) {
        a().c(e1Var);
    }

    @Override // gb.u
    public final void e(o1.c.a aVar) {
        a().e(aVar);
    }

    @Override // eb.e0
    public final eb.f0 f() {
        return a().f();
    }

    @Override // gb.h2
    public final Runnable g(h2.a aVar) {
        return a().g(aVar);
    }

    @Override // gb.x
    public final eb.a getAttributes() {
        return a().getAttributes();
    }

    @Override // gb.h2
    public void h(eb.e1 e1Var) {
        a().h(e1Var);
    }

    public final String toString() {
        g.a b10 = n7.g.b(this);
        b10.a(a(), "delegate");
        return b10.toString();
    }
}
