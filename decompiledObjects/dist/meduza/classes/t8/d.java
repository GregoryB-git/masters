package t8;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

public final class d<K, V>
  implements Iterator<Map.Entry<K, V>>
{
  public final ArrayDeque<j<K, V>> a = new ArrayDeque();
  public final boolean b = false;
  
  public d(h paramh, Object paramObject, Comparator paramComparator)
  {
    while (!paramh.isEmpty())
    {
      int i;
      if (paramObject != null) {
        i = paramComparator.compare(paramh.getKey(), paramObject);
      } else {
        i = 1;
      }
      if (i < 0)
      {
        paramh = paramh.f();
      }
      else
      {
        if (i == 0)
        {
          a.push((j)paramh);
          break;
        }
        a.push((j)paramh);
        paramh = paramh.a();
      }
    }
  }
  
  public final boolean hasNext()
  {
    boolean bool;
    if (a.size() > 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final Object next()
  {
    try
    {
      Object localObject = (j)a.pop();
      AbstractMap.SimpleEntry localSimpleEntry = new java/util/AbstractMap$SimpleEntry;
      localSimpleEntry.<init>(a, b);
      if (b) {
        for (localObject = c; !((h)localObject).isEmpty(); localObject = ((h)localObject).f()) {
          a.push((j)localObject);
        }
      }
      for (localObject = d; !((h)localObject).isEmpty(); localObject = ((h)localObject).a()) {
        a.push((j)localObject);
      }
      return localSimpleEntry;
    }
    catch (EmptyStackException localEmptyStackException)
    {
      throw new NoSuchElementException();
    }
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException("remove called on immutable collection");
  }
}

/* Location:
 * Qualified Name:     t8.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */