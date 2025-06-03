package p2;

import h2.InterfaceC1333b;

/* loaded from: classes.dex */
public final class d implements InterfaceC1333b {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f18355a = new d();
    }

    public static d a() {
        return a.f18355a;
    }

    public static InterfaceC1791a c() {
        return (InterfaceC1791a) h2.d.c(b.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // U5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC1791a get() {
        return c();
    }
}
