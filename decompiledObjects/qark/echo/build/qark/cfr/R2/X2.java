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
import R2.e;

public final class X2
implements Runnable {
    public final /* synthetic */ e o;
    public final /* synthetic */ R2 p;

    public X2(R2 r22, e e8) {
        this.p = r22;
        this.o = e8;
    }

    public final void run() {
        R2.o(this.p).o0();
        if (this.o.q.a() == null) {
            R2.o(this.p).o(this.o);
            return;
        }
        R2.o(this.p).S(this.o);
    }
}

