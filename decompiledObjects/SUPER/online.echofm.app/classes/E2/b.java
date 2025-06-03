package E2;

import A2.m;

public abstract class b
{
  public static boolean a(int[] paramArrayOfInt, int paramInt)
  {
    if (paramArrayOfInt == null) {
      return false;
    }
    int i = paramArrayOfInt.length;
    for (int j = 0; j < i; j++) {
      if (paramArrayOfInt[j] == paramInt) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean b(Object[] paramArrayOfObject, Object paramObject)
  {
    int i;
    if (paramArrayOfObject != null) {
      i = paramArrayOfObject.length;
    } else {
      i = 0;
    }
    for (int j = 0; j < i; j++) {
      if (m.a(paramArrayOfObject[j], paramObject))
      {
        if (j < 0) {
          break;
        }
        return true;
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     E2.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */