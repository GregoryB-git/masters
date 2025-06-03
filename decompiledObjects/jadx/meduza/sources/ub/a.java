package ub;

import dc.p;
import ub.h;

/* loaded from: classes.dex */
public abstract class a implements h.b {

    /* renamed from: a, reason: collision with root package name */
    public final h.c<?> f15157a;

    public a(h.c<?> cVar) {
        this.f15157a = cVar;
    }

    @Override // ub.h.b, ub.h
    public final <R> R fold(R r10, p<? super R, ? super h.b, ? extends R> pVar) {
        ec.i.e(pVar, "operation");
        return pVar.invoke(r10, this);
    }

    @Override // ub.h.b, ub.h
    public <E extends h.b> E get(h.c<E> cVar) {
        return (E) h.b.a.a(this, cVar);
    }

    @Override // ub.h.b
    public final h.c<?> getKey() {
        return this.f15157a;
    }

    @Override // ub.h.b, ub.h
    public h minusKey(h.c<?> cVar) {
        return h.b.a.b(this, cVar);
    }

    @Override // ub.h
    public final h plus(h hVar) {
        ec.i.e(hVar, "context");
        return h.a.a(this, hVar);
    }
}
