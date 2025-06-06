package com.google.android.exoplayer2.offline;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheUtil;
import com.google.android.exoplayer2.upstream.cache.CacheUtil.CachingCounters;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ProgressiveDownloader
  implements Downloader
{
  private static final int BUFFER_SIZE_BYTES = 131072;
  private final Cache cache;
  private final CacheUtil.CachingCounters cachingCounters;
  private final CacheDataSource dataSource;
  private final DataSpec dataSpec;
  private final AtomicBoolean isCanceled;
  private final PriorityTaskManager priorityTaskManager;
  
  public ProgressiveDownloader(Uri paramUri, String paramString, DownloaderConstructorHelper paramDownloaderConstructorHelper)
  {
    dataSpec = new DataSpec(paramUri, 0L, -1L, paramString, 0);
    cache = paramDownloaderConstructorHelper.getCache();
    dataSource = paramDownloaderConstructorHelper.buildCacheDataSource(false);
    priorityTaskManager = paramDownloaderConstructorHelper.getPriorityTaskManager();
    cachingCounters = new CacheUtil.CachingCounters();
    isCanceled = new AtomicBoolean();
  }
  
  public void cancel()
  {
    isCanceled.set(true);
  }
  
  public void download()
    throws InterruptedException, IOException
  {
    priorityTaskManager.add(64536);
    try
    {
      CacheUtil.cache(dataSpec, cache, dataSource, new byte[131072], priorityTaskManager, 64536, cachingCounters, isCanceled, true);
      return;
    }
    finally
    {
      priorityTaskManager.remove(64536);
    }
  }
  
  public float getDownloadPercentage()
  {
    long l = cachingCounters.contentLength;
    float f;
    if (l == -1L) {
      f = -1.0F;
    } else {
      f = (float)cachingCounters.totalCachedBytes() * 100.0F / (float)l;
    }
    return f;
  }
  
  public long getDownloadedBytes()
  {
    return cachingCounters.totalCachedBytes();
  }
  
  public void remove()
  {
    CacheUtil.remove(cache, CacheUtil.getKey(dataSpec));
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.offline.ProgressiveDownloader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */