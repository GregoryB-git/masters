// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e2;

import java.util.List;

public final class d extends j
{
    public final List a;
    
    public d(final List a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }
    
    @Override
    public List c() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || (o instanceof j && this.a.equals(((j)o).c()));
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("BatchedLogRequest{logRequests=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
