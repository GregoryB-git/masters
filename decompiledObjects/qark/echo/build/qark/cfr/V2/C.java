/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Throwable
 */
package V2;

import V2.D;
import V2.j;

public final class C
implements Runnable {
    public final /* synthetic */ j o;
    public final /* synthetic */ D p;

    public C(D d8, j j8) {
        this.p = d8;
        this.o = j8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Object object = D.b(this.p);
        synchronized (object) {
            try {
                D d8 = this.p;
                if (D.a(d8) != null) {
                    D.a(d8).a(this.o.j());
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

