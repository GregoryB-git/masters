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

public final class J
implements Runnable {
    public final /* synthetic */ K o;
    public final /* synthetic */ M.c p;
    public final /* synthetic */ KeyEvent q;

    public /* synthetic */ J(K k8, M.c c8, KeyEvent keyEvent) {
        this.o = k8;
        this.p = c8;
        this.q = keyEvent;
    }

    public final void run() {
        K.b(this.o, this.p, this.q);
    }
}

