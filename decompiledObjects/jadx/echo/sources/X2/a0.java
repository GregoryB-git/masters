package X2;

import X2.AbstractC0692j;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class a0 {

    public class a extends e {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Set f7099o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Set f7100p;

        /* renamed from: X2.a0$a$a, reason: collision with other inner class name */
        public class C0123a extends AbstractC0684b {

            /* renamed from: q, reason: collision with root package name */
            public final Iterator f7101q;

            public C0123a() {
                this.f7101q = a.this.f7099o.iterator();
            }

            @Override // X2.AbstractC0684b
            public Object b() {
                while (this.f7101q.hasNext()) {
                    Object next = this.f7101q.next();
                    if (a.this.f7100p.contains(next)) {
                        return next;
                    }
                }
                return d();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Set set, Set set2) {
            super(null);
            this.f7099o = set;
            this.f7100p = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g0 iterator() {
            return new C0123a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f7099o.contains(obj) && this.f7100p.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return this.f7099o.containsAll(collection) && this.f7100p.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f7100p, this.f7099o);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator it = this.f7099o.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                if (this.f7100p.contains(it.next())) {
                    i7++;
                }
            }
            return i7;
        }
    }

    public static class b extends AbstractC0692j.a implements Set {
        public b(Set set, W2.n nVar) {
            super(set, nVar);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return a0.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return a0.d(this);
        }
    }

    public static class c extends b implements SortedSet {
        public c(SortedSet sortedSet, W2.n nVar) {
            super(sortedSet, nVar);
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return ((SortedSet) this.f7151o).comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return C.j(this.f7151o.iterator(), this.f7152p);
        }

        @Override // java.util.SortedSet
        public SortedSet headSet(Object obj) {
            return new c(((SortedSet) this.f7151o).headSet(obj), this.f7152p);
        }

        @Override // java.util.SortedSet
        public Object last() {
            SortedSet sortedSet = (SortedSet) this.f7151o;
            while (true) {
                Object last = sortedSet.last();
                if (this.f7152p.apply(last)) {
                    return last;
                }
                sortedSet = sortedSet.headSet(last);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet subSet(Object obj, Object obj2) {
            return new c(((SortedSet) this.f7151o).subSet(obj, obj2), this.f7152p);
        }

        @Override // java.util.SortedSet
        public SortedSet tailSet(Object obj) {
            return new c(((SortedSet) this.f7151o).tailSet(obj), this.f7152p);
        }
    }

    public static abstract class d extends AbstractSet {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            return a0.i(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            return super.retainAll((Collection) W2.m.j(collection));
        }
    }

    public static abstract class e extends AbstractSet {
        public e() {
        }

        public /* synthetic */ e(Z z7) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }
    }

    public static boolean a(Set set, Object obj) {
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

    public static Set b(Set set, W2.n nVar) {
        if (set instanceof SortedSet) {
            return c((SortedSet) set, nVar);
        }
        if (!(set instanceof b)) {
            return new b((Set) W2.m.j(set), (W2.n) W2.m.j(nVar));
        }
        b bVar = (b) set;
        return new b((Set) bVar.f7151o, W2.o.b(bVar.f7152p, nVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SortedSet c(SortedSet sortedSet, W2.n nVar) {
        if (!(sortedSet instanceof b)) {
            return new c((SortedSet) W2.m.j(sortedSet), (W2.n) W2.m.j(nVar));
        }
        b bVar = (b) sortedSet;
        return new c((SortedSet) bVar.f7151o, W2.o.b(bVar.f7152p, nVar));
    }

    public static int d(Set set) {
        Iterator it = set.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i7 = ~(~(i7 + (next != null ? next.hashCode() : 0)));
        }
        return i7;
    }

    public static e e(Set set, Set set2) {
        W2.m.k(set, "set1");
        W2.m.k(set2, "set2");
        return new a(set, set2);
    }

    public static HashSet f() {
        return new HashSet();
    }

    public static HashSet g(int i7) {
        return new HashSet(G.a(i7));
    }

    public static Set h() {
        return Collections.newSetFromMap(G.g());
    }

    public static boolean i(Set set, Collection collection) {
        W2.m.j(collection);
        if (collection instanceof L) {
            collection = ((L) collection).u();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? j(set, collection.iterator()) : C.q(set.iterator(), collection);
    }

    public static boolean j(Set set, Iterator it) {
        boolean z7 = false;
        while (it.hasNext()) {
            z7 |= set.remove(it.next());
        }
        return z7;
    }
}
