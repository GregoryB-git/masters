package l8;

/* loaded from: classes.dex */
public final class a implements y8.d<k> {

    /* renamed from: a, reason: collision with root package name */
    public static final a f9749a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final y8.c f9750b = y8.c.a("rolloutId");

    /* renamed from: c, reason: collision with root package name */
    public static final y8.c f9751c = y8.c.a("parameterKey");

    /* renamed from: d, reason: collision with root package name */
    public static final y8.c f9752d = y8.c.a("parameterValue");

    /* renamed from: e, reason: collision with root package name */
    public static final y8.c f9753e = y8.c.a("variantId");
    public static final y8.c f = y8.c.a("templateVersion");

    @Override // y8.a
    public final void a(Object obj, y8.e eVar) {
        k kVar = (k) obj;
        y8.e eVar2 = eVar;
        eVar2.e(f9750b, kVar.d());
        eVar2.e(f9751c, kVar.b());
        eVar2.e(f9752d, kVar.c());
        eVar2.e(f9753e, kVar.f());
        eVar2.d(f, kVar.e());
    }
}
