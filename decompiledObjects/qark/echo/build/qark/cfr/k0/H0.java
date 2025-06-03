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
import x0.u;

public final class H0
implements Runnable {
    public final /* synthetic */ T0.a o;
    public final /* synthetic */ Pair p;
    public final /* synthetic */ u q;

    public /* synthetic */ H0(T0.a a8, Pair pair, u u8) {
        this.o = a8;
        this.p = pair;
        this.q = u8;
    }

    public final void run() {
        T0.a.r(this.o, this.p, this.q);
    }
}

