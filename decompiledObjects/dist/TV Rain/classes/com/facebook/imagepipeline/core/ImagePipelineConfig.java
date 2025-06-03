package com.facebook.imagepipeline.core;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap.Config;
import com.facebook.cache.disk.DiskCacheConfig;
import com.facebook.cache.disk.DiskCacheConfig.Builder;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.common.memory.NoOpMemoryTrimmableRegistry;
import com.facebook.common.webp.BitmapCreator;
import com.facebook.common.webp.WebpBitmapFactory;
import com.facebook.common.webp.WebpSupportStatus;
import com.facebook.imagepipeline.bitmaps.HoneycombBitmapCreator;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.cache.BitmapMemoryCacheTrimStrategy;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.CountingMemoryCache.CacheTrimStrategy;
import com.facebook.imagepipeline.cache.DefaultBitmapMemoryCacheParamsSupplier;
import com.facebook.imagepipeline.cache.DefaultCacheKeyFactory;
import com.facebook.imagepipeline.cache.DefaultEncodedMemoryCacheParamsSupplier;
import com.facebook.imagepipeline.cache.ImageCacheStatsTracker;
import com.facebook.imagepipeline.cache.MemoryCacheParams;
import com.facebook.imagepipeline.cache.NoOpImageCacheStatsTracker;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.decoder.ImageDecoderConfig;
import com.facebook.imagepipeline.decoder.ProgressiveJpegConfig;
import com.facebook.imagepipeline.decoder.SimpleProgressiveJpegConfig;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.memory.PoolConfig;
import com.facebook.imagepipeline.memory.PoolConfig.Builder;
import com.facebook.imagepipeline.memory.PoolFactory;
import com.facebook.imagepipeline.producers.HttpUrlConnectionNetworkFetcher;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class ImagePipelineConfig
{
  private static DefaultImageRequestConfig sDefaultImageRequestConfig = new DefaultImageRequestConfig(null);
  private final Bitmap.Config mBitmapConfig;
  private final Supplier<MemoryCacheParams> mBitmapMemoryCacheParamsSupplier;
  private final CountingMemoryCache.CacheTrimStrategy mBitmapMemoryCacheTrimStrategy;
  private final CacheKeyFactory mCacheKeyFactory;
  private final Context mContext;
  private final boolean mDownsampleEnabled;
  private final Supplier<MemoryCacheParams> mEncodedMemoryCacheParamsSupplier;
  private final ExecutorSupplier mExecutorSupplier;
  private final FileCacheFactory mFileCacheFactory;
  private final ImageCacheStatsTracker mImageCacheStatsTracker;
  @Nullable
  private final ImageDecoder mImageDecoder;
  @Nullable
  private final ImageDecoderConfig mImageDecoderConfig;
  private final ImagePipelineExperiments mImagePipelineExperiments;
  private final Supplier<Boolean> mIsPrefetchEnabledSupplier;
  private final DiskCacheConfig mMainDiskCacheConfig;
  private final MemoryTrimmableRegistry mMemoryTrimmableRegistry;
  private final NetworkFetcher mNetworkFetcher;
  @Nullable
  private final PlatformBitmapFactory mPlatformBitmapFactory;
  private final PoolFactory mPoolFactory;
  private final ProgressiveJpegConfig mProgressiveJpegConfig;
  private final Set<RequestListener> mRequestListeners;
  private final boolean mResizeAndRotateEnabledForNetwork;
  private final DiskCacheConfig mSmallImageDiskCacheConfig;
  
  private ImagePipelineConfig(Builder paramBuilder)
  {
    ImagePipelineExperiments localImagePipelineExperiments = Builder.access$100(paramBuilder).build();
    mImagePipelineExperiments = localImagePipelineExperiments;
    Object localObject1;
    if (Builder.access$200(paramBuilder) == null) {
      localObject1 = new DefaultBitmapMemoryCacheParamsSupplier((ActivityManager)Builder.access$300(paramBuilder).getSystemService("activity"));
    } else {
      localObject1 = Builder.access$200(paramBuilder);
    }
    mBitmapMemoryCacheParamsSupplier = ((Supplier)localObject1);
    if (Builder.access$400(paramBuilder) == null) {
      localObject1 = new BitmapMemoryCacheTrimStrategy();
    } else {
      localObject1 = Builder.access$400(paramBuilder);
    }
    mBitmapMemoryCacheTrimStrategy = ((CountingMemoryCache.CacheTrimStrategy)localObject1);
    if (Builder.access$500(paramBuilder) == null) {
      localObject1 = Bitmap.Config.ARGB_8888;
    } else {
      localObject1 = Builder.access$500(paramBuilder);
    }
    mBitmapConfig = ((Bitmap.Config)localObject1);
    if (Builder.access$600(paramBuilder) == null) {
      localObject1 = DefaultCacheKeyFactory.getInstance();
    } else {
      localObject1 = Builder.access$600(paramBuilder);
    }
    mCacheKeyFactory = ((CacheKeyFactory)localObject1);
    mContext = ((Context)Preconditions.checkNotNull(Builder.access$300(paramBuilder)));
    if (Builder.access$700(paramBuilder) == null) {
      localObject1 = new DiskStorageCacheFactory(new DynamicDefaultDiskStorageFactory());
    } else {
      localObject1 = Builder.access$700(paramBuilder);
    }
    mFileCacheFactory = ((FileCacheFactory)localObject1);
    mDownsampleEnabled = Builder.access$800(paramBuilder);
    if (Builder.access$900(paramBuilder) == null) {
      localObject1 = new DefaultEncodedMemoryCacheParamsSupplier();
    } else {
      localObject1 = Builder.access$900(paramBuilder);
    }
    mEncodedMemoryCacheParamsSupplier = ((Supplier)localObject1);
    if (Builder.access$1000(paramBuilder) == null) {
      localObject1 = NoOpImageCacheStatsTracker.getInstance();
    } else {
      localObject1 = Builder.access$1000(paramBuilder);
    }
    mImageCacheStatsTracker = ((ImageCacheStatsTracker)localObject1);
    mImageDecoder = Builder.access$1100(paramBuilder);
    if (Builder.access$1200(paramBuilder) == null) {
      localObject1 = new Supplier()
      {
        public Boolean get()
        {
          return Boolean.TRUE;
        }
      };
    } else {
      localObject1 = Builder.access$1200(paramBuilder);
    }
    mIsPrefetchEnabledSupplier = ((Supplier)localObject1);
    if (Builder.access$1300(paramBuilder) == null) {
      localObject1 = getDefaultMainDiskCacheConfig(Builder.access$300(paramBuilder));
    } else {
      localObject1 = Builder.access$1300(paramBuilder);
    }
    mMainDiskCacheConfig = ((DiskCacheConfig)localObject1);
    Object localObject2;
    if (Builder.access$1400(paramBuilder) == null) {
      localObject2 = NoOpMemoryTrimmableRegistry.getInstance();
    } else {
      localObject2 = Builder.access$1400(paramBuilder);
    }
    mMemoryTrimmableRegistry = ((MemoryTrimmableRegistry)localObject2);
    if (Builder.access$1500(paramBuilder) == null) {
      localObject2 = new HttpUrlConnectionNetworkFetcher();
    } else {
      localObject2 = Builder.access$1500(paramBuilder);
    }
    mNetworkFetcher = ((NetworkFetcher)localObject2);
    mPlatformBitmapFactory = Builder.access$1600(paramBuilder);
    if (Builder.access$1700(paramBuilder) == null) {
      localObject2 = new PoolFactory(PoolConfig.newBuilder().build());
    } else {
      localObject2 = Builder.access$1700(paramBuilder);
    }
    mPoolFactory = ((PoolFactory)localObject2);
    Object localObject3;
    if (Builder.access$1800(paramBuilder) == null) {
      localObject3 = new SimpleProgressiveJpegConfig();
    } else {
      localObject3 = Builder.access$1800(paramBuilder);
    }
    mProgressiveJpegConfig = ((ProgressiveJpegConfig)localObject3);
    if (Builder.access$1900(paramBuilder) == null) {
      localObject3 = new HashSet();
    } else {
      localObject3 = Builder.access$1900(paramBuilder);
    }
    mRequestListeners = ((Set)localObject3);
    mResizeAndRotateEnabledForNetwork = Builder.access$2000(paramBuilder);
    if (Builder.access$2100(paramBuilder) != null) {
      localObject1 = Builder.access$2100(paramBuilder);
    }
    mSmallImageDiskCacheConfig = ((DiskCacheConfig)localObject1);
    mImageDecoderConfig = Builder.access$2200(paramBuilder);
    int i = ((PoolFactory)localObject2).getFlexByteArrayPoolMaxNumThreads();
    if (Builder.access$2300(paramBuilder) == null) {
      paramBuilder = new DefaultExecutorSupplier(i);
    } else {
      paramBuilder = Builder.access$2300(paramBuilder);
    }
    mExecutorSupplier = paramBuilder;
    paramBuilder = localImagePipelineExperiments.getWebpBitmapFactory();
    if (paramBuilder != null)
    {
      setWebpBitmapFactory(paramBuilder, localImagePipelineExperiments, new HoneycombBitmapCreator(getPoolFactory()));
    }
    else if ((localImagePipelineExperiments.isWebpSupportEnabled()) && (WebpSupportStatus.sIsWebpSupportRequired))
    {
      paramBuilder = WebpSupportStatus.loadWebpBitmapFactoryIfExists();
      if (paramBuilder != null) {
        setWebpBitmapFactory(paramBuilder, localImagePipelineExperiments, new HoneycombBitmapCreator(getPoolFactory()));
      }
    }
  }
  
  public static DefaultImageRequestConfig getDefaultImageRequestConfig()
  {
    return sDefaultImageRequestConfig;
  }
  
  private static DiskCacheConfig getDefaultMainDiskCacheConfig(Context paramContext)
  {
    return DiskCacheConfig.newBuilder(paramContext).build();
  }
  
  public static Builder newBuilder(Context paramContext)
  {
    return new Builder(paramContext, null);
  }
  
  @VisibleForTesting
  public static void resetDefaultRequestConfig()
  {
    sDefaultImageRequestConfig = new DefaultImageRequestConfig(null);
  }
  
  private static void setWebpBitmapFactory(WebpBitmapFactory paramWebpBitmapFactory, ImagePipelineExperiments paramImagePipelineExperiments, BitmapCreator paramBitmapCreator)
  {
    WebpSupportStatus.sWebpBitmapFactory = paramWebpBitmapFactory;
    paramImagePipelineExperiments = paramImagePipelineExperiments.getWebpErrorLogger();
    if (paramImagePipelineExperiments != null) {
      paramWebpBitmapFactory.setWebpErrorLogger(paramImagePipelineExperiments);
    }
    if (paramBitmapCreator != null) {
      paramWebpBitmapFactory.setBitmapCreator(paramBitmapCreator);
    }
  }
  
  public Bitmap.Config getBitmapConfig()
  {
    return mBitmapConfig;
  }
  
  public Supplier<MemoryCacheParams> getBitmapMemoryCacheParamsSupplier()
  {
    return mBitmapMemoryCacheParamsSupplier;
  }
  
  public CountingMemoryCache.CacheTrimStrategy getBitmapMemoryCacheTrimStrategy()
  {
    return mBitmapMemoryCacheTrimStrategy;
  }
  
  public CacheKeyFactory getCacheKeyFactory()
  {
    return mCacheKeyFactory;
  }
  
  public Context getContext()
  {
    return mContext;
  }
  
  public Supplier<MemoryCacheParams> getEncodedMemoryCacheParamsSupplier()
  {
    return mEncodedMemoryCacheParamsSupplier;
  }
  
  public ExecutorSupplier getExecutorSupplier()
  {
    return mExecutorSupplier;
  }
  
  public ImagePipelineExperiments getExperiments()
  {
    return mImagePipelineExperiments;
  }
  
  public FileCacheFactory getFileCacheFactory()
  {
    return mFileCacheFactory;
  }
  
  public ImageCacheStatsTracker getImageCacheStatsTracker()
  {
    return mImageCacheStatsTracker;
  }
  
  @Nullable
  public ImageDecoder getImageDecoder()
  {
    return mImageDecoder;
  }
  
  @Nullable
  public ImageDecoderConfig getImageDecoderConfig()
  {
    return mImageDecoderConfig;
  }
  
  public Supplier<Boolean> getIsPrefetchEnabledSupplier()
  {
    return mIsPrefetchEnabledSupplier;
  }
  
  public DiskCacheConfig getMainDiskCacheConfig()
  {
    return mMainDiskCacheConfig;
  }
  
  public MemoryTrimmableRegistry getMemoryTrimmableRegistry()
  {
    return mMemoryTrimmableRegistry;
  }
  
  public NetworkFetcher getNetworkFetcher()
  {
    return mNetworkFetcher;
  }
  
  @Nullable
  public PlatformBitmapFactory getPlatformBitmapFactory()
  {
    return mPlatformBitmapFactory;
  }
  
  public PoolFactory getPoolFactory()
  {
    return mPoolFactory;
  }
  
  public ProgressiveJpegConfig getProgressiveJpegConfig()
  {
    return mProgressiveJpegConfig;
  }
  
  public Set<RequestListener> getRequestListeners()
  {
    return Collections.unmodifiableSet(mRequestListeners);
  }
  
  public DiskCacheConfig getSmallImageDiskCacheConfig()
  {
    return mSmallImageDiskCacheConfig;
  }
  
  public boolean isDownsampleEnabled()
  {
    return mDownsampleEnabled;
  }
  
  public boolean isResizeAndRotateEnabledForNetwork()
  {
    return mResizeAndRotateEnabledForNetwork;
  }
  
  public static class Builder
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
    
    private Builder(Context paramContext)
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
  
  public static class DefaultImageRequestConfig
  {
    private boolean mProgressiveRenderingEnabled = false;
    
    public boolean isProgressiveRenderingEnabled()
    {
      return mProgressiveRenderingEnabled;
    }
    
    public void setProgressiveRenderingEnabled(boolean paramBoolean)
    {
      mProgressiveRenderingEnabled = paramBoolean;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.core.ImagePipelineConfig
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */