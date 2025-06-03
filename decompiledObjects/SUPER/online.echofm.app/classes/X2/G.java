package X2;

import W2.g;
import W2.k;
import W2.m;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class G
{
  public static int a(int paramInt)
  {
    if (paramInt < 3)
    {
      i.b(paramInt, "expectedSize");
      return paramInt + 1;
    }
    if (paramInt < 1073741824) {
      return (int)Math.ceil(paramInt / 0.75D);
    }
    return Integer.MAX_VALUE;
  }
  
  public static boolean b(Map paramMap, Object paramObject)
  {
    return C.d(m(paramMap.entrySet().iterator()), paramObject);
  }
  
  public static boolean c(Map paramMap, Object paramObject)
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
  
  public static Map.Entry d(Object paramObject1, Object paramObject2)
  {
    return new u(paramObject1, paramObject2);
  }
  
  public static g e()
  {
    return b.o;
  }
  
  public static HashMap f(int paramInt)
  {
    return new HashMap(a(paramInt));
  }
  
  public static IdentityHashMap g()
  {
    return new IdentityHashMap();
  }
  
  public static boolean h(Map paramMap, Object paramObject)
  {
    m.j(paramMap);
    try
    {
      boolean bool = paramMap.containsKey(paramObject);
      return bool;
    }
    catch (ClassCastException|NullPointerException paramMap) {}
    return false;
  }
  
  public static Object i(Map paramMap, Object paramObject)
  {
    m.j(paramMap);
    try
    {
      paramMap = paramMap.get(paramObject);
      return paramMap;
    }
    catch (ClassCastException|NullPointerException paramMap) {}
    return null;
  }
  
  public static Object j(Map paramMap, Object paramObject)
  {
    m.j(paramMap);
    try
    {
      paramMap = paramMap.remove(paramObject);
      return paramMap;
    }
    catch (ClassCastException|NullPointerException paramMap) {}
    return null;
  }
  
  public static String k(Map paramMap)
  {
    StringBuilder localStringBuilder = j.b(paramMap.size());
    localStringBuilder.append('{');
    paramMap = paramMap.entrySet().iterator();
    for (int i = 1; paramMap.hasNext(); i = 0)
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      if (i == 0) {
        localStringBuilder.append(", ");
      }
      localStringBuilder.append(localEntry.getKey());
      localStringBuilder.append('=');
      localStringBuilder.append(localEntry.getValue());
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public static g l()
  {
    return b.p;
  }
  
  public static Iterator m(Iterator paramIterator)
  {
    return new a();
  }
  
  public class a
    extends e0
  {
    public a()
    {
      super();
    }
    
    public Object d(Map.Entry paramEntry)
    {
      return paramEntry.getValue();
    }
  }
  
  public static abstract enum b
    implements g
  {
    public enum a
    {
      public a()
      {
        super(paramInt, null);
      }
      
      public Object e(Map.Entry paramEntry)
      {
        return paramEntry.getKey();
      }
    }
    
    public enum b
    {
      public b()
      {
        super(paramInt, null);
      }
      
      public Object e(Map.Entry paramEntry)
      {
        return paramEntry.getValue();
      }
    }
  }
  
  public static abstract class c
    extends a0.d
  {
    public abstract Map a();
    
    public void clear()
    {
      a().clear();
    }
    
    public abstract boolean contains(Object paramObject);
    
    public boolean isEmpty()
    {
      return a().isEmpty();
    }
    
    public boolean removeAll(Collection paramCollection)
    {
      try
      {
        boolean bool = super.removeAll((Collection)m.j(paramCollection));
        return bool;
      }
      catch (UnsupportedOperationException localUnsupportedOperationException) {}
      return a0.j(this, paramCollection.iterator());
    }
    
    public boolean retainAll(Collection paramCollection)
    {
      try
      {
        boolean bool = super.retainAll((Collection)m.j(paramCollection));
        return bool;
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
        HashSet localHashSet = a0.g(paramCollection.size());
        Iterator localIterator = paramCollection.iterator();
        while (localIterator.hasNext())
        {
          paramCollection = localIterator.next();
          if ((contains(paramCollection)) && ((paramCollection instanceof Map.Entry))) {
            localHashSet.add(((Map.Entry)paramCollection).getKey());
          }
        }
        return a().keySet().retainAll(localHashSet);
      }
    }
    
    public int size()
    {
      return a().size();
    }
  }
  
  public static abstract class d
    extends a0.d
  {
    public final Map o;
    
    public d(Map paramMap)
    {
      o = ((Map)m.j(paramMap));
    }
    
    public Map a()
    {
      return o;
    }
    
    public boolean contains(Object paramObject)
    {
      return a().containsKey(paramObject);
    }
    
    public boolean isEmpty()
    {
      return a().isEmpty();
    }
    
    public int size()
    {
      return a().size();
    }
  }
  
  public static class e
    extends AbstractCollection
  {
    public final Map o;
    
    public e(Map paramMap)
    {
      o = ((Map)m.j(paramMap));
    }
    
    public final Map a()
    {
      return o;
    }
    
    public void clear()
    {
      a().clear();
    }
    
    public boolean contains(Object paramObject)
    {
      return a().containsValue(paramObject);
    }
    
    public boolean isEmpty()
    {
      return a().isEmpty();
    }
    
    public Iterator iterator()
    {
      return G.m(a().entrySet().iterator());
    }
    
    public boolean remove(Object paramObject)
    {
      try
      {
        boolean bool = super.remove(paramObject);
        return bool;
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
        Iterator localIterator = a().entrySet().iterator();
        while (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          if (k.a(paramObject, localEntry.getValue()))
          {
            a().remove(localEntry.getKey());
            return true;
          }
        }
      }
      return false;
    }
    
    public boolean removeAll(Collection paramCollection)
    {
      try
      {
        boolean bool = super.removeAll((Collection)m.j(paramCollection));
        return bool;
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
        HashSet localHashSet = a0.f();
        Iterator localIterator = a().entrySet().iterator();
        while (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          if (paramCollection.contains(localEntry.getValue())) {
            localHashSet.add(localEntry.getKey());
          }
        }
        return a().keySet().removeAll(localHashSet);
      }
    }
    
    public boolean retainAll(Collection paramCollection)
    {
      try
      {
        boolean bool = super.retainAll((Collection)m.j(paramCollection));
        return bool;
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
        HashSet localHashSet = a0.f();
        Iterator localIterator = a().entrySet().iterator();
        while (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          if (paramCollection.contains(localEntry.getValue())) {
            localHashSet.add(localEntry.getKey());
          }
        }
        return a().keySet().retainAll(localHashSet);
      }
    }
    
    public int size()
    {
      return a().size();
    }
  }
  
  public static abstract class f
    extends AbstractMap
  {
    public transient Set o;
    public transient Collection p;
    
    public abstract Set a();
    
    public Collection b()
    {
      return new G.e(this);
    }
    
    public Set entrySet()
    {
      Set localSet1 = o;
      Set localSet2 = localSet1;
      if (localSet1 == null)
      {
        localSet2 = a();
        o = localSet2;
      }
      return localSet2;
    }
    
    public Collection values()
    {
      Collection localCollection1 = p;
      Collection localCollection2 = localCollection1;
      if (localCollection1 == null)
      {
        localCollection2 = b();
        p = localCollection2;
      }
      return localCollection2;
    }
  }
}

/* Location:
 * Qualified Name:     X2.G
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */