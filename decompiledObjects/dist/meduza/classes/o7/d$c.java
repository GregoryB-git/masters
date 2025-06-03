package o7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

public abstract class d$c<T>
  implements Iterator<T>
{
  public final Iterator<Map.Entry<K, Collection<V>>> a;
  public K b;
  public Collection<V> c;
  public Iterator<V> d;
  
  public d$c(d paramd)
  {
    a = d.entrySet().iterator();
    b = null;
    c = null;
    d = b0.b.a;
  }
  
  public final boolean hasNext()
  {
    boolean bool;
    if ((!a.hasNext()) && (!d.hasNext())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final T next()
  {
    if (!d.hasNext())
    {
      Object localObject = (Map.Entry)a.next();
      b = ((Map.Entry)localObject).getKey();
      localObject = (Collection)((Map.Entry)localObject).getValue();
      c = ((Collection)localObject);
      d = ((Collection)localObject).iterator();
    }
    return (T)d.next();
  }
  
  public final void remove()
  {
    d.remove();
    Object localObject = c;
    Objects.requireNonNull(localObject);
    if (((Collection)localObject).isEmpty()) {
      a.remove();
    }
    localObject = e;
    e -= 1;
  }
}

/* Location:
 * Qualified Name:     o7.d.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */