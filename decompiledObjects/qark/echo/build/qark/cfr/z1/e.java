/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  java.lang.Object
 *  java.lang.Runnable
 */
package z1;

import android.view.View;
import z1.f;

public final class e
implements Runnable {
    public final /* synthetic */ View o;
    public final /* synthetic */ f p;

    public /* synthetic */ e(View view, f f8) {
        this.o = view;
        this.p = f8;
    }

    public final void run() {
        f.a(this.o, this.p);
    }
}

