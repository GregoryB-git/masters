/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  java.lang.Object
 */
package M4;

import M4.e;
import android.view.View;
import android.view.ViewTreeObserver;

public final class d
implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ e o;
    public final /* synthetic */ View p;

    public /* synthetic */ d(e e8, View view) {
        this.o = e8;
        this.p = view;
    }

    public final void onGlobalLayout() {
        e.a(this.o, this.p);
    }
}

