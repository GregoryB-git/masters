package n2;

import h2.InterfaceC1333b;

/* renamed from: n2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1710g implements InterfaceC1333b {

    /* renamed from: n2.g$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1710g f17918a = new C1710g();
    }

    public static C1710g a() {
        return a.f17918a;
    }

    public static String b() {
        return (String) h2.d.c(AbstractC1709f.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // U5.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return b();
    }
}
