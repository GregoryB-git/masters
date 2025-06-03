/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package T3;

import T3.n;

public final class i
implements Runnable {
    public final /* synthetic */ n o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ boolean q;

    public /* synthetic */ i(n n8, boolean bl, boolean bl2) {
        this.o = n8;
        this.p = bl;
        this.q = bl2;
    }

    public final void run() {
        n.v(this.o, this.p, this.q);
    }
}

