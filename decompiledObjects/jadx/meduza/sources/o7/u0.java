package o7;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public final class u0 {

    public static class a<E> extends h<E> implements Set<E> {
        public a(Set<E> set, n7.j<? super E> jVar) {
            super(set, jVar);
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            return u0.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return u0.c(this);
        }
    }

    public static class b<E> extends a<E> implements SortedSet<E> {
        public b(SortedSet<E> sortedSet, n7.j<? super E> jVar) {
            super(sortedSet, jVar);
        }

        @Override // java.util.SortedSet
        public final Comparator<? super E> comparator() {
            return ((SortedSet) this.f11984a).comparator();
        }

        @Override // java.util.SortedSet
        public final E first() {
            Iterator<E> it = this.f11984a.iterator();
            n7.j<? super E> jVar = this.f11985b;
            it.getClass();
            jVar.getClass();
            while (it.hasNext()) {
                E next = it.next();
                if (jVar.apply(next)) {
                    return next;
                }
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> headSet(E e10) {
            return new b(((SortedSet) this.f11984a).headSet(e10), this.f11985b);
        }

        @Override // java.util.SortedSet
        public final E last() {
            SortedSet sortedSet = (SortedSet) this.f11984a;
            while (true) {
                E e10 = (Object) sortedSet.last();
                if (this.f11985b.apply(e10)) {
                    return e10;
                }
                sortedSet = sortedSet.headSet(e10);
            }
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> subSet(E e10, E e11) {
            return new b(((SortedSet) this.f11984a).subSet(e10, e11), this.f11985b);
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> tailSet(E e10) {
            return new b(((SortedSet) this.f11984a).tailSet(e10), this.f11985b);
        }
    }

    public static abstract class c<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            collection.getClass();
            if (collection instanceof i0) {
                collection = ((i0) collection).j();
            }
            boolean z10 = false;
            if (!(collection instanceof Set) || collection.size() <= size()) {
                Iterator<?> it = collection.iterator();
                while (it.hasNext()) {
                    z10 |= remove(it.next());
                }
            } else {
                Iterator<E> it2 = iterator();
                while (it2.hasNext()) {
                    if (collection.contains(it2.next())) {
                        it2.remove();
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            collection.getClass();
            return super.retainAll(collection);
        }
    }

    public static abstract class d<E> extends AbstractSet<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }
    }

    public static boolean a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a b(Set set, n7.j jVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof a)) {
                set.getClass();
                return new a(set, jVar);
            }
            a aVar = (a) set;
            n7.j jVar2 = aVar.f11985b;
            jVar2.getClass();
            return new a((Set) aVar.f11984a, new n7.k(Arrays.asList(jVar2, jVar)));
        }
        SortedSet sortedSet = (SortedSet) set;
        if (!(sortedSet instanceof a)) {
            sortedSet.getClass();
            return new b(sortedSet, jVar);
        }
        a aVar2 = (a) sortedSet;
        n7.j jVar3 = aVar2.f11985b;
        jVar3.getClass();
        return new b((SortedSet) aVar2.f11984a, new n7.k(Arrays.asList(jVar3, jVar)));
    }

    public static int c(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static t0 d(x xVar, x xVar2) {
        x6.b.y(xVar, "set1");
        x6.b.y(xVar2, "set2");
        return new t0(xVar, xVar2);
    }
}
