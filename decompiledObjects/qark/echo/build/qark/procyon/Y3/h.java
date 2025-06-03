// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y3;

import V3.k;
import V3.p;

public final class h
{
    public p a;
    public k b;
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (h.class != o.getClass()) {
            return false;
        }
        final h h = (h)o;
        return this.a.equals(h.a) && this.b.equals(h.b);
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }
}
