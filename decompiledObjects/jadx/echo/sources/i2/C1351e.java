package i2;

/* renamed from: i2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1351e {

    /* renamed from: c, reason: collision with root package name */
    public static final C1351e f14847c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    public final long f14848a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14849b;

    /* renamed from: i2.e$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f14850a = 0;

        /* renamed from: b, reason: collision with root package name */
        public long f14851b = 0;

        public C1351e a() {
            return new C1351e(this.f14850a, this.f14851b);
        }

        public a b(long j7) {
            this.f14850a = j7;
            return this;
        }

        public a c(long j7) {
            this.f14851b = j7;
            return this;
        }
    }

    public C1351e(long j7, long j8) {
        this.f14848a = j7;
        this.f14849b = j8;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f14848a;
    }

    public long b() {
        return this.f14849b;
    }
}
