// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z0;

import c1.k;
import c1.t;
import c1.j;

public final class b extends j
{
    public final t p;
    
    public b(final String s, final t p2) {
        super(s);
        this.p = p2;
    }
    
    @Override
    public c1.k B(final byte[] array, final int n, final boolean b) {
        if (b) {
            this.p.b();
        }
        return this.p.a(array, 0, n);
    }
}
