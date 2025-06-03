// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import W2.k;
import W2.m;
import W2.g;
import java.io.Serializable;

public final class h extends P implements Serializable
{
    private static final long serialVersionUID = 0L;
    public final g o;
    public final P p;
    
    public h(final g g, final P p2) {
        this.o = (g)m.j(g);
        this.p = (P)m.j(p2);
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.p.compare(this.o.apply(o), this.o.apply(o2));
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof h) {
            final h h = (h)o;
            return this.o.equals(h.o) && this.p.equals(h.p);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return k.b(this.o, this.p);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.p);
        sb.append(".onResultOf(");
        sb.append(this.o);
        sb.append(")");
        return sb.toString();
    }
}
