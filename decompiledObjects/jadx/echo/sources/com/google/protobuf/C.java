package com.google.protobuf;

/* loaded from: classes.dex */
public final class C implements a0 {

    /* renamed from: b, reason: collision with root package name */
    public static final J f11963b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final J f11964a;

    public class a implements J {
        @Override // com.google.protobuf.J
        public I a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.protobuf.J
        public boolean b(Class cls) {
            return false;
        }
    }

    public static class b implements J {

        /* renamed from: a, reason: collision with root package name */
        public J[] f11965a;

        public b(J... jArr) {
            this.f11965a = jArr;
        }

        @Override // com.google.protobuf.J
        public I a(Class cls) {
            for (J j7 : this.f11965a) {
                if (j7.b(cls)) {
                    return j7.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.google.protobuf.J
        public boolean b(Class cls) {
            for (J j7 : this.f11965a) {
                if (j7.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C() {
        this(b());
    }

    public static J b() {
        return new b(C1152q.c(), c());
    }

    public static J c() {
        try {
            return (J) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f11963b;
        }
    }

    public static boolean d(I i7) {
        return i7.b() == V.PROTO2;
    }

    public static Z e(Class cls, I i7) {
        return r.class.isAssignableFrom(cls) ? d(i7) ? N.I(cls, i7, S.b(), A.b(), b0.J(), AbstractC1149n.b(), H.b()) : N.I(cls, i7, S.b(), A.b(), b0.J(), null, H.b()) : d(i7) ? N.I(cls, i7, S.a(), A.a(), b0.F(), AbstractC1149n.a(), H.a()) : N.I(cls, i7, S.a(), A.a(), b0.G(), null, H.a());
    }

    @Override // com.google.protobuf.a0
    public Z a(Class cls) {
        g0 F6;
        AbstractC1147l a7;
        b0.H(cls);
        I a8 = this.f11964a.a(cls);
        if (!a8.a()) {
            return e(cls, a8);
        }
        if (r.class.isAssignableFrom(cls)) {
            F6 = b0.J();
            a7 = AbstractC1149n.b();
        } else {
            F6 = b0.F();
            a7 = AbstractC1149n.a();
        }
        return O.j(F6, a7, a8.c());
    }

    public C(J j7) {
        this.f11964a = (J) AbstractC1154t.b(j7, "messageInfoFactory");
    }
}
