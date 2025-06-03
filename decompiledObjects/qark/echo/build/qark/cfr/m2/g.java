/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package m2;

import f2.p;
import m2.r;

public final class g
implements Runnable {
    public final /* synthetic */ r o;
    public final /* synthetic */ p p;
    public final /* synthetic */ int q;
    public final /* synthetic */ Runnable r;

    public /* synthetic */ g(r r8, p p8, int n8, Runnable runnable) {
        this.o = r8;
        this.p = p8;
        this.q = n8;
        this.r = runnable;
    }

    public final void run() {
        r.i(this.o, this.p, this.q, this.r);
    }
}

