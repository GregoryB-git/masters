// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import java.util.ListIterator;
import java.util.ConcurrentModificationException;
import java.util.AbstractCollection;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.NavigableMap;
import java.util.List;
import java.util.Iterator;
import java.util.Collection;
import W2.m;
import java.util.Map;
import java.io.Serializable;

public abstract class d extends X2.f implements Serializable
{
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map r;
    public transient int s;
    
    public d(final Map r) {
        m.d(r.isEmpty());
        this.r = r;
    }
    
    public static /* synthetic */ Map h(final d d) {
        return d.r;
    }
    
    public static /* synthetic */ int j(final d d) {
        return d.s++;
    }
    
    public static /* synthetic */ int k(final d d) {
        return d.s--;
    }
    
    public static /* synthetic */ int l(final d d, int s) {
        s += d.s;
        return d.s = s;
    }
    
    public static /* synthetic */ int m(final d d, int s) {
        s = d.s - s;
        return d.s = s;
    }
    
    public static Iterator t(final Collection collection) {
        if (collection instanceof List) {
            return ((List)collection).listIterator();
        }
        return collection.iterator();
    }
    
    @Override
    public void clear() {
        final Iterator<Collection> iterator = this.r.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().clear();
        }
        this.r.clear();
        this.s = 0;
    }
    
    @Override
    public Collection e() {
        return new X2.f.a();
    }
    
    @Override
    public Iterator g() {
        return new c(this) {
            @Override
            public Object b(final Object o, final Object o2) {
                return o2;
            }
        };
    }
    
    public Map o() {
        return this.r;
    }
    
    public abstract Collection p();
    
    @Override
    public boolean put(final Object o, final Object o2) {
        final Collection<Object> collection = this.r.get(o);
        if (collection == null) {
            final Collection q = this.q(o);
            if (q.add(o2)) {
                ++this.s;
                this.r.put(o, q);
                return true;
            }
            throw new AssertionError((Object)"New Collection violated the Collection spec");
        }
        else {
            if (collection.add(o2)) {
                ++this.s;
                return true;
            }
            return false;
        }
    }
    
    public Collection q(final Object o) {
        return this.p();
    }
    
    public final Map r() {
        final Map r = this.r;
        if (r instanceof NavigableMap) {
            return new e((NavigableMap)this.r);
        }
        if (r instanceof SortedMap) {
            return new h((SortedMap)this.r);
        }
        return new b(this.r);
    }
    
    public final Set s() {
        final Map r = this.r;
        if (r instanceof NavigableMap) {
            return new f((NavigableMap)this.r);
        }
        if (r instanceof SortedMap) {
            return new i((SortedMap)this.r);
        }
        return new d(this.r);
    }
    
    @Override
    public int size() {
        return this.s;
    }
    
    public final void u(final Object o) {
        final Collection collection = (Collection)G.j(this.r, o);
        if (collection != null) {
            final int size = collection.size();
            collection.clear();
            this.s -= size;
        }
    }
    
    public final void v(final Map r) {
        this.r = r;
        this.s = 0;
        for (final Collection collection : r.values()) {
            m.d(collection.isEmpty() ^ true);
            this.s += collection.size();
        }
    }
    
    @Override
    public Collection values() {
        return super.values();
    }
    
    public abstract Collection w(final Collection p0);
    
    public abstract Collection x(final Object p0, final Collection p1);
    
    public final List y(final Object o, final List list, final j j) {
        if (list instanceof RandomAccess) {
            return new g(o, list, j);
        }
        return new k(o, list, j);
    }
    
    public class b extends G.f
    {
        public final transient Map q;
        
        public b(final Map q) {
            this.q = q;
        }
        
        @Override
        public Set a() {
            return new a();
        }
        
        public Collection c(final Object o) {
            final Collection collection = (Collection)G.i(this.q, o);
            if (collection == null) {
                return null;
            }
            return d.this.x(o, collection);
        }
        
        @Override
        public void clear() {
            if (this.q == d.h(d.this)) {
                d.this.clear();
                return;
            }
            C.c(new b());
        }
        
        @Override
        public boolean containsKey(final Object o) {
            return G.h(this.q, o);
        }
        
        public Collection d(final Object o) {
            final Collection collection = this.q.remove(o);
            if (collection == null) {
                return null;
            }
            final Collection p = d.this.p();
            p.addAll(collection);
            d.m(d.this, collection.size());
            collection.clear();
            return p;
        }
        
        public Entry e(final Entry entry) {
            final Object key = entry.getKey();
            return G.d(key, d.this.x(key, (Collection)entry.getValue()));
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || this.q.equals(o);
        }
        
        @Override
        public int hashCode() {
            return this.q.hashCode();
        }
        
        @Override
        public Set keySet() {
            return d.this.f();
        }
        
        @Override
        public int size() {
            return this.q.size();
        }
        
        @Override
        public String toString() {
            return this.q.toString();
        }
        
        public class a extends G.c
        {
            @Override
            public Map a() {
                return b.this;
            }
            
            @Override
            public boolean contains(final Object o) {
                return X2.j.c(b.this.q.entrySet(), o);
            }
            
            @Override
            public Iterator iterator() {
                return new b();
            }
            
            @Override
            public boolean remove(final Object o) {
                if (!this.contains(o)) {
                    return false;
                }
                final Entry obj = (Entry)o;
                Objects.requireNonNull(obj);
                d.this.u(((Map.Entry<Object, V>)obj).getKey());
                return true;
            }
        }
        
        public class b implements Iterator
        {
            public final Iterator o;
            public Collection p;
            
            public b() {
                this.o = X2.d.b.this.q.entrySet().iterator();
            }
            
            public Entry b() {
                final Map.Entry<K, Collection> entry = this.o.next();
                this.p = entry.getValue();
                return X2.d.b.this.e((Entry)entry);
            }
            
            @Override
            public boolean hasNext() {
                return this.o.hasNext();
            }
            
            @Override
            public void remove() {
                m.p(this.p != null, "no calls to next() since the last call to remove()");
                this.o.remove();
                d.m(d.this, this.p.size());
                this.p.clear();
                this.p = null;
            }
        }
    }
    
    public abstract class c implements Iterator
    {
        public final Iterator o;
        public Object p;
        public Collection q;
        public Iterator r;
        
        public c() {
            this.o = d.h(d.this).entrySet().iterator();
            this.p = null;
            this.q = null;
            this.r = C.h();
        }
        
        public abstract Object b(final Object p0, final Object p1);
        
        @Override
        public boolean hasNext() {
            return this.o.hasNext() || this.r.hasNext();
        }
        
        @Override
        public Object next() {
            if (!this.r.hasNext()) {
                final Map.Entry<Object, V> entry = this.o.next();
                this.p = entry.getKey();
                final Collection q = (Collection)entry.getValue();
                this.q = q;
                this.r = q.iterator();
            }
            return this.b(N.a(this.p), this.r.next());
        }
        
        @Override
        public void remove() {
            this.r.remove();
            final Collection q = this.q;
            Objects.requireNonNull(q);
            if (q.isEmpty()) {
                this.o.remove();
            }
            d.k(d.this);
        }
    }
    
    public class d extends G.d
    {
        public d(final Map map) {
            super(map);
        }
        
        @Override
        public void clear() {
            C.c(this.iterator());
        }
        
        @Override
        public boolean containsAll(final Collection collection) {
            return ((G.d)this).a().keySet().containsAll(collection);
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || ((G.d)this).a().keySet().equals(o);
        }
        
        @Override
        public int hashCode() {
            return ((G.d)this).a().keySet().hashCode();
        }
        
        @Override
        public Iterator iterator() {
            return new Iterator() {
                public Map.Entry o;
                public final /* synthetic */ Iterator p = ((G.d)this).a().entrySet().iterator();
                
                @Override
                public boolean hasNext() {
                    return this.p.hasNext();
                }
                
                @Override
                public Object next() {
                    final Map.Entry<Object, V> o = this.p.next();
                    this.o = (Map.Entry)o;
                    return o.getKey();
                }
                
                @Override
                public void remove() {
                    m.p(this.o != null, "no calls to next() since the last call to remove()");
                    final Collection collection = this.o.getValue();
                    this.p.remove();
                    X2.d.m(X2.d.this, collection.size());
                    collection.clear();
                    this.o = null;
                }
            };
        }
        
        @Override
        public boolean remove(final Object o) {
            final Collection collection = ((G.d)this).a().remove(o);
            if (collection != null) {
                final int size = collection.size();
                collection.clear();
                X2.d.m(X2.d.this, size);
                if (size > 0) {
                    return true;
                }
            }
            return false;
        }
    }
    
    public final class e extends h implements NavigableMap
    {
        public e(final NavigableMap navigableMap) {
            super(navigableMap);
        }
        
        @Override
        public Entry ceilingEntry(final Object o) {
            final Map.Entry<Object, Object> ceilingEntry = this.m().ceilingEntry(o);
            if (ceilingEntry == null) {
                return null;
            }
            return ((b)this).e((Entry)ceilingEntry);
        }
        
        @Override
        public Object ceilingKey(final Object o) {
            return this.m().ceilingKey(o);
        }
        
        @Override
        public NavigableSet descendingKeySet() {
            return this.descendingMap().navigableKeySet();
        }
        
        @Override
        public NavigableMap descendingMap() {
            return new e(this.m().descendingMap());
        }
        
        @Override
        public Entry firstEntry() {
            final Map.Entry firstEntry = this.m().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return ((b)this).e((Entry)firstEntry);
        }
        
        @Override
        public Entry floorEntry(final Object o) {
            final Map.Entry<Object, Object> floorEntry = this.m().floorEntry(o);
            if (floorEntry == null) {
                return null;
            }
            return ((b)this).e((Entry)floorEntry);
        }
        
        @Override
        public Object floorKey(final Object o) {
            return this.m().floorKey(o);
        }
        
        @Override
        public NavigableMap headMap(final Object o, final boolean b) {
            return new e(this.m().headMap(o, b));
        }
        
        @Override
        public Entry higherEntry(final Object o) {
            final Map.Entry<Object, Object> higherEntry = this.m().higherEntry(o);
            if (higherEntry == null) {
                return null;
            }
            return ((b)this).e((Entry)higherEntry);
        }
        
        @Override
        public Object higherKey(final Object o) {
            return this.m().higherKey(o);
        }
        
        public NavigableSet i() {
            return new f(this.m());
        }
        
        public NavigableMap j(final Object o) {
            return this.headMap(o, false);
        }
        
        public NavigableSet k() {
            return (NavigableSet)super.g();
        }
        
        public Entry l(final Iterator iterator) {
            if (!iterator.hasNext()) {
                return null;
            }
            final Map.Entry<K, Collection> entry = iterator.next();
            final Collection p = d.this.p();
            p.addAll(entry.getValue());
            iterator.remove();
            return G.d(entry.getKey(), d.this.w(p));
        }
        
        @Override
        public Entry lastEntry() {
            final Map.Entry lastEntry = this.m().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return ((b)this).e((Entry)lastEntry);
        }
        
        @Override
        public Entry lowerEntry(final Object o) {
            final Map.Entry<Object, Object> lowerEntry = this.m().lowerEntry(o);
            if (lowerEntry == null) {
                return null;
            }
            return ((b)this).e((Entry)lowerEntry);
        }
        
        @Override
        public Object lowerKey(final Object o) {
            return this.m().lowerKey(o);
        }
        
        public NavigableMap m() {
            return (NavigableMap)super.h();
        }
        
        public NavigableMap n(final Object o, final Object o2) {
            return this.subMap(o, true, o2, false);
        }
        
        @Override
        public NavigableSet navigableKeySet() {
            return this.k();
        }
        
        public NavigableMap o(final Object o) {
            return this.tailMap(o, true);
        }
        
        @Override
        public Entry pollFirstEntry() {
            return this.l(((G.f)this).entrySet().iterator());
        }
        
        @Override
        public Entry pollLastEntry() {
            return this.l(this.descendingMap().entrySet().iterator());
        }
        
        @Override
        public NavigableMap subMap(final Object o, final boolean b, final Object o2, final boolean b2) {
            return new e(this.m().subMap(o, b, o2, b2));
        }
        
        @Override
        public NavigableMap tailMap(final Object o, final boolean b) {
            return new e(this.m().tailMap(o, b));
        }
    }
    
    public final class f extends i implements NavigableSet
    {
        public f(final NavigableMap navigableMap) {
            super(navigableMap);
        }
        
        @Override
        public Object ceiling(final Object o) {
            return this.g().ceilingKey(o);
        }
        
        @Override
        public Iterator descendingIterator() {
            return this.descendingSet().iterator();
        }
        
        @Override
        public NavigableSet descendingSet() {
            return new f(this.g().descendingMap());
        }
        
        public NavigableSet f(final Object o) {
            return this.headSet(o, false);
        }
        
        @Override
        public Object floor(final Object o) {
            return this.g().floorKey(o);
        }
        
        public NavigableMap g() {
            return (NavigableMap)super.d();
        }
        
        @Override
        public NavigableSet headSet(final Object o, final boolean b) {
            return new f(this.g().headMap(o, b));
        }
        
        @Override
        public Object higher(final Object o) {
            return this.g().higherKey(o);
        }
        
        public NavigableSet i(final Object o, final Object o2) {
            return this.subSet(o, true, o2, false);
        }
        
        public NavigableSet k(final Object o) {
            return this.tailSet(o, true);
        }
        
        @Override
        public Object lower(final Object o) {
            return this.g().lowerKey(o);
        }
        
        @Override
        public Object pollFirst() {
            return C.p(((d)this).iterator());
        }
        
        @Override
        public Object pollLast() {
            return C.p(this.descendingIterator());
        }
        
        @Override
        public NavigableSet subSet(final Object o, final boolean b, final Object o2, final boolean b2) {
            return new f(this.g().subMap(o, b, o2, b2));
        }
        
        @Override
        public NavigableSet tailSet(final Object o, final boolean b) {
            return new f(this.g().tailMap(o, b));
        }
    }
    
    public class g extends k implements RandomAccess
    {
        public g(final d d, final Object o, final List list, final j j) {
            d.super(o, list, j);
        }
    }
    
    public class h extends b implements SortedMap
    {
        public SortedSet s;
        
        public h(final SortedMap sortedMap) {
            super(sortedMap);
        }
        
        @Override
        public Comparator comparator() {
            return this.h().comparator();
        }
        
        public SortedSet f() {
            return new i(this.h());
        }
        
        @Override
        public Object firstKey() {
            return this.h().firstKey();
        }
        
        public SortedSet g() {
            SortedSet s;
            if ((s = this.s) == null) {
                s = this.f();
                this.s = s;
            }
            return s;
        }
        
        public SortedMap h() {
            return (SortedMap)super.q;
        }
        
        @Override
        public SortedMap headMap(final Object o) {
            return new h(this.h().headMap(o));
        }
        
        @Override
        public Object lastKey() {
            return this.h().lastKey();
        }
        
        @Override
        public SortedMap subMap(final Object o, final Object o2) {
            return new h(this.h().subMap(o, o2));
        }
        
        @Override
        public SortedMap tailMap(final Object o) {
            return new h(this.h().tailMap(o));
        }
    }
    
    public class i extends d implements SortedSet
    {
        public i(final SortedMap sortedMap) {
            super(sortedMap);
        }
        
        @Override
        public Comparator comparator() {
            return this.d().comparator();
        }
        
        public SortedMap d() {
            return (SortedMap)super.a();
        }
        
        @Override
        public Object first() {
            return this.d().firstKey();
        }
        
        @Override
        public SortedSet headSet(final Object o) {
            return new i(this.d().headMap(o));
        }
        
        @Override
        public Object last() {
            return this.d().lastKey();
        }
        
        @Override
        public SortedSet subSet(final Object o, final Object o2) {
            return new i(this.d().subMap(o, o2));
        }
        
        @Override
        public SortedSet tailSet(final Object o) {
            return new i(this.d().tailMap(o));
        }
    }
    
    public abstract class j extends AbstractCollection
    {
        public final Object o;
        public Collection p;
        public final j q;
        public final Collection r;
        
        public j(final Object o, final Collection p4, final j q) {
            this.o = o;
            this.p = p4;
            this.q = q;
            Collection f;
            if (q == null) {
                f = null;
            }
            else {
                f = q.f();
            }
            this.r = f;
        }
        
        public void a() {
            final j q = this.q;
            if (q != null) {
                q.a();
                return;
            }
            d.h(d.this).put(this.o, this.p);
        }
        
        @Override
        public boolean add(final Object o) {
            this.i();
            final boolean empty = this.p.isEmpty();
            final boolean add = this.p.add(o);
            if (add) {
                d.j(d.this);
                if (empty) {
                    this.a();
                }
            }
            return add;
        }
        
        @Override
        public boolean addAll(final Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            final int size = this.size();
            final boolean addAll = this.p.addAll(collection);
            if (addAll) {
                d.l(d.this, this.p.size() - size);
                if (size == 0) {
                    this.a();
                }
            }
            return addAll;
        }
        
        @Override
        public void clear() {
            final int size = this.size();
            if (size == 0) {
                return;
            }
            this.p.clear();
            d.m(d.this, size);
            this.k();
        }
        
        @Override
        public boolean contains(final Object o) {
            this.i();
            return this.p.contains(o);
        }
        
        @Override
        public boolean containsAll(final Collection collection) {
            this.i();
            return this.p.containsAll(collection);
        }
        
        public j d() {
            return this.q;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (o == this) {
                return true;
            }
            this.i();
            return this.p.equals(o);
        }
        
        public Collection f() {
            return this.p;
        }
        
        public Object g() {
            return this.o;
        }
        
        @Override
        public int hashCode() {
            this.i();
            return this.p.hashCode();
        }
        
        public void i() {
            final j q = this.q;
            if (q == null) {
                if (this.p.isEmpty()) {
                    final Collection p = d.h(d.this).get(this.o);
                    if (p != null) {
                        this.p = p;
                    }
                }
                return;
            }
            q.i();
            if (this.q.f() == this.r) {
                return;
            }
            throw new ConcurrentModificationException();
        }
        
        @Override
        public Iterator iterator() {
            this.i();
            return new a();
        }
        
        public void k() {
            final j q = this.q;
            if (q != null) {
                q.k();
                return;
            }
            if (this.p.isEmpty()) {
                d.h(d.this).remove(this.o);
            }
        }
        
        @Override
        public boolean remove(final Object o) {
            this.i();
            final boolean remove = this.p.remove(o);
            if (remove) {
                d.k(d.this);
                this.k();
            }
            return remove;
        }
        
        @Override
        public boolean removeAll(final Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            final int size = this.size();
            final boolean removeAll = this.p.removeAll(collection);
            if (removeAll) {
                d.l(d.this, this.p.size() - size);
                this.k();
            }
            return removeAll;
        }
        
        @Override
        public boolean retainAll(final Collection collection) {
            m.j(collection);
            final int size = this.size();
            final boolean retainAll = this.p.retainAll(collection);
            if (retainAll) {
                d.l(d.this, this.p.size() - size);
                this.k();
            }
            return retainAll;
        }
        
        @Override
        public int size() {
            this.i();
            return this.p.size();
        }
        
        @Override
        public String toString() {
            this.i();
            return this.p.toString();
        }
        
        public class a implements Iterator
        {
            public final Iterator o;
            public final Collection p;
            
            public a() {
                final Collection p = j.this.p;
                this.p = p;
                this.o = t(p);
            }
            
            public a(final Iterator o) {
                this.p = j.this.p;
                this.o = o;
            }
            
            public Iterator b() {
                this.d();
                return this.o;
            }
            
            public void d() {
                j.this.i();
                if (j.this.p == this.p) {
                    return;
                }
                throw new ConcurrentModificationException();
            }
            
            @Override
            public boolean hasNext() {
                this.d();
                return this.o.hasNext();
            }
            
            @Override
            public Object next() {
                this.d();
                return this.o.next();
            }
            
            @Override
            public void remove() {
                this.o.remove();
                d.k(d.this);
                j.this.k();
            }
        }
    }
    
    public class k extends j implements List
    {
        public k(final Object o, final List list, final j j) {
            super(o, list, j);
        }
        
        @Override
        public void add(final int n, final Object o) {
            ((j)this).i();
            final boolean empty = ((j)this).f().isEmpty();
            this.q().add(n, o);
            d.j(d.this);
            if (empty) {
                ((j)this).a();
            }
        }
        
        @Override
        public boolean addAll(int size, final Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            final int size2 = ((j)this).size();
            final boolean addAll = this.q().addAll(size, collection);
            if (addAll) {
                size = ((j)this).f().size();
                d.l(d.this, size - size2);
                if (size2 == 0) {
                    ((j)this).a();
                }
            }
            return addAll;
        }
        
        @Override
        public Object get(final int n) {
            ((j)this).i();
            return this.q().get(n);
        }
        
        @Override
        public int indexOf(final Object o) {
            ((j)this).i();
            return this.q().indexOf(o);
        }
        
        @Override
        public int lastIndexOf(final Object o) {
            ((j)this).i();
            return this.q().lastIndexOf(o);
        }
        
        @Override
        public ListIterator listIterator() {
            ((j)this).i();
            return new a();
        }
        
        @Override
        public ListIterator listIterator(final int n) {
            ((j)this).i();
            return new a(n);
        }
        
        public List q() {
            return (List)((j)this).f();
        }
        
        @Override
        public Object remove(final int n) {
            ((j)this).i();
            final Object remove = this.q().remove(n);
            d.k(d.this);
            ((j)this).k();
            return remove;
        }
        
        @Override
        public Object set(final int n, final Object o) {
            ((j)this).i();
            return this.q().set(n, o);
        }
        
        @Override
        public List subList(final int n, final int n2) {
            ((j)this).i();
            final d t = d.this;
            final Object g = ((j)this).g();
            final List subList = this.q().subList(n, n2);
            AbstractCollection d;
            if (((j)this).d() == null) {
                d = this;
            }
            else {
                d = ((j)this).d();
            }
            return t.y(g, subList, (j)d);
        }
        
        public class a extends j.a implements ListIterator
        {
            public a() {
                (j)k.this.super();
            }
            
            public a(final int n) {
                (j)k.this.super(k.this.q().listIterator(n));
            }
            
            @Override
            public void add(final Object o) {
                final boolean empty = k.this.isEmpty();
                this.e().add(o);
                d.j(d.this);
                if (empty) {
                    ((j)k.this).a();
                }
            }
            
            public final ListIterator e() {
                return (ListIterator)((j.a)this).b();
            }
            
            @Override
            public boolean hasPrevious() {
                return this.e().hasPrevious();
            }
            
            @Override
            public int nextIndex() {
                return this.e().nextIndex();
            }
            
            @Override
            public Object previous() {
                return this.e().previous();
            }
            
            @Override
            public int previousIndex() {
                return this.e().previousIndex();
            }
            
            @Override
            public void set(final Object o) {
                this.e().set(o);
            }
        }
    }
}
