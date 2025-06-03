/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package n0;

import androidx.media3.exoplayer.dash.DashMediaSource;

public final class f
implements Runnable {
    public final /* synthetic */ DashMediaSource o;

    public /* synthetic */ f(DashMediaSource dashMediaSource) {
        this.o = dashMediaSource;
    }

    public final void run() {
        DashMediaSource.C(this.o);
    }
}

