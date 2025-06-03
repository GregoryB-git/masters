package z;

import java.lang.reflect.Array;

public abstract class g
{
  public static int[] a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = paramArrayOfInt;
    if (paramInt1 + 1 > paramArrayOfInt.length)
    {
      arrayOfInt = new int[c(paramInt1)];
      System.arraycopy(paramArrayOfInt, 0, arrayOfInt, 0, paramInt1);
    }
    arrayOfInt[paramInt1] = paramInt2;
    return arrayOfInt;
  }
  
  public static Object[] b(Object[] paramArrayOfObject, int paramInt, Object paramObject)
  {
    Object[] arrayOfObject = paramArrayOfObject;
    if (paramInt + 1 > paramArrayOfObject.length)
    {
      arrayOfObject = (Object[])Array.newInstance(paramArrayOfObject.getClass().getComponentType(), c(paramInt));
      System.arraycopy(paramArrayOfObject, 0, arrayOfObject, 0, paramInt);
    }
    arrayOfObject[paramInt] = paramObject;
    return arrayOfObject;
  }
  
  public static int c(int paramInt)
  {
    if (paramInt <= 4) {
      paramInt = 8;
    } else {
      paramInt *= 2;
    }
    return paramInt;
  }
}

/* Location:
 * Qualified Name:     z.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */