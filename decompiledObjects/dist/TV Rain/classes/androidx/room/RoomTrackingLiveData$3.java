package androidx.room;

import androidx.annotation.NonNull;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.executor.TaskExecutor;
import java.util.Set;

class RoomTrackingLiveData$3
  extends InvalidationTracker.Observer
{
  public RoomTrackingLiveData$3(RoomTrackingLiveData paramRoomTrackingLiveData, String[] paramArrayOfString)
  {
    super(paramArrayOfString);
  }
  
  public void onInvalidated(@NonNull Set<String> paramSet)
  {
    ArchTaskExecutor.getInstance().executeOnMainThread(this$0.mInvalidationRunnable);
  }
}

/* Location:
 * Qualified Name:     androidx.room.RoomTrackingLiveData.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */