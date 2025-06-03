// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package s3;

public final class a extends n
{
    public final long a;
    public final long b;
    public final long c;
    
    public a(final long a, final long b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public long b() {
        return this.b;
    }
    
    @Override
    public long c() {
        return this.a;
    }
    
    @Override
    public long d() {
        return this.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof n) {
            final n n = (n)o;
            return this.a == n.c() && this.b == n.b() && this.c == n.d();
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final long a = this.a;
        final int n = (int)(a ^ a >>> 32);
        final long b = this.b;
        final int n2 = (int)(b ^ b >>> 32);
        final long c = this.c;
        return ((n ^ 0xF4243) * 1000003 ^ n2) * 1000003 ^ (int)(c >>> 32 ^ c);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("StartupTime{epochMillis=");
        sb.append(this.a);
        sb.append(", elapsedRealtime=");
        sb.append(this.b);
        sb.append(", uptimeMillis=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
