// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package f2;

import java.lang.annotation.Annotation;
import i2.e;
import i2.c;
import i2.f;
import j4.d;
import k4.b;

public final class a implements a
{
    public static final a a;
    
    static {
        a = new a();
    }
    
    @Override
    public void a(final k4.b b) {
        b.a(m.class, e.a);
        b.a(i2.a.class, f2.a.a.a);
        b.a(i2.f.class, g.a);
        b.a(i2.d.class, d.a);
        b.a(i2.c.class, c.a);
        b.a(i2.b.class, f2.a.b.a);
        b.a(i2.e.class, f.a);
    }
    
    public static final class a implements d
    {
        public static final a a;
        public static final j4.c b;
        public static final j4.c c;
        public static final j4.c d;
        public static final j4.c e;
        
        static {
            a = new a();
            b = j4.c.a("window").b(m4.a.b().c(1).a()).a();
            c = j4.c.a("logSourceMetrics").b(m4.a.b().c(2).a()).a();
            d = j4.c.a("globalMetrics").b(m4.a.b().c(3).a()).a();
            e = j4.c.a("appNamespace").b(m4.a.b().c(4).a()).a();
        }
        
        public void b(final i2.a a, final j4.e e) {
            e.g(a.b, a.d());
            e.g(a.c, a.c());
            e.g(a.d, a.b());
            e.g(a.e, a.a());
        }
    }
    
    public static final class b implements d
    {
        public static final b a;
        public static final j4.c b;
        
        static {
            a = new b();
            b = j4.c.a("storageMetrics").b(m4.a.b().c(1).a()).a();
        }
        
        public void b(final i2.b b, final j4.e e) {
            e.g(f2.a.b.b, b.a());
        }
    }
    
    public static final class c implements d
    {
        public static final c a;
        public static final j4.c b;
        public static final j4.c c;
        
        static {
            a = new c();
            b = j4.c.a("eventsDroppedCount").b(m4.a.b().c(1).a()).a();
            c = j4.c.a("reason").b(m4.a.b().c(3).a()).a();
        }
        
        public void b(final i2.c c, final j4.e e) {
            e.b(f2.a.c.b, c.a());
            e.g(f2.a.c.c, c.b());
        }
    }
    
    public static final class d implements j4.d
    {
        public static final d a;
        public static final j4.c b;
        public static final j4.c c;
        
        static {
            a = new d();
            b = j4.c.a("logSource").b(m4.a.b().c(1).a()).a();
            c = j4.c.a("logEventDropped").b(m4.a.b().c(2).a()).a();
        }
        
        public void b(final i2.d d, final j4.e e) {
            e.g(f2.a.d.b, d.b());
            e.g(f2.a.d.c, d.a());
        }
    }
    
    public static final class e implements d
    {
        public static final e a;
        public static final j4.c b;
        
        static {
            a = new e();
            b = j4.c.d("clientMetrics");
        }
        
        public void b(final m m, final j4.e e) {
            throw null;
        }
    }
    
    public static final class f implements d
    {
        public static final f a;
        public static final j4.c b;
        public static final j4.c c;
        
        static {
            a = new f();
            b = j4.c.a("currentCacheSizeBytes").b(m4.a.b().c(1).a()).a();
            c = j4.c.a("maxCacheSizeBytes").b(m4.a.b().c(2).a()).a();
        }
        
        public void b(final i2.e e, final j4.e e2) {
            e2.b(f.b, e.a());
            e2.b(f.c, e.b());
        }
    }
    
    public static final class g implements d
    {
        public static final g a;
        public static final j4.c b;
        public static final j4.c c;
        
        static {
            a = new g();
            b = j4.c.a("startMs").b(m4.a.b().c(1).a()).a();
            c = j4.c.a("endMs").b(m4.a.b().c(2).a()).a();
        }
        
        public void b(final i2.f f, final j4.e e) {
            e.b(g.b, f.b());
            e.b(g.c, f.a());
        }
    }
}
