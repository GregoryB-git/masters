// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package n2;

import h2.d;
import h2.b;

public final class g implements b
{
    public static g a() {
        return a.a();
    }
    
    public static String b() {
        return (String)d.c(f.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
    
    public String c() {
        return b();
    }
    
    public abstract static final class a
    {
        public static final g a;
        
        static {
            a = new g();
        }
        
        public static /* synthetic */ g a() {
            return g.a.a;
        }
    }
}
