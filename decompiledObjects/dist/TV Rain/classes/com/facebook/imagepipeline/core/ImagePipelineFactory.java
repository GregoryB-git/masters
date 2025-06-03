package com.facebook.imagepipeline.core;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.core.util.Pools.SynchronizedPool;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.disk.DiskCacheConfig;
import com.facebook.cache.disk.FileCache;
import com.facebook.common.internal.AndroidPredicates;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Suppliers;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.time.SystemClock;
import com.facebook.imageformat.ImageFormatChecker;
import com.facebook.imagepipeline.animated.factory.AnimatedFactory;
import com.facebook.imagepipeline.animated.factory.AnimatedFactoryProvider;
import com.facebook.imagepipeline.bitmaps.ArtBitmapFactory;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.cache.BitmapCountingMemoryCacheFactory;
import com.facebook.imagepipeline.cache.BitmapMemoryCacheFactory;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import com.facebook.imagepipeline.cache.CountingMemoryCache;
import com.facebook.imagepipeline.cache.EncodedCountingMemoryCacheFactory;
import com.facebook.imagepipeline.cache.EncodedMemoryCacheFactory;
import com.facebook.imagepipeline.cache.MediaVariationsIndex;
import com.facebook.imagepipeline.cache.MediaVariationsIndexDatabase;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.cache.NoOpMediaVariationsIndex;
import com.facebook.imagepipeline.decoder.DefaultImageDecoder;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.decoder.ImageDecoderConfig;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.memory.PoolFactory;
import com.facebook.imagepipeline.platform.ArtDecoder;
import com.facebook.imagepipeline.platform.PlatformDecoder;
import com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
public class ImagePipelineFactory
{
  private static ImagePipelineFactory sInstance;
  private AnimatedFactory mAnimatedFactory;
  private CountingMemoryCache<CacheKey, CloseableImage> mBitmapCountingMemoryCache;
  private MemoryCache<CacheKey, CloseableImage> mBitmapMemoryCache;
  private final ImagePipelineConfig mConfig;
  private CountingMemoryCache<CacheKey, PooledByteBuffer> mEncodedCountingMemoryCache;
  private MemoryCache<CacheKey, PooledByteBuffer> mEncodedMemoryCache;
  private ImageDecoder mImageDecoder;
  private ImagePipeline mImagePipeline;
  private BufferedDiskCache mMainBufferedDiskCache;
  private FileCache mMainFileCache;
  private MediaVariationsIndex mMediaVariationsIndex;
  private PlatformBitmapFactory mPlatformBitmapFactory;
  private PlatformDecoder mPlatformDecoder;
  private ProducerFactory mProducerFactory;
  private ProducerSequenceFactory mProducerSequenceFactory;
  private BufferedDiskCache mSmallImageBufferedDiskCache;
  private FileCache mSmallImageFileCache;
  private final ThreadHandoffProducerQueue mThreadHandoffProducerQueue;
  
  public ImagePipelineFactory(ImagePipelineConfig paramImagePipelineConfig)
  {
    mConfig = ((ImagePipelineConfig)Preconditions.checkNotNull(paramImagePipelineConfig));
    mThreadHandoffProducerQueue = new ThreadHandoffProducerQueue(paramImagePipelineConfig.getExecutorSupplier().forLightweightBackgroundTasks());
  }
  
  public static PlatformBitmapFactory buildPlatformBitmapFactory(PoolFactory paramPoolFactory, PlatformDecoder paramPlatformDecoder)
  {
    return new ArtBitmapFactory(paramPoolFactory.getBitmapPool());
  }
  
  public static PlatformDecoder buildPlatformDecoder(PoolFactory paramPoolFactory, boolean paramBoolean)
  {
    int i = paramPoolFactory.getFlexByteArrayPoolMaxNumThreads();
    return new ArtDecoder(paramPoolFactory.getBitmapPool(), i, new Pools.SynchronizedPool(i));
  }
  
  @Nullable
  private AnimatedFactory getAnimatedFactory()
  {
    if (mAnimatedFactory == null) {
      mAnimatedFactory = AnimatedFactoryProvider.getAnimatedFactory(getPlatformBitmapFactory(), mConfig.getExecutorSupplier(), getBitmapCountingMemoryCache());
    }
    return mAnimatedFactory;
  }
  
