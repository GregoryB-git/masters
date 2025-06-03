package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.Postprocessor;
import com.facebook.imagepipeline.request.RepeatedPostprocessor;

public class PostprocessedBitmapMemoryCacheProducer
  implements Producer<CloseableReference<CloseableImage>>
{
  public static final String PRODUCER_NAME = "PostprocessedBitmapMemoryCacheProducer";
  @VisibleForTesting
  public static final String VALUE_FOUND = "cached_value_found";
  private final CacheKeyFactory mCacheKeyFactory;
  private final Producer<CloseableReference<CloseableImage>> mInputProducer;
  private final MemoryCache<CacheKey, CloseableImage> mMemoryCache;
  
  public PostprocessedBitmapMemoryCacheProducer(MemoryCache<CacheKey, CloseableImage> paramMemoryCache, CacheKeyFactory paramCacheKeyFactory, Producer<CloseableReference<CloseableImage>> paramProducer)
  {
    mMemoryCache = paramMemoryCache;
    mCacheKeyFactory = paramCacheKeyFactory;
    mInputProducer = paramProducer;
  }
  
  public String getProducerName()
  {
    return "PostprocessedBitmapMemoryCacheProducer";
  }
  
  public void produceResults(Consumer<CloseableReference<CloseableImage>> paramConsumer, ProducerContext paramProducerContext)
  {
    ProducerListener localProducerListener = paramProducerContext.getListener();
    String str = paramProducerContext.getId();
    Object localObject1 = paramProducerContext.getImageRequest();
    Object localObject2 = paramProducerContext.getCallerContext();
    Postprocessor localPostprocessor = ((ImageRequest)localObject1).getPostprocessor();
    if ((localPostprocessor != null) && (localPostprocessor.getPostprocessorCacheKey() != null))
    {
      localProducerListener.onProducerStart(str, getProducerName());
      CacheKey localCacheKey = mCacheKeyFactory.getPostprocessedBitmapCacheKey((ImageRequest)localObject1, localObject2);
      Object localObject3 = mMemoryCache.get(localCacheKey);
      localObject2 = null;
      localObject1 = null;
      if (localObject3 != null)
      {
        localObject2 = getProducerName();
        paramProducerContext = (ProducerContext)localObject1;
        if (localProducerListener.requiresExtraMap(str)) {
          paramProducerContext = ImmutableMap.of("cached_value_found", "true");
        }
        localProducerListener.onProducerFinishWithSuccess(str, (String)localObject2, paramProducerContext);
        localProducerListener.onUltimateProducerReached(str, "PostprocessedBitmapMemoryCacheProducer", true);
        paramConsumer.onProgressUpdate(1.0F);
        paramConsumer.onNewResult(localObject3, 1);
        ((CloseableReference)localObject3).close();
      }
      else
      {
        localObject1 = new CachedPostprocessorConsumer(paramConsumer, localCacheKey, localPostprocessor instanceof RepeatedPostprocessor, mMemoryCache);
        localObject3 = getProducerName();
        paramConsumer = (Consumer<CloseableReference<CloseableImage>>)localObject2;
        if (localProducerListener.requiresExtraMap(str)) {
          paramConsumer = ImmutableMap.of("cached_value_found", "false");
        }
        localProducerListener.onProducerFinishWithSuccess(str, (String)localObject3, paramConsumer);
        mInputProducer.produceResults((Consumer)localObject1, paramProducerContext);
      }
      return;
    }
    mInputProducer.produceResults(paramConsumer, paramProducerContext);
  }
  
  public static class CachedPostprocessorConsumer
    extends DelegatingConsumer<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>>
  {
    private final CacheKey mCacheKey;
    private final boolean mIsRepeatedProcessor;
    private final MemoryCache<CacheKey, CloseableImage> mMemoryCache;
    
    public CachedPostprocessorConsumer(Consumer<CloseableReference<CloseableImage>> paramConsumer, CacheKey paramCacheKey, boolean paramBoolean, MemoryCache<CacheKey, CloseableImage> paramMemoryCache)
    {
      super();
      mCacheKey = paramCacheKey;
      mIsRepeatedProcessor = paramBoolean;
      mMemoryCache = paramMemoryCache;
    }
    
    public void onNewResultImpl(CloseableReference<CloseableImage> paramCloseableReference, int paramInt)
    {
      if (paramCloseableReference == null)
      {
        if (BaseConsumer.isLast(paramInt)) {
          getConsumer().onNewResult(null, paramInt);
        }
        return;
      }
      if ((BaseConsumer.isNotLast(paramInt)) && (!mIsRepeatedProcessor)) {
        return;
      }
      CloseableReference localCloseableReference = mMemoryCache.cache(mCacheKey, paramCloseableReference);
      try
      {
        getConsumer().onProgressUpdate(1.0F);
        Consumer localConsumer = getConsumer();
        if (localCloseableReference != null) {
          paramCloseableReference = localCloseableReference;
        }
        localConsumer.onNewResult(paramCloseableReference, paramInt);
        return;
      }
      finally
      {
        CloseableReference.closeSafely(localCloseableReference);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.PostprocessedBitmapMemoryCacheProducer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */