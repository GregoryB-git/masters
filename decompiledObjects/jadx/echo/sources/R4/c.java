package R4;

import j4.C1377c;
import k4.InterfaceC1471a;
import k4.InterfaceC1472b;

/* loaded from: classes.dex */
public final class c implements InterfaceC1471a {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC1471a f5679a = new c();

    public static final class a implements j4.d {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5680a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final C1377c f5681b = C1377c.d("packageName");

        /* renamed from: c, reason: collision with root package name */
        public static final C1377c f5682c = C1377c.d("versionName");

        /* renamed from: d, reason: collision with root package name */
        public static final C1377c f5683d = C1377c.d("appBuildVersion");

        /* renamed from: e, reason: collision with root package name */
        public static final C1377c f5684e = C1377c.d("deviceManufacturer");

        @Override // j4.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(R4.a aVar, j4.e eVar) {
            eVar.g(f5681b, aVar.c());
            eVar.g(f5682c, aVar.d());
            eVar.g(f5683d, aVar.a());
            eVar.g(f5684e, aVar.b());
        }
    }

    public static final class b implements j4.d {

        /* renamed from: a, reason: collision with root package name */
        public static final b f5685a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final C1377c f5686b = C1377c.d("appId");

        /* renamed from: c, reason: collision with root package name */
        public static final C1377c f5687c = C1377c.d("deviceModel");

        /* renamed from: d, reason: collision with root package name */
        public static final C1377c f5688d = C1377c.d("sessionSdkVersion");

        /* renamed from: e, reason: collision with root package name */
        public static final C1377c f5689e = C1377c.d("osVersion");

        /* renamed from: f, reason: collision with root package name */
        public static final C1377c f5690f = C1377c.d("logEnvironment");

        /* renamed from: g, reason: collision with root package name */
        public static final C1377c f5691g = C1377c.d("androidAppInfo");

        @Override // j4.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(R4.b bVar, j4.e eVar) {
            eVar.g(f5686b, bVar.b());
            eVar.g(f5687c, bVar.c());
            eVar.g(f5688d, bVar.f());
            eVar.g(f5689e, bVar.e());
            eVar.g(f5690f, bVar.d());
            eVar.g(f5691g, bVar.a());
        }
    }

    /* renamed from: R4.c$c, reason: collision with other inner class name */
    public static final class C0088c implements j4.d {

        /* renamed from: a, reason: collision with root package name */
        public static final C0088c f5692a = new C0088c();

        /* renamed from: b, reason: collision with root package name */
        public static final C1377c f5693b = C1377c.d("performance");

        /* renamed from: c, reason: collision with root package name */
        public static final C1377c f5694c = C1377c.d("crashlytics");

        /* renamed from: d, reason: collision with root package name */
        public static final C1377c f5695d = C1377c.d("sessionSamplingRate");

        @Override // j4.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(f fVar, j4.e eVar) {
            eVar.g(f5693b, fVar.b());
            eVar.g(f5694c, fVar.a());
            eVar.a(f5695d, fVar.c());
        }
    }

    public static final class d implements j4.d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f5696a = new d();

        /* renamed from: b, reason: collision with root package name */
        public static final C1377c f5697b = C1377c.d("eventType");

        /* renamed from: c, reason: collision with root package name */
        public static final C1377c f5698c = C1377c.d("sessionData");

        /* renamed from: d, reason: collision with root package name */
        public static final C1377c f5699d = C1377c.d("applicationInfo");

        @Override // j4.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(q qVar, j4.e eVar) {
            eVar.g(f5697b, qVar.b());
            eVar.g(f5698c, qVar.c());
            eVar.g(f5699d, qVar.a());
        }
    }

    public static final class e implements j4.d {

        /* renamed from: a, reason: collision with root package name */
        public static final e f5700a = new e();

        /* renamed from: b, reason: collision with root package name */
        public static final C1377c f5701b = C1377c.d("sessionId");

        /* renamed from: c, reason: collision with root package name */
        public static final C1377c f5702c = C1377c.d("firstSessionId");

        /* renamed from: d, reason: collision with root package name */
        public static final C1377c f5703d = C1377c.d("sessionIndex");

        /* renamed from: e, reason: collision with root package name */
        public static final C1377c f5704e = C1377c.d("eventTimestampUs");

        /* renamed from: f, reason: collision with root package name */
        public static final C1377c f5705f = C1377c.d("dataCollectionStatus");

        /* renamed from: g, reason: collision with root package name */
        public static final C1377c f5706g = C1377c.d("firebaseInstallationId");

        @Override // j4.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(t tVar, j4.e eVar) {
            eVar.g(f5701b, tVar.e());
            eVar.g(f5702c, tVar.d());
            eVar.c(f5703d, tVar.f());
            eVar.b(f5704e, tVar.b());
            eVar.g(f5705f, tVar.a());
            eVar.g(f5706g, tVar.c());
        }
    }

    @Override // k4.InterfaceC1471a
    public void a(InterfaceC1472b interfaceC1472b) {
        interfaceC1472b.a(q.class, d.f5696a);
        interfaceC1472b.a(t.class, e.f5700a);
        interfaceC1472b.a(f.class, C0088c.f5692a);
        interfaceC1472b.a(R4.b.class, b.f5685a);
        interfaceC1472b.a(R4.a.class, a.f5680a);
    }
}
