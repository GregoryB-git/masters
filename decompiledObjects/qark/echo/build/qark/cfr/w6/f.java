/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Runnable
 *  java.lang.String
 */
package w6;

import X5.g;
import p6.g0;
import w6.a;
import w6.i;

public abstract class f
extends g0 {
    public final int r;
    public final int s;
    public final long t;
    public final String u;
    public a v;

    public f(int n8, int n9, long l8, String string2) {
        this.r = n8;
        this.s = n9;
        this.t = l8;
        this.u = string2;
        this.v = this.H();
    }

    @Override
    public void E(g g8, Runnable runnable) {
        a.k(this.v, runnable, null, false, 6, null);
    }

    public final a H() {
        return new a(this.r, this.s, this.t, this.u);
    }

    public final void I(Runnable runnable, i i8, boolean bl) {
        this.v.i(runnable, i8, bl);
    }
}

