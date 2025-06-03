package com.facebook.common.executors;

import com.facebook.common.logging.FLog;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

class ConstrainedExecutorService$Worker
  implements Runnable
{
  private ConstrainedExecutorService$Worker(ConstrainedExecutorService paramConstrainedExecutorService) {}
  
  public void run()
  {
    try
    {
      Runnable localRunnable = (Runnable)ConstrainedExecutorService.access$100(this$0).poll();
      if (localRunnable != null) {
        localRunnable.run();
      } else {
        FLog.v(ConstrainedExecutorService.access$200(), "%s: Worker has nothing to run", ConstrainedExecutorService.access$300(this$0));
      }
      return;
    }
    finally
    {
      int i = ConstrainedExecutorService.access$400(this$0).decrementAndGet();
      if (!ConstrainedExecutorService.access$100(this$0).isEmpty()) {
        ConstrainedExecutorService.access$500(this$0);
      } else {
        FLog.v(ConstrainedExecutorService.access$200(), "%s: worker finished; %d workers left", ConstrainedExecutorService.access$300(this$0), Integer.valueOf(i));
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.executors.ConstrainedExecutorService.Worker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */