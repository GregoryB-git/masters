package androidx.lifecycle;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class a$b
{
  public final int a;
  public final Method b;
  
  public a$b(int paramInt, Method paramMethod)
  {
    a = paramInt;
    b = paramMethod;
    paramMethod.setAccessible(true);
  }
  
  public void a(h paramh, d.b paramb, Object paramObject)
  {
    try
    {
      int i = a;
      if (i == 0) {
        break label78;
      }
      if (i != 1)
      {
        if (i != 2) {
          break label91;
        }
        b.invoke(paramObject, new Object[] { paramh, paramb });
      }
    }
    catch (IllegalAccessException paramh)
    {
      break label92;
    }
    catch (InvocationTargetException paramh)
    {
      break label101;
    }
    b.invoke(paramObject, new Object[] { paramh });
    break label91;
    label78:
    b.invoke(paramObject, new Object[0]);
    label91:
    return;
    label92:
    throw new RuntimeException(paramh);
    label101:
    throw new RuntimeException("Failed to call observer method", paramh.getCause());
  }
  
  public boolean equals(Object paramObject)
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
  
  public int hashCode()
  {
    return a * 31 + b.getName().hashCode();
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */