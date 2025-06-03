package ma;

import java.util.Map.Entry;

public final class e0$a<K>
  implements Map.Entry<K, Object>
{
  public Map.Entry<K, e0> a;
  
  public e0$a() {}
  
  public e0$a(Map.Entry paramEntry)
  {
    a = paramEntry;
  }
  
  public final K getKey()
  {
    return (K)a.getKey();
  }
  
  public final Object getValue()
  {
    e0 locale0 = (e0)a.getValue();
    if (locale0 == null) {
      return null;
    }
    return locale0.a(null);
  }
  
  public final Object setValue(Object paramObject)
  {
    if ((paramObject instanceof s0))
    {
      e0 locale0 = (e0)a.getValue();
      paramObject = (s0)paramObject;
      s0 locals0 = a;
      b = null;
      a = ((s0)paramObject);
      return locals0;
    }
    throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
  }
}

/* Location:
 * Qualified Name:     ma.e0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */