package ma;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class l1$d
  extends AbstractSet<Map.Entry<K, V>>
{
  public l1$d(l1 paraml1) {}
  
  public final boolean add(Object paramObject)
  {
    paramObject = (Map.Entry)paramObject;
    boolean bool;
    if (!contains(paramObject))
    {
      a.i((Comparable)((Map.Entry)paramObject).getKey(), ((Map.Entry)paramObject).getValue());
      bool = true;
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public final void clear()
  {
    a.clear();
  }
  
  public final boolean contains(Object paramObject)
  {
    Object localObject = (Map.Entry)paramObject;
    paramObject = a.get(((Map.Entry)localObject).getKey());
    localObject = ((Map.Entry)localObject).getValue();
    boolean bool;
    if ((paramObject != localObject) && ((paramObject == null) || (!paramObject.equals(localObject)))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public Iterator<Map.Entry<K, V>> iterator()
  {
    return new l1.c(a);
  }
  
  public final boolean remove(Object paramObject)
  {
    paramObject = (Map.Entry)paramObject;
    if (contains(paramObject))
    {
      a.remove(((Map.Entry)paramObject).getKey());
      return true;
    }
    return false;
  }
  
  public final int size()
  {
    return a.size();
  }
}

/* Location:
 * Qualified Name:     ma.l1.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */