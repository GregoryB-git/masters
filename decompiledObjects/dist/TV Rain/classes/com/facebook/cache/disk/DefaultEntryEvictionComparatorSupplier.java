package com.facebook.cache.disk;

public class DefaultEntryEvictionComparatorSupplier
  implements EntryEvictionComparatorSupplier
{
  public EntryEvictionComparator get()
  {
    new EntryEvictionComparator()
    {
      public int compare(DiskStorage.Entry paramAnonymousEntry1, DiskStorage.Entry paramAnonymousEntry2)
      {
        long l1 = paramAnonymousEntry1.getTimestamp();
        long l2 = paramAnonymousEntry2.getTimestamp();
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
    };
  }
}

/* Location:
 * Qualified Name:     com.facebook.cache.disk.DefaultEntryEvictionComparatorSupplier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */