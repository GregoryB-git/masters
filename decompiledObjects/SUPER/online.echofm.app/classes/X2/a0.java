package X2;

import W2.m;
import W2.n;
import W2.o;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

public abstract class a0
{
  public static boolean a(Set paramSet, Object paramObject)
  {
    boolean bool1 = true;
    if (paramSet == paramObject) {
      return true;
    }
    if ((paramObject instanceof Set)) {
      paramObject = (Set)paramObject;
    }
    try
    {
      if (paramSet.size() == ((Set)paramObject).size())
      {
        boolean bool2 = paramSet.containsAll((Collection)paramObject);
        if (bool2) {}
      }
      else
      {
        bool1 = false;
      }
      return bool1;
    }
    catch (NullPointerException|ClassCastException paramSet)
    {
      for (;;) {}
    }
    return false;
  }
  
  public static Set b(Set paramSet, n paramn)
  {
    if ((paramSet instanceof SortedSet)) {
      return c((SortedSet)paramSet, paramn);
    }
    if ((paramSet instanceof b))
    {
      paramSet = (b)paramSet;
      paramn = o.b(p, paramn);
      return new b((Set)o, paramn);
    }
    return new b((Set)m.j(paramSet), (n)m.j(paramn));
  }
  
  public static SortedSet c(SortedSet paramSortedSet, n paramn)
  {
    if ((paramSortedSet instanceof b))
    {
      paramSortedSet = (b)paramSortedSet;
      paramn = o.b(p, paramn);
      return new c((SortedSet)o, paramn);
    }
    return new c((SortedSet)m.j(paramSortedSet), (n)m.j(paramn));
  }
  
  public static int d(Set paramSet)
  {
    Iterator localIterator = paramSet.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      paramSet = localIterator.next();
      int j;
      if (paramSet != null) {
        j = paramSet.hashCode();
      } else {
        j = 0;
      }
      i += j;
    }
    return i;
  }
  
  public static e e(Set paramSet1, final Set paramSet2)
  {
    m.k(paramSet1, "set1");
    m.k(paramSet2, "set2");
    return new a(paramSet2);
  }
  
  public static HashSet f()
  {
    return new HashSet();
  }
  
  public static HashSet g(int paramInt)
  {
    return new HashSet(G.a(paramInt));
  }
  
  public static Set h()
  {
    return Collections.newSetFromMap(G.g());
  }
  
  public static boolean i(Set paramSet, Collection paramCollection)
  {
    m.j(paramCollection);
    Object localObject = paramCollection;
    if ((paramCollection instanceof L)) {
      localObject = ((L)paramCollection).u();
    }
    if (((localObject instanceof Set)) && (((Collection)localObject).size() > paramSet.size())) {
      return C.q(paramSet.iterator(), (Collection)localObject);
    }
    return j(paramSet, ((Collection)localObject).iterator());
  }
  
  public static boolean j(Set paramSet, Iterator paramIterator)
  {
    boolean bool = false;
    while (paramIterator.hasNext()) {
      bool |= paramSet.remove(paramIterator.next());
    }
    return bool;
  }
  
  public class a
    extends a0.e
  {
    public a(Set paramSet)
    {
      super();
    }
    
    public g0 a()
    {
      return new a();
    }
    
    public boolean contains(Object paramObject)
    {
      boolean bool;
      if ((a0.this.contains(paramObject)) && (paramSet2.contains(paramObject))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean containsAll(Collection paramCollection)
    {
      boolean bool;
      if ((a0.this.containsAll(paramCollection)) && (paramSet2.containsAll(paramCollection))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean isEmpty()
    {
      return Collections.disjoint(paramSet2, a0.this);
    }
    
    public int size()
    {
      Iterator localIterator = a0.this.iterator();
      int i = 0;
      while (localIterator.hasNext())
      {
        Object localObject = localIterator.next();
        if (paramSet2.contains(localObject)) {
          i++;
        }
      }
      return i;
    }
    
    public class a
      extends b
    {
      public final Iterator q = a0.this.iterator();
      
      public a() {}
      
      public Object b()
      {
        while (q.hasNext())
        {
          Object localObject = q.next();
          if (p.contains(localObject)) {
            return localObject;
          }
        }
        return d();
      }
    }
  }
  
  public static class b
    extends j.a
    implements Set
  {
    public b(Set paramSet, n paramn)
    {
      super(paramn);
    }
    
    public boolean equals(Object paramObject)
    {
      return a0.a(this, paramObject);
    }
    
    public int hashCode()
    {
      return a0.d(this);
    }
  }
  
  public static class c
    extends a0.b
    implements SortedSet
  {
    public c(SortedSet paramSortedSet, n paramn)
    {
      super(paramn);
    }
    
    public Comparator comparator()
    {
      return ((SortedSet)o).comparator();
    }
    
    public Object first()
    {
      return C.j(o.iterator(), p);
    }
    
    public SortedSet headSet(Object paramObject)
    {
      return new c(((SortedSet)o).headSet(paramObject), p);
    }
    
    public Object last()
    {
      Object localObject;
      for (SortedSet localSortedSet = (SortedSet)o;; localSortedSet = localSortedSet.headSet(localObject))
      {
        localObject = localSortedSet.last();
        if (p.apply(localObject)) {
          return localObject;
        }
      }
    }
    
    public SortedSet subSet(Object paramObject1, Object paramObject2)
    {
      return new c(((SortedSet)o).subSet(paramObject1, paramObject2), p);
    }
    
    public SortedSet tailSet(Object paramObject)
    {
      return new c(((SortedSet)o).tailSet(paramObject), p);
    }
  }
  
  public static abstract class d
    extends AbstractSet
  {
    public boolean removeAll(Collection paramCollection)
    {
      return a0.i(this, paramCollection);
    }
    
    public boolean retainAll(Collection paramCollection)
    {
      return super.retainAll((Collection)m.j(paramCollection));
    }
  }
  
  public static abstract class e
    extends AbstractSet
  {
    public final boolean add(Object paramObject)
    {
      throw new UnsupportedOperationException();
    }
    
    public final boolean addAll(Collection paramCollection)
    {
      throw new UnsupportedOperationException();
    }
    
    public final void clear()
    {
      throw new UnsupportedOperationException();
    }
    
    public final boolean remove(Object paramObject)
    {
      throw new UnsupportedOperationException();
    }
    
    public final boolean removeAll(Collection paramCollection)
    {
      throw new UnsupportedOperationException();
    }
    
    public final boolean retainAll(Collection paramCollection)
    {
      throw new UnsupportedOperationException();
    }
  }
}

/* Location:
 * Qualified Name:     X2.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */