package X2;

import W2.m;
import java.util.Comparator;
import java.util.SortedSet;

public abstract class d0
{
  public static Comparator a(SortedSet paramSortedSet)
  {
    Comparator localComparator = paramSortedSet.comparator();
    paramSortedSet = localComparator;
    if (localComparator == null) {
      paramSortedSet = P.d();
    }
    return paramSortedSet;
  }
  
  public static boolean b(Comparator paramComparator, Iterable paramIterable)
  {
    m.j(paramComparator);
    m.j(paramIterable);
    if ((paramIterable instanceof SortedSet))
    {
      paramIterable = a((SortedSet)paramIterable);
    }
    else
    {
      if (!(paramIterable instanceof c0)) {
        break label53;
      }
      paramIterable = ((c0)paramIterable).comparator();
    }
    return paramComparator.equals(paramIterable);
    label53:
    return false;
  }
}

/* Location:
 * Qualified Name:     X2.d0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */