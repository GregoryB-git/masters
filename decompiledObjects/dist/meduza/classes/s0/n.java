package s0;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class n
{
  public static volatile n b;
  public static final n c;
  public final Map<a, v.e<?, ?>> a;
  
  static
  {
    try
    {
      Class.forName("androidx.datastore.preferences.protobuf.Extension");
      c = new n(0);
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;) {}
    }
  }
  
  public n()
  {
    a = new HashMap();
  }
  
  public n(int paramInt)
  {
    a = Collections.emptyMap();
  }
  
  public static n a()
  {
    n localn1 = b;
    Object localObject = localn1;
    if (localn1 == null) {}
    for (;;)
    {
      try
      {
        localn1 = b;
        localObject = localn1;
        if (localn1 == null)
        {
          localObject = m.a;
          if (localObject == null) {}
        }
      }
      finally {}
      try
      {
        localObject = (n)((Class)localObject).getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
      }
      catch (Exception localException) {}
    }
    localObject = c;
    b = (n)localObject;
    return localn2;
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
 * Qualified Name:     s0.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */