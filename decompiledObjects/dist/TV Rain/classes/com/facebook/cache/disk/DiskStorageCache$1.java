package com.facebook.cache.disk;

import java.util.concurrent.CountDownLatch;

class DiskStorageCache$1
  implements Runnable
{
  public DiskStorageCache$1(DiskStorageCache paramDiskStorageCache) {}
  
  public void run()
  {
    synchronized (DiskStorageCache.access$000(this$0))
    {
      DiskStorageCache.access$100(this$0);
      DiskStorageCache.access$202(this$0, true);
      DiskStorageCache.access$300(this$0).countDown();
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.cache.disk.DiskStorageCache.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */