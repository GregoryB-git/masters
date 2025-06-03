/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package R2;

import R2.D4;
import R2.v4;
import R2.w4;

public final class B4
implements Runnable {
    public final /* synthetic */ w4 o;
    public final /* synthetic */ long p;
    public final /* synthetic */ v4 q;

    public B4(v4 v42, w4 w42, long l8) {
        this.q = v42;
        this.o = w42;
        this.p = l8;
    }

    public final void run() {
        v4.G(this.q, this.o, false, this.p);
        v4 v42 = this.q;
        v42.e = null;
        v42.t().G(null);
    }
}

