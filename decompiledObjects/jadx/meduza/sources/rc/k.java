package rc;

import ub.h;

/* loaded from: classes.dex */
public final class k implements ub.h {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f13889a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ub.h f13890b;

    public k(ub.h hVar, Throwable th) {
        this.f13889a = th;
        this.f13890b = hVar;
    }

    @Override // ub.h
    public final <R> R fold(R r10, dc.p<? super R, ? super h.b, ? extends R> pVar) {
        return (R) this.f13890b.fold(r10, pVar);
    }

    @Override // ub.h
    public final <E extends h.b> E get(h.c<E> cVar) {
        return (E) this.f13890b.get(cVar);
    }

    @Override // ub.h
    public final ub.h minusKey(h.c<?> cVar) {
        return this.f13890b.minusKey(cVar);
    }

    @Override // ub.h
    public final ub.h plus(ub.h hVar) {
        return this.f13890b.plus(hVar);
    }
}
