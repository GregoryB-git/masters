// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g2;

public final class b extends g
{
    public final a a;
    public final long b;
    
    public b(final a a, final long b) {
        if (a != null) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new NullPointerException("Null status");
    }
    
    @Override
    public long b() {
        return this.b;
    }
    
    @Override
    public a c() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof g) {
            final g g = (g)o;
            return this.a.equals(g.c()) && this.b == g.b();
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final long b = this.b;
        return (hashCode ^ 0xF4243) * 1000003 ^ (int)(b ^ b >>> 32);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("BackendResponse{status=");
        sb.append(this.a);
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
