// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import java.util.AbstractSet;
import java.util.Comparator;
import java.util.Map;
import java.util.HashSet;
import java.util.Collections;
import java.util.Iterator;
import W2.m;
import W2.o;
import java.util.SortedSet;
import W2.n;
import java.util.Collection;
import java.util.Set;

public abstract class a0
{
    public static boolean a(final Set set, final Object o) {
        if (set == o) {
            return true;
        }
        if (!(o instanceof Set)) {
            return false;
        }
        final Set set2 = (Set)o;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        }
        catch (NullPointerException | ClassCastException ex) {
            return false;
        }
    }
    
    public static Set b(final Set set, n b) {
        if (set instanceof SortedSet) {
            return c((SortedSet)set, b);
        }
        if (set instanceof b) {
            final b b2 = (b)set;
            b = o.b(b2.p, b);
            return new b((Set)b2.o, b);
        }
        return new b((Set)m.j(set), (n)m.j(b));
    }
    
    public static SortedSet c(final SortedSet set, n b) {
        if (set instanceof b) {
            final b b2 = (b)set;
            b = o.b(b2.p, b);
            return new c((SortedSet)b2.o, b);
        }
        return new c((SortedSet)m.j(set), (n)m.j(b));
    }
    
    public static int d(final Set set) {
        final Iterator<Object> iterator = set.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            int hashCode;
            if (next != null) {
                hashCode = next.hashCode();
            }
            else {
                hashCode = 0;
            }
            n += hashCode;
        }
        return n;
    }
    
    public static e e(final Set set, final Set set2) {
        m.k(set, "set1");
        m.k(set2, "set2");
        return (e)new e() {
            public g0 a() {
                return new X2.b() {
                    public final Iterator q = set.iterator();
                    
                    @Override
                    public Object b() {
                        while (this.q.hasNext()) {
                            final Object next = this.q.next();
                            if (set2.contains(next)) {
                                return next;
                            }
                        }
                        return this.d();
                    }
                };
            }
            
            @Override
            public boolean contains(final Object o) {
                return set.contains(o) && set2.contains(o);
            }
            
            @Override
            public boolean containsAll(final Collection collection) {
                return set.containsAll(collection) && set2.containsAll(collection);
            }
            
            @Override
            public boolean isEmpty() {
                return Collections.disjoint(set2, set);
            }
            
            @Override
            public int size() {
                final Iterator<Object> iterator = set.iterator();
                int n = 0;
                while (iterator.hasNext()) {
                    if (set2.contains(iterator.next())) {
                        ++n;
                    }
                }
                return n;
            }
        };
    }
    
    public static HashSet f() {
        return new HashSet();
    }
    
    public static HashSet g(final int n) {
        return new HashSet(G.a(n));
    }
    
    public static Set h() {
        return Collections.newSetFromMap((Map<Object, Boolean>)G.g());
    }
    
    public static boolean i(final Set set, final Collection collection) {
        m.j(collection);
        Object u = collection;
        if (collection instanceof L) {
            u = ((L)collection).u();
        }
        if (u instanceof Set && ((Collection)u).size() > set.size()) {
            return C.q(set.iterator(), (Collection)u);
        }
        return j(set, ((Collection)u).iterator());
    }
    
    public static boolean j(final Set set, final Iterator iterator) {
        boolean b = false;
        while (iterator.hasNext()) {
            b |= set.remove(iterator.next());
        }
        return b;
    }
    
    public static class b extends a implements Set
    {
        public b(final Set set, final n n) {
            super(set, n);
        }
        
        @Override
        public boolean equals(final Object o) {
            return a0.a(this, o);
        }
        
        @Override
        public int hashCode() {
            return a0.d(this);
        }
    }
    
    public static class c extends b implements SortedSet
    {
        public c(final SortedSet set, final n n) {
            super(set, n);
        }
        
        @Override
        public Comparator comparator() {
            return ((SortedSet)super.o).comparator();
        }
        
        @Override
        public Object first() {
            return C.j(super.o.iterator(), super.p);
        }
        
        @Override
        public SortedSet headSet(final Object o) {
            return new c(((SortedSet)super.o).headSet(o), super.p);
        }
        
        @Override
        public Object last() {
            SortedSet<Object> headSet = (SortedSet<Object>)super.o;
            Object last;
            while (true) {
                last = headSet.last();
                if (super.p.apply(last)) {
                    break;
                }
                headSet = headSet.headSet(last);
            }
            return last;
        }
        
        @Override
        public SortedSet subSet(final Object o, final Object o2) {
            return new c(((SortedSet)super.o).subSet(o, o2), super.p);
        }
        
        @Override
        public SortedSet tailSet(final Object o) {
            return new c(((SortedSet)super.o).tailSet(o), super.p);
        }
    }
    
    public abstract static class d extends AbstractSet
    {
        @Override
        public boolean removeAll(final Collection collection) {
            return a0.i(this, collection);
        }
        
        @Override
        public boolean retainAll(final Collection collection) {
            return super.retainAll((Collection<?>)m.j(collection));
        }
    }
    
    public abstract static class e extends AbstractSet
    {
        @Override
        public final boolean add(final Object o) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public final boolean addAll(final Collection collection) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public final void clear() {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public final boolean remove(final Object o) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public final boolean removeAll(final Collection collection) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public final boolean retainAll(final Collection collection) {
            throw new UnsupportedOperationException();
        }
    }
}
