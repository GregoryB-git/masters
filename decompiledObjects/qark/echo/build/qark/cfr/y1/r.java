/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.Runnable
 */
package y1;

import android.content.Context;
import y1.s;

public final class r
implements Runnable {
    public final /* synthetic */ Context o;
    public final /* synthetic */ s p;

    public /* synthetic */ r(Context context, s s8) {
        this.o = context;
        this.p = s8;
    }

    public final void run() {
        s.a.a(this.o, this.p);
    }
}

