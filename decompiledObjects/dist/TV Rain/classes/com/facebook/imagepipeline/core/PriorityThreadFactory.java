package com.facebook.imagepipeline.core;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class PriorityThreadFactory
  implements ThreadFactory
{
  private final boolean mAddThreadNumber;
  private final String mPrefix;
  private final AtomicInteger mThreadNumber = new AtomicInteger(1);
  private final int mThreadPriority;
  
  public PriorityThreadFactory(int paramInt)
  {
    this(paramInt, "PriorityThreadFactory", true);
  }
  
  public PriorityThreadFactory(int paramInt, String paramString, boolean paramBoolean)
  {
    mThreadPriority = paramInt;
    mPrefix = paramString;
    mAddThreadNumber = paramBoolean;
  }
  
  public Thread newThread(final Runnable paramRunnable)
  {
    Runnable local1 = new Runnable()
    {
      public void run()
      {
        try
        {
          Process.setThreadPriority(PriorityThreadFactory.access$000(PriorityThreadFactory.this));
          paramRunnable.run();
          return;
        }
        finally
        {
          for (;;) {}
        }
      }
    };
    if (mAddThreadNumber)
    {
      paramRunnable = new StringBuilder();
      paramRunnable.append(mPrefix);
      paramRunnable.append("-");
      paramRunnable.append(mThreadNumber.getAndIncrement());
      paramRunnable = paramRunnable.toString();
    }
    else
    {
      paramRunnable = mPrefix;
    }
    return new Thread(local1, paramRunnable);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.core.PriorityThreadFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */