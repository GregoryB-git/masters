package androidx.work.impl.utils;

import androidx.work.ForegroundInfo;
import androidx.work.ForegroundUpdater;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.futures.AbstractFuture;
import androidx.work.impl.utils.futures.SettableFuture;

class WorkForegroundRunnable$2
  implements Runnable
{
  public WorkForegroundRunnable$2(WorkForegroundRunnable paramWorkForegroundRunnable, SettableFuture paramSettableFuture) {}
  
  public void run()
  {
    try
    {
      Object localObject1 = (ForegroundInfo)val$foregroundFuture.get();
      Object localObject2;
      if (localObject1 != null)
      {
        Logger.get().debug(WorkForegroundRunnable.TAG, String.format("Updating notification for %s", new Object[] { this$0.mWorkSpec.workerClassName }), new Throwable[0]);
        this$0.mWorker.setRunInForeground(true);
        localObject2 = this$0;
        mFuture.setFuture(mForegroundUpdater.setForegroundAsync(mContext, mWorker.getId(), (ForegroundInfo)localObject1));
      }
      else
      {
        localObject1 = String.format("Worker was marked important (%s) but did not provide ForegroundInfo", new Object[] { this$0.mWorkSpec.workerClassName });
        localObject2 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
      }
    }
    finally
    {
      this$0.mFuture.setException(localThrowable);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.WorkForegroundRunnable.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */