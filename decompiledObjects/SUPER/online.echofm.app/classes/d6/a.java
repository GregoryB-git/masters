package d6;

import j6.c;
import java.lang.reflect.Field;

public class a
  extends c6.a
{
  public c b()
  {
    Object localObject;
    if (c(34)) {
      localObject = new k6.a();
    } else {
      localObject = super.b();
    }
    return (c)localObject;
  }
  
  public final boolean c(int paramInt)
  {
    Integer localInteger = a.b;
    boolean bool;
    if ((localInteger != null) && (localInteger.intValue() < paramInt)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static final class a
  {
    public static final a a = new a();
    public static final Integer b;
    
    static
    {
      Object localObject1 = null;
      try
      {
        localObject2 = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        if ((localObject2 instanceof Integer)) {
          localObject2 = (Integer)localObject2;
        }
      }
      finally
      {
        Object localObject2;
        Object localObject4;
        for (;;) {}
      }
      localObject2 = null;
      localObject4 = localObject1;
      if (localObject2 != null)
      {
        localObject4 = localObject1;
        if (((Number)localObject2).intValue() > 0) {
          localObject4 = localObject2;
        }
      }
      b = (Integer)localObject4;
    }
  }
}

/* Location:
 * Qualified Name:     d6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */