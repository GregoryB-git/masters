/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package R2;

import R2.R2;
import R2.R5;
import R2.W5;
import R2.e;

public final class U2
implements Runnable {
    public final /* synthetic */ e o;
    public final /* synthetic */ W5 p;
    public final /* synthetic */ R2 q;

    public U2(R2 r22, e e8, W5 w52) {
        this.q = r22;
        this.o = e8;
        this.p = w52;
    }

    public final void run() {
        R2.o(this.q).o0();
        if (this.o.q.a() == null) {
            R2.o(this.q).p(this.o, this.p);
            return;
        }
        R2.o(this.q).T(this.o, this.p);
    }
}

