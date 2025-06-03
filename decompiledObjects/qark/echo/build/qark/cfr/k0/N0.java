/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 */
package k0;

import android.util.Pair;
import k0.T0;

public final class N0
implements Runnable {
    public final /* synthetic */ T0.a o;
    public final /* synthetic */ Pair p;
    public final /* synthetic */ Exception q;

    public /* synthetic */ N0(T0.a a8, Pair pair, Exception exception) {
        this.o = a8;
        this.p = pair;
        this.q = exception;
    }

    public final void run() {
        T0.a.E(this.o, this.p, this.q);
    }
}

