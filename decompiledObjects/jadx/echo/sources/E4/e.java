package E4;

import q5.AbstractC1906b;
import r4.InterfaceC1922b;

/* loaded from: classes.dex */
public final class e implements U5.a {

    /* renamed from: a, reason: collision with root package name */
    public final a f1642a;

    public e(a aVar) {
        this.f1642a = aVar;
    }

    public static e a(a aVar) {
        return new e(aVar);
    }

    public static InterfaceC1922b c(a aVar) {
        return (InterfaceC1922b) AbstractC1906b.c(aVar.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // U5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC1922b get() {
        return c(this.f1642a);
    }
}
