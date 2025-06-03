package o7;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p2.m0;
import x6.b;

public final class e0
{
  public static boolean a(Map<?, ?> paramMap, Object paramObject)
  {
    if (paramMap == paramObject) {
      return true;
    }
    if ((paramObject instanceof Map))
    {
      paramObject = (Map)paramObject;
      return paramMap.entrySet().equals(((Map)paramObject).entrySet());
    }
    return false;
  }
  
  public static abstract class a<K, V>
    extends u0.c<Map.Entry<K, V>>
  {
    public final void clear()
    {
      a.clear();
    }
    
    public abstract boolean contains(Object paramObject);
    
    public final boolean isEmpty()
    {
      return a.isEmpty();
    }
    
    public final boolean removeAll(Collection<?> paramCollection)
    {
      boolean bool;
      try
      {
        paramCollection.getClass();
        bool = super.removeAll(paramCollection);
        return bool;
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
        paramCollection = paramCollection.iterator();
        bool = false;
        while (paramCollection.hasNext())
        {
          Object localObject = paramCollection.next();
          bool |= ((d.b.a)this).remove(localObject);
        }
      }
      return bool;
    }
    
    public final boolean retainAll(Collection<?> paramCollection)
    {
      try
      {
        paramCollection.getClass();
        boolean bool = super.retainAll(paramCollection);
        return bool;
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
        int i = paramCollection.size();
        if (i < 3)
        {
          m0.o(i, "expectedSize");
          i++;
        }
        else if (i < 1073741824)
        {
          i = (int)Math.ceil(i / 0.75D);
        }
        else
        {
          i = Integer.MAX_VALUE;
        }
        HashSet localHashSet = new HashSet(i);
        paramCollection = paramCollection.iterator();
        while (paramCollection.hasNext())
        {
          Object localObject = paramCollection.next();
          if ((contains(localObject)) && ((localObject instanceof Map.Entry))) {
            localHashSet.add(((Map.Entry)localObject).getKey());
          }
        }
        return a.keySet().retainAll(localHashSet);
      }
    }
    
    public final int size()
    {
      return a.size();
    }
  }
  
  public static class b<K, V>
    extends u0.c<K>
  {
    public final Map<K, V> a;
    
    public b(Map<K, V> paramMap)
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
  
  public static final class c<K, V>
    extends AbstractCollection<V>
  {
    public final Map<K, V> a;
    
    public c(Map<K, V> paramMap)
    {
      paramMap.getClass();
      a = paramMap;
    }
    
    public final void clear()
    {
      a.clear();
    }
    
    public final boolean contains(Object paramObject)
    {
      return a.containsValue(paramObject);
    }
    
    public final boolean isEmpty()
    {
      return a.isEmpty();
    }
    
    public final Iterator<V> iterator()
    {
      return new d0(a.entrySet().iterator());
    }
    
    public final boolean remove(Object paramObject)
    {
      try
      {
        boolean bool = super.remove(paramObject);
        return bool;
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
        Iterator localIterator = a.entrySet().iterator();
        while (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          if (b.Q(paramObject, localEntry.getValue()))
          {
            a.remove(localEntry.getKey());
            return true;
          }
        }
      }
      return false;
    }
    
    public final boolean removeAll(Collection<?> paramCollection)
    {
      try
      {
        paramCollection.getClass();
        boolean bool = super.removeAll(paramCollection);
        return bool;
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
        HashSet localHashSet = new HashSet();
        Iterator localIterator = a.entrySet().iterator();
        while (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          if (paramCollection.contains(localEntry.getValue())) {
            localHashSet.add(localEntry.getKey());
          }
        }
        return a.keySet().removeAll(localHashSet);
      }
    }
    
    public final boolean retainAll(Collection<?> paramCollection)
    {
      try
      {
        paramCollection.getClass();
        boolean bool = super.retainAll(paramCollection);
        return bool;
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
        HashSet localHashSet = new HashSet();
        Iterator localIterator = a.entrySet().iterator();
        while (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          if (paramCollection.contains(localEntry.getValue())) {
            localHashSet.add(localEntry.getKey());
          }
        }
        return a.keySet().retainAll(localHashSet);
      }
    }
    
    public final int size()
    {
      return a.size();
    }
  }
  
  public static abstract class d<K, V>
    extends AbstractMap<K, V>
  {
    public transient d.b.a a;
    public transient e0.c b;
    
    public final Set<Map.Entry<K, V>> entrySet()
    {
      d.b.a locala1 = a;
      d.b.a locala2 = locala1;
      if (locala1 == null)
      {
        locala2 = new d.b.a((d.b)this);
        a = locala2;
      }
      return locala2;
    }
    
    public final Collection<V> values()
    {
      e0.c localc1 = b;
      e0.c localc2 = localc1;
      if (localc1 == null)
      {
        localc2 = new e0.c(this);
        b = localc2;
      }
      return localc2;
    }
  }
}

/* Location:
 * Qualified Name:     o7.e0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */