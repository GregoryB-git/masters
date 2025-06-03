/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 *  java.lang.Object
 *  java.lang.Runnable
 */
package z;

import android.graphics.Typeface;
import z.h;

public final class i
implements Runnable {
    public final /* synthetic */ h.b o;
    public final /* synthetic */ Typeface p;

    public /* synthetic */ i(h.b b8, Typeface typeface) {
        this.o = b8;
        this.p = typeface;
    }

    public final void run() {
        h.b.a(this.o, this.p);
    }
}

