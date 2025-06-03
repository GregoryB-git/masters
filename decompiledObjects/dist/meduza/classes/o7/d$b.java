package o7;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import n7.q;
import x6.b;

public class d$b
  extends e0.d<K, Collection<V>>
{
  public final transient Map<K, Collection<V>> c;
  
  public d$b(Map<K, Collection<V>> paramMap)
  {
    Map localMap;
    c = localMap;
  }
  
  public final s b(Map.Entry paramEntry)
  {
    Object localObject1 = paramEntry.getKey();
    d locald = d;
    Object localObject2 = (Collection)paramEntry.getValue();
    paramEntry = (c)locald;
    paramEntry.getClass();
    localObject2 = (List)localObject2;
    if ((localObject2 instanceof RandomAccess)) {
      paramEntry = new d.g(paramEntry, localObject1, (List)localObject2, null);
    } else {
      paramEntry = new d.k(paramEntry, localObject1, (List)localObject2, null);
    }
    return new s(localObject1, paramEntry);
  }
  
  public final void clear()
  {
    Object localObject = c;
    d locald = d;
    if (localObject == d)
    {
      locald.clear();
    }
    else
    {
      localObject = new b();
      while (((b)localObject).hasNext())
      {
        ((b)localObject).next();
        ((b)localObject).remove();
      }
    }
  }
  
  public final boolean containsKey(Object paramObject)
  {
    Map localMap = c;
    localMap.getClass();
    boolean bool;
    try
    {
      bool = localMap.containsKey(paramObject);
    }
    catch (ClassCastException|NullPointerException paramObject)
    {
      bool = false;
    }
    return bool;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool;
    if ((this != paramObject) && (!c.equals(paramObject))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final Object get(Object paramObject)
  {
    Object localObject = c;
    localObject.getClass();
    List localList = null;
    c localc;
    try
    {
      localObject = ((Map)localObject).get(paramObject);
    }
    catch (ClassCastException|NullPointerException localClassCastException)
    {
      localc = null;
    }
    Collection localCollection = (Collection)localc;
    if (localCollection == null)
    {
      paramObject = localList;
    }
    else
    {
      localc = (c)d;
      localc.getClass();
      localList = (List)localCollection;
      if ((localList instanceof RandomAccess)) {
        paramObject = new d.g(localc, paramObject, localList, null);
      } else {
        paramObject = new d.k(localc, paramObject, localList, null);
      }
    }
    return paramObject;
  }
  
  public final int hashCode()
  {
    return c.hashCode();
  }
  
  public Set<K> keySet()
  {
    d locald = d;
    Set localSet1 = a;
    Set localSet2 = localSet1;
    if (localSet1 == null)
    {
      localSet2 = locald.d();
      a = localSet2;
    }
    return localSet2;
  }
  
  public final Object remove(Object paramObject)
  {
    Collection localCollection = (Collection)c.remove(paramObject);
    if (localCollection == null)
    {
      paramObject = null;
    }
    else
    {
      paramObject = (List)d).f.get();
      ((Collection)paramObject).addAll(localCollection);
      d locald = d;
      int i = localCollection.size();
      e -= i;
      localCollection.clear();
    }
    return paramObject;
  }
  
  public final int size()
  {
    return c.size();
  }
  
  public final String toString()
  {
    return c.toString();
  }
  
  public final class a
    extends e0.a<K, Collection<V>>
  {
    public a() {}
    
    public final boolean contains(Object paramObject)
    {
      Set localSet = c.entrySet();
      localSet.getClass();
      boolean bool;
      try
      {
        bool = localSet.contains(paramObject);
      }
      catch (ClassCastException|NullPointerException paramObject)
      {
        bool = false;
      }
      return bool;
    }
    
    public final Iterator<Map.Entry<K, Collection<V>>> iterator()
    {
      return new d.b.b(d.b.this);
    }
    
    public final boolean remove(Object paramObject)
    {
      if (!contains(paramObject)) {
        return false;
      }
      paramObject = (Map.Entry)paramObject;
      Objects.requireNonNull(paramObject);
      paramObject = (Map.Entry)paramObject;
      d locald = d;
      Object localObject = ((Map.Entry)paramObject).getKey();
      paramObject = d;
      paramObject.getClass();
      try
      {
        paramObject = ((Map)paramObject).remove(localObject);
      }
      catch (ClassCastException|NullPointerException paramObject)
      {
        paramObject = null;
      }
      paramObject = (Collection)paramObject;
      if (paramObject != null)
      {
        int i = ((Collection)paramObject).size();
        ((Collection)paramObject).clear();
        e -= i;
      }
      return true;
    }
  }
  
  public final class b
    implements Iterator<Map.Entry<K, Collection<V>>>
  {
    public final Iterator<Map.Entry<K, Collection<V>>> a = c.entrySet().iterator();
    public Collection<V> b;
    
    public b() {}
    
    public final boolean hasNext()
    {
      return a.hasNext();
    }
    
    public final Object next()
    {
      Map.Entry localEntry = (Map.Entry)a.next();
      b = ((Collection)localEntry.getValue());
      return b(localEntry);
    }
    
    public final void remove()
    {
      boolean bool;
      if (b != null) {
        bool = true;
      } else {
        bool = false;
      }
      b.I(bool, "no calls to next() since the last call to remove()");
      a.remove();
      d locald = d;
      int i = b.size();
      e -= i;
      b.clear();
      b = null;
    }
  }
}

/* Location:
 * Qualified Name:     o7.d.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */