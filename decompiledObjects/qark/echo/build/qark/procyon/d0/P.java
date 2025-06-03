// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d0;

import g0.M;

public final class P
{
    public static final P e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public final int a;
    public final int b;
    public final int c;
    public final float d;
    
    static {
        e = new P(0, 0);
        f = M.w0(0);
        g = M.w0(1);
        h = M.w0(2);
        i = M.w0(3);
    }
    
    public P(final int n, final int n2) {
        this(n, n2, 0, 1.0f);
    }
    
    public P(final int a, final int b, final int c, final float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof P) {
            final P p = (P)o;
            return this.a == p.a && this.b == p.b && this.c == p.c && this.d == p.d;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return (((217 + this.a) * 31 + this.b) * 31 + this.c) * 31 + Float.floatToRawIntBits(this.d);
    }
}
