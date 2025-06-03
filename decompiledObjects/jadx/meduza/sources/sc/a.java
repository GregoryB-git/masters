package sc;

import b.a0;
import d2.h0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class a<T> extends p {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f14329a = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_consensus");
    private volatile Object _consensus = a0.X;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sc.p
    public final Object a(Object obj) {
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14329a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        h0 h0Var = a0.X;
        if (obj2 == h0Var) {
            h0 c10 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == h0Var) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, h0Var, c10)) {
                        z10 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != h0Var) {
                        z10 = false;
                        break;
                    }
                }
                obj2 = z10 ? c10 : f14329a.get(this);
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(T t, Object obj);

    public abstract h0 c(Object obj);
}
