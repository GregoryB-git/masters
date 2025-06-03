package com.facebook.imagepipeline.core;

import android.content.Context;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.common.memory.ByteArrayPool;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MediaVariationsIndex;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.decoder.ProgressiveJpegConfig;
import com.facebook.imagepipeline.image.CloseableImage;

public class ImagePipelineExperiments$DefaultProducerFactoryMethod
  implements ImagePipelineExperiments.ProducerFactoryMethod
{
  public ProducerFactory createProducerFactory(Context paramContext, ByteArrayPool paramByteArrayPool, ImageDecoder paramImageDecoder, ProgressiveJpegConfig paramProgressiveJpegConfig, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Supplier<Boolean> paramSupplier, ExecutorSupplier paramExecutorSupplier, PooledByteBufferFactory paramPooledByteBufferFactory, MemoryCache<CacheKey, CloseableImage> paramMemoryCache, MemoryCache<CacheKey, PooledByteBuffer> paramMemoryCache1, BufferedDiskCache paramBufferedDiskCache1, BufferedDiskCache paramBufferedDiskCache2, MediaVariationsIndex paramMediaVariationsIndex, CacheKeyFactory paramCacheKeyFactory, PlatformBitmapFactory paramPlatformBitmapFactory, int paramInt1, int paramInt2, boolean paramBoolean4)
  {
    return new ProducerFactory(paramContext, paramByteArrayPool, paramImageDecoder, paramProgressiveJpegConfig, paramBoolean1, paramBoolean2, paramBoolean3, paramSupplier, paramExecutorSupplier, paramPooledByteBufferFactory, paramMemoryCache, paramMemoryCache1, paramBufferedDiskCache1, paramBufferedDiskCache2, paramMediaVariationsIndex, paramCacheKeyFactory, paramPlatformBitmapFactory, paramInt1, paramInt2, paramBoolean4);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.core.ImagePipelineExperiments.DefaultProducerFactoryMethod
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */