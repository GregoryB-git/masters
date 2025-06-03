// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package P4;

import java.util.Set;

public final class a extends b
{
    public final Set a;
    
    public a(final Set a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null updatedKeys");
    }
    
    @Override
    public Set b() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || (o instanceof b && this.a.equals(((b)o).b()));
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ConfigUpdate{updatedKeys=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
