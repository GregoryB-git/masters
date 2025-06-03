/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package R2;

import R2.R2;
import R2.R5;
import R2.W5;

public final class g3
implements Runnable {
    public final /* synthetic */ R5 o;
    public final /* synthetic */ W5 p;
    public final /* synthetic */ R2 q;

    public g3(R2 r22, R5 r52, W5 w52) {
        this.q = r22;
        this.o = r52;
        this.p = w52;
    }

    public final void run() {
        R2.o(this.q).o0();
        if (this.o.a() == null) {
            R2.o(this.q).D(this.o.p, this.p);
            return;
        }
        R2.o(this.q).u(this.o, this.p);
    }
}

