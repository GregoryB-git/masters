package E4;

import q5.AbstractC1906b;
import s4.i;

/* loaded from: classes.dex */
public final class d implements U5.a {

    /* renamed from: a, reason: collision with root package name */
    public final a f1641a;

    public d(a aVar) {
        this.f1641a = aVar;
    }

    public static d a(a aVar) {
        return new d(aVar);
    }

    public static i c(a aVar) {
        return (i) AbstractC1906b.c(aVar.c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // U5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f1641a);
    }
}
