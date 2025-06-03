package com.facebook.cache.disk;

import com.facebook.common.internal.VisibleForTesting;

public class ScoreBasedEvictionComparatorSupplier
  implements EntryEvictionComparatorSupplier
{
  private final float mAgeWeight;
  private final float mSizeWeight;
  
  public ScoreBasedEvictionComparatorSupplier(float paramFloat1, float paramFloat2)
  {
    mAgeWeight = paramFloat1;
    mSizeWeight = paramFloat2;
  }
  
  @VisibleForTesting
  public float calculateScore(DiskStorage.Entry paramEntry, long paramLong)
  {
    long l1 = paramEntry.getTimestamp();
    long l2 = paramEntry.getSize();
    float f1 = mAgeWeight;
    float f2 = (float)(paramLong - l1);
    return mSizeWeight * (float)l2 + f1 * f2;
  }
  
  public EntryEvictionComparator get()
  {
    new EntryEvictionComparator()
    {
      public long now = System.currentTimeMillis();
      
      public int compare(DiskStorage.Entry paramAnonymousEntry1, DiskStorage.Entry paramAnonymousEntry2)
      {
        float f1 = calculateScore(paramAnonymousEntry1, now);
        float f2 = calculateScore(paramAnonymousEntry2, now);
        int i;
        if (f1 < f2) {
          i = 1;
        } else if (f2 == f1) {
          i = 0;
        } else {
          i = -1;
        }
        return i;
      }
    };
  }
}

/* Location:
 * Qualified Name:     com.facebook.cache.disk.ScoreBasedEvictionComparatorSupplier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */