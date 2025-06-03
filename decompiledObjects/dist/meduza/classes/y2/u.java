package y2;

import java.util.concurrent.Executor;

public final class u
  implements Executor
{
  public final void execute(Runnable paramRunnable)
  {
    paramRunnable.run();
  }
}

/* Location:
 * Qualified Name:     y2.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */