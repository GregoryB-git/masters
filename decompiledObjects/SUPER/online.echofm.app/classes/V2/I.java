package V2;

import java.util.concurrent.Executor;

public final class I
  implements Executor
{
  public final void execute(Runnable paramRunnable)
  {
    paramRunnable.run();
  }
}

/* Location:
 * Qualified Name:     V2.I
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */