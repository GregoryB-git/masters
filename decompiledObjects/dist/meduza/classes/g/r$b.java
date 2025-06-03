package g;

import java.util.concurrent.Executor;

public final class r$b
  implements Executor
{
  public final void execute(Runnable paramRunnable)
  {
    new Thread(paramRunnable).start();
  }
}

/* Location:
 * Qualified Name:     g.r.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */