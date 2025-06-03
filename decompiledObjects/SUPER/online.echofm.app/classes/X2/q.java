package X2;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public abstract class q
  extends r
  implements Map
{
  public abstract Map b();
  
  public boolean c(Object paramObject)
  {
    return G.b(this, paramObject);
  }
  
  public void clear()
  {
    b().clear();
  }
  
  public boolean containsKey(Object paramObject)
  {
    return b().containsKey(paramObject);
  }
  
  public boolean d(Object paramObject)
  {
    return G.c(this, paramObject);
  }
  
  public int e()
  {
    return a0.d(entrySet());
  }
  
  public Set entrySet()
  {
    return b().entrySet();
  }
  
  public Object get(Object paramObject)
  {
    return b().get(paramObject);
  }
  
  public boolean isEmpty()
  {
    return b().isEmpty();
  }
  
  public Set keySet()
  {
    return b().keySet();
  }
  
  public Object put(Object paramObject1, Object paramObject2)
  {
    return b().put(paramObject1, paramObject2);
  }
  
  public void putAll(Map paramMap)
  {
    b().putAll(paramMap);
  }
  
  public Object remove(Object paramObject)
  {
    return b().remove(paramObject);
  }
  
  public int size()
  {
    return b().size();
  }
  
  public Collection values()
  {
    return b().values();
  }
}

/* Location:
 * Qualified Name:     X2.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */