/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package R2;

import A2.n;
import B2.a;
import R2.D4;
import R2.R1;
import R2.R5;
import R2.W5;
import R2.Y1;
import R2.a2;

public final class J4
implements Runnable {
    public final /* synthetic */ W5 o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ R5 q;
    public final /* synthetic */ D4 r;

    public J4(D4 d42, W5 w52, boolean bl, R5 r52) {
        this.r = d42;
        this.o = w52;
        this.p = bl;
        this.q = r52;
    }

    public final void run() {
        R1 r12 = D4.B(this.r);
        if (r12 == null) {
            this.r.j().G().a("Discarding data. Failed to set user property");
            return;
        }
        n.i(this.o);
        D4 d42 = this.r;
        R5 r52 = this.p ? null : this.q;
        d42.F(r12, r52, this.o);
        D4.m0(this.r);
    }
}

