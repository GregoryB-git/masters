package nb;

import eb.k0;
import eb.u;
import java.util.List;
import n7.g;

/* loaded from: classes.dex */
public abstract class d extends k0.i {
    @Override // eb.k0.i
    public final List<u> b() {
        return j().b();
    }

    @Override // eb.k0.i
    public final eb.d d() {
        return j().d();
    }

    @Override // eb.k0.i
    public final Object e() {
        return j().e();
    }

    @Override // eb.k0.i
    public final void f() {
        j().f();
    }

    @Override // eb.k0.i
    public void g() {
        j().g();
    }

    @Override // eb.k0.i
    public void i(List<u> list) {
        j().i(list);
    }

    public abstract k0.i j();

    public String toString() {
        g.a b10 = n7.g.b(this);
        b10.a(j(), "delegate");
        return b10.toString();
    }
}
