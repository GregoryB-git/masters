package sb;

import ec.i;
import java.io.Serializable;
import java.util.Map;

public final class t
  implements Map, Serializable
{
  public static final t a = new t();
  
  public final void clear()
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean containsKey(Object paramObject)
  {
    return false;
  }
  
  public final boolean containsValue(Object paramObject)
  {
    if (!(paramObject instanceof Void)) {
      return false;
    }
    i.e((Void)paramObject, "value");
    return false;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof Map)) && (((Map)paramObject).isEmpty())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    return 0;
  }
  
  public final boolean isEmpty()
  {
    return true;
  }
  
  public final void putAll(Map paramMap)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final Object remove(Object paramObject)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final String toString()
  {
    return "{}";
  }
}

/* Location:
 * Qualified Name:     sb.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */