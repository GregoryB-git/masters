package P3;

import java.util.HashMap;
import java.util.Map;

public class c
  implements d
{
  public final int a;
  
  public c(int paramInt)
  {
    a = paramInt;
  }
  
  public static boolean b(StackTraceElement[] paramArrayOfStackTraceElement, int paramInt1, int paramInt2)
  {
    int i = paramInt2 - paramInt1;
    if (paramInt2 + i > paramArrayOfStackTraceElement.length) {
      return false;
    }
    for (int j = 0; j < i; j++) {
      if (!paramArrayOfStackTraceElement[(paramInt1 + j)].equals(paramArrayOfStackTraceElement[(paramInt2 + j)])) {
        return false;
      }
    }
    return true;
  }
  
  public static StackTraceElement[] c(StackTraceElement[] paramArrayOfStackTraceElement, int paramInt)
  {
    HashMap localHashMap = new HashMap();
    StackTraceElement[] arrayOfStackTraceElement = new StackTraceElement[paramArrayOfStackTraceElement.length];
    int i = 0;
    int j = i;
    int k = 1;
    while (i < paramArrayOfStackTraceElement.length)
    {
      StackTraceElement localStackTraceElement = paramArrayOfStackTraceElement[i];
      Integer localInteger = (Integer)localHashMap.get(localStackTraceElement);
      int i1;
      if ((localInteger != null) && (b(paramArrayOfStackTraceElement, localInteger.intValue(), i)))
      {
        int m = i - localInteger.intValue();
        int n = j;
        i1 = k;
        if (k < paramInt)
        {
          System.arraycopy(paramArrayOfStackTraceElement, i, arrayOfStackTraceElement, j, m);
          n = j + m;
          i1 = k + 1;
        }
        m = m - 1 + i;
        j = n;
        k = i1;
        i1 = m;
      }
      else
      {
        arrayOfStackTraceElement[j] = paramArrayOfStackTraceElement[i];
        j++;
        k = 1;
        i1 = i;
      }
      localHashMap.put(localStackTraceElement, Integer.valueOf(i));
      i = i1 + 1;
    }
    paramArrayOfStackTraceElement = new StackTraceElement[j];
    System.arraycopy(arrayOfStackTraceElement, 0, paramArrayOfStackTraceElement, 0, j);
    return paramArrayOfStackTraceElement;
  }
  
  public StackTraceElement[] a(StackTraceElement[] paramArrayOfStackTraceElement)
  {
    StackTraceElement[] arrayOfStackTraceElement = c(paramArrayOfStackTraceElement, a);
    if (arrayOfStackTraceElement.length < paramArrayOfStackTraceElement.length) {
      return arrayOfStackTraceElement;
    }
    return paramArrayOfStackTraceElement;
  }
}

/* Location:
 * Qualified Name:     P3.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */