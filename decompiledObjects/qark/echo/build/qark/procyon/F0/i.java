// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F0;

public class i implements M
{
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;
    
    public i(long d, final long b, final int e, final int n, final boolean g) {
        this.a = d;
        this.b = b;
        int c = n;
        if (n == -1) {
            c = 1;
        }
        this.c = c;
        this.e = e;
        this.g = g;
        if (d == -1L) {
            this.d = -1L;
            d = -9223372036854775807L;
        }
        else {
            this.d = d - b;
            d = d(d, b, e);
        }
        this.f = d;
    }
    
    public static long d(final long n, final long n2, final int n3) {
        return Math.max(0L, n - n2) * 8000000L / n3;
    }
    
    public final long a(long a) {
        a = a * this.e / 8000000L;
        final int c = this.c;
        final long a2 = a / c * c;
        final long d = this.d;
        a = a2;
        if (d != -1L) {
            a = Math.min(a2, d - c);
        }
        a = Math.max(a, 0L);
        return this.b + a;
    }
    
    public long b(final long n) {
        return d(n, this.b, this.e);
    }
    
    @Override
    public boolean h() {
        return this.d != -1L || this.g;
    }
    
    @Override
    public a j(long n) {
        if (this.d == -1L && !this.g) {
            return new a(new N(0L, this.b));
        }
        final long a = this.a(n);
        final long b = this.b(a);
        final N n2 = new N(b, a);
        if (this.d != -1L && b < n) {
            final int c = this.c;
            if (c + a < this.a) {
                n = a + c;
                return new a(n2, new N(this.b(n), n));
            }
        }
        return new a(n2);
    }
    
    @Override
    public long l() {
        return this.f;
    }
}
