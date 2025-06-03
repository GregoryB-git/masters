package n;

import java.util.HashMap;
import java.util.Map.Entry;

public class a
  extends b
{
  public HashMap s = new HashMap();
  
  public boolean contains(Object paramObject)
  {
    return s.containsKey(paramObject);
  }
  
  public b.c d(Object paramObject)
  {
    return (b.c)s.get(paramObject);
  }
  
  public Object k(Object paramObject1, Object paramObject2)
  {
    b.c localc = d(paramObject1);
    if (localc != null) {
      return p;
    }
    s.put(paramObject1, i(paramObject1, paramObject2));
    return null;
  }
  
  public Object q(Object paramObject)
  {
    Object localObject = super.q(paramObject);
    s.remove(paramObject);
    return localObject;
  }
  
  public Map.Entry s(Object paramObject)
  {
    if (contains(paramObject)) {
      return s.get(paramObject)).r;
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     n.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */