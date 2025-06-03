/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.atomic.AtomicReference
 */
package R2;

import R2.C3;
import R2.D4;
import java.util.concurrent.atomic.AtomicReference;

public final class X3
implements Runnable {
    public final /* synthetic */ long o;
    public final /* synthetic */ C3 p;

    public X3(C3 c32, long l8) {
        this.p = c32;
        this.o = l8;
    }

    public final void run() {
        this.p.E(this.o, true);
        this.p.t().Q(new AtomicReference());
    }
}

