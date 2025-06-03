// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k0;

import g0.a;
import d0.q;

public final class p
{
    public final String a;
    public final q b;
    public final q c;
    public final int d;
    public final int e;
    
    public p(final String s, final q q, final q q2, final int d, final int e) {
        g0.a.a(d == 0 || e == 0);
        this.a = g0.a.d(s);
        this.b = (q)g0.a.e(q);
        this.c = (q)g0.a.e(q2);
        this.d = d;
        this.e = e;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (p.class != o.getClass()) {
            return false;
        }
        final p p = (p)o;
        return this.d == p.d && this.e == p.e && this.a.equals(p.a) && this.b.equals(p.b) && this.c.equals(p.c);
    }
    
    @Override
    public int hashCode() {
        return ((((527 + this.d) * 31 + this.e) * 31 + this.a.hashCode()) * 31 + this.b.hashCode()) * 31 + this.c.hashCode();
    }
}
