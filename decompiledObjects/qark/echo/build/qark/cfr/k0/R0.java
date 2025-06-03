/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Runnable
 */
package k0;

import android.util.Pair;
import java.io.IOException;
import k0.T0;
import x0.r;
import x0.u;

public final class R0
implements Runnable {
    public final /* synthetic */ T0.a o;
    public final /* synthetic */ Pair p;
    public final /* synthetic */ r q;
    public final /* synthetic */ u r;
    public final /* synthetic */ IOException s;
    public final /* synthetic */ boolean t;

    public /* synthetic */ R0(T0.a a8, Pair pair, r r8, u u8, IOException iOException, boolean bl) {
        this.o = a8;
        this.p = pair;
        this.q = r8;
        this.r = u8;
        this.s = iOException;
        this.t = bl;
    }

    public final void run() {
        T0.a.B(this.o, this.p, this.q, this.r, this.s, this.t);
    }
}

