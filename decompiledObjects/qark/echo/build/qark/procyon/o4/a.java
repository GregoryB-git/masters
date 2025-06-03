// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package o4;

import java.util.List;

public final class a extends r
{
    public final String a;
    public final List b;
    
    public a(final String a, final List b) {
        if (a == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null usedDates");
    }
    
    @Override
    public List b() {
        return this.b;
    }
    
    @Override
    public String c() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof r) {
            final r r = (r)o;
            return this.a.equals(r.c()) && this.b.equals(r.b());
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("HeartBeatResult{userAgent=");
        sb.append(this.a);
        sb.append(", usedDates=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
