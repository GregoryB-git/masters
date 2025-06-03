/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package K4;

import com.google.firebase.perf.session.gauges.GaugeManager;

public final class d
implements Runnable {
    public final /* synthetic */ GaugeManager o;
    public final /* synthetic */ String p;
    public final /* synthetic */ N4.d q;

    public /* synthetic */ d(GaugeManager gaugeManager, String string2, N4.d d8) {
        this.o = gaugeManager;
        this.p = string2;
        this.q = d8;
    }

    public final void run() {
        GaugeManager.d(this.o, this.p, this.q);
    }
}

