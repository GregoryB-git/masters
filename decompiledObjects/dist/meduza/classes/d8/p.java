package d8;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import t9.b;

public final class p<T>
  implements b<Set<T>>
{
  public volatile Set<b<T>> a = Collections.newSetFromMap(new ConcurrentHashMap());
  public volatile Set<T> b = null;
  
  public p(Collection<b<T>> paramCollection)
  {
    a.addAll(paramCollection);
  }
  
  public final Object get()
  {
    if (b == null) {
      try
      {
        if (b == null)
        {
          Object localObject1 = new java/util/concurrent/ConcurrentHashMap;
          ((ConcurrentHashMap)localObject1).<init>();
          b = Collections.newSetFromMap((Map)localObject1);
          try
          {
            Iterator localIterator = a.iterator();
            while (localIterator.hasNext())
            {
              localObject1 = (b)localIterator.next();
              b.add(((b)localObject1).get());
            }
            a = null;
          }
          finally {}
        }
      }
      finally {}
    }
    return Collections.unmodifiableSet(b);
  }
}

/* Location:
 * Qualified Name:     d8.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */