package vc;

import dc.l;
import vc.d;

/* loaded from: classes.dex */
public final class b extends ec.j implements l<Throwable, rb.h> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f16093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d.a f16094b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, d.a aVar) {
        super(1);
        this.f16093a = dVar;
        this.f16094b = aVar;
    }

    @Override // dc.l
    public final rb.h invoke(Throwable th) {
        this.f16093a.a(this.f16094b.f16099b);
        return rb.h.f13851a;
    }
}
