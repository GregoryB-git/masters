// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E4;

import q5.b;
import s3.e;
import U5.a;

public final class c implements a
{
    public final E4.a a;
    
    public c(final E4.a a) {
        this.a = a;
    }
    
    public static c a(final E4.a a) {
        return new c(a);
    }
    
    public static e c(final E4.a a) {
        return (e)b.c(a.b(), "Cannot return null from a non-@Nullable @Provides method");
    }
    
    public e b() {
        return c(this.a);
    }
}
