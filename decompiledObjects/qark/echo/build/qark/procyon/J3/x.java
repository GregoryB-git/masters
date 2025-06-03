// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package J3;

public final class x extends D
{
    public final a a;
    public final c b;
    public final b c;
    
    public x(final a a, final c b, final b c) {
        if (a == null) {
            throw new NullPointerException("Null appData");
        }
        this.a = a;
        if (b == null) {
            throw new NullPointerException("Null osData");
        }
        this.b = b;
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null deviceData");
    }
    
    @Override
    public a a() {
        return this.a;
    }
    
    @Override
    public b c() {
        return this.c;
    }
    
    @Override
    public c d() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof D) {
            final D d = (D)o;
            return this.a.equals(d.a()) && this.b.equals(d.d()) && this.c.equals(d.c());
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("StaticSessionData{appData=");
        sb.append(this.a);
        sb.append(", osData=");
        sb.append(this.b);
        sb.append(", deviceData=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
