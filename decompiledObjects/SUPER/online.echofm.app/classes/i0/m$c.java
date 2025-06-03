package i0;

import X2.a0;
import X2.q;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class m$c
  extends q
{
  public final Map o;
  
  public m$c(Map paramMap)
  {
    o = paramMap;
  }
  
  public Map b()
  {
    return o;
  }
  
  public boolean containsKey(Object paramObject)
  {
    boolean bool;
    if ((paramObject != null) && (super.containsKey(paramObject))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean containsValue(Object paramObject)
  {
    return super.c(paramObject);
  }
  
  public Set entrySet()
  {
    return a0.b(super.entrySet(), new n());
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if ((paramObject != null) && (super.d(paramObject))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public List h(Object paramObject)
  {
    if (paramObject == null) {
      paramObject = null;
    } else {
      paramObject = (List)super.get(paramObject);
    }
    return (List)paramObject;
  }
  
  public int hashCode()
  {
    return super.e();
  }
  
  public boolean isEmpty()
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
  
  public Set keySet()
  {
    return a0.b(super.keySet(), new o());
  }
  
  public int size()
  {
    return super.size() - super.containsKey(null);
  }
}

/* Location:
 * Qualified Name:     i0.m.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */