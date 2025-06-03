/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.annotation.Annotation
 *  java.util.List
 */
package f2;

import f2.m;
import i2.c;
import j4.c;
import java.lang.annotation.Annotation;
import java.util.List;

public final class a
implements k4.a {
    public static final k4.a a = new a();

    @Override
    public void a(k4.b b8) {
        b8.a(m.class, e.a);
        b8.a(i2.a.class, a.a);
        b8.a(i2.f.class, g.a);
        b8.a(i2.d.class, d.a);
        b8.a(i2.c.class, c.a);
        b8.a(i2.b.class, b.a);
        b8.a(i2.e.class, f.a);
    }

    public static final class a
    implements j4.d {
        public static final a a = new a();
        public static final j4.c b = j4.c.a("window").b(m4.a.b().c(1).a()).a();
        public static final j4.c c = j4.c.a("logSourceMetrics").b(m4.a.b().c(2).a()).a();
        public static final j4.c d = j4.c.a("globalMetrics").b(m4.a.b().c(3).a()).a();
        public static final j4.c e = j4.c.a("appNamespace").b(m4.a.b().c(4).a()).a();

        public void b(i2.a a8, j4.e e8) {
            e8.g(b, a8.d());
            e8.g(c, (Object)a8.c());
            e8.g(d, a8.b());
            e8.g(e, a8.a());
        }
    }

    public static final class b
    implements j4.d {
        public static final b a = new b();
        public static final j4.c b = j4.c.a("storageMetrics").b(m4.a.b().c(1).a()).a();

        public void b(i2.b b8, j4.e e8) {
            e8.g(b, b8.a());
        }
    }

    public static final class c
    implements j4.d {
        public static final c a = new c();
        public static final j4.c b = j4.c.a("eventsDroppedCount").b(m4.a.b().c(1).a()).a();
        public static final j4.c c = j4.c.a("reason").b(m4.a.b().c(3).a()).a();

        public void b(i2.c c8, j4.e e8) {
            e8.b(b, c8.a());
            e8.g(c, c8.b());
        }
    }

    public static final class d
    implements j4.d {
        public static final d a = new d();
        public static final j4.c b = j4.c.a("logSource").b(m4.a.b().c(1).a()).a();
        public static final j4.c c = j4.c.a("logEventDropped").b(m4.a.b().c(2).a()).a();

        public void b(i2.d d8, j4.e e8) {
            e8.g(b, d8.b());
            e8.g(c, (Object)d8.a());
        }
    }

    public static final class e
    implements j4.d {
        public static final e a = new e();
        public static final j4.c b = j4.c.d("clientMetrics");

        public void b(m m8, j4.e e8) {
            throw null;
        }
    }

    public static final class f
    implements j4.d {
        public static final f a = new f();
        public static final j4.c b = j4.c.a("currentCacheSizeBytes").b(m4.a.b().c(1).a()).a();
        public static final j4.c c = j4.c.a("maxCacheSizeBytes").b(m4.a.b().c(2).a()).a();

        public void b(i2.e e8, j4.e e9) {
            e9.b(b, e8.a());
            e9.b(c, e8.b());
        }
    }

    public static final class g
    implements j4.d {
        public static final g a = new g();
        public static final j4.c b = j4.c.a("startMs").b(m4.a.b().c(1).a()).a();
        public static final j4.c c = j4.c.a("endMs").b(m4.a.b().c(2).a()).a();

        public void b(i2.f f8, j4.e e8) {
            e8.b(b, f8.b());
            e8.b(c, f8.a());
        }
    }

}

