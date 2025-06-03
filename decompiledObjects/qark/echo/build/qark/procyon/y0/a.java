// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y0;

import d0.q;
import i0.k;
import i0.g;

public abstract class a extends m
{
    public final long k;
    public final long l;
    public y0.c m;
    public int[] n;
    
    public a(final i0.g g, final k k, final q q, final int n, final Object o, final long n2, final long n3, final long i, final long l, final long n4) {
        super(g, k, q, n, o, n2, n3, n4);
        this.k = i;
        this.l = l;
    }
    
    public final int i(final int n) {
        return ((int[])g0.a.h(this.n))[n];
    }
    
    public final y0.c j() {
        return (y0.c)g0.a.h(this.m);
    }
    
    public void k(final y0.c m) {
        this.m = m;
        this.n = m.b();
    }
}
