package gb;

import eb.d.a;
import f;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class r1$c
  implements Thread.UncaughtExceptionHandler
{
  public r1$c(r1 paramr1) {}
  
  public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    Logger localLogger = r1.e0;
    paramThread = Level.SEVERE;
    StringBuilder localStringBuilder = f.l("[");
    localStringBuilder.append(a.b);
    localStringBuilder.append("] Uncaught exception in the SynchronizationContext. Panic!");
    localLogger.log(paramThread, localStringBuilder.toString(), paramThrowable);
    paramThread = a;
    if (!A)
    {
      A = true;
      paramThread.L(true);
      paramThread.Q(false);
      paramThrowable = new v1(paramThrowable);
      z = paramThrowable;
      F.i(paramThrowable);
      R.D(null);
      P.a(d.a.d, "PANIC! Entering TRANSIENT_FAILURE");
      s.a(eb.n.c);
    }
  }
}

/* Location:
 * Qualified Name:     gb.r1.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */