/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.CountDownLatch
 */
package N3;

import N3.e;
import java.util.concurrent.CountDownLatch;

public final class d
implements Runnable {
    public final /* synthetic */ e o;
    public final /* synthetic */ CountDownLatch p;

    public /* synthetic */ d(e e8, CountDownLatch countDownLatch) {
        this.o = e8;
        this.p = countDownLatch;
    }

    public final void run() {
        e.b(this.o, this.p);
    }
}

