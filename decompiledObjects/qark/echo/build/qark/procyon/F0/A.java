// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F0;

import g0.a;

public final class A implements M
{
    public final B a;
    public final long b;
    
    public A(final B a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    public final N a(final long n, final long n2) {
        return new N(n * 1000000L / this.a.e, this.b + n2);
    }
    
    @Override
    public boolean h() {
        return true;
    }
    
    @Override
    public a j(final long n) {
        g0.a.h(this.a.k);
        final B a = this.a;
        final B.a k = a.k;
        final long[] a2 = k.a;
        final long[] b = k.b;
        final int h = g0.M.h(a2, a.i(n), true, false);
        long n2 = 0L;
        long n3;
        if (h == -1) {
            n3 = 0L;
        }
        else {
            n3 = a2[h];
        }
        if (h != -1) {
            n2 = b[h];
        }
        final N a3 = this.a(n3, n2);
        if (a3.a != n && h != a2.length - 1) {
            final int n4 = h + 1;
            return new a(a3, this.a(a2[n4], b[n4]));
        }
        return new a(a3);
    }
    
    @Override
    public long l() {
        return this.a.f();
    }
}
