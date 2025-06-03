/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package R2;

import R2.B;

public final class a
implements Runnable {
    public final /* synthetic */ String o;
    public final /* synthetic */ long p;
    public final /* synthetic */ B q;

    public a(B b8, String string2, long l8) {
        this.q = b8;
        this.o = string2;
        this.p = l8;
    }

    public final void run() {
        B.y(this.q, this.o, this.p);
    }
}

