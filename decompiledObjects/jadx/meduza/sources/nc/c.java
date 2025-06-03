package nc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class c<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f11472b = AtomicIntegerFieldUpdater.newUpdater(c.class, "notCompletedCount");

    /* renamed from: a, reason: collision with root package name */
    public final j0<T>[] f11473a;
    private volatile int notCompletedCount;

    public final class a extends n1 {

        /* renamed from: p, reason: collision with root package name */
        public static final AtomicReferenceFieldUpdater f11474p = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer");
        private volatile Object _disposer;

        /* renamed from: e, reason: collision with root package name */
        public final k<List<? extends T>> f11475e;
        public t0 f;

        public a(l lVar) {
            this.f11475e = lVar;
        }

        @Override // dc.l
        public final /* bridge */ /* synthetic */ rb.h invoke(Throwable th) {
            l(th);
            return rb.h.f13851a;
        }

        @Override // nc.w
        public final void l(Throwable th) {
            if (th != null) {
                d2.h0 e10 = this.f11475e.e(th);
                if (e10 != null) {
                    this.f11475e.n(e10);
                    b bVar = (b) f11474p.get(this);
                    if (bVar != null) {
                        bVar.i();
                        return;
                    }
                    return;
                }
                return;
            }
            if (c.f11472b.decrementAndGet(c.this) == 0) {
                k<List<? extends T>> kVar = this.f11475e;
                j0<T>[] j0VarArr = c.this.f11473a;
                ArrayList arrayList = new ArrayList(j0VarArr.length);
                for (j0<T> j0Var : j0VarArr) {
                    arrayList.add(j0Var.getCompleted());
                }
                kVar.resumeWith(arrayList);
            }
        }
    }

    public final class b extends i {

        /* renamed from: a, reason: collision with root package name */
        public final c<T>.a[] f11477a;

        public b(a[] aVarArr) {
            this.f11477a = aVarArr;
        }

        @Override // nc.j
        public final void h(Throwable th) {
            i();
        }

        public final void i() {
            for (c<T>.a aVar : this.f11477a) {
                t0 t0Var = aVar.f;
                if (t0Var == null) {
                    ec.i.i("handle");
                    throw null;
                }
                t0Var.dispose();
            }
        }

        @Override // dc.l
        public final rb.h invoke(Throwable th) {
            i();
            return rb.h.f13851a;
        }

        public final String toString() {
            StringBuilder l10 = defpackage.f.l("DisposeHandlersOnCancel[");
            l10.append(this.f11477a);
            l10.append(']');
            return l10.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(j0<? extends T>[] j0VarArr) {
        this.f11473a = j0VarArr;
        this.notCompletedCount = j0VarArr.length;
    }
}
