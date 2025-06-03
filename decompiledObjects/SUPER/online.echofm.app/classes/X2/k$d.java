package X2;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class k$d
  extends AbstractSet
{
  public k$d(k paramk) {}
  
  public void clear()
  {
    o.clear();
  }
  
  public boolean contains(Object paramObject)
  {
    Map localMap = o.w();
    if (localMap != null) {
      return localMap.entrySet().contains(paramObject);
    }
    boolean bool1 = paramObject instanceof Map.Entry;
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (bool1)
    {
      paramObject = (Map.Entry)paramObject;
      int i = k.i(o, ((Map.Entry)paramObject).getKey());
      bool3 = bool2;
      if (i != -1)
      {
        bool3 = bool2;
        if (W2.k.a(k.j(o, i), ((Map.Entry)paramObject).getValue())) {
          bool3 = true;
        }
      }
    }
    return bool3;
  }
  
  public Iterator iterator()
  {
    return o.y();
  }
  
  public boolean remove(Object paramObject)
  {
    Map localMap = o.w();
    if (localMap != null) {
      return localMap.entrySet().remove(paramObject);
    }
    if ((paramObject instanceof Map.Entry))
    {
      paramObject = (Map.Entry)paramObject;
      if (o.J()) {
        return false;
      }
      int i = k.k(o);
      int j = l.f(((Map.Entry)paramObject).getKey(), ((Map.Entry)paramObject).getValue(), i, k.l(o), k.m(o), k.c(o), k.d(o));
      if (j == -1) {
        return false;
      }
      o.I(j, i);
      k.e(o);
      o.C();
      return true;
    }
    return false;
  }
  
  public int size()
  {
    return o.size();
  }
}

/* Location:
 * Qualified Name:     X2.k.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */