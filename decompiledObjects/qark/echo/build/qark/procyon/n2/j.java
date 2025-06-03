// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package n2;

import h2.d;
import h2.b;

public final class j implements b
{
    public static j a() {
        return a.a();
    }
    
    public static e c() {
        return (e)d.c(f.d(), "Cannot return null from a non-@Nullable @Provides method");
    }
    
    public e b() {
        return c();
    }
    
    public abstract static final class a
    {
        public static final j a;
        
        static {
            a = new j();
        }
        
        public static /* synthetic */ j a() {
            return j.a.a;
        }
    }
}
