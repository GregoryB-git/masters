package n2;

import h2.InterfaceC1333b;

/* renamed from: n2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1713j implements InterfaceC1333b {

    /* renamed from: n2.j$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1713j f17921a = new C1713j();
    }

    public static C1713j a() {
        return a.f17921a;
    }

    public static AbstractC1708e c() {
        return (AbstractC1708e) h2.d.c(AbstractC1709f.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // U5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC1708e get() {
        return c();
    }
}
