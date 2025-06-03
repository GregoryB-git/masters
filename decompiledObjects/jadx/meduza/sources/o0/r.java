package o0;

/* loaded from: classes.dex */
public final class r extends ec.j implements dc.l<Throwable, rb.h> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q<Object> f11668a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(q<Object> qVar) {
        super(1);
        this.f11668a = qVar;
    }

    @Override // dc.l
    public final rb.h invoke(Throwable th) {
        Throwable th2 = th;
        if (th2 != null) {
            this.f11668a.f11623h.setValue(new j(th2));
        }
        Object obj = q.f11616l;
        q<Object> qVar = this.f11668a;
        synchronized (obj) {
            q.f11615k.remove(qVar.c().getAbsolutePath());
        }
        return rb.h.f13851a;
    }
}
