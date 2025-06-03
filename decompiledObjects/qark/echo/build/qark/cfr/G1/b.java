/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package G1;

import G1.f;
import android.content.Context;

public final class b
implements Runnable {
    public final /* synthetic */ long o;
    public final /* synthetic */ String p;
    public final /* synthetic */ Context q;

    public /* synthetic */ b(long l8, String string2, Context context) {
        this.o = l8;
        this.p = string2;
        this.q = context;
    }

    public final void run() {
        f.a(this.o, this.p, this.q);
    }
}

