package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.collection.LongSparseArray;

public class StableIdStorage$IsolatedStableIdStorage
  implements StableIdStorage
{
  public long mNextStableId = 0L;
  
  @NonNull
  public StableIdStorage.StableIdLookup createStableIdLookup()
  {
    return new WrapperStableIdLookup();
  }
  
  public long obtainId()
  {
    long l = mNextStableId;
    mNextStableId = (1L + l);
    return l;
  }
  
  public class WrapperStableIdLookup
    implements StableIdStorage.StableIdLookup
  {
    private final LongSparseArray<Long> mLocalToGlobalLookup = new LongSparseArray();
    
    public WrapperStableIdLookup() {}
    
    public long localToGlobal(long paramLong)
    {
      Long localLong1 = (Long)mLocalToGlobalLookup.get(paramLong);
      Long localLong2 = localLong1;
      if (localLong1 == null)
      {
        localLong2 = Long.valueOf(obtainId());
        mLocalToGlobalLookup.put(paramLong, localLong2);
      }
      return localLong2.longValue();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.StableIdStorage.IsolatedStableIdStorage
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */