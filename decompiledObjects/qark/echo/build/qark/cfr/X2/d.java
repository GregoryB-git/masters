/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.AssertionError
 *  java.lang.Object
 *  java.lang.String
 *  java.util.AbstractCollection
 *  java.util.Collection
 *  java.util.Comparator
 *  java.util.ConcurrentModificationException
 *  java.util.Iterator
 *  java.util.List
 *  java.util.ListIterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.NavigableMap
 *  java.util.NavigableSet
 *  java.util.Objects
 *  java.util.RandomAccess
 *  java.util.Set
 *  java.util.SortedMap
 *  java.util.SortedSet
 */
package X2;

import W2.m;
import X2.C;
import X2.G;
import X2.N;
import X2.f;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

public abstract class d
extends X2.f
implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map r;
    public transient int s;

    public d(Map map) {
        m.d(map.isEmpty());
        this.r = map;
    }

    public static /* synthetic */ int j(d d8) {
        int n8 = d8.s;
        d8.s = n8 + 1;
        return n8;
    }

    public static /* synthetic */ int k(d d8) {
        int n8 = d8.s;
        d8.s = n8 - 1;
        return n8;
    }

    public static /* synthetic */ int l(d d8, int n8) {
        d8.s = n8 = d8.s + n8;
        return n8;
    }

    public static /* synthetic */ int m(d d8, int n8) {
        d8.s = n8 = d8.s - n8;
        return n8;
    }

    public static Iterator t(Collection collection) {
        if (collection instanceof List) {
            return ((List)collection).listIterator();
        }
        return collection.iterator();
    }

    @Override
    public void clear() {
        Iterator iterator = this.r.values().iterator();
        while (iterator.hasNext()) {
            ((Collection)iterator.next()).clear();
        }
        this.r.clear();
        this.s = 0;
    }

    @Override
    public Collection e() {
        return new f.a((X2.f)this);
    }

    @Override
    public Iterator g() {
        return new c(this){

            @Override
            public Object b(Object object, Object object2) {
                return object2;
            }
        };
    }

    public Map o() {
        return this.r;
    }

    public abstract Collection p();

    @Override
    public boolean put(Object object, Object object2) {
        Collection collection = (Collection)this.r.get(object);
        if (collection == null) {
            collection = this.q(object);
            if (collection.add(object2)) {
                ++this.s;
                this.r.put(object, (Object)collection);
                return true;
            }
            throw new AssertionError((Object)"New Collection violated the Collection spec");
        }
        if (collection.add(object2)) {
            ++this.s;
            return true;
        }
        return false;
    }

    public Collection q(Object object) {
        return this.p();
    }

    public final Map r() {
        Map map = this.r;
        if (map instanceof NavigableMap) {
            return new e((NavigableMap)this.r);
        }
        if (map instanceof SortedMap) {
            return new h((SortedMap)this.r);
        }
        return new b(this.r);
    }

    public final Set s() {
        Map map = this.r;
        if (map instanceof NavigableMap) {
            return new f((NavigableMap)this.r);
        }
        if (map instanceof SortedMap) {
            return new i((SortedMap)this.r);
        }
        return new d(this.r);
    }

    @Override
    public int size() {
        return this.s;
    }

    public final void u(Object object) {
        if ((object = (Collection)G.j(this.r, object)) != null) {
            int n8 = object.size();
            object.clear();
            this.s -= n8;
        }
    }

    public final void v(Map map) {
        this.r = map;
        this.s = 0;
        for (Collection collection : map.values()) {
            m.d(collection.isEmpty() ^ true);
            this.s += collection.size();
        }
    }

    @Override
    public Collection values() {
        return super.values();
    }

    public abstract Collection w(Collection var1);

    public abstract Collection x(Object var1, Collection var2);

    public final List y(Object object, List list, j j8) {
        if (list instanceof RandomAccess) {
            return new g(this, object, list, j8);
        }
        return new k(object, list, j8);
    }

    public class X2.d$b
    extends G.f {
        public final transient Map q;

        public X2.d$b(Map map) {
            this.q = map;
        }

        @Override
        public Set a() {
            return new a();
        }

        public Collection c(Object object) {
            Collection collection = (Collection)G.i(this.q, object);
            if (collection == null) {
                return null;
            }
            return d.this.x(object, collection);
        }

        public void clear() {
            if (this.q == d.this.r) {
                d.this.clear();
                return;
            }
            C.c(new b());
        }

        public boolean containsKey(Object object) {
            return G.h(this.q, object);
        }

        public Collection d(Object object) {
            if ((object = (Collection)this.q.remove(object)) == null) {
                return null;
            }
            Collection collection = d.this.p();
            collection.addAll((Collection)object);
            d.m(d.this, object.size());
            object.clear();
            return collection;
        }

        public Map.Entry e(Map.Entry entry) {
            Object object = entry.getKey();
            return G.d(object, (Object)d.this.x(object, (Collection)entry.getValue()));
        }

        public boolean equals(Object object) {
            if (this != object && !this.q.equals(object)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.q.hashCode();
        }

        public Set keySet() {
            return d.this.f();
        }

        public int size() {
            return this.q.size();
        }

        public String toString() {
            return this.q.toString();
        }

        public class a
        extends G.c {
            @Override
            public Map a() {
                return b.this;
            }

            @Override
            public boolean contains(Object object) {
                return X2.j.c((Collection)b.this.q.entrySet(), object);
            }

            public Iterator iterator() {
                return new b();
            }

            public boolean remove(Object object) {
                if (!this.contains(object)) {
                    return false;
                }
                object = (Map.Entry)object;
                Objects.requireNonNull((Object)object);
                object = (Map.Entry)object;
                d.this.u(object.getKey());
                return true;
            }
        }

        public class b
        implements Iterator {
            public final Iterator o;
            public Collection p;

            public b() {
                this.o = b.this.q.entrySet().iterator();
            }

            public Map.Entry b() {
                Map.Entry entry = (Map.Entry)this.o.next();
                this.p = (Collection)entry.getValue();
                return b.this.e(entry);
            }

            public boolean hasNext() {
                return this.o.hasNext();
            }

            public void remove() {
                boolean bl = this.p != null;
                m.p(bl, "no calls to next() since the last call to remove()");
                this.o.remove();
                d.m(d.this, this.p.size());
                this.p.clear();
                this.p = null;
            }
        }

    }

    public abstract class c
    implements Iterator {
        public final Iterator o;
        public Object p;
        public Collection q;
        public Iterator r;

        public c() {
            this.o = d.this.r.entrySet().iterator();
            this.p = null;
            this.q = null;
            this.r = C.h();
        }

        public abstract Object b(Object var1, Object var2);

        public boolean hasNext() {
            if (!this.o.hasNext() && !this.r.hasNext()) {
                return false;
            }
            return true;
        }

        public Object next() {
            if (!this.r.hasNext()) {
                Map.Entry entry = (Map.Entry)this.o.next();
                this.p = entry.getKey();
                entry = (Collection)entry.getValue();
                this.q = entry;
                this.r = entry.iterator();
            }
            return this.b(N.a(this.p), this.r.next());
        }

        public void remove() {
            this.r.remove();
            Collection collection = this.q;
            Objects.requireNonNull((Object)collection);
            if (collection.isEmpty()) {
                this.o.remove();
            }
            d.k(d.this);
        }
    }

    public class d
    extends G.d {
        public d(Map map) {
            super(map);
        }

        public void clear() {
            C.c(this.iterator());
        }

        public boolean containsAll(Collection collection) {
            return this.a().keySet().containsAll(collection);
        }

        public boolean equals(Object object) {
            if (this != object && !this.a().keySet().equals(object)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.a().keySet().hashCode();
        }

        public Iterator iterator() {
            return new Iterator(this.a().entrySet().iterator()){
                public Map.Entry o;
                public final /* synthetic */ Iterator p;
                {
                    this.p = iterator;
                }

                public boolean hasNext() {
                    return this.p.hasNext();
                }

                public Object next() {
                    Map.Entry entry;
                    this.o = entry = (Map.Entry)this.p.next();
                    return entry.getKey();
                }

                public void remove() {
                    boolean bl = this.o != null;
                    m.p(bl, "no calls to next() since the last call to remove()");
                    Collection collection = (Collection)this.o.getValue();
                    this.p.remove();
                    d.m(d.this, collection.size());
                    collection.clear();
                    this.o = null;
                }
            };
        }

        public boolean remove(Object object) {
            object = (Collection)this.a().remove(object);
            if (object != null) {
                int n8 = object.size();
                object.clear();
                d.m(d.this, n8);
                if (n8 > 0) {
                    return true;
                }
            }
            return false;
        }

    }

    public final class e
    extends h
    implements NavigableMap {
        public e(NavigableMap navigableMap) {
            super((SortedMap)navigableMap);
        }

        public Map.Entry ceilingEntry(Object object) {
            object = this.m().ceilingEntry(object);
            if (object == null) {
                return null;
            }
            return this.e((Map.Entry)object);
        }

        public Object ceilingKey(Object object) {
            return this.m().ceilingKey(object);
        }

        public NavigableSet descendingKeySet() {
            return this.descendingMap().navigableKeySet();
        }

        public NavigableMap descendingMap() {
            return new e(this.m().descendingMap());
        }

        public Map.Entry firstEntry() {
            Map.Entry entry = this.m().firstEntry();
            if (entry == null) {
                return null;
            }
            return this.e(entry);
        }

        public Map.Entry floorEntry(Object object) {
            object = this.m().floorEntry(object);
            if (object == null) {
                return null;
            }
            return this.e((Map.Entry)object);
        }

        public Object floorKey(Object object) {
            return this.m().floorKey(object);
        }

        public NavigableMap headMap(Object object, boolean bl) {
            return new e(this.m().headMap(object, bl));
        }

        public Map.Entry higherEntry(Object object) {
            object = this.m().higherEntry(object);
            if (object == null) {
                return null;
            }
            return this.e((Map.Entry)object);
        }

        public Object higherKey(Object object) {
            return this.m().higherKey(object);
        }

        public NavigableSet i() {
            return new f(this.m());
        }

        public NavigableMap j(Object object) {
            return this.headMap(object, false);
        }

        public NavigableSet k() {
            return (NavigableSet)super.g();
        }

        public Map.Entry l(Iterator iterator) {
            if (!iterator.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry)iterator.next();
            Collection collection = d.this.p();
            collection.addAll((Collection)entry.getValue());
            iterator.remove();
            return G.d(entry.getKey(), (Object)d.this.w(collection));
        }

        public Map.Entry lastEntry() {
            Map.Entry entry = this.m().lastEntry();
            if (entry == null) {
                return null;
            }
            return this.e(entry);
        }

        public Map.Entry lowerEntry(Object object) {
            object = this.m().lowerEntry(object);
            if (object == null) {
                return null;
            }
            return this.e((Map.Entry)object);
        }

        public Object lowerKey(Object object) {
            return this.m().lowerKey(object);
        }

        public NavigableMap m() {
            return (NavigableMap)super.h();
        }

        public NavigableMap n(Object object, Object object2) {
            return this.subMap(object, true, object2, false);
        }

        public NavigableSet navigableKeySet() {
            return this.k();
        }

        public NavigableMap o(Object object) {
            return this.tailMap(object, true);
        }

        public Map.Entry pollFirstEntry() {
            return this.l(this.entrySet().iterator());
        }

        public Map.Entry pollLastEntry() {
            return this.l(this.descendingMap().entrySet().iterator());
        }

        public NavigableMap subMap(Object object, boolean bl, Object object2, boolean bl2) {
            return new e(this.m().subMap(object, bl, object2, bl2));
        }

        public NavigableMap tailMap(Object object, boolean bl) {
            return new e(this.m().tailMap(object, bl));
        }
    }

    public final class f
    extends i
    implements NavigableSet {
        public f(NavigableMap navigableMap) {
            super((SortedMap)navigableMap);
        }

        public Object ceiling(Object object) {
            return this.g().ceilingKey(object);
        }

        public Iterator descendingIterator() {
            return this.descendingSet().iterator();
        }

        public NavigableSet descendingSet() {
            return new f(this.g().descendingMap());
        }

        public NavigableSet f(Object object) {
            return this.headSet(object, false);
        }

        public Object floor(Object object) {
            return this.g().floorKey(object);
        }

        public NavigableMap g() {
            return (NavigableMap)super.d();
        }

        public NavigableSet headSet(Object object, boolean bl) {
            return new f(this.g().headMap(object, bl));
        }

        public Object higher(Object object) {
            return this.g().higherKey(object);
        }

        public NavigableSet i(Object object, Object object2) {
            return this.subSet(object, true, object2, false);
        }

        public NavigableSet k(Object object) {
            return this.tailSet(object, true);
        }

        public Object lower(Object object) {
            return this.g().lowerKey(object);
        }

        public Object pollFirst() {
            return C.p(this.iterator());
        }

        public Object pollLast() {
            return C.p(this.descendingIterator());
        }

        public NavigableSet subSet(Object object, boolean bl, Object object2, boolean bl2) {
            return new f(this.g().subMap(object, bl, object2, bl2));
        }

        public NavigableSet tailSet(Object object, boolean bl) {
            return new f(this.g().tailMap(object, bl));
        }
    }

    public class g
    extends k
    implements RandomAccess {
        public g(d d8, Object object, List list, j j8) {
            super(object, list, j8);
        }
    }

    public class h
    extends b
    implements SortedMap {
        public SortedSet s;

        public h(SortedMap sortedMap) {
            super((Map)sortedMap);
        }

        public Comparator comparator() {
            return this.h().comparator();
        }

        public SortedSet f() {
            return new i(this.h());
        }

        public Object firstKey() {
            return this.h().firstKey();
        }

        public SortedSet g() {
            SortedSet sortedSet;
            SortedSet sortedSet2 = sortedSet = this.s;
            if (sortedSet == null) {
                this.s = sortedSet2 = this.f();
            }
            return sortedSet2;
        }

        public SortedMap h() {
            return (SortedMap)this.q;
        }

        public SortedMap headMap(Object object) {
            return new h(this.h().headMap(object));
        }

        public Object lastKey() {
            return this.h().lastKey();
        }

        public SortedMap subMap(Object object, Object object2) {
            return new h(this.h().subMap(object, object2));
        }

        public SortedMap tailMap(Object object) {
            return new h(this.h().tailMap(object));
        }
    }

    public class i
    extends d
    implements SortedSet {
        public i(SortedMap sortedMap) {
            super((Map)sortedMap);
        }

        public Comparator comparator() {
            return this.d().comparator();
        }

        public SortedMap d() {
            return (SortedMap)G.d.super.a();
        }

        public Object first() {
            return this.d().firstKey();
        }

        public SortedSet headSet(Object object) {
            return new i(this.d().headMap(object));
        }

        public Object last() {
            return this.d().lastKey();
        }

        public SortedSet subSet(Object object, Object object2) {
            return new i(this.d().subMap(object, object2));
        }

        public SortedSet tailSet(Object object) {
            return new i(this.d().tailMap(object));
        }
    }

    public abstract class j
    extends AbstractCollection {
        public final Object o;
        public Collection p;
        public final j q;
        public final Collection r;

        public j(Object object, Collection collection, j j8) {
            this.o = object;
            this.p = collection;
            this.q = j8;
            d.this = j8 == null ? null : j8.f();
            this.r = d.this;
        }

        public void a() {
            j j8 = this.q;
            if (j8 != null) {
                j8.a();
                return;
            }
            d.this.r.put(this.o, (Object)this.p);
        }

        public boolean add(Object object) {
            this.i();
            boolean bl = this.p.isEmpty();
            boolean bl2 = this.p.add(object);
            if (bl2) {
                d.j(d.this);
                if (bl) {
                    this.a();
                }
            }
            return bl2;
        }

        public boolean addAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int n8 = this.size();
            boolean bl = this.p.addAll(collection);
            if (bl) {
                int n9 = this.p.size();
                d.l(d.this, n9 - n8);
                if (n8 == 0) {
                    this.a();
                }
            }
            return bl;
        }

        public void clear() {
            int n8 = this.size();
            if (n8 == 0) {
                return;
            }
            this.p.clear();
            d.m(d.this, n8);
            this.k();
        }

        public boolean contains(Object object) {
            this.i();
            return this.p.contains(object);
        }

        public boolean containsAll(Collection collection) {
            this.i();
            return this.p.containsAll(collection);
        }

        public j d() {
            return this.q;
        }

        public boolean equals(Object object) {
            if (object == this) {
                return true;
            }
            this.i();
            return this.p.equals(object);
        }

        public Collection f() {
            return this.p;
        }

        public Object g() {
            return this.o;
        }

        public int hashCode() {
            this.i();
            return this.p.hashCode();
        }

        public void i() {
            j j8 = this.q;
            if (j8 != null) {
                j8.i();
                if (this.q.f() == this.r) {
                    return;
                }
                throw new ConcurrentModificationException();
            }
            if (this.p.isEmpty() && (j8 = (Collection)d.this.r.get(this.o)) != null) {
                this.p = j8;
            }
        }

        public Iterator iterator() {
            this.i();
            return new a(this);
        }

        public void k() {
            j j8 = this.q;
            if (j8 != null) {
                j8.k();
                return;
            }
            if (this.p.isEmpty()) {
                d.this.r.remove(this.o);
            }
        }

        public boolean remove(Object object) {
            this.i();
            boolean bl = this.p.remove(object);
            if (bl) {
                d.k(d.this);
                this.k();
            }
            return bl;
        }

        public boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int n8 = this.size();
            boolean bl = this.p.removeAll(collection);
            if (bl) {
                int n9 = this.p.size();
                d.l(d.this, n9 - n8);
                this.k();
            }
            return bl;
        }

        public boolean retainAll(Collection collection) {
            m.j((Object)collection);
            int n8 = this.size();
            boolean bl = this.p.retainAll(collection);
            if (bl) {
                int n9 = this.p.size();
                d.l(d.this, n9 - n8);
                this.k();
            }
            return bl;
        }

        public int size() {
            this.i();
            return this.p.size();
        }

        public String toString() {
            this.i();
            return this.p.toString();
        }

        public class a
        implements Iterator {
            public final Iterator o;
            public final Collection p;
            public final /* synthetic */ j q;

            public a(j j8) {
                this.q = j8;
                j8 = j8.p;
                this.p = j8;
                this.o = d.t((Collection)j8);
            }

            public a(j j8, Iterator iterator) {
                this.q = j8;
                this.p = j8.p;
                this.o = iterator;
            }

            public Iterator b() {
                this.d();
                return this.o;
            }

            public void d() {
                this.q.i();
                if (this.q.p == this.p) {
                    return;
                }
                throw new ConcurrentModificationException();
            }

            public boolean hasNext() {
                this.d();
                return this.o.hasNext();
            }

            public Object next() {
                this.d();
                return this.o.next();
            }

            public void remove() {
                this.o.remove();
                d.k(this.q.d.this);
                this.q.k();
            }
        }

    }

    public class k
    extends j
    implements List {
        public k(Object object, List list, j j8) {
            super(object, (Collection)list, j8);
        }

        public void add(int n8, Object object) {
            this.i();
            boolean bl = this.f().isEmpty();
            this.q().add(n8, object);
            d.j(d.this);
            if (bl) {
                this.a();
            }
        }

        public boolean addAll(int n8, Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int n9 = this.size();
            boolean bl = this.q().addAll(n8, collection);
            if (bl) {
                n8 = this.f().size();
                d.l(d.this, n8 - n9);
                if (n9 == 0) {
                    this.a();
                }
            }
            return bl;
        }

        public Object get(int n8) {
            this.i();
            return this.q().get(n8);
        }

        public int indexOf(Object object) {
            this.i();
            return this.q().indexOf(object);
        }

        public int lastIndexOf(Object object) {
            this.i();
            return this.q().lastIndexOf(object);
        }

        public ListIterator listIterator() {
            this.i();
            return new a(this);
        }

        public ListIterator listIterator(int n8) {
            this.i();
            return new a(this, n8);
        }

        public List q() {
            return (List)this.f();
        }

        public Object remove(int n8) {
            this.i();
            Object object = this.q().remove(n8);
            d.k(d.this);
            this.k();
            return object;
        }

        public Object set(int n8, Object object) {
            this.i();
            return this.q().set(n8, object);
        }

        public List subList(int n8, int n9) {
            this.i();
            d d8 = d.this;
            Object object = this.g();
            List list = this.q().subList(n8, n9);
            j j8 = this.d() == null ? this : this.d();
            return d8.y(object, list, j8);
        }

        public class a
        extends j.a
        implements ListIterator {
            public final /* synthetic */ k r;

            public a(k k8) {
                this.r = k8;
                super(k8);
            }

            public a(k k8, int n8) {
                this.r = k8;
                super(k8, (Iterator)k8.q().listIterator(n8));
            }

            public void add(Object object) {
                boolean bl = this.r.isEmpty();
                this.e().add(object);
                d.j(this.r.d.this);
                if (bl) {
                    this.r.a();
                }
            }

            public final ListIterator e() {
                return (ListIterator)this.b();
            }

            public boolean hasPrevious() {
                return this.e().hasPrevious();
            }

            public int nextIndex() {
                return this.e().nextIndex();
            }

            public Object previous() {
                return this.e().previous();
            }

            public int previousIndex() {
                return this.e().previousIndex();
            }

            public void set(Object object) {
                this.e().set(object);
            }
        }

    }

}

