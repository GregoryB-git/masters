package X2;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class k$f
  extends AbstractSet
{
  public k$f(k paramk) {}
  
  public void clear()
  {
    o.clear();
  }
  
  public boolean contains(Object paramObject)
  {
    return o.containsKey(paramObject);
  }
  
  public Iterator iterator()
  {
    return o.H();
  }
  
  public boolean remove(Object paramObject)
  {
    Map localMap = o.w();
    boolean bool;
    if (localMap != null) {
      bool = localMap.keySet().remove(paramObject);
    } else if (k.g(o, paramObject) != k.h()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int size()
  {
    return o.size();
  }
}

/* Location:
 * Qualified Name:     X2.k.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */