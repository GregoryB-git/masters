package vc;

import d2.h0;
import dc.q;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import nc.a0;
import nc.g0;
import nc.i2;
import nc.l;
import p2.m0;
import sc.t;

/* loaded from: classes.dex */
public final class d extends i implements vc.a {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f16097h = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner");
    private volatile Object owner;

    public final class a implements nc.k<rb.h>, i2 {

        /* renamed from: a, reason: collision with root package name */
        public final l<rb.h> f16098a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f16099b = null;

        public a(l lVar) {
            this.f16098a = lVar;
        }

        @Override // nc.k
        public final void b(rb.h hVar, dc.l lVar) {
            d.f16097h.set(d.this, this.f16099b);
            this.f16098a.b(hVar, new vc.b(d.this, this));
        }

        @Override // nc.i2
        public final void c(t<?> tVar, int i10) {
            this.f16098a.c(tVar, i10);
        }

        @Override // nc.k
        public final boolean cancel(Throwable th) {
            return this.f16098a.cancel(th);
        }

        @Override // nc.k
        public final h0 e(Throwable th) {
            return this.f16098a.e(th);
        }

        @Override // ub.e
        public final ub.h getContext() {
            return this.f16098a.f11516e;
        }

        @Override // nc.k
        public final void h(a0 a0Var, rb.h hVar) {
            this.f16098a.h(a0Var, hVar);
        }

        @Override // nc.k
        public final h0 j(Object obj, dc.l lVar) {
            d dVar = d.this;
            h0 D = this.f16098a.D((rb.h) obj, new c(dVar, this));
            if (D != null) {
                d.f16097h.set(d.this, this.f16099b);
            }
            return D;
        }

        @Override // nc.k
        public final void n(Object obj) {
            this.f16098a.n(obj);
        }

        @Override // ub.e
        public final void resumeWith(Object obj) {
            this.f16098a.resumeWith(obj);
        }
    }

    public static final class b extends ec.j implements q<uc.f<?>, Object, Object, dc.l<? super Throwable, ? extends rb.h>> {
        public b() {
            super(3);
        }

        @Override // dc.q
        public final Object f(qc.f fVar, Object obj, Object obj2) {
            return new e(d.this, obj);
        }
    }

    public d(boolean z10) {
        super(z10 ? 1 : 0);
        this.owner = z10 ? null : b.a0.f1573j0;
        new b();
    }

    @Override // vc.a
    public final void a(Object obj) {
        while (e()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16097h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            h0 h0Var = b.a0.f1573j0;
            if (obj2 != h0Var) {
                boolean z10 = false;
                if (!(obj2 == obj || obj == null)) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, h0Var)) {
                        z10 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (z10) {
                    d();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    @Override // vc.a
    public final Object b(wb.c cVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        char c10;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = i.f16110g;
            int i12 = atomicIntegerFieldUpdater2.get(this);
            if (i12 > this.f16111a) {
                do {
                    atomicIntegerFieldUpdater = i.f16110g;
                    i10 = atomicIntegerFieldUpdater.get(this);
                    i11 = this.f16111a;
                    if (i10 > i11) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i11));
            } else {
                z10 = false;
                if (i12 <= 0) {
                    z11 = false;
                    break;
                }
                if (atomicIntegerFieldUpdater2.compareAndSet(this, i12, i12 - 1)) {
                    z11 = true;
                    break;
                }
            }
        }
        if (z11) {
            f16097h.set(this, null);
            c10 = 0;
        } else {
            c10 = 1;
        }
        if (c10 == 0) {
            z10 = true;
        } else if (c10 != 1) {
            if (c10 != 2) {
                throw new IllegalStateException("unexpected".toString());
            }
            throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
        }
        if (!z10) {
            l u10 = b.a0.u(m0.P(cVar));
            try {
                c(new a(u10));
                Object s10 = u10.s();
                vb.a aVar = vb.a.f16085a;
                if (s10 != aVar) {
                    s10 = rb.h.f13851a;
                }
                if (s10 == aVar) {
                    return s10;
                }
            } catch (Throwable th) {
                u10.A();
                throw th;
            }
        }
        return rb.h.f13851a;
    }

    public final boolean e() {
        return Math.max(i.f16110g.get(this), 0) == 0;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("Mutex@");
        l10.append(g0.b(this));
        l10.append("[isLocked=");
        l10.append(e());
        l10.append(",owner=");
        l10.append(f16097h.get(this));
        l10.append(']');
        return l10.toString();
    }
}
