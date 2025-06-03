package com.facebook.cache.disk;

class DefaultEntryEvictionComparatorSupplier$1
  implements EntryEvictionComparator
{
  public DefaultEntryEvictionComparatorSupplier$1(DefaultEntryEvictionComparatorSupplier paramDefaultEntryEvictionComparatorSupplier) {}
  
  public int compare(DiskStorage.Entry paramEntry1, DiskStorage.Entry paramEntry2)
  {
    long l1 = paramEntry1.getTimestamp();
    long l2 = paramEntry2.getTimestamp();
    int i;
    if (l1 < l2) {
      i = -1;
    } else if (l2 == l1) {
      i = 0;
    } else {
      i = 1;
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     com.facebook.cache.disk.DefaultEntryEvictionComparatorSupplier.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */