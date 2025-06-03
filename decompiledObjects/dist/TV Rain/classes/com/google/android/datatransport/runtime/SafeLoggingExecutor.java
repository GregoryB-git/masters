package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.logging.Logging;
import java.util.concurrent.Executor;

class SafeLoggingExecutor
  implements Executor
{
  private final Executor delegate;
  
  public SafeLoggingExecutor(Executor paramExecutor)
  {
    delegate = paramExecutor;
  }
  
  public void execute(Runnable paramRunnable)
  {
    delegate.execute(new SafeLoggingRunnable(paramRunnable));
  }
  
  public static class SafeLoggingRunnable
    implements Runnable
  {
    private final Runnable delegate;
    
    public SafeLoggingRunnable(Runnable paramRunnable)
    {
      delegate = paramRunnable;
    }
    
    public void run()
    {
      try
      {
        delegate.run();
      }
      catch (Exception localException)
      {
        Logging.e("Executor", "Background execution failure.", localException);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.SafeLoggingExecutor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */