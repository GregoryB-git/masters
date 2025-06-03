/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package R2;

import A2.n;
import E2.e;
import R2.D5;
import R2.I;
import R2.K5;
import R2.S5;
import android.os.Bundle;

public final class J5
implements Runnable {
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;
    public final /* synthetic */ Bundle q;
    public final /* synthetic */ K5 r;

    public J5(K5 k52, String string2, String string3, Bundle bundle) {
        this.r = k52;
        this.o = string2;
        this.p = string3;
        this.q = bundle;
    }

    public final void run() {
        I i8 = this.r.a.n0().C(this.o, this.p, this.q, "auto", this.r.a.b().a(), false, true);
        this.r.a.r((I)n.i(i8), this.o);
    }
}

