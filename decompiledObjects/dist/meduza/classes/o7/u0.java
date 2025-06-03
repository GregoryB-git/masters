package o7;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import n7.j;
import n7.k;
import x6.b;

public final class u0
{
  public static boolean a(Set<?> paramSet, Object paramObject)
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
  
  public static a b(Set paramSet, j paramj)
  {
    j localj;
    if ((paramSet instanceof SortedSet))
    {
      paramSet = (SortedSet)paramSet;
      if ((paramSet instanceof a))
      {
        paramSet = (a)paramSet;
        localj = b;
        localj.getClass();
        paramj = new k(Arrays.asList(new j[] { localj, paramj }));
        paramSet = new b((SortedSet)a, paramj);
      }
      else
      {
        paramSet.getClass();
        paramSet = new b(paramSet, paramj);
      }
      return paramSet;
    }
    if ((paramSet instanceof a))
    {
      paramSet = (a)paramSet;
      localj = b;
      localj.getClass();
      paramj = new k(Arrays.asList(new j[] { localj, paramj }));
      return new a((Set)a, paramj);
    }
    paramSet.getClass();
    return new a(paramSet, paramj);
  }
  
  public static int c(Set<?> paramSet)
  {
    paramSet = paramSet.iterator();
    int i = 0;
    while (paramSet.hasNext())
    {
      Object localObject = paramSet.next();
      int j;
      if (localObject != null) {
        j = localObject.hashCode();
      } else {
        j = 0;
      }
      i += j;
    }
    return i;
  }
  
  public static t0 d(x paramx1, x paramx2)
  {
    b.y(paramx1, "set1");
    b.y(paramx2, "set2");
    return new t0(paramx1, paramx2);
  }
  
  public static class a<E>
    extends h<E>
    implements Set<E>
  {
    public a(Set<E> paramSet, j<? super E> paramj)
    {
      super(paramj);
    }
    
    public final boolean equals(Object paramObject)
    {
      return u0.a(this, paramObject);
    }
    
    public final int hashCode()
    {
      return u0.c(this);
    }
  }
  
  public static final class b<E>
    extends u0.a<E>
    implements SortedSet<E>
  {
    public b(SortedSet<E> paramSortedSet, j<? super E> paramj)
    {
      super(paramj);
    }
    
    public final Comparator<? super E> comparator()
    {
      return ((SortedSet)a).comparator();
    }
    
    public final E first()
    {
      Iterator localIterator = a.iterator();
      j localj = b;
      localIterator.getClass();
      localj.getClass();
      while (localIterator.hasNext())
      {
        Object localObject = localIterator.next();
        if (localj.apply(localObject)) {
          return (E)localObject;
        }
      }
      throw new NoSuchElementException();
    }
    
    public final SortedSet<E> headSet(E paramE)
    {
      return new b(((SortedSet)a).headSet(paramE), b);
    }
    
    public final E last()
    {
      Object localObject;
      for (SortedSet localSortedSet = (SortedSet)a;; localSortedSet = localSortedSet.headSet(localObject))
      {
        localObject = localSortedSet.last();
        if (b.apply(localObject)) {
          return (E)localObject;
        }
      }
    }
    
    public final SortedSet<E> subSet(E paramE1, E paramE2)
    {
      return new b(((SortedSet)a).subSet(paramE1, paramE2), b);
    }
    
    public final SortedSet<E> tailSet(E paramE)
    {
      return new b(((SortedSet)a).tailSet(paramE), b);
    }
  }
  
  public static abstract class c<E>
    extends AbstractSet<E>
  {
    public boolean removeAll(Collection<?> paramCollection)
    {
      paramCollection.getClass();
      Object localObject = paramCollection;
      if ((paramCollection instanceof i0)) {
        localObject = ((i0)paramCollection).j();
      }
      boolean bool1 = localObject instanceof Set;
      boolean bool2 = false;
      boolean bool3 = false;
      if ((bool1) && (((Collection)localObject).size() > size()))
      {
        paramCollection = iterator();
        for (;;)
        {
          bool2 = bool3;
          if (!paramCollection.hasNext()) {
            break;
          }
          if (((Collection)localObject).contains(paramCollection.next()))
          {
            paramCollection.remove();
            bool3 = true;
          }
        }
      }
      paramCollection = ((Collection)localObject).iterator();
      bool3 = bool2;
      for (;;)
      {
        bool2 = bool3;
        if (!paramCollection.hasNext()) {
          break;
        }
        bool3 |= remove(paramCollection.next());
      }
      return bool2;
    }
    
    public boolean retainAll(Collection<?> paramCollection)
    {
      paramCollection.getClass();
      return super.retainAll(paramCollection);
    }
  }
  
  public static abstract class d<E>
    extends AbstractSet<E>
  {
    @Deprecated
    public final boolean add(E paramE)
    {
      throw new UnsupportedOperationException();
    }
    
    @Deprecated
    public final boolean addAll(Collection<? extends E> paramCollection)
    {
      throw new UnsupportedOperationException();
    }
    
    @Deprecated
    public final void clear()
    {
      throw new UnsupportedOperationException();
    }
    
    @Deprecated
    public final boolean remove(Object paramObject)
    {
      throw new UnsupportedOperationException();
    }
    
    @Deprecated
    public final boolean removeAll(Collection<?> paramCollection)
    {
      throw new UnsupportedOperationException();
    }
    
    @Deprecated
    public final boolean retainAll(Collection<?> paramCollection)
    {
      throw new UnsupportedOperationException();
    }
  }
}

/* Location:
 * Qualified Name:     o7.u0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */