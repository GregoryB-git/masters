package k3;

import o3.a;

public final class q$a
  implements Runnable
{
  public final Runnable a;
  
  public q$a(Runnable paramRunnable)
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

/* Location:
 * Qualified Name:     k3.q.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */