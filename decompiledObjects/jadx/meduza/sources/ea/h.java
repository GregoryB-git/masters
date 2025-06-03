package ea;

/* loaded from: classes.dex */
public final class h implements y8.d<f0> {

    /* renamed from: a, reason: collision with root package name */
    public static final h f4922a = new h();

    /* renamed from: b, reason: collision with root package name */
    public static final y8.c f4923b = y8.c.a("sessionId");

    /* renamed from: c, reason: collision with root package name */
    public static final y8.c f4924c = y8.c.a("firstSessionId");

    /* renamed from: d, reason: collision with root package name */
    public static final y8.c f4925d = y8.c.a("sessionIndex");

    /* renamed from: e, reason: collision with root package name */
    public static final y8.c f4926e = y8.c.a("eventTimestampUs");
    public static final y8.c f = y8.c.a("dataCollectionStatus");

    /* renamed from: g, reason: collision with root package name */
    public static final y8.c f4927g = y8.c.a("firebaseInstallationId");

    /* renamed from: h, reason: collision with root package name */
    public static final y8.c f4928h = y8.c.a("firebaseAuthenticationToken");

    @Override // y8.a
    public final void a(Object obj, y8.e eVar) {
        f0 f0Var = (f0) obj;
        y8.e eVar2 = eVar;
        eVar2.e(f4923b, f0Var.f4910a);
        eVar2.e(f4924c, f0Var.f4911b);
        eVar2.c(f4925d, f0Var.f4912c);
        eVar2.d(f4926e, f0Var.f4913d);
        eVar2.e(f, f0Var.f4914e);
        eVar2.e(f4927g, f0Var.f);
        eVar2.e(f4928h, f0Var.f4915g);
    }
}
