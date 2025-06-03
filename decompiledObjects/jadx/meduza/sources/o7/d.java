package o7;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
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
import java.util.TreeMap;
import o7.b0;
import o7.e0;
import o7.f;

/* loaded from: classes.dex */
public abstract class d<K, V> extends o7.f<K, V> implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public transient Map<K, Collection<V>> f11945d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f11946e;

    public class a extends d<K, V>.c<V> {
        public a(d dVar) {
            super();
        }
    }

    public class b extends e0.d<K, Collection<V>> {

        /* renamed from: c, reason: collision with root package name */
        public final transient Map<K, Collection<V>> f11947c;

        public class a extends e0.a<K, Collection<V>> {
            public a() {
            }

            @Override // o7.e0.a, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                Set<Map.Entry<K, Collection<V>>> entrySet = b.this.f11947c.entrySet();
                entrySet.getClass();
                try {
                    return entrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return b.this.new C0186b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                Collection<V> collection;
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                d dVar = d.this;
                Object key = entry.getKey();
                Map<K, Collection<V>> map = dVar.f11945d;
                map.getClass();
                try {
                    collection = map.remove(key);
                } catch (ClassCastException | NullPointerException unused) {
                    collection = null;
                }
                Collection<V> collection2 = collection;
                if (collection2 == null) {
                    return true;
                }
                int size = collection2.size();
                collection2.clear();
                dVar.f11946e -= size;
                return true;
            }
        }

        /* renamed from: o7.d$b$b, reason: collision with other inner class name */
        public class C0186b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: a, reason: collision with root package name */
            public final Iterator<Map.Entry<K, Collection<V>>> f11950a;

            /* renamed from: b, reason: collision with root package name */
            public Collection<V> f11951b;

            public C0186b() {
                this.f11950a = b.this.f11947c.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f11950a.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                Map.Entry<K, Collection<V>> next = this.f11950a.next();
                this.f11951b = next.getValue();
                return b.this.b(next);
            }

            @Override // java.util.Iterator
            public final void remove() {
                x6.b.I(this.f11951b != null, "no calls to next() since the last call to remove()");
                this.f11950a.remove();
                d.this.f11946e -= this.f11951b.size();
                this.f11951b.clear();
                this.f11951b = null;
            }
        }

        public b(Map<K, Collection<V>> map) {
            this.f11947c = map;
        }

        public final s b(Map.Entry entry) {
            Object key = entry.getKey();
            d dVar = d.this;
            Collection collection = (Collection) entry.getValue();
            o7.c cVar = (o7.c) dVar;
            cVar.getClass();
            List list = (List) collection;
            return new s(key, list instanceof RandomAccess ? new g(cVar, key, list, null) : new k(key, list, null));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            Map<K, Collection<V>> map = this.f11947c;
            d dVar = d.this;
            if (map == dVar.f11945d) {
                dVar.clear();
                return;
            }
            C0186b c0186b = new C0186b();
            while (c0186b.hasNext()) {
                c0186b.next();
                c0186b.remove();
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            Map<K, Collection<V>> map = this.f11947c;
            map.getClass();
            try {
                return map.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean equals(Object obj) {
            return this == obj || this.f11947c.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            Collection<V> collection;
            Map<K, Collection<V>> map = this.f11947c;
            map.getClass();
            try {
                collection = map.get(obj);
            } catch (ClassCastException | NullPointerException unused) {
                collection = null;
            }
            Collection<V> collection2 = collection;
            if (collection2 == null) {
                return null;
            }
            o7.c cVar = (o7.c) d.this;
            cVar.getClass();
            List list = (List) collection2;
            return list instanceof RandomAccess ? new g(cVar, obj, list, null) : new k(obj, list, null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int hashCode() {
            return this.f11947c.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            d dVar = d.this;
            Set<K> set = dVar.f11979a;
            if (set != null) {
                return set;
            }
            Set<K> d10 = dVar.d();
            dVar.f11979a = d10;
            return d10;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            Collection<V> remove = this.f11947c.remove(obj);
            if (remove == null) {
                return null;
            }
            List<V> list = ((h0) d.this).f.get();
            list.addAll(remove);
            d.this.f11946e -= remove.size();
            remove.clear();
            return list;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.f11947c.size();
        }

        @Override // java.util.AbstractMap
        public final String toString() {
            return this.f11947c.toString();
        }
    }

    public abstract class c<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator<Map.Entry<K, Collection<V>>> f11953a;

        /* renamed from: b, reason: collision with root package name */
        public K f11954b = null;

        /* renamed from: c, reason: collision with root package name */
        public Collection<V> f11955c = null;

        /* renamed from: d, reason: collision with root package name */
        public Iterator<V> f11956d = b0.b.f11943a;

        public c() {
            this.f11953a = d.this.f11945d.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f11953a.hasNext() || this.f11956d.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.f11956d.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f11953a.next();
                this.f11954b = next.getKey();
                Collection<V> value = next.getValue();
                this.f11955c = value;
                this.f11956d = value.iterator();
            }
            return this.f11956d.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f11956d.remove();
            Collection<V> collection = this.f11955c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f11953a.remove();
            }
            d dVar = d.this;
            dVar.f11946e--;
        }
    }

    /* renamed from: o7.d$d, reason: collision with other inner class name */
    public class C0187d extends e0.b<K, Collection<V>> {

        /* renamed from: o7.d$d$a */
        public class a implements Iterator<K> {

            /* renamed from: a, reason: collision with root package name */
            public Map.Entry<K, Collection<V>> f11959a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Iterator f11960b;

            public a(Iterator it) {
                this.f11960b = it;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f11960b.hasNext();
            }

            @Override // java.util.Iterator
            public final K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f11960b.next();
                this.f11959a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public final void remove() {
                x6.b.I(this.f11959a != null, "no calls to next() since the last call to remove()");
                Collection<V> value = this.f11959a.getValue();
                this.f11960b.remove();
                d.this.f11946e -= value.size();
                value.clear();
                this.f11959a = null;
            }
        }

        public C0187d(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            Iterator<K> it = iterator();
            while (true) {
                a aVar = (a) it;
                if (!aVar.hasNext()) {
                    return;
                }
                aVar.next();
                aVar.remove();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection<?> collection) {
            return this.f11975a.keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            return this == obj || this.f11975a.keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            return this.f11975a.keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a(this.f11975a.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            int i10;
            Collection collection = (Collection) this.f11975a.remove(obj);
            if (collection != null) {
                i10 = collection.size();
                collection.clear();
                d.this.f11946e -= i10;
            } else {
                i10 = 0;
            }
            return i10 > 0;
        }
    }

    public class e extends d<K, V>.h implements NavigableMap<K, Collection<V>> {
        public e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // o7.d.h
        public final SortedSet c() {
            return new f(e());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> ceilingEntry(K k10) {
            Map.Entry<K, Collection<V>> ceilingEntry = e().ceilingEntry(k10);
            if (ceilingEntry == null) {
                return null;
            }
            return b(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public final K ceilingKey(K k10) {
            return e().ceilingKey(k10);
        }

        @Override // o7.d.h
        /* renamed from: d */
        public final SortedSet keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> descendingKeySet() {
            return ((e) descendingMap()).navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> descendingMap() {
            return new e(e().descendingMap());
        }

        public final s f(Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            List<V> list = ((h0) d.this).f.get();
            list.addAll((Collection) entry.getValue());
            it.remove();
            Object key = entry.getKey();
            ((o7.c) d.this).getClass();
            return new s(key, Collections.unmodifiableList(list));
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> firstEntry = e().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return b(firstEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> floorEntry(K k10) {
            Map.Entry<K, Collection<V>> floorEntry = e().floorEntry(k10);
            if (floorEntry == null) {
                return null;
            }
            return b(floorEntry);
        }

        @Override // java.util.NavigableMap
        public final K floorKey(K k10) {
            return e().floorKey(k10);
        }

        @Override // o7.d.h
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final NavigableMap<K, Collection<V>> e() {
            return (NavigableMap) ((SortedMap) this.f11947c);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> headMap(K k10, boolean z10) {
            return new e(e().headMap(k10, z10));
        }

        @Override // o7.d.h, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> higherEntry(K k10) {
            Map.Entry<K, Collection<V>> higherEntry = e().higherEntry(k10);
            if (higherEntry == null) {
                return null;
            }
            return b(higherEntry);
        }

        @Override // java.util.NavigableMap
        public final K higherKey(K k10) {
            return e().higherKey(k10);
        }

        @Override // o7.d.h, o7.d.b, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> lastEntry = e().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return b(lastEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> lowerEntry(K k10) {
            Map.Entry<K, Collection<V>> lowerEntry = e().lowerEntry(k10);
            if (lowerEntry == null) {
                return null;
            }
            return b(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public final K lowerKey(K k10) {
            return e().lowerKey(k10);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> navigableKeySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> pollFirstEntry() {
            return f(((b.a) entrySet()).iterator());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> pollLastEntry() {
            return f(((b.a) ((e0.d) descendingMap()).entrySet()).iterator());
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> subMap(K k10, boolean z10, K k11, boolean z11) {
            return new e(e().subMap(k10, z10, k11, z11));
        }

        @Override // o7.d.h, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> tailMap(K k10, boolean z10) {
            return new e(e().tailMap(k10, z10));
        }

        @Override // o7.d.h, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }
    }

    public class f extends d<K, V>.i implements NavigableSet<K> {
        public f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public final K ceiling(K k10) {
            return a().ceilingKey(k10);
        }

        @Override // java.util.NavigableSet
        public final Iterator<K> descendingIterator() {
            return ((C0187d) descendingSet()).iterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> descendingSet() {
            return new f(a().descendingMap());
        }

        @Override // java.util.NavigableSet
        public final K floor(K k10) {
            return a().floorKey(k10);
        }

        @Override // o7.d.i
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final NavigableMap<K, Collection<V>> a() {
            return (NavigableMap) ((SortedMap) this.f11975a);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> headSet(K k10, boolean z10) {
            return new f(a().headMap(k10, z10));
        }

        @Override // o7.d.i, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        public final K higher(K k10) {
            return a().higherKey(k10);
        }

        @Override // java.util.NavigableSet
        public final K lower(K k10) {
            return a().lowerKey(k10);
        }

        @Override // java.util.NavigableSet
        public final K pollFirst() {
            C0187d.a aVar = (C0187d.a) iterator();
            if (!aVar.hasNext()) {
                return null;
            }
            K k10 = (K) aVar.next();
            aVar.remove();
            return k10;
        }

        @Override // java.util.NavigableSet
        public final K pollLast() {
            Iterator<K> descendingIterator = descendingIterator();
            if (!descendingIterator.hasNext()) {
                return null;
            }
            K next = descendingIterator.next();
            descendingIterator.remove();
            return next;
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> subSet(K k10, boolean z10, K k11, boolean z11) {
            return new f(a().subMap(k10, z10, k11, z11));
        }

        @Override // o7.d.i, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> tailSet(K k10, boolean z10) {
            return new f(a().tailMap(k10, z10));
        }

        @Override // o7.d.i, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }
    }

    public class g extends d<K, V>.k implements RandomAccess {
        public g(d dVar, K k10, List<V> list, d<K, V>.j jVar) {
            super(k10, list, jVar);
        }
    }

    public class h extends d<K, V>.b implements SortedMap<K, Collection<V>> {

        /* renamed from: e, reason: collision with root package name */
        public SortedSet<K> f11964e;

        public h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public SortedSet<K> c() {
            return new i(e());
        }

        @Override // java.util.SortedMap
        public final Comparator<? super K> comparator() {
            return e().comparator();
        }

        @Override // o7.d.b, java.util.AbstractMap, java.util.Map
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f11964e;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> c10 = c();
            this.f11964e = c10;
            return c10;
        }

        public SortedMap<K, Collection<V>> e() {
            return (SortedMap) this.f11947c;
        }

        @Override // java.util.SortedMap
        public final K firstKey() {
            return e().firstKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k10) {
            return new h(e().headMap(k10));
        }

        @Override // java.util.SortedMap
        public final K lastKey() {
            return e().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k10, K k11) {
            return new h(e().subMap(k10, k11));
        }

        public SortedMap<K, Collection<V>> tailMap(K k10) {
            return new h(e().tailMap(k10));
        }
    }

    public class i extends d<K, V>.C0187d implements SortedSet<K> {
        public i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public SortedMap<K, Collection<V>> a() {
            return (SortedMap) this.f11975a;
        }

        @Override // java.util.SortedSet
        public final Comparator<? super K> comparator() {
            return a().comparator();
        }

        @Override // java.util.SortedSet
        public final K first() {
            return a().firstKey();
        }

        public SortedSet<K> headSet(K k10) {
            return new i(a().headMap(k10));
        }

        @Override // java.util.SortedSet
        public final K last() {
            return a().lastKey();
        }

        public SortedSet<K> subSet(K k10, K k11) {
            return new i(a().subMap(k10, k11));
        }

        public SortedSet<K> tailSet(K k10) {
            return new i(a().tailMap(k10));
        }
    }

    public class j extends AbstractCollection<V> {

        /* renamed from: a, reason: collision with root package name */
        public final K f11966a;

        /* renamed from: b, reason: collision with root package name */
        public Collection<V> f11967b;

        /* renamed from: c, reason: collision with root package name */
        public final d<K, V>.j f11968c;

        /* renamed from: d, reason: collision with root package name */
        public final Collection<V> f11969d;

        public class a implements Iterator<V> {

            /* renamed from: a, reason: collision with root package name */
            public final Iterator<V> f11971a;

            /* renamed from: b, reason: collision with root package name */
            public final Collection<V> f11972b;

            public a() {
                Collection<V> collection = j.this.f11967b;
                this.f11972b = collection;
                this.f11971a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
            }

            public a(ListIterator listIterator) {
                this.f11972b = j.this.f11967b;
                this.f11971a = listIterator;
            }

            public final void a() {
                j.this.h();
                if (j.this.f11967b != this.f11972b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                a();
                return this.f11971a.hasNext();
            }

            @Override // java.util.Iterator
            public final V next() {
                a();
                return this.f11971a.next();
            }

            @Override // java.util.Iterator
            public final void remove() {
                this.f11971a.remove();
                j jVar = j.this;
                d dVar = d.this;
                dVar.f11946e--;
                jVar.i();
            }
        }

        public j(K k10, Collection<V> collection, d<K, V>.j jVar) {
            this.f11966a = k10;
            this.f11967b = collection;
            this.f11968c = jVar;
            this.f11969d = jVar == null ? null : jVar.f11967b;
        }

        public final void a() {
            d<K, V>.j jVar = this.f11968c;
            if (jVar != null) {
                jVar.a();
            } else {
                d.this.f11945d.put(this.f11966a, this.f11967b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean add(V v10) {
            h();
            boolean isEmpty = this.f11967b.isEmpty();
            boolean add = this.f11967b.add(v10);
            if (add) {
                d.this.f11946e++;
                if (isEmpty) {
                    a();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f11967b.addAll(collection);
            if (addAll) {
                int size2 = this.f11967b.size();
                d.this.f11946e += size2 - size;
                if (size == 0) {
                    a();
                }
            }
            return addAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f11967b.clear();
            d.this.f11946e -= size;
            i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            h();
            return this.f11967b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            h();
            return this.f11967b.containsAll(collection);
        }

        @Override // java.util.Collection
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            h();
            return this.f11967b.equals(obj);
        }

        public final void h() {
            Collection<V> collection;
            d<K, V>.j jVar = this.f11968c;
            if (jVar != null) {
                jVar.h();
                if (this.f11968c.f11967b != this.f11969d) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f11967b.isEmpty() || (collection = d.this.f11945d.get(this.f11966a)) == null) {
                    return;
                }
                this.f11967b = collection;
            }
        }

        @Override // java.util.Collection
        public final int hashCode() {
            h();
            return this.f11967b.hashCode();
        }

        public final void i() {
            d<K, V>.j jVar = this.f11968c;
            if (jVar != null) {
                jVar.i();
            } else if (this.f11967b.isEmpty()) {
                d.this.f11945d.remove(this.f11966a);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            h();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            h();
            boolean remove = this.f11967b.remove(obj);
            if (remove) {
                d dVar = d.this;
                dVar.f11946e--;
                i();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f11967b.removeAll(collection);
            if (removeAll) {
                int size2 = this.f11967b.size();
                d.this.f11946e += size2 - size;
                i();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            collection.getClass();
            int size = size();
            boolean retainAll = this.f11967b.retainAll(collection);
            if (retainAll) {
                int size2 = this.f11967b.size();
                d.this.f11946e += size2 - size;
                i();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            h();
            return this.f11967b.size();
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            h();
            return this.f11967b.toString();
        }
    }

    public class k extends d<K, V>.j implements List<V> {

        public class a extends d<K, V>.j.a implements ListIterator<V> {
            public a() {
                super();
            }

            public a(int i10) {
                super(((List) k.this.f11967b).listIterator(i10));
            }

            @Override // java.util.ListIterator
            public final void add(V v10) {
                boolean isEmpty = k.this.isEmpty();
                b().add(v10);
                k kVar = k.this;
                d.this.f11946e++;
                if (isEmpty) {
                    kVar.a();
                }
            }

            public final ListIterator<V> b() {
                a();
                return (ListIterator) this.f11971a;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return b().hasPrevious();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return b().nextIndex();
            }

            @Override // java.util.ListIterator
            public final V previous() {
                return b().previous();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return b().previousIndex();
            }

            @Override // java.util.ListIterator
            public final void set(V v10) {
                b().set(v10);
            }
        }

        public k(K k10, List<V> list, d<K, V>.j jVar) {
            super(k10, list, jVar);
        }

        @Override // java.util.List
        public final void add(int i10, V v10) {
            h();
            boolean isEmpty = this.f11967b.isEmpty();
            ((List) this.f11967b).add(i10, v10);
            d.this.f11946e++;
            if (isEmpty) {
                a();
            }
        }

        @Override // java.util.List
        public final boolean addAll(int i10, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = ((List) this.f11967b).addAll(i10, collection);
            if (addAll) {
                int size2 = this.f11967b.size();
                d.this.f11946e += size2 - size;
                if (size == 0) {
                    a();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        public final V get(int i10) {
            h();
            return (V) ((List) this.f11967b).get(i10);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            h();
            return ((List) this.f11967b).indexOf(obj);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            h();
            return ((List) this.f11967b).lastIndexOf(obj);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator() {
            h();
            return new a();
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator(int i10) {
            h();
            return new a(i10);
        }

        @Override // java.util.List
        public final V remove(int i10) {
            h();
            V v10 = (V) ((List) this.f11967b).remove(i10);
            d dVar = d.this;
            dVar.f11946e--;
            i();
            return v10;
        }

        @Override // java.util.List
        public final V set(int i10, V v10) {
            h();
            return (V) ((List) this.f11967b).set(i10, v10);
        }

        @Override // java.util.List
        public final List<V> subList(int i10, int i11) {
            h();
            d dVar = d.this;
            K k10 = this.f11966a;
            List subList = ((List) this.f11967b).subList(i10, i11);
            d<K, V>.j jVar = this.f11968c;
            if (jVar == null) {
                jVar = this;
            }
            dVar.getClass();
            return subList instanceof RandomAccess ? new g(dVar, k10, subList, jVar) : new k(k10, subList, jVar);
        }
    }

    public d(TreeMap treeMap) {
        x6.b.t(treeMap.isEmpty());
        this.f11945d = treeMap;
    }

    @Override // o7.f0
    public final void clear() {
        Iterator<Collection<V>> it = this.f11945d.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f11945d.clear();
        this.f11946e = 0;
    }

    @Override // o7.f
    public final Iterator<V> e() {
        return new a(this);
    }

    public final Collection<V> f() {
        return new f.a();
    }

    public final Collection<V> g() {
        Collection<V> collection = this.f11980b;
        if (collection != null) {
            return collection;
        }
        Collection<V> f10 = f();
        this.f11980b = f10;
        return f10;
    }

    @Override // o7.f0
    public final int size() {
        return this.f11946e;
    }
}
