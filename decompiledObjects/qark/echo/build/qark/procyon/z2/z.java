// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z2;

import A2.m;
import x2.d;

public final class z
{
    public final b a = a;
    public final d b = b;
    
    @Override
    public final boolean equals(final Object o) {
        if (o != null && o instanceof z) {
            final z z = (z)o;
            if (m.a(this.a, z.a) && m.a(this.b, z.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return m.b(this.a, this.b);
    }
    
    @Override
    public final String toString() {
        return m.c(this).a("key", this.a).a("feature", this.b).toString();
    }
}
