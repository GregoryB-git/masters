package nc;

import ub.h;

/* loaded from: classes.dex */
public final class h2 implements h.b, h.c<h2> {

    /* renamed from: a, reason: collision with root package name */
    public static final h2 f11505a = new h2();

    @Override // ub.h.b, ub.h
    public final <R> R fold(R r10, dc.p<? super R, ? super h.b, ? extends R> pVar) {
        ec.i.e(pVar, "operation");
        return pVar.invoke(r10, this);
    }

    @Override // ub.h.b, ub.h
    public final <E extends h.b> E get(h.c<E> cVar) {
        return (E) h.b.a.a(this, cVar);
    }

    @Override // ub.h.b
    public final h.c<?> getKey() {
        return this;
    }

    @Override // ub.h.b, ub.h
    public final ub.h minusKey(h.c<?> cVar) {
        return h.b.a.b(this, cVar);
    }

    @Override // ub.h
    public final ub.h plus(ub.h hVar) {
        ec.i.e(hVar, "context");
        return h.a.a(this, hVar);
    }
}
