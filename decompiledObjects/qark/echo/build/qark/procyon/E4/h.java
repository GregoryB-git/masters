// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E4;

import r4.b;
import U5.a;

public final class h implements a
{
    public final E4.a a;
    
    public h(final E4.a a) {
        this.a = a;
    }
    
    public static h a(final E4.a a) {
        return new h(a);
    }
    
    public static b c(final E4.a a) {
        return (b)q5.b.c(a.g(), "Cannot return null from a non-@Nullable @Provides method");
    }
    
    public b b() {
        return c(this.a);
    }
}
