package r;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class b<K, V>
  extends h<K, V>
  implements Map<K, V>
{
  public a p;
  
  public b() {}
  
  public b(int paramInt)
  {
    super(paramInt);
  }
  
  public final Set<Map.Entry<K, V>> entrySet()
  {
    if (p == null) {
      p = new a(this);
    }
    a locala = p;
    if (a == null) {
      a = new g.b(locala);
    }
    return a;
  }
  
  public final Set<K> keySet()
  {
    if (p == null) {
      p = new a(this);
    }
    a locala = p;
    if (b == null) {
      b = new g.c(locala);
    }
    return b;
  }
  
  public final void putAll(Map<? extends K, ? extends V> paramMap)
  {
    int i = c;
    c(paramMap.size() + i);
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramMap = (Map.Entry)localIterator.next();
      put(paramMap.getKey(), paramMap.getValue());
    }
  }
  
  public final Collection<V> values()
  {
    if (p == null) {
      p = new a(this);
    }
    a locala = p;
    if (c == null) {
      c = new g.e(locala);
    }
    return c;
  }
}

/* Location:
 * Qualified Name:     r.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */