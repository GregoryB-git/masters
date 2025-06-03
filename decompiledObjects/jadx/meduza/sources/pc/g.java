package pc;

import java.util.concurrent.CancellationException;
import nc.k1;
import nc.o1;
import pc.o;

/* loaded from: classes.dex */
public class g<E> extends nc.a<rb.h> implements f<E> {

    /* renamed from: d, reason: collision with root package name */
    public final f<E> f13162d;

    public g(ub.h hVar, b bVar) {
        super(hVar, true);
        this.f13162d = bVar;
    }

    @Override // pc.t
    public final void a(o.b bVar) {
        this.f13162d.a(bVar);
    }

    @Override // pc.s
    public final Object c() {
        return this.f13162d.c();
    }

    @Override // nc.o1, nc.j1
    public final /* synthetic */ void cancel() {
        throw null;
    }

    @Override // nc.o1, nc.j1
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new k1(u(), null, this);
        }
        s(cancellationException);
    }

    @Override // nc.o1, nc.j1
    public final /* synthetic */ boolean cancel(Throwable th) {
        throw null;
    }

    @Override // pc.t
    public final boolean d(Throwable th) {
        return this.f13162d.d(th);
    }

    @Override // pc.s
    public final Object i(rc.j jVar) {
        Object i10 = this.f13162d.i(jVar);
        vb.a aVar = vb.a.f16085a;
        return i10;
    }

    @Override // pc.s
    public final h<E> iterator() {
        return this.f13162d.iterator();
    }

    @Override // pc.t
    public final Object k(E e10, ub.e<? super rb.h> eVar) {
        return this.f13162d.k(e10, eVar);
    }

    @Override // pc.t
    public final Object l(E e10) {
        return this.f13162d.l(e10);
    }

    @Override // pc.t
    public final boolean m() {
        return this.f13162d.m();
    }

    @Override // nc.o1
    public final void s(CancellationException cancellationException) {
        CancellationException W = o1.W(this, cancellationException);
        this.f13162d.cancel(W);
        r(W);
    }
}
