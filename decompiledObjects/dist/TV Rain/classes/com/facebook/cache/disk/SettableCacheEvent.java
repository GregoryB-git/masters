package com.facebook.cache.disk;

import com.facebook.cache.common.CacheEvent;
import com.facebook.cache.common.CacheEventListener.EvictionReason;
import com.facebook.cache.common.CacheKey;
import com.facebook.infer.annotation.ReturnsOwnership;
import java.io.IOException;
import javax.annotation.Nullable;

public class SettableCacheEvent
  implements CacheEvent
{
  private static final int MAX_RECYCLED = 5;
  private static final Object RECYCLER_LOCK = new Object();
  private static SettableCacheEvent sFirstRecycledEvent;
  private static int sRecycledCount;
  private CacheKey mCacheKey;
  private long mCacheLimit;
  private long mCacheSize;
  private CacheEventListener.EvictionReason mEvictionReason;
  private IOException mException;
  private long mItemSize;
  private SettableCacheEvent mNextRecycledEvent;
  private String mResourceId;
  
  @ReturnsOwnership
  public static SettableCacheEvent obtain()
  {
    synchronized (RECYCLER_LOCK)
    {
      SettableCacheEvent localSettableCacheEvent = sFirstRecycledEvent;
      if (localSettableCacheEvent != null)
      {
        sFirstRecycledEvent = mNextRecycledEvent;
        mNextRecycledEvent = null;
        sRecycledCount -= 1;
        return localSettableCacheEvent;
      }
      return new SettableCacheEvent();
    }
  }
  
  private void reset()
  {
    mCacheKey = null;
    mResourceId = null;
    mItemSize = 0L;
    mCacheLimit = 0L;
    mCacheSize = 0L;
    mException = null;
    mEvictionReason = null;
  }
  
  @Nullable
  public CacheKey getCacheKey()
  {
    return mCacheKey;
  }
  
  public long getCacheLimit()
  {
    return mCacheLimit;
  }
  
  public long getCacheSize()
  {
    return mCacheSize;
  }
  
  @Nullable
  public CacheEventListener.EvictionReason getEvictionReason()
  {
    return mEvictionReason;
  }
  
  @Nullable
  public IOException getException()
  {
    return mException;
  }
  
  public long getItemSize()
  {
    return mItemSize;
  }
  
  @Nullable
  public String getResourceId()
  {
    return mResourceId;
  }
  
  public void recycle()
  {
    synchronized (RECYCLER_LOCK)
    {
      if (sRecycledCount < 5)
      {
        reset();
        sRecycledCount += 1;
        SettableCacheEvent localSettableCacheEvent = sFirstRecycledEvent;
        if (localSettableCacheEvent != null) {
          mNextRecycledEvent = localSettableCacheEvent;
        }
        sFirstRecycledEvent = this;
      }
      return;
    }
  }
  
  public SettableCacheEvent setCacheKey(CacheKey paramCacheKey)
  {
    mCacheKey = paramCacheKey;
    return this;
  }
  
  public SettableCacheEvent setCacheLimit(long paramLong)
  {
    mCacheLimit = paramLong;
    return this;
  }
  
  public SettableCacheEvent setCacheSize(long paramLong)
  {
    mCacheSize = paramLong;
    return this;
  }
  
  public SettableCacheEvent setEvictionReason(CacheEventListener.EvictionReason paramEvictionReason)
  {
    mEvictionReason = paramEvictionReason;
    return this;
  }
  
  public SettableCacheEvent setException(IOException paramIOException)
  {
    mException = paramIOException;
    return this;
  }
  
  public SettableCacheEvent setItemSize(long paramLong)
  {
    mItemSize = paramLong;
    return this;
  }
  
  public SettableCacheEvent setResourceId(String paramString)
  {
    mResourceId = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.facebook.cache.disk.SettableCacheEvent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */