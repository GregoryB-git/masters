package bolts;

import java.util.concurrent.Executor;

class BoltsExecutors$ImmediateExecutor
  implements Executor
{
  private static final int MAX_DEPTH = 15;
  private ThreadLocal<Integer> executionDepth = new ThreadLocal();
  
  private int decrementDepth()
  {
    Integer localInteger1 = (Integer)executionDepth.get();
    Integer localInteger2 = localInteger1;
    if (localInteger1 == null) {
      localInteger2 = Integer.valueOf(0);
    }
    int i = localInteger2.intValue() - 1;
    if (i == 0) {
      executionDepth.remove();
    } else {
      executionDepth.set(Integer.valueOf(i));
    }
    return i;
  }
  
  private int incrementDepth()
  {
    Integer localInteger1 = (Integer)executionDepth.get();
    Integer localInteger2 = localInteger1;
    if (localInteger1 == null) {
      localInteger2 = Integer.valueOf(0);
    }
    int i = localInteger2.intValue() + 1;
    executionDepth.set(Integer.valueOf(i));
    return i;
  }
  
  public void execute(Runnable paramRunnable)
  {
    if (incrementDepth() <= 15) {}
    try
    {
      paramRunnable.run();
      break label27;
      BoltsExecutors.background().execute(paramRunnable);
      label27:
      return;
    }
    finally
    {
      decrementDepth();
    }
  }
}

/* Location:
 * Qualified Name:     bolts.BoltsExecutors.ImmediateExecutor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */