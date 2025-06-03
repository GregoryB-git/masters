package o0;

import java.util.concurrent.CancellationException;
import o0.q;

/* loaded from: classes.dex */
public final class s extends ec.j implements dc.p<q.a<Object>, Throwable, rb.h> {

    /* renamed from: a, reason: collision with root package name */
    public static final s f11669a = new s();

    public s() {
        super(2);
    }

    @Override // dc.p
    public final rb.h invoke(q.a<Object> aVar, Throwable th) {
        q.a<Object> aVar2 = aVar;
        Throwable th2 = th;
        ec.i.e(aVar2, "msg");
        if (aVar2 instanceof q.a.b) {
            nc.r<T> rVar = ((q.a.b) aVar2).f11628b;
            if (th2 == null) {
                th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            rVar.h0(th2);
        }
        return rb.h.f13851a;
    }
}
