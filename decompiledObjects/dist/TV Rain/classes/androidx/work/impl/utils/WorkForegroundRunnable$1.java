package androidx.work.impl.utils;

import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.SettableFuture;

class WorkForegroundRunnable$1
  implements Runnable
{
  public WorkForegroundRunnable$1(WorkForegroundRunnable paramWorkForegroundRunnable, SettableFuture paramSettableFuture) {}
  
  public void run()
  {
    val$foregroundFuture.setFuture(this$0.mWorker.getForegroundInfoAsync());
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.WorkForegroundRunnable.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */