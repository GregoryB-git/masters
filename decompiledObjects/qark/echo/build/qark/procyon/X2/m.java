// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import java.util.Comparator;
import java.io.Serializable;

public final class m extends P implements Serializable
{
    private static final long serialVersionUID = 0L;
    public final Comparator o;
    
    public m(final Comparator comparator) {
        this.o = (Comparator)W2.m.j(comparator);
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.o.compare(o, o2);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || (o instanceof m && this.o.equals(((m)o).o));
    }
    
    @Override
    public int hashCode() {
        return this.o.hashCode();
    }
    
    @Override
    public String toString() {
        return this.o.toString();
    }
}
