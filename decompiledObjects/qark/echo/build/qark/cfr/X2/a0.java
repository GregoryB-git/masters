/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.ClassCastException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.UnsupportedOperationException
 *  java.util.AbstractSet
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Set
 *  java.util.SortedSet
 */
package X2;

import W2.m;
import W2.n;
import W2.o;
import X2.C;
import X2.G;
import X2.L;
import X2.Z;
import X2.g0;
import X2.j;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

public abstract class a0 {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(Set set, Object object) {
        if (set == object) {
            return true;
        }
        if (!(object instanceof Set)) return false;
        object = (Set)object;
        try {
            boolean bl;
            if (set.size() != object.size() || !(bl = set.containsAll((Collection)object))) return false;
            return true;
        }
        catch (ClassCastException | NullPointerException nullPointerException) {
            return false;
        }
    }

    public static Set b(Set set, n n8) {
        if (set instanceof SortedSet) {
            return a0.c((SortedSet)set, n8);
        }
        if (set instanceof b) {
            set = (b)set;
            n8 = o.b(set.p, n8);
            return new b((Set)set.o, n8);
        }
        return new b((Set)m.j((Object)set), (n)m.j(n8));
    }

    public static SortedSet c(SortedSet object, n n8) {
        if (object instanceof b) {
            object = (b)((Object)object);
            n8 = o.b(object.p, n8);
            return new c((SortedSet)object.o, n8);
        }
        return new c((SortedSet)m.j(object), (n)m.j(n8));
    }

    public static int d(Set set) {
        set = set.iterator();
        int n8 = 0;
        while (set.hasNext()) {
            Object object = set.next();
            int n9 = object != null ? object.hashCode() : 0;
            n8 += n9;
        }
        return n8;
    }

    public static e e(Set set, final Set set2) {
        m.k((Object)set, "set1");
        m.k((Object)set2, "set2");
        return new e(){

            public g0 a() {
                return new X2.b(){
                    public final Iterator q;
                    {
                        this.q = Set.this.iterator();
                    }

                    @Override
                    public Object b() {
                        while (this.q.hasNext()) {
                            Object object = this.q.next();
                            if (!set2.contains(object)) continue;
                            return object;
                        }
                        return this.d();
                    }
                };
            }

            public boolean contains(Object object) {
                if (Set.this.contains(object) && set2.contains(object)) {
                    return true;
                }
                return false;
            }

            public boolean containsAll(Collection collection) {
                if (Set.this.containsAll(collection) && set2.containsAll(collection)) {
                    return true;
                }
                return false;
            }

            public boolean isEmpty() {
                return Collections.disjoint((Collection)set2, (Collection)Set.this);
            }

            public int size() {
                Iterator iterator = Set.this.iterator();
                int n8 = 0;
                while (iterator.hasNext()) {
                    Object object = iterator.next();
                    if (!set2.contains(object)) continue;
                    ++n8;
                }
                return n8;
            }

        };
    }

    public static HashSet f() {
        return new HashSet();
    }

    public static HashSet g(int n8) {
        return new HashSet(G.a(n8));
    }

    public static Set h() {
        return Collections.newSetFromMap((Map)G.g());
    }

    public static boolean i(Set set, Collection collection) {
        m.j((Object)collection);
        Collection collection2 = collection;
        if (collection instanceof L) {
            collection2 = ((L)collection).u();
        }
        if (collection2 instanceof Set && collection2.size() > set.size()) {
            return C.q(set.iterator(), collection2);
        }
        return a0.j(set, collection2.iterator());
    }

    public static boolean j(Set set, Iterator iterator) {
        boolean bl = false;
        while (iterator.hasNext()) {
            bl |= set.remove(iterator.next());
        }
        return bl;
    }

    public static class b
    extends j.a
    implements Set {
        public b(Set set, n n8) {
            super((Collection)set, n8);
        }

        public boolean equals(Object object) {
            return a0.a(this, object);
        }

        public int hashCode() {
            return a0.d(this);
        }
    }

    public static class c
    extends b
    implements SortedSet {
        public c(SortedSet sortedSet, n n8) {
            super((Set)sortedSet, n8);
        }

        public Comparator comparator() {
            return ((SortedSet)this.o).comparator();
        }

        public Object first() {
            return C.j(this.o.iterator(), this.p);
        }

        public SortedSet headSet(Object object) {
            return new c(((SortedSet)this.o).headSet(object), this.p);
        }

        public Object last() {
            SortedSet sortedSet = (SortedSet)this.o;
            Object object;
            while (!this.p.apply(object = sortedSet.last())) {
                sortedSet = sortedSet.headSet(object);
            }
            return object;
        }

        public SortedSet subSet(Object object, Object object2) {
            return new c(((SortedSet)this.o).subSet(object, object2), this.p);
        }

        public SortedSet tailSet(Object object) {
            return new c(((SortedSet)this.o).tailSet(object), this.p);
        }
    }

    public static abstract class d
    extends AbstractSet {
        public boolean removeAll(Collection collection) {
            return a0.i((Set)this, collection);
        }

        public boolean retainAll(Collection collection) {
            return super.retainAll((Collection)m.j((Object)collection));
        }
    }

    public static abstract class e
    extends AbstractSet {
        public e() {
        }

        public /* synthetic */ e(Z z8) {
            this();
        }

        public final boolean add(Object object) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public final void clear() {
            throw new UnsupportedOperationException();
        }

        public final boolean remove(Object object) {
            throw new UnsupportedOperationException();
        }

        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }
    }

}

