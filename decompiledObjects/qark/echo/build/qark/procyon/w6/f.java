// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w6;

import X5.g;
import p6.g0;

public abstract class f extends g0
{
    public final int r;
    public final int s;
    public final long t;
    public final String u;
    public w6.a v;
    
    public f(final int r, final int s, final long t, final String u) {
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = this.H();
    }
    
    @Override
    public void E(final g g, final Runnable runnable) {
        w6.a.k(this.v, runnable, null, false, 6, null);
    }
    
    public final w6.a H() {
        return new w6.a(this.r, this.s, this.t, this.u);
    }
    
    public final void I(final Runnable runnable, final i i, final boolean b) {
        this.v.i(runnable, i, b);
    }
}
