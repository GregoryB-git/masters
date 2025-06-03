/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package x1;

import android.content.Context;
import x1.B;

public final class A
implements Runnable {
    public final /* synthetic */ Context o;
    public final /* synthetic */ String p;

    public /* synthetic */ A(Context context, String string2) {
        this.o = context;
        this.p = string2;
    }

    public final void run() {
        B.i(this.o, this.p);
    }
}

