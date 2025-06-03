package p2;

import h2.InterfaceC1333b;

/* loaded from: classes.dex */
public final class c implements InterfaceC1333b {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f18354a = new c();
    }

    public static c a() {
        return a.f18354a;
    }

    public static InterfaceC1791a b() {
        return (InterfaceC1791a) h2.d.c(b.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // U5.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC1791a get() {
        return b();
    }
}
