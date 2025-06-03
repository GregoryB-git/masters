package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSink;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.TeeDataSource;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class CacheDataSource
  implements DataSource
{
  public static final int CACHE_IGNORED_REASON_ERROR = 0;
  public static final int CACHE_IGNORED_REASON_UNSET_LENGTH = 1;
  private static final int CACHE_NOT_IGNORED = -1;
  public static final long DEFAULT_MAX_CACHE_FILE_SIZE = 2097152L;
  public static final int FLAG_BLOCK_ON_CACHE = 1;
  public static final int FLAG_IGNORE_CACHE_FOR_UNSET_LENGTH_REQUESTS = 4;
  public static final int FLAG_IGNORE_CACHE_ON_ERROR = 2;
  private static final long MIN_READ_BEFORE_CHECKING_CACHE = 102400L;
  @Nullable
  private Uri actualUri;
  private final boolean blockOnCache;
  private long bytesRemaining;
  private final Cache cache;
  private final CacheKeyFactory cacheKeyFactory;
  private final DataSource cacheReadDataSource;
  @Nullable
  private final DataSource cacheWriteDataSource;
  private long checkCachePosition;
  @Nullable
  private DataSource currentDataSource;
  private boolean currentDataSpecLengthUnset;
  @Nullable
  private CacheSpan currentHoleSpan;
  private boolean currentRequestIgnoresCache;
  @Nullable
  private final EventListener eventListener;
  private int flags;
  private int httpMethod;
  private final boolean ignoreCacheForUnsetLengthRequests;
  private final boolean ignoreCacheOnError;
  @Nullable
  private String key;
  private long readPosition;
  private boolean seenCacheError;
  private long totalCachedBytesRead;
  private final DataSource upstreamDataSource;
  @Nullable
  private Uri uri;
  
  public CacheDataSource(Cache paramCache, DataSource paramDataSource)
  {
    this(paramCache, paramDataSource, 0, 2097152L);
  }
  
  public CacheDataSource(Cache paramCache, DataSource paramDataSource, int paramInt)
  {
    this(paramCache, paramDataSource, paramInt, 2097152L);
  }
  
  public CacheDataSource(Cache paramCache, DataSource paramDataSource, int paramInt, long paramLong)
  {
    this(paramCache, paramDataSource, new FileDataSource(), new CacheDataSink(paramCache, paramLong), paramInt, null);
  }
  
  public CacheDataSource(Cache paramCache, DataSource paramDataSource1, DataSource paramDataSource2, DataSink paramDataSink, int paramInt, @Nullable EventListener paramEventListener)
  {
    this(paramCache, paramDataSource1, paramDataSource2, paramDataSink, paramInt, paramEventListener, null);
  }
  
  public CacheDataSource(Cache paramCache, DataSource paramDataSource1, DataSource paramDataSource2, DataSink paramDataSink, int paramInt, @Nullable EventListener paramEventListener, @Nullable CacheKeyFactory paramCacheKeyFactory)
  {
    cache = paramCache;
    cacheReadDataSource = paramDataSource2;
    if (paramCacheKeyFactory == null) {
      paramCacheKeyFactory = CacheUtil.DEFAULT_CACHE_KEY_FACTORY;
    }
    cacheKeyFactory = paramCacheKeyFactory;
    boolean bool1 = false;
    if ((paramInt & 0x1) != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    blockOnCache = bool2;
    if ((paramInt & 0x2) != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    ignoreCacheOnError = bool2;
    boolean bool2 = bool1;
    if ((paramInt & 0x4) != 0) {
      bool2 = true;
    }
    ignoreCacheForUnsetLengthRequests = bool2;
    upstreamDataSource = paramDataSource1;
    if (paramDataSink != null) {
      cacheWriteDataSource = new TeeDataSource(paramDataSource1, paramDataSink);
    } else {
      cacheWriteDataSource = null;
    }
    eventListener = paramEventListener;
  }
  
  private void closeCurrentSource()
    throws IOException
  {
    Object localObject1 = currentDataSource;
    if (localObject1 == null) {
      return;
    }
    try
    {
      ((DataSource)localObject1).close();
      currentDataSource = null;
      currentDataSpecLengthUnset = false;
      localObject1 = currentHoleSpan;
      if (localObject1 != null)
      {
        cache.releaseHoleSpan((CacheSpan)localObject1);
        currentHoleSpan = null;
      }
      return;
    }
    finally
    {
      currentDataSource = null;
      currentDataSpecLengthUnset = false;
      CacheSpan localCacheSpan = currentHoleSpan;
      if (localCacheSpan != null)
      {
        cache.releaseHoleSpan(localCacheSpan);
        currentHoleSpan = null;
      }
    }
  }
  
  private static Uri getRedirectedUriOrDefault(Cache paramCache, String paramString, Uri paramUri)
  {
    paramCache = ContentMetadataInternal.getRedirectedUri(paramCache.getContentMetadata(paramString));
    if (paramCache != null) {
      paramUri = paramCache;
    }
    return paramUri;
  }
  
  private void handleBeforeThrow(IOException paramIOException)
  {
    if ((isReadingFromCache()) || ((paramIOException instanceof Cache.CacheException))) {
      seenCacheError = true;
    }
  }
  
  private boolean isBypassingCache()
  {
    boolean bool;
    if (currentDataSource == upstreamDataSource) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static boolean isCausedByPositionOutOfRange(IOException paramIOException)
  {
    while (paramIOException != null)
    {
      if (((paramIOException instanceof DataSourceException)) && (reason == 0)) {
        return true;
      }
      paramIOException = paramIOException.getCause();
    }
    return false;
  }
  
  private boolean isReadingFromCache()
  {
    boolean bool;
    if (currentDataSource == cacheReadDataSource) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private boolean isReadingFromUpstream()
  {
    return isReadingFromCache() ^ true;
  }
  
  private boolean isWritingToCache()
  {
    boolean bool;
    if (currentDataSource == cacheWriteDataSource) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void notifyBytesRead()
  {
    EventListener localEventListener = eventListener;
    if ((localEventListener != null) && (totalCachedBytesRead > 0L))
    {
      localEventListener.onCachedBytesRead(cache.getCacheSpace(), totalCachedBytesRead);
      totalCachedBytesRead = 0L;
    }
  }
  
  private void notifyCacheIgnored(int paramInt)
  {
    EventListener localEventListener = eventListener;
    if (localEventListener != null) {
      localEventListener.onCacheIgnored(paramInt);
    }
  }
  
  private void openNextSource(boolean paramBoolean)
    throws IOException
  {
    CacheSpan localCacheSpan;
    Object localObject1;
    if (currentRequestIgnoresCache) {
      localCacheSpan = null;
    } else if (blockOnCache) {
      try
      {
        localCacheSpan = cache.startReadWrite(key, readPosition);
      }
      catch (InterruptedException localInterruptedException)
      {
        Thread.currentThread().interrupt();
        throw new InterruptedIOException();
      }
    } else {
      localObject1 = cache.startReadWriteNonBlocking(key, readPosition);
    }
    if (localObject1 == null)
    {
      localObject2 = upstreamDataSource;
      localObject3 = uri;
      i = httpMethod;
      l1 = readPosition;
      localObject3 = new DataSpec((Uri)localObject3, i, null, l1, l1, bytesRemaining, key, flags);
    }
    Object localObject4;
    long l2;
    for (;;)
    {
      localObject4 = localObject1;
      localObject1 = localObject3;
      localObject3 = localObject4;
      break label387;
      if (!isCached) {
        break;
      }
      localObject2 = Uri.fromFile(file);
      l2 = readPosition - position;
      l3 = length - l2;
      long l4 = bytesRemaining;
      l1 = l3;
      if (l4 != -1L) {
        l1 = Math.min(l3, l4);
      }
      localObject3 = new DataSpec((Uri)localObject2, readPosition, l2, l1, key, flags);
      localObject2 = cacheReadDataSource;
    }
    if (((CacheSpan)localObject1).isOpenEnded())
    {
      l1 = bytesRemaining;
    }
    else
    {
      l3 = length;
      l2 = bytesRemaining;
      l1 = l3;
      if (l2 != -1L) {
        l1 = Math.min(l3, l2);
      }
    }
    Object localObject2 = uri;
    int i = httpMethod;
    long l3 = readPosition;
    localObject2 = new DataSpec((Uri)localObject2, i, null, l3, l3, l1, key, flags);
    Object localObject3 = cacheWriteDataSource;
    if (localObject3 != null)
    {
      localObject4 = localObject1;
      localObject1 = localObject2;
      localObject2 = localObject3;
      localObject3 = localObject4;
    }
    else
    {
      localObject3 = upstreamDataSource;
      cache.releaseHoleSpan((CacheSpan)localObject1);
      localObject1 = localObject2;
      localObject4 = null;
      localObject2 = localObject3;
      localObject3 = localObject4;
    }
    label387:
    if ((!currentRequestIgnoresCache) && (localObject2 == upstreamDataSource)) {
      l1 = readPosition + 102400L;
    } else {
      l1 = Long.MAX_VALUE;
    }
    checkCachePosition = l1;
    if (paramBoolean)
    {
      Assertions.checkState(isBypassingCache());
      if (localObject2 == upstreamDataSource) {
        return;
      }
    }
    try
    {
      closeCurrentSource();
    }
    finally
    {
      if (((CacheSpan)localObject3).isHoleSpan()) {
        cache.releaseHoleSpan((CacheSpan)localObject3);
      }
    }
    currentHoleSpan = ((CacheSpan)localObject3);
    currentDataSource = ((DataSource)localObject2);
    if (length == -1L) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    currentDataSpecLengthUnset = paramBoolean;
    long l1 = ((DataSource)localObject2).open(localDataSpec);
    ContentMetadataMutations localContentMetadataMutations = new ContentMetadataMutations();
    if ((currentDataSpecLengthUnset) && (l1 != -1L))
    {
      bytesRemaining = l1;
      ContentMetadataInternal.setContentLength(localContentMetadataMutations, readPosition + l1);
    }
    if (isReadingFromUpstream())
    {
      localObject2 = currentDataSource.getUri();
      actualUri = ((Uri)localObject2);
      if ((uri.equals(localObject2) ^ true)) {
        ContentMetadataInternal.setRedirectedUri(localContentMetadataMutations, actualUri);
      } else {
        ContentMetadataInternal.removeRedirectedUri(localContentMetadataMutations);
      }
    }
    if (isWritingToCache()) {
      cache.applyContentMetadataMutations(key, localContentMetadataMutations);
    }
  }
  
  private void setNoBytesRemainingAndMaybeStoreLength()
    throws IOException
  {
    bytesRemaining = 0L;
    if (isWritingToCache()) {
      cache.setContentLength(key, readPosition);
    }
  }
  
  private int shouldIgnoreCacheForRequest(DataSpec paramDataSpec)
  {
    if ((ignoreCacheOnError) && (seenCacheError)) {
      return 0;
    }
    if ((ignoreCacheForUnsetLengthRequests) && (length == -1L)) {
      return 1;
    }
    return -1;
  }
  
  public void addTransferListener(TransferListener paramTransferListener)
  {
    cacheReadDataSource.addTransferListener(paramTransferListener);
    upstreamDataSource.addTransferListener(paramTransferListener);
  }
  
  public void close()
    throws IOException
  {
    uri = null;
    actualUri = null;
    httpMethod = 1;
    notifyBytesRead();
    try
    {
      closeCurrentSource();
      return;
    }
    catch (IOException localIOException)
    {
      handleBeforeThrow(localIOException);
      throw localIOException;
    }
  }
  
  public Map<String, List<String>> getResponseHeaders()
  {
    Map localMap;
    if (isReadingFromUpstream()) {
      localMap = upstreamDataSource.getResponseHeaders();
    } else {
      localMap = Collections.emptyMap();
    }
    return localMap;
  }
  
  @Nullable
  public Uri getUri()
  {
    return actualUri;
  }
  
  public long open(DataSpec paramDataSpec)
    throws IOException
  {
    try
    {
      String str = cacheKeyFactory.buildCacheKey(paramDataSpec);
      key = str;
      Uri localUri = uri;
      uri = localUri;
      actualUri = getRedirectedUriOrDefault(cache, str, localUri);
      httpMethod = httpMethod;
      flags = flags;
      readPosition = position;
      int i = shouldIgnoreCacheForRequest(paramDataSpec);
      boolean bool;
      if (i != -1) {
        bool = true;
      } else {
        bool = false;
      }
      currentRequestIgnoresCache = bool;
      if (bool) {
        notifyCacheIgnored(i);
      }
      long l = length;
      if ((l == -1L) && (!currentRequestIgnoresCache))
      {
        l = cache.getContentLength(key);
        bytesRemaining = l;
        if (l != -1L)
        {
          l -= position;
          bytesRemaining = l;
          if (l <= 0L)
          {
            paramDataSpec = new com/google/android/exoplayer2/upstream/DataSourceException;
            paramDataSpec.<init>(0);
            throw paramDataSpec;
          }
        }
      }
      else
      {
        bytesRemaining = l;
      }
      openNextSource(false);
      l = bytesRemaining;
      return l;
    }
    catch (IOException paramDataSpec)
    {
      handleBeforeThrow(paramDataSpec);
      throw paramDataSpec;
    }
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    if (paramInt2 == 0) {
      return 0;
    }
    if (bytesRemaining == 0L) {
      return -1;
    }
    try
    {
      if (readPosition >= checkCachePosition) {
        openNextSource(true);
      }
      int i = currentDataSource.read(paramArrayOfByte, paramInt1, paramInt2);
      long l2;
      if (i != -1)
      {
        if (isReadingFromCache()) {
          totalCachedBytesRead += i;
        }
        long l1 = readPosition;
        l2 = i;
        readPosition = (l1 + l2);
        l1 = bytesRemaining;
        if (l1 != -1L) {
          bytesRemaining = (l1 - l2);
        }
      }
      else if (currentDataSpecLengthUnset)
      {
        setNoBytesRemainingAndMaybeStoreLength();
      }
      else
      {
        l2 = bytesRemaining;
        if ((l2 > 0L) || (l2 == -1L)) {
          break label162;
        }
      }
      return i;
      label162:
      closeCurrentSource();
      openNextSource(false);
      paramInt1 = read(paramArrayOfByte, paramInt1, paramInt2);
      return paramInt1;
    }
    catch (IOException paramArrayOfByte)
    {
      if ((currentDataSpecLengthUnset) && (isCausedByPositionOutOfRange(paramArrayOfByte)))
      {
        setNoBytesRemainingAndMaybeStoreLength();
        return -1;
      }
      handleBeforeThrow(paramArrayOfByte);
      throw paramArrayOfByte;
    }
  }
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface CacheIgnoredReason {}
  
  public static abstract interface EventListener
  {
    public abstract void onCacheIgnored(int paramInt);
    
    public abstract void onCachedBytesRead(long paramLong1, long paramLong2);
  }
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface Flags {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.cache.CacheDataSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */