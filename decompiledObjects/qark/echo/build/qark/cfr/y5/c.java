/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package y5;

import android.content.Context;
import android.os.Handler;
import y5.f;

public final class c
implements Runnable {
    public final /* synthetic */ f o;
    public final /* synthetic */ Context p;
    public final /* synthetic */ String[] q;
    public final /* synthetic */ Handler r;
    public final /* synthetic */ Runnable s;

    public /* synthetic */ c(f f8, Context context, String[] arrstring, Handler handler, Runnable runnable) {
        this.o = f8;
        this.p = context;
        this.q = arrstring;
        this.r = handler;
        this.s = runnable;
    }

    public final void run() {
        f.b(this.o, this.p, this.q, this.r, this.s);
    }
}

