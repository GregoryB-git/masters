package X2;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class e0 implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    public final Iterator f7144o;

    public e0(Iterator it) {
        this.f7144o = (Iterator) W2.m.j(it);
    }

    public abstract Object b(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7144o.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return b(this.f7144o.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f7144o.remove();
    }
}
