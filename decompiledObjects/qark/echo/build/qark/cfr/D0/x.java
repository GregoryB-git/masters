/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package D0;

import D0.E;

public final class x
implements Runnable {
    public final /* synthetic */ E.a o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ long q;

    public /* synthetic */ x(E.a a8, Object object, long l8) {
        this.o = a8;
        this.p = object;
        this.q = l8;
    }

    public final void run() {
        E.a.j(this.o, this.p, this.q);
    }
}

