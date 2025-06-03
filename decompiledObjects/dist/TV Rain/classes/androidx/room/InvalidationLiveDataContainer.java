package androidx.room;

import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;

class InvalidationLiveDataContainer
{
  private final RoomDatabase mDatabase;
  @VisibleForTesting
  public final Set<LiveData> mLiveDataSet = Collections.newSetFromMap(new IdentityHashMap());
  
  public InvalidationLiveDataContainer(RoomDatabase paramRoomDatabase)
  {
    mDatabase = paramRoomDatabase;
  }
  
  public <T> LiveData<T> create(String[] paramArrayOfString, boolean paramBoolean, Callable<T> paramCallable)
  {
    return new RoomTrackingLiveData(mDatabase, this, paramBoolean, paramCallable, paramArrayOfString);
  }
  
  public void onActive(LiveData paramLiveData)
  {
    mLiveDataSet.add(paramLiveData);
  }
  
  public void onInactive(LiveData paramLiveData)
  {
    mLiveDataSet.remove(paramLiveData);
  }
}

/* Location:
 * Qualified Name:     androidx.room.InvalidationLiveDataContainer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */