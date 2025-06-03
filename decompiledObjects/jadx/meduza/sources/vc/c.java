package vc;

import dc.l;
import vc.d;

/* loaded from: classes.dex */
public final class c extends ec.j implements l<Throwable, rb.h> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f16095a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d.a f16096b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, d.a aVar) {
        super(1);
        this.f16095a = dVar;
        this.f16096b = aVar;
    }

    @Override // dc.l
    public final rb.h invoke(Throwable th) {
        d.f16097h.set(this.f16095a, this.f16096b.f16099b);
        this.f16095a.a(this.f16096b.f16099b);
        return rb.h.f13851a;
    }
}
