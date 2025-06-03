// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package r6;

import u6.F;
import p6.P0;
import V5.t;
import u6.O;
import u6.x;
import kotlin.jvm.internal.v;

public class l extends b
{
    public final int n;
    public final r6.a o;
    
    public l(final int n, final r6.a o, final g6.l l) {
        super(n, l);
        this.n = n;
        this.o = o;
        if (o == r6.a.o) {
            final StringBuilder sb = new StringBuilder();
            sb.append("This implementation does not support suspension for senders, use ");
            sb.append(v.b(b.class).a());
            sb.append(" instead");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (n >= 1) {
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Buffered channel capacity must be at least 1, but ");
        sb2.append(n);
        sb2.append(" was specified");
        throw new IllegalArgumentException(sb2.toString().toString());
    }
    
    public final Object A0(final Object o, final boolean b) {
        if (this.o == r6.a.q) {
            return this.y0(o, b);
        }
        return this.z0(o);
    }
    
    @Override
    public boolean T() {
        return this.o == r6.a.p;
    }
    
    @Override
    public Object d(final Object o) {
        return this.A0(o, false);
    }
    
    public final Object y0(final Object o, final boolean b) {
        final Object d = super.d(o);
        if (r6.g.f(d)) {
            return d;
        }
        if (r6.g.e(d)) {
            return d;
        }
        if (b) {
            final g6.l c = super.c;
            if (c != null) {
                final O d2 = x.d(c, o, null, 2, null);
                if (d2 != null) {
                    throw d2;
                }
            }
        }
        return r6.g.a.c(t.a);
    }
    
    public final Object z0(final Object o) {
        final F d = r6.c.d;
        i i = r6.b.j().get(this);
        while (true) {
            final long andIncrement = r6.b.k().getAndIncrement(this);
            final long n = andIncrement & 0xFFFFFFFFFFFFFFFL;
            final boolean l = r6.b.l(this, andIncrement);
            final int b = r6.c.b;
            final long n2 = n / b;
            final int n3 = (int)(n % b);
            if (i.q != n2) {
                final i f = r6.b.f(this, n2, i);
                if (f == null) {
                    if (l) {
                        return r6.g.a.a(this.H());
                    }
                    continue;
                }
                else {
                    i = f;
                }
            }
            final int q = r6.b.q(this, i, n3, o, n, d, l);
            if (q == 0) {
                i.b();
                return r6.g.a.c(t.a);
            }
            if (q == 1) {
                return r6.g.a.c(t.a);
            }
            if (q != 2) {
                if (q == 3) {
                    throw new IllegalStateException("unexpected".toString());
                }
                if (q == 4) {
                    if (n < this.G()) {
                        i.b();
                    }
                    return r6.g.a.a(this.H());
                }
                if (q != 5) {
                    continue;
                }
                i.b();
            }
            else {
                if (l) {
                    i.p();
                    return r6.g.a.a(this.H());
                }
                P0 p;
                if (d instanceof P0) {
                    p = (P0)d;
                }
                else {
                    p = null;
                }
                if (p != null) {
                    r6.b.o(this, p, i, n3);
                }
                this.y(i.q * b + n3);
                return r6.g.a.c(t.a);
            }
        }
    }
}
