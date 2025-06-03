package o7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

public final class d$b$a
  extends e0.a<K, Collection<V>>
{
  public d$b$a(d.b paramb) {}
  
  public final boolean contains(Object paramObject)
  {
    Set localSet = a.c.entrySet();
    localSet.getClass();
    boolean bool;
    try
    {
      bool = localSet.contains(paramObject);
    }
    catch (ClassCastException|NullPointerException paramObject)
    {
      bool = false;
    }
    return bool;
  }
  
  public final Iterator<Map.Entry<K, Collection<V>>> iterator()
  {
    return new d.b.b(a);
  }
  
  public final boolean remove(Object paramObject)
  {
    if (!contains(paramObject)) {
      return false;
    }
    paramObject = (Map.Entry)paramObject;
    Objects.requireNonNull(paramObject);
    paramObject = (Map.Entry)paramObject;
    d locald = a.d;
    Object localObject = ((Map.Entry)paramObject).getKey();
    paramObject = d;
    paramObject.getClass();
    try
    {
      paramObject = ((Map)paramObject).remove(localObject);
    }
    catch (ClassCastException|NullPointerException paramObject)
    {
      paramObject = null;
    }
    paramObject = (Collection)paramObject;
    if (paramObject != null)
    {
      int i = ((Collection)paramObject).size();
      ((Collection)paramObject).clear();
      e -= i;
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     o7.d.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */