package ma;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class o
{
  public static volatile o b;
  public static final o c = new o(0);
  public final Map<a, w.e<?, ?>> a;
  
  public o()
  {
    a = new HashMap();
  }
  
  public o(int paramInt)
  {
    a = Collections.emptyMap();
  }
  
  public static o a()
  {
    Object localObject1 = b;
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      label60:
      try
      {
        localObject1 = b;
        localObject2 = localObject1;
        if (localObject1 == null)
        {
          localObject1 = n.a;
          localObject2 = null;
          if (localObject1 != null) {}
        }
      }
      finally {}
    }
    try
    {
      localObject1 = (o)((Class)localObject1).getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
      localObject2 = localObject1;
    }
    catch (Exception localException)
    {
      break label60;
    }
    if (localObject2 == null) {
      localObject2 = c;
    }
    b = (o)localObject2;
    return localo;
  }
  
  public static final class a
  {
    public final Object a;
    public final int b;
    
    public a(Object paramObject, int paramInt)
    {
      a = paramObject;
      b = paramInt;
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool1 = paramObject instanceof a;
      boolean bool2 = false;
      if (!bool1) {
        return false;
      }
      paramObject = (a)paramObject;
      bool1 = bool2;
      if (a == a)
      {
        bool1 = bool2;
        if (b == b) {
          bool1 = true;
        }
      }
      return bool1;
    }
    
    public final int hashCode()
    {
      return System.identityHashCode(a) * 65535 + b;
    }
  }
}

/* Location:
 * Qualified Name:     ma.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */