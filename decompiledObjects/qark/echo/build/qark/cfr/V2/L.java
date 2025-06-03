/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.Throwable
 *  java.util.concurrent.Callable
 */
package V2;

import V2.K;
import java.util.concurrent.Callable;

public final class L
implements Runnable {
    public final /* synthetic */ K o;
    public final /* synthetic */ Callable p;

    public L(K k8, Callable callable) {
        this.o = k8;
        this.p = callable;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void run() {
        try {
            this.o.r(this.p.call());
            return;
        }
        catch (Exception var1_2) {}
        ** finally { 
lbl6: // 1 sources:
        this.o.q((Exception)new RuntimeException(var1_1));
    }
}

