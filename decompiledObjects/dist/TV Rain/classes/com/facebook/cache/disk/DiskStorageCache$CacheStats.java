package com.facebook.cache.disk;

import com.facebook.common.internal.VisibleForTesting;

@VisibleForTesting
class DiskStorageCache$CacheStats
{
  private long mCount = -1L;
  private boolean mInitialized = false;
  private long mSize = -1L;
  
  public long getCount()
  {
    try
    {
      long l = mCount;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public long getSize()
  {
    try
    {
      long l = mSize;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void increment(long paramLong1, long paramLong2)
  {
    try
    {
      if (mInitialized)
      {
        mSize += paramLong1;
        mCount += paramLong2;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean isInitialized()
  {
    try
    {
      boolean bool = mInitialized;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void reset()
  {
    try
    {
      mInitialized = false;
      mCount = -1L;
      mSize = -1L;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void set(long paramLong1, long paramLong2)
  {
    try
    {
      mCount = paramLong2;
      mSize = paramLong1;
      mInitialized = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.cache.disk.DiskStorageCache.CacheStats
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */