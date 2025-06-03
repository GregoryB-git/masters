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

public final class J0
implements Runnable {
    public final /* synthetic */ T0.a o;
    public final /* synthetic */ Pair p;

    public /* synthetic */ J0(T0.a a8, Pair pair) {
        this.o = a8;
        this.p = pair;
    }

    public final void run() {
        T0.a.D(this.o, this.p);
    }
}

