package S3;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

public class d
  implements Iterator
{
  public final ArrayDeque o = new ArrayDeque();
  public final boolean p;
  
  public d(h paramh, Object paramObject, Comparator paramComparator, boolean paramBoolean)
  {
    p = paramBoolean;
    while (!paramh.isEmpty())
    {
      int i;
      if (paramObject != null)
      {
        Object localObject = paramh.getKey();
        if (paramBoolean) {
          i = paramComparator.compare(paramObject, localObject);
        } else {
          i = paramComparator.compare(localObject, paramObject);
        }
      }
      else
      {
        i = 1;
      }
      if (i < 0) {
        if (paramBoolean)
        {
          label88:
          paramh = paramh.a();
          continue;
        }
      }
      for (;;)
      {
        paramh = paramh.f();
        break;
        if (i == 0)
        {
          o.push((j)paramh);
          return;
        }
        o.push((j)paramh);
        if (!paramBoolean) {
          break label88;
        }
      }
    }
  }
  
  public Map.Entry b()
  {
    try
    {
      Object localObject = (j)o.pop();
      AbstractMap.SimpleEntry localSimpleEntry = new java/util/AbstractMap$SimpleEntry;
      localSimpleEntry.<init>(((j)localObject).getKey(), ((j)localObject).getValue());
      if (p) {
        for (localObject = ((j)localObject).a(); !((h)localObject).isEmpty(); localObject = ((h)localObject).f()) {
          o.push((j)localObject);
        }
      }
      for (localObject = ((j)localObject).f(); !((h)localObject).isEmpty(); localObject = ((h)localObject).a()) {
        o.push((j)localObject);
      }
      return localSimpleEntry;
    }
    catch (EmptyStackException localEmptyStackException)
    {
      throw new NoSuchElementException();
    }
  }
  
  public boolean hasNext()
  {
    boolean bool;
    if (o.size() > 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException("remove called on immutable collection");
  }
}

/* Location:
 * Qualified Name:     S3.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */