package sc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p2.m0;
import sc.c;

/* loaded from: classes.dex */
public abstract class c<N extends c<N>> {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f14331a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_next");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f14332b = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public c(N n2) {
        this._prev = n2;
    }

    public final void a() {
        f14332b.lazySet(this, null);
    }

    public final N b() {
        Object obj = f14331a.get(this);
        if (obj == m0.C) {
            return null;
        }
        return (N) obj;
    }

    public abstract boolean c();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [sc.c] */
    public final void d() {
        boolean z10;
        ?? b10;
        if (b() == null) {
            return;
        }
        while (true) {
            c cVar = (c) f14332b.get(this);
            while (cVar != null && cVar.c()) {
                cVar = (c) f14332b.get(cVar);
            }
            N b11 = b();
            ec.i.b(b11);
            while (b11.c() && (b10 = b11.b()) != 0) {
                b11 = b10;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14332b;
            do {
                Object obj = atomicReferenceFieldUpdater.get(b11);
                c cVar2 = ((c) obj) == null ? null : cVar;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(b11, obj, cVar2)) {
                        z10 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(b11) != obj) {
                        z10 = false;
                        break;
                    }
                }
            } while (!z10);
            if (cVar != null) {
                f14331a.set(cVar, b11);
            }
            if (b11.c()) {
                if (!(b11.b() == null)) {
                    continue;
                }
            }
            if (cVar == null || !cVar.c()) {
                return;
            }
        }
    }
}
