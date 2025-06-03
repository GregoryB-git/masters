package nc;

import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class f<T> extends a<T> {

    /* renamed from: d, reason: collision with root package name */
    public final Thread f11492d;

    /* renamed from: e, reason: collision with root package name */
    public final x0 f11493e;

    public f(ub.h hVar, Thread thread, x0 x0Var) {
        super(hVar, true);
        this.f11492d = thread;
        this.f11493e = x0Var;
    }

    @Override // nc.o1
    public final void p(Object obj) {
        if (ec.i.a(Thread.currentThread(), this.f11492d)) {
            return;
        }
        LockSupport.unpark(this.f11492d);
    }
}
