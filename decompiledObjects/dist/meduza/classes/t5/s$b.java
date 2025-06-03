package t5;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import o7.e0;
import o7.h;
import o7.p;
import o7.u0;
import s5.e;

public final class s$b
  extends p<String, List<String>>
{
  public final Map<String, List<String>> a;
  
  public s$b(Map<String, List<String>> paramMap)
  {
    a = paramMap;
  }
  
  public final Object b()
  {
    return a;
  }
  
  public final Map<String, List<String>> c()
  {
    return a;
  }
  
  public final boolean containsKey(Object paramObject)
  {
    boolean bool;
    if ((paramObject != null) && (super.containsKey(paramObject))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean containsValue(Object paramObject)
  {
    Iterator localIterator = ((h)entrySet()).iterator();
    localIterator.getClass();
    boolean bool = true;
    if (paramObject == null)
    {
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
      } while (((Map.Entry)localIterator.next()).getValue() != null);
    }
    else
    {
      while (localIterator.hasNext()) {
        if (paramObject.equals(((Map.Entry)localIterator.next()).getValue())) {
          return bool;
        }
      }
      bool = false;
    }
    return bool;
  }
  
  public final Set<Map.Entry<String, List<String>>> entrySet()
  {
    return u0.b(super.entrySet(), new t());
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool;
    if ((paramObject != null) && (e0.a(this, paramObject))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final Object get(Object paramObject)
  {
    if (paramObject == null) {
      paramObject = null;
    } else {
      paramObject = (List)super.get(paramObject);
    }
    return paramObject;
  }
  
  public final int hashCode()
  {
    return u0.c(entrySet());
  }
  
  public final boolean isEmpty()
  {
    boolean bool1 = super.isEmpty();
    boolean bool2 = true;
    boolean bool3 = bool2;
    if (!bool1) {
      if ((super.size() == 1) && (super.containsKey(null))) {
        bool3 = bool2;
      } else {
        bool3 = false;
      }
    }
    return bool3;
  }
  
  public final Set<String> keySet()
  {
    return u0.b(super.keySet(), new e());
  }
  
  public final int size()
  {
    return super.size() - super.containsKey(null);
  }
}

/* Location:
 * Qualified Name:     t5.s.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */