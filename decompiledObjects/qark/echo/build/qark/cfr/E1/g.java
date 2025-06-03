/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package E1;

import E1.h;

public final class g
implements Runnable {
    public final /* synthetic */ h o;
    public final /* synthetic */ Runnable p;

    public /* synthetic */ g(h h8, Runnable runnable) {
        this.o = h8;
        this.p = runnable;
    }

    public final void run() {
        h.a(this.o, this.p);
    }
}

