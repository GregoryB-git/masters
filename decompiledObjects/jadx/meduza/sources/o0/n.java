package o0;

import pc.j;

/* loaded from: classes.dex */
public final class n extends ec.j implements dc.l<Throwable, rb.h> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dc.l<Throwable, rb.h> f11605a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p<Object> f11606b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dc.p<Object, Throwable, rb.h> f11607c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r rVar, p pVar, s sVar) {
        super(1);
        this.f11605a = rVar;
        this.f11606b = pVar;
        this.f11607c = sVar;
    }

    @Override // dc.l
    public final rb.h invoke(Throwable th) {
        rb.h hVar;
        Throwable th2 = th;
        this.f11605a.invoke(th2);
        this.f11606b.f11613c.d(th2);
        do {
            Object c10 = this.f11606b.f11613c.c();
            hVar = null;
            if (c10 instanceof j.b) {
                c10 = null;
            }
            if (c10 != null) {
                this.f11607c.invoke(c10, th2);
                hVar = rb.h.f13851a;
            }
        } while (hVar != null);
        return rb.h.f13851a;
    }
}
