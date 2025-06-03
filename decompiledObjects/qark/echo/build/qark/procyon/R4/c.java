// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R4;

import j4.e;
import j4.d;
import k4.b;
import k4.a;

public final class c implements k4.a
{
    public static final k4.a a;
    
    static {
        a = new c();
    }
    
    @Override
    public void a(final k4.b b) {
        b.a(q.class, d.a);
        b.a(t.class, e.a);
        b.a(f.class, c.a);
        b.a(R4.b.class, b.a);
        b.a(R4.a.class, R4.c.a.a);
    }
    
    public static final class a implements d
    {
        public static final a a;
        public static final c b;
        public static final c c;
        public static final c d;
        public static final c e;
        
        static {
            a = new a();
            b = j4.c.d("packageName");
            c = j4.c.d("versionName");
            d = j4.c.d("appBuildVersion");
            e = j4.c.d("deviceManufacturer");
        }
        
        public void b(final R4.a a, final j4.e e) {
            e.g(R4.c.a.b, a.c());
            e.g(R4.c.a.c, a.d());
            e.g(R4.c.a.d, a.a());
            e.g(R4.c.a.e, a.b());
        }
    }
    
    public static final class b implements d
    {
        public static final b a;
        public static final c b;
        public static final c c;
        public static final c d;
        public static final c e;
        public static final c f;
        public static final c g;
        
        static {
            a = new b();
            b = j4.c.d("appId");
            c = j4.c.d("deviceModel");
            d = j4.c.d("sessionSdkVersion");
            e = j4.c.d("osVersion");
            f = j4.c.d("logEnvironment");
            g = j4.c.d("androidAppInfo");
        }
        
        public void b(final R4.b b, final j4.e e) {
            e.g(R4.c.b.b, b.b());
            e.g(R4.c.b.c, b.c());
            e.g(R4.c.b.d, b.f());
            e.g(R4.c.b.e, b.e());
            e.g(R4.c.b.f, b.d());
            e.g(R4.c.b.g, b.a());
        }
    }
    
    public static final class c implements d
    {
        public static final c a;
        public static final j4.c b;
        public static final j4.c c;
        public static final j4.c d;
        
        static {
            a = new c();
            b = j4.c.d("performance");
            c = j4.c.d("crashlytics");
            d = j4.c.d("sessionSamplingRate");
        }
        
        public void b(final f f, final j4.e e) {
            e.g(R4.c.c.b, f.b());
            e.g(R4.c.c.c, f.a());
            e.a(R4.c.c.d, f.c());
        }
    }
    
    public static final class d implements j4.d
    {
        public static final d a;
        public static final c b;
        public static final c c;
        public static final c d;
        
        static {
            a = new d();
            b = j4.c.d("eventType");
            c = j4.c.d("sessionData");
            d = j4.c.d("applicationInfo");
        }
        
        public void b(final q q, final j4.e e) {
            e.g(R4.c.d.b, q.b());
            e.g(R4.c.d.c, q.c());
            e.g(R4.c.d.d, q.a());
        }
    }
    
    public static final class e implements d
    {
        public static final e a;
        public static final c b;
        public static final c c;
        public static final c d;
        public static final c e;
        public static final c f;
        public static final c g;
        
        static {
            a = new e();
            b = j4.c.d("sessionId");
            c = j4.c.d("firstSessionId");
            d = j4.c.d("sessionIndex");
            e = j4.c.d("eventTimestampUs");
            f = j4.c.d("dataCollectionStatus");
            g = j4.c.d("firebaseInstallationId");
        }
        
        public void b(final t t, final j4.e e) {
            e.g(R4.c.e.b, t.e());
            e.g(R4.c.e.c, t.d());
            e.c(R4.c.e.d, t.f());
            e.b(R4.c.e.e, t.b());
            e.g(R4.c.e.f, t.a());
            e.g(R4.c.e.g, t.c());
        }
    }
}
