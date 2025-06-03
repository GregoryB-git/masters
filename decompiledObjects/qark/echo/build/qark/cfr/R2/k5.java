/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  java.lang.Object
 *  java.lang.Runnable
 */
package R2;

import R2.Y1;
import R2.i5;
import android.content.Intent;

public final class k5
implements Runnable {
    public /* synthetic */ i5 o;
    public /* synthetic */ int p;
    public /* synthetic */ Y1 q;
    public /* synthetic */ Intent r;

    public /* synthetic */ k5(i5 i52, int n8, Y1 y12, Intent intent) {
        this.o = i52;
        this.p = n8;
        this.q = y12;
        this.r = intent;
    }

    public final void run() {
        this.o.d(this.p, this.q, this.r);
    }
}

