package l8;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final a f9764c = new a();

    /* renamed from: a, reason: collision with root package name */
    public final p8.e f9765a;

    /* renamed from: b, reason: collision with root package name */
    public d f9766b;

    public static final class a implements d {
        @Override // l8.d
        public final void a() {
        }

        @Override // l8.d
        public final String b() {
            return null;
        }

        @Override // l8.d
        public final void c(String str, long j10) {
        }
    }

    public f(p8.e eVar) {
        this.f9765a = eVar;
        this.f9766b = f9764c;
    }

    public f(p8.e eVar, String str) {
        this(eVar);
        a(str);
    }

    public final void a(String str) {
        this.f9766b.a();
        this.f9766b = f9764c;
        if (str == null) {
            return;
        }
        this.f9766b = new j(this.f9765a.b(str, "userlog"));
    }
}
