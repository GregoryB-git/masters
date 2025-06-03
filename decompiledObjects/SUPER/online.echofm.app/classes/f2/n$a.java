package f2;

import j2.a;

public class n$a
  implements Runnable
{
  public final Runnable o;
  
  public n$a(Runnable paramRunnable)
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

/* Location:
 * Qualified Name:     f2.n.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */