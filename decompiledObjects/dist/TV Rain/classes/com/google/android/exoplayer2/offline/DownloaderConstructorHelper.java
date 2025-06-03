package com.google.android.exoplayer2.offline;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSink;
import com.google.android.exoplayer2.upstream.DataSink.Factory;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSource.Factory;
import com.google.android.exoplayer2.upstream.DummyDataSource;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.PriorityDataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.PriorityTaskManager;

public final class DownloaderConstructorHelper
{
  private final Cache cache;
  private final DataSource.Factory cacheReadDataSourceFactory;
  private final DataSink.Factory cacheWriteDataSinkFactory;
  private final PriorityTaskManager priorityTaskManager;
  private final DataSource.Factory upstreamDataSourceFactory;
  
  public DownloaderConstructorHelper(Cache paramCache, DataSource.Factory paramFactory)
  {
    this(paramCache, paramFactory, null, null, null);
  }
  
  public DownloaderConstructorHelper(Cache paramCache, DataSource.Factory paramFactory1, @Nullable DataSource.Factory paramFactory2, @Nullable DataSink.Factory paramFactory, @Nullable PriorityTaskManager paramPriorityTaskManager)
  {
    Assertions.checkNotNull(paramFactory1);
    cache = paramCache;
    upstreamDataSourceFactory = paramFactory1;
    cacheReadDataSourceFactory = paramFactory2;
    cacheWriteDataSinkFactory = paramFactory;
    priorityTaskManager = paramPriorityTaskManager;
  }
  
  public CacheDataSource buildCacheDataSource(boolean paramBoolean)
  {
    Object localObject1 = cacheReadDataSourceFactory;
    if (localObject1 != null) {
      localObject1 = ((DataSource.Factory)localObject1).createDataSource();
    } else {
      localObject1 = new FileDataSource();
    }
    if (paramBoolean) {
      return new CacheDataSource(cache, DummyDataSource.INSTANCE, (DataSource)localObject1, null, 1, null);
    }
    Object localObject2 = cacheWriteDataSinkFactory;
    if (localObject2 != null) {
      localObject2 = ((DataSink.Factory)localObject2).createDataSink();
    } else {
      localObject2 = new CacheDataSink(cache, 2097152L);
    }
    Object localObject3 = upstreamDataSourceFactory.createDataSource();
    PriorityTaskManager localPriorityTaskManager = priorityTaskManager;
    if (localPriorityTaskManager != null) {
      localObject3 = new PriorityDataSource((DataSource)localObject3, localPriorityTaskManager, 64536);
    }
    return new CacheDataSource(cache, (DataSource)localObject3, (DataSource)localObject1, (DataSink)localObject2, 1, null);
  }
  
  public Cache getCache()
  {
    return cache;
  }
  
  public PriorityTaskManager getPriorityTaskManager()
  {
    PriorityTaskManager localPriorityTaskManager = priorityTaskManager;
    if (localPriorityTaskManager == null) {
      localPriorityTaskManager = new PriorityTaskManager();
    }
    return localPriorityTaskManager;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.offline.DownloaderConstructorHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */