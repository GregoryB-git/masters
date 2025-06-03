/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package R2;

import R2.D5;
import R2.P5;

public final class G5
implements Runnable {
    public final /* synthetic */ P5 o;
    public final /* synthetic */ D5 p;

    public G5(D5 d52, P5 p52) {
        this.p = d52;
        this.o = p52;
    }

    public final void run() {
        D5.t(this.p, this.o);
        this.p.s0();
    }
}

