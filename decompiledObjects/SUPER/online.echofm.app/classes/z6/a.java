package z6;

import java.util.concurrent.Executor;

public final class a
  implements Executor
{
  public static final a o = new a();
  
  public void execute(Runnable paramRunnable)
  {
    paramRunnable.run();
  }
}

/* Location:
 * Qualified Name:     z6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */