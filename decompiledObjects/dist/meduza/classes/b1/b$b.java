package b1;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

@Deprecated
public final class b$b
{
  public final int a;
  public final Method b;
  
  public b$b(int paramInt, Method paramMethod)
  {
    a = paramInt;
    b = paramMethod;
    paramMethod.setAccessible(true);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof b)) {
      return false;
    }
    paramObject = (b)paramObject;
    if ((a != a) || (!b.getName().equals(b.getName()))) {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    int i = a;
    return b.getName().hashCode() + i * 31;
  }
}

/* Location:
 * Qualified Name:     b1.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */