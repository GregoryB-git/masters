package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.QualityInfo;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;
import java.util.Map;

public class BitmapMemoryCacheProducer
  implements Producer<CloseableReference<CloseableImage>>
{
  public static final String EXTRA_CACHED_VALUE_FOUND = "cached_value_found";
  public static final String PRODUCER_NAME = "BitmapMemoryCacheProducer";
  private final CacheKeyFactory mCacheKeyFactory;
  private final Producer<CloseableReference<CloseableImage>> mInputProducer;
  private final MemoryCache<CacheKey, CloseableImage> mMemoryCache;
  
  public BitmapMemoryCacheProducer(MemoryCache<CacheKey, CloseableImage> paramMemoryCache, CacheKeyFactory paramCacheKeyFactory, Producer<CloseableReference<CloseableImage>> paramProducer)
  {
    mMemoryCache = paramMemoryCache;
    mCacheKeyFactory = paramCacheKeyFactory;
    mInputProducer = paramProducer;
  }
  
  public String getProducerName()
  {
    return "BitmapMemoryCacheProducer";
  }
  
  public void produceResults(Consumer<CloseableReference<CloseableImage>> paramConsumer, ProducerContext paramProducerContext)
  {
    ProducerListener localProducerListener = paramProducerContext.getListener();
    String str1 = paramProducerContext.getId();
    localProducerListener.onProducerStart(str1, getProducerName());
    Object localObject1 = paramProducerContext.getImageRequest();
    Object localObject2 = paramProducerContext.getCallerContext();
    CacheKey localCacheKey = mCacheKeyFactory.getBitmapCacheKey((ImageRequest)localObject1, localObject2);
    Object localObject3 = mMemoryCache.get(localCacheKey);
    localObject2 = null;
    if (localObject3 != null)
    {
      boolean bool = ((CloseableImage)((CloseableReference)localObject3).get()).getQualityInfo().isOfFullQuality();
      if (bool)
      {
        String str2 = getProducerName();
        if (localProducerListener.requiresExtraMap(str1)) {
          localObject1 = ImmutableMap.of("cached_value_found", "true");
        } else {
          localObject1 = null;
        }
        localProducerListener.onProducerFinishWithSuccess(str1, str2, (Map)localObject1);
        localProducerListener.onUltimateProducerReached(str1, getProducerName(), true);
        paramConsumer.onProgressUpdate(1.0F);
      }
      paramConsumer.onNewResult(localObject3, BaseConsumer.simpleStatusForIsLast(bool));
      ((CloseableReference)localObject3).close();
      if (bool) {
        return;
      }
    }
    if (paramProducerContext.getLowestPermittedRequestLevel().getValue() >= ImageRequest.RequestLevel.BITMAP_MEMORY_CACHE.getValue())
    {
      localObject1 = getProducerName();
      if (localProducerListener.requiresExtraMap(str1)) {
        paramProducerContext = ImmutableMap.of("cached_value_found", "false");
      } else {
        paramProducerContext = null;
      }
      localProducerListener.onProducerFinishWithSuccess(str1, (String)localObject1, paramProducerContext);
      localProducerListener.onUltimateProducerReached(str1, getProducerName(), false);
      paramConsumer.onNewResult(null, 1);
      return;
    }
    localObject3 = wrapConsumer(paramConsumer, localCacheKey);
    localObject1 = getProducerName();
    paramConsumer = (Consumer<CloseableReference<CloseableImage>>)localObject2;
    if (localProducerListener.requiresExtraMap(str1)) {
      paramConsumer = ImmutableMap.of("cached_value_found", "false");
    }
    localProducerListener.onProducerFinishWithSuccess(str1, (String)localObject1, paramConsumer);
    mInputProducer.produceResults((Consumer)localObject3, paramProducerContext);
  }
  
  public Consumer<CloseableReference<CloseableImage>> wrapConsumer(Consumer<CloseableReference<CloseableImage>> paramConsumer, final CacheKey paramCacheKey)
  {
    new DelegatingConsumer(paramConsumer)
    {
      public void onNewResultImpl(CloseableReference<CloseableImage> paramAnonymousCloseableReference, int paramAnonymousInt)
      {
        boolean bool = BaseConsumer.isLast(paramAnonymousInt);
        if (paramAnonymousCloseableReference == null)
        {
          if (bool) {
            getConsumer().onNewResult(null, paramAnonymousInt);
          }
          return;
        }
        if ((!((CloseableImage)paramAnonymousCloseableReference.get()).isStateful()) && (!BaseConsumer.statusHasFlag(paramAnonymousInt, 8)))
        {
          Object localObject;
          if (!bool)
          {
            localCloseableReference = BitmapMemoryCacheProducer.access$000(BitmapMemoryCacheProducer.this).get(paramCacheKey);
            if (localCloseableReference != null) {
              try
              {
                localObject = ((CloseableImage)paramAnonymousCloseableReference.get()).getQualityInfo();
                QualityInfo localQualityInfo = ((CloseableImage)localCloseableReference.get()).getQualityInfo();
                if (!localQualityInfo.isOfFullQuality())
                {
                  int i = localQualityInfo.getQuality();
                  int j = ((QualityInfo)localObject).getQuality();
                  if (i < j)
                  {
                    CloseableReference.closeSafely(localCloseableReference);
                    break label174;
                  }
                }
                getConsumer().onNewResult(localCloseableReference, paramAnonymousInt);
                return;
              }
              finally
              {
                CloseableReference.closeSafely(localCloseableReference);
              }
            }
          }
          label174:
          CloseableReference localCloseableReference = BitmapMemoryCacheProducer.access$000(BitmapMemoryCacheProducer.this).cache(paramCacheKey, paramAnonymousCloseableReference);
          if (bool) {}
          try
          {
            getConsumer().onProgressUpdate(1.0F);
            localObject = getConsumer();
            if (localCloseableReference != null) {
              paramAnonymousCloseableReference = localCloseableReference;
            }
            ((Consumer)localObject).onNewResult(paramAnonymousCloseableReference, paramAnonymousInt);
            return;
          }
          finally
          {
            CloseableReference.closeSafely(localCloseableReference);
          }
        }
        getConsumer().onNewResult(paramAnonymousCloseableReference, paramAnonymousInt);
      }
    };
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.BitmapMemoryCacheProducer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */