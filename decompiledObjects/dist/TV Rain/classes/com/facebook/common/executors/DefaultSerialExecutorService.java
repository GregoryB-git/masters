package com.facebook.common.executors;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

public class DefaultSerialExecutorService
  extends ConstrainedExecutorService
  implements SerialExecutorService
{
  public DefaultSerialExecutorService(Executor paramExecutor)
  {
    super("SerialExecutor", 1, paramExecutor, new LinkedBlockingQueue());
  }
  
  public void execute(Runnable paramRunnable)
  {
    try
    {
      super.execute(paramRunnable);
      return;
    }
    finally
    {
      paramRunnable = finally;
      throw paramRunnable;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.executors.DefaultSerialExecutorService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */