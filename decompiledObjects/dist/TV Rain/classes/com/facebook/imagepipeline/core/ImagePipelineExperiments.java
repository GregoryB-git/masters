package com.facebook.imagepipeline.core;

import android.content.Context;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.common.internal.Suppliers;
import com.facebook.common.memory.ByteArrayPool;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.webp.WebpBitmapFactory;
import com.facebook.common.webp.WebpBitmapFactory.WebpErrorLogger;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MediaVariationsIndex;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.decoder.ProgressiveJpegConfig;
import com.facebook.imagepipeline.image.CloseableImage;

public class ImagePipelineExperiments
{
  private boolean mBitmapPrepareToDrawForPrefetch;
  private final int mBitmapPrepareToDrawMaxSizeBytes;
  private final int mBitmapPrepareToDrawMinSizeBytes;
  private final boolean mDecodeCancellationEnabled;
  private final boolean mExternalCreatedBitmapLogEnabled;
  private final Supplier<Boolean> mMediaVariationsIndexEnabled;
  private final boolean mPartialImageCachingEnabled;
  private final ProducerFactoryMethod mProducerFactoryMethod;
  private final Supplier<Boolean> mSmartResizingEnabled;
  private final boolean mSuppressBitmapPrefetching;
  private final boolean mUseBitmapPrepareToDraw;
  private final boolean mUseDownsamplingRatioForResizing;
  private final WebpBitmapFactory mWebpBitmapFactory;
  private final WebpBitmapFactory.WebpErrorLogger mWebpErrorLogger;
  private final boolean mWebpSupportEnabled;
  
  private ImagePipelineExperiments(Builder paramBuilder)
  {
    mWebpSupportEnabled = Builder.access$000(paramBuilder);
    mExternalCreatedBitmapLogEnabled = Builder.access$100(paramBuilder);
    if (Builder.access$200(paramBuilder) != null) {
      mMediaVariationsIndexEnabled = Builder.access$200(paramBuilder);
    } else {
      mMediaVariationsIndexEnabled = new Supplier()
      {
        public Boolean get()
        {
          return Boolean.FALSE;
        }
      };
    }
    mWebpErrorLogger = Builder.access$300(paramBuilder);
    mDecodeCancellationEnabled = Builder.access$400(paramBuilder);
    mWebpBitmapFactory = Builder.access$500(paramBuilder);
    mSuppressBitmapPrefetching = Builder.access$600(paramBuilder);
    mUseDownsamplingRatioForResizing = Builder.access$700(paramBuilder);
    mUseBitmapPrepareToDraw = Builder.access$800(paramBuilder);
    mBitmapPrepareToDrawMinSizeBytes = Builder.access$900(paramBuilder);
    mBitmapPrepareToDrawMaxSizeBytes = Builder.access$1000(paramBuilder);
    mBitmapPrepareToDrawForPrefetch = mBitmapPrepareToDrawForPrefetch;
    mPartialImageCachingEnabled = Builder.access$1100(paramBuilder);
    mSmartResizingEnabled = Builder.access$1200(paramBuilder);
    if (Builder.access$1300(paramBuilder) == null) {
      mProducerFactoryMethod = new DefaultProducerFactoryMethod();
    } else {
      mProducerFactoryMethod = Builder.access$1300(paramBuilder);
    }
  }
  
  public static Builder newBuilder(ImagePipelineConfig.Builder paramBuilder)
  {
    return new Builder(paramBuilder);
  }
  
  public boolean getBitmapPrepareToDrawForPrefetch()
  {
    return mBitmapPrepareToDrawForPrefetch;
  }
  
  public int getBitmapPrepareToDrawMaxSizeBytes()
  {
    return mBitmapPrepareToDrawMaxSizeBytes;
  }
  
  public int getBitmapPrepareToDrawMinSizeBytes()
  {
    return mBitmapPrepareToDrawMinSizeBytes;
  }
  
  public boolean getMediaVariationsIndexEnabled()
  {
    return ((Boolean)mMediaVariationsIndexEnabled.get()).booleanValue();
  }
  
  public ProducerFactoryMethod getProducerFactoryMethod()
  {
    return mProducerFactoryMethod;
  }
  
  public boolean getUseBitmapPrepareToDraw()
  {
    return mUseBitmapPrepareToDraw;
  }
  
  public boolean getUseDownsamplingRatioForResizing()
  {
    return mUseDownsamplingRatioForResizing;
  }
  
  public WebpBitmapFactory getWebpBitmapFactory()
  {
    return mWebpBitmapFactory;
  }
  
  public WebpBitmapFactory.WebpErrorLogger getWebpErrorLogger()
  {
    return mWebpErrorLogger;
  }
  
  public boolean isDecodeCancellationEnabled()
  {
    return mDecodeCancellationEnabled;
  }
  
  public boolean isExternalCreatedBitmapLogEnabled()
  {
    return mExternalCreatedBitmapLogEnabled;
  }
  
  public boolean isPartialImageCachingEnabled()
  {
    return mPartialImageCachingEnabled;
  }
  
  public Supplier<Boolean> isSmartResizingEnabled()
  {
    return mSmartResizingEnabled;
  }
  
  public boolean isWebpSupportEnabled()
  {
    return mWebpSupportEnabled;
  }
  
  public static class Builder
  {
    public boolean mBitmapPrepareToDrawForPrefetch = false;
    private int mBitmapPrepareToDrawMaxSizeBytes = 0;
    private int mBitmapPrepareToDrawMinSizeBytes = 0;
    private final ImagePipelineConfig.Builder mConfigBuilder;
    private boolean mDecodeCancellationEnabled = false;
    private boolean mExternalCreatedBitmapLogEnabled = false;
    private Supplier<Boolean> mMediaVariationsIndexEnabled = null;
    private boolean mPartialImageCachingEnabled = false;
    private ImagePipelineExperiments.ProducerFactoryMethod mProducerFactoryMethod;
    private Supplier<Boolean> mSmartResizingEnabled = Suppliers.BOOLEAN_FALSE;
    private boolean mSuppressBitmapPrefetching = false;
    private boolean mUseBitmapPrepareToDraw = false;
    private boolean mUseDownsamplingRatioForResizing = false;
    private WebpBitmapFactory mWebpBitmapFactory;
    private WebpBitmapFactory.WebpErrorLogger mWebpErrorLogger;
    private boolean mWebpSupportEnabled = false;
    
    public Builder(ImagePipelineConfig.Builder paramBuilder)
    {
      mConfigBuilder = paramBuilder;
    }
    
    public ImagePipelineExperiments build()
    {
      return new ImagePipelineExperiments(this, null);
    }
    
    public boolean isPartialImageCachingEnabled()
    {
      return mPartialImageCachingEnabled;
    }
    
    public ImagePipelineConfig.Builder setBitmapPrepareToDraw(boolean paramBoolean1, int paramInt1, int paramInt2, boolean paramBoolean2)
    {
      mUseBitmapPrepareToDraw = paramBoolean1;
      mBitmapPrepareToDrawMinSizeBytes = paramInt1;
      mBitmapPrepareToDrawMaxSizeBytes = paramInt2;
      mBitmapPrepareToDrawForPrefetch = paramBoolean2;
      return mConfigBuilder;
    }
    
    public ImagePipelineConfig.Builder setDecodeCancellationEnabled(boolean paramBoolean)
    {
      mDecodeCancellationEnabled = paramBoolean;
      return mConfigBuilder;
    }
    
    public ImagePipelineConfig.Builder setExternalCreatedBitmapLogEnabled(boolean paramBoolean)
    {
      mExternalCreatedBitmapLogEnabled = paramBoolean;
      return mConfigBuilder;
    }
    
    public ImagePipelineConfig.Builder setMediaVariationsIndexEnabled(Supplier<Boolean> paramSupplier)
    {
      mMediaVariationsIndexEnabled = paramSupplier;
      return mConfigBuilder;
    }
    
    public ImagePipelineConfig.Builder setPartialImageCachingEnabled(boolean paramBoolean)
    {
      mPartialImageCachingEnabled = paramBoolean;
      return mConfigBuilder;
    }
    
