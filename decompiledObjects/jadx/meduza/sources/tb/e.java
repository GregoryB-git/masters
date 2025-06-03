package tb;

import ec.i;
import java.util.Collection;
import java.util.Iterator;
import tb.c;

/* loaded from: classes.dex */
public final class e<E> extends sb.g<E> {

    /* renamed from: a, reason: collision with root package name */
    public final c<E, ?> f14738a;

    public e(c<E, ?> cVar) {
        i.e(cVar, "backing");
        this.f14738a = cVar;
    }

    @Override // sb.g
    public final int a() {
        return this.f14738a.f14726q;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        i.e(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f14738a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f14738a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f14738a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        c<E, ?> cVar = this.f14738a;
        cVar.getClass();
        return new c.e(cVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        c<E, ?> cVar = this.f14738a;
        cVar.c();
        int h10 = cVar.h(obj);
        if (h10 < 0) {
            return false;
        }
        cVar.k(h10);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<? extends Object> collection) {
        i.e(collection, "elements");
        this.f14738a.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<? extends Object> collection) {
        i.e(collection, "elements");
        this.f14738a.c();
        return super.retainAll(collection);
    }
}
