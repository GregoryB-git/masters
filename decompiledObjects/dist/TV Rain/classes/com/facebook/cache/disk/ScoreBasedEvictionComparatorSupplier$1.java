package com.facebook.cache.disk;

class ScoreBasedEvictionComparatorSupplier$1
  implements EntryEvictionComparator
{
  public long now = System.currentTimeMillis();
  
  public ScoreBasedEvictionComparatorSupplier$1(ScoreBasedEvictionComparatorSupplier paramScoreBasedEvictionComparatorSupplier) {}
  
  public int compare(DiskStorage.Entry paramEntry1, DiskStorage.Entry paramEntry2)
  {
    float f1 = this$0.calculateScore(paramEntry1, now);
    float f2 = this$0.calculateScore(paramEntry2, now);
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
}

/* Location:
 * Qualified Name:     com.facebook.cache.disk.ScoreBasedEvictionComparatorSupplier.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */