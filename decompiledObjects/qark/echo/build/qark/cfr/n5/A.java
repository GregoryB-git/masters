/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package n5;

import E5.j;
import E5.k;
import n5.E;
import n5.k;

public final class A
implements Runnable {
    public final /* synthetic */ boolean o;
    public final /* synthetic */ String p;
    public final /* synthetic */ k.d q;
    public final /* synthetic */ Boolean r;
    public final /* synthetic */ k s;
    public final /* synthetic */ j t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ int v;

    public /* synthetic */ A(boolean bl, String string2, k.d d8, Boolean bl2, k k8, j j8, boolean bl3, int n8) {
        this.o = bl;
        this.p = string2;
        this.q = d8;
        this.r = bl2;
        this.s = k8;
        this.t = j8;
        this.u = bl3;
        this.v = n8;
    }

    public final void run() {
        E.d(this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v);
    }
}

