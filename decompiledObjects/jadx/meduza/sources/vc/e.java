package vc;

import dc.l;

/* loaded from: classes.dex */
public final class e extends ec.j implements l<Throwable, rb.h> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f16102a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16103b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, Object obj) {
        super(1);
        this.f16102a = dVar;
        this.f16103b = obj;
    }

    @Override // dc.l
    public final rb.h invoke(Throwable th) {
        this.f16102a.a(this.f16103b);
        return rb.h.f13851a;
    }
}