  private ImageDecoder getImageDecoder()
  {
    if (mImageDecoder == null) {
      if (mConfig.getImageDecoder() != null)
      {
        mImageDecoder = mConfig.getImageDecoder();
      }
      else
      {
        Object localObject = getAnimatedFactory();
        ImageDecoder localImageDecoder = null;
        if (localObject != null)
        {
          localImageDecoder = ((AnimatedFactory)localObject).getGifDecoder(mConfig.getBitmapConfig());
          localObject = ((AnimatedFactory)localObject).getWebPDecoder(mConfig.getBitmapConfig());
        }
        else
        {
          localObject = null;
        }
        if (mConfig.getImageDecoderConfig() == null)
        {
          mImageDecoder = new DefaultImageDecoder(localImageDecoder, (ImageDecoder)localObject, getPlatformDecoder());
        }
        else
        {
          mImageDecoder = new DefaultImageDecoder(localImageDecoder, (ImageDecoder)localObject, getPlatformDecoder(), mConfig.getImageDecoderConfig().getCustomImageDecoders());
          ImageFormatChecker.getInstance().setCustomImageFormatCheckers(mConfig.getImageDecoderConfig().getCustomImageFormats());
        }
      }
    }
    return mImageDecoder;
  }
  
  public static ImagePipelineFactory getInstance()
  {
    return (ImagePipelineFactory)Preconditions.checkNotNull(sInstance, "ImagePipelineFactory was not initialized!");
  }
  
  private ProducerFactory getProducerFactory()
  {
    if (mProducerFactory == null) {
      mProducerFactory = mConfig.getExperiments().getProducerFactoryMethod().createProducerFactory(mConfig.getContext(), mConfig.getPoolFactory().getSmallByteArrayPool(), getImageDecoder(), mConfig.getProgressiveJpegConfig(), mConfig.isDownsampleEnabled(), mConfig.isResizeAndRotateEnabledForNetwork(), mConfig.getExperiments().isDecodeCancellationEnabled(), mConfig.getExperiments().isSmartResizingEnabled(), mConfig.getExecutorSupplier(), mConfig.getPoolFactory().getPooledByteBufferFactory(), getBitmapMemoryCache(), getEncodedMemoryCache(), getMainBufferedDiskCache(), getSmallImageBufferedDiskCache(), getMediaVariationsIndex(), mConfig.getCacheKeyFactory(), getPlatformBitmapFactory(), mConfig.getExperiments().getBitmapPrepareToDrawMinSizeBytes(), mConfig.getExperiments().getBitmapPrepareToDrawMaxSizeBytes(), mConfig.getExperiments().getBitmapPrepareToDrawForPrefetch());
    }
    return mProducerFactory;
  }
  
  private ProducerSequenceFactory getProducerSequenceFactory()
  {
    boolean bool;
    if (mConfig.getExperiments().getUseBitmapPrepareToDraw()) {
      bool = true;
    } else {
      bool = false;
    }
    if (mProducerSequenceFactory == null) {
      mProducerSequenceFactory = new ProducerSequenceFactory(mConfig.getContext().getApplicationContext().getContentResolver(), getProducerFactory(), mConfig.getNetworkFetcher(), mConfig.isResizeAndRotateEnabledForNetwork(), mConfig.getExperiments().isWebpSupportEnabled(), mThreadHandoffProducerQueue, mConfig.getExperiments().getUseDownsamplingRatioForResizing(), bool, mConfig.getExperiments().isPartialImageCachingEnabled());
    }
    return mProducerSequenceFactory;
  }
  
  private BufferedDiskCache getSmallImageBufferedDiskCache()
  {
    if (mSmallImageBufferedDiskCache == null) {
      mSmallImageBufferedDiskCache = new BufferedDiskCache(getSmallImageFileCache(), mConfig.getPoolFactory().getPooledByteBufferFactory(), mConfig.getPoolFactory().getPooledByteStreams(), mConfig.getExecutorSupplier().forLocalStorageRead(), mConfig.getExecutorSupplier().forLocalStorageWrite(), mConfig.getImageCacheStatsTracker());
    }
    return mSmallImageBufferedDiskCache;
  }
  
  public static void initialize(Context paramContext)
  {
    initialize(ImagePipelineConfig.newBuilder(paramContext).build());
  }
  
  public static void initialize(ImagePipelineConfig paramImagePipelineConfig)
  {
    sInstance = new ImagePipelineFactory(paramImagePipelineConfig);
  }
  
  public static void shutDown()
  {
    ImagePipelineFactory localImagePipelineFactory = sInstance;
    if (localImagePipelineFactory != null)
    {
      localImagePipelineFactory.getBitmapMemoryCache().removeAll(AndroidPredicates.True());
      sInstance.getEncodedMemoryCache().removeAll(AndroidPredicates.True());
      sInstance = null;
    }
  }
  
  @Nullable
  public DrawableFactory getAnimatedDrawableFactory(Context paramContext)
  {
    AnimatedFactory localAnimatedFactory = getAnimatedFactory();
    if (localAnimatedFactory == null) {
      paramContext = null;
    } else {
      paramContext = localAnimatedFactory.getAnimatedDrawableFactory(paramContext);
    }
    return paramContext;
  }
  
