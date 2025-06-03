package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class a$a
  implements O.a
{
  public static void j(Iterable paramIterable, List paramList)
  {
    y.a(paramIterable);
    if ((paramIterable instanceof D))
    {
      Object localObject = ((D)paramIterable).o();
      paramIterable = (D)paramList;
      int i = paramList.size();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        paramList = ((Iterator)localObject).next();
        if (paramList == null)
        {
          paramList = new StringBuilder();
          paramList.append("Element at index ");
          paramList.append(paramIterable.size() - i);
          paramList.append(" is null.");
          paramList = paramList.toString();
          for (int j = paramIterable.size() - 1; j >= i; j--) {
            paramIterable.remove(j);
          }
          throw new NullPointerException(paramList);
        }
        if ((paramList instanceof g)) {
          paramIterable.H((g)paramList);
        } else {
          paramIterable.add((String)paramList);
        }
      }
    }
    if ((paramIterable instanceof Y)) {
      paramList.addAll((Collection)paramIterable);
    } else {
      l(paramIterable, paramList);
    }
  }
  
  public static void l(Iterable paramIterable, List paramList)
  {
    if (((paramList instanceof ArrayList)) && ((paramIterable instanceof Collection))) {
      ((ArrayList)paramList).ensureCapacity(paramList.size() + ((Collection)paramIterable).size());
    }
    int i = paramList.size();
    Iterator localIterator = paramIterable.iterator();
    while (localIterator.hasNext())
    {
      paramIterable = localIterator.next();
      if (paramIterable == null)
      {
        paramIterable = new StringBuilder();
        paramIterable.append("Element at index ");
        paramIterable.append(paramList.size() - i);
        paramIterable.append(" is null.");
        paramIterable = paramIterable.toString();
        for (int j = paramList.size() - 1; j >= i; j--) {
          paramList.remove(j);
        }
        throw new NullPointerException(paramIterable);
      }
      paramList.add(paramIterable);
    }
  }
  
  public static k0 p(O paramO)
  {
    return new k0(paramO);
  }
  
  public abstract a n(a parama);
  
  public a o(O paramO)
  {
    if (b().getClass().isInstance(paramO)) {
      return n((a)paramO);
    }
    throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */