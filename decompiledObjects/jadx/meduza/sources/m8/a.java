package m8;

import io.flutter.plugins.firebase.crashlytics.Constants;
import m8.f0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f10376a = new a();

    /* renamed from: m8.a$a, reason: collision with other inner class name */
    public static final class C0149a implements y8.d<f0.a.AbstractC0150a> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0149a f10377a = new C0149a();

        /* renamed from: b, reason: collision with root package name */
        public static final y8.c f10378b = y8.c.a("arch");

        /* renamed from: c, reason: collision with root package name */
        public static final y8.c f10379c = y8.c.a("libraryName");

        /* renamed from: d, reason: collision with root package name */
        public static final y8.c f10380d = y8.c.a(Constants.BUILD_ID);

        @Override // y8.a
        public final void a(Object obj, y8.e eVar) {
            f0.a.AbstractC0150a abstractC0150a = (f0.a.AbstractC0150a) obj;
            y8.e eVar2 = eVar;
            eVar2.e(f10378b, abstractC0150a.a());
            eVar2.e(f10379c, abstractC0150a.c());
            eVar2.e(f10380d, abstractC0150a.b());
        }
    }

    public static final class b implements y8.d<f0.a> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f10381a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final y8.c f10382b = y8.c.a("pid");

        /* renamed from: c, reason: collision with root package name */
        public static final y8.c f10383c = y8.c.a("processName");

        /* renamed from: d, reason: collision with root package name */
        public static final y8.c f10384d = y8.c.a("reasonCode");

        /* renamed from: e, reason: collision with root package name */
        public static final y8.c f10385e = y8.c.a("importance");
        public static final y8.c f = y8.c.a("pss");

        /* renamed from: g, reason: collision with root package name */
        public static final y8.c f10386g = y8.c.a("rss");

        /* renamed from: h, reason: collision with root package name */
        public static final y8.c f10387h = y8.c.a(Constants.TIMESTAMP);

        /* renamed from: i, reason: collision with root package name */
        public static final y8.c f10388i = y8.c.a("traceFile");

        /* renamed from: j, reason: collision with root package name */
        public static final y8.c f10389j = y8.c.a("buildIdMappingForArch");

        @Override // y8.a
        public final void a(Object obj, y8.e eVar) {
            f0.a aVar = (f0.a) obj;
            y8.e eVar2 = eVar;
            eVar2.c(f10382b, aVar.c());
            eVar2.e(f10383c, aVar.d());
            eVar2.c(f10384d, aVar.f());
            eVar2.c(f10385e, aVar.b());
            eVar2.d(f, aVar.e());
            eVar2.d(f10386g, aVar.g());
            eVar2.d(f10387h, aVar.h());
            eVar2.e(f10388i, aVar.i());
            eVar2.e(f10389j, aVar.a());
        }
    }

    public static final class c implements y8.d<f0.c> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f10390a = new c();

        /* renamed from: b, reason: collision with root package name */
        public static final y8.c f10391b = y8.c.a(Constants.KEY);

        /* renamed from: c, reason: collision with root package name */
        public static final y8.c f10392c = y8.c.a("value");

        @Override // y8.a
        public final void a(Object obj, y8.e eVar) {
            f0.c cVar = (f0.c) obj;
            y8.e eVar2 = eVar;
            eVar2.e(f10391b, cVar.a());
            eVar2.e(f10392c, cVar.b());
        }
    }

    public static final class d implements y8.d<f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f10393a = new d();

        /* renamed from: b, reason: collision with root package name */
        public static final y8.c f10394b = y8.c.a("sdkVersion");

        /* renamed from: c, reason: collision with root package name */
        public static final y8.c f10395c = y8.c.a("gmpAppId");

        /* renamed from: d, reason: collision with root package name */
        public static final y8.c f10396d = y8.c.a("platform");

        /* renamed from: e, reason: collision with root package name */
        public static final y8.c f10397e = y8.c.a("installationUuid");
        public static final y8.c f = y8.c.a("firebaseInstallationId");

        /* renamed from: g, reason: collision with root package name */
        public static final y8.c f10398g = y8.c.a("firebaseAuthenticationToken");

        /* renamed from: h, reason: collision with root package name */
        public static final y8.c f10399h = y8.c.a("appQualitySessionId");

        /* renamed from: i, reason: collision with root package name */
        public static final y8.c f10400i = y8.c.a("buildVersion");

        /* renamed from: j, reason: collision with root package name */
        public static final y8.c f10401j = y8.c.a("displayVersion");

        /* renamed from: k, reason: collision with root package name */
        public static final y8.c f10402k = y8.c.a("session");

        /* renamed from: l, reason: collision with root package name */
        public static final y8.c f10403l = y8.c.a("ndkPayload");

        /* renamed from: m, reason: collision with root package name */
        public static final y8.c f10404m = y8.c.a("appExitInfo");

        @Override // y8.a
        public final void a(Object obj, y8.e eVar) {
            f0 f0Var = (f0) obj;
            y8.e eVar2 = eVar;
            eVar2.e(f10394b, f0Var.k());
            eVar2.e(f10395c, f0Var.g());
            eVar2.c(f10396d, f0Var.j());
            eVar2.e(f10397e, f0Var.h());
            eVar2.e(f, f0Var.f());
            eVar2.e(f10398g, f0Var.e());
            eVar2.e(f10399h, f0Var.b());
            eVar2.e(f10400i, f0Var.c());
            eVar2.e(f10401j, f0Var.d());
            eVar2.e(f10402k, f0Var.l());
            eVar2.e(f10403l, f0Var.i());
            eVar2.e(f10404m, f0Var.a());
        }
    }

    public static final class e implements y8.d<f0.d> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f10405a = new e();

        /* renamed from: b, reason: collision with root package name */
        public static final y8.c f10406b = y8.c.a("files");

        /* renamed from: c, reason: collision with root package name */
        public static final y8.c f10407c = y8.c.a("orgId");

        @Override // y8.a
        public final void a(Object obj, y8.e eVar) {
            f0.d dVar = (f0.d) obj;
            y8.e eVar2 = eVar;
            eVar2.e(f10406b, dVar.a());
            eVar2.e(f10407c, dVar.b());
        }
    }

    public static final class f implements y8.d<f0.d.a> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f10408a = new f();

        /* renamed from: b, reason: collision with root package name */
        public static final y8.c f10409b = y8.c.a("filename");

        /* renamed from: c, reason: collision with root package name */
        public static final y8.c f10410c = y8.c.a("contents");

        @Override // y8.a
        public final void a(Object obj, y8.e eVar) {
            f0.d.a aVar = (f0.d.a) obj;
            y8.e eVar2 = eVar;
            eVar2.e(f10409b, aVar.b());
            eVar2.e(f10410c, aVar.a());
        }
    }

    public static final class g implements y8.d<f0.e.a> {

        /* renamed from: a, reason: collision with root package name */
        public static final g f10411a = new g();

        /* renamed from: b, reason: collision with root package name */
        public static final y8.c f10412b = y8.c.a(Constants.IDENTIFIER);

        /* renamed from: c, reason: collision with root package name */
        public static final y8.c f10413c = y8.c.a("version");

        /* renamed from: d, reason: collision with root package name */
        public static final y8.c f10414d = y8.c.a("displayVersion");

        /* renamed from: e, reason: collision with root package name */
        public static final y8.c f10415e = y8.c.a("organization");
        public static final y8.c f = y8.c.a("installationUuid");

        /* renamed from: g, reason: collision with root package name */
        public static final y8.c f10416g = y8.c.a("developmentPlatform");

        /* renamed from: h, reason: collision with root package name */
        public static final y8.c f10417h = y8.c.a("developmentPlatformVersion");

        @Override // y8.a
        public final void a(Object obj, y8.e eVar) {
            f0.e.a aVar = (f0.e.a) obj;
            y8.e eVar2 = eVar;
            eVar2.e(f10412b, aVar.d());
            eVar2.e(f10413c, aVar.g());
            eVar2.e(f10414d, aVar.c());
            eVar2.e(f10415e, aVar.f());
            eVar2.e(f, aVar.e());
            eVar2.e(f10416g, aVar.a());
            eVar2.e(f10417h, aVar.b());
        }
    }

    public static final class h implements y8.d<f0.e.a.AbstractC0151a> {

        /* renamed from: a, reason: collision with root package name */
        public static final h f10418a = new h();

        /* renamed from: b, reason: collision with root package name */
        public static final y8.c f10419b = y8.c.a("clsId");

        @Override // y8.a
        public final void a(Object obj, y8.e eVar) {
            y8.c cVar = f10419b;
            ((f0.e.a.AbstractC0151a) obj).a();
            eVar.e(cVar, null);
        }
    }

    public static final class i implements y8.d<f0.e.c> {

        /* renamed from: a, reason: collision with root package name */
        public static final i f10420a = new i();

        /* renamed from: b, reason: collision with root package name */
        public static final y8.c f10421b = y8.c.a("arch");

        /* renamed from: c, reason: collision with root package name */
        public static final y8.c f10422c = y8.c.a("model");

        /* renamed from: d, reason: collision with root package name */
        public static final y8.c f10423d = y8.c.a("cores");

        /* renamed from: e, reason: collision with root package name */
        public static final y8.c f10424e = y8.c.a("ram");
        public static final y8.c f = y8.c.a("diskSpace");

        /* renamed from: g, reason: collision with root package name */
        public static final y8.c f10425g = y8.c.a("simulator");

        /* renamed from: h, reason: collision with root package name */
        public static final y8.c f10426h = y8.c.a("state");

        /* renamed from: i, reason: collision with root package name */
        public static final y8.c f10427i = y8.c.a("manufacturer");

        /* renamed from: j, reason: collision with root package name */
        public static final y8.c f10428j = y8.c.a("modelClass");

        @Override // y8.a
        public final void a(Object obj, y8.e eVar) {
            f0.e.c cVar = (f0.e.c) obj;
            y8.e eVar2 = eVar;
            eVar2.c(f10421b, cVar.a());
            eVar2.e(f10422c, cVar.e());
            eVar2.c(f10423d, cVar.b());
            eVar2.d(f10424e, cVar.g());
            eVar2.d(f, cVar.c());
            eVar2.a(f10425g, cVar.i());
            eVar2.c(f10426h, cVar.h());
            eVar2.e(f10427i, cVar.d());
            eVar2.e(f10428j, cVar.f());
        }
    }

    public static final class j implements y8.d<f0.e> {

        /* renamed from: a, reason: collision with root package name */
        public static final j f10429a = new j();

        /* renamed from: b, reason: collision with root package name */
        public static final y8.c f10430b = y8.c.a("generator");

        /* renamed from: c, reason: collision with root package name */
        public static final y8.c f10431c = y8.c.a(Constants.IDENTIFIER);

        /* renamed from: d, reason: collision with root package name */
        public static final y8.c f10432d = y8.c.a("appQualitySessionId");

        /* renamed from: e, reason: collision with root package name */
        public static final y8.c f10433e = y8.c.a("startedAt");
        public static final y8.c f = y8.c.a("endedAt");

        /* renamed from: g, reason: collision with root package name */
        public static final y8.c f10434g = y8.c.a("crashed");

        /* renamed from: h, reason: collision with root package name */
        public static final y8.c f10435h = y8.c.a("app");

        /* renamed from: i, reason: collision with root package name */
        public static final y8.c f10436i = y8.c.a(io.flutter.plugins.firebase.auth.Constants.USER);

        /* renamed from: j, reason: collision with root package name */
        public static final y8.c f10437j = y8.c.a("os");

        /* renamed from: k, reason: collision with root package name */
        public static final y8.c f10438k = y8.c.a("device");

        /* renamed from: l, reason: collision with root package name */
        public static final y8.c f10439l = y8.c.a("events");

        /* renamed from: m, reason: collision with root package name */
        public static final y8.c f10440m = y8.c.a("generatorType");

        @Override // y8.a
        public final void a(Object obj, y8.e eVar) {
            f0.e eVar2 = (f0.e) obj;
            y8.e eVar3 = eVar;
            eVar3.e(f10430b, eVar2.f());
            eVar3.e(f10431c, eVar2.h().getBytes(f0.f10579a));
            eVar3.e(f10432d, eVar2.b());
            eVar3.d(f10433e, eVar2.j());
            eVar3.e(f, eVar2.d());
            eVar3.a(f10434g, eVar2.l());
            eVar3.e(f10435h, eVar2.a());
            eVar3.e(f10436i, eVar2.k());
            eVar3.e(f10437j, eVar2.i());
            eVar3.e(f10438k, eVar2.c());
            eVar3.e(f10439l, eVar2.e());
            eVar3.c(f10440m, eVar2.g());
        }
    }

    public static final class k implements y8.d<f0.e.d.a> {

        /* renamed from: a, reason: collision with root package name */
        public static final k f10441a = new k();

        /* renamed from: b, reason: collision with root package name */
        public static final y8.c f10442b = y8.c.a("execution");

        /* renamed from: c, reason: collision with root package name */
        public static final y8.c f10443c = y8.c.a("customAttributes");

        /* renamed from: d, reason: collision with root package name */
        public static final y8.c f10444d = y8.c.a("internalKeys");

        /* renamed from: e, reason: collision with root package name */
        public static final y8.c f10445e = y8.c.a("background");
        public static final y8.c f = y8.c.a("currentProcessDetails");

        /* renamed from: g, reason: collision with root package name */
        public static final y8.c f10446g = y8.c.a("appProcessDetails");

        /* renamed from: h, reason: collision with root package name */
        public static final y8.c f10447h = y8.c.a("uiOrientation");

        @Override // y8.a
        public final void a(Object obj, y8.e eVar) {
            f0.e.d.a aVar = (f0.e.d.a) obj;
            y8.e eVar2 = eVar;
            eVar2.e(f10442b, aVar.e());
            eVar2.e(f10443c, aVar.d());
            eVar2.e(f10444d, aVar.f());
            eVar2.e(f10445e, aVar.b());
            eVar2.e(f, aVar.c());
            eVar2.e(f10446g, aVar.a());
            eVar2.c(f10447h, aVar.g());
        }
    }

    public static final class l implements y8.d<f0.e.d.a.b.AbstractC0153a> {

        /* renamed from: a, reason: collision with root package name */
        public static final l f10448a = new l();

        /* renamed from: b, reason: collision with root package name */
        public static final y8.c f10449b = y8.c.a("baseAddress");

        /* renamed from: c, reason: collision with root package name */
        public static final y8.c f10450c = y8.c.a("size");

        /* renamed from: d, reason: collision with root package name */
        public static final y8.c f10451d = y8.c.a("name");

        /* renamed from: e, reason: collision with root package name */
        public static final y8.c f10452e = y8.c.a("uuid");

        @Override // y8.a
        public final void a(Object obj, y8.e eVar) {
            f0.e.d.a.b.AbstractC0153a abstractC0153a = (f0.e.d.a.b.AbstractC0153a) obj;
            y8.e eVar2 = eVar;
            eVar2.d(f10449b, abstractC0153a.a());
            eVar2.d(f10450c, abstractC0153a.c());
            eVar2.e(f10451d, abstractC0153a.b());
            y8.c cVar = f10452e;
            String d10 = abstractC0153a.d();
            eVar2.e(cVar, d10 != null ? d10.getBytes(f0.f10579a) : null);
        }
    }

    public static final class m implements y8.d<f0.e.d.a.b> {

        /* renamed from: a, reason: collision with root package name */
        public static final m f10453a = new m();

        /* renamed from: b, reason: collision with root package name */
        public static final y8.c f10454b = y8.c.a("threads");

        /* renamed from: c, reason: collision with root package name */
        public static final y8.c f10455c = y8.c.a(Constants.EXCEPTION);

        /* renamed from: d, reason: collision with root package name */
        public static final y8.c f10456d = y8.c.a("appExitInfo");

        /* renamed from: e, reason: collision with root package name */
        public static final y8.c f10457e = y8.c.a("signal");
        public static final y8.c f = y8.c.a("binaries");

        @Override // y8.a
        public final void a(Object obj, y8.e eVar) {
            f0.e.d.a.b bVar = (f0.e.d.a.b) obj;
            y8.e eVar2 = eVar;
            eVar2.e(f10454b, bVar.e());
            eVar2.e(f10455c, bVar.c());
            eVar2.e(f10456d, bVar.a());
            eVar2.e(f10457e, bVar.d());
            eVar2.e(f, bVar.b());
        }
    }

    public static final class n implements y8.d<f0.e.d.a.b.AbstractC0154b> {

        /* renamed from: a, reason: collision with root package name */
        public static final n f10458a = new n();

        /* renamed from: b, reason: collision with root package name */
        public static final y8.c f10459b = y8.c.a("type");

        /* renamed from: c, reason: collision with root package name */
        public static final y8.c f10460c = y8.c.a(Constants.REASON);

        /* renamed from: d, reason: collision with root package name */
        public static final y8.c f10461d = y8.c.a("frames");

        /* renamed from: e, reason: collision with root package name */
        public static final y8.c f10462e = y8.c.a("causedBy");
        public static final y8.c f = y8.c.a("overflowCount");

        @Override // y8.a
        public final void a(Object obj, y8.e eVar) {
            f0.e.d.a.b.AbstractC0154b abstractC0154b = (f0.e.d.a.b.AbstractC0154b) obj;
            y8.e eVar2 = eVar;
            eVar2.e(f10459b, abstractC0154b.e());
            eVar2.e(f10460c, abstractC0154b.d());
            eVar2.e(f10461d, abstractC0154b.b());
            eVar2.e(f10462e, abstractC0154b.a());
            eVar2.c(f, abstractC0154b.c());
        }
    }

    public static final class o implements y8.d<f0.e.d.a.b.c> {

        /* renamed from: a, reason: collision with root package name */
        public static final o f10463a = new o();

        /* renamed from: b, reason: collision with root package name */
        public static final y8.c f10464b = y8.c.a("name");

        /* renamed from: c, reason: collision with root package name */
        public static final y8.c f10465c = y8.c.a("code");

        /* renamed from: d, reason: collision with root package name */
        public static final y8.c f10466d = y8.c.a("address");

        @Override // y8.a
        public final void a(Object obj, y8.e eVar) {
            f0.e.d.a.b.c cVar = (f0.e.d.a.b.c) obj;
            y8.e eVar2 = eVar;
            eVar2.e(f10464b, cVar.c());
            eVar2.e(f10465c, cVar.b());
            eVar2.d(f10466d, cVar.a());
        }
    }

    public static final class p implements y8.d<f0.e.d.a.b.AbstractC0155d> {

        /* renamed from: a, reason: collision with root package name */
        public static final p f10467a = new p();

        /* renamed from: b, reason: collision with root package name */
        public static final y8.c f10468b = y8.c.a("name");

        /* renamed from: c, reason: collision with root package name */
        public static final y8.c f10469c = y8.c.a("importance");

        /* renamed from: d, reason: collision with root package name */
        public static final y8.c f10470d = y8.c.a("frames");

        @Override // y8.a
        public final void a(Object obj, y8.e eVar) {
            f0.e.d.a.b.AbstractC0155d abstractC0155d = (f0.e.d.a.b.AbstractC0155d) obj;
            y8.e eVar2 = eVar;
            eVar2.e(f10468b, abstractC0155d.c());
            eVar2.c(f10469c, abstractC0155d.b());
            eVar2.e(f10470d, abstractC0155d.a());
        }
    }

    public static final class q implements y8.d<f0.e.d.a.b.AbstractC0155d.AbstractC0156a> {

        /* renamed from: a, reason: collision with root package name */
        public static final q f10471a = new q();

        /* renamed from: b, reason: collision with root package name */
        public static final y8.c f10472b = y8.c.a("pc");

        /* renamed from: c, reason: collision with root package name */
        public static final y8.c f10473c = y8.c.a("symbol");

        /* renamed from: d, reason: collision with root package name */
        public static final y8.c f10474d = y8.c.a(Constants.FILE);

        /* renamed from: e, reason: collision with root package name */
        public static final y8.c f10475e = y8.c.a("offset");
        public static final y8.c f = y8.c.a("importance");

        @Override // y8.a
        public final void a(Object obj, y8.e eVar) {
            f0.e.d.a.b.AbstractC0155d.AbstractC0156a abstractC0156a = (f0.e.d.a.b.AbstractC0155d.AbstractC0156a) obj;
            y8.e eVar2 = eVar;
            eVar2.d(f10472b, abstractC0156a.d());
            eVar2.e(f10473c, abstractC0156a.e());
            eVar2.e(f10474d, abstractC0156a.a());
            eVar2.d(f10475e, abstractC0156a.c());
            eVar2.c(f, abstractC0156a.b());
        }
    }

    public static final class r implements y8.d<f0.e.d.a.c> {

        /* renamed from: a, reason: collision with root package name */
        public static final r f10476a = new r();

        /* renamed from: b, reason: collision with root package name */
        public static final y8.c f10477b = y8.c.a("processName");

        /* renamed from: c, reason: collision with root package name */
        public static final y8.c f10478c = y8.c.a("pid");

        /* renamed from: d, reason: collision with root package name */
        public static final y8.c f10479d = y8.c.a("importance");

        /* renamed from: e, reason: collision with root package name */
        public static final y8.c f10480e = y8.c.a("defaultProcess");

        @Override // y8.a
        public final void a(Object obj, y8.e eVar) {
            f0.e.d.a.c cVar = (f0.e.d.a.c) obj;
            y8.e eVar2 = eVar;
            eVar2.e(f10477b, cVar.c());
            eVar2.c(f10478c, cVar.b());
            eVar2.c(f10479d, cVar.a());
            eVar2.a(f10480e, cVar.d());
        }
    }

    public static final class s implements y8.d<f0.e.d.c> {

        /* renamed from: a, reason: collision with root package name */
        public static final s f10481a = new s();

        /* renamed from: b, reason: collision with root package name */
        public static final y8.c f10482b = y8.c.a("batteryLevel");

        /* renamed from: c, reason: collision with root package name */
        public static final y8.c f10483c = y8.c.a("batteryVelocity");

        /* renamed from: d, reason: collision with root package name */
        public static final y8.c f10484d = y8.c.a("proximityOn");

        /* renamed from: e, reason: collision with root package name */
        public static final y8.c f10485e = y8.c.a("orientation");
        public static final y8.c f = y8.c.a("ramUsed");

        /* renamed from: g, reason: collision with root package name */
        public static final y8.c f10486g = y8.c.a("diskUsed");

        @Override // y8.a
        public final void a(Object obj, y8.e eVar) {
            f0.e.d.c cVar = (f0.e.d.c) obj;
            y8.e eVar2 = eVar;
            eVar2.e(f10482b, cVar.a());
            eVar2.c(f10483c, cVar.b());
            eVar2.a(f10484d, cVar.f());
            eVar2.c(f10485e, cVar.d());
            eVar2.d(f, cVar.e());
            eVar2.d(f10486g, cVar.c());
        }
    }

    public static final class t implements y8.d<f0.e.d> {

        /* renamed from: a, reason: collision with root package name */
        public static final t f10487a = new t();

        /* renamed from: b, reason: collision with root package name */
        public static final y8.c f10488b = y8.c.a(Constants.TIMESTAMP);

        /* renamed from: c, reason: collision with root package name */
        public static final y8.c f10489c = y8.c.a("type");

        /* renamed from: d, reason: collision with root package name */
        public static final y8.c f10490d = y8.c.a("app");

        /* renamed from: e, reason: collision with root package name */
        public static final y8.c f10491e = y8.c.a("device");
        public static final y8.c f = y8.c.a("log");

        /* renamed from: g, reason: collision with root package name */
        public static final y8.c f10492g = y8.c.a("rollouts");

        @Override // y8.a
        public final void a(Object obj, y8.e eVar) {
            f0.e.d dVar = (f0.e.d) obj;
            y8.e eVar2 = eVar;
            eVar2.d(f10488b, dVar.e());
            eVar2.e(f10489c, dVar.f());
            eVar2.e(f10490d, dVar.a());
            eVar2.e(f10491e, dVar.b());
            eVar2.e(f, dVar.c());
            eVar2.e(f10492g, dVar.d());
        }
    }

    public static final class u implements y8.d<f0.e.d.AbstractC0159d> {

        /* renamed from: a, reason: collision with root package name */
        public static final u f10493a = new u();

        /* renamed from: b, reason: collision with root package name */
        public static final y8.c f10494b = y8.c.a("content");

        @Override // y8.a
        public final void a(Object obj, y8.e eVar) {
            eVar.e(f10494b, ((f0.e.d.AbstractC0159d) obj).a());
        }
    }

    public static final class v implements y8.d<f0.e.d.AbstractC0160e> {

        /* renamed from: a, reason: collision with root package name */
        public static final v f10495a = new v();

        /* renamed from: b, reason: collision with root package name */
        public static final y8.c f10496b = y8.c.a("rolloutVariant");

        /* renamed from: c, reason: collision with root package name */
        public static final y8.c f10497c = y8.c.a("parameterKey");

        /* renamed from: d, reason: collision with root package name */
        public static final y8.c f10498d = y8.c.a("parameterValue");

        /* renamed from: e, reason: collision with root package name */
        public static final y8.c f10499e = y8.c.a("templateVersion");

        @Override // y8.a
        public final void a(Object obj, y8.e eVar) {
            f0.e.d.AbstractC0160e abstractC0160e = (f0.e.d.AbstractC0160e) obj;
            y8.e eVar2 = eVar;
            eVar2.e(f10496b, abstractC0160e.c());
            eVar2.e(f10497c, abstractC0160e.a());
            eVar2.e(f10498d, abstractC0160e.b());
            eVar2.d(f10499e, abstractC0160e.d());
        }
    }

    public static final class w implements y8.d<f0.e.d.AbstractC0160e.b> {

        /* renamed from: a, reason: collision with root package name */
        public static final w f10500a = new w();

        /* renamed from: b, reason: collision with root package name */
        public static final y8.c f10501b = y8.c.a("rolloutId");

        /* renamed from: c, reason: collision with root package name */
        public static final y8.c f10502c = y8.c.a("variantId");

        @Override // y8.a
        public final void a(Object obj, y8.e eVar) {
            f0.e.d.AbstractC0160e.b bVar = (f0.e.d.AbstractC0160e.b) obj;
            y8.e eVar2 = eVar;
            eVar2.e(f10501b, bVar.a());
            eVar2.e(f10502c, bVar.b());
        }
    }

    public static final class x implements y8.d<f0.e.d.f> {

        /* renamed from: a, reason: collision with root package name */
        public static final x f10503a = new x();

        /* renamed from: b, reason: collision with root package name */
        public static final y8.c f10504b = y8.c.a("assignments");

        @Override // y8.a
        public final void a(Object obj, y8.e eVar) {
            eVar.e(f10504b, ((f0.e.d.f) obj).a());
        }
    }

    public static final class y implements y8.d<f0.e.AbstractC0161e> {

        /* renamed from: a, reason: collision with root package name */
        public static final y f10505a = new y();

        /* renamed from: b, reason: collision with root package name */
        public static final y8.c f10506b = y8.c.a("platform");

        /* renamed from: c, reason: collision with root package name */
        public static final y8.c f10507c = y8.c.a("version");

        /* renamed from: d, reason: collision with root package name */
        public static final y8.c f10508d = y8.c.a("buildVersion");

        /* renamed from: e, reason: collision with root package name */
        public static final y8.c f10509e = y8.c.a("jailbroken");

        @Override // y8.a
        public final void a(Object obj, y8.e eVar) {
            f0.e.AbstractC0161e abstractC0161e = (f0.e.AbstractC0161e) obj;
            y8.e eVar2 = eVar;
            eVar2.c(f10506b, abstractC0161e.b());
            eVar2.e(f10507c, abstractC0161e.c());
            eVar2.e(f10508d, abstractC0161e.a());
            eVar2.a(f10509e, abstractC0161e.d());
        }
    }

    public static final class z implements y8.d<f0.e.f> {

        /* renamed from: a, reason: collision with root package name */
        public static final z f10510a = new z();

        /* renamed from: b, reason: collision with root package name */
        public static final y8.c f10511b = y8.c.a(Constants.IDENTIFIER);

        @Override // y8.a
        public final void a(Object obj, y8.e eVar) {
            eVar.e(f10511b, ((f0.e.f) obj).a());
        }
    }

    public final void a(z8.a<?> aVar) {
        d dVar = d.f10393a;
        a9.e eVar = (a9.e) aVar;
        eVar.a(f0.class, dVar);
        eVar.a(m8.b.class, dVar);
        j jVar = j.f10429a;
        eVar.a(f0.e.class, jVar);
        eVar.a(m8.h.class, jVar);
        g gVar = g.f10411a;
        eVar.a(f0.e.a.class, gVar);
        eVar.a(m8.i.class, gVar);
        h hVar = h.f10418a;
        eVar.a(f0.e.a.AbstractC0151a.class, hVar);
        eVar.a(m8.j.class, hVar);
        z zVar = z.f10510a;
        eVar.a(f0.e.f.class, zVar);
        eVar.a(a0.class, zVar);
        y yVar = y.f10505a;
        eVar.a(f0.e.AbstractC0161e.class, yVar);
        eVar.a(m8.z.class, yVar);
        i iVar = i.f10420a;
        eVar.a(f0.e.c.class, iVar);
        eVar.a(m8.k.class, iVar);
        t tVar = t.f10487a;
        eVar.a(f0.e.d.class, tVar);
        eVar.a(m8.l.class, tVar);
        k kVar = k.f10441a;
        eVar.a(f0.e.d.a.class, kVar);
        eVar.a(m8.m.class, kVar);
        m mVar = m.f10453a;
        eVar.a(f0.e.d.a.b.class, mVar);
        eVar.a(m8.n.class, mVar);
        p pVar = p.f10467a;
        eVar.a(f0.e.d.a.b.AbstractC0155d.class, pVar);
        eVar.a(m8.r.class, pVar);
        q qVar = q.f10471a;
        eVar.a(f0.e.d.a.b.AbstractC0155d.AbstractC0156a.class, qVar);
        eVar.a(m8.s.class, qVar);
        n nVar = n.f10458a;
        eVar.a(f0.e.d.a.b.AbstractC0154b.class, nVar);
        eVar.a(m8.p.class, nVar);
        b bVar = b.f10381a;
        eVar.a(f0.a.class, bVar);
        eVar.a(m8.c.class, bVar);
        C0149a c0149a = C0149a.f10377a;
        eVar.a(f0.a.AbstractC0150a.class, c0149a);
        eVar.a(m8.d.class, c0149a);
        o oVar = o.f10463a;
        eVar.a(f0.e.d.a.b.c.class, oVar);
        eVar.a(m8.q.class, oVar);
        l lVar = l.f10448a;
        eVar.a(f0.e.d.a.b.AbstractC0153a.class, lVar);
        eVar.a(m8.o.class, lVar);
        c cVar = c.f10390a;
        eVar.a(f0.c.class, cVar);
        eVar.a(m8.e.class, cVar);
        r rVar = r.f10476a;
        eVar.a(f0.e.d.a.c.class, rVar);
        eVar.a(m8.t.class, rVar);
        s sVar = s.f10481a;
        eVar.a(f0.e.d.c.class, sVar);
        eVar.a(m8.u.class, sVar);
        u uVar = u.f10493a;
        eVar.a(f0.e.d.AbstractC0159d.class, uVar);
        eVar.a(m8.v.class, uVar);
        x xVar = x.f10503a;
        eVar.a(f0.e.d.f.class, xVar);
        eVar.a(m8.y.class, xVar);
        v vVar = v.f10495a;
        eVar.a(f0.e.d.AbstractC0160e.class, vVar);
        eVar.a(m8.w.class, vVar);
        w wVar = w.f10500a;
        eVar.a(f0.e.d.AbstractC0160e.b.class, wVar);
        eVar.a(m8.x.class, wVar);
        e eVar2 = e.f10405a;
        eVar.a(f0.d.class, eVar2);
        eVar.a(m8.f.class, eVar2);
        f fVar = f.f10408a;
        eVar.a(f0.d.a.class, fVar);
        eVar.a(m8.g.class, fVar);
    }
}
