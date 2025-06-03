// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package I3;

import java.io.File;
import M3.g;

public class c
{
    public static final b c;
    public final g a;
    public a b;
    
    static {
        c = new b(null);
    }
    
    public c(final g a) {
        this.a = a;
        this.b = I3.c.c;
    }
    
    public c(final g g, final String s) {
        this(g);
        this.e(s);
    }
    
    public void a() {
        this.b.d();
    }
    
    public byte[] b() {
        return this.b.c();
    }
    
    public String c() {
        return this.b.b();
    }
    
    public final File d(final String s) {
        return this.a.o(s, "userlog");
    }
    
    public final void e(final String s) {
        this.b.a();
        this.b = I3.c.c;
        if (s == null) {
            return;
        }
        this.f(this.d(s), 65536);
    }
    
    public void f(final File file, final int n) {
        this.b = new f(file, n);
    }
    
    public void g(final long n, final String s) {
        this.b.e(n, s);
    }
    
    public static final class b implements a
    {
        @Override
        public void a() {
        }
        
        @Override
        public String b() {
            return null;
        }
        
        @Override
        public byte[] c() {
            return null;
        }
        
        @Override
        public void d() {
        }
        
        @Override
        public void e(final long n, final String s) {
        }
    }
}
