package E4;

import q5.AbstractC1906b;
import r4.InterfaceC1922b;

/* loaded from: classes.dex */
public final class h implements U5.a {

    /* renamed from: a, reason: collision with root package name */
    public final a f1645a;

    public h(a aVar) {
        this.f1645a = aVar;
    }

    public static h a(a aVar) {
        return new h(aVar);
    }

    public static InterfaceC1922b c(a aVar) {
        return (InterfaceC1922b) AbstractC1906b.c(aVar.g(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // U5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC1922b get() {
        return c(this.f1645a);
    }
}
