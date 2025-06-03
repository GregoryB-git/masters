package X2;

import W2.n;
import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;

public class a0$c
  extends a0.b
  implements SortedSet
{
  public a0$c(SortedSet paramSortedSet, n paramn)
  {
    super(paramSortedSet, paramn);
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

/* Location:
 * Qualified Name:     X2.a0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */