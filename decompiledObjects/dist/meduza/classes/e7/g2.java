package e7;

import d2.q;

public final class g2
  implements Thread.UncaughtExceptionHandler
{
  public final String a;
  
  public g2(e2 parame2, String paramString)
  {
    a = paramString;
  }
  
  public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    try
    {
      b.zzj().o.c(a, paramThrowable);
      return;
    }
    finally
    {
      paramThread = finally;
      throw paramThread;
    }
  }
}

/* Location:
 * Qualified Name:     e7.g2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */