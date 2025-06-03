// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E5;

import java.nio.ByteBuffer;

public interface c
{
    c a(final d p0);
    
    c b();
    
    void c(final String p0, final a p1);
    
    void d(final String p0, final ByteBuffer p1);
    
    void f(final String p0, final ByteBuffer p1, final b p2);
    
    void h(final String p0, final a p1, final c p2);
    
    public interface a
    {
        void a(final ByteBuffer p0, final b p1);
    }
    
    public interface b
    {
        void a(final ByteBuffer p0);
    }
    
    public interface c
    {
    }
    
    public static class d
    {
        public boolean a;
        
        public d() {
            this.a = true;
        }
        
        public boolean a() {
            return this.a;
        }
    }
}
