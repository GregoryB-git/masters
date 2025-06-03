package sc;

import p2.m0;

/* loaded from: classes.dex */
public final class o extends ec.j implements dc.l<Throwable, rb.h> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dc.l<Object, rb.h> f14361a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14362b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ub.h f14363c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(dc.l<Object, rb.h> lVar, Object obj, ub.h hVar) {
        super(1);
        this.f14361a = lVar;
        this.f14362b = obj;
        this.f14363c = hVar;
    }

    @Override // dc.l
    public final rb.h invoke(Throwable th) {
        m0.j(this.f14361a, this.f14362b, this.f14363c);
        return rb.h.f13851a;
    }
}
