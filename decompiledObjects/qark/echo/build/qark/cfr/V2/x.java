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
import V2.d;
import V2.j;
import V2.w;
import java.util.concurrent.Executor;

public final class x
implements G {
    public final Executor a;
    public final Object b = new Object();
    public d c;

    public x(Executor executor, d d8) {
        this.a = executor;
        this.c = d8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void c(j object) {
        if (!object.l()) return;
        object = this.b;
        // MONITORENTER : object
        if (this.c == null) {
            // MONITOREXIT : object
            return;
        }
        // MONITOREXIT : object
        this.a.execute((Runnable)new w(this));
    }
}

