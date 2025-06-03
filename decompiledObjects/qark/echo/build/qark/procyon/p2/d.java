// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p2;

import h2.b;

public final class d implements b
{
    public static d a() {
        return a.a();
    }
    
    public static p2.a c() {
        return (p2.a)h2.d.c(p2.b.b(), "Cannot return null from a non-@Nullable @Provides method");
    }
    
    public p2.a b() {
        return c();
    }
    
    public abstract static final class a
    {
        public static final d a;
        
        static {
            a = new d();
        }
        
        public static /* synthetic */ d a() {
            return d.a.a;
        }
    }
}
