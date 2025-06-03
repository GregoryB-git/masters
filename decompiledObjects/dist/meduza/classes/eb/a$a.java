package eb;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class a$a
{
  public a a;
  public IdentityHashMap<a.b<?>, Object> b;
  
  public a$a(a parama)
  {
    a = parama;
  }
  
  public final a a()
  {
    if (b != null)
    {
      Iterator localIterator = a.a.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if (!b.containsKey(localEntry.getKey())) {
          b.put((a.b)localEntry.getKey(), localEntry.getValue());
        }
      }
      a = new a(b);
      b = null;
    }
    return a;
  }
  
  public final void b(a.b paramb)
  {
    if (a.a.containsKey(paramb))
    {
      localIdentityHashMap = new IdentityHashMap(a.a);
      localIdentityHashMap.remove(paramb);
      a = new a(localIdentityHashMap);
    }
    IdentityHashMap localIdentityHashMap = b;
    if (localIdentityHashMap != null) {
      localIdentityHashMap.remove(paramb);
    }
  }
  
  public final void c(a.b paramb, Object paramObject)
  {
    if (b == null) {
      b = new IdentityHashMap(1);
    }
    b.put(paramb, paramObject);
  }
}

/* Location:
 * Qualified Name:     eb.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */