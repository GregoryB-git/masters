// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import W2.m;
import java.io.Serializable;

public final class X extends P implements Serializable
{
    private static final long serialVersionUID = 0L;
    public final P o;
    
    public X(final P p) {
        this.o = (P)m.j(p);
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.o.compare(o2, o);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || (o instanceof X && this.o.equals(((X)o).o));
    }
    
    @Override
    public P g() {
        return this.o;
    }
    
    @Override
    public int hashCode() {
        return -this.o.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.o);
        sb.append(".reverse()");
        return sb.toString();
    }
}
