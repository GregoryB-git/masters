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
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import n7.q;
import x6.b;

public abstract class d<K, V>
  extends f<K, V>
  implements Serializable
{
  public transient Map<K, Collection<V>> d;
  public transient int e;
  
  public d(TreeMap paramTreeMap)
  {
    b.t(paramTreeMap.isEmpty());
    d = paramTreeMap;
  }
  
  public final void clear()
  {
    Iterator localIterator = d.values().iterator();
    while (localIterator.hasNext()) {
      ((Collection)localIterator.next()).clear();
    }
    d.clear();
    e = 0;
  }
  
  public final Iterator<V> e()
  {
    return new a();
  }
  
  public final Collection<V> f()
  {
    return new f.a(this);
  }
  
  public final Collection<V> g()
  {
    Collection localCollection1 = b;
    Collection localCollection2 = localCollection1;
    if (localCollection1 == null)
    {
      localCollection2 = f();
      b = localCollection2;
    }
    return localCollection2;
  }
  
  public final int size()
  {
    return e;
  }
  
  public final class a
    extends d<K, V>.c<V>
  {
    public a()
    {
      super();
    }
  }
  
  public class b
    extends e0.d<K, Collection<V>>
  {
    public final transient Map<K, Collection<V>> c;
    
    public b()
    {
      Map localMap;
      c = localMap;
    }
    
    public final s b(Map.Entry paramEntry)
    {
      Object localObject1 = paramEntry.getKey();
      d locald = d.this;
      Object localObject2 = (Collection)paramEntry.getValue();
      paramEntry = (c)locald;
      paramEntry.getClass();
      localObject2 = (List)localObject2;
      if ((localObject2 instanceof RandomAccess)) {
        paramEntry = new d.g(paramEntry, localObject1, (List)localObject2, null);
      } else {
        paramEntry = new d.k(paramEntry, localObject1, (List)localObject2, null);
      }
      return new s(localObject1, paramEntry);
    }
    
    public final void clear()
    {
      Object localObject = c;
      d locald = d.this;
      if (localObject == d)
      {
        locald.clear();
      }
      else
      {
        localObject = new b();
        while (((b)localObject).hasNext())
        {
          ((b)localObject).next();
          ((b)localObject).remove();
        }
      }
    }
    
    public final boolean containsKey(Object paramObject)
    {
      Map localMap = c;
      localMap.getClass();
      boolean bool;
      try
      {
        bool = localMap.containsKey(paramObject);
      }
      catch (ClassCastException|NullPointerException paramObject)
      {
        bool = false;
      }
      return bool;
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool;
      if ((this != paramObject) && (!c.equals(paramObject))) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public final Object get(Object paramObject)
    {
      Object localObject = c;
      localObject.getClass();
      List localList = null;
      c localc;
      try
      {
        localObject = ((Map)localObject).get(paramObject);
      }
      catch (ClassCastException|NullPointerException localClassCastException)
      {
        localc = null;
      }
      Collection localCollection = (Collection)localc;
      if (localCollection == null)
      {
        paramObject = localList;
      }
      else
      {
        localc = (c)d.this;
        localc.getClass();
        localList = (List)localCollection;
        if ((localList instanceof RandomAccess)) {
          paramObject = new d.g(localc, paramObject, localList, null);
        } else {
          paramObject = new d.k(localc, paramObject, localList, null);
        }
      }
      return paramObject;
    }
    
    public final int hashCode()
    {
      return c.hashCode();
    }
    
    public Set<K> keySet()
    {
      d locald = d.this;
      Set localSet1 = a;
      Set localSet2 = localSet1;
      if (localSet1 == null)
      {
        localSet2 = locald.d();
        a = localSet2;
      }
      return localSet2;
    }
    
    public final Object remove(Object paramObject)
    {
      Collection localCollection = (Collection)c.remove(paramObject);
      if (localCollection == null)
      {
        paramObject = null;
      }
      else
      {
        paramObject = (List)f.get();
        ((Collection)paramObject).addAll(localCollection);
        d locald = d.this;
        int i = localCollection.size();
        e -= i;
        localCollection.clear();
      }
      return paramObject;
    }
    
    public final int size()
    {
      return c.size();
    }
    
    public final String toString()
    {
      return c.toString();
    }
    
    public final class a
      extends e0.a<K, Collection<V>>
    {
      public a() {}
      
      public final boolean contains(Object paramObject)
      {
        Set localSet = c.entrySet();
        localSet.getClass();
        boolean bool;
        try
        {
          bool = localSet.contains(paramObject);
        }
        catch (ClassCastException|NullPointerException paramObject)
        {
          bool = false;
        }
        return bool;
      }
      
      public final Iterator<Map.Entry<K, Collection<V>>> iterator()
      {
        return new d.b.b(d.b.this);
      }
      
      public final boolean remove(Object paramObject)
      {
        if (!contains(paramObject)) {
          return false;
        }
        paramObject = (Map.Entry)paramObject;
        Objects.requireNonNull(paramObject);
        paramObject = (Map.Entry)paramObject;
        d locald = d.this;
        Object localObject = ((Map.Entry)paramObject).getKey();
        paramObject = d;
        paramObject.getClass();
        try
        {
          paramObject = ((Map)paramObject).remove(localObject);
        }
        catch (ClassCastException|NullPointerException paramObject)
        {
          paramObject = null;
        }
        paramObject = (Collection)paramObject;
        if (paramObject != null)
        {
          int i = ((Collection)paramObject).size();
          ((Collection)paramObject).clear();
          e -= i;
        }
        return true;
      }
    }
    
    public final class b
      implements Iterator<Map.Entry<K, Collection<V>>>
    {
      public final Iterator<Map.Entry<K, Collection<V>>> a = c.entrySet().iterator();
      public Collection<V> b;
      
      public b() {}
      
      public final boolean hasNext()
      {
        return a.hasNext();
      }
      
      public final Object next()
      {
        Map.Entry localEntry = (Map.Entry)a.next();
        b = ((Collection)localEntry.getValue());
        return b(localEntry);
      }
      
      public final void remove()
      {
        boolean bool;
        if (b != null) {
          bool = true;
        } else {
          bool = false;
        }
        b.I(bool, "no calls to next() since the last call to remove()");
        a.remove();
        d locald = d.this;
        int i = b.size();
        e -= i;
        b.clear();
        b = null;
      }
    }
  }
  
  public abstract class c<T>
    implements Iterator<T>
  {
    public final Iterator<Map.Entry<K, Collection<V>>> a = d.entrySet().iterator();
    public K b = null;
    public Collection<V> c = null;
    public Iterator<V> d = b0.b.a;
    
    public c() {}
    
    public final boolean hasNext()
    {
      boolean bool;
      if ((!a.hasNext()) && (!d.hasNext())) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public final T next()
    {
      if (!d.hasNext())
      {
        Object localObject = (Map.Entry)a.next();
        b = ((Map.Entry)localObject).getKey();
        localObject = (Collection)((Map.Entry)localObject).getValue();
        c = ((Collection)localObject);
        d = ((Collection)localObject).iterator();
      }
      return (T)d.next();
    }
    
    public final void remove()
    {
      d.remove();
      Object localObject = c;
      Objects.requireNonNull(localObject);
      if (((Collection)localObject).isEmpty()) {
        a.remove();
      }
      localObject = d.this;
      e -= 1;
    }
  }
  
  public class d
    extends e0.b<K, Collection<V>>
  {
    public d()
    {
      super();
    }
    
    public final void clear()
    {
      Iterator localIterator = iterator();
      for (;;)
      {
        a locala = (a)localIterator;
        if (!locala.hasNext()) {
          break;
        }
        locala.next();
        locala.remove();
      }
    }
    
    public final boolean containsAll(Collection<?> paramCollection)
    {
      return a.keySet().containsAll(paramCollection);
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool;
      if ((this != paramObject) && (!a.keySet().equals(paramObject))) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public final int hashCode()
    {
      return a.keySet().hashCode();
    }
    
    public final Iterator<K> iterator()
    {
      return new a(a.entrySet().iterator());
    }
    
    public final boolean remove(Object paramObject)
    {
      paramObject = (Collection)a.remove(paramObject);
      boolean bool = false;
      int i;
      if (paramObject != null)
      {
        i = ((Collection)paramObject).size();
        ((Collection)paramObject).clear();
        paramObject = d.this;
        e -= i;
      }
      else
      {
        i = 0;
      }
      if (i > 0) {
        bool = true;
      }
      return bool;
    }
    
    public final class a
      implements Iterator<K>
    {
      public Map.Entry<K, Collection<V>> a;
      
      public a(Iterator paramIterator) {}
      
      public final boolean hasNext()
      {
        return b.hasNext();
      }
      
      public final K next()
      {
        Map.Entry localEntry = (Map.Entry)b.next();
        a = localEntry;
        return (K)localEntry.getKey();
      }
      
      public final void remove()
      {
        boolean bool;
        if (a != null) {
          bool = true;
        } else {
          bool = false;
        }
        b.I(bool, "no calls to next() since the last call to remove()");
        Collection localCollection = (Collection)a.getValue();
        b.remove();
        d locald = d.this;
        int i = localCollection.size();
        e -= i;
        localCollection.clear();
        a = null;
      }
    }
  }
  
  public final class e
    extends d<K, V>.h
    implements NavigableMap<K, Collection<V>>
  {
    public e()
    {
      super(localSortedMap);
    }
    
    public final SortedSet c()
    {
      return new d.f(d.this, g());
    }
    
    public final Map.Entry<K, Collection<V>> ceilingEntry(K paramK)
    {
      paramK = g().ceilingEntry(paramK);
      if (paramK == null) {
        paramK = null;
      } else {
        paramK = b(paramK);
      }
      return paramK;
    }
    
    public final K ceilingKey(K paramK)
    {
      return (K)g().ceilingKey(paramK);
    }
    
    public final SortedSet d()
    {
      return (NavigableSet)super.d();
    }
    
    public final NavigableSet<K> descendingKeySet()
    {
      return ((e)descendingMap()).navigableKeySet();
    }
    
    public final NavigableMap<K, Collection<V>> descendingMap()
    {
      return new e(d.this, g().descendingMap());
    }
    
    public final s f(Iterator paramIterator)
    {
      if (!paramIterator.hasNext()) {
        return null;
      }
      Map.Entry localEntry = (Map.Entry)paramIterator.next();
      List localList = (List)f.get();
      localList.addAll((Collection)localEntry.getValue());
      paramIterator.remove();
      paramIterator = localEntry.getKey();
      ((c)d.this).getClass();
      return new s(paramIterator, Collections.unmodifiableList(localList));
    }
    
    public final Map.Entry<K, Collection<V>> firstEntry()
    {
      Object localObject = g().firstEntry();
      if (localObject == null) {
        localObject = null;
      } else {
        localObject = b((Map.Entry)localObject);
      }
      return (Map.Entry<K, Collection<V>>)localObject;
    }
    
    public final Map.Entry<K, Collection<V>> floorEntry(K paramK)
    {
      paramK = g().floorEntry(paramK);
      if (paramK == null) {
        paramK = null;
      } else {
        paramK = b(paramK);
      }
      return paramK;
    }
    
    public final K floorKey(K paramK)
    {
      return (K)g().floorKey(paramK);
    }
    
    public final NavigableMap<K, Collection<V>> g()
    {
      return (NavigableMap)c;
    }
    
    public final NavigableMap<K, Collection<V>> headMap(K paramK, boolean paramBoolean)
    {
      return new e(d.this, g().headMap(paramK, paramBoolean));
    }
    
    public final SortedMap headMap(Object paramObject)
    {
      return headMap(paramObject, false);
    }
    
    public final Map.Entry<K, Collection<V>> higherEntry(K paramK)
    {
      paramK = g().higherEntry(paramK);
      if (paramK == null) {
        paramK = null;
      } else {
        paramK = b(paramK);
      }
      return paramK;
    }
    
    public final K higherKey(K paramK)
    {
      return (K)g().higherKey(paramK);
    }
    
    public final Set keySet()
    {
      return (NavigableSet)super.d();
    }
    
    public final Map.Entry<K, Collection<V>> lastEntry()
    {
      Object localObject = g().lastEntry();
      if (localObject == null) {
        localObject = null;
      } else {
        localObject = b((Map.Entry)localObject);
      }
      return (Map.Entry<K, Collection<V>>)localObject;
    }
    
    public final Map.Entry<K, Collection<V>> lowerEntry(K paramK)
    {
      paramK = g().lowerEntry(paramK);
      if (paramK == null) {
        paramK = null;
      } else {
        paramK = b(paramK);
      }
      return paramK;
    }
    
    public final K lowerKey(K paramK)
    {
      return (K)g().lowerKey(paramK);
    }
    
    public final NavigableSet<K> navigableKeySet()
    {
      return (NavigableSet)super.d();
    }
    
    public final Map.Entry<K, Collection<V>> pollFirstEntry()
    {
      return f(((d.b.a)entrySet()).iterator());
    }
    
    public final Map.Entry<K, Collection<V>> pollLastEntry()
    {
      return f(((d.b.a)((e0.d)descendingMap()).entrySet()).iterator());
    }
    
    public final NavigableMap<K, Collection<V>> subMap(K paramK1, boolean paramBoolean1, K paramK2, boolean paramBoolean2)
    {
      return new e(d.this, g().subMap(paramK1, paramBoolean1, paramK2, paramBoolean2));
    }
    
    public final SortedMap subMap(Object paramObject1, Object paramObject2)
    {
      return subMap(paramObject1, true, paramObject2, false);
    }
    
    public final NavigableMap<K, Collection<V>> tailMap(K paramK, boolean paramBoolean)
    {
      return new e(d.this, g().tailMap(paramK, paramBoolean));
    }
    
    public final SortedMap tailMap(Object paramObject)
    {
      return tailMap(paramObject, true);
    }
  }
  
  public final class f
    extends d<K, V>.i
    implements NavigableSet<K>
  {
    public f()
    {
      super(localSortedMap);
    }
    
    public final K ceiling(K paramK)
    {
      return (K)h().ceilingKey(paramK);
    }
    
    public final Iterator<K> descendingIterator()
    {
      return ((d.d)descendingSet()).iterator();
    }
    
    public final NavigableSet<K> descendingSet()
    {
      return new f(d.this, h().descendingMap());
    }
    
    public final K floor(K paramK)
    {
      return (K)h().floorKey(paramK);
    }
    
    public final NavigableMap<K, Collection<V>> h()
    {
      return (NavigableMap)a;
    }
    
    public final NavigableSet<K> headSet(K paramK, boolean paramBoolean)
    {
      return new f(d.this, h().headMap(paramK, paramBoolean));
    }
    
    public final SortedSet headSet(Object paramObject)
    {
      return headSet(paramObject, false);
    }
    
    public final K higher(K paramK)
    {
      return (K)h().higherKey(paramK);
    }
    
    public final K lower(K paramK)
    {
      return (K)h().lowerKey(paramK);
    }
    
    public final K pollFirst()
    {
      d.d.a locala = (d.d.a)iterator();
      Object localObject;
      if (locala.hasNext())
      {
        localObject = locala.next();
        locala.remove();
      }
      else
      {
        localObject = null;
      }
      return (K)localObject;
    }
    
    public final K pollLast()
    {
      Iterator localIterator = descendingIterator();
      Object localObject;
      if (localIterator.hasNext())
      {
        localObject = localIterator.next();
        localIterator.remove();
      }
      else
      {
        localObject = null;
      }
      return (K)localObject;
    }
    
    public final NavigableSet<K> subSet(K paramK1, boolean paramBoolean1, K paramK2, boolean paramBoolean2)
    {
      return new f(d.this, h().subMap(paramK1, paramBoolean1, paramK2, paramBoolean2));
    }
    
    public final SortedSet subSet(Object paramObject1, Object paramObject2)
    {
      return subSet(paramObject1, true, paramObject2, false);
    }
    
    public final NavigableSet<K> tailSet(K paramK, boolean paramBoolean)
    {
      return new f(d.this, h().tailMap(paramK, paramBoolean));
    }
    
    public final SortedSet tailSet(Object paramObject)
    {
      return tailSet(paramObject, true);
    }
  }
  
  public final class g
    extends d<K, V>.k
    implements RandomAccess
  {
    public g(List<V> paramList, d<K, V>.j paramd)
    {
      super(paramList, paramd, localj);
    }
  }
  
  public class h
    extends d<K, V>.b
    implements SortedMap<K, Collection<V>>
  {
    public SortedSet<K> e;
    
    public h()
    {
      super(localMap);
    }
    
    public SortedSet<K> c()
    {
      return new d.i(d.this, e());
    }
    
    public final Comparator<? super K> comparator()
    {
      return e().comparator();
    }
    
    public SortedSet<K> d()
    {
      SortedSet localSortedSet1 = e;
      SortedSet localSortedSet2 = localSortedSet1;
      if (localSortedSet1 == null)
      {
        localSortedSet2 = c();
        e = localSortedSet2;
      }
      return localSortedSet2;
    }
    
    public SortedMap<K, Collection<V>> e()
    {
      return (SortedMap)c;
    }
    
    public final K firstKey()
    {
      return (K)e().firstKey();
    }
    
    public SortedMap<K, Collection<V>> headMap(K paramK)
    {
      return new h(d.this, e().headMap(paramK));
    }
    
    public final K lastKey()
    {
      return (K)e().lastKey();
    }
    
    public SortedMap<K, Collection<V>> subMap(K paramK1, K paramK2)
    {
      return new h(d.this, e().subMap(paramK1, paramK2));
    }
    
    public SortedMap<K, Collection<V>> tailMap(K paramK)
    {
      return new h(d.this, e().tailMap(paramK));
    }
  }
  
  public class i
    extends d<K, V>.d
    implements SortedSet<K>
  {
    public i()
    {
      super(localMap);
    }
    
    public SortedMap<K, Collection<V>> a()
    {
      return (SortedMap)a;
    }
    
    public final Comparator<? super K> comparator()
    {
      return a().comparator();
    }
    
    public final K first()
    {
      return (K)a().firstKey();
    }
    
    public SortedSet<K> headSet(K paramK)
    {
      return new i(d.this, a().headMap(paramK));
    }
    
    public final K last()
    {
      return (K)a().lastKey();
    }
    
    public SortedSet<K> subSet(K paramK1, K paramK2)
    {
      return new i(d.this, a().subMap(paramK1, paramK2));
    }
    
    public SortedSet<K> tailSet(K paramK)
    {
      return new i(d.this, a().tailMap(paramK));
    }
  }
  
  public class j
    extends AbstractCollection<V>
  {
    public final K a;
    public Collection<V> b;
    public final d<K, V>.j c;
    public final Collection<V> d;
    
    public j(Collection<V> paramCollection, d<K, V>.j paramd)
    {
      a = paramCollection;
      b = paramd;
      j localj;
      c = localj;
      if (localj == null) {
        this$1 = null;
      } else {
        this$1 = b;
      }
      d = d.this;
    }
    
    public final void a()
    {
      j localj = c;
      if (localj != null) {
        localj.a();
      } else {
        d.put(a, b);
      }
    }
    
    public final boolean add(V paramV)
    {
      h();
      boolean bool1 = b.isEmpty();
      boolean bool2 = b.add(paramV);
      if (bool2)
      {
        paramV = d.this;
        e += 1;
        if (bool1) {
          a();
        }
      }
      return bool2;
    }
    
    public final boolean addAll(Collection<? extends V> paramCollection)
    {
      if (paramCollection.isEmpty()) {
        return false;
      }
      int i = size();
      boolean bool = b.addAll(paramCollection);
      if (bool)
      {
        int j = b.size();
        paramCollection = d.this;
        e += j - i;
        if (i == 0) {
          a();
        }
      }
      return bool;
    }
    
    public final void clear()
    {
      int i = size();
      if (i == 0) {
        return;
      }
      b.clear();
      d locald = d.this;
      e -= i;
      i();
    }
    
    public final boolean contains(Object paramObject)
    {
      h();
      return b.contains(paramObject);
    }
    
    public final boolean containsAll(Collection<?> paramCollection)
    {
      h();
      return b.containsAll(paramCollection);
    }
    
    public final boolean equals(Object paramObject)
    {
      if (paramObject == this) {
        return true;
      }
      h();
      return b.equals(paramObject);
    }
    
    public final void h()
    {
      Object localObject = c;
      if (localObject != null)
      {
        ((j)localObject).h();
        if (c.b != d) {
          throw new ConcurrentModificationException();
        }
      }
      else if (b.isEmpty())
      {
        localObject = (Collection)d.get(a);
        if (localObject != null) {
          b = ((Collection)localObject);
        }
      }
    }
    
    public final int hashCode()
    {
      h();
      return b.hashCode();
    }
    
    public final void i()
    {
      j localj = c;
      if (localj != null) {
        localj.i();
      } else if (b.isEmpty()) {
        d.remove(a);
      }
    }
    
    public final Iterator<V> iterator()
    {
      h();
      return new a();
    }
    
    public final boolean remove(Object paramObject)
    {
      h();
      boolean bool = b.remove(paramObject);
      if (bool)
      {
        paramObject = d.this;
        e -= 1;
        i();
      }
      return bool;
    }
    
    public final boolean removeAll(Collection<?> paramCollection)
    {
      if (paramCollection.isEmpty()) {
        return false;
      }
      int i = size();
      boolean bool = b.removeAll(paramCollection);
      if (bool)
      {
        int j = b.size();
        paramCollection = d.this;
        e += j - i;
        i();
      }
      return bool;
    }
    
    public final boolean retainAll(Collection<?> paramCollection)
    {
      paramCollection.getClass();
      int i = size();
      boolean bool = b.retainAll(paramCollection);
      if (bool)
      {
        int j = b.size();
        paramCollection = d.this;
        e += j - i;
        i();
      }
      return bool;
    }
    
    public final int size()
    {
      h();
      return b.size();
    }
    
    public final String toString()
    {
      h();
      return b.toString();
    }
    
    public class a
      implements Iterator<V>
    {
      public final Iterator<V> a;
      public final Collection<V> b;
      
      public a()
      {
        this$1 = b;
        b = d.j.this;
        if ((d.j.this instanceof List)) {
          this$1 = ((List)d.j.this).listIterator();
        } else {
          this$1 = iterator();
        }
        a = d.j.this;
      }
      
      public a(ListIterator paramListIterator)
      {
        b = b;
        a = paramListIterator;
      }
      
      public final void a()
      {
        h();
        if (b == b) {
          return;
        }
        throw new ConcurrentModificationException();
      }
      
      public final boolean hasNext()
      {
        a();
        return a.hasNext();
      }
      
      public final V next()
      {
        a();
        return (V)a.next();
      }
      
      public final void remove()
      {
        a.remove();
        d.j localj = d.j.this;
        d locald = e;
        e -= 1;
        localj.i();
      }
    }
  }
  
  public class k
    extends d<K, V>.j
    implements List<V>
  {
    public k(List<V> paramList, d<K, V>.j paramd)
    {
      super(paramList, paramd, localj);
    }
    
    public final void add(int paramInt, V paramV)
    {
      h();
      boolean bool = b.isEmpty();
      ((List)b).add(paramInt, paramV);
      paramV = d.this;
      e += 1;
      if (bool) {
        a();
      }
    }
    
    public final boolean addAll(int paramInt, Collection<? extends V> paramCollection)
    {
      if (paramCollection.isEmpty()) {
        return false;
      }
      int i = size();
      boolean bool = ((List)b).addAll(paramInt, paramCollection);
      if (bool)
      {
        paramInt = b.size();
        paramCollection = d.this;
        e += paramInt - i;
        if (i == 0) {
          a();
        }
      }
      return bool;
    }
    
    public final V get(int paramInt)
    {
      h();
      return (V)((List)b).get(paramInt);
    }
    
    public final int indexOf(Object paramObject)
    {
      h();
      return ((List)b).indexOf(paramObject);
    }
    
    public final int lastIndexOf(Object paramObject)
    {
      h();
      return ((List)b).lastIndexOf(paramObject);
    }
    
    public final ListIterator<V> listIterator()
    {
      h();
      return new a();
    }
    
    public final ListIterator<V> listIterator(int paramInt)
    {
      h();
      return new a(paramInt);
    }
    
    public final V remove(int paramInt)
    {
      h();
      Object localObject = ((List)b).remove(paramInt);
      d locald = d.this;
      e -= 1;
      i();
      return (V)localObject;
    }
    
    public final V set(int paramInt, V paramV)
    {
      h();
      return (V)((List)b).set(paramInt, paramV);
    }
    
    public final List<V> subList(int paramInt1, int paramInt2)
    {
      h();
      d locald = d.this;
      Object localObject1 = a;
      List localList = ((List)b).subList(paramInt1, paramInt2);
      d.j localj = c;
      Object localObject2 = localj;
      if (localj == null) {
        localObject2 = this;
      }
      locald.getClass();
      if ((localList instanceof RandomAccess)) {
        localObject2 = new d.g(locald, localObject1, localList, (d.j)localObject2);
      } else {
        localObject2 = new k(locald, localObject1, localList, (d.j)localObject2);
      }
      return (List<V>)localObject2;
    }
    
    public final class a
      extends d<K, V>.j.a
      implements ListIterator<V>
    {
      public a()
      {
        super();
      }
      
      public a(int paramInt)
      {
        super(((List)b).listIterator(paramInt));
      }
      
      public final void add(V paramV)
      {
        boolean bool = isEmpty();
        b().add(paramV);
        d.k localk = d.k.this;
        paramV = f;
        e += 1;
        if (bool) {
          localk.a();
        }
      }
      
      public final ListIterator<V> b()
      {
        a();
        return (ListIterator)a;
      }
      
      public final boolean hasPrevious()
      {
        return b().hasPrevious();
      }
      
      public final int nextIndex()
      {
        return b().nextIndex();
      }
      
      public final V previous()
      {
        return (V)b().previous();
      }
      
      public final int previousIndex()
      {
        return b().previousIndex();
      }
      
      public final void set(V paramV)
      {
        b().set(paramV);
      }
    }
  }
}

/* Location:
 * Qualified Name:     o7.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */