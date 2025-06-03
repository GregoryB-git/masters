package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.v4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1048v4 implements InterfaceC0870b5 {

    /* renamed from: b, reason: collision with root package name */
    public static final J4 f11194b = new C1083z4();

    /* renamed from: a, reason: collision with root package name */
    public final J4 f11195a;

    public C1048v4() {
        this(new B4(Z3.c(), b()));
    }

    public static J4 b() {
        try {
            return (J4) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f11194b;
        }
    }

    public static boolean c(G4 g42) {
        return AbstractC1066x4.f11214a[g42.b().ordinal()] != 1;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0870b5
    public final Z4 a(Class cls) {
        AbstractC0861a5.o(cls);
        G4 a7 = this.f11195a.a(cls);
        if (a7.c()) {
            return Y3.class.isAssignableFrom(cls) ? O4.j(AbstractC0861a5.u(), P3.b(), a7.a()) : O4.j(AbstractC0861a5.f(), P3.a(), a7.a());
        }
        if (Y3.class.isAssignableFrom(cls)) {
            boolean c7 = c(a7);
            P4 b7 = Q4.b();
            AbstractC1004q4 c8 = AbstractC1004q4.c();
            AbstractC1067x5 u7 = AbstractC0861a5.u();
            return c7 ? M4.n(cls, a7, b7, c8, u7, P3.b(), H4.b()) : M4.n(cls, a7, b7, c8, u7, null, H4.b());
        }
        boolean c9 = c(a7);
        P4 a8 = Q4.a();
        AbstractC1004q4 a9 = AbstractC1004q4.a();
        AbstractC1067x5 f7 = AbstractC0861a5.f();
        return c9 ? M4.n(cls, a7, a8, a9, f7, P3.a(), H4.a()) : M4.n(cls, a7, a8, a9, f7, null, H4.a());
    }

    public C1048v4(J4 j42) {
        this.f11195a = (J4) AbstractC0860a4.f(j42, "messageInfoFactory");
    }
}
