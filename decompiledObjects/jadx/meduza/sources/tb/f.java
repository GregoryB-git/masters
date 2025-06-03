package tb;

import ec.i;
import java.util.Collection;
import java.util.Iterator;
import tb.c;

/* loaded from: classes.dex */
public final class f<V> extends sb.e<V> {

    /* renamed from: a, reason: collision with root package name */
    public final c<?, V> f14739a;

    public f(c<?, V> cVar) {
        i.e(cVar, "backing");
        this.f14739a = cVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends V> collection) {
        i.e(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f14739a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f14739a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f14739a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        c<?, V> cVar = this.f14739a;
        cVar.getClass();
        return new c.f(cVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i10;
        c<?, V> cVar = this.f14739a;
        cVar.c();
        int i11 = cVar.f;
        while (true) {
            i10 = -1;
            i11--;
            if (i11 < 0) {
                break;
            }
            if (cVar.f14721c[i11] >= 0) {
                V[] vArr = cVar.f14720b;
                i.b(vArr);
                if (i.a(vArr[i11], obj)) {
                    i10 = i11;
                    break;
                }
            }
        }
        if (i10 < 0) {
            return false;
        }
        cVar.k(i10);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        i.e(collection, "elements");
        this.f14739a.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        i.e(collection, "elements");
        this.f14739a.c();
        return super.retainAll(collection);
    }
}
