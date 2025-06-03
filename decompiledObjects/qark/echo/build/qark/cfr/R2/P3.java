/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package R2;

import R2.C3;
import R2.N2;
import R2.Y1;
import R2.a2;
import R2.m3;

public final class P3
implements Runnable {
    public final /* synthetic */ boolean o;
    public final /* synthetic */ C3 p;

    public P3(C3 c32, boolean bl) {
        this.p = c32;
        this.o = bl;
    }

    public final void run() {
        boolean bl = this.p.a.p();
        boolean bl2 = this.p.a.o();
        this.p.a.m(this.o);
        if (bl2 == this.o) {
            this.p.a.j().K().b("Default data collection state already set to", this.o);
        }
        if (this.p.a.p() == bl || this.p.a.p() != this.p.a.o()) {
            this.p.a.j().M().c("Default data collection is different than actual status", this.o, bl);
        }
        C3.v0(this.p);
    }
}

