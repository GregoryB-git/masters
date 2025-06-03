package o7;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public class h<E> extends AbstractCollection<E> {

    /* renamed from: a, reason: collision with root package name */
    public final Collection<E> f11984a;

    /* renamed from: b, reason: collision with root package name */
    public final n7.j<? super E> f11985b;

    public h(Collection<E> collection, n7.j<? super E> jVar) {
        this.f11984a = collection;
        this.f11985b = jVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e10) {
        x6.b.t(this.f11985b.apply(e10));
        return this.f11984a.add(e10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            x6.b.t(this.f11985b.apply(it.next()));
        }
        return this.f11984a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        Collection<E> collection = this.f11984a;
        n7.j<? super E> jVar = this.f11985b;
        if (!(collection instanceof RandomAccess) || !(collection instanceof List)) {
            Iterator<T> it = collection.iterator();
            jVar.getClass();
            while (it.hasNext()) {
                if (jVar.apply((Object) it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) collection;
        jVar.getClass();
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            defpackage.a aVar = (Object) list.get(i10);
            if (!jVar.apply(aVar)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, aVar);
                    } catch (IllegalArgumentException | UnsupportedOperationException unused) {
                        int size = list.size();
                        while (true) {
                            size--;
                            if (size <= i10) {
                                break;
                            } else if (jVar.apply((Object) list.get(size))) {
                                list.remove(size);
                            }
                        }
                        while (true) {
                            i10--;
                            if (i10 < i11) {
                                return;
                            } else {
                                list.remove(i10);
                            }
                        }
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        boolean z10;
        Collection<E> collection = this.f11984a;
        collection.getClass();
        try {
            z10 = collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z10 = false;
        }
        if (z10) {
            return this.f11985b.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        Collection<E> collection = this.f11984a;
        n7.j<? super E> jVar = this.f11985b;
        Iterator<T> it = collection.iterator();
        x6.b.y(jVar, "predicate");
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (jVar.apply((Object) it.next())) {
                break;
            }
            i10++;
        }
        return true ^ (i10 != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it = this.f11984a.iterator();
        n7.j<? super E> jVar = this.f11985b;
        it.getClass();
        jVar.getClass();
        return new z(it, jVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.f11984a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<E> it = this.f11984a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.f11985b.apply(next) && collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        Iterator<E> it = this.f11984a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.f11985b.apply(next) && !collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator<E> it = this.f11984a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f11985b.apply(it.next())) {
                i10++;
            }
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return c0.b(iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) c0.b(iterator()).toArray(tArr);
    }
}