  public CountingMemoryCache<CacheKey, CloseableImage> getBitmapCountingMemoryCache()
  {
    if (mBitmapCountingMemoryCache == null) {
      mBitmapCountingMemoryCache = BitmapCountingMemoryCacheFactory.get(mConfig.getBitmapMemoryCacheParamsSupplier(), mConfig.getMemoryTrimmableRegistry(), getPlatformBitmapFactory(), mConfig.getExperiments().isExternalCreatedBitmapLogEnabled(), mConfig.getBitmapMemoryCacheTrimStrategy());
    }
    return mBitmapCountingMemoryCache;
  }
  
  public MemoryCache<CacheKey, CloseableImage> getBitmapMemoryCache()
  {
    if (mBitmapMemoryCache == null) {
      mBitmapMemoryCache = BitmapMemoryCacheFactory.get(getBitmapCountingMemoryCache(), mConfig.getImageCacheStatsTracker());
    }
    return mBitmapMemoryCache;
  }
  
  public CountingMemoryCache<CacheKey, PooledByteBuffer> getEncodedCountingMemoryCache()
  {
    if (mEncodedCountingMemoryCache == null) {
      mEncodedCountingMemoryCache = EncodedCountingMemoryCacheFactory.get(mConfig.getEncodedMemoryCacheParamsSupplier(), mConfig.getMemoryTrimmableRegistry(), getPlatformBitmapFactory());
    }
    return mEncodedCountingMemoryCache;
  }
  
  public MemoryCache<CacheKey, PooledByteBuffer> getEncodedMemoryCache()
  {
    if (mEncodedMemoryCache == null) {
      mEncodedMemoryCache = EncodedMemoryCacheFactory.get(getEncodedCountingMemoryCache(), mConfig.getImageCacheStatsTracker());
    }
    return mEncodedMemoryCache;
  }
  
  public ImagePipeline getImagePipeline()
  {
    if (mImagePipeline == null) {
      mImagePipeline = new ImagePipeline(getProducerSequenceFactory(), mConfig.getRequestListeners(), mConfig.getIsPrefetchEnabledSupplier(), getBitmapMemoryCache(), getEncodedMemoryCache(), getMainBufferedDiskCache(), getSmallImageBufferedDiskCache(), mConfig.getCacheKeyFactory(), mThreadHandoffProducerQueue, Suppliers.of(Boolean.FALSE));
    }
    return mImagePipeline;
  }
  
  public BufferedDiskCache getMainBufferedDiskCache()
  {
    if (mMainBufferedDiskCache == null) {
      mMainBufferedDiskCache = new BufferedDiskCache(getMainFileCache(), mConfig.getPoolFactory().getPooledByteBufferFactory(), mConfig.getPoolFactory().getPooledByteStreams(), mConfig.getExecutorSupplier().forLocalStorageRead(), mConfig.getExecutorSupplier().forLocalStorageWrite(), mConfig.getImageCacheStatsTracker());
    }
    return mMainBufferedDiskCache;
  }
  
  public FileCache getMainFileCache()
  {
    if (mMainFileCache == null)
    {
      DiskCacheConfig localDiskCacheConfig = mConfig.getMainDiskCacheConfig();
      mMainFileCache = mConfig.getFileCacheFactory().get(localDiskCacheConfig);
    }
    return mMainFileCache;
  }
  
  public MediaVariationsIndex getMediaVariationsIndex()
  {
    if (mMediaVariationsIndex == null)
    {
      Object localObject;
      if (mConfig.getExperiments().getMediaVariationsIndexEnabled()) {
        localObject = new MediaVariationsIndexDatabase(mConfig.getContext(), mConfig.getExecutorSupplier().forLocalStorageRead(), mConfig.getExecutorSupplier().forLocalStorageWrite(), SystemClock.get());
      } else {
        localObject = new NoOpMediaVariationsIndex();
      }
      mMediaVariationsIndex = ((MediaVariationsIndex)localObject);
    }
    return mMediaVariationsIndex;
  }
  
  public PlatformBitmapFactory getPlatformBitmapFactory()
  {
    if (mPlatformBitmapFactory == null) {
      mPlatformBitmapFactory = buildPlatformBitmapFactory(mConfig.getPoolFactory(), getPlatformDecoder());
    }
    return mPlatformBitmapFactory;
  }
  
  public PlatformDecoder getPlatformDecoder()
  {
    if (mPlatformDecoder == null) {
      mPlatformDecoder = buildPlatformDecoder(mConfig.getPoolFactory(), mConfig.getExperiments().isWebpSupportEnabled());
    }
    return mPlatformDecoder;
  }
  
  public FileCache getSmallImageFileCache()
  {
    if (mSmallImageFileCache == null)
    {
      DiskCacheConfig localDiskCacheConfig = mConfig.getSmallImageDiskCacheConfig();
      mSmallImageFileCache = mConfig.getFileCacheFactory().get(localDiskCacheConfig);
    }
    return mSmallImageFileCache;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.core.ImagePipelineFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */