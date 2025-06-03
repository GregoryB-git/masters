/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package D0;

import D0.E;

public final class w
implements Runnable {
    public final /* synthetic */ E.a o;
    public final /* synthetic */ int p;
    public final /* synthetic */ long q;

    public /* synthetic */ w(E.a a8, int n8, long l8) {
        this.o = a8;
        this.p = n8;
        this.q = l8;
    }

    public final void run() {
        E.a.c(this.o, this.p, this.q);
    }
}

