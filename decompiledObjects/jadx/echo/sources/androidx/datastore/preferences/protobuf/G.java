package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class G implements f0 {

    /* renamed from: b, reason: collision with root package name */
    public static final N f8894b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final N f8895a;

    public static class a implements N {
        @Override // androidx.datastore.preferences.protobuf.N
        public M a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.datastore.preferences.protobuf.N
        public boolean b(Class cls) {
            return false;
        }
    }

    public static class b implements N {

        /* renamed from: a, reason: collision with root package name */
        public N[] f8896a;

        public b(N... nArr) {
            this.f8896a = nArr;
        }

        @Override // androidx.datastore.preferences.protobuf.N
        public M a(Class cls) {
            for (N n7 : this.f8896a) {
                if (n7.b(cls)) {
                    return n7.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // androidx.datastore.preferences.protobuf.N
        public boolean b(Class cls) {
            for (N n7 : this.f8896a) {
                if (n7.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public G() {
        this(b());
    }

    public static N b() {
        return new b(C0774v.c(), c());
    }

    public static N c() {
        try {
            return (N) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f8894b;
        }
    }

    public static boolean d(M m7) {
        return m7.b() == Z.PROTO2;
    }

    public static e0 e(Class cls, M m7) {
        return AbstractC0775w.class.isAssignableFrom(cls) ? d(m7) ? S.M(cls, m7, W.b(), E.b(), g0.L(), r.b(), L.b()) : S.M(cls, m7, W.b(), E.b(), g0.L(), null, L.b()) : d(m7) ? S.M(cls, m7, W.a(), E.a(), g0.G(), r.a(), L.a()) : S.M(cls, m7, W.a(), E.a(), g0.H(), null, L.a());
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public e0 a(Class cls) {
        l0 G6;
        AbstractC0769p a7;
        g0.I(cls);
        M a8 = this.f8895a.a(cls);
        if (!a8.a()) {
            return e(cls, a8);
        }
        if (AbstractC0775w.class.isAssignableFrom(cls)) {
            G6 = g0.L();
            a7 = r.b();
        } else {
            G6 = g0.G();
            a7 = r.a();
        }
        return T.l(G6, a7, a8.c());
    }

    public G(N n7) {
        this.f8895a = (N) AbstractC0777y.b(n7, "messageInfoFactory");
    }
}
