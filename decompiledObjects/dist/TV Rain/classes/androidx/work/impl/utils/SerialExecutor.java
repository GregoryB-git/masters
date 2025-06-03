package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public class SerialExecutor
  implements Executor
{
  private volatile Runnable mActive;
  private final Executor mExecutor;
  private final Object mLock;
  private final ArrayDeque<Task> mTasks;
  
  public SerialExecutor(@NonNull Executor paramExecutor)
  {
    mExecutor = paramExecutor;
    mTasks = new ArrayDeque();
    mLock = new Object();
  }
  
  public void execute(@NonNull Runnable paramRunnable)
  {
    synchronized (mLock)
    {
      ArrayDeque localArrayDeque = mTasks;
      Task localTask = new androidx/work/impl/utils/SerialExecutor$Task;
      localTask.<init>(this, paramRunnable);
      localArrayDeque.add(localTask);
      if (mActive == null) {
        scheduleNext();
      }
      return;
    }
  }
  
  @NonNull
  @VisibleForTesting
  public Executor getDelegatedExecutor()
  {
    return mExecutor;
  }
  
  public boolean hasPendingTasks()
  {
    synchronized (mLock)
    {
      boolean bool;
      if (!mTasks.isEmpty()) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public void scheduleNext()
  {
    synchronized (mLock)
    {
      Runnable localRunnable = (Runnable)mTasks.poll();
      mActive = localRunnable;
      if (localRunnable != null) {
        mExecutor.execute(mActive);
      }
      return;
    }
  }
  
  public static class Task
    implements Runnable
  {
    public final Runnable mRunnable;
    public final SerialExecutor mSerialExecutor;
    
    public Task(@NonNull SerialExecutor paramSerialExecutor, @NonNull Runnable paramRunnable)
    {
      mSerialExecutor = paramSerialExecutor;
      mRunnable = paramRunnable;
    }
    
    public void run()
    {
      try
      {
        mRunnable.run();
        return;
      }
      finally
      {
        mSerialExecutor.scheduleNext();
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.SerialExecutor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */