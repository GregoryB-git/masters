/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package G4;

import com.google.firebase.perf.metrics.AppStartTrace;

public final class e
implements Runnable {
    public final /* synthetic */ AppStartTrace o;

    public /* synthetic */ e(AppStartTrace appStartTrace) {
        this.o = appStartTrace;
    }

    public final void run() {
        AppStartTrace.c(this.o);
    }
}

