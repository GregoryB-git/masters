/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Executor
 */
package V2;

import V2.C;
import V2.G;
import V2.g;
import V2.j;
import java.util.concurrent.Executor;

public final class D
implements G {
    public final Executor a;
    public final Object b = new Object();
    public g c;

    public D(Executor executor, g g8) {
        this.a = executor;
        this.c = g8;
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
        if (!j8.n()) return;
        Object object = this.b;
        // MONITORENTER : object
        if (this.c == null) {
            // MONITOREXIT : object
            return;
        }
        // MONITOREXIT : object
        this.a.execute((Runnable)new C(this, j8));
    }
}

