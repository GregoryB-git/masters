package s0;

import java.util.Map.Entry;

public final class a0$a<K>
  implements Map.Entry<K, Object>
{
  public Map.Entry<K, a0> a;
  
  public a0$a() {}
  
  public a0$a(Map.Entry paramEntry)
  {
    a = paramEntry;
  }
  
  public final K getKey()
  {
    return (K)a.getKey();
  }
  
  public final Object getValue()
  {
    a0 locala0 = (a0)a.getValue();
    if (locala0 == null) {
      return null;
    }
    return locala0.a(null);
  }
  
  public final Object setValue(Object paramObject)
  {
    if ((paramObject instanceof o0))
    {
      a0 locala0 = (a0)a.getValue();
      paramObject = (o0)paramObject;
      o0 localo0 = a;
      b = null;
      a = ((o0)paramObject);
      return localo0;
    }
    throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
  }
}

/* Location:
 * Qualified Name:     s0.a0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */