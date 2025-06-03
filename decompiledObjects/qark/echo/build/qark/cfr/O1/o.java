/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package O1;

import O1.q;
import android.content.Context;

public final class o
implements Runnable {
    public final /* synthetic */ String o;
    public final /* synthetic */ Context p;
    public final /* synthetic */ String q;

    public /* synthetic */ o(String string2, Context context, String string3) {
        this.o = string2;
        this.p = context;
        this.q = string3;
    }

    public final void run() {
        q.b(this.o, this.p, this.q);
    }
}

