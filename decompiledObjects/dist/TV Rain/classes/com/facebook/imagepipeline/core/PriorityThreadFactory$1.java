package com.facebook.imagepipeline.core;

import android.os.Process;

class PriorityThreadFactory$1
  implements Runnable
{
  public PriorityThreadFactory$1(PriorityThreadFactory paramPriorityThreadFactory, Runnable paramRunnable) {}
  
  public void run()
  {
    try
    {
      Process.setThreadPriority(PriorityThreadFactory.access$000(this$0));
      val$runnable.run();
      return;
    }
    finally
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.core.PriorityThreadFactory.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */