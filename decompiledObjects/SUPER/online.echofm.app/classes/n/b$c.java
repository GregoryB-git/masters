package n;

import java.util.Map.Entry;

public class b$c
  implements Map.Entry
{
  public final Object o;
  public final Object p;
  public c q;
  public c r;
  
  public b$c(Object paramObject1, Object paramObject2)
  {
    o = paramObject1;
    p = paramObject2;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof c)) {
      return false;
    }
    paramObject = (c)paramObject;
    if ((!o.equals(o)) || (!p.equals(p))) {
      bool = false;
    }
    return bool;
  }
  
  public Object getKey()
  {
    return o;
  }
  
  public Object getValue()
  {
    return p;
  }
  
  public int hashCode()
  {
    return o.hashCode() ^ p.hashCode();
  }
  
  public Object setValue(Object paramObject)
  {
    throw new UnsupportedOperationException("An entry modification is not supported");
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(o);
    localStringBuilder.append("=");
    localStringBuilder.append(p);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     n.b.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */