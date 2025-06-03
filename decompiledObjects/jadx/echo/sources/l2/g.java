package l2;

import h2.InterfaceC1333b;
import p2.InterfaceC1791a;

/* loaded from: classes.dex */
public final class g implements InterfaceC1333b {

    /* renamed from: a, reason: collision with root package name */
    public final U5.a f17155a;

    public g(U5.a aVar) {
        this.f17155a = aVar;
    }

    public static m2.f a(InterfaceC1791a interfaceC1791a) {
        return (m2.f) h2.d.c(AbstractC1603f.a(interfaceC1791a), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g b(U5.a aVar) {
        return new g(aVar);
    }

    @Override // U5.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public m2.f get() {
        return a((InterfaceC1791a) this.f17155a.get());
    }
}
