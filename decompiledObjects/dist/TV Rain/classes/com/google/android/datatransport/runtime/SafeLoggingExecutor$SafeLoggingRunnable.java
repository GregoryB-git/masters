package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.logging.Logging;

class SafeLoggingExecutor$SafeLoggingRunnable
  implements Runnable
{
  private final Runnable delegate;
  
  public SafeLoggingExecutor$SafeLoggingRunnable(Runnable paramRunnable)
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

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.SafeLoggingExecutor.SafeLoggingRunnable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */