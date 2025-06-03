package com.facebook.imagepipeline.core;

import android.content.Context;
import android.graphics.Bitmap.Config;
import com.facebook.cache.disk.DiskCacheConfig;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.CountingMemoryCache.CacheTrimStrategy;
import com.facebook.imagepipeline.cache.ImageCacheStatsTracker;
import com.facebook.imagepipeline.cache.MemoryCacheParams;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.decoder.ImageDecoderConfig;
import com.facebook.imagepipeline.decoder.ProgressiveJpegConfig;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.memory.PoolFactory;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import java.util.Set;

public class ImagePipelineConfig$Builder
{
  private Bitmap.Config mBitmapConfig;
  private Supplier<MemoryCacheParams> mBitmapMemoryCacheParamsSupplier;
  private CountingMemoryCache.CacheTrimStrategy mBitmapMemoryCacheTrimStrategy;
  private CacheKeyFactory mCacheKeyFactory;
  private final Context mContext;
  private boolean mDownsampleEnabled = false;
  private Supplier<MemoryCacheParams> mEncodedMemoryCacheParamsSupplier;
  private ExecutorSupplier mExecutorSupplier;
  private final ImagePipelineExperiments.Builder mExperimentsBuilder = new ImagePipelineExperiments.Builder(this);
  private FileCacheFactory mFileCacheFactory;
  private ImageCacheStatsTracker mImageCacheStatsTracker;
  private ImageDecoder mImageDecoder;
  private ImageDecoderConfig mImageDecoderConfig;
  private Supplier<Boolean> mIsPrefetchEnabledSupplier;
  private DiskCacheConfig mMainDiskCacheConfig;
  private MemoryTrimmableRegistry mMemoryTrimmableRegistry;
  private NetworkFetcher mNetworkFetcher;
  private PlatformBitmapFactory mPlatformBitmapFactory;
  private PoolFactory mPoolFactory;
  private ProgressiveJpegConfig mProgressiveJpegConfig;
  private Set<RequestListener> mRequestListeners;
  private boolean mResizeAndRotateEnabledForNetwork = true;
  private DiskCacheConfig mSmallImageDiskCacheConfig;
  
  private ImagePipelineConfig$Builder(Context paramContext)
  {
    mContext = ((Context)Preconditions.checkNotNull(paramContext));
  }
  
  public ImagePipelineConfig build()
  {
    return new ImagePipelineConfig(this, null);
  }
  
  public ImagePipelineExperiments.Builder experiment()
  {
    return mExperimentsBuilder;
  }
  
  public boolean isDownsampleEnabled()
  {
    return mDownsampleEnabled;
  }
  
  public Builder setBitmapMemoryCacheParamsSupplier(Supplier<MemoryCacheParams> paramSupplier)
  {
    mBitmapMemoryCacheParamsSupplier = ((Supplier)Preconditions.checkNotNull(paramSupplier));
    return this;
  }
  
  public Builder setBitmapMemoryCacheTrimStrategy(CountingMemoryCache.CacheTrimStrategy paramCacheTrimStrategy)
  {
    mBitmapMemoryCacheTrimStrategy = paramCacheTrimStrategy;
    return this;
  }
  
  public Builder setBitmapsConfig(Bitmap.Config paramConfig)
  {
    mBitmapConfig = paramConfig;
    return this;
  }
  
  public Builder setCacheKeyFactory(CacheKeyFactory paramCacheKeyFactory)
  {
    mCacheKeyFactory = paramCacheKeyFactory;
    return this;
  }
  
  public Builder setDownsampleEnabled(boolean paramBoolean)
  {
    mDownsampleEnabled = paramBoolean;
    return this;
  }
  
  public Builder setEncodedMemoryCacheParamsSupplier(Supplier<MemoryCacheParams> paramSupplier)
  {
    mEncodedMemoryCacheParamsSupplier = ((Supplier)Preconditions.checkNotNull(paramSupplier));
    return this;
  }
  
  public Builder setExecutorSupplier(ExecutorSupplier paramExecutorSupplier)
  {
    mExecutorSupplier = paramExecutorSupplier;
    return this;
  }
  
  public Builder setFileCacheFactory(FileCacheFactory paramFileCacheFactory)
  {
    mFileCacheFactory = paramFileCacheFactory;
    return this;
  }
  
  public Builder setImageCacheStatsTracker(ImageCacheStatsTracker paramImageCacheStatsTracker)
  {
    mImageCacheStatsTracker = paramImageCacheStatsTracker;
    return this;
  }
  
  public Builder setImageDecoder(ImageDecoder paramImageDecoder)
  {
    mImageDecoder = paramImageDecoder;
    return this;
  }
  
  public Builder setImageDecoderConfig(ImageDecoderConfig paramImageDecoderConfig)
  {
    mImageDecoderConfig = paramImageDecoderConfig;
    return this;
  }
  
  public Builder setIsPrefetchEnabledSupplier(Supplier<Boolean> paramSupplier)
  {
    mIsPrefetchEnabledSupplier = paramSupplier;
    return this;
  }
  
  public Builder setMainDiskCacheConfig(DiskCacheConfig paramDiskCacheConfig)
  {
    mMainDiskCacheConfig = paramDiskCacheConfig;
    return this;
  }
  
  public Builder setMemoryTrimmableRegistry(MemoryTrimmableRegistry paramMemoryTrimmableRegistry)
  {
    mMemoryTrimmableRegistry = paramMemoryTrimmableRegistry;
    return this;
  }
  
  public Builder setNetworkFetcher(NetworkFetcher paramNetworkFetcher)
  {
    mNetworkFetcher = paramNetworkFetcher;
    return this;
  }
  
  public Builder setPlatformBitmapFactory(PlatformBitmapFactory paramPlatformBitmapFactory)
  {
    mPlatformBitmapFactory = paramPlatformBitmapFactory;
    return this;
  }
  
  public Builder setPoolFactory(PoolFactory paramPoolFactory)
  {
    mPoolFactory = paramPoolFactory;
    return this;
  }
  
  public Builder setProgressiveJpegConfig(ProgressiveJpegConfig paramProgressiveJpegConfig)
  {
    mProgressiveJpegConfig = paramProgressiveJpegConfig;
    return this;
  }
  
  public Builder setRequestListeners(Set<RequestListener> paramSet)
  {
    mRequestListeners = paramSet;
    return this;
  }
  
  public Builder setResizeAndRotateEnabledForNetwork(boolean paramBoolean)
  {
    mResizeAndRotateEnabledForNetwork = paramBoolean;
    return this;
  }
  
  public Builder setSmallImageDiskCacheConfig(DiskCacheConfig paramDiskCacheConfig)
  {
    mSmallImageDiskCacheConfig = paramDiskCacheConfig;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.core.ImagePipelineConfig.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */