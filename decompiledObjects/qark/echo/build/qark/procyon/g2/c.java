// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g2;

import p2.a;
import android.content.Context;

public final class c extends h
{
    public final Context a;
    public final a b;
    public final a c;
    public final String d;
    
    public c(final Context a, final a b, final a c, final String d) {
        if (a == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.a = a;
        if (b == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.b = b;
        if (c == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.c = c;
        if (d != null) {
            this.d = d;
            return;
        }
        throw new NullPointerException("Null backendName");
    }
    
    @Override
    public Context b() {
        return this.a;
    }
    
    @Override
    public String c() {
        return this.d;
    }
    
    @Override
    public a d() {
        return this.c;
    }
    
    @Override
    public a e() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof h) {
            final h h = (h)o;
            return this.a.equals(h.b()) && this.b.equals(h.e()) && this.c.equals(h.d()) && this.d.equals(h.c());
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return (((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
