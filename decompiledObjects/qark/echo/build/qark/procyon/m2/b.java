// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m2;

import java.util.Map;
import p2.a;

public final class b extends f
{
    public final a a;
    public final Map b;
    
    public b(final a a, final Map b) {
        if (a == null) {
            throw new NullPointerException("Null clock");
        }
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null values");
    }
    
    @Override
    public a e() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof f) {
            final f f = (f)o;
            return this.a.equals(f.e()) && this.b.equals(f.h());
        }
        return false;
    }
    
    @Override
    public Map h() {
        return this.b;
    }
    
    @Override
    public int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SchedulerConfig{clock=");
        sb.append(this.a);
        sb.append(", values=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
