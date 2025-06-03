package wc;

import java.util.concurrent.Executor;

public final class a
  implements Executor
{
  public static final a a = new a();
  
  public final void execute(Runnable paramRunnable)
  {
    paramRunnable.run();
  }
}

/* Location:
 * Qualified Name:     wc.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */