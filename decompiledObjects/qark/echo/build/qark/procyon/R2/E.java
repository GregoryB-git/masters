// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import A2.n;

public final class E
{
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final Long h;
    public final Long i;
    public final Long j;
    public final Boolean k;
    
    public E(final String a, final String b, final long c, final long d, final long e, final long f, final long g, final Long h, final Long i, final Long j, final Boolean k) {
        n.e(a);
        n.e(b);
        final boolean b2 = true;
        n.a(c >= 0L);
        n.a(d >= 0L);
        n.a(e >= 0L);
        n.a(g >= 0L && b2);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public E(final String s, final String s2, final long n, final long n2, final long n3, final long n4, final Long n5, final Long n6, final Long n7, final Boolean b) {
        this(s, s2, 0L, 0L, 0L, n3, 0L, null, null, null, null);
    }
    
    public final E a(final long n) {
        return new E(this.a, this.b, this.c, this.d, this.e, n, this.g, this.h, this.i, this.j, this.k);
    }
    
    public final E b(final long n, final long l) {
        return new E(this.a, this.b, this.c, this.d, this.e, this.f, n, l, this.i, this.j, this.k);
    }
    
    public final E c(final Long n, final Long n2, Boolean b) {
        if (b != null && !b) {
            b = null;
        }
        return new E(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, n, n2, b);
    }
}
