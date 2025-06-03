package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
public final class G implements f0 {

    /* renamed from: b, reason: collision with root package name */
    public static final N f11278b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final N f11279a;

    public class a implements N {
        @Override // com.google.crypto.tink.shaded.protobuf.N
        public M a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.N
        public boolean b(Class cls) {
            return false;
        }
    }

    public static class b implements N {

        /* renamed from: a, reason: collision with root package name */
        public N[] f11280a;

        public b(N... nArr) {
            this.f11280a = nArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.N
        public M a(Class cls) {
            for (N n7 : this.f11280a) {
                if (n7.b(cls)) {
                    return n7.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.N
        public boolean b(Class cls) {
            for (N n7 : this.f11280a) {
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
        return new b(C1107w.c(), c());
    }

    public static N c() {
        try {
            return (N) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f11278b;
        }
    }

    public static boolean d(M m7) {
        return m7.b() == Z.PROTO2;
    }

    public static e0 e(Class cls, M m7) {
        return AbstractC1108x.class.isAssignableFrom(cls) ? d(m7) ? S.T(cls, m7, W.b(), E.b(), g0.L(), AbstractC1103s.b(), L.b()) : S.T(cls, m7, W.b(), E.b(), g0.L(), null, L.b()) : d(m7) ? S.T(cls, m7, W.a(), E.a(), g0.G(), AbstractC1103s.a(), L.a()) : S.T(cls, m7, W.a(), E.a(), g0.H(), null, L.a());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public e0 a(Class cls) {
        k0 G6;
        AbstractC1102q a7;
        g0.I(cls);
        M a8 = this.f11279a.a(cls);
        if (!a8.a()) {
            return e(cls, a8);
        }
        if (AbstractC1108x.class.isAssignableFrom(cls)) {
            G6 = g0.L();
            a7 = AbstractC1103s.b();
        } else {
            G6 = g0.G();
            a7 = AbstractC1103s.a();
        }
        return T.m(G6, a7, a8.c());
    }

    public G(N n7) {
        this.f11279a = (N) AbstractC1110z.b(n7, "messageInfoFactory");
    }
}
