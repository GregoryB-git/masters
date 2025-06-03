// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Z0;

import d0.q;

public final class s
{
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final q f;
    public final int g;
    public final long[] h;
    public final long[] i;
    public final int j;
    public final t[] k;
    
    public s(final int a, final int b, final long c, final long d, final long e, final q f, final int g, final t[] k, final int j, final long[] h, final long[] i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.k = k;
        this.j = j;
        this.h = h;
        this.i = i;
    }
    
    public t a(final int n) {
        final t[] k = this.k;
        if (k == null) {
            return null;
        }
        return k[n];
    }
}
