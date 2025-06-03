// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F0;

public final class N
{
    public static final N c;
    public final long a;
    public final long b;
    
    static {
        c = new N(0L, 0L);
    }
    
    public N(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (N.class != o.getClass()) {
            return false;
        }
        final N n = (N)o;
        return this.a == n.a && this.b == n.b;
    }
    
    @Override
    public int hashCode() {
        return (int)this.a * 31 + (int)this.b;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("[timeUs=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append("]");
        return sb.toString();
    }
}
