/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package R2;

import R2.G2;
import R2.f;
import R2.o3;
import R2.x;

public final class w
implements Runnable {
    public final /* synthetic */ o3 o;
    public final /* synthetic */ x p;

    public w(x x8, o3 o32) {
        this.p = x8;
        this.o = o32;
    }

    public final void run() {
        this.o.d();
        if (f.a()) {
            this.o.e().D(this);
            return;
        }
        boolean bl = this.p.e();
        x.c(this.p, 0L);
        if (bl) {
            this.p.d();
        }
    }
}

