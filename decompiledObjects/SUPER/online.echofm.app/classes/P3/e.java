package P3;

import java.util.AbstractCollection;
import java.util.Stack;

public class e
{
  public final String a;
  public final String b;
  public final StackTraceElement[] c;
  public final e d;
  
  public e(String paramString1, String paramString2, StackTraceElement[] paramArrayOfStackTraceElement, e parame)
  {
    a = paramString1;
    b = paramString2;
    c = paramArrayOfStackTraceElement;
    d = parame;
  }
  
  public static e a(Throwable paramThrowable, d paramd)
  {
    Stack localStack = new Stack();
    while (paramThrowable != null)
    {
      localStack.push(paramThrowable);
      paramThrowable = paramThrowable.getCause();
    }
    Throwable localThrowable;
    for (paramThrowable = null; !localStack.isEmpty(); paramThrowable = new e(localThrowable.getLocalizedMessage(), localThrowable.getClass().getName(), paramd.a(localThrowable.getStackTrace()), paramThrowable)) {
      localThrowable = (Throwable)localStack.pop();
    }
    return paramThrowable;
  }
}

/* Location:
 * Qualified Name:     P3.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */