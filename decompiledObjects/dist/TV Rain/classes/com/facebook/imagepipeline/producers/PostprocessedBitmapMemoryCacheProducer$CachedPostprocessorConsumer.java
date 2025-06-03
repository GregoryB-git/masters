package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.image.CloseableImage;

public class PostprocessedBitmapMemoryCacheProducer$CachedPostprocessorConsumer
  extends DelegatingConsumer<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>>
{
  private final CacheKey mCacheKey;
  private final boolean mIsRepeatedProcessor;
  private final MemoryCache<CacheKey, CloseableImage> mMemoryCache;
  
  public PostprocessedBitmapMemoryCacheProducer$CachedPostprocessorConsumer(Consumer<CloseableReference<CloseableImage>> paramConsumer, CacheKey paramCacheKey, boolean paramBoolean, MemoryCache<CacheKey, CloseableImage> paramMemoryCache)
  {
    super(paramConsumer);
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

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.PostprocessedBitmapMemoryCacheProducer.CachedPostprocessorConsumer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */