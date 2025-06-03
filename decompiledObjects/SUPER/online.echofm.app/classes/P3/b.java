package P3;

public class b
  implements d
{
  public final int a;
  
  public b(int paramInt)
  {
    a = paramInt;
  }
  
  public StackTraceElement[] a(StackTraceElement[] paramArrayOfStackTraceElement)
  {
    int i = paramArrayOfStackTraceElement.length;
    int j = a;
    if (i <= j) {
      return paramArrayOfStackTraceElement;
    }
    int k = j / 2;
    i = j - k;
    StackTraceElement[] arrayOfStackTraceElement = new StackTraceElement[j];
    System.arraycopy(paramArrayOfStackTraceElement, 0, arrayOfStackTraceElement, 0, i);
    System.arraycopy(paramArrayOfStackTraceElement, paramArrayOfStackTraceElement.length - k, arrayOfStackTraceElement, i, k);
    return arrayOfStackTraceElement;
  }
}

/* Location:
 * Qualified Name:     P3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */