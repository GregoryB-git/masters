package ma;

import java.util.Iterator;
import java.util.Map.Entry;

public final class e0
  extends f0
{
  public final boolean equals(Object paramObject)
  {
    return a(null).equals(paramObject);
  }
  
  public final int hashCode()
  {
    return a(null).hashCode();
  }
  
  public final String toString()
  {
    return a(null).toString();
  }
  
  public static final class a<K>
    implements Map.Entry<K, Object>
  {
    public Map.Entry<K, e0> a;
    
    public a() {}
    
    public a(Map.Entry paramEntry)
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
  
  public static final class b<K>
    implements Iterator<Map.Entry<K, Object>>
  {
    public Iterator<Map.Entry<K, Object>> a;
    
    public b(Iterator<Map.Entry<K, Object>> paramIterator)
    {
      a = paramIterator;
    }
    
    public final boolean hasNext()
    {
      return a.hasNext();
    }
    
    public final Object next()
    {
      Map.Entry localEntry = (Map.Entry)a.next();
      Object localObject = localEntry;
      if ((localEntry.getValue() instanceof e0)) {
        localObject = new e0.a(localEntry);
      }
      return localObject;
    }
    
    public final void remove()
    {
      a.remove();
    }
  }
}

/* Location:
 * Qualified Name:     ma.e0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */