// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package n0;

import F0.h;

public final class i implements g
{
    public final h a;
    public final long b;
    
    public i(final h a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public long a(final long n, final long n2) {
        return this.a.a(n + this.b);
    }
    
    @Override
    public long b(final long n, final long n2) {
        return this.a.d[(int)n];
    }
    
    @Override
    public long c(final long n) {
        return this.a.e[(int)n] - this.b;
    }
    
    @Override
    public long d(final long n, final long n2) {
        return 0L;
    }
    
    @Override
    public long e(final long n, final long n2) {
        return -9223372036854775807L;
    }
    
    @Override
    public o0.i f(final long n) {
        final h a = this.a;
        final long[] c = a.c;
        final int n2 = (int)n;
        return new o0.i(null, c[n2], a.b[n2]);
    }
    
    @Override
    public boolean g() {
        return true;
    }
    
    @Override
    public long h() {
        return 0L;
    }
    
    @Override
    public long i(final long n) {
        return this.a.a;
    }
    
    @Override
    public long j(final long n, final long n2) {
        return this.a.a;
    }
}
