package P3;

public class a
  implements d
{
  public final int a;
  public final d[] b;
  public final b c;
  
  public a(int paramInt, d... paramVarArgs)
  {
    a = paramInt;
    b = paramVarArgs;
    c = new b(paramInt);
  }
  
  public StackTraceElement[] a(StackTraceElement[] paramArrayOfStackTraceElement)
  {
    if (paramArrayOfStackTraceElement.length <= a) {
      return paramArrayOfStackTraceElement;
    }
    d[] arrayOfd = b;
    int i = arrayOfd.length;
    int j = 0;
    StackTraceElement[] arrayOfStackTraceElement = paramArrayOfStackTraceElement;
    while (j < i)
    {
      d locald = arrayOfd[j];
      if (arrayOfStackTraceElement.length <= a) {
        break;
      }
      arrayOfStackTraceElement = locald.a(paramArrayOfStackTraceElement);
      j++;
    }
    paramArrayOfStackTraceElement = arrayOfStackTraceElement;
    if (arrayOfStackTraceElement.length > a) {
      paramArrayOfStackTraceElement = c.a(arrayOfStackTraceElement);
    }
    return paramArrayOfStackTraceElement;
  }
}

/* Location:
 * Qualified Name:     P3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */