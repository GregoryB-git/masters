package X5;

import X5.g;
import g6.p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class a implements g.b {

    /* renamed from: o, reason: collision with root package name */
    public final g.c f7280o;

    public a(g.c key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f7280o = key;
    }

    @Override // X5.g.b, X5.g
    public g.b b(g.c cVar) {
        return g.b.a.b(this, cVar);
    }

    @Override // X5.g.b
    public g.c getKey() {
        return this.f7280o;
    }

    @Override // X5.g
    public g k(g gVar) {
        return g.b.a.d(this, gVar);
    }

    @Override // X5.g
    public Object u(Object obj, p pVar) {
        return g.b.a.a(this, obj, pVar);
    }

    @Override // X5.g
    public g x(g.c cVar) {
        return g.b.a.c(this, cVar);
    }
}
