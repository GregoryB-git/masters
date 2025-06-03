package f2;

import j2.a;
import java.util.concurrent.Executor;

public class n
  implements Executor
{
  public final Executor o;
  
  public n(Executor paramExecutor)
  {
    o = paramExecutor;
  }
  
  public void execute(Runnable paramRunnable)
  {
    o.execute(new a(paramRunnable));
  }
  
  public static class a
    implements Runnable
  {
    public final Runnable o;
    
    public a(Runnable paramRunnable)
    {
      o = paramRunnable;
    }
    
    public void run()
    {
      try
      {
        o.run();
      }
      catch (Exception localException)
      {
        a.d("Executor", "Background execution failure.", localException);
      }
    }
  }
}

/* Location:
 * Qualified Name:     f2.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */