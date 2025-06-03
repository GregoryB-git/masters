package o7;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class l$c
  extends AbstractSet<K>
{
  public l$c(l paraml) {}
  
  public final void clear()
  {
    a.clear();
  }
  
  public final boolean contains(Object paramObject)
  {
    return a.containsKey(paramObject);
  }
  
  public final Iterator<K> iterator()
  {
    Object localObject = a;
    Map localMap = ((l)localObject).b();
    if (localMap != null) {
      localObject = localMap.keySet().iterator();
    } else {
      localObject = new i((l)localObject);
    }
    return (Iterator<K>)localObject;
  }
  
  public final boolean remove(Object paramObject)
  {
    Map localMap = a.b();
    boolean bool;
    if (localMap != null) {
      bool = localMap.keySet().remove(paramObject);
    } else if (a.g(paramObject) != l.r) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final int size()
  {
    return a.size();
  }
}

/* Location:
 * Qualified Name:     o7.l.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */