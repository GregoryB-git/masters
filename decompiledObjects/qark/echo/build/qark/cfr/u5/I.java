/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 *  java.lang.Object
 *  java.lang.Runnable
 */
package u5;

import android.view.KeyEvent;
import u5.K;
import u5.M;

public final class I
implements Runnable {
    public final /* synthetic */ K o;
    public final /* synthetic */ M.c p;
    public final /* synthetic */ long q;
    public final /* synthetic */ KeyEvent r;

    public /* synthetic */ I(K k8, M.c c8, long l8, KeyEvent keyEvent) {
        this.o = k8;
        this.p = c8;
        this.q = l8;
        this.r = keyEvent;
    }

    public final void run() {
        K.c(this.o, this.p, this.q, this.r);
    }
}

