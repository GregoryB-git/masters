package uc;

import d2.h0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import nc.i;
import nc.i2;
import nc.k;
import nc.t0;
import sc.t;
import ub.h;

/* loaded from: classes.dex */
public final class e<R> extends i implements f, i2 {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f15172c = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "state");

    /* renamed from: a, reason: collision with root package name */
    public t0 f15173a;

    /* renamed from: b, reason: collision with root package name */
    public Object f15174b;
    private volatile Object state;

    public final class a {
    }

    @Override // uc.f
    public final void b(t0 t0Var) {
        this.f15173a = t0Var;
    }

    @Override // nc.i2
    public final void c(t<?> tVar, int i10) {
    }

    @Override // uc.f
    public final boolean e(Object obj, Object obj2) {
        return i(obj) == 0;
    }

    @Override // uc.f
    public final void g(Object obj) {
        this.f15174b = obj;
    }

    @Override // uc.f
    public final h getContext() {
        return null;
    }

    @Override // nc.j
    public final void h(Throwable th) {
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15172c;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == g.f15177c) {
                return;
            }
            h0 h0Var = g.f15178d;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, h0Var)) {
                    z10 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                    z10 = false;
                    break;
                }
            }
        } while (!z10);
    }

    public final int i(Object obj) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15172c;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof k)) {
                if (ec.i.a(obj2, g.f15177c) ? true : obj2 instanceof a) {
                    return 3;
                }
                if (ec.i.a(obj2, g.f15178d)) {
                    return 2;
                }
                boolean z10 = false;
                if (ec.i.a(obj2, g.f15176b)) {
                    List f = va.a.f(obj);
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, f)) {
                            z10 = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    if (z10) {
                        return 1;
                    }
                } else {
                    if (!(obj2 instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj2).toString());
                    }
                    Collection collection = (Collection) obj2;
                    ec.i.e(collection, "<this>");
                    ArrayList arrayList = new ArrayList(collection.size() + 1);
                    arrayList.addAll(collection);
                    arrayList.add(obj);
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, arrayList)) {
                            z10 = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    if (z10) {
                        return 1;
                    }
                }
            }
        }
    }

    @Override // dc.l
    public final /* bridge */ /* synthetic */ rb.h invoke(Throwable th) {
        h(th);
        return rb.h.f13851a;
    }
}
