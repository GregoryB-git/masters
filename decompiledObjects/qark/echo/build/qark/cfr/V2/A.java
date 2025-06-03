/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Throwable
 */
package V2;

import A2.n;
import V2.B;
import V2.j;

public final class A
implements Runnable {
    public final /* synthetic */ j o;
    public final /* synthetic */ B p;

    public A(B b8, j j8) {
        this.p = b8;
        this.o = j8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Object object = B.b(this.p);
        synchronized (object) {
            try {
                B b8 = this.p;
                if (B.a(b8) != null) {
                    B.a(b8).d((Exception)n.i((Object)this.o.i()));
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

