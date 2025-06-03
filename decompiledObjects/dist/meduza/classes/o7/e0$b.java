package o7;

import java.util.Map;

public class e0$b<K, V>
  extends u0.c<K>
{
  public final Map<K, V> a;
  
  public e0$b(Map<K, V> paramMap)
  {
    paramMap.getClass();
    a = paramMap;
  }
  
  public final boolean contains(Object paramObject)
  {
    return a.containsKey(paramObject);
  }
  
  public final boolean isEmpty()
  {
    return a.isEmpty();
  }
  
  public final int size()
  {
    return a.size();
  }
}

/* Location:
 * Qualified Name:     o7.e0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */