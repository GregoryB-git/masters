/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.Runnable
 */
package C4;

import C4.x;
import android.content.Context;

public final class w
implements Runnable {
    public final /* synthetic */ x o;
    public final /* synthetic */ Context p;

    public /* synthetic */ w(x x8, Context context) {
        this.o = x8;
        this.p = context;
    }

    public final void run() {
        x.a(this.o, this.p);
    }
}

