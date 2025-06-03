/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package z2;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import z2.b0;

public final class a0
implements Runnable {
    public final /* synthetic */ LifecycleCallback o;
    public final /* synthetic */ String p;
    public final /* synthetic */ b0 q;

    public a0(b0 b02, LifecycleCallback lifecycleCallback, String string2) {
        this.q = b02;
        this.o = lifecycleCallback;
        this.p = string2;
    }

    public final void run() {
        b0 b02 = this.q;
        if (b0.H1(b02) > 0) {
            LifecycleCallback lifecycleCallback = this.o;
            b02 = b0.I1(b02) != null ? b0.I1(b02).getBundle(this.p) : null;
            lifecycleCallback.f((Bundle)b02);
        }
        if (b0.H1(this.q) >= 2) {
            this.o.j();
        }
        if (b0.H1(this.q) >= 3) {
            this.o.h();
        }
        if (b0.H1(this.q) >= 4) {
            this.o.k();
        }
        if (b0.H1(this.q) >= 5) {
            this.o.g();
        }
    }
}

