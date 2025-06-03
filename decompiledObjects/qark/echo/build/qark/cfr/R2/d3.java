/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package R2;

import A2.n;
import R2.D5;
import R2.G2;
import R2.K;
import R2.P1;
import R2.R2;
import R2.W5;
import R2.Y1;
import R2.a2;
import R2.g;
import R2.q3;
import R2.z;
import com.google.android.gms.internal.measurement.n6;

public final class d3
implements Runnable {
    public final /* synthetic */ W5 o;
    public final /* synthetic */ R2 p;

    public d3(R2 r22, W5 w52) {
        this.p = r22;
        this.o = w52;
    }

    public final void run() {
        R2.o(this.p).o0();
        D5 d52 = R2.o(this.p);
        W5 w52 = this.o;
        d52.e().n();
        d52.p0();
        n.e(w52.o);
        int n8 = n6.a() && d52.c0().s(K.T0) ? w52.O : 100;
        Object object = q3.f(w52.J, n8);
        q3 q32 = d52.Q(w52.o);
        d52.j().K().c("Setting consent, package, consent", w52.o, object);
        d52.B(w52.o, (q3)object);
        if (object.t(q32)) {
            d52.b0(w52);
        }
        if (n6.a() && d52.c0().s(K.T0) && !z.f.equals(object = z.c(w52.P))) {
            d52.j().K().c("Setting DMA consent. package, consent", w52.o, object);
            d52.A(w52.o, (z)object);
        }
    }
}

