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

import R2.C3;
import android.os.Bundle;

public final class U3
implements Runnable {
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;
    public final /* synthetic */ long q;
    public final /* synthetic */ Bundle r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ String v;
    public final /* synthetic */ C3 w;

    public U3(C3 c32, String string2, String string3, long l8, Bundle bundle, boolean bl, boolean bl2, boolean bl3, String string4) {
        this.w = c32;
        this.o = string2;
        this.p = string3;
        this.q = l8;
        this.r = bundle;
        this.s = bl;
        this.t = bl2;
        this.u = bl3;
        this.v = string4;
    }

    public final void run() {
        this.w.V(this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v);
    }
}

