/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Runnable
 */
package x0;

import java.io.IOException;
import x0.E;
import x0.r;
import x0.u;

public final class C
implements Runnable {
    public final /* synthetic */ E.a o;
    public final /* synthetic */ E p;
    public final /* synthetic */ r q;
    public final /* synthetic */ u r;
    public final /* synthetic */ IOException s;
    public final /* synthetic */ boolean t;

    public /* synthetic */ C(E.a a8, E e8, r r8, u u8, IOException iOException, boolean bl) {
        this.o = a8;
        this.p = e8;
        this.q = r8;
        this.r = u8;
        this.s = iOException;
        this.t = bl;
    }

    public final void run() {
        E.a.f(this.o, this.p, this.q, this.r, this.s, this.t);
    }
}

