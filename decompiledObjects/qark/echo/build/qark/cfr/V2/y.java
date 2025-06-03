/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Throwable
 */
package V2;

import V2.j;
import V2.z;

public final class y
implements Runnable {
    public final /* synthetic */ j o;
    public final /* synthetic */ z p;

    public y(z z8, j j8) {
        this.p = z8;
        this.o = j8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Object object = z.b(this.p);
        synchronized (object) {
            try {
                z z8 = this.p;
                if (z.a(z8) != null) {
                    z.a(z8).a(this.o);
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

