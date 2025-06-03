/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package R4;

import R4.f;
import R4.j;
import R4.n;
import R4.q;
import R4.t;

public final class c
implements k4.a {
    public static final k4.a a = new c();

    @Override
    public void a(k4.b b8) {
        b8.a(q.class, d.a);
        b8.a(t.class, e.a);
        b8.a(f.class, c.a);
        b8.a(R4.b.class, b.a);
        b8.a(R4.a.class, a.a);
    }

    public static final class a
    implements j4.d {
        public static final a a = new a();
        public static final j4.c b = j4.c.d("packageName");
        public static final j4.c c = j4.c.d("versionName");
        public static final j4.c d = j4.c.d("appBuildVersion");
        public static final j4.c e = j4.c.d("deviceManufacturer");

        public void b(R4.a a8, j4.e e8) {
            e8.g(b, a8.c());
            e8.g(c, a8.d());
            e8.g(d, a8.a());
            e8.g(e, a8.b());
        }
    }

    public static final class b
    implements j4.d {
        public static final b a = new b();
        public static final j4.c b = j4.c.d("appId");
        public static final j4.c c = j4.c.d("deviceModel");
        public static final j4.c d = j4.c.d("sessionSdkVersion");
        public static final j4.c e = j4.c.d("osVersion");
        public static final j4.c f = j4.c.d("logEnvironment");
        public static final j4.c g = j4.c.d("androidAppInfo");

        public void b(R4.b b8, j4.e e8) {
            e8.g(b, b8.b());
            e8.g(c, b8.c());
            e8.g(d, b8.f());
            e8.g(e, b8.e());
            e8.g(f, b8.d());
            e8.g(g, b8.a());
        }
    }

    public static final class c
    implements j4.d {
        public static final c a = new c();
        public static final j4.c b = j4.c.d("performance");
        public static final j4.c c = j4.c.d("crashlytics");
        public static final j4.c d = j4.c.d("sessionSamplingRate");

        public void b(f f8, j4.e e8) {
            e8.g(b, f8.b());
            e8.g(c, f8.a());
            e8.a(d, f8.c());
        }
    }

    public static final class d
    implements j4.d {
        public static final d a = new d();
        public static final j4.c b = j4.c.d("eventType");
        public static final j4.c c = j4.c.d("sessionData");
        public static final j4.c d = j4.c.d("applicationInfo");

        public void b(q q8, j4.e e8) {
            e8.g(b, q8.b());
            e8.g(c, q8.c());
            e8.g(d, q8.a());
        }
    }

    public static final class e
    implements j4.d {
        public static final e a = new e();
        public static final j4.c b = j4.c.d("sessionId");
        public static final j4.c c = j4.c.d("firstSessionId");
        public static final j4.c d = j4.c.d("sessionIndex");
        public static final j4.c e = j4.c.d("eventTimestampUs");
        public static final j4.c f = j4.c.d("dataCollectionStatus");
        public static final j4.c g = j4.c.d("firebaseInstallationId");

        public void b(t t8, j4.e e8) {
            e8.g(b, t8.e());
            e8.g(c, t8.d());
            e8.c(d, t8.f());
            e8.b(e, t8.b());
            e8.g(f, t8.a());
            e8.g(g, t8.c());
        }
    }

}

