// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package i1;

import java.util.List;
import g0.M;
import java.util.Collections;
import java.util.Map;
import c1.k;

public final class h implements k
{
    public final c o;
    public final long[] p;
    public final Map q;
    public final Map r;
    public final Map s;
    
    public h(final c o, Map o2, final Map r, final Map s) {
        this.o = o;
        this.r = r;
        this.s = s;
        if (o2 != null) {
            o2 = Collections.unmodifiableMap((Map<?, ?>)o2);
        }
        else {
            o2 = Collections.emptyMap();
        }
        this.q = (Map)o2;
        this.p = o.j();
    }
    
    @Override
    public int c(final long n) {
        final int d = M.d(this.p, n, false, false);
        if (d < this.p.length) {
            return d;
        }
        return -1;
    }
    
    @Override
    public long e(final int n) {
        return this.p[n];
    }
    
    @Override
    public List h(final long n) {
        return this.o.h(n, this.q, this.r, this.s);
    }
    
    @Override
    public int j() {
        return this.p.length;
    }
}
