// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a4;

import java.util.Map;
import V3.k;

public final class i
{
    public final k a;
    public final h b;
    
    public i(final k a, final h b) {
        this.a = a;
        this.b = b;
    }
    
    public static i a(final k k) {
        return new i(k, h.i);
    }
    
    public static i b(final k k, final Map map) {
        return new i(k, h.c(map));
    }
    
    public d4.h c() {
        return this.b.d();
    }
    
    public h d() {
        return this.b;
    }
    
    public k e() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (i.class != o.getClass()) {
            return false;
        }
        final i i = (i)o;
        return this.a.equals(i.a) && this.b.equals(i.b);
    }
    
    public boolean f() {
        return this.b.p();
    }
    
    public boolean g() {
        return this.b.u();
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(":");
        sb.append(this.b);
        return sb.toString();
    }
}
