package s0;

import java.util.Iterator;
import java.util.Map.Entry;

public final class a0
  extends b0
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
    public Map.Entry<K, a0> a;
    
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
      if ((localEntry.getValue() instanceof a0)) {
        localObject = new a0.a(localEntry);
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
 * Qualified Name:     s0.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */