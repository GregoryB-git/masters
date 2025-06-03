package pc;

import p2.m0;

/* loaded from: classes.dex */
public final class c extends ec.j implements dc.l<Throwable, rb.h> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f13137a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b<Object> f13138b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uc.f<?> f13139c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Object obj, b<Object> bVar, uc.f<?> fVar) {
        super(1);
        this.f13137a = obj;
        this.f13138b = bVar;
        this.f13139c = fVar;
    }

    @Override // dc.l
    public final rb.h invoke(Throwable th) {
        Object obj = this.f13137a;
        if (obj != e.f13151l) {
            m0.j(this.f13138b.f13126b, obj, this.f13139c.getContext());
        }
        return rb.h.f13851a;
    }
}
