package o7;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import x6.b;

public final class l$a
  extends AbstractSet<Map.Entry<K, V>>
{
  public l$a(l paraml) {}
  
  public final void clear()
  {
    a.clear();
  }
  
  public final boolean contains(Object paramObject)
  {
    Map localMap = a.b();
    if (localMap != null) {
      return localMap.entrySet().contains(paramObject);
    }
    boolean bool1 = paramObject instanceof Map.Entry;
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (bool1)
    {
      paramObject = (Map.Entry)paramObject;
      int i = a.c(((Map.Entry)paramObject).getKey());
      bool3 = bool2;
      if (i != -1)
      {
        bool3 = bool2;
        if (b.Q(a.l(i), ((Map.Entry)paramObject).getValue())) {
          bool3 = true;
        }
      }
    }
    return bool3;
  }
  
  public final Iterator<Map.Entry<K, V>> iterator()
  {
    Object localObject = a;
    Map localMap = ((l)localObject).b();
    if (localMap != null) {
      localObject = localMap.entrySet().iterator();
    } else {
      localObject = new j((l)localObject);
    }
    return (Iterator<Map.Entry<K, V>>)localObject;
  }
  
  public final boolean remove(Object paramObject)
  {
    Object localObject1 = a.b();
    if (localObject1 != null) {
      return ((Map)localObject1).entrySet().remove(paramObject);
    }
    if ((paramObject instanceof Map.Entry))
    {
      localObject1 = (Map.Entry)paramObject;
      if (a.f()) {
        return false;
      }
      int i = (1 << (a.e & 0x1F)) - 1;
      paramObject = ((Map.Entry)localObject1).getKey();
      Object localObject2 = ((Map.Entry)localObject1).getValue();
      localObject1 = a.a;
      Objects.requireNonNull(localObject1);
      int j = c0.e(paramObject, localObject2, i, localObject1, a.h(), a.i(), a.j());
      if (j == -1) {
        return false;
      }
      a.e(j, i);
      paramObject = a;
      f -= 1;
      e += 32;
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
 * Qualified Name:     o7.l.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */