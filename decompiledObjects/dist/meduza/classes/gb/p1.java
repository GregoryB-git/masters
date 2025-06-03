package gb;

import f;
import java.util.logging.Level;
import java.util.logging.Logger;
import n7.u;

public final class p1
  implements Runnable
{
  public static final Logger b = Logger.getLogger(p1.class.getName());
  public final Runnable a;
  
  public p1(Runnable paramRunnable)
  {
    a = paramRunnable;
  }
  
  public final void run()
  {
    try
    {
      a.run();
      return;
    }
    finally
    {
      Logger localLogger = b;
      Object localObject = Level.SEVERE;
      StringBuilder localStringBuilder = f.l("Exception while executing runnable ");
      localStringBuilder.append(a);
      localLogger.log((Level)localObject, localStringBuilder.toString(), localThrowable);
      localObject = u.a;
      if (!(localThrowable instanceof RuntimeException))
      {
        if (!(localThrowable instanceof Error)) {
          throw new AssertionError(localThrowable);
        }
        throw ((Error)localThrowable);
      }
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("LogExceptionRunnable(");
    localStringBuilder.append(a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     gb.p1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */