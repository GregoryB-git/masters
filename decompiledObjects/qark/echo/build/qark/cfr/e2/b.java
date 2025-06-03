/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package e2;

import e2.g;
import e2.i;
import e2.j;
import e2.k;
import e2.l;
import e2.m;
import e2.o;
import e2.p;
import java.util.List;

public final class b
implements k4.a {
    public static final k4.a a = new b();

    @Override
    public void a(k4.b b8) {
        j4.d d8 = b.a;
        b8.a(j.class, d8);
        b8.a(e2.d.class, d8);
        d8 = e.a;
        b8.a(m.class, d8);
        b8.a(g.class, d8);
        d8 = c.a;
        b8.a(k.class, d8);
        b8.a(e2.e.class, d8);
        d8 = a.a;
        b8.a(e2.a.class, d8);
        b8.a(e2.c.class, d8);
        d8 = d.a;
        b8.a(l.class, d8);
        b8.a(e2.f.class, d8);
        d8 = f.a;
        b8.a(o.class, d8);
        b8.a(i.class, d8);
    }

    public static final class a
    implements j4.d {
        public static final a a = new a();
        public static final j4.c b = j4.c.d("sdkVersion");
        public static final j4.c c = j4.c.d("model");
        public static final j4.c d = j4.c.d("hardware");
        public static final j4.c e = j4.c.d("device");
        public static final j4.c f = j4.c.d("product");
        public static final j4.c g = j4.c.d("osBuild");
        public static final j4.c h = j4.c.d("manufacturer");
        public static final j4.c i = j4.c.d("fingerprint");
        public static final j4.c j = j4.c.d("locale");
        public static final j4.c k = j4.c.d("country");
        public static final j4.c l = j4.c.d("mccMnc");
        public static final j4.c m = j4.c.d("applicationBuild");

        public void b(e2.a a8, j4.e e8) {
            e8.g(b, (Object)a8.m());
            e8.g(c, a8.j());
            e8.g(d, a8.f());
            e8.g(e, a8.d());
            e8.g(f, a8.l());
            e8.g(g, a8.k());
            e8.g(h, a8.h());
            e8.g(i, a8.e());
            e8.g(j, a8.g());
            e8.g(k, a8.c());
            e8.g(l, a8.i());
            e8.g(m, a8.b());
        }
    }

    public static final class b
    implements j4.d {
        public static final b a = new b();
        public static final j4.c b = j4.c.d("logRequest");

        public void b(j j8, j4.e e8) {
            e8.g(b, (Object)j8.c());
        }
    }

    public static final class c
    implements j4.d {
        public static final c a = new c();
        public static final j4.c b = j4.c.d("clientType");
        public static final j4.c c = j4.c.d("androidClientInfo");

        public void b(k k8, j4.e e8) {
            e8.g(b, (Object)k8.c());
            e8.g(c, k8.b());
        }
    }

    public static final class d
    implements j4.d {
        public static final d a = new d();
        public static final j4.c b = j4.c.d("eventTimeMs");
        public static final j4.c c = j4.c.d("eventCode");
        public static final j4.c d = j4.c.d("eventUptimeMs");
        public static final j4.c e = j4.c.d("sourceExtension");
        public static final j4.c f = j4.c.d("sourceExtensionJsonProto3");
        public static final j4.c g = j4.c.d("timezoneOffsetSeconds");
        public static final j4.c h = j4.c.d("networkConnectionInfo");

        public void b(l l8, j4.e e8) {
            e8.b(b, l8.c());
            e8.g(c, (Object)l8.b());
            e8.b(d, l8.d());
            e8.g(e, l8.f());
            e8.g(f, l8.g());
            e8.b(g, l8.h());
            e8.g(h, l8.e());
        }
    }

    public static final class e
    implements j4.d {
        public static final e a = new e();
        public static final j4.c b = j4.c.d("requestTimeMs");
        public static final j4.c c = j4.c.d("requestUptimeMs");
        public static final j4.c d = j4.c.d("clientInfo");
        public static final j4.c e = j4.c.d("logSource");
        public static final j4.c f = j4.c.d("logSourceName");
        public static final j4.c g = j4.c.d("logEvent");
        public static final j4.c h = j4.c.d("qosTier");

        public void b(m m8, j4.e e8) {
            e8.b(b, m8.g());
            e8.b(c, m8.h());
            e8.g(d, m8.b());
            e8.g(e, (Object)m8.d());
            e8.g(f, m8.e());
            e8.g(g, (Object)m8.c());
            e8.g(h, (Object)m8.f());
        }
    }

    public static final class f
    implements j4.d {
        public static final f a = new f();
        public static final j4.c b = j4.c.d("networkType");
        public static final j4.c c = j4.c.d("mobileSubtype");

        public void b(o o8, j4.e e8) {
            e8.g(b, (Object)o8.c());
            e8.g(c, (Object)o8.b());
        }
    }

}

