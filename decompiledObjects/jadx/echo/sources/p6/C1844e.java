package p6;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: p6.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1844e extends AbstractC1836a {

    /* renamed from: r, reason: collision with root package name */
    public final Thread f18527r;

    /* renamed from: s, reason: collision with root package name */
    public final AbstractC1837a0 f18528s;

    public C1844e(X5.g gVar, Thread thread, AbstractC1837a0 abstractC1837a0) {
        super(gVar, true, true);
        this.f18527r = thread;
        this.f18528s = abstractC1837a0;
    }

    @Override // p6.x0
    public void F(Object obj) {
        if (Intrinsics.a(Thread.currentThread(), this.f18527r)) {
            return;
        }
        Thread thread = this.f18527r;
        AbstractC1840c.a();
        LockSupport.unpark(thread);
    }

    public final Object K0() {
        AbstractC1840c.a();
        try {
            AbstractC1837a0 abstractC1837a0 = this.f18528s;
            if (abstractC1837a0 != null) {
                AbstractC1837a0.N(abstractC1837a0, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    AbstractC1837a0 abstractC1837a02 = this.f18528s;
                    long Q6 = abstractC1837a02 != null ? abstractC1837a02.Q() : Long.MAX_VALUE;
                    if (f0()) {
                        AbstractC1837a0 abstractC1837a03 = this.f18528s;
                        if (abstractC1837a03 != null) {
                            AbstractC1837a0.I(abstractC1837a03, false, 1, null);
                        }
                        AbstractC1840c.a();
                        Object h7 = y0.h(b0());
                        C1877z c1877z = h7 instanceof C1877z ? (C1877z) h7 : null;
                        if (c1877z == null) {
                            return h7;
                        }
                        throw c1877z.f18582a;
                    }
                    AbstractC1840c.a();
                    LockSupport.parkNanos(this, Q6);
                } catch (Throwable th) {
                    AbstractC1837a0 abstractC1837a04 = this.f18528s;
                    if (abstractC1837a04 != null) {
                        AbstractC1837a0.I(abstractC1837a04, false, 1, null);
                    }
                    throw th;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            I(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            AbstractC1840c.a();
            throw th2;
        }
    }

    @Override // p6.x0
    public boolean g0() {
        return true;
    }
}
