// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E4;

import U5.a;

public final class b implements a
{
    public final E4.a a;
    
    public b(final E4.a a) {
        this.a = a;
    }
    
    public static b a(final E4.a a) {
        return new b(a);
    }
    
    public static C4.a c(final E4.a a) {
        return (C4.a)q5.b.c(a.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
    
    public C4.a b() {
        return c(this.a);
    }
}
