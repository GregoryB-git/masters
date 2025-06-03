package com.facebook.imagepipeline.core;

import android.net.Uri;
import bolts.Continuation;
import bolts.Task;
import com.android.internal.util.Predicate;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Objects.ToStringHelper;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.util.UriUtil;
import com.facebook.datasource.DataSource;
import com.facebook.datasource.DataSources;
import com.facebook.datasource.SimpleDataSource;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.datasource.CloseableProducerToDataSourceAdapter;
import com.facebook.imagepipeline.datasource.ProducerToDataSourceAdapter;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.listener.ForwardingRequestListener;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.producers.Producer;
import com.facebook.imagepipeline.producers.SettableProducerContext;
import com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequest.CacheChoice;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class ImagePipeline
{
  private static final CancellationException PREFETCH_EXCEPTION = new CancellationException("Prefetching is not enabled");
  private final MemoryCache<CacheKey, CloseableImage> mBitmapMemoryCache;
  private final CacheKeyFactory mCacheKeyFactory;
  private final MemoryCache<CacheKey, PooledByteBuffer> mEncodedMemoryCache;
  private AtomicLong mIdCounter = new AtomicLong();
  private final Supplier<Boolean> mIsPrefetchEnabledSupplier;
  private final BufferedDiskCache mMainBufferedDiskCache;
  private final ProducerSequenceFactory mProducerSequenceFactory;
  private final RequestListener mRequestListener;
  private final BufferedDiskCache mSmallImageBufferedDiskCache;
  private final Supplier<Boolean> mSuppressBitmapPrefetchingSupplier;
  private final ThreadHandoffProducerQueue mThreadHandoffProducerQueue;
  
  public ImagePipeline(ProducerSequenceFactory paramProducerSequenceFactory, Set<RequestListener> paramSet, Supplier<Boolean> paramSupplier1, MemoryCache<CacheKey, CloseableImage> paramMemoryCache, MemoryCache<CacheKey, PooledByteBuffer> paramMemoryCache1, BufferedDiskCache paramBufferedDiskCache1, BufferedDiskCache paramBufferedDiskCache2, CacheKeyFactory paramCacheKeyFactory, ThreadHandoffProducerQueue paramThreadHandoffProducerQueue, Supplier<Boolean> paramSupplier2)
  {
    mProducerSequenceFactory = paramProducerSequenceFactory;
    mRequestListener = new ForwardingRequestListener(paramSet);
    mIsPrefetchEnabledSupplier = paramSupplier1;
    mBitmapMemoryCache = paramMemoryCache;
    mEncodedMemoryCache = paramMemoryCache1;
    mMainBufferedDiskCache = paramBufferedDiskCache1;
    mSmallImageBufferedDiskCache = paramBufferedDiskCache2;
    mCacheKeyFactory = paramCacheKeyFactory;
    mThreadHandoffProducerQueue = paramThreadHandoffProducerQueue;
    mSuppressBitmapPrefetchingSupplier = paramSupplier2;
  }
  
  private String generateUniqueFutureId()
  {
    return String.valueOf(mIdCounter.getAndIncrement());
  }
  
  private RequestListener getRequestListenerForRequest(ImageRequest paramImageRequest)
  {
    if (paramImageRequest.getRequestListener() == null) {
      return mRequestListener;
    }
    return new ForwardingRequestListener(new RequestListener[] { mRequestListener, paramImageRequest.getRequestListener() });
  }
  
  private Predicate<CacheKey> predicateForUri(final Uri paramUri)
  {
    new Predicate()
    {
      public boolean apply(CacheKey paramAnonymousCacheKey)
      {
        return paramAnonymousCacheKey.containsUri(paramUri);
      }
    };
  }
  
  private <T> DataSource<CloseableReference<T>> submitFetchRequest(Producer<CloseableReference<T>> paramProducer, ImageRequest paramImageRequest, ImageRequest.RequestLevel paramRequestLevel, Object paramObject)
  {
    RequestListener localRequestListener = getRequestListenerForRequest(paramImageRequest);
    try
    {
      paramRequestLevel = ImageRequest.RequestLevel.getMax(paramImageRequest.getLowestPermittedRequestLevel(), paramRequestLevel);
      SettableProducerContext localSettableProducerContext = new com/facebook/imagepipeline/producers/SettableProducerContext;
      String str = generateUniqueFutureId();
      boolean bool;
      if ((!paramImageRequest.getProgressiveRenderingEnabled()) && (paramImageRequest.getMediaVariations() == null) && (UriUtil.isNetworkUri(paramImageRequest.getSourceUri()))) {
        bool = false;
      } else {
        bool = true;
      }
      localSettableProducerContext.<init>(paramImageRequest, str, localRequestListener, paramObject, paramRequestLevel, false, bool, paramImageRequest.getPriority());
      paramProducer = CloseableProducerToDataSourceAdapter.create(paramProducer, localSettableProducerContext, localRequestListener);
      return paramProducer;
    }
    catch (Exception paramProducer) {}
    return DataSources.immediateFailedDataSource(paramProducer);
  }
  
  private DataSource<Void> submitPrefetchRequest(Producer<Void> paramProducer, ImageRequest paramImageRequest, ImageRequest.RequestLevel paramRequestLevel, Object paramObject, Priority paramPriority)
  {
    RequestListener localRequestListener = getRequestListenerForRequest(paramImageRequest);
    try
    {
      paramRequestLevel = ImageRequest.RequestLevel.getMax(paramImageRequest.getLowestPermittedRequestLevel(), paramRequestLevel);
      SettableProducerContext localSettableProducerContext = new com/facebook/imagepipeline/producers/SettableProducerContext;
      localSettableProducerContext.<init>(paramImageRequest, generateUniqueFutureId(), localRequestListener, paramObject, paramRequestLevel, true, false, paramPriority);
      paramProducer = ProducerToDataSourceAdapter.create(paramProducer, localSettableProducerContext, localRequestListener);
      return paramProducer;
    }
    catch (Exception paramProducer) {}
    return DataSources.immediateFailedDataSource(paramProducer);
  }
  
  public void clearCaches()
  {
    clearMemoryCaches();
    clearDiskCaches();
  }
  
  public void clearDiskCaches()
  {
    mMainBufferedDiskCache.clearAll();
    mSmallImageBufferedDiskCache.clearAll();
  }
  
  public void clearMemoryCaches()
  {
    Predicate local3 = new Predicate()
    {
      public boolean apply(CacheKey paramAnonymousCacheKey)
      {
        return true;
      }
    };
    mBitmapMemoryCache.removeAll(local3);
    mEncodedMemoryCache.removeAll(local3);
  }
  
  public void evictFromCache(Uri paramUri)
  {
    evictFromMemoryCache(paramUri);
    evictFromDiskCache(paramUri);
  }
  
  public void evictFromDiskCache(Uri paramUri)
  {
    evictFromDiskCache(ImageRequest.fromUri(paramUri));
  }
  
  public void evictFromDiskCache(ImageRequest paramImageRequest)
  {
    paramImageRequest = mCacheKeyFactory.getEncodedCacheKey(paramImageRequest, null);
    mMainBufferedDiskCache.remove(paramImageRequest);
    mSmallImageBufferedDiskCache.remove(paramImageRequest);
  }
  
  public void evictFromMemoryCache(Uri paramUri)
  {
    paramUri = predicateForUri(paramUri);
    mBitmapMemoryCache.removeAll(paramUri);
    mEncodedMemoryCache.removeAll(paramUri);
  }
  
  public DataSource<CloseableReference<CloseableImage>> fetchDecodedImage(ImageRequest paramImageRequest, Object paramObject)
  {
    return fetchDecodedImage(paramImageRequest, paramObject, ImageRequest.RequestLevel.FULL_FETCH);
  }
  
  public DataSource<CloseableReference<CloseableImage>> fetchDecodedImage(ImageRequest paramImageRequest, Object paramObject, ImageRequest.RequestLevel paramRequestLevel)
  {
    try
    {
      paramImageRequest = submitFetchRequest(mProducerSequenceFactory.getDecodedImageProducerSequence(paramImageRequest), paramImageRequest, paramRequestLevel, paramObject);
      return paramImageRequest;
    }
    catch (Exception paramImageRequest) {}
    return DataSources.immediateFailedDataSource(paramImageRequest);
  }
  
  public DataSource<CloseableReference<PooledByteBuffer>> fetchEncodedImage(ImageRequest paramImageRequest, Object paramObject)
  {
    Preconditions.checkNotNull(paramImageRequest.getSourceUri());
    try
    {
      Producer localProducer = mProducerSequenceFactory.getEncodedImageProducerSequence(paramImageRequest);
      ImageRequest localImageRequest = paramImageRequest;
      if (paramImageRequest.getResizeOptions() != null) {
        localImageRequest = ImageRequestBuilder.fromRequest(paramImageRequest).setResizeOptions(null).build();
      }
      paramImageRequest = submitFetchRequest(localProducer, localImageRequest, ImageRequest.RequestLevel.FULL_FETCH, paramObject);
      return paramImageRequest;
    }
    catch (Exception paramImageRequest) {}
    return DataSources.immediateFailedDataSource(paramImageRequest);
  }
  
  public DataSource<CloseableReference<CloseableImage>> fetchImageFromBitmapCache(ImageRequest paramImageRequest, Object paramObject)
  {
    return fetchDecodedImage(paramImageRequest, paramObject, ImageRequest.RequestLevel.BITMAP_MEMORY_CACHE);
  }
  
  public MemoryCache<CacheKey, CloseableImage> getBitmapMemoryCache()
  {
    return mBitmapMemoryCache;
  }
  
  public CacheKeyFactory getCacheKeyFactory()
  {
    return mCacheKeyFactory;
  }
  
  public Supplier<DataSource<CloseableReference<CloseableImage>>> getDataSourceSupplier(final ImageRequest paramImageRequest, final Object paramObject, final ImageRequest.RequestLevel paramRequestLevel)
  {
    new Supplier()
    {
      public DataSource<CloseableReference<CloseableImage>> get()
      {
        return fetchDecodedImage(paramImageRequest, paramObject, paramRequestLevel);
      }
      
      public String toString()
      {
        return Objects.toStringHelper(this).add("uri", paramImageRequest.getSourceUri()).toString();
      }
    };
  }
  
  public Supplier<DataSource<CloseableReference<PooledByteBuffer>>> getEncodedImageDataSourceSupplier(final ImageRequest paramImageRequest, final Object paramObject)
  {
    new Supplier()
    {
      public DataSource<CloseableReference<PooledByteBuffer>> get()
      {
        return fetchEncodedImage(paramImageRequest, paramObject);
      }
      
      public String toString()
      {
        return Objects.toStringHelper(this).add("uri", paramImageRequest.getSourceUri()).toString();
      }
    };
  }
  
  public boolean isInBitmapMemoryCache(Uri paramUri)
  {
    if (paramUri == null) {
      return false;
    }
    paramUri = predicateForUri(paramUri);
    return mBitmapMemoryCache.contains(paramUri);
  }
  
  public boolean isInBitmapMemoryCache(ImageRequest paramImageRequest)
  {
    if (paramImageRequest == null) {
      return false;
    }
    paramImageRequest = mCacheKeyFactory.getBitmapCacheKey(paramImageRequest, null);
    paramImageRequest = mBitmapMemoryCache.get(paramImageRequest);
    try
    {
      boolean bool = CloseableReference.isValid(paramImageRequest);
      return bool;
    }
    finally
    {
      CloseableReference.closeSafely(paramImageRequest);
    }
  }
  
  public DataSource<Boolean> isInDiskCache(Uri paramUri)
  {
    return isInDiskCache(ImageRequest.fromUri(paramUri));
  }
  
  public DataSource<Boolean> isInDiskCache(final ImageRequest paramImageRequest)
  {
    paramImageRequest = mCacheKeyFactory.getEncodedCacheKey(paramImageRequest, null);
    final SimpleDataSource localSimpleDataSource = SimpleDataSource.create();
    mMainBufferedDiskCache.contains(paramImageRequest).continueWithTask(new Continuation()
    {
      public Task<Boolean> then(Task<Boolean> paramAnonymousTask)
        throws Exception
      {
        if ((!paramAnonymousTask.isCancelled()) && (!paramAnonymousTask.isFaulted()) && (((Boolean)paramAnonymousTask.getResult()).booleanValue())) {
          return Task.forResult(Boolean.TRUE);
        }
        return ImagePipeline.access$000(ImagePipeline.this).contains(paramImageRequest);
      }
    }).continueWith(new Continuation()
    {
      public Void then(Task<Boolean> paramAnonymousTask)
        throws Exception
      {
        SimpleDataSource localSimpleDataSource = localSimpleDataSource;
        boolean bool;
        if ((!paramAnonymousTask.isCancelled()) && (!paramAnonymousTask.isFaulted()) && (((Boolean)paramAnonymousTask.getResult()).booleanValue())) {
          bool = true;
        } else {
          bool = false;
        }
        localSimpleDataSource.setResult(Boolean.valueOf(bool));
        return null;
      }
    });
    return localSimpleDataSource;
  }
  
  public boolean isInDiskCacheSync(Uri paramUri)
  {
    boolean bool;
    if ((!isInDiskCacheSync(paramUri, ImageRequest.CacheChoice.SMALL)) && (!isInDiskCacheSync(paramUri, ImageRequest.CacheChoice.DEFAULT))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean isInDiskCacheSync(Uri paramUri, ImageRequest.CacheChoice paramCacheChoice)
  {
    return isInDiskCacheSync(ImageRequestBuilder.newBuilderWithSource(paramUri).setCacheChoice(paramCacheChoice).build());
  }
  
  public boolean isInDiskCacheSync(ImageRequest paramImageRequest)
  {
    CacheKey localCacheKey = mCacheKeyFactory.getEncodedCacheKey(paramImageRequest, null);
    paramImageRequest = paramImageRequest.getCacheChoice();
    int i = 7.$SwitchMap$com$facebook$imagepipeline$request$ImageRequest$CacheChoice[paramImageRequest.ordinal()];
    if (i != 1)
    {
      if (i != 2) {
        return false;
      }
      return mSmallImageBufferedDiskCache.diskCheckSync(localCacheKey);
    }
    return mMainBufferedDiskCache.diskCheckSync(localCacheKey);
  }
  
  public boolean isPaused()
  {
    return mThreadHandoffProducerQueue.isQueueing();
  }
  
  public void pause()
  {
    mThreadHandoffProducerQueue.startQueueing();
  }
  
  public DataSource<Void> prefetchToBitmapCache(ImageRequest paramImageRequest, Object paramObject)
  {
    if (!((Boolean)mIsPrefetchEnabledSupplier.get()).booleanValue()) {
      return DataSources.immediateFailedDataSource(PREFETCH_EXCEPTION);
    }
    try
    {
      Producer localProducer;
      if (((Boolean)mSuppressBitmapPrefetchingSupplier.get()).booleanValue()) {
        localProducer = mProducerSequenceFactory.getEncodedImagePrefetchProducerSequence(paramImageRequest);
      } else {
        localProducer = mProducerSequenceFactory.getDecodedImagePrefetchProducerSequence(paramImageRequest);
      }
      paramImageRequest = submitPrefetchRequest(localProducer, paramImageRequest, ImageRequest.RequestLevel.FULL_FETCH, paramObject, Priority.MEDIUM);
      return paramImageRequest;
    }
    catch (Exception paramImageRequest) {}
    return DataSources.immediateFailedDataSource(paramImageRequest);
  }
  
  public DataSource<Void> prefetchToDiskCache(ImageRequest paramImageRequest, Object paramObject)
  {
    return prefetchToDiskCache(paramImageRequest, paramObject, Priority.MEDIUM);
  }
  
  public DataSource<Void> prefetchToDiskCache(ImageRequest paramImageRequest, Object paramObject, Priority paramPriority)
  {
    if (!((Boolean)mIsPrefetchEnabledSupplier.get()).booleanValue()) {
      return DataSources.immediateFailedDataSource(PREFETCH_EXCEPTION);
    }
    try
    {
      paramImageRequest = submitPrefetchRequest(mProducerSequenceFactory.getEncodedImagePrefetchProducerSequence(paramImageRequest), paramImageRequest, ImageRequest.RequestLevel.FULL_FETCH, paramObject, paramPriority);
      return paramImageRequest;
    }
    catch (Exception paramImageRequest) {}
    return DataSources.immediateFailedDataSource(paramImageRequest);
  }
  
  public void resume()
  {
    mThreadHandoffProducerQueue.stopQueuing();
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.core.ImagePipeline
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */