package nb;

import eb.h1;
import eb.k0;
import eb.n;
import java.util.concurrent.ScheduledExecutorService;
import n7.g;

/* loaded from: classes.dex */
public abstract class c extends k0.e {
    @Override // eb.k0.e
    public k0.i a(k0.b bVar) {
        return g().a(bVar);
    }

    @Override // eb.k0.e
    public final eb.d b() {
        return g().b();
    }

    @Override // eb.k0.e
    public final ScheduledExecutorService c() {
        return g().c();
    }

    @Override // eb.k0.e
    public final h1 d() {
        return g().d();
    }

    @Override // eb.k0.e
    public final void e() {
        g().e();
    }

    @Override // eb.k0.e
    public void f(n nVar, k0.j jVar) {
        g().f(nVar, jVar);
    }

    public abstract k0.e g();

    public final String toString() {
        g.a b10 = n7.g.b(this);
        b10.a(g(), "delegate");
        return b10.toString();
    }
}
