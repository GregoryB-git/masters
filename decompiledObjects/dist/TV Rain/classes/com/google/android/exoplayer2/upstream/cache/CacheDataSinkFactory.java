package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.DataSink;
import com.google.android.exoplayer2.upstream.DataSink.Factory;

public final class CacheDataSinkFactory
  implements DataSink.Factory
{
  private final int bufferSize;
  private final Cache cache;
  private final long maxCacheFileSize;
  
  public CacheDataSinkFactory(Cache paramCache, long paramLong)
  {
    this(paramCache, paramLong, 20480);
  }
  
  public CacheDataSinkFactory(Cache paramCache, long paramLong, int paramInt)
  {
    cache = paramCache;
    maxCacheFileSize = paramLong;
    bufferSize = paramInt;
  }
  
  public DataSink createDataSink()
  {
    return new CacheDataSink(cache, maxCacheFileSize, bufferSize);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.cache.CacheDataSinkFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */