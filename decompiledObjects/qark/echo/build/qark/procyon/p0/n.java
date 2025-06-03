// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p0;

import java.io.IOException;
import j0.b;
import java.util.UUID;
import java.util.Map;

public interface n
{
    void a(final v.a p0);
    
    boolean b();
    
    Map c();
    
    UUID d();
    
    void e(final v.a p0);
    
    boolean f(final String p0);
    
    a g();
    
    int getState();
    
    b h();
    
    public static class a extends IOException
    {
        public final int o;
        
        public a(final Throwable cause, final int o) {
            super(cause);
            this.o = o;
        }
    }
}
