/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.Map
 *  java.util.Set
 */
package R2;

import A2.n;
import E2.e;
import R2.C;
import R2.C3;
import R2.D4;
import R2.E0;
import R2.G1;
import R2.G2;
import R2.N2;
import R2.S1;
import R2.S5;
import R2.V1;
import R2.X1;
import R2.Y1;
import R2.a;
import R2.a2;
import R2.f;
import R2.g;
import R2.l2;
import R2.l5;
import R2.m3;
import R2.v4;
import R2.w4;
import android.content.Context;
import android.os.Bundle;
import java.util.Map;
import java.util.Set;

public final class B
extends G1 {
    public final Map b = new t.a();
    public final Map c = new t.a();
    public long d;

    public B(N2 n22) {
        super(n22);
    }

    public static /* synthetic */ void C(B b8, String string2, long l8) {
        b8.n();
        n.e(string2);
        Integer n8 = (Integer)b8.c.get((Object)string2);
        if (n8 != null) {
            w4 w42 = b8.s().C(false);
            int n9 = n8 - 1;
            if (n9 == 0) {
                long l9;
                b8.c.remove((Object)string2);
                n8 = (Long)b8.b.get((Object)string2);
                if (n8 == null) {
                    b8.j().G().a("First ad unit exposure time was never set");
                } else {
                    l9 = n8.longValue();
                    b8.b.remove((Object)string2);
                    b8.A(string2, l8 - l9, w42);
                }
                if (b8.c.isEmpty()) {
                    l9 = b8.d;
                    if (l9 == 0L) {
                        b8.j().G().a("First ad exposure time was never set");
                        return;
                    }
                    b8.w(l8 - l9, w42);
                    b8.d = 0L;
                }
                return;
            }
            b8.c.put((Object)string2, (Object)n9);
            return;
        }
        b8.j().G().b("Call to endAdUnitExposure for unknown ad unit id", string2);
    }

    public static /* synthetic */ void x(B b8, long l8) {
        b8.B(l8);
    }

    public static /* synthetic */ void y(B b8, String string2, long l8) {
        Integer n8;
        b8.n();
        n.e(string2);
        if (b8.c.isEmpty()) {
            b8.d = l8;
        }
        if ((n8 = (Integer)b8.c.get((Object)string2)) != null) {
            b8.c.put((Object)string2, (Object)(n8 + 1));
            return;
        }
        if (b8.c.size() >= 100) {
            b8.j().L().a("Too many ads visible");
            return;
        }
        b8.c.put((Object)string2, (Object)1);
        b8.b.put((Object)string2, (Object)l8);
    }

    public final void A(String string2, long l8, w4 w42) {
        if (w42 == null) {
            this.j().K().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (l8 < 1000L) {
            this.j().K().b("Not logging ad unit exposure. Less than 1000 ms. exposure", l8);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", string2);
        bundle.putLong("_xt", l8);
        S5.L(w42, bundle, true);
        this.r().z0("am", "_xu", bundle);
    }

    public final void B(long l8) {
        for (String string2 : this.b.keySet()) {
            this.b.put((Object)string2, (Object)l8);
        }
        if (!this.b.isEmpty()) {
            this.d = l8;
        }
    }

    public final void D(String string2, long l8) {
        if (string2 != null && string2.length() != 0) {
            this.e().D(new E0(this, string2, l8));
            return;
        }
        this.j().G().a("Ad unit id must be a non-empty string");
    }

    public final void v(long l8) {
        w4 w42 = this.s().C(false);
        for (String string2 : this.b.keySet()) {
            this.A(string2, l8 - (Long)this.b.get((Object)string2), w42);
        }
        if (!this.b.isEmpty()) {
            this.w(l8 - this.d, w42);
        }
        this.B(l8);
    }

    public final void w(long l8, w4 w42) {
        if (w42 == null) {
            this.j().K().a("Not logging ad exposure. No active activity");
            return;
        }
        if (l8 < 1000L) {
            this.j().K().b("Not logging ad exposure. Less than 1000 ms. exposure", l8);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", l8);
        S5.L(w42, bundle, true);
        this.r().z0("am", "_xa", bundle);
    }

    public final void z(String string2, long l8) {
        if (string2 != null && string2.length() != 0) {
            this.e().D(new a(this, string2, l8));
            return;
        }
        this.j().G().a("Ad unit id must be a non-empty string");
    }
}

