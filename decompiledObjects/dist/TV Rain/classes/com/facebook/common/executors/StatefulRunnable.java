package com.facebook.common.executors;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class StatefulRunnable<T>
  implements Runnable
{
  public static final int STATE_CANCELLED = 2;
  public static final int STATE_CREATED = 0;
  public static final int STATE_FAILED = 4;
  public static final int STATE_FINISHED = 3;
  public static final int STATE_STARTED = 1;
  public final AtomicInteger mState = new AtomicInteger(0);
  
  public void cancel()
  {
    if (mState.compareAndSet(0, 2)) {
      onCancellation();
    }
  }
  
  public void disposeResult(T paramT) {}
  
  public abstract T getResult()
    throws Exception;
  
  public void onCancellation() {}
  
  public void onFailure(Exception paramException) {}
  
  public void onSuccess(T paramT) {}
  
  public final void run()
  {
    if (!mState.compareAndSet(0, 1)) {
      return;
    }
    try
    {
      Object localObject1 = getResult();
      mState.set(3);
      try
      {
        onSuccess(localObject1);
        return;
      }
      finally
      {
        disposeResult(localObject1);
      }
      return;
    }
    catch (Exception localException)
    {
      mState.set(4);
      onFailure(localException);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.executors.StatefulRunnable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */