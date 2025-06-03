// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z2;

import A2.m;
import y2.a;

public final class b
{
    public final int a;
    public final a b;
    public final a.d c;
    public final String d;
    
    public b(final a b, final a.d c, final String d) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = m.b(b, c, d);
    }
    
    public static b a(final a a, final a.d d, final String s) {
        return new b(a, d, s);
    }
    
    public final String b() {
        return this.b.b();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof b)) {
            return false;
        }
        final b b = (b)o;
        return m.a(this.b, b.b) && m.a(this.c, b.c) && m.a(this.d, b.d);
    }
    
    @Override
    public final int hashCode() {
        return this.a;
    }
}
