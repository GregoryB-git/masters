package X2;

import java.util.Arrays;
import java.util.Map;

public abstract class Q
{
  public static Object[] a(Object[] paramArrayOfObject1, int paramInt1, int paramInt2, Object[] paramArrayOfObject2)
  {
    return Arrays.copyOfRange(paramArrayOfObject1, paramInt1, paramInt2, paramArrayOfObject2.getClass());
  }
  
  public static Object[] b(Object[] paramArrayOfObject, int paramInt)
  {
    if (paramArrayOfObject.length != 0) {
      paramArrayOfObject = Arrays.copyOf(paramArrayOfObject, 0);
    }
    return Arrays.copyOf(paramArrayOfObject, paramInt);
  }
  
  public static Map c()
  {
    return k.r();
  }
}

/* Location:
 * Qualified Name:     X2.Q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */