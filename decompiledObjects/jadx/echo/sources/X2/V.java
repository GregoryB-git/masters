package X2;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public final class V extends A {

    /* renamed from: t, reason: collision with root package name */
    public static final V f7092t = new V(AbstractC0703v.Y(), P.d());

    /* renamed from: s, reason: collision with root package name */
    public final transient AbstractC0703v f7093s;

    public V(AbstractC0703v abstractC0703v, Comparator comparator) {
        super(comparator);
        this.f7093s = abstractC0703v;
    }

    public Comparator A0() {
        return this.f7036q;
    }

    @Override // X2.AbstractC0706y, X2.AbstractC0701t
    public AbstractC0703v a() {
        return this.f7093s;
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        int y02 = y0(obj, true);
        if (y02 == size()) {
            return null;
        }
        return this.f7093s.get(y02);
    }

    @Override // X2.AbstractC0701t, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return z0(obj) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        if (collection instanceof L) {
            collection = ((L) collection).u();
        }
        if (!d0.b(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        g0 it = iterator();
        Iterator it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = it.next();
        while (true) {
            try {
                int t02 = t0(next2, next);
                if (t02 < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (t02 == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (t02 > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // X2.AbstractC0701t
    public int d(Object[] objArr, int i7) {
        return this.f7093s.d(objArr, i7);
    }

    @Override // X2.AbstractC0706y, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!d0.b(this.f7036q, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            g0 it2 = iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                Object next2 = it.next();
                if (next2 == null || t0(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // X2.AbstractC0701t
    public Object[] f() {
        return this.f7093s.f();
    }

    @Override // java.util.SortedSet
    public Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f7093s.get(0);
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        int x02 = x0(obj, true) - 1;
        if (x02 == -1) {
            return null;
        }
        return this.f7093s.get(x02);
    }

    @Override // X2.AbstractC0701t
    public int g() {
        return this.f7093s.g();
    }

    @Override // X2.A
    public A h0() {
        Comparator reverseOrder = Collections.reverseOrder(this.f7036q);
        return isEmpty() ? A.j0(reverseOrder) : new V(this.f7093s.f0(), reverseOrder);
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        int y02 = y0(obj, false);
        if (y02 == size()) {
            return null;
        }
        return this.f7093s.get(y02);
    }

    @Override // X2.AbstractC0701t
    public int i() {
        return this.f7093s.i();
    }

    @Override // X2.AbstractC0701t
    public boolean k() {
        return this.f7093s.k();
    }

    @Override // java.util.SortedSet
    public Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f7093s.get(size() - 1);
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        int x02 = x0(obj, false) - 1;
        if (x02 == -1) {
            return null;
        }
        return this.f7093s.get(x02);
    }

    @Override // X2.A
    public A m0(Object obj, boolean z7) {
        return w0(0, x0(obj, z7));
    }

    @Override // X2.A
    public A p0(Object obj, boolean z7, Object obj2, boolean z8) {
        return s0(obj, z7).m0(obj2, z8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: q */
    public g0 iterator() {
        return this.f7093s.iterator();
    }

    @Override // X2.A
    public A s0(Object obj, boolean z7) {
        return w0(y0(obj, z7), size());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f7093s.size();
    }

    @Override // java.util.NavigableSet
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public g0 descendingIterator() {
        return this.f7093s.f0().iterator();
    }

    public V w0(int i7, int i8) {
        return (i7 == 0 && i8 == size()) ? this : i7 < i8 ? new V(this.f7093s.subList(i7, i8), this.f7036q) : A.j0(this.f7036q);
    }

    @Override // X2.A, X2.AbstractC0706y, X2.AbstractC0701t
    public Object writeReplace() {
        return super.writeReplace();
    }

    public int x0(Object obj, boolean z7) {
        int binarySearch = Collections.binarySearch(this.f7093s, W2.m.j(obj), comparator());
        return binarySearch >= 0 ? z7 ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    public int y0(Object obj, boolean z7) {
        int binarySearch = Collections.binarySearch(this.f7093s, W2.m.j(obj), comparator());
        return binarySearch >= 0 ? z7 ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    public final int z0(Object obj) {
        return Collections.binarySearch(this.f7093s, obj, A0());
    }
}
