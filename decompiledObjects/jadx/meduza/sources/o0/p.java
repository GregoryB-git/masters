package o0;

import java.util.concurrent.atomic.AtomicInteger;
import nc.d0;
import nc.j1;
import o0.q;
import pc.j;

/* loaded from: classes.dex */
public final class p<T> {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f11611a;

    /* renamed from: b, reason: collision with root package name */
    public final dc.p<T, ub.e<? super rb.h>, Object> f11612b;

    /* renamed from: c, reason: collision with root package name */
    public final pc.b f11613c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicInteger f11614d;

    public p(d0 d0Var, r rVar, s sVar, t tVar) {
        ec.i.e(sVar, "onUndeliveredElement");
        this.f11611a = d0Var;
        this.f11612b = tVar;
        this.f11613c = pc.i.a(Integer.MAX_VALUE, null, 6);
        this.f11614d = new AtomicInteger(0);
        j1 j1Var = (j1) d0Var.f().get(j1.b.f11509a);
        if (j1Var == null) {
            return;
        }
        j1Var.invokeOnCompletion(new n(rVar, this, sVar));
    }

    public final void a(q.a aVar) {
        Object l10 = this.f11613c.l(aVar);
        boolean z10 = l10 instanceof j.a;
        if (z10) {
            j.a aVar2 = z10 ? (j.a) l10 : null;
            Throwable th = aVar2 != null ? aVar2.f13165a : null;
            if (th != null) {
                throw th;
            }
            throw new pc.m("Channel was closed normally");
        }
        if (!(!(l10 instanceof j.b))) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.f11614d.getAndIncrement() == 0) {
            x6.b.g0(this.f11611a, null, new o(this, null), 3);
        }
    }
}
