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

import R2.R2;
import android.os.Bundle;

public final class Q2
implements Runnable {
    public /* synthetic */ R2 o;
    public /* synthetic */ String p;
    public /* synthetic */ Bundle q;

    public /* synthetic */ Q2(R2 r22, String string2, Bundle bundle) {
        this.o = r22;
        this.p = string2;
        this.q = bundle;
    }

    public final void run() {
        this.o.Z0(this.p, this.q);
    }
}

