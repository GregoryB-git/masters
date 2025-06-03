/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package m0;

import m0.x;

public final class r
implements Runnable {
    public final /* synthetic */ x.a o;
    public final /* synthetic */ String p;
    public final /* synthetic */ long q;
    public final /* synthetic */ long r;

    public /* synthetic */ r(x.a a8, String string2, long l8, long l9) {
        this.o = a8;
        this.p = string2;
        this.q = l8;
        this.r = l9;
    }

    public final void run() {
        x.a.k(this.o, this.p, this.q, this.r);
    }
}

