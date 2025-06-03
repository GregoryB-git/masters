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
import R2.Y1;
import R2.a2;
import R2.l2;
import R2.q2;

public final class R3
implements Runnable {
    public final /* synthetic */ long o;
    public final /* synthetic */ C3 p;

    public R3(C3 c32, long l8) {
        this.p = c32;
        this.o = l8;
    }

    public final void run() {
        this.p.i().k.b(this.o);
        this.p.j().F().b("Session timeout duration set", this.o);
    }
}

