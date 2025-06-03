package s7;

import java.util.concurrent.Executor;

public enum c
  implements Executor
{
  static
  {
    c localc = new c();
    a = localc;
    b = new c[] { localc };
  }
  
  public c() {}
  
  public final void execute(Runnable paramRunnable)
  {
    paramRunnable.run();
  }
  
  public final String toString()
  {
    return "MoreExecutors.directExecutor()";
  }
}

/* Location:
 * Qualified Name:     s7.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */