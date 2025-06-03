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
import z2.Z;

public final class Y
implements Runnable {
    public final /* synthetic */ LifecycleCallback o;
    public final /* synthetic */ String p;
    public final /* synthetic */ Z q;

    public Y(Z z8, LifecycleCallback lifecycleCallback, String string2) {
        this.q = z8;
        this.o = lifecycleCallback;
        this.p = string2;
    }

    public final void run() {
        Z z8 = this.q;
        if (Z.d(z8) > 0) {
            LifecycleCallback lifecycleCallback = this.o;
            z8 = Z.e(z8) != null ? Z.e(z8).getBundle(this.p) : null;
            lifecycleCallback.f((Bundle)z8);
        }
        if (Z.d(this.q) >= 2) {
            this.o.j();
        }
        if (Z.d(this.q) >= 3) {
            this.o.h();
        }
        if (Z.d(this.q) >= 4) {
            this.o.k();
        }
        if (Z.d(this.q) >= 5) {
            this.o.g();
        }
    }
}

