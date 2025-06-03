package androidx.recyclerview.widget;

import androidx.collection.LongSparseArray;

class StableIdStorage$IsolatedStableIdStorage$WrapperStableIdLookup
  implements StableIdStorage.StableIdLookup
{
  private final LongSparseArray<Long> mLocalToGlobalLookup = new LongSparseArray();
  
  public StableIdStorage$IsolatedStableIdStorage$WrapperStableIdLookup(StableIdStorage.IsolatedStableIdStorage paramIsolatedStableIdStorage) {}
  
  public long localToGlobal(long paramLong)
  {
    Long localLong1 = (Long)mLocalToGlobalLookup.get(paramLong);
    Long localLong2 = localLong1;
    if (localLong1 == null)
    {
      localLong2 = Long.valueOf(this$0.obtainId());
      mLocalToGlobalLookup.put(paramLong, localLong2);
    }
    return localLong2.longValue();
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.StableIdStorage.IsolatedStableIdStorage.WrapperStableIdLookup
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */