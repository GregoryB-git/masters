// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k0;

import g0.M;
import g0.a;

public final class d1
{
    public static final d1 c;
    public static final d1 d;
    public static final d1 e;
    public static final d1 f;
    public static final d1 g;
    public final long a;
    public final long b;
    
    static {
        final d1 g2 = c = new d1(0L, 0L);
        d = new d1(Long.MAX_VALUE, Long.MAX_VALUE);
        e = new d1(Long.MAX_VALUE, 0L);
        f = new d1(0L, Long.MAX_VALUE);
        g = g2;
    }
    
    public d1(final long a, final long b) {
        final boolean b2 = true;
        g0.a.a(a >= 0L);
        g0.a.a(b >= 0L && b2);
        this.a = a;
        this.b = b;
    }
    
    public long a(final long n, final long n2, final long n3) {
        final long a = this.a;
        if (a == 0L && this.b == 0L) {
            return n;
        }
        final long e1 = M.e1(n, a, Long.MIN_VALUE);
        final long b = M.b(n, this.b, Long.MAX_VALUE);
        final boolean b2 = false;
        final boolean b3 = e1 <= n2 && n2 <= b;
        boolean b4 = b2;
        if (e1 <= n3) {
            b4 = b2;
            if (n3 <= b) {
                b4 = true;
            }
        }
        if (b3 && b4) {
            if (Math.abs(n2 - n) <= Math.abs(n3 - n)) {
                return n2;
            }
            return n3;
        }
        else {
            if (b3) {
                return n2;
            }
            if (b4) {
                return n3;
            }
            return e1;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (d1.class != o.getClass()) {
            return false;
        }
        final d1 d1 = (d1)o;
        return this.a == d1.a && this.b == d1.b;
    }
    
    @Override
    public int hashCode() {
        return (int)this.a * 31 + (int)this.b;
    }
}
