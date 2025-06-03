package b3;

import java.util.concurrent.Executor;

public enum a
  implements Executor
{
  public void execute(Runnable paramRunnable)
  {
    paramRunnable.run();
  }
  
  public String toString()
  {
    return "MoreExecutors.directExecutor()";
  }
}

/* Location:
 * Qualified Name:     b3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */