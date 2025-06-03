package androidx.room;

import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

class TransactionExecutor
  implements Executor
{
  private Runnable mActive;
  private final Executor mExecutor;
  private final ArrayDeque<Runnable> mTasks = new ArrayDeque();
  
  public TransactionExecutor(@NonNull Executor paramExecutor)
  {
    mExecutor = paramExecutor;
  }
  
  public void execute(Runnable paramRunnable)
  {
    try
    {
      ArrayDeque localArrayDeque = mTasks;
      Runnable local1 = new androidx/room/TransactionExecutor$1;
      local1.<init>(this, paramRunnable);
      localArrayDeque.offer(local1);
      if (mActive == null) {
        scheduleNext();
      }
      return;
    }
    finally
    {
      paramRunnable = finally;
      throw paramRunnable;
    }
  }
  
  public void scheduleNext()
  {
    try
    {
      Runnable localRunnable = (Runnable)mTasks.poll();
      mActive = localRunnable;
      if (localRunnable != null) {
        mExecutor.execute(localRunnable);
      }
      return;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     androidx.room.TransactionExecutor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */