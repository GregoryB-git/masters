// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y0;

import g0.a;
import d0.q;
import i0.k;
import i0.g;

public abstract class m extends e
{
    public final long j;
    
    public m(final i0.g g, final k k, final q q, final int n, final Object o, final long n2, final long n3, final long j) {
        super(g, k, 1, q, n, o, n2, n3);
        g0.a.e(q);
        this.j = j;
    }
    
    public long g() {
        final long j = this.j;
        long n = -1L;
        if (j != -1L) {
            n = 1L + j;
        }
        return n;
    }
    
    public abstract boolean h();
}
