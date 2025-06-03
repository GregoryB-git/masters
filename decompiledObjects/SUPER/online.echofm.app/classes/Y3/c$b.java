package Y3;

import V3.z;
import java.util.concurrent.ThreadFactory;

public class c$b
  implements ThreadFactory
{
  public c$b(c paramc) {}
  
  public Thread newThread(Runnable paramRunnable)
  {
    Thread localThread = a.e().newThread(paramRunnable);
    paramRunnable = a.f();
    paramRunnable.a(localThread, "FirebaseDatabaseWorker");
    paramRunnable.b(localThread, true);
    paramRunnable.c(localThread, new a());
    return localThread;
  }
  
  public class a
    implements Thread.UncaughtExceptionHandler
  {
    public a() {}
    
    public void uncaughtException(Thread paramThread, Throwable paramThrowable)
    {
      a.g(paramThrowable);
    }
  }
}

/* Location:
 * Qualified Name:     Y3.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */