// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p2;

import h2.d;
import h2.b;

public final class c implements b
{
    public static c a() {
        return a.a();
    }
    
    public static p2.a b() {
        return (p2.a)d.c(p2.b.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
    
    public p2.a c() {
        return b();
    }
    
    public abstract static final class a
    {
        public static final c a;
        
        static {
            a = new c();
        }
        
        public static /* synthetic */ c a() {
            return c.a.a;
        }
    }
}
