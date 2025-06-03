/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  java.lang.Object
 *  java.lang.Runnable
 */
package k0;

import android.util.Pair;
import k0.T0;
import x0.r;
import x0.u;

public final class P0
implements Runnable {
    public final /* synthetic */ T0.a o;
    public final /* synthetic */ Pair p;
    public final /* synthetic */ r q;
    public final /* synthetic */ u r;

    public /* synthetic */ P0(T0.a a8, Pair pair, r r8, u u8) {
        this.o = a8;
        this.p = pair;
        this.q = r8;
        this.r = u8;
    }

    public final void run() {
        T0.a.x(this.o, this.p, this.q, this.r);
    }
}

