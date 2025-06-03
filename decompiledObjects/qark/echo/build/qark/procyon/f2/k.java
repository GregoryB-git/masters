// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package f2;

import h2.d;
import java.util.concurrent.Executor;
import h2.b;

public final class k implements b
{
    public static k a() {
        return a.a();
    }
    
    public static Executor b() {
        return (Executor)d.c(j.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
    
    public Executor c() {
        return b();
    }
    
    public abstract static final class a
    {
        public static final k a;
        
        static {
            a = new k();
        }
        
        public static /* synthetic */ k a() {
            return k.a.a;
        }
    }
}
