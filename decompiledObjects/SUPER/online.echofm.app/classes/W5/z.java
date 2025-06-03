package W5;

import h6.a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public final class z
  implements Map, Serializable, a
{
  public static final z o = new z();
  private static final long serialVersionUID = 8246714829545688274L;
  
  private final Object readResolve()
  {
    return o;
  }
  
  public boolean a(Void paramVoid)
  {
    Intrinsics.checkNotNullParameter(paramVoid, "value");
    return false;
  }
  
  public Void b(Object paramObject)
  {
    return null;
  }
  
  public Set c()
  {
    return A.o;
  }
  
  public void clear()
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean containsKey(Object paramObject)
  {
    return false;
  }
  
  public Set d()
  {
    return A.o;
  }
  
  public int e()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof Map)) && (((Map)paramObject).isEmpty())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Collection f()
  {
    return y.o;
  }
  
  public Void g(Object paramObject)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public int hashCode()
  {
    return 0;
  }
  
  public boolean isEmpty()
  {
    return true;
  }
  
  public void putAll(Map paramMap)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public String toString()
  {
    return "{}";
  }
}

/* Location:
 * Qualified Name:     W5.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */