package androidx.room;

import androidx.annotation.WorkerThread;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

class RoomTrackingLiveData$1
  implements Runnable
{
  public RoomTrackingLiveData$1(RoomTrackingLiveData paramRoomTrackingLiveData) {}
  
  @WorkerThread
  public void run()
  {
    if (this$0.mRegisteredObserver.compareAndSet(false, true)) {
      this$0.mDatabase.getInvalidationTracker().addWeakObserver(this$0.mObserver);
    }
    int i;
    do
    {
      if (this$0.mComputing.compareAndSet(false, true))
      {
        Object localObject1 = null;
        i = 0;
        try
        {
          for (;;)
          {
            boolean bool = this$0.mInvalid.compareAndSet(true, false);
            if (bool) {
              try
              {
                localObject1 = this$0.mComputeFunction.call();
                i = 1;
              }
              catch (Exception localException)
              {
                localObject1 = new java/lang/RuntimeException;
                ((RuntimeException)localObject1).<init>("Exception while computing database live data.", localException);
                throw ((Throwable)localObject1);
              }
            }
          }
          if (i != 0) {
            RoomTrackingLiveData.access$000(this$0, localObject1);
          }
        }
        finally
        {
          this$0.mComputing.set(false);
        }
      }
      i = 0;
    } while ((i != 0) && (this$0.mInvalid.get()));
  }
}

/* Location:
 * Qualified Name:     androidx.room.RoomTrackingLiveData.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */