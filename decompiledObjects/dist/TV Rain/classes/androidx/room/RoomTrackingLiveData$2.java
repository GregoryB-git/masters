package androidx.room;

import androidx.annotation.MainThread;
import androidx.lifecycle.LiveData;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

class RoomTrackingLiveData$2
  implements Runnable
{
  public RoomTrackingLiveData$2(RoomTrackingLiveData paramRoomTrackingLiveData) {}
  
  @MainThread
  public void run()
  {
    boolean bool = this$0.hasActiveObservers();
    if ((this$0.mInvalid.compareAndSet(false, true)) && (bool)) {
      this$0.getQueryExecutor().execute(this$0.mRefreshRunnable);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.room.RoomTrackingLiveData.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */