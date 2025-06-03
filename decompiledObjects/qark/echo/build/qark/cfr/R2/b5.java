/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 */
package R2;

import R2.D4;
import R2.R1;
import R2.Y1;
import R2.a2;
import R2.a5;

public final class b5
implements Runnable {
    public final /* synthetic */ R1 o;
    public final /* synthetic */ a5 p;

    public b5(a5 a52, R1 r12) {
        this.p = a52;
        this.o = r12;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        a5 a52 = this.p;
        synchronized (a52) {
            try {
                a5.b(this.p, false);
                if (!this.p.c.c0()) {
                    this.p.c.j().F().a("Connected to remote service");
                    this.p.c.E(this.o);
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

