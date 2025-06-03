package androidx.work.impl.workers;

import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;

class ConstraintTrackingWorker$2
  implements Runnable
{
  public ConstraintTrackingWorker$2(ConstraintTrackingWorker paramConstraintTrackingWorker, ListenableFuture paramListenableFuture) {}
  
  public void run()
  {
    synchronized (this$0.mLock)
    {
      if (this$0.mAreConstraintsUnmet) {
        this$0.setFutureRetry();
      } else {
        this$0.mFuture.setFuture(val$innerFuture);
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.workers.ConstraintTrackingWorker.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */