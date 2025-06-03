// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import java.util.AbstractSequentialList;
import java.io.Serializable;
import java.util.AbstractList;
import W2.g;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Iterator;
import W2.k;
import java.util.RandomAccess;
import W2.m;
import a3.f;
import java.util.List;

public abstract class E
{
    public static List a(final Iterable iterable) {
        return (List)iterable;
    }
    
    public static int b(final int n) {
        i.b(n, "arraySize");
        return f.m(n + 5L + n / 10);
    }
    
    public static boolean c(final List list, final Object o) {
        if (o == m.j(list)) {
            return true;
        }
        if (!(o instanceof List)) {
            return false;
        }
        final List list2 = (List)o;
        final int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (list instanceof RandomAccess && list2 instanceof RandomAccess) {
            for (int i = 0; i < size; ++i) {
                if (!k.a(list.get(i), list2.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return C.e(list.iterator(), list2.iterator());
    }
    
    public static int d(final List list, final Object o) {
        if (list instanceof RandomAccess) {
            return e(list, o);
        }
        final ListIterator<Object> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (k.a(o, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }
    
    public static int e(final List list, final Object o) {
        final int size = list.size();
        int i = 0;
        final int n = 0;
        if (o == null) {
            for (int j = n; j < size; ++j) {
                if (list.get(j) == null) {
                    return j;
                }
            }
        }
        else {
            while (i < size) {
                if (o.equals(list.get(i))) {
                    return i;
                }
                ++i;
            }
        }
        return -1;
    }
    
    public static int f(final List list, final Object o) {
        if (list instanceof RandomAccess) {
            return g(list, o);
        }
        final ListIterator<Object> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (k.a(o, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }
    
    public static int g(final List list, final Object o) {
        if (o == null) {
            for (int i = list.size() - 1; i >= 0; --i) {
                if (list.get(i) == null) {
                    return i;
                }
            }
        }
        else {
            for (int j = list.size() - 1; j >= 0; --j) {
                if (o.equals(list.get(j))) {
                    return j;
                }
            }
        }
        return -1;
    }
    
    public static ArrayList h() {
        return new ArrayList();
    }
    
    public static ArrayList i(final Iterator iterator) {
        final ArrayList h = h();
        C.a(h, iterator);
        return h;
    }
    
    public static ArrayList j(final Object... elements) {
        m.j(elements);
        final ArrayList<Object> c = new ArrayList<Object>(b(elements.length));
        Collections.addAll(c, elements);
        return c;
    }
    
    public static List k(final List list, final g g) {
        if (list instanceof RandomAccess) {
            return new a(list, g);
        }
        return new b(list, g);
    }
    
    public static class a extends AbstractList implements RandomAccess, Serializable
    {
        private static final long serialVersionUID = 0L;
        public final List o;
        public final g p;
        
        public a(final List list, final g g) {
            this.o = (List)m.j(list);
            this.p = (g)m.j(g);
        }
        
        @Override
        public Object get(final int n) {
            return this.p.apply(this.o.get(n));
        }
        
        @Override
        public boolean isEmpty() {
            return this.o.isEmpty();
        }
        
        @Override
        public Iterator iterator() {
            return this.listIterator();
        }
        
        @Override
        public ListIterator listIterator(final int n) {
            return new f0(this.o.listIterator(n)) {
                @Override
                public Object b(final Object o) {
                    return a.this.p.apply(o);
                }
            };
        }
        
        @Override
        public Object remove(final int n) {
            return this.p.apply(this.o.remove(n));
        }
        
        public void removeRange(final int n, final int n2) {
            this.o.subList(n, n2).clear();
        }
        
        @Override
        public int size() {
            return this.o.size();
        }
    }
    
    public static class b extends AbstractSequentialList implements Serializable
    {
        private static final long serialVersionUID = 0L;
        public final List o;
        public final g p;
        
        public b(final List list, final g g) {
            this.o = (List)m.j(list);
            this.p = (g)m.j(g);
        }
        
        @Override
        public ListIterator listIterator(final int n) {
            return new f0(this.o.listIterator(n)) {
                @Override
                public Object b(final Object o) {
                    return b.this.p.apply(o);
                }
            };
        }
        
        public void removeRange(final int n, final int n2) {
            this.o.subList(n, n2).clear();
        }
        
        @Override
        public int size() {
            return this.o.size();
        }
    }
}
