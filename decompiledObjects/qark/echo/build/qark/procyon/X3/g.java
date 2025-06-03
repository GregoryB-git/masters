// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X3;

import V3.k;
import d4.b;
import Y3.d;
import Y3.i;

public class g
{
    public static final i b;
    public static final i c;
    public static final d d;
    public static final d e;
    public final d a;
    
    static {
        b = new i() {
            public boolean b(final Boolean b) {
                return b ^ true;
            }
        };
        c = new i() {
            public boolean b(final Boolean b) {
                return b;
            }
        };
        d = new d(Boolean.TRUE);
        e = new d(Boolean.FALSE);
    }
    
    public g() {
        this.a = Y3.d.d();
    }
    
    public g(final d a) {
        this.a = a;
    }
    
    public g a(final b b) {
        final d d = this.a.D(b);
        d w;
        if (d == null) {
            w = new d(this.a.getValue());
        }
        else {
            w = d;
            if (d.getValue() == null) {
                w = d;
                if (this.a.getValue() != null) {
                    w = d.W(k.Y(), this.a.getValue());
                }
            }
        }
        return new g(w);
    }
    
    public Object b(final Object o, final d.c c) {
        return this.a.k(o, (d.c)new d.c() {
            public Object b(final k k, final Boolean b, final Object o) {
                if (!b) {
                    return c.a(k, null, o);
                }
                return o;
            }
        });
    }
    
    public g c(final k k) {
        if (this.a.V(k, g.b) != null) {
            return this;
        }
        return new g(this.a.X(k, g.e));
    }
    
    public g d(final k k) {
        if (this.a.V(k, g.b) != null) {
            throw new IllegalArgumentException("Can't prune path that was kept previously!");
        }
        if (this.a.V(k, g.c) != null) {
            return this;
        }
        return new g(this.a.X(k, g.d));
    }
    
    public boolean e() {
        return this.a.a(g.c);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof g && this.a.equals(((g)o).a));
    }
    
    public boolean f(final k k) {
        final Boolean b = (Boolean)this.a.S(k);
        return b != null && !b;
    }
    
    public boolean g(final k k) {
        final Boolean b = (Boolean)this.a.S(k);
        return b != null && b;
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("{PruneForest:");
        sb.append(this.a.toString());
        sb.append("}");
        return sb.toString();
    }
}
