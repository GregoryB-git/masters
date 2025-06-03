// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e2;

public final class h extends n
{
    public final long a;
    
    public h(final long a) {
        this.a = a;
    }
    
    @Override
    public long c() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || (o instanceof n && this.a == ((n)o).c());
    }
    
    @Override
    public int hashCode() {
        final long a = this.a;
        return (int)(a ^ a >>> 32) ^ 0xF4243;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("LogResponse{nextRequestWaitMillis=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
