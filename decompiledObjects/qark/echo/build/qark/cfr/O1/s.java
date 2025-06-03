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

import O1.v;
import android.content.Context;

public final class s
implements Runnable {
    public final /* synthetic */ Context o;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;

    public /* synthetic */ s(Context context, String string2, String string3) {
        this.o = context;
        this.p = string2;
        this.q = string3;
    }

    public final void run() {
        v.b(this.o, this.p, this.q);
    }
}

