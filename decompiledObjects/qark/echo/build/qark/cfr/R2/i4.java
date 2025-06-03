/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package R2;

import R2.C3;
import R2.K;
import R2.P1;
import R2.g;
import R2.q3;
import com.google.android.gms.internal.measurement.s7;

public final class i4
implements Runnable {
    public final /* synthetic */ q3 o;
    public final /* synthetic */ long p;
    public final /* synthetic */ long q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ q3 s;
    public final /* synthetic */ C3 t;

    public i4(C3 c32, q3 q32, long l8, long l9, boolean bl, q3 q33) {
        this.t = c32;
        this.o = q32;
        this.p = l8;
        this.q = l9;
        this.r = bl;
        this.s = q33;
    }

    public final void run() {
        this.t.G(this.o);
        this.t.E(this.p, false);
        C3.K(this.t, this.o, this.q, true, this.r);
        if (s7.a() && this.t.f().s(K.x0)) {
            C3.L(this.t, this.o, this.s);
        }
    }
}

