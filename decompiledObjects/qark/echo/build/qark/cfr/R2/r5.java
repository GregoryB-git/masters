/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 */
package R2;

import E2.e;
import R2.B;
import R2.C3;
import R2.K;
import R2.N2;
import R2.P1;
import R2.S5;
import R2.Y1;
import R2.a2;
import R2.g;
import R2.l2;
import R2.l5;
import R2.m3;
import R2.o3;
import R2.q2;
import R2.u5;
import R2.v4;
import R2.w4;
import R2.x;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.G6;

public final class r5 {
    public long a;
    public long b;
    public final x c;
    public final /* synthetic */ l5 d;

    public r5(l5 l52) {
        long l8;
        this.d = l52;
        this.c = new u5(this, l52.a);
        this.a = l8 = l52.b().b();
        this.b = l8;
    }

    public static /* synthetic */ void c(r5 r52) {
        r52.d.n();
        r52.d(false, false, r52.d.b().b());
        r52.d.o().v(r52.d.b().b());
    }

    public final long a(long l8) {
        long l9 = this.b;
        this.b = l8;
        return l8 - l9;
    }

    public final void b() {
        this.c.a();
        this.a = 0L;
        this.b = 0L;
    }

    public final boolean d(boolean bl, boolean bl2, long l8) {
        this.d.n();
        this.d.v();
        if (!G6.a() || !this.d.f().s(K.q0) || this.d.a.p()) {
            this.d.i().p.b(this.d.b().a());
        }
        long l9 = l8 - this.a;
        if (!bl && l9 < 1000L) {
            this.d.j().K().b("Screen exposed for less than 1000 ms. Event not sent. time", l9);
            return false;
        }
        if (!bl2) {
            l9 = this.a(l8);
        }
        this.d.j().K().b("Recording user engagement, ms", l9);
        Bundle bundle = new Bundle();
        bundle.putLong("_et", l9);
        bl = this.d.f().Q();
        S5.L(this.d.s().C(bl ^ true), bundle, true);
        if (!bl2) {
            this.d.r().z0("auto", "_e", bundle);
        }
        this.a = l8;
        this.c.a();
        this.c.b(3600000L);
        return true;
    }

    public final void e(long l8) {
        this.c.a();
    }

    public final void f(long l8) {
        this.d.n();
        this.c.a();
        this.a = l8;
        this.b = l8;
    }
}

