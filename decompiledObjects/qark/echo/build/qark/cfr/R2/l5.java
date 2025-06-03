/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  java.lang.Object
 *  java.lang.String
 */
package R2;

import E2.e;
import R2.B;
import R2.C;
import R2.C3;
import R2.D4;
import R2.G1;
import R2.G2;
import R2.K;
import R2.N2;
import R2.P1;
import R2.S1;
import R2.S5;
import R2.V1;
import R2.X1;
import R2.Y1;
import R2.a2;
import R2.f;
import R2.f1;
import R2.g;
import R2.l2;
import R2.m3;
import R2.o2;
import R2.q5;
import R2.r5;
import R2.t5;
import R2.v4;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.t0;

public final class l5
extends f1 {
    public Handler c;
    public boolean d = true;
    public final t5 e;
    public final r5 f;
    public final q5 g;

    public l5(N2 n22) {
        super(n22);
        this.e = new t5(this);
        this.f = new r5(this);
        this.g = new q5(this);
    }

    public static /* synthetic */ void C(l5 l52, long l8) {
        l52.n();
        l52.G();
        l52.j().K().b("Activity paused, time", l8);
        l52.g.b(l8);
        if (l52.f().Q()) {
            l52.f.e(l8);
        }
    }

    private final void G() {
        this.n();
        if (this.c == null) {
            this.c = new t0(Looper.getMainLooper());
        }
    }

    public static /* synthetic */ void H(l5 l52) {
        l52.G();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static /* synthetic */ void I(l5 object, long l8) {
        object.n();
        l5.super.G();
        object.j().K().b("Activity resumed, time", l8);
        if (object.f().s(K.Q0) ? object.f().Q() || object.d : object.f().Q() || object.i().s.b()) {
            object.f.f(l8);
        }
        object.g.a();
        object = object.e;
        object.a.n();
        if (object.a.a.p()) {
            object.b(object.a.b().a(), false);
        }
    }

    @Override
    public final boolean A() {
        return false;
    }

    public final void D(boolean bl) {
        this.n();
        this.d = bl;
    }

    public final boolean E(boolean bl, boolean bl2, long l8) {
        return this.f.d(bl, bl2, l8);
    }

    public final boolean F() {
        this.n();
        return this.d;
    }
}

