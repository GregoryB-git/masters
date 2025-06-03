package eb;

import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import x6.b;

public final class a
{
  public static final a b = new a(new IdentityHashMap());
  public final IdentityHashMap<b<?>, Object> a;
  
  public a(IdentityHashMap<b<?>, Object> paramIdentityHashMap)
  {
    a = paramIdentityHashMap;
  }
  
  public final <T> T a(b<T> paramb)
  {
    return (T)a.get(paramb);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (a.class == paramObject.getClass()))
    {
      a locala = (a)paramObject;
      if (a.size() != a.size()) {
        return false;
      }
      paramObject = a.entrySet().iterator();
      while (((Iterator)paramObject).hasNext())
      {
        Map.Entry localEntry = (Map.Entry)((Iterator)paramObject).next();
        if (!a.containsKey(localEntry.getKey())) {
          return false;
        }
        if (!b.Q(localEntry.getValue(), a.get(localEntry.getKey()))) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
  
  public final int hashCode()
  {
    Iterator localIterator = a.entrySet().iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      i += Arrays.hashCode(new Object[] { localEntry.getKey(), localEntry.getValue() });
    }
    return i;
  }
  
  public final String toString()
  {
    return a.toString();
  }
  
  public static final class a
  {
    public a a;
    public IdentityHashMap<a.b<?>, Object> b;
    
    public a(a parama)
    {
      a = parama;
    }
    
    public final a a()
    {
      if (b != null)
      {
        Iterator localIterator = a.a.entrySet().iterator();
        while (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          if (!b.containsKey(localEntry.getKey())) {
            b.put((a.b)localEntry.getKey(), localEntry.getValue());
          }
        }
        a = new a(b);
        b = null;
      }
      return a;
    }
    
    public final void b(a.b paramb)
    {
      if (a.a.containsKey(paramb))
      {
        localIdentityHashMap = new IdentityHashMap(a.a);
        localIdentityHashMap.remove(paramb);
        a = new a(localIdentityHashMap);
      }
      IdentityHashMap localIdentityHashMap = b;
      if (localIdentityHashMap != null) {
        localIdentityHashMap.remove(paramb);
      }
    }
    
    public final void c(a.b paramb, Object paramObject)
    {
      if (b == null) {
        b = new IdentityHashMap(1);
      }
      b.put(paramb, paramObject);
    }
  }
  
  public static final class b<T>
  {
    public final String a;
    
    public b(String paramString)
    {
      a = paramString;
    }
    
    public final String toString()
    {
      return a;
    }
  }
}

/* Location:
 * Qualified Name:     eb.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */