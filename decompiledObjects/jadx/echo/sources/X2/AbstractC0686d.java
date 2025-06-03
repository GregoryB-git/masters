package X2;

import X2.AbstractC0688f;
import X2.G;
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

/* renamed from: X2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0686d extends AbstractC0688f implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* renamed from: r, reason: collision with root package name */
    public transient Map f7112r;

    /* renamed from: s, reason: collision with root package name */
    public transient int f7113s;

    /* renamed from: X2.d$b */
    public class b extends G.f {

        /* renamed from: q, reason: collision with root package name */
        public final transient Map f7114q;

        /* renamed from: X2.d$b$a */
        public class a extends G.c {
            public a() {
            }

            @Override // X2.G.c
            public Map a() {
                return b.this;
            }

            @Override // X2.G.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return AbstractC0692j.c(b.this.f7114q.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return b.this.new C0125b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractC0686d.this.u(entry.getKey());
                return true;
            }
        }

        /* renamed from: X2.d$b$b, reason: collision with other inner class name */
        public class C0125b implements Iterator {

            /* renamed from: o, reason: collision with root package name */
            public final Iterator f7117o;

            /* renamed from: p, reason: collision with root package name */
            public Collection f7118p;

            public C0125b() {
                this.f7117o = b.this.f7114q.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                Map.Entry entry = (Map.Entry) this.f7117o.next();
                this.f7118p = (Collection) entry.getValue();
                return b.this.e(entry);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f7117o.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                W2.m.p(this.f7118p != null, "no calls to next() since the last call to remove()");
                this.f7117o.remove();
                AbstractC0686d.m(AbstractC0686d.this, this.f7118p.size());
                this.f7118p.clear();
                this.f7118p = null;
            }
        }

        public b(Map map) {
            this.f7114q = map;
        }

        @Override // X2.G.f
        public Set a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Collection get(Object obj) {
            Collection collection = (Collection) G.i(this.f7114q, obj);
            if (collection == null) {
                return null;
            }
            return AbstractC0686d.this.x(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f7114q == AbstractC0686d.this.f7112r) {
                AbstractC0686d.this.clear();
            } else {
                C.c(new C0125b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return G.h(this.f7114q, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Collection remove(Object obj) {
            Collection collection = (Collection) this.f7114q.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection p7 = AbstractC0686d.this.p();
            p7.addAll(collection);
            AbstractC0686d.m(AbstractC0686d.this, collection.size());
            collection.clear();
            return p7;
        }

        public Map.Entry e(Map.Entry entry) {
            Object key = entry.getKey();
            return G.d(key, AbstractC0686d.this.x(key, (Collection) entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f7114q.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f7114q.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set keySet() {
            return AbstractC0686d.this.f();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f7114q.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f7114q.toString();
        }
    }

    /* renamed from: X2.d$c */
    public abstract class c implements Iterator {

        /* renamed from: o, reason: collision with root package name */
        public final Iterator f7120o;

        /* renamed from: p, reason: collision with root package name */
        public Object f7121p = null;

        /* renamed from: q, reason: collision with root package name */
        public Collection f7122q = null;

        /* renamed from: r, reason: collision with root package name */
        public Iterator f7123r = C.h();

        public c() {
            this.f7120o = AbstractC0686d.this.f7112r.entrySet().iterator();
        }

        public abstract Object b(Object obj, Object obj2);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7120o.hasNext() || this.f7123r.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f7123r.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f7120o.next();
                this.f7121p = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                this.f7122q = collection;
                this.f7123r = collection.iterator();
            }
            return b(N.a(this.f7121p), this.f7123r.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f7123r.remove();
            Collection collection = this.f7122q;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f7120o.remove();
            }
            AbstractC0686d.k(AbstractC0686d.this);
        }
    }

    /* renamed from: X2.d$d, reason: collision with other inner class name */
    public class C0126d extends G.d {

        /* renamed from: X2.d$d$a */
        public class a implements Iterator {

            /* renamed from: o, reason: collision with root package name */
            public Map.Entry f7126o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ Iterator f7127p;

            public a(Iterator it) {
                this.f7127p = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f7127p.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                Map.Entry entry = (Map.Entry) this.f7127p.next();
                this.f7126o = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                W2.m.p(this.f7126o != null, "no calls to next() since the last call to remove()");
                Collection collection = (Collection) this.f7126o.getValue();
                this.f7127p.remove();
                AbstractC0686d.m(AbstractC0686d.this, collection.size());
                collection.clear();
                this.f7126o = null;
            }
        }

        public C0126d(Map map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C.c(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return a().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || a().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return a().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a(a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Collection collection = (Collection) a().remove(obj);
            if (collection != null) {
                int size = collection.size();
                collection.clear();
                AbstractC0686d.m(AbstractC0686d.this, size);
                if (size > 0) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: X2.d$e */
    public final class e extends h implements NavigableMap {
        public e(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry ceilingEntry(Object obj) {
            Map.Entry ceilingEntry = h().ceilingEntry(obj);
            if (ceilingEntry == null) {
                return null;
            }
            return e(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public Object ceilingKey(Object obj) {
            return h().ceilingKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableSet descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap descendingMap() {
            return AbstractC0686d.this.new e(h().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry firstEntry() {
            Map.Entry firstEntry = h().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return e(firstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry floorEntry(Object obj) {
            Map.Entry floorEntry = h().floorEntry(obj);
            if (floorEntry == null) {
                return null;
            }
            return e(floorEntry);
        }

        @Override // java.util.NavigableMap
        public Object floorKey(Object obj) {
            return h().floorKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableMap headMap(Object obj, boolean z7) {
            return AbstractC0686d.this.new e(h().headMap(obj, z7));
        }

        @Override // java.util.NavigableMap
        public Map.Entry higherEntry(Object obj) {
            Map.Entry higherEntry = h().higherEntry(obj);
            if (higherEntry == null) {
                return null;
            }
            return e(higherEntry);
        }

        @Override // java.util.NavigableMap
        public Object higherKey(Object obj) {
            return h().higherKey(obj);
        }

        @Override // X2.AbstractC0686d.h
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public NavigableSet f() {
            return AbstractC0686d.this.new f(h());
        }

        @Override // X2.AbstractC0686d.h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // X2.AbstractC0686d.h, X2.AbstractC0686d.b, java.util.AbstractMap, java.util.Map
        /* renamed from: k, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet keySet() {
            return (NavigableSet) super.keySet();
        }

        public Map.Entry l(Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Collection p7 = AbstractC0686d.this.p();
            p7.addAll((Collection) entry.getValue());
            it.remove();
            return G.d(entry.getKey(), AbstractC0686d.this.w(p7));
        }

        @Override // java.util.NavigableMap
        public Map.Entry lastEntry() {
            Map.Entry lastEntry = h().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return e(lastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry lowerEntry(Object obj) {
            Map.Entry lowerEntry = h().lowerEntry(obj);
            if (lowerEntry == null) {
                return null;
            }
            return e(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public Object lowerKey(Object obj) {
            return h().lowerKey(obj);
        }

        @Override // X2.AbstractC0686d.h
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public NavigableMap h() {
            return (NavigableMap) super.h();
        }

        @Override // X2.AbstractC0686d.h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public NavigableMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // java.util.NavigableMap
        public NavigableSet navigableKeySet() {
            return g();
        }

        @Override // X2.AbstractC0686d.h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public NavigableMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollFirstEntry() {
            return l(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollLastEntry() {
            return l(descendingMap().entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public NavigableMap subMap(Object obj, boolean z7, Object obj2, boolean z8) {
            return AbstractC0686d.this.new e(h().subMap(obj, z7, obj2, z8));
        }

        @Override // java.util.NavigableMap
        public NavigableMap tailMap(Object obj, boolean z7) {
            return AbstractC0686d.this.new e(h().tailMap(obj, z7));
        }
    }

    /* renamed from: X2.d$f */
    public final class f extends i implements NavigableSet {
        public f(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public Object ceiling(Object obj) {
            return d().ceilingKey(obj);
        }

        @Override // java.util.NavigableSet
        public Iterator descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet descendingSet() {
            return AbstractC0686d.this.new f(d().descendingMap());
        }

        @Override // X2.AbstractC0686d.i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        public Object floor(Object obj) {
            return d().floorKey(obj);
        }

        @Override // X2.AbstractC0686d.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableMap d() {
            return (NavigableMap) super.d();
        }

        @Override // java.util.NavigableSet
        public NavigableSet headSet(Object obj, boolean z7) {
            return AbstractC0686d.this.new f(d().headMap(obj, z7));
        }

        @Override // java.util.NavigableSet
        public Object higher(Object obj) {
            return d().higherKey(obj);
        }

        @Override // X2.AbstractC0686d.i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public NavigableSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // X2.AbstractC0686d.i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public NavigableSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public Object lower(Object obj) {
            return d().lowerKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object pollFirst() {
            return C.p(iterator());
        }

        @Override // java.util.NavigableSet
        public Object pollLast() {
            return C.p(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet subSet(Object obj, boolean z7, Object obj2, boolean z8) {
            return AbstractC0686d.this.new f(d().subMap(obj, z7, obj2, z8));
        }

        @Override // java.util.NavigableSet
        public NavigableSet tailSet(Object obj, boolean z7) {
            return AbstractC0686d.this.new f(d().tailMap(obj, z7));
        }
    }

    /* renamed from: X2.d$g */
    public class g extends k implements RandomAccess {
        public g(AbstractC0686d abstractC0686d, Object obj, List list, j jVar) {
            super(obj, list, jVar);
        }
    }

    /* renamed from: X2.d$h */
    public class h extends b implements SortedMap {

        /* renamed from: s, reason: collision with root package name */
        public SortedSet f7131s;

        public h(SortedMap sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            return h().comparator();
        }

        public SortedSet f() {
            return AbstractC0686d.this.new i(h());
        }

        @Override // java.util.SortedMap
        public Object firstKey() {
            return h().firstKey();
        }

        @Override // X2.AbstractC0686d.b, java.util.AbstractMap, java.util.Map
        /* renamed from: g */
        public SortedSet keySet() {
            SortedSet sortedSet = this.f7131s;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet f7 = f();
            this.f7131s = f7;
            return f7;
        }

        public SortedMap h() {
            return (SortedMap) this.f7114q;
        }

        public SortedMap headMap(Object obj) {
            return AbstractC0686d.this.new h(h().headMap(obj));
        }

        @Override // java.util.SortedMap
        public Object lastKey() {
            return h().lastKey();
        }

        public SortedMap subMap(Object obj, Object obj2) {
            return AbstractC0686d.this.new h(h().subMap(obj, obj2));
        }

        public SortedMap tailMap(Object obj) {
            return AbstractC0686d.this.new h(h().tailMap(obj));
        }
    }

    /* renamed from: X2.d$i */
    public class i extends C0126d implements SortedSet {
        public i(SortedMap sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return d().comparator();
        }

        public SortedMap d() {
            return (SortedMap) super.a();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return d().firstKey();
        }

        public SortedSet headSet(Object obj) {
            return AbstractC0686d.this.new i(d().headMap(obj));
        }

        @Override // java.util.SortedSet
        public Object last() {
            return d().lastKey();
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return AbstractC0686d.this.new i(d().subMap(obj, obj2));
        }

        public SortedSet tailSet(Object obj) {
            return AbstractC0686d.this.new i(d().tailMap(obj));
        }
    }

    /* renamed from: X2.d$j */
    public class j extends AbstractCollection {

        /* renamed from: o, reason: collision with root package name */
        public final Object f7134o;

        /* renamed from: p, reason: collision with root package name */
        public Collection f7135p;

        /* renamed from: q, reason: collision with root package name */
        public final j f7136q;

        /* renamed from: r, reason: collision with root package name */
        public final Collection f7137r;

        /* renamed from: X2.d$j$a */
        public class a implements Iterator {

            /* renamed from: o, reason: collision with root package name */
            public final Iterator f7139o;

            /* renamed from: p, reason: collision with root package name */
            public final Collection f7140p;

            public a() {
                Collection collection = j.this.f7135p;
                this.f7140p = collection;
                this.f7139o = AbstractC0686d.t(collection);
            }

            public Iterator b() {
                d();
                return this.f7139o;
            }

            public void d() {
                j.this.i();
                if (j.this.f7135p != this.f7140p) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                d();
                return this.f7139o.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                d();
                return this.f7139o.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f7139o.remove();
                AbstractC0686d.k(AbstractC0686d.this);
                j.this.k();
            }

            public a(Iterator it) {
                this.f7140p = j.this.f7135p;
                this.f7139o = it;
            }
        }

        public j(Object obj, Collection collection, j jVar) {
            this.f7134o = obj;
            this.f7135p = collection;
            this.f7136q = jVar;
            this.f7137r = jVar == null ? null : jVar.f();
        }

        public void a() {
            j jVar = this.f7136q;
            if (jVar != null) {
                jVar.a();
            } else {
                AbstractC0686d.this.f7112r.put(this.f7134o, this.f7135p);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(Object obj) {
            i();
            boolean isEmpty = this.f7135p.isEmpty();
            boolean add = this.f7135p.add(obj);
            if (add) {
                AbstractC0686d.j(AbstractC0686d.this);
                if (isEmpty) {
                    a();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f7135p.addAll(collection);
            if (addAll) {
                AbstractC0686d.l(AbstractC0686d.this, this.f7135p.size() - size);
                if (size == 0) {
                    a();
                }
            }
            return addAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f7135p.clear();
            AbstractC0686d.m(AbstractC0686d.this, size);
            k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            i();
            return this.f7135p.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection collection) {
            i();
            return this.f7135p.containsAll(collection);
        }

        public j d() {
            return this.f7136q;
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            i();
            return this.f7135p.equals(obj);
        }

        public Collection f() {
            return this.f7135p;
        }

        public Object g() {
            return this.f7134o;
        }

        @Override // java.util.Collection
        public int hashCode() {
            i();
            return this.f7135p.hashCode();
        }

        public void i() {
            Collection collection;
            j jVar = this.f7136q;
            if (jVar != null) {
                jVar.i();
                if (this.f7136q.f() != this.f7137r) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f7135p.isEmpty() || (collection = (Collection) AbstractC0686d.this.f7112r.get(this.f7134o)) == null) {
                    return;
                }
                this.f7135p = collection;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            i();
            return new a();
        }

        public void k() {
            j jVar = this.f7136q;
            if (jVar != null) {
                jVar.k();
            } else if (this.f7135p.isEmpty()) {
                AbstractC0686d.this.f7112r.remove(this.f7134o);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            i();
            boolean remove = this.f7135p.remove(obj);
            if (remove) {
                AbstractC0686d.k(AbstractC0686d.this);
                k();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f7135p.removeAll(collection);
            if (removeAll) {
                AbstractC0686d.l(AbstractC0686d.this, this.f7135p.size() - size);
                k();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            W2.m.j(collection);
            int size = size();
            boolean retainAll = this.f7135p.retainAll(collection);
            if (retainAll) {
                AbstractC0686d.l(AbstractC0686d.this, this.f7135p.size() - size);
                k();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            i();
            return this.f7135p.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            i();
            return this.f7135p.toString();
        }
    }

    /* renamed from: X2.d$k */
    public class k extends j implements List {

        /* renamed from: X2.d$k$a */
        public class a extends j.a implements ListIterator {
            public a() {
                super();
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                boolean isEmpty = k.this.isEmpty();
                e().add(obj);
                AbstractC0686d.j(AbstractC0686d.this);
                if (isEmpty) {
                    k.this.a();
                }
            }

            public final ListIterator e() {
                return (ListIterator) b();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return e().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return e().nextIndex();
            }

            @Override // java.util.ListIterator
            public Object previous() {
                return e().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return e().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                e().set(obj);
            }

            public a(int i7) {
                super(k.this.q().listIterator(i7));
            }
        }

        public k(Object obj, List list, j jVar) {
            super(obj, list, jVar);
        }

        @Override // java.util.List
        public void add(int i7, Object obj) {
            i();
            boolean isEmpty = f().isEmpty();
            q().add(i7, obj);
            AbstractC0686d.j(AbstractC0686d.this);
            if (isEmpty) {
                a();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i7, Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = q().addAll(i7, collection);
            if (addAll) {
                AbstractC0686d.l(AbstractC0686d.this, f().size() - size);
                if (size == 0) {
                    a();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        public Object get(int i7) {
            i();
            return q().get(i7);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            i();
            return q().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            i();
            return q().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            i();
            return new a();
        }

        public List q() {
            return (List) f();
        }

        @Override // java.util.List
        public Object remove(int i7) {
            i();
            Object remove = q().remove(i7);
            AbstractC0686d.k(AbstractC0686d.this);
            k();
            return remove;
        }

        @Override // java.util.List
        public Object set(int i7, Object obj) {
            i();
            return q().set(i7, obj);
        }

        @Override // java.util.List
        public List subList(int i7, int i8) {
            i();
            return AbstractC0686d.this.y(g(), q().subList(i7, i8), d() == null ? this : d());
        }

        @Override // java.util.List
        public ListIterator listIterator(int i7) {
            i();
            return new a(i7);
        }
    }

    public AbstractC0686d(Map map) {
        W2.m.d(map.isEmpty());
        this.f7112r = map;
    }

    public static /* synthetic */ int j(AbstractC0686d abstractC0686d) {
        int i7 = abstractC0686d.f7113s;
        abstractC0686d.f7113s = i7 + 1;
        return i7;
    }

    public static /* synthetic */ int k(AbstractC0686d abstractC0686d) {
        int i7 = abstractC0686d.f7113s;
        abstractC0686d.f7113s = i7 - 1;
        return i7;
    }

    public static /* synthetic */ int l(AbstractC0686d abstractC0686d, int i7) {
        int i8 = abstractC0686d.f7113s + i7;
        abstractC0686d.f7113s = i8;
        return i8;
    }

    public static /* synthetic */ int m(AbstractC0686d abstractC0686d, int i7) {
        int i8 = abstractC0686d.f7113s - i7;
        abstractC0686d.f7113s = i8;
        return i8;
    }

    public static Iterator t(Collection collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    @Override // X2.H
    public void clear() {
        Iterator it = this.f7112r.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f7112r.clear();
        this.f7113s = 0;
    }

    @Override // X2.AbstractC0688f
    public Collection e() {
        return new AbstractC0688f.a();
    }

    @Override // X2.AbstractC0688f
    public Iterator g() {
        return new a(this);
    }

    public Map o() {
        return this.f7112r;
    }

    public abstract Collection p();

    @Override // X2.H
    public boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.f7112r.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f7113s++;
            return true;
        }
        Collection q7 = q(obj);
        if (!q7.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f7113s++;
        this.f7112r.put(obj, q7);
        return true;
    }

    public Collection q(Object obj) {
        return p();
    }

    public final Map r() {
        Map map = this.f7112r;
        return map instanceof NavigableMap ? new e((NavigableMap) this.f7112r) : map instanceof SortedMap ? new h((SortedMap) this.f7112r) : new b(this.f7112r);
    }

    public final Set s() {
        Map map = this.f7112r;
        return map instanceof NavigableMap ? new f((NavigableMap) this.f7112r) : map instanceof SortedMap ? new i((SortedMap) this.f7112r) : new C0126d(this.f7112r);
    }

    @Override // X2.H
    public int size() {
        return this.f7113s;
    }

    public final void u(Object obj) {
        Collection collection = (Collection) G.j(this.f7112r, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f7113s -= size;
        }
    }

    public final void v(Map map) {
        this.f7112r = map;
        this.f7113s = 0;
        for (Collection collection : map.values()) {
            W2.m.d(!collection.isEmpty());
            this.f7113s += collection.size();
        }
    }

    @Override // X2.AbstractC0688f, X2.H
    public Collection values() {
        return super.values();
    }

    public abstract Collection w(Collection collection);

    public abstract Collection x(Object obj, Collection collection);

    public final List y(Object obj, List list, j jVar) {
        return list instanceof RandomAccess ? new g(this, obj, list, jVar) : new k(obj, list, jVar);
    }

    /* renamed from: X2.d$a */
    public class a extends c {
        public a(AbstractC0686d abstractC0686d) {
            super();
        }

        @Override // X2.AbstractC0686d.c
        public Object b(Object obj, Object obj2) {
            return obj2;
        }
    }
}
