package E4;

import q5.AbstractC1906b;

/* loaded from: classes.dex */
public final class b implements U5.a {

    /* renamed from: a, reason: collision with root package name */
    public final a f1639a;

    public b(a aVar) {
        this.f1639a = aVar;
    }

    public static b a(a aVar) {
        return new b(aVar);
    }

    public static C4.a c(a aVar) {
        return (C4.a) AbstractC1906b.c(aVar.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // U5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4.a get() {
        return c(this.f1639a);
    }
}
