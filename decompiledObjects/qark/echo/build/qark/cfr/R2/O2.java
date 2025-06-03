/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package R2;

import R2.N2;
import R2.x3;
import com.google.android.gms.internal.measurement.H0;

public final class O2
implements Runnable {
    public final /* synthetic */ x3 o;
    public final /* synthetic */ N2 p;

    public O2(N2 n22, x3 x32) {
        this.p = n22;
        this.o = x32;
    }

    public final void run() {
        N2.g(this.p, this.o);
        this.p.k(this.o.g);
    }
}

