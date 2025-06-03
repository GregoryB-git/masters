/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.TimerTask
 */
package B1;

import B1.l;
import java.util.TimerTask;

public final class i
implements Runnable {
    public final /* synthetic */ l o;
    public final /* synthetic */ TimerTask p;

    public /* synthetic */ i(l l8, TimerTask timerTask) {
        this.o = l8;
        this.p = timerTask;
    }

    public final void run() {
        l.b(this.o, this.p);
    }
}

