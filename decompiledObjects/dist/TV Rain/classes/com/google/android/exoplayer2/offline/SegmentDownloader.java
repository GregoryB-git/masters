package com.google.android.exoplayer2.offline;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheUtil;
import com.google.android.exoplayer2.upstream.cache.CacheUtil.CachingCounters;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class SegmentDownloader<M extends FilterableManifest<M>>
  implements Downloader
{
  private static final int BUFFER_SIZE_BYTES = 131072;
  private final Cache cache;
  private final CacheDataSource dataSource;
  private volatile long downloadedBytes;
  private volatile int downloadedSegments;
  private final AtomicBoolean isCanceled;
  private final Uri manifestUri;
  private final CacheDataSource offlineDataSource;
  private final PriorityTaskManager priorityTaskManager;
  private final ArrayList<StreamKey> streamKeys;
  private volatile int totalSegments;
  
  public SegmentDownloader(Uri paramUri, List<StreamKey> paramList, DownloaderConstructorHelper paramDownloaderConstructorHelper)
  {
    manifestUri = paramUri;
    streamKeys = new ArrayList(paramList);
    cache = paramDownloaderConstructorHelper.getCache();
    dataSource = paramDownloaderConstructorHelper.buildCacheDataSource(false);
    offlineDataSource = paramDownloaderConstructorHelper.buildCacheDataSource(true);
    priorityTaskManager = paramDownloaderConstructorHelper.getPriorityTaskManager();
    totalSegments = -1;
    isCanceled = new AtomicBoolean();
  }
  
  private List<Segment> initDownload()
    throws IOException, InterruptedException
  {
    Object localObject1 = getManifest(dataSource, manifestUri);
    Object localObject2 = localObject1;
    if (!streamKeys.isEmpty()) {
      localObject2 = (FilterableManifest)((FilterableManifest)localObject1).copy(streamKeys);
    }
    localObject1 = getSegments(dataSource, (FilterableManifest)localObject2, false);
    localObject2 = new CacheUtil.CachingCounters();
    totalSegments = ((List)localObject1).size();
    downloadedSegments = 0;
    downloadedBytes = 0L;
    for (int i = ((List)localObject1).size() - 1; i >= 0; i--)
    {
      CacheUtil.getCached(getdataSpec, cache, (CacheUtil.CachingCounters)localObject2);
      downloadedBytes += alreadyCachedBytes;
      if (alreadyCachedBytes == contentLength)
      {
        downloadedSegments += 1;
        ((List)localObject1).remove(i);
      }
    }
    return (List<Segment>)localObject1;
  }
  
  private void removeUri(Uri paramUri)
  {
    CacheUtil.remove(cache, CacheUtil.generateKey(paramUri));
  }
  
  public void cancel()
  {
    isCanceled.set(true);
  }
  
  /* Error */
  public final void download()
    throws IOException, InterruptedException
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 67	com/google/android/exoplayer2/offline/SegmentDownloader:priorityTaskManager	Lcom/google/android/exoplayer2/util/PriorityTaskManager;
    //   4: sipush 64536
    //   7: invokevirtual 160	com/google/android/exoplayer2/util/PriorityTaskManager:add	(I)V
    //   10: aload_0
    //   11: invokespecial 162	com/google/android/exoplayer2/offline/SegmentDownloader:initDownload	()Ljava/util/List;
    //   14: astore_1
    //   15: aload_1
    //   16: invokestatic 168	java/util/Collections:sort	(Ljava/util/List;)V
    //   19: ldc 13
    //   21: newarray <illegal type>
    //   23: astore_2
    //   24: new 103	com/google/android/exoplayer2/upstream/cache/CacheUtil$CachingCounters
    //   27: astore_3
    //   28: aload_3
    //   29: invokespecial 104	com/google/android/exoplayer2/upstream/cache/CacheUtil$CachingCounters:<init>	()V
    //   32: iconst_0
    //   33: istore 4
    //   35: aload_1
    //   36: invokeinterface 110 1 0
    //   41: istore 5
    //   43: iload 4
    //   45: iload 5
    //   47: if_icmpge +87 -> 134
    //   50: aload_1
    //   51: iload 4
    //   53: invokeinterface 118 2 0
    //   58: checkcast 9	com/google/android/exoplayer2/offline/SegmentDownloader$Segment
    //   61: getfield 122	com/google/android/exoplayer2/offline/SegmentDownloader$Segment:dataSpec	Lcom/google/android/exoplayer2/upstream/DataSpec;
    //   64: aload_0
    //   65: getfield 53	com/google/android/exoplayer2/offline/SegmentDownloader:cache	Lcom/google/android/exoplayer2/upstream/cache/Cache;
    //   68: aload_0
    //   69: getfield 59	com/google/android/exoplayer2/offline/SegmentDownloader:dataSource	Lcom/google/android/exoplayer2/upstream/cache/CacheDataSource;
    //   72: aload_2
    //   73: aload_0
    //   74: getfield 67	com/google/android/exoplayer2/offline/SegmentDownloader:priorityTaskManager	Lcom/google/android/exoplayer2/util/PriorityTaskManager;
    //   77: sipush 64536
    //   80: aload_3
    //   81: aload_0
    //   82: getfield 74	com/google/android/exoplayer2/offline/SegmentDownloader:isCanceled	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   85: iconst_1
    //   86: invokestatic 171	com/google/android/exoplayer2/upstream/cache/CacheUtil:cache	(Lcom/google/android/exoplayer2/upstream/DataSpec;Lcom/google/android/exoplayer2/upstream/cache/Cache;Lcom/google/android/exoplayer2/upstream/cache/CacheDataSource;[BLcom/google/android/exoplayer2/util/PriorityTaskManager;ILcom/google/android/exoplayer2/upstream/cache/CacheUtil$CachingCounters;Ljava/util/concurrent/atomic/AtomicBoolean;Z)V
    //   89: aload_0
    //   90: aload_0
    //   91: getfield 112	com/google/android/exoplayer2/offline/SegmentDownloader:downloadedSegments	I
    //   94: iconst_1
    //   95: iadd
    //   96: putfield 112	com/google/android/exoplayer2/offline/SegmentDownloader:downloadedSegments	I
    //   99: aload_0
    //   100: aload_0
    //   101: getfield 114	com/google/android/exoplayer2/offline/SegmentDownloader:downloadedBytes	J
    //   104: aload_3
    //   105: getfield 174	com/google/android/exoplayer2/upstream/cache/CacheUtil$CachingCounters:newlyCachedBytes	J
    //   108: ladd
    //   109: putfield 114	com/google/android/exoplayer2/offline/SegmentDownloader:downloadedBytes	J
    //   112: iinc 4 1
    //   115: goto -80 -> 35
    //   118: astore_1
    //   119: aload_0
    //   120: aload_0
    //   121: getfield 114	com/google/android/exoplayer2/offline/SegmentDownloader:downloadedBytes	J
    //   124: aload_3
    //   125: getfield 174	com/google/android/exoplayer2/upstream/cache/CacheUtil$CachingCounters:newlyCachedBytes	J
    //   128: ladd
    //   129: putfield 114	com/google/android/exoplayer2/offline/SegmentDownloader:downloadedBytes	J
    //   132: aload_1
    //   133: athrow
    //   134: aload_0
    //   135: getfield 67	com/google/android/exoplayer2/offline/SegmentDownloader:priorityTaskManager	Lcom/google/android/exoplayer2/util/PriorityTaskManager;
    //   138: sipush 64536
    //   141: invokevirtual 176	com/google/android/exoplayer2/util/PriorityTaskManager:remove	(I)V
    //   144: return
    //   145: astore_3
    //   146: aload_0
    //   147: getfield 67	com/google/android/exoplayer2/offline/SegmentDownloader:priorityTaskManager	Lcom/google/android/exoplayer2/util/PriorityTaskManager;
    //   150: sipush 64536
    //   153: invokevirtual 176	com/google/android/exoplayer2/util/PriorityTaskManager:remove	(I)V
    //   156: aload_3
    //   157: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	158	0	this	SegmentDownloader
    //   14	37	1	localList	List
    //   118	15	1	localObject1	Object
    //   23	50	2	arrayOfByte	byte[]
    //   27	98	3	localCachingCounters	CacheUtil.CachingCounters
    //   145	12	3	localObject2	Object
    //   33	80	4	i	int
    //   41	7	5	j	int
    // Exception table:
    //   from	to	target	type
    //   50	99	118	finally
    //   10	32	145	finally
    //   35	43	145	finally
    //   99	112	145	finally
    //   119	134	145	finally
  }
  
  public final float getDownloadPercentage()
  {
    int i = totalSegments;
    int j = downloadedSegments;
    if ((i != -1) && (j != -1))
    {
      float f = 100.0F;
      if (i != 0) {
        f = j * 100.0F / i;
      }
      return f;
    }
    return -1.0F;
  }
  
  public final long getDownloadedBytes()
  {
    return downloadedBytes;
  }
  
  public abstract M getManifest(DataSource paramDataSource, Uri paramUri)
    throws IOException;
  
  public abstract List<Segment> getSegments(DataSource paramDataSource, M paramM, boolean paramBoolean)
    throws InterruptedException, IOException;
  
  /* Error */
  public final void remove()
    throws InterruptedException
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: getfield 61	com/google/android/exoplayer2/offline/SegmentDownloader:offlineDataSource	Lcom/google/android/exoplayer2/upstream/cache/CacheDataSource;
    //   5: aload_0
    //   6: getfield 38	com/google/android/exoplayer2/offline/SegmentDownloader:manifestUri	Landroid/net/Uri;
    //   9: invokevirtual 87	com/google/android/exoplayer2/offline/SegmentDownloader:getManifest	(Lcom/google/android/exoplayer2/upstream/DataSource;Landroid/net/Uri;)Lcom/google/android/exoplayer2/offline/FilterableManifest;
    //   12: astore_1
    //   13: aload_0
    //   14: aload_0
    //   15: getfield 61	com/google/android/exoplayer2/offline/SegmentDownloader:offlineDataSource	Lcom/google/android/exoplayer2/upstream/cache/CacheDataSource;
    //   18: aload_1
    //   19: iconst_1
    //   20: invokevirtual 101	com/google/android/exoplayer2/offline/SegmentDownloader:getSegments	(Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/offline/FilterableManifest;Z)Ljava/util/List;
    //   23: astore_1
    //   24: iconst_0
    //   25: istore_2
    //   26: iload_2
    //   27: aload_1
    //   28: invokeinterface 110 1 0
    //   33: if_icmpge +40 -> 73
    //   36: aload_0
    //   37: aload_1
    //   38: iload_2
    //   39: invokeinterface 118 2 0
    //   44: checkcast 9	com/google/android/exoplayer2/offline/SegmentDownloader$Segment
    //   47: getfield 122	com/google/android/exoplayer2/offline/SegmentDownloader$Segment:dataSpec	Lcom/google/android/exoplayer2/upstream/DataSpec;
    //   50: getfield 187	com/google/android/exoplayer2/upstream/DataSpec:uri	Landroid/net/Uri;
    //   53: invokespecial 189	com/google/android/exoplayer2/offline/SegmentDownloader:removeUri	(Landroid/net/Uri;)V
    //   56: iinc 2 1
    //   59: goto -33 -> 26
    //   62: astore_1
    //   63: aload_0
    //   64: aload_0
    //   65: getfield 38	com/google/android/exoplayer2/offline/SegmentDownloader:manifestUri	Landroid/net/Uri;
    //   68: invokespecial 189	com/google/android/exoplayer2/offline/SegmentDownloader:removeUri	(Landroid/net/Uri;)V
    //   71: aload_1
    //   72: athrow
    //   73: aload_0
    //   74: aload_0
    //   75: getfield 38	com/google/android/exoplayer2/offline/SegmentDownloader:manifestUri	Landroid/net/Uri;
    //   78: invokespecial 189	com/google/android/exoplayer2/offline/SegmentDownloader:removeUri	(Landroid/net/Uri;)V
    //   81: return
    //   82: astore_1
    //   83: goto -10 -> 73
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	86	0	this	SegmentDownloader
    //   12	26	1	localObject1	Object
    //   62	10	1	localObject2	Object
    //   82	1	1	localIOException	IOException
    //   25	32	2	i	int
    // Exception table:
    //   from	to	target	type
    //   0	24	62	finally
    //   26	56	62	finally
    //   0	24	82	java/io/IOException
    //   26	56	82	java/io/IOException
  }
  
  public static class Segment
    implements Comparable<Segment>
  {
    public final DataSpec dataSpec;
    public final long startTimeUs;
    
    public Segment(long paramLong, DataSpec paramDataSpec)
    {
      startTimeUs = paramLong;
      dataSpec = paramDataSpec;
    }
    
    public int compareTo(@NonNull Segment paramSegment)
    {
      return Util.compareLong(startTimeUs, startTimeUs);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.offline.SegmentDownloader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */