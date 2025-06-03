package o2;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class h extends ec.j implements dc.l<Throwable, rb.h> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i<Object> f11716a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i<Object> iVar) {
        super(1);
        this.f11716a = iVar;
    }

    @Override // dc.l
    public final rb.h invoke(Throwable th) {
        Throwable th2 = th;
        if (th2 == null) {
            if (!this.f11716a.f11718b.isDone()) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else if (th2 instanceof CancellationException) {
            this.f11716a.f11718b.cancel(true);
        } else {
            z2.c<Object> cVar = this.f11716a.f11718b;
            Throwable cause = th2.getCause();
            if (cause != null) {
                th2 = cause;
            }
            cVar.j(th2);
        }
        return rb.h.f13851a;
    }
}
