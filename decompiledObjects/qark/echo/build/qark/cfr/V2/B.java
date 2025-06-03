/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Executor
 */
package V2;

import V2.A;
import V2.G;
import V2.f;
import V2.j;
import java.util.concurrent.Executor;

public final class B
implements G {
    public final Executor a;
    public final Object b = new Object();
    public f c;

    public B(Executor executor, f f8) {
        this.a = executor;
        this.c = f8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void c(j j8) {
        if (j8.n()) return;
        if (j8.l()) return;
        Object object = this.b;
        // MONITORENTER : object
        if (this.c == null) {
            // MONITOREXIT : object
            return;
        }
        // MONITOREXIT : object
        this.a.execute((Runnable)new A(this, j8));
    }
}

