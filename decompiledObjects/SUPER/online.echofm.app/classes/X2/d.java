package X2;

import W2.m;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

public abstract class d
  extends f
  implements Serializable
{
  private static final long serialVersionUID = 2447537837011683357L;
  public transient Map r;
  public transient int s;
  
  public d(Map paramMap)
  {
    m.d(paramMap.isEmpty());
    r = paramMap;
  }
  
  public static Iterator t(Collection paramCollection)
  {
    if ((paramCollection instanceof List)) {
      paramCollection = ((List)paramCollection).listIterator();
    } else {
      paramCollection = paramCollection.iterator();
    }
    return paramCollection;
  }
  
  public void clear()
  {
    Iterator localIterator = r.values().iterator();
    while (localIterator.hasNext()) {
      ((Collection)localIterator.next()).clear();
    }
    r.clear();
    s = 0;
  }
  
  public Collection e()
  {
    return new f.a(this);
  }
  
  public Iterator g()
  {
    return new a();
  }
  
  public Map o()
  {
    return r;
  }
  
  public abstract Collection p();
  
  public boolean put(Object paramObject1, Object paramObject2)
  {
    Collection localCollection = (Collection)r.get(paramObject1);
    if (localCollection == null)
    {
      localCollection = q(paramObject1);
      if (localCollection.add(paramObject2))
      {
        s += 1;
        r.put(paramObject1, localCollection);
        return true;
      }
      throw new AssertionError("New Collection violated the Collection spec");
    }
    if (localCollection.add(paramObject2))
    {
      s += 1;
      return true;
    }
    return false;
  }
  
  public Collection q(Object paramObject)
  {
    return p();
  }
  
  public final Map r()
  {
    Map localMap = r;
    if ((localMap instanceof NavigableMap)) {
      return new e((NavigableMap)r);
    }
    if ((localMap instanceof SortedMap)) {
      return new h((SortedMap)r);
    }
    return new b(r);
  }
  
  public final Set s()
  {
    Map localMap = r;
    if ((localMap instanceof NavigableMap)) {
      return new f((NavigableMap)r);
    }
    if ((localMap instanceof SortedMap)) {
      return new i((SortedMap)r);
    }
    return new d(r);
  }
  
  public int size()
  {
    return s;
  }
  
  public final void u(Object paramObject)
  {
    paramObject = (Collection)G.j(r, paramObject);
    if (paramObject != null)
    {
      int i = ((Collection)paramObject).size();
      ((Collection)paramObject).clear();
      s -= i;
    }
  }
  
  public final void v(Map paramMap)
  {
    r = paramMap;
    s = 0;
    paramMap = paramMap.values().iterator();
    while (paramMap.hasNext())
    {
      Collection localCollection = (Collection)paramMap.next();
      m.d(localCollection.isEmpty() ^ true);
      s += localCollection.size();
    }
  }
  
  public Collection values()
  {
    return super.values();
  }
  
  public abstract Collection w(Collection paramCollection);
  
  public abstract Collection x(Object paramObject, Collection paramCollection);
  
  public final List y(Object paramObject, List paramList, j paramj)
  {
    if ((paramList instanceof RandomAccess)) {
      paramObject = new g(paramObject, paramList, paramj);
    } else {
      paramObject = new k(paramObject, paramList, paramj);
    }
    return (List)paramObject;
  }
  
  public class a
    extends d.c
  {
    public a()
    {
      super();
    }
    
    public Object b(Object paramObject1, Object paramObject2)
    {
      return paramObject2;
    }
  }
  
  public class b
    extends G.f
  {
    public final transient Map q;
    
    public b(Map paramMap)
    {
      q = paramMap;
    }
    
    public Set a()
    {
      return new a();
    }
    
    public Collection c(Object paramObject)
    {
      Collection localCollection = (Collection)G.i(q, paramObject);
      if (localCollection == null) {
        return null;
      }
      return x(paramObject, localCollection);
    }
    
    public void clear()
    {
      if (q == d.h(d.this)) {
        d.this.clear();
      } else {
        C.c(new b());
      }
    }
    
    public boolean containsKey(Object paramObject)
    {
      return G.h(q, paramObject);
    }
    
    public Collection d(Object paramObject)
    {
      Collection localCollection = (Collection)q.remove(paramObject);
      if (localCollection == null) {
        return null;
      }
      paramObject = p();
      ((Collection)paramObject).addAll(localCollection);
      d.m(d.this, localCollection.size());
      localCollection.clear();
      return (Collection)paramObject;
    }
    
    public Map.Entry e(Map.Entry paramEntry)
    {
      Object localObject = paramEntry.getKey();
      return G.d(localObject, x(localObject, (Collection)paramEntry.getValue()));
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool;
      if ((this != paramObject) && (!q.equals(paramObject))) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public int hashCode()
    {
      return q.hashCode();
    }
    
    public Set keySet()
    {
      return f();
    }
    
    public int size()
    {
      return q.size();
    }
    
    public String toString()
    {
      return q.toString();
    }
    
    public class a
      extends G.c
    {
      public a() {}
      
      public Map a()
      {
        return d.b.this;
      }
      
      public boolean contains(Object paramObject)
      {
        return j.c(q.entrySet(), paramObject);
      }
      
      public Iterator iterator()
      {
        return new d.b.b(d.b.this);
      }
      
      public boolean remove(Object paramObject)
      {
        if (!contains(paramObject)) {
          return false;
        }
        paramObject = (Map.Entry)paramObject;
        Objects.requireNonNull(paramObject);
        paramObject = (Map.Entry)paramObject;
        d.n(d.this, ((Map.Entry)paramObject).getKey());
        return true;
      }
    }
    
    public class b
      implements Iterator
    {
      public final Iterator o = q.entrySet().iterator();
      public Collection p;
      
      public b() {}
      
      public Map.Entry b()
      {
        Map.Entry localEntry = (Map.Entry)o.next();
        p = ((Collection)localEntry.getValue());
        return e(localEntry);
      }
      
      public boolean hasNext()
      {
        return o.hasNext();
      }
      
      public void remove()
      {
        boolean bool;
        if (p != null) {
          bool = true;
        } else {
          bool = false;
        }
        m.p(bool, "no calls to next() since the last call to remove()");
        o.remove();
        d.m(d.this, p.size());
        p.clear();
        p = null;
      }
    }
  }
  
  public abstract class c
    implements Iterator
  {
    public final Iterator o = d.h(d.this).entrySet().iterator();
    public Object p = null;
    public Collection q = null;
    public Iterator r = C.h();
    
    public c() {}
    
    public abstract Object b(Object paramObject1, Object paramObject2);
    
    public boolean hasNext()
    {
      boolean bool;
      if ((!o.hasNext()) && (!r.hasNext())) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public Object next()
    {
      if (!r.hasNext())
      {
        Object localObject = (Map.Entry)o.next();
        p = ((Map.Entry)localObject).getKey();
        localObject = (Collection)((Map.Entry)localObject).getValue();
        q = ((Collection)localObject);
        r = ((Collection)localObject).iterator();
      }
      return b(N.a(p), r.next());
    }
    
    public void remove()
    {
      r.remove();
      Collection localCollection = q;
      Objects.requireNonNull(localCollection);
      if (((Collection)localCollection).isEmpty()) {
        o.remove();
      }
      d.k(d.this);
    }
  }
  
  public class d
    extends G.d
  {
    public d(Map paramMap)
    {
      super();
    }
    
    public void clear()
    {
      C.c(iterator());
    }
    
    public boolean containsAll(Collection paramCollection)
    {
      return a().keySet().containsAll(paramCollection);
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool;
      if ((this != paramObject) && (!a().keySet().equals(paramObject))) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public int hashCode()
    {
      return a().keySet().hashCode();
    }
    
    public Iterator iterator()
    {
      return new a(a().entrySet().iterator());
    }
    
    public boolean remove(Object paramObject)
    {
      paramObject = (Collection)a().remove(paramObject);
      if (paramObject != null)
      {
        int i = ((Collection)paramObject).size();
        ((Collection)paramObject).clear();
        d.m(d.this, i);
        if (i > 0) {
          return true;
        }
      }
      boolean bool = false;
      return bool;
    }
    
    public class a
      implements Iterator
    {
      public Map.Entry o;
      
      public a(Iterator paramIterator) {}
      
      public boolean hasNext()
      {
        return p.hasNext();
      }
      
      public Object next()
      {
        Map.Entry localEntry = (Map.Entry)p.next();
        o = localEntry;
        return localEntry.getKey();
      }
      
      public void remove()
      {
        boolean bool;
        if (o != null) {
          bool = true;
        } else {
          bool = false;
        }
        m.p(bool, "no calls to next() since the last call to remove()");
        Collection localCollection = (Collection)o.getValue();
        p.remove();
        d.m(d.this, localCollection.size());
        localCollection.clear();
        o = null;
      }
    }
  }
  
  public final class e
    extends d.h
    implements NavigableMap
  {
    public e(NavigableMap paramNavigableMap)
    {
      super(paramNavigableMap);
    }
    
    public Map.Entry ceilingEntry(Object paramObject)
    {
      paramObject = m().ceilingEntry(paramObject);
      if (paramObject == null) {
        paramObject = null;
      } else {
        paramObject = e((Map.Entry)paramObject);
      }
      return (Map.Entry)paramObject;
    }
    
    public Object ceilingKey(Object paramObject)
    {
      return m().ceilingKey(paramObject);
    }
    
    public NavigableSet descendingKeySet()
    {
      return descendingMap().navigableKeySet();
    }
    
    public NavigableMap descendingMap()
    {
      return new e(d.this, m().descendingMap());
    }
    
    public Map.Entry firstEntry()
    {
      Map.Entry localEntry = m().firstEntry();
      if (localEntry == null) {
        localEntry = null;
      } else {
        localEntry = e(localEntry);
      }
      return localEntry;
    }
    
    public Map.Entry floorEntry(Object paramObject)
    {
      paramObject = m().floorEntry(paramObject);
      if (paramObject == null) {
        paramObject = null;
      } else {
        paramObject = e((Map.Entry)paramObject);
      }
      return (Map.Entry)paramObject;
    }
    
    public Object floorKey(Object paramObject)
    {
      return m().floorKey(paramObject);
    }
    
    public NavigableMap headMap(Object paramObject, boolean paramBoolean)
    {
      return new e(d.this, m().headMap(paramObject, paramBoolean));
    }
    
    public Map.Entry higherEntry(Object paramObject)
    {
      paramObject = m().higherEntry(paramObject);
      if (paramObject == null) {
        paramObject = null;
      } else {
        paramObject = e((Map.Entry)paramObject);
      }
      return (Map.Entry)paramObject;
    }
    
    public Object higherKey(Object paramObject)
    {
      return m().higherKey(paramObject);
    }
    
    public NavigableSet i()
    {
      return new d.f(d.this, m());
    }
    
    public NavigableMap j(Object paramObject)
    {
      return headMap(paramObject, false);
    }
    
    public NavigableSet k()
    {
      return (NavigableSet)super.g();
    }
    
    public Map.Entry l(Iterator paramIterator)
    {
      if (!paramIterator.hasNext()) {
        return null;
      }
      Map.Entry localEntry = (Map.Entry)paramIterator.next();
      Collection localCollection = p();
      localCollection.addAll((Collection)localEntry.getValue());
      paramIterator.remove();
      return G.d(localEntry.getKey(), w(localCollection));
    }
    
    public Map.Entry lastEntry()
    {
      Map.Entry localEntry = m().lastEntry();
      if (localEntry == null) {
        localEntry = null;
      } else {
        localEntry = e(localEntry);
      }
      return localEntry;
    }
    
    public Map.Entry lowerEntry(Object paramObject)
    {
      paramObject = m().lowerEntry(paramObject);
      if (paramObject == null) {
        paramObject = null;
      } else {
        paramObject = e((Map.Entry)paramObject);
      }
      return (Map.Entry)paramObject;
    }
    
    public Object lowerKey(Object paramObject)
    {
      return m().lowerKey(paramObject);
    }
    
    public NavigableMap m()
    {
      return (NavigableMap)super.h();
    }
    
    public NavigableMap n(Object paramObject1, Object paramObject2)
    {
      return subMap(paramObject1, true, paramObject2, false);
    }
    
    public NavigableSet navigableKeySet()
    {
      return k();
    }
    
    public NavigableMap o(Object paramObject)
    {
      return tailMap(paramObject, true);
    }
    
    public Map.Entry pollFirstEntry()
    {
      return l(entrySet().iterator());
    }
    
    public Map.Entry pollLastEntry()
    {
      return l(descendingMap().entrySet().iterator());
    }
    
    public NavigableMap subMap(Object paramObject1, boolean paramBoolean1, Object paramObject2, boolean paramBoolean2)
    {
      return new e(d.this, m().subMap(paramObject1, paramBoolean1, paramObject2, paramBoolean2));
    }
    
    public NavigableMap tailMap(Object paramObject, boolean paramBoolean)
    {
      return new e(d.this, m().tailMap(paramObject, paramBoolean));
    }
  }
  
  public final class f
    extends d.i
    implements NavigableSet
  {
    public f(NavigableMap paramNavigableMap)
    {
      super(paramNavigableMap);
    }
    
    public Object ceiling(Object paramObject)
    {
      return g().ceilingKey(paramObject);
    }
    
    public Iterator descendingIterator()
    {
      return descendingSet().iterator();
    }
    
    public NavigableSet descendingSet()
    {
      return new f(d.this, g().descendingMap());
    }
    
    public NavigableSet f(Object paramObject)
    {
      return headSet(paramObject, false);
    }
    
    public Object floor(Object paramObject)
    {
      return g().floorKey(paramObject);
    }
    
    public NavigableMap g()
    {
      return (NavigableMap)super.d();
    }
    
    public NavigableSet headSet(Object paramObject, boolean paramBoolean)
    {
      return new f(d.this, g().headMap(paramObject, paramBoolean));
    }
    
    public Object higher(Object paramObject)
    {
      return g().higherKey(paramObject);
    }
    
    public NavigableSet i(Object paramObject1, Object paramObject2)
    {
      return subSet(paramObject1, true, paramObject2, false);
    }
    
    public NavigableSet k(Object paramObject)
    {
      return tailSet(paramObject, true);
    }
    
    public Object lower(Object paramObject)
    {
      return g().lowerKey(paramObject);
    }
    
    public Object pollFirst()
    {
      return C.p(iterator());
    }
    
    public Object pollLast()
    {
      return C.p(descendingIterator());
    }
    
    public NavigableSet subSet(Object paramObject1, boolean paramBoolean1, Object paramObject2, boolean paramBoolean2)
    {
      return new f(d.this, g().subMap(paramObject1, paramBoolean1, paramObject2, paramBoolean2));
    }
    
    public NavigableSet tailSet(Object paramObject, boolean paramBoolean)
    {
      return new f(d.this, g().tailMap(paramObject, paramBoolean));
    }
  }
  
  public class g
    extends d.k
    implements RandomAccess
  {
    public g(Object paramObject, List paramList, d.j paramj)
    {
      super(paramObject, paramList, paramj);
    }
  }
  
  public class h
    extends d.b
    implements SortedMap
  {
    public SortedSet s;
    
    public h(SortedMap paramSortedMap)
    {
      super(paramSortedMap);
    }
    
    public Comparator comparator()
    {
      return h().comparator();
    }
    
    public SortedSet f()
    {
      return new d.i(d.this, h());
    }
    
    public Object firstKey()
    {
      return h().firstKey();
    }
    
    public SortedSet g()
    {
      SortedSet localSortedSet1 = s;
      SortedSet localSortedSet2 = localSortedSet1;
      if (localSortedSet1 == null)
      {
        localSortedSet2 = f();
        s = localSortedSet2;
      }
      return localSortedSet2;
    }
    
    public SortedMap h()
    {
      return (SortedMap)q;
    }
    
    public SortedMap headMap(Object paramObject)
    {
      return new h(d.this, h().headMap(paramObject));
    }
    
    public Object lastKey()
    {
      return h().lastKey();
    }
    
    public SortedMap subMap(Object paramObject1, Object paramObject2)
    {
      return new h(d.this, h().subMap(paramObject1, paramObject2));
    }
    
    public SortedMap tailMap(Object paramObject)
    {
      return new h(d.this, h().tailMap(paramObject));
    }
  }
  
  public class i
    extends d.d
    implements SortedSet
  {
    public i(SortedMap paramSortedMap)
    {
      super(paramSortedMap);
    }
    
    public Comparator comparator()
    {
      return d().comparator();
    }
    
    public SortedMap d()
    {
      return (SortedMap)super.a();
    }
    
    public Object first()
    {
      return d().firstKey();
    }
    
    public SortedSet headSet(Object paramObject)
    {
      return new i(d.this, d().headMap(paramObject));
    }
    
    public Object last()
    {
      return d().lastKey();
    }
    
    public SortedSet subSet(Object paramObject1, Object paramObject2)
    {
      return new i(d.this, d().subMap(paramObject1, paramObject2));
    }
    
    public SortedSet tailSet(Object paramObject)
    {
      return new i(d.this, d().tailMap(paramObject));
    }
  }
  
  public abstract class j
    extends AbstractCollection
  {
    public final Object o;
    public Collection p;
    public final j q;
    public final Collection r;
    
    public j(Object paramObject, Collection paramCollection, j paramj)
    {
      o = paramObject;
      p = paramCollection;
      q = paramj;
      if (paramj == null) {
        this$1 = null;
      } else {
        this$1 = paramj.f();
      }
      r = d.this;
    }
    
    public void a()
    {
      j localj = q;
      if (localj != null) {
        localj.a();
      } else {
        d.h(d.this).put(o, p);
      }
    }
    
    public boolean add(Object paramObject)
    {
      i();
      boolean bool1 = p.isEmpty();
      boolean bool2 = p.add(paramObject);
      if (bool2)
      {
        d.j(d.this);
        if (bool1) {
          a();
        }
      }
      return bool2;
    }
    
    public boolean addAll(Collection paramCollection)
    {
      if (paramCollection.isEmpty()) {
        return false;
      }
      int i = size();
      boolean bool = p.addAll(paramCollection);
      if (bool)
      {
        int j = p.size();
        d.l(d.this, j - i);
        if (i == 0) {
          a();
        }
      }
      return bool;
    }
    
    public void clear()
    {
      int i = size();
      if (i == 0) {
        return;
      }
      p.clear();
      d.m(d.this, i);
      k();
    }
    
    public boolean contains(Object paramObject)
    {
      i();
      return p.contains(paramObject);
    }
    
    public boolean containsAll(Collection paramCollection)
    {
      i();
      return p.containsAll(paramCollection);
    }
    
    public j d()
    {
      return q;
    }
    
    public boolean equals(Object paramObject)
    {
      if (paramObject == this) {
        return true;
      }
      i();
      return p.equals(paramObject);
    }
    
    public Collection f()
    {
      return p;
    }
    
    public Object g()
    {
      return o;
    }
    
    public int hashCode()
    {
      i();
      return p.hashCode();
    }
    
    public void i()
    {
      Object localObject = q;
      if (localObject != null)
      {
        ((j)localObject).i();
        if (q.f() != r) {
          throw new ConcurrentModificationException();
        }
      }
      else if (p.isEmpty())
      {
        localObject = (Collection)d.h(d.this).get(o);
        if (localObject != null) {
          p = ((Collection)localObject);
        }
      }
    }
    
    public Iterator iterator()
    {
      i();
      return new a();
    }
    
    public void k()
    {
      j localj = q;
      if (localj != null) {
        localj.k();
      } else if (p.isEmpty()) {
        d.h(d.this).remove(o);
      }
    }
    
    public boolean remove(Object paramObject)
    {
      i();
      boolean bool = p.remove(paramObject);
      if (bool)
      {
        d.k(d.this);
        k();
      }
      return bool;
    }
    
    public boolean removeAll(Collection paramCollection)
    {
      if (paramCollection.isEmpty()) {
        return false;
      }
      int i = size();
      boolean bool = p.removeAll(paramCollection);
      if (bool)
      {
        int j = p.size();
        d.l(d.this, j - i);
        k();
      }
      return bool;
    }
    
    public boolean retainAll(Collection paramCollection)
    {
      m.j(paramCollection);
      int i = size();
      boolean bool = p.retainAll(paramCollection);
      if (bool)
      {
        int j = p.size();
        d.l(d.this, j - i);
        k();
      }
      return bool;
    }
    
    public int size()
    {
      i();
      return p.size();
    }
    
    public String toString()
    {
      i();
      return p.toString();
    }
    
    public class a
      implements Iterator
    {
      public final Iterator o;
      public final Collection p;
      
      public a()
      {
        this$1 = p;
        p = d.j.this;
        o = d.i(d.j.this);
      }
      
      public a(Iterator paramIterator)
      {
        p = p;
        o = paramIterator;
      }
      
      public Iterator b()
      {
        d();
        return o;
      }
      
      public void d()
      {
        i();
        if (p == p) {
          return;
        }
        throw new ConcurrentModificationException();
      }
      
      public boolean hasNext()
      {
        d();
        return o.hasNext();
      }
      
      public Object next()
      {
        d();
        return o.next();
      }
      
      public void remove()
      {
        o.remove();
        d.k(d.this);
        k();
      }
    }
  }
  
  public class k
    extends d.j
    implements List
  {
    public k(Object paramObject, List paramList, d.j paramj)
    {
      super(paramObject, paramList, paramj);
    }
    
    public void add(int paramInt, Object paramObject)
    {
      i();
      boolean bool = f().isEmpty();
      q().add(paramInt, paramObject);
      d.j(d.this);
      if (bool) {
        a();
      }
    }
    
    public boolean addAll(int paramInt, Collection paramCollection)
    {
      if (paramCollection.isEmpty()) {
        return false;
      }
      int i = size();
      boolean bool = q().addAll(paramInt, paramCollection);
      if (bool)
      {
        paramInt = f().size();
        d.l(d.this, paramInt - i);
        if (i == 0) {
          a();
        }
      }
      return bool;
    }
    
    public Object get(int paramInt)
    {
      i();
      return q().get(paramInt);
    }
    
    public int indexOf(Object paramObject)
    {
      i();
      return q().indexOf(paramObject);
    }
    
    public int lastIndexOf(Object paramObject)
    {
      i();
      return q().lastIndexOf(paramObject);
    }
    
    public ListIterator listIterator()
    {
      i();
      return new a();
    }
    
    public ListIterator listIterator(int paramInt)
    {
      i();
      return new a(paramInt);
    }
    
    public List q()
    {
      return (List)f();
    }
    
    public Object remove(int paramInt)
    {
      i();
      Object localObject = q().remove(paramInt);
      d.k(d.this);
      k();
      return localObject;
    }
    
    public Object set(int paramInt, Object paramObject)
    {
      i();
      return q().set(paramInt, paramObject);
    }
    
    public List subList(int paramInt1, int paramInt2)
    {
      i();
      d locald = d.this;
      Object localObject1 = g();
      List localList = q().subList(paramInt1, paramInt2);
      Object localObject2;
      if (d() == null) {
        localObject2 = this;
      } else {
        localObject2 = d();
      }
      return locald.y(localObject1, localList, (d.j)localObject2);
    }
    
    public class a
      extends d.j.a
      implements ListIterator
    {
      public a()
      {
        super();
      }
      
      public a(int paramInt)
      {
        super(q().listIterator(paramInt));
      }
      
      public void add(Object paramObject)
      {
        boolean bool = isEmpty();
        e().add(paramObject);
        d.j(d.this);
        if (bool) {
          a();
        }
      }
      
      public final ListIterator e()
      {
        return (ListIterator)b();
      }
      
      public boolean hasPrevious()
      {
        return e().hasPrevious();
      }
      
      public int nextIndex()
      {
        return e().nextIndex();
      }
      
      public Object previous()
      {
        return e().previous();
      }
      
      public int previousIndex()
      {
        return e().previousIndex();
      }
      
      public void set(Object paramObject)
      {
        e().set(paramObject);
      }
    }
  }
}

/* Location:
 * Qualified Name:     X2.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */