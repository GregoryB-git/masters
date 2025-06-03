package ub;

import dc.l;
import ub.h;
import ub.h.b;

/* loaded from: classes.dex */
public abstract class b<B extends h.b, E extends B> implements h.c<E> {

    /* renamed from: a, reason: collision with root package name */
    public final l<h.b, E> f15158a;

    /* renamed from: b, reason: collision with root package name */
    public final h.c<?> f15159b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [ub.h$c<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [dc.l<? super ub.h$b, ? extends E extends B>, dc.l<ub.h$b, E extends B>, java.lang.Object] */
    public b(h.c<B> cVar, l<? super h.b, ? extends E> lVar) {
        ec.i.e(cVar, "baseKey");
        ec.i.e(lVar, "safeCast");
        this.f15158a = lVar;
        this.f15159b = cVar instanceof b ? (h.c<B>) ((b) cVar).f15159b : cVar;
    }
}
