package E4;

import q5.AbstractC1906b;
import s3.C1947e;

/* loaded from: classes.dex */
public final class c implements U5.a {

    /* renamed from: a, reason: collision with root package name */
    public final a f1640a;

    public c(a aVar) {
        this.f1640a = aVar;
    }

    public static c a(a aVar) {
        return new c(aVar);
    }

    public static C1947e c(a aVar) {
        return (C1947e) AbstractC1906b.c(aVar.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // U5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1947e get() {
        return c(this.f1640a);
    }
}