    public ImagePipelineConfig.Builder setProducerFactoryMethod(ImagePipelineExperiments.ProducerFactoryMethod paramProducerFactoryMethod)
    {
      mProducerFactoryMethod = paramProducerFactoryMethod;
      return mConfigBuilder;
    }
    
    public ImagePipelineConfig.Builder setSmartResizingEnabled(Supplier<Boolean> paramSupplier)
    {
      mSmartResizingEnabled = paramSupplier;
      return mConfigBuilder;
    }
    
    public ImagePipelineConfig.Builder setSuppressBitmapPrefetching(boolean paramBoolean)
    {
      mSuppressBitmapPrefetching = paramBoolean;
      return mConfigBuilder;
    }
    
    public ImagePipelineConfig.Builder setUseDownsampligRatioForResizing(boolean paramBoolean)
    {
      mUseDownsamplingRatioForResizing = paramBoolean;
      return mConfigBuilder;
    }
    
    public ImagePipelineConfig.Builder setWebpBitmapFactory(WebpBitmapFactory paramWebpBitmapFactory)
    {
      mWebpBitmapFactory = paramWebpBitmapFactory;
      return mConfigBuilder;
    }
    
    public ImagePipelineConfig.Builder setWebpErrorLogger(WebpBitmapFactory.WebpErrorLogger paramWebpErrorLogger)
    {
      mWebpErrorLogger = paramWebpErrorLogger;
      return mConfigBuilder;
    }
    
    public ImagePipelineConfig.Builder setWebpSupportEnabled(boolean paramBoolean)
    {
      mWebpSupportEnabled = paramBoolean;
      return mConfigBuilder;
    }
  }
  
  public static class DefaultProducerFactoryMethod
    implements ImagePipelineExperiments.ProducerFactoryMethod
  {
    public ProducerFactory createProducerFactory(Context paramContext, ByteArrayPool paramByteArrayPool, ImageDecoder paramImageDecoder, ProgressiveJpegConfig paramProgressiveJpegConfig, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Supplier<Boolean> paramSupplier, ExecutorSupplier paramExecutorSupplier, PooledByteBufferFactory paramPooledByteBufferFactory, MemoryCache<CacheKey, CloseableImage> paramMemoryCache, MemoryCache<CacheKey, PooledByteBuffer> paramMemoryCache1, BufferedDiskCache paramBufferedDiskCache1, BufferedDiskCache paramBufferedDiskCache2, MediaVariationsIndex paramMediaVariationsIndex, CacheKeyFactory paramCacheKeyFactory, PlatformBitmapFactory paramPlatformBitmapFactory, int paramInt1, int paramInt2, boolean paramBoolean4)
    {
      return new ProducerFactory(paramContext, paramByteArrayPool, paramImageDecoder, paramProgressiveJpegConfig, paramBoolean1, paramBoolean2, paramBoolean3, paramSupplier, paramExecutorSupplier, paramPooledByteBufferFactory, paramMemoryCache, paramMemoryCache1, paramBufferedDiskCache1, paramBufferedDiskCache2, paramMediaVariationsIndex, paramCacheKeyFactory, paramPlatformBitmapFactory, paramInt1, paramInt2, paramBoolean4);
    }
  }
  
  public static abstract interface ProducerFactoryMethod
  {
    public abstract ProducerFactory createProducerFactory(Context paramContext, ByteArrayPool paramByteArrayPool, ImageDecoder paramImageDecoder, ProgressiveJpegConfig paramProgressiveJpegConfig, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Supplier<Boolean> paramSupplier, ExecutorSupplier paramExecutorSupplier, PooledByteBufferFactory paramPooledByteBufferFactory, MemoryCache<CacheKey, CloseableImage> paramMemoryCache, MemoryCache<CacheKey, PooledByteBuffer> paramMemoryCache1, BufferedDiskCache paramBufferedDiskCache1, BufferedDiskCache paramBufferedDiskCache2, MediaVariationsIndex paramMediaVariationsIndex, CacheKeyFactory paramCacheKeyFactory, PlatformBitmapFactory paramPlatformBitmapFactory, int paramInt1, int paramInt2, boolean paramBoolean4);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.core.ImagePipelineExperiments
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */