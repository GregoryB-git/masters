// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E4;

import q5.b;
import s4.i;
import U5.a;

public final class d implements a
{
    public final E4.a a;
    
    public d(final E4.a a) {
        this.a = a;
    }
    
    public static d a(final E4.a a) {
        return new d(a);
    }
    
    public static i c(final E4.a a) {
        return (i)b.c(a.c(), "Cannot return null from a non-@Nullable @Provides method");
    }
    
    public i b() {
        return c(this.a);
    }
}
