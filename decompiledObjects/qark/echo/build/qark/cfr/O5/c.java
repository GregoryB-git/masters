/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  java.lang.Object
 *  java.lang.Runnable
 */
package O5;

import O5.e;
import android.os.Handler;
import v5.j;
import y5.f;

public final class c
implements Runnable {
    public final /* synthetic */ e o;
    public final /* synthetic */ f p;
    public final /* synthetic */ Handler q;
    public final /* synthetic */ j r;
    public final /* synthetic */ long s;

    public /* synthetic */ c(e e8, f f8, Handler handler, j j8, long l8) {
        this.o = e8;
        this.p = f8;
        this.q = handler;
        this.r = j8;
        this.s = l8;
    }

    public final void run() {
        e.b(this.o, this.p, this.q, this.r, this.s);
    }
}

