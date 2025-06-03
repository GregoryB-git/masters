package p6;

import java.util.concurrent.locks.LockSupport;

/* renamed from: p6.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1841c0 extends AbstractC1837a0 {
    public abstract Thread T();

    public final void U() {
        Thread T6 = T();
        if (Thread.currentThread() != T6) {
            AbstractC1840c.a();
            LockSupport.unpark(T6);
        }
    }
}
