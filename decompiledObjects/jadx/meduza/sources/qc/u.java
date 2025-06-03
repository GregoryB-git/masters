package qc;

import b.a0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class u extends rc.c<t<?>> {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f13457a = AtomicReferenceFieldUpdater.newUpdater(u.class, Object.class, "_state");
    private volatile Object _state;

    @Override // rc.c
    public final boolean a(t<?> tVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13457a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, a0.R);
        return true;
    }

    public final void b(t tVar) {
        f13457a.set(this, null);
    }
}
