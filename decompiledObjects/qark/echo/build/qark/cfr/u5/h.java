/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package u5;

import android.window.OnBackInvokedCallback;
import u5.i;

public final class h
implements OnBackInvokedCallback {
    public final /* synthetic */ i a;

    public /* synthetic */ h(i i8) {
        this.a = i8;
    }

    public final void onBackInvoked() {
        this.a.onBackPressed();
    }
}

