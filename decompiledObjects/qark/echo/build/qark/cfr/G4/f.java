/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package G4;

import N4.m;
import com.google.firebase.perf.metrics.AppStartTrace;

public final class f
implements Runnable {
    public final /* synthetic */ AppStartTrace o;
    public final /* synthetic */ m.b p;

    public /* synthetic */ f(AppStartTrace appStartTrace, m.b b8) {
        this.o = appStartTrace;
        this.p = b8;
    }

    public final void run() {
        AppStartTrace.b(this.o, this.p);
    }
}

