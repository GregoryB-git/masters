// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import A2.n;
import java.util.Map;

public final class i2 implements Runnable
{
    public final e2 o;
    public final int p;
    public final Throwable q;
    public final byte[] r;
    public final String s;
    public final Map t;
    
    public i2(final String s, final e2 o, final int p6, final Throwable q, final byte[] r, final Map t) {
        n.i(o);
        this.o = o;
        this.p = p6;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
    }
    
    @Override
    public final void run() {
        this.o.a(this.s, this.p, this.q, this.r, this.t);
    }
}
