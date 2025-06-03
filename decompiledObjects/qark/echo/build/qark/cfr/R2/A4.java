/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package R2;

import R2.v4;
import R2.w4;

public final class A4
implements Runnable {
    public final /* synthetic */ w4 o;
    public final /* synthetic */ w4 p;
    public final /* synthetic */ long q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ v4 s;

    public A4(v4 v42, w4 w42, w4 w43, long l8, boolean bl) {
        this.s = v42;
        this.o = w42;
        this.p = w43;
        this.q = l8;
        this.r = bl;
    }

    public final void run() {
        v4.F(this.s, this.o, this.p, this.q, this.r, null);
    }
}

