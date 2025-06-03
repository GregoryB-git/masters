package pc;

import nc.c0;

/* loaded from: classes.dex */
public final class p<E> extends g<E> implements q<E> {
    public p(ub.h hVar, b bVar) {
        super(hVar, bVar);
    }

    @Override // nc.a
    public final void a0(Throwable th, boolean z10) {
        if (this.f13162d.d(th) || z10) {
            return;
        }
        c0.a(this.f11466c, th);
    }

    @Override // nc.a
    public final void c0(rb.h hVar) {
        this.f13162d.d(null);
    }

    @Override // pc.q
    public final p getChannel() {
        return this;
    }

    @Override // nc.a, nc.o1, nc.j1
    public final boolean isActive() {
        return super.isActive();
    }
}
