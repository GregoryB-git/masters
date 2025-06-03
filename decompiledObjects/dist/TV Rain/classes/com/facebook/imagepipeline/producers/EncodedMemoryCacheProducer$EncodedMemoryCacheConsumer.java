package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.image.EncodedImage;

class EncodedMemoryCacheProducer$EncodedMemoryCacheConsumer
  extends DelegatingConsumer<EncodedImage, EncodedImage>
{
  private final MemoryCache<CacheKey, PooledByteBuffer> mMemoryCache;
  private final CacheKey mRequestedCacheKey;
  
  public EncodedMemoryCacheProducer$EncodedMemoryCacheConsumer(Consumer<EncodedImage> paramConsumer, MemoryCache<CacheKey, PooledByteBuffer> paramMemoryCache, CacheKey paramCacheKey)
  {
    super(paramConsumer);
    mMemoryCache = paramMemoryCache;
    mRequestedCacheKey = paramCacheKey;
  }
  
  public void onNewResultImpl(EncodedImage paramEncodedImage, int paramInt)
  {
    if ((!BaseConsumer.isNotLast(paramInt)) && (paramEncodedImage != null) && (!BaseConsumer.statusHasAnyFlag(paramInt, 10)))
    {
      Object localObject = paramEncodedImage.getByteBufferRef();
      if (localObject != null) {
        try
        {
          CloseableReference localCloseableReference = mMemoryCache.cache(mRequestedCacheKey, (CloseableReference)localObject);
          CloseableReference.closeSafely((CloseableReference)localObject);
          if (localCloseableReference != null) {
            try
            {
              localObject = new com/facebook/imagepipeline/image/EncodedImage;
              ((EncodedImage)localObject).<init>(localCloseableReference);
              ((EncodedImage)localObject).copyMetaDataFrom(paramEncodedImage);
              CloseableReference.closeSafely(localCloseableReference);
              try
              {
                getConsumer().onProgressUpdate(1.0F);
                getConsumer().onNewResult(localObject, paramInt);
                return;
              }
              finally
              {
                EncodedImage.closeSafely((EncodedImage)localObject);
              }
              paramEncodedImage = finally;
            }
            finally
            {
              CloseableReference.closeSafely(localCloseableReference);
            }
          }
          getConsumer().onNewResult(paramEncodedImage, paramInt);
        }
        finally {}
      }
      return;
    }
    getConsumer().onNewResult(paramEncodedImage, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.EncodedMemoryCacheProducer.EncodedMemoryCacheConsumer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */