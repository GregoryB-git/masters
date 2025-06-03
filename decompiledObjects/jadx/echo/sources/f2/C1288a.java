package f2;

import i2.C1347a;
import i2.C1348b;
import i2.C1349c;
import i2.C1350d;
import i2.C1351e;
import i2.C1352f;
import j4.C1377c;
import k4.InterfaceC1471a;
import k4.InterfaceC1472b;
import m4.C1673a;

/* renamed from: f2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1288a implements InterfaceC1471a {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC1471a f14149a = new C1288a();

    /* renamed from: f2.a$a, reason: collision with other inner class name */
    public static final class C0205a implements j4.d {

        /* renamed from: a, reason: collision with root package name */
        public static final C0205a f14150a = new C0205a();

        /* renamed from: b, reason: collision with root package name */
        public static final C1377c f14151b = C1377c.a("window").b(C1673a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        public static final C1377c f14152c = C1377c.a("logSourceMetrics").b(C1673a.b().c(2).a()).a();

        /* renamed from: d, reason: collision with root package name */
        public static final C1377c f14153d = C1377c.a("globalMetrics").b(C1673a.b().c(3).a()).a();

        /* renamed from: e, reason: collision with root package name */
        public static final C1377c f14154e = C1377c.a("appNamespace").b(C1673a.b().c(4).a()).a();

        @Override // j4.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C1347a c1347a, j4.e eVar) {
            eVar.g(f14151b, c1347a.d());
            eVar.g(f14152c, c1347a.c());
            eVar.g(f14153d, c1347a.b());
            eVar.g(f14154e, c1347a.a());
        }
    }

    /* renamed from: f2.a$b */
    public static final class b implements j4.d {

        /* renamed from: a, reason: collision with root package name */
        public static final b f14155a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final C1377c f14156b = C1377c.a("storageMetrics").b(C1673a.b().c(1).a()).a();

        @Override // j4.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C1348b c1348b, j4.e eVar) {
            eVar.g(f14156b, c1348b.a());
        }
    }

    /* renamed from: f2.a$c */
    public static final class c implements j4.d {

        /* renamed from: a, reason: collision with root package name */
        public static final c f14157a = new c();

        /* renamed from: b, reason: collision with root package name */
        public static final C1377c f14158b = C1377c.a("eventsDroppedCount").b(C1673a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        public static final C1377c f14159c = C1377c.a("reason").b(C1673a.b().c(3).a()).a();

        @Override // j4.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C1349c c1349c, j4.e eVar) {
            eVar.b(f14158b, c1349c.a());
            eVar.g(f14159c, c1349c.b());
        }
    }

    /* renamed from: f2.a$d */
    public static final class d implements j4.d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f14160a = new d();

        /* renamed from: b, reason: collision with root package name */
        public static final C1377c f14161b = C1377c.a("logSource").b(C1673a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        public static final C1377c f14162c = C1377c.a("logEventDropped").b(C1673a.b().c(2).a()).a();

        @Override // j4.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C1350d c1350d, j4.e eVar) {
            eVar.g(f14161b, c1350d.b());
            eVar.g(f14162c, c1350d.a());
        }
    }

    /* renamed from: f2.a$e */
    public static final class e implements j4.d {

        /* renamed from: a, reason: collision with root package name */
        public static final e f14163a = new e();

        /* renamed from: b, reason: collision with root package name */
        public static final C1377c f14164b = C1377c.d("clientMetrics");

        @Override // j4.d
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            android.support.v4.media.a.a(obj);
            b(null, (j4.e) obj2);
        }

        public void b(m mVar, j4.e eVar) {
            throw null;
        }
    }

    /* renamed from: f2.a$f */
    public static final class f implements j4.d {

        /* renamed from: a, reason: collision with root package name */
        public static final f f14165a = new f();

        /* renamed from: b, reason: collision with root package name */
        public static final C1377c f14166b = C1377c.a("currentCacheSizeBytes").b(C1673a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        public static final C1377c f14167c = C1377c.a("maxCacheSizeBytes").b(C1673a.b().c(2).a()).a();

        @Override // j4.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C1351e c1351e, j4.e eVar) {
            eVar.b(f14166b, c1351e.a());
            eVar.b(f14167c, c1351e.b());
        }
    }

    /* renamed from: f2.a$g */
    public static final class g implements j4.d {

        /* renamed from: a, reason: collision with root package name */
        public static final g f14168a = new g();

        /* renamed from: b, reason: collision with root package name */
        public static final C1377c f14169b = C1377c.a("startMs").b(C1673a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        public static final C1377c f14170c = C1377c.a("endMs").b(C1673a.b().c(2).a()).a();

        @Override // j4.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C1352f c1352f, j4.e eVar) {
            eVar.b(f14169b, c1352f.b());
            eVar.b(f14170c, c1352f.a());
        }
    }

    @Override // k4.InterfaceC1471a
    public void a(InterfaceC1472b interfaceC1472b) {
        interfaceC1472b.a(m.class, e.f14163a);
        interfaceC1472b.a(C1347a.class, C0205a.f14150a);
        interfaceC1472b.a(C1352f.class, g.f14168a);
        interfaceC1472b.a(C1350d.class, d.f14160a);
        interfaceC1472b.a(C1349c.class, c.f14157a);
        interfaceC1472b.a(C1348b.class, b.f14155a);
        interfaceC1472b.a(C1351e.class, f.f14165a);
    }
}
