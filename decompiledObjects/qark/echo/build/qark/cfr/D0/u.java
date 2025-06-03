/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package D0;

import D0.E;

public final class u
implements Runnable {
    public final /* synthetic */ E.a o;
    public final /* synthetic */ String p;
    public final /* synthetic */ long q;
    public final /* synthetic */ long r;

    public /* synthetic */ u(E.a a8, String string2, long l8, long l9) {
        this.o = a8;
        this.p = string2;
        this.q = l8;
        this.r = l9;
    }

    public final void run() {
        E.a.a(this.o, this.p, this.q, this.r);
    }
}

