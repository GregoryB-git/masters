// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y0;

import F0.I;
import F0.i;

public final class a extends i implements g
{
    public final int h;
    public final long i;
    
    public a(long i, final long n, final int h, final int n2, final boolean b) {
        super(i, n, h, n2, b);
        this.h = h;
        if (i == -1L) {
            i = -1L;
        }
        this.i = i;
    }
    
    public a(final long n, final long n2, final I.a a, final boolean b) {
        this(n, n2, a.f, a.c, b);
    }
    
    @Override
    public long c(final long n) {
        return this.b(n);
    }
    
    @Override
    public long f() {
        return this.i;
    }
    
    @Override
    public int k() {
        return this.h;
    }
}
