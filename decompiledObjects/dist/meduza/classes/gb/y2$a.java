package gb;

import eb.e1;
import eb.g1;

public final class y2$a
  implements Thread.UncaughtExceptionHandler
{
  public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    throw new g1(e1.d(paramThrowable).g("Uncaught exception in the SynchronizationContext. Re-thrown."));
  }
}

/* Location:
 * Qualified Name:     gb.y2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */