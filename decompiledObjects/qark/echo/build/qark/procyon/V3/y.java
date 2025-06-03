// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V3;

public final class y
{
    public final long a;
    
    public y(final long a) {
        this.a = a;
    }
    
    public long a() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && y.class == o.getClass() && this.a == ((y)o).a);
    }
    
    @Override
    public int hashCode() {
        final long a = this.a;
        return (int)(a ^ a >>> 32);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Tag{tagNumber=");
        sb.append(this.a);
        sb.append('}');
        return sb.toString();
    }
}
