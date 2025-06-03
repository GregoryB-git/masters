package i2;

/* loaded from: classes.dex */
public interface b extends i2.a {

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f7358b = new a("NONE");

        /* renamed from: c, reason: collision with root package name */
        public static final a f7359c = new a("FULL");

        /* renamed from: a, reason: collision with root package name */
        public final String f7360a;

        public a(String str) {
            this.f7360a = str;
        }

        public final String toString() {
            return this.f7360a;
        }
    }

    /* renamed from: i2.b$b, reason: collision with other inner class name */
    public static final class C0108b {

        /* renamed from: b, reason: collision with root package name */
        public static final C0108b f7361b = new C0108b("FLAT");

        /* renamed from: c, reason: collision with root package name */
        public static final C0108b f7362c = new C0108b("HALF_OPENED");

        /* renamed from: a, reason: collision with root package name */
        public final String f7363a;

        public C0108b(String str) {
            this.f7363a = str;
        }

        public final String toString() {
            return this.f7363a;
        }
    }

    a a();

    C0108b e();
}
