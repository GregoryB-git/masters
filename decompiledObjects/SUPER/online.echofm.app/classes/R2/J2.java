package R2;

import A2.n;

public final class J2
  implements Thread.UncaughtExceptionHandler
{
  public final String a;
  
  public J2(G2 paramG2, String paramString)
  {
    n.i(paramString);
    a = paramString;
  }
  
  public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    try
    {
      b.j().G().b(a, paramThrowable);
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
 * Qualified Name:     R2.J2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */