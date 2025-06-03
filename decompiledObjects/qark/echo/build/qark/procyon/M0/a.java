// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package M0;

import F0.L;
import java.util.List;
import F0.q;
import F0.t;
import F0.s;
import F0.O;
import g0.z;
import F0.r;

public final class a implements r
{
    public final z a;
    public final O b;
    
    public a() {
        this.a = new z(4);
        this.b = new O(-1, -1, "image/heif");
    }
    
    private boolean c(final s s, final int n) {
        this.a.P(4);
        final byte[] e = this.a.e();
        boolean b = false;
        s.n(e, 0, 4);
        if (this.a.I() == n) {
            b = true;
        }
        return b;
    }
    
    @Override
    public void a(final long n, final long n2) {
        this.b.a(n, n2);
    }
    
    @Override
    public void b(final t t) {
        this.b.b(t);
    }
    
    @Override
    public boolean e(final s s) {
        s.o(4);
        return this.c(s, 1718909296) && this.c(s, 1751476579);
    }
    
    @Override
    public int i(final s s, final L l) {
        return this.b.i(s, l);
    }
    
    @Override
    public void release() {
    }
}
