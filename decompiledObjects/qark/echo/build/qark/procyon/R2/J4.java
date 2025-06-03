// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import B2.a;
import A2.n;

public final class J4 implements Runnable
{
    public final /* synthetic */ W5 o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ R5 q;
    public final /* synthetic */ D4 r;
    
    public J4(final D4 r, final W5 o, final boolean p4, final R5 q) {
        this.r = r;
        this.o = o;
        this.p = p4;
        this.q = q;
    }
    
    @Override
    public final void run() {
        final R1 b = D4.B(this.r);
        if (b == null) {
            this.r.j().G().a("Discarding data. Failed to set user property");
            return;
        }
        n.i(this.o);
        final D4 r = this.r;
        a q;
        if (this.p) {
            q = null;
        }
        else {
            q = this.q;
        }
        r.F(b, q, this.o);
        D4.m0(this.r);
    }
}
