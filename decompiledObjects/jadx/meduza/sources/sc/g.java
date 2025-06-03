package sc;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import nc.a0;
import nc.c2;
import nc.g0;
import nc.p0;
import nc.x0;

/* loaded from: classes.dex */
public final class g<T> extends p0<T> implements wb.d, ub.e<T> {

    /* renamed from: p, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f14336p = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: d, reason: collision with root package name */
    public final a0 f14337d;

    /* renamed from: e, reason: collision with root package name */
    public final ub.e<T> f14338e;
    public Object f;

    /* renamed from: o, reason: collision with root package name */
    public final Object f14339o;

    /* JADX WARN: Multi-variable type inference failed */
    public g(a0 a0Var, ub.e<? super T> eVar) {
        super(-1);
        this.f14337d = a0Var;
        this.f14338e = eVar;
        this.f = b.a0.Y;
        this.f14339o = w.b(getContext());
    }

    @Override // nc.p0
    public final void a(Object obj, CancellationException cancellationException) {
        if (obj instanceof nc.v) {
            ((nc.v) obj).f11559b.invoke(cancellationException);
        }
    }

    @Override // nc.p0
    public final ub.e<T> d() {
        return this;
    }

    @Override // wb.d
    public final wb.d getCallerFrame() {
        ub.e<T> eVar = this.f14338e;
        if (eVar instanceof wb.d) {
            return (wb.d) eVar;
        }
        return null;
    }

    @Override // ub.e
    public final ub.h getContext() {
        return this.f14338e.getContext();
    }

    @Override // nc.p0
    public final Object k() {
        Object obj = this.f;
        this.f = b.a0.Y;
        return obj;
    }

    @Override // ub.e
    public final void resumeWith(Object obj) {
        ub.h context = this.f14338e.getContext();
        Throwable a10 = rb.e.a(obj);
        Object uVar = a10 == null ? obj : new nc.u(a10, false);
        if (this.f14337d.B0()) {
            this.f = uVar;
            this.f11542c = 0;
            this.f14337d.z0(context, this);
            return;
        }
        x0 a11 = c2.a();
        if (a11.F0()) {
            this.f = uVar;
            this.f11542c = 0;
            a11.D0(this);
            return;
        }
        a11.E0(true);
        try {
            ub.h context2 = getContext();
            Object c10 = w.c(context2, this.f14339o);
            try {
                this.f14338e.resumeWith(obj);
                rb.h hVar = rb.h.f13851a;
                while (a11.H0()) {
                }
            } finally {
                w.a(context2, c10);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("DispatchedContinuation[");
        l10.append(this.f14337d);
        l10.append(", ");
        l10.append(g0.c(this.f14338e));
        l10.append(']');
        return l10.toString();
    }
}
