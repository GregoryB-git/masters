package gb;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class n2 extends eb.n0 implements eb.e0<Object> {
    static {
        Logger.getLogger(n2.class.getName());
    }

    @Override // eb.n0
    public final boolean C(long j10, TimeUnit timeUnit) {
        throw null;
    }

    @Override // eb.n0
    public final eb.n E() {
        return eb.n.IDLE;
    }

    @Override // eb.n0
    public final eb.n0 G() {
        eb.e1.f5078n.g("OobChannel.shutdown() called");
        throw null;
    }

    @Override // eb.n0
    public final eb.n0 H() {
        eb.e1.f5078n.g("OobChannel.shutdownNow() called");
        throw null;
    }

    @Override // e9.a
    public final String b() {
        return null;
    }

    @Override // eb.e0
    public final eb.f0 f() {
        return null;
    }

    public final String toString() {
        n7.g.b(this);
        throw null;
    }

    @Override // e9.a
    public final <RequestT, ResponseT> eb.e<RequestT, ResponseT> v(eb.t0<RequestT, ResponseT> t0Var, eb.c cVar) {
        Executor executor = cVar.f5036b;
        if (executor == null) {
            executor = null;
        }
        return new q(t0Var, executor, cVar, null, null, null);
    }
}
