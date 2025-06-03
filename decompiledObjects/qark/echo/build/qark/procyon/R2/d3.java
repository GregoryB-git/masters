// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import com.google.android.gms.internal.measurement.n6;
import A2.n;

public final class d3 implements Runnable
{
    public final /* synthetic */ W5 o;
    public final /* synthetic */ R2 p;
    
    public d3(final R2 p2, final W5 o) {
        this.p = p2;
        this.o = o;
    }
    
    @Override
    public final void run() {
        R2.o(this.p).o0();
        final D5 o = R2.o(this.p);
        final W5 o2 = this.o;
        o.e().n();
        o.p0();
        n.e(o2.o);
        int o3;
        if (n6.a() && o.c0().s(K.T0)) {
            o3 = o2.O;
        }
        else {
            o3 = 100;
        }
        final q3 f = q3.f(o2.J, o3);
        final q3 q = o.Q(o2.o);
        o.j().K().c("Setting consent, package, consent", o2.o, f);
        o.B(o2.o, f);
        if (f.t(q)) {
            o.b0(o2);
        }
        if (n6.a() && o.c0().s(K.T0)) {
            final z c = z.c(o2.P);
            if (!z.f.equals(c)) {
                o.j().K().c("Setting DMA consent. package, consent", o2.o, c);
                o.A(o2.o, c);
            }
        }
    }
}
