package z2;

import java.util.concurrent.Executor;

public enum b
  implements Executor
{
  static
  {
    b localb = new b();
    a = localb;
    b = new b[] { localb };
  }
  
  public b() {}
  
  public final void execute(Runnable paramRunnable)
  {
    paramRunnable.run();
  }
  
  public final String toString()
  {
    return "DirectExecutor";
  }
}

/* Location:
 * Qualified Name:     z2.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */