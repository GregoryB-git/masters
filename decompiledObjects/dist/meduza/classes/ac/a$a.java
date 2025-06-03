package ac;

import java.lang.reflect.Field;

public final class a$a
{
  public static final Integer a;
  
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
      int i;
      for (;;) {}
    }
    localObject2 = null;
    localObject4 = localObject1;
    if (localObject2 != null)
    {
      if (((Number)localObject2).intValue() > 0) {
        i = 1;
      } else {
        i = 0;
      }
      localObject4 = localObject1;
      if (i != 0) {
        localObject4 = localObject2;
      }
    }
    a = (Integer)localObject4;
  }
}

/* Location:
 * Qualified Name:     ac.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */