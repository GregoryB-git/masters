// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E3;

import J3.B;
import java.io.File;
import J3.D;
import java.util.concurrent.atomic.AtomicReference;

public final class d implements a
{
    public static final g c;
    public final r4.a a;
    public final AtomicReference b;
    
    static {
        c = new b(null);
    }
    
    public d(final r4.a a) {
        this.b = new AtomicReference(null);
        (this.a = a).a((r4.a.a)new E3.b(this));
    }
    
    @Override
    public g a(final String s) {
        final a a = this.b.get();
        if (a == null) {
            return d.c;
        }
        return a.a(s);
    }
    
    @Override
    public boolean b() {
        final a a = this.b.get();
        return a != null && a.b();
    }
    
    @Override
    public void c(final String str, final String s, final long n, final D d) {
        final f f = E3.f.f();
        final StringBuilder sb = new StringBuilder();
        sb.append("Deferring native open session: ");
        sb.append(str);
        f.i(sb.toString());
        this.a.a((r4.a.a)new c(str, s, n, d));
    }
    
    @Override
    public boolean d(final String s) {
        final a a = this.b.get();
        return a != null && a.d(s);
    }
    
    public static final class b implements g
    {
        @Override
        public File a() {
            return null;
        }
        
        @Override
        public File b() {
            return null;
        }
        
        @Override
        public File c() {
            return null;
        }
        
        @Override
        public B.a d() {
            return null;
        }
        
        @Override
        public File e() {
            return null;
        }
        
        @Override
        public File f() {
            return null;
        }
        
        @Override
        public File g() {
            return null;
        }
    }
}
