// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X3;

import a4.i;

public final class h
{
    public final long a;
    public final i b;
    public final long c;
    public final boolean d;
    public final boolean e;
    
    public h(final long a, final i b, final long c, final boolean d, final boolean e) {
        this.a = a;
        if (b.g() && !b.f()) {
            throw new IllegalArgumentException("Can't create TrackedQuery for a non-default query that loads all data");
        }
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public h a(final boolean b) {
        return new h(this.a, this.b, this.c, this.d, b);
    }
    
    public h b() {
        return new h(this.a, this.b, this.c, true, this.e);
    }
    
    public h c(final long n) {
        return new h(this.a, this.b, n, this.d, this.e);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (o.getClass() != h.class) {
            return false;
        }
        final h h = (h)o;
        return this.a == h.a && this.b.equals(h.b) && this.c == h.c && this.d == h.d && this.e == h.e;
    }
    
    @Override
    public int hashCode() {
        return (((Long.valueOf(this.a).hashCode() * 31 + this.b.hashCode()) * 31 + Long.valueOf(this.c).hashCode()) * 31 + Boolean.valueOf(this.d).hashCode()) * 31 + Boolean.valueOf(this.e).hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("TrackedQuery{id=");
        sb.append(this.a);
        sb.append(", querySpec=");
        sb.append(this.b);
        sb.append(", lastUse=");
        sb.append(this.c);
        sb.append(", complete=");
        sb.append(this.d);
        sb.append(", active=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
