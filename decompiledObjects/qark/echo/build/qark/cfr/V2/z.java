/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Executor
 */
package V2;

import V2.G;
import V2.e;
import V2.j;
import V2.y;
import java.util.concurrent.Executor;

public final class z
implements G {
    public final Executor a;
    public final Object b = new Object();
    public e c;

    public z(Executor executor, e e8) {
        this.a = executor;
        this.c = e8;
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
        Object object = this.b;
        // MONITORENTER : object
        if (this.c == null) {
            // MONITOREXIT : object
            return;
        }
        // MONITOREXIT : object
        this.a.execute((Runnable)new y(this, j8));
    }
}

