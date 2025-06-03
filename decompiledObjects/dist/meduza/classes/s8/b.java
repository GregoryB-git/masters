package s8;

import tc.h;

public final class b
  implements c, h
{
  public final int a;
  
  public void a() {}
  
  public StackTraceElement[] b(StackTraceElement[] paramArrayOfStackTraceElement)
  {
    int i = paramArrayOfStackTraceElement.length;
    int j = a;
    if (i <= j) {
      return paramArrayOfStackTraceElement;
    }
    i = j / 2;
    int k = j - i;
    StackTraceElement[] arrayOfStackTraceElement = new StackTraceElement[j];
    System.arraycopy(paramArrayOfStackTraceElement, 0, arrayOfStackTraceElement, 0, k);
    System.arraycopy(paramArrayOfStackTraceElement, paramArrayOfStackTraceElement.length - i, arrayOfStackTraceElement, k, i);
    return arrayOfStackTraceElement;
  }
  
  public int c()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     s8.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */