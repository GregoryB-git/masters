/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.Runnable
 */
package R2;

import R2.v4;
import R2.w4;
import android.os.Bundle;

public final class x4
implements Runnable {
    public final /* synthetic */ Bundle o;
    public final /* synthetic */ w4 p;
    public final /* synthetic */ w4 q;
    public final /* synthetic */ long r;
    public final /* synthetic */ v4 s;

    public x4(v4 v42, Bundle bundle, w4 w42, w4 w43, long l8) {
        this.s = v42;
        this.o = bundle;
        this.p = w42;
        this.q = w43;
        this.r = l8;
    }

    public final void run() {
        v4.H(this.s, this.o, this.p, this.q, this.r);
    }
}

