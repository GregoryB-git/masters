/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package J5;

import J5.i;
import J5.p;
import V2.k;

public final class f
implements Runnable {
    public final /* synthetic */ i o;
    public final /* synthetic */ p.d p;
    public final /* synthetic */ String q;
    public final /* synthetic */ k r;

    public /* synthetic */ f(i i8, p.d d8, String string2, k k8) {
        this.o = i8;
        this.p = d8;
        this.q = string2;
        this.r = k8;
    }

    public final void run() {
        i.h(this.o, this.p, this.q, this.r);
    }
}

