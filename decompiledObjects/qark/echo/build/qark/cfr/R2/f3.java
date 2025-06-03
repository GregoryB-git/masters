/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package R2;

import R2.I;
import R2.R2;
import R2.W5;

public final class f3
implements Runnable {
    public final /* synthetic */ I o;
    public final /* synthetic */ W5 p;
    public final /* synthetic */ R2 q;

    public f3(R2 r22, I i8, W5 w52) {
        this.q = r22;
        this.o = i8;
        this.p = w52;
    }

    public final void run() {
        I i8 = this.q.b1(this.o, this.p);
        this.q.d1(i8, this.p);
    }
}

