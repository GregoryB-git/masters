package o7;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import n7.j;

public final class u0$b<E>
  extends u0.a<E>
  implements SortedSet<E>
{
  public u0$b(SortedSet<E> paramSortedSet, j<? super E> paramj)
  {
    super(paramSortedSet, paramj);
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

/* Location:
 * Qualified Name:     o7.u0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */