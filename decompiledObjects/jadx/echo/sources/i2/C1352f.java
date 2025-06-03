package i2;

/* renamed from: i2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1352f {

    /* renamed from: c, reason: collision with root package name */
    public static final C1352f f14852c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    public final long f14853a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14854b;

    /* renamed from: i2.f$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f14855a = 0;

        /* renamed from: b, reason: collision with root package name */
        public long f14856b = 0;

        public C1352f a() {
            return new C1352f(this.f14855a, this.f14856b);
        }

        public a b(long j7) {
            this.f14856b = j7;
            return this;
        }

        public a c(long j7) {
            this.f14855a = j7;
            return this;
        }
    }

    public C1352f(long j7, long j8) {
        this.f14853a = j7;
        this.f14854b = j8;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f14854b;
    }

    public long b() {
        return this.f14853a;
    }
}
