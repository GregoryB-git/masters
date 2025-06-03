package o7;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class w0<F, T> implements Iterator<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator<? extends F> f12071a;

    public w0(Iterator<? extends F> it) {
        it.getClass();
        this.f12071a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12071a.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return (T) ((Map.Entry) this.f12071a.next()).getValue();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f12071a.remove();
    }
}
