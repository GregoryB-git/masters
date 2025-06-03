/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package R2;

import R2.G2;
import R2.l5;
import R2.q5;
import R2.s5;

public final class p5
implements Runnable {
    public long o;
    public long p;
    public final /* synthetic */ q5 q;

    public p5(q5 q52, long l8, long l9) {
        this.q = q52;
        this.o = l8;
        this.p = l9;
    }

    public final void run() {
        this.q.b.e().D(new s5(this));
    }
}

