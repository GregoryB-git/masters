/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package K4;

import N4.d;
import com.google.firebase.perf.session.gauges.GaugeManager;

public final class e
implements Runnable {
    public final /* synthetic */ GaugeManager o;
    public final /* synthetic */ String p;
    public final /* synthetic */ d q;

    public /* synthetic */ e(GaugeManager gaugeManager, String string2, d d8) {
        this.o = gaugeManager;
        this.p = string2;
        this.q = d8;
    }

    public final void run() {
        GaugeManager.a(this.o, this.p, this.q);
    }
}

