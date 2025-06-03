// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F0;

import g0.a;

public final class H implements M
{
    public final long[] a;
    public final long[] b;
    public final long c;
    public final boolean d;
    
    public H(final long[] a, final long[] b, final long c) {
        g0.a.a(a.length == b.length);
        final int length = b.length;
        final boolean d = length > 0;
        this.d = d;
        if (d && b[0] > 0L) {
            final int n = length + 1;
            final long[] a2 = new long[n];
            this.a = a2;
            final long[] b2 = new long[n];
            this.b = b2;
            System.arraycopy(a, 0, a2, 1, length);
            System.arraycopy(b, 0, b2, 1, length);
        }
        else {
            this.a = a;
            this.b = b;
        }
        this.c = c;
    }
    
    @Override
    public boolean h() {
        return this.d;
    }
    
    @Override
    public a j(final long n) {
        if (!this.d) {
            return new a(N.c);
        }
        final int h = g0.M.h(this.b, n, true, true);
        final N n2 = new N(this.b[h], this.a[h]);
        if (n2.a != n && h != this.b.length - 1) {
            final long[] b = this.b;
            final int n3 = h + 1;
            return new a(n2, new N(b[n3], this.a[n3]));
        }
        return new a(n2);
    }
    
    @Override
    public long l() {
        return this.c;
    }
}
