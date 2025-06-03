package kc;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a<T> implements b<T> {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference<b<T>> f9243a;

    public a(f fVar) {
        this.f9243a = new AtomicReference<>(fVar);
    }

    @Override // kc.b
    public final Iterator<T> iterator() {
        b<T> andSet = this.f9243a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
