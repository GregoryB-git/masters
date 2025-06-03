// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package o0;

import g0.G;
import android.net.Uri;

public final class i
{
    public final long a;
    public final long b;
    public final String c;
    public int d;
    
    public i(final String s, final long a, final long b) {
        String c = s;
        if (s == null) {
            c = "";
        }
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public i a(final i i, final String s) {
        final String c = this.c(s);
        if (i != null) {
            if (!c.equals(i.c(s))) {
                return null;
            }
            final long b = this.b;
            long n = -1L;
            if (b != -1L) {
                final long a = this.a;
                if (a + b == i.a) {
                    final long b2 = i.b;
                    if (b2 != -1L) {
                        n = b + b2;
                    }
                    return new i(c, a, n);
                }
            }
            final long b3 = i.b;
            if (b3 != -1L) {
                final long a2 = i.a;
                if (a2 + b3 == this.a) {
                    if (b != -1L) {
                        n = b3 + b;
                    }
                    return new i(c, a2, n);
                }
            }
        }
        return null;
    }
    
    public Uri b(final String s) {
        return G.f(s, this.c);
    }
    
    public String c(final String s) {
        return G.e(s, this.c);
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
        return this.a == i.a && this.b == i.b && this.c.equals(i.c);
    }
    
    @Override
    public int hashCode() {
        if (this.d == 0) {
            this.d = ((527 + (int)this.a) * 31 + (int)this.b) * 31 + this.c.hashCode();
        }
        return this.d;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("RangedUri(referenceUri=");
        sb.append(this.c);
        sb.append(", start=");
        sb.append(this.a);
        sb.append(", length=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
