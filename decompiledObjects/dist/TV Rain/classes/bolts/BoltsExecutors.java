package bolts;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

final class BoltsExecutors
{
  private static final BoltsExecutors INSTANCE = new BoltsExecutors();
  private final ExecutorService background;
  private final Executor immediate;
  private final ScheduledExecutorService scheduled;
  
  private BoltsExecutors()
  {
    ExecutorService localExecutorService;
    if (!isAndroidRuntime()) {
      localExecutorService = Executors.newCachedThreadPool();
    } else {
      localExecutorService = AndroidExecutors.newCachedThreadPool();
    }
    background = localExecutorService;
    scheduled = Executors.newSingleThreadScheduledExecutor();
    immediate = new ImmediateExecutor(null);
  }
  
  public static ExecutorService background()
  {
    return INSTANCEbackground;
  }
  
  public static Executor immediate()
  {
    return INSTANCEimmediate;
  }
  
  private static boolean isAndroidRuntime()
  {
    String str = System.getProperty("java.runtime.name");
    if (str == null) {
      return false;
    }
    return str.toLowerCase(Locale.US).contains("android");
  }
  
  public static ScheduledExecutorService scheduled()
  {
    return INSTANCEscheduled;
  }
  
  public static class ImmediateExecutor
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
}

/* Location:
 * Qualified Name:     bolts.BoltsExecutors
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */