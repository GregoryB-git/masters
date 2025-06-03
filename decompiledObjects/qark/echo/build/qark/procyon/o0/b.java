// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package o0;

import W2.k;

public final class b
{
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    
    public b(final String a, final String b, final int c, final int d) {
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
        if (!(o instanceof b)) {
            return false;
        }
        final b b = (b)o;
        return this.c == b.c && this.d == b.d && k.a(this.a, b.a) && k.a(this.b, b.b);
    }
    
    @Override
    public int hashCode() {
        return k.b(this.a, this.b, this.c, this.d);
    }
}
