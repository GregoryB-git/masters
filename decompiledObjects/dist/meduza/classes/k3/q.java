package k3;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o3.a;

public final class q
  implements Executor
{
  public final Executor a;
  
  public q(ExecutorService paramExecutorService)
  {
    a = paramExecutorService;
  }
  
  public final void execute(Runnable paramRunnable)
  {
    a.execute(new a(paramRunnable));
  }
  
  public static final class a
    implements Runnable
  {
    public final Runnable a;
    
    public a(Runnable paramRunnable)
    {
      a = paramRunnable;
    }
    
    public final void run()
    {
      try
      {
        a.run();
      }
      catch (Exception localException)
      {
        a.b("Executor", "Background execution failure.", localException);
      }
    }
  }
}

/* Location:
 * Qualified Name:     k3.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */