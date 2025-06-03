/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.util.concurrent.CountDownLatch
 *  java.util.concurrent.TimeUnit
 */
package V2;

import V2.o;
import V2.q;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class p
implements q {
    public final CountDownLatch a = new CountDownLatch(1);

    public /* synthetic */ p(o o8) {
    }

    @Override
    public final void a(Object object) {
        this.a.countDown();
    }

    @Override
    public final void b() {
        this.a.countDown();
    }

    public final void c() {
        this.a.await();
    }

    @Override
    public final void d(Exception exception) {
        this.a.countDown();
    }

    public final boolean e(long l8, TimeUnit timeUnit) {
        return this.a.await(l8, timeUnit);
    }
}

