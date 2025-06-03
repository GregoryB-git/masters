package nb;

import eb.e1;
import eb.k0;
import n7.g;

/* loaded from: classes.dex */
public abstract class b extends k0 {
    @Override // eb.k0
    public final boolean b() {
        return g().b();
    }

    @Override // eb.k0
    public final void c(e1 e1Var) {
        g().c(e1Var);
    }

    @Override // eb.k0
    public final void d(k0.h hVar) {
        g().d(hVar);
    }

    @Override // eb.k0
    public final void e() {
        g().e();
    }

    public abstract k0 g();

    public final String toString() {
        g.a b10 = n7.g.b(this);
        b10.a(g(), "delegate");
        return b10.toString();
    }
}
