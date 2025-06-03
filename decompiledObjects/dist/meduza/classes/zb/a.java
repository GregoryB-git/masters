package zb;

import ec.i;
import java.lang.reflect.Field;

public class a
  extends yb.a
{
  public final void a(Throwable paramThrowable1, Throwable paramThrowable2)
  {
    i.e(paramThrowable1, "cause");
    i.e(paramThrowable2, "exception");
    Integer localInteger = a.a;
    int i;
    if ((localInteger != null) && (localInteger.intValue() < 19)) {
      i = 0;
    } else {
      i = 1;
    }
    if (i != 0) {
      paramThrowable1.addSuppressed(paramThrowable2);
    } else {
      super.a(paramThrowable1, paramThrowable2);
    }
  }
  
  public static final class a
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
}

/* Location:
 * Qualified Name:     zb.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */