/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package R2;

import R2.D5;
import R2.i5;

public final class j5
implements Runnable {
    public final /* synthetic */ D5 o;
    public final /* synthetic */ Runnable p;

    public j5(i5 i52, D5 d52, Runnable runnable) {
        this.o = d52;
        this.p = runnable;
    }

    public final void run() {
        this.o.o0();
        this.o.y(this.p);
        this.o.t0();
    }
}

