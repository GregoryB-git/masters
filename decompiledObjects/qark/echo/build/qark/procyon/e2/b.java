// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e2;

import j4.d;
import k4.a;

public final class b implements k4.a
{
    public static final k4.a a;
    
    static {
        a = new b();
    }
    
    @Override
    public void a(final b b) {
        final b a = b.a;
        b.a(j.class, a);
        b.a(e2.d.class, a);
        final e a2 = e.a;
        b.a(m.class, a2);
        b.a(g.class, a2);
        final c a3 = c.a;
        b.a(k.class, a3);
        b.a(e2.e.class, a3);
        final a a4 = e2.b.a.a;
        b.a(e2.a.class, a4);
        b.a(e2.c.class, a4);
        final d a5 = d.a;
        b.a(l.class, a5);
        b.a(e2.f.class, a5);
        final f a6 = f.a;
        b.a(o.class, a6);
        b.a(i.class, a6);
    }
    
    public static final class a implements d
    {
        public static final a a;
        public static final j4.c b;
        public static final j4.c c;
        public static final j4.c d;
        public static final j4.c e;
        public static final j4.c f;
        public static final j4.c g;
        public static final j4.c h;
        public static final j4.c i;
        public static final j4.c j;
        public static final j4.c k;
        public static final j4.c l;
        public static final j4.c m;
        
        static {
            a = new a();
            b = j4.c.d("sdkVersion");
            c = j4.c.d("model");
            d = j4.c.d("hardware");
            e = j4.c.d("device");
            f = j4.c.d("product");
            g = j4.c.d("osBuild");
            h = j4.c.d("manufacturer");
            i = j4.c.d("fingerprint");
            j = j4.c.d("locale");
            k = j4.c.d("country");
            l = j4.c.d("mccMnc");
            m = j4.c.d("applicationBuild");
        }
        
        public void b(final e2.a a, final j4.e e) {
            e.g(e2.b.a.b, a.m());
            e.g(e2.b.a.c, a.j());
            e.g(e2.b.a.d, a.f());
            e.g(e2.b.a.e, a.d());
            e.g(e2.b.a.f, a.l());
            e.g(e2.b.a.g, a.k());
            e.g(e2.b.a.h, a.h());
            e.g(e2.b.a.i, a.e());
            e.g(e2.b.a.j, a.g());
            e.g(e2.b.a.k, a.c());
            e.g(e2.b.a.l, a.i());
            e.g(e2.b.a.m, a.b());
        }
    }
    
    public static final class b implements d
    {
        public static final b a;
        public static final j4.c b;
        
        static {
            a = new b();
            b = j4.c.d("logRequest");
        }
        
        public void b(final j j, final j4.e e) {
            e.g(e2.b.b.b, j.c());
        }
    }
    
    public static final class c implements d
    {
        public static final c a;
        public static final j4.c b;
        public static final j4.c c;
        
        static {
            a = new c();
            b = j4.c.d("clientType");
            c = j4.c.d("androidClientInfo");
        }
        
        public void b(final k k, final j4.e e) {
            e.g(e2.b.c.b, k.c());
            e.g(e2.b.c.c, k.b());
        }
    }
    
    public static final class d implements j4.d
    {
        public static final d a;
        public static final j4.c b;
        public static final j4.c c;
        public static final j4.c d;
        public static final j4.c e;
        public static final j4.c f;
        public static final j4.c g;
        public static final j4.c h;
        
        static {
            a = new d();
            b = j4.c.d("eventTimeMs");
            c = j4.c.d("eventCode");
            d = j4.c.d("eventUptimeMs");
            e = j4.c.d("sourceExtension");
            f = j4.c.d("sourceExtensionJsonProto3");
            g = j4.c.d("timezoneOffsetSeconds");
            h = j4.c.d("networkConnectionInfo");
        }
        
        public void b(final l l, final j4.e e) {
            e.b(e2.b.d.b, l.c());
            e.g(e2.b.d.c, l.b());
            e.b(e2.b.d.d, l.d());
            e.g(e2.b.d.e, l.f());
            e.g(e2.b.d.f, l.g());
            e.b(e2.b.d.g, l.h());
            e.g(e2.b.d.h, l.e());
        }
    }
    
    public static final class e implements d
    {
        public static final e a;
        public static final j4.c b;
        public static final j4.c c;
        public static final j4.c d;
        public static final j4.c e;
        public static final j4.c f;
        public static final j4.c g;
        public static final j4.c h;
        
        static {
            a = new e();
            b = j4.c.d("requestTimeMs");
            c = j4.c.d("requestUptimeMs");
            d = j4.c.d("clientInfo");
            e = j4.c.d("logSource");
            f = j4.c.d("logSourceName");
            g = j4.c.d("logEvent");
            h = j4.c.d("qosTier");
        }
        
        public void b(final m m, final j4.e e) {
            e.b(e2.b.e.b, m.g());
            e.b(e2.b.e.c, m.h());
            e.g(e2.b.e.d, m.b());
            e.g(e2.b.e.e, m.d());
            e.g(e2.b.e.f, m.e());
            e.g(e2.b.e.g, m.c());
            e.g(e2.b.e.h, m.f());
        }
    }
    
    public static final class f implements d
    {
        public static final f a;
        public static final j4.c b;
        public static final j4.c c;
        
        static {
            a = new f();
            b = j4.c.d("networkType");
            c = j4.c.d("mobileSubtype");
        }
        
        public void b(final o o, final j4.e e) {
            e.g(f.b, o.c());
            e.g(f.c, o.b());
        }
    }
}
