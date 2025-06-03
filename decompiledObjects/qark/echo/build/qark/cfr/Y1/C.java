/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.Runnable
 */
package Y1;

import Y1.D;
import Y1.u;
import android.os.Bundle;

public final class C
implements Runnable {
    public final /* synthetic */ D o;
    public final /* synthetic */ u.e p;
    public final /* synthetic */ Bundle q;

    public /* synthetic */ C(D d8, u.e e8, Bundle bundle) {
        this.o = d8;
        this.p = e8;
        this.q = bundle;
    }

    public final void run() {
        D.p(this.o, this.p, this.q);
    }
}

