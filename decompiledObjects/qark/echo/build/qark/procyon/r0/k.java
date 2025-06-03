// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package r0;

import java.io.IOException;
import B0.m;
import x0.E;
import android.net.Uri;

public interface k
{
    boolean a();
    
    g b();
    
    boolean c(final Uri p0, final long p1);
    
    boolean d(final Uri p0);
    
    void e(final Uri p0, final E.a p1, final e p2);
    
    void f();
    
    void g(final Uri p0);
    
    void h(final Uri p0);
    
    void i(final Uri p0);
    
    void j(final b p0);
    
    f k(final Uri p0, final boolean p1);
    
    void l(final b p0);
    
    long m();
    
    void stop();
    
    public interface a
    {
        k a(final q0.g p0, final m p1, final j p2);
    }
    
    public interface b
    {
        void a();
        
        boolean e(final Uri p0, final m.c p1, final boolean p2);
    }
    
    public static final class c extends IOException
    {
        public final Uri o;
        
        public c(final Uri o) {
            this.o = o;
        }
    }
    
    public static final class d extends IOException
    {
        public final Uri o;
        
        public d(final Uri o) {
            this.o = o;
        }
    }
    
    public interface e
    {
        void b(final f p0);
    }
}
