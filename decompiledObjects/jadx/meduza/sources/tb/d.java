package tb;

import ec.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import tb.c;

/* loaded from: classes.dex */
public final class d<K, V> extends a<Map.Entry<K, V>, K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final c<K, V> f14737a;

    public d(c<K, V> cVar) {
        i.e(cVar, "backing");
        this.f14737a = cVar;
    }

    @Override // sb.g
    public final int a() {
        return this.f14737a.f14726q;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        i.e((Map.Entry) obj, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        i.e(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f14737a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<? extends Object> collection) {
        i.e(collection, "elements");
        return this.f14737a.e(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f14737a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        c<K, V> cVar = this.f14737a;
        cVar.getClass();
        return new c.b(cVar);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<? extends Object> collection) {
        i.e(collection, "elements");
        this.f14737a.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<? extends Object> collection) {
        i.e(collection, "elements");
        this.f14737a.c();
        return super.retainAll(collection);
    }
}
