/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Throwable
 */
package V2;

import V2.x;

public final class w
implements Runnable {
    public final /* synthetic */ x o;

    public w(x x8) {
        this.o = x8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Object object = x.b(this.o);
        synchronized (object) {
            try {
                x x8 = this.o;
                if (x.a(x8) != null) {
                    x.a(x8).b();
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

