package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.concurrent.Executor;

public class ThreadHandoffProducerQueue
{
  private final Executor mExecutor;
  private boolean mQueueing = false;
  private final Deque<Runnable> mRunnableList;
  
  public ThreadHandoffProducerQueue(Executor paramExecutor)
  {
    mExecutor = ((Executor)Preconditions.checkNotNull(paramExecutor));
    mRunnableList = new ArrayDeque();
  }
  
  private void execInQueue()
  {
    while (!mRunnableList.isEmpty()) {
      mExecutor.execute((Runnable)mRunnableList.pop());
    }
    mRunnableList.clear();
  }
  
  public void addToQueueOrExecute(Runnable paramRunnable)
  {
    try
    {
      if (mQueueing) {
        mRunnableList.add(paramRunnable);
      } else {
        mExecutor.execute(paramRunnable);
      }
      return;
    }
    finally {}
  }
  
  public boolean isQueueing()
  {
    try
    {
      boolean bool = mQueueing;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void remove(Runnable paramRunnable)
  {
    try
    {
      mRunnableList.remove(paramRunnable);
      return;
    }
    finally
    {
      paramRunnable = finally;
      throw paramRunnable;
    }
  }
  
  public void startQueueing()
  {
    try
    {
      mQueueing = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void stopQueuing()
  {
    try
    {
      mQueueing = false;
      execInQueue();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */