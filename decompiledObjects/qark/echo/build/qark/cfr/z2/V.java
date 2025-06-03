/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 */
package z2;

import android.app.Dialog;
import z2.D;
import z2.W;
import z2.X;

public final class V
extends D {
    public final /* synthetic */ Dialog a;
    public final /* synthetic */ W b;

    public V(W w8, Dialog dialog) {
        this.b = w8;
        this.a = dialog;
    }

    @Override
    public final void a() {
        X.r(this.b.p);
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}

