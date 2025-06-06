package com.facebook.imagepipeline.core;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.common.memory.ByteArrayPool;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MediaVariationsIndex;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.decoder.ProgressiveJpegConfig;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.producers.AddImageTransformMetaDataProducer;
import com.facebook.imagepipeline.producers.BitmapMemoryCacheGetProducer;
import com.facebook.imagepipeline.producers.BitmapMemoryCacheKeyMultiplexProducer;
import com.facebook.imagepipeline.producers.BitmapMemoryCacheProducer;
import com.facebook.imagepipeline.producers.BitmapPrepareProducer;
import com.facebook.imagepipeline.producers.BranchOnSeparateImagesProducer;
import com.facebook.imagepipeline.producers.DataFetchProducer;
import com.facebook.imagepipeline.producers.DecodeProducer;
import com.facebook.imagepipeline.producers.DiskCacheReadProducer;
import com.facebook.imagepipeline.producers.DiskCacheWriteProducer;
import com.facebook.imagepipeline.producers.EncodedCacheKeyMultiplexProducer;
import com.facebook.imagepipeline.producers.EncodedMemoryCacheProducer;
import com.facebook.imagepipeline.producers.LocalAssetFetchProducer;
import com.facebook.imagepipeline.producers.LocalContentUriFetchProducer;
import com.facebook.imagepipeline.producers.LocalContentUriThumbnailFetchProducer;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.facebook.imagepipeline.producers.LocalFileFetchProducer;
import com.facebook.imagepipeline.producers.LocalResourceFetchProducer;
import com.facebook.imagepipeline.producers.LocalVideoThumbnailProducer;
import com.facebook.imagepipeline.producers.MediaVariationsFallbackProducer;
import com.facebook.imagepipeline.producers.NetworkFetchProducer;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.imagepipeline.producers.NullProducer;
import com.facebook.imagepipeline.producers.PartialDiskCacheProducer;
import com.facebook.imagepipeline.producers.PostprocessedBitmapMemoryCacheProducer;
import com.facebook.imagepipeline.producers.PostprocessorProducer;
import com.facebook.imagepipeline.producers.Producer;
import com.facebook.imagepipeline.producers.QualifiedResourceFetchProducer;
import com.facebook.imagepipeline.producers.ResizeAndRotateProducer;
import com.facebook.imagepipeline.producers.SwallowResultProducer;
import com.facebook.imagepipeline.producers.ThreadHandoffProducer;
import com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue;
import com.facebook.imagepipeline.producers.ThrottlingProducer;
import com.facebook.imagepipeline.producers.ThumbnailBranchProducer;
import com.facebook.imagepipeline.producers.ThumbnailProducer;
import com.facebook.imagepipeline.producers.WebpTranscodeProducer;
import java.util.concurrent.Executor;

public class ProducerFactory
{
  private static final int MAX_SIMULTANEOUS_REQUESTS = 5;
  private AssetManager mAssetManager;
  private final MemoryCache<CacheKey, CloseableImage> mBitmapMemoryCache;
  private boolean mBitmapPrepareToDrawForPrefetch;
  private final int mBitmapPrepareToDrawMaxSizeBytes;
  private final int mBitmapPrepareToDrawMinSizeBytes;
  private final ByteArrayPool mByteArrayPool;
  private final CacheKeyFactory mCacheKeyFactory;
  private ContentResolver mContentResolver;
  private final boolean mDecodeCancellationEnabled;
  private final BufferedDiskCache mDefaultBufferedDiskCache;
  private final boolean mDownsampleEnabled;
  private final MemoryCache<CacheKey, PooledByteBuffer> mEncodedMemoryCache;
  private final ExecutorSupplier mExecutorSupplier;
  private final Supplier<Boolean> mExperimentalSmartResizingEnabled;
  private final ImageDecoder mImageDecoder;
  private final MediaVariationsIndex mMediaVariationsIndex;
  private final PlatformBitmapFactory mPlatformBitmapFactory;
  private final PooledByteBufferFactory mPooledByteBufferFactory;
  private final ProgressiveJpegConfig mProgressiveJpegConfig;
  private final boolean mResizeAndRotateEnabledForNetwork;
  private Resources mResources;
  private final BufferedDiskCache mSmallImageBufferedDiskCache;
  
  public ProducerFactory(Context paramContext, ByteArrayPool paramByteArrayPool, ImageDecoder paramImageDecoder, ProgressiveJpegConfig paramProgressiveJpegConfig, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Supplier<Boolean> paramSupplier, ExecutorSupplier paramExecutorSupplier, PooledByteBufferFactory paramPooledByteBufferFactory, MemoryCache<CacheKey, CloseableImage> paramMemoryCache, MemoryCache<CacheKey, PooledByteBuffer> paramMemoryCache1, BufferedDiskCache paramBufferedDiskCache1, BufferedDiskCache paramBufferedDiskCache2, MediaVariationsIndex paramMediaVariationsIndex, CacheKeyFactory paramCacheKeyFactory, PlatformBitmapFactory paramPlatformBitmapFactory, int paramInt1, int paramInt2, boolean paramBoolean4)
  {
    mContentResolver = paramContext.getApplicationContext().getContentResolver();
    mResources = paramContext.getApplicationContext().getResources();
    mAssetManager = paramContext.getApplicationContext().getAssets();
    mByteArrayPool = paramByteArrayPool;
    mImageDecoder = paramImageDecoder;
    mProgressiveJpegConfig = paramProgressiveJpegConfig;
    mDownsampleEnabled = paramBoolean1;
    mResizeAndRotateEnabledForNetwork = paramBoolean2;
    mDecodeCancellationEnabled = paramBoolean3;
    mExperimentalSmartResizingEnabled = paramSupplier;
    mExecutorSupplier = paramExecutorSupplier;
    mPooledByteBufferFactory = paramPooledByteBufferFactory;
    mBitmapMemoryCache = paramMemoryCache;
    mEncodedMemoryCache = paramMemoryCache1;
    mDefaultBufferedDiskCache = paramBufferedDiskCache1;
    mSmallImageBufferedDiskCache = paramBufferedDiskCache2;
    mMediaVariationsIndex = paramMediaVariationsIndex;
    mCacheKeyFactory = paramCacheKeyFactory;
    mPlatformBitmapFactory = paramPlatformBitmapFactory;
    mBitmapPrepareToDrawMinSizeBytes = paramInt1;
    mBitmapPrepareToDrawMaxSizeBytes = paramInt2;
    mBitmapPrepareToDrawForPrefetch = paramBoolean4;
  }
  
  public static AddImageTransformMetaDataProducer newAddImageTransformMetaDataProducer(Producer<EncodedImage> paramProducer)
  {
    return new AddImageTransformMetaDataProducer(paramProducer);
  }
  
  public static BranchOnSeparateImagesProducer newBranchOnSeparateImagesProducer(Producer<EncodedImage> paramProducer1, Producer<EncodedImage> paramProducer2)
  {
    return new BranchOnSeparateImagesProducer(paramProducer1, paramProducer2);
  }
  
  public static <T> NullProducer<T> newNullProducer()
  {
    return new NullProducer();
  }
  
  public static <T> SwallowResultProducer<T> newSwallowResultProducer(Producer<T> paramProducer)
  {
    return new SwallowResultProducer(paramProducer);
  }
  
  public <T> ThreadHandoffProducer<T> newBackgroundThreadHandoffProducer(Producer<T> paramProducer, ThreadHandoffProducerQueue paramThreadHandoffProducerQueue)
  {
    return new ThreadHandoffProducer(paramProducer, paramThreadHandoffProducerQueue);
  }
  
  public BitmapMemoryCacheGetProducer newBitmapMemoryCacheGetProducer(Producer<CloseableReference<CloseableImage>> paramProducer)
  {
    return new BitmapMemoryCacheGetProducer(mBitmapMemoryCache, mCacheKeyFactory, paramProducer);
  }
  
  public BitmapMemoryCacheKeyMultiplexProducer newBitmapMemoryCacheKeyMultiplexProducer(Producer<CloseableReference<CloseableImage>> paramProducer)
  {
    return new BitmapMemoryCacheKeyMultiplexProducer(mCacheKeyFactory, paramProducer);
  }
  
  public BitmapMemoryCacheProducer newBitmapMemoryCacheProducer(Producer<CloseableReference<CloseableImage>> paramProducer)
  {
    return new BitmapMemoryCacheProducer(mBitmapMemoryCache, mCacheKeyFactory, paramProducer);
  }
  
  public BitmapPrepareProducer newBitmapPrepareProducer(Producer<CloseableReference<CloseableImage>> paramProducer)
  {
    return new BitmapPrepareProducer(paramProducer, mBitmapPrepareToDrawMinSizeBytes, mBitmapPrepareToDrawMaxSizeBytes, mBitmapPrepareToDrawForPrefetch);
  }
  
  public DataFetchProducer newDataFetchProducer()
  {
    return new DataFetchProducer(mPooledByteBufferFactory);
  }
  
  public DecodeProducer newDecodeProducer(Producer<EncodedImage> paramProducer)
  {
    return new DecodeProducer(mByteArrayPool, mExecutorSupplier.forDecode(), mImageDecoder, mProgressiveJpegConfig, mDownsampleEnabled, mResizeAndRotateEnabledForNetwork, mDecodeCancellationEnabled, paramProducer, mExperimentalSmartResizingEnabled);
  }
  
  public DiskCacheReadProducer newDiskCacheReadProducer(Producer<EncodedImage> paramProducer)
  {
    return new DiskCacheReadProducer(mDefaultBufferedDiskCache, mSmallImageBufferedDiskCache, mCacheKeyFactory, paramProducer);
  }
  
  public DiskCacheWriteProducer newDiskCacheWriteProducer(Producer<EncodedImage> paramProducer)
  {
    return new DiskCacheWriteProducer(mDefaultBufferedDiskCache, mSmallImageBufferedDiskCache, mCacheKeyFactory, paramProducer);
  }
  
  public EncodedCacheKeyMultiplexProducer newEncodedCacheKeyMultiplexProducer(Producer<EncodedImage> paramProducer)
  {
    return new EncodedCacheKeyMultiplexProducer(mCacheKeyFactory, paramProducer);
  }
  
  public EncodedMemoryCacheProducer newEncodedMemoryCacheProducer(Producer<EncodedImage> paramProducer)
  {
    return new EncodedMemoryCacheProducer(mEncodedMemoryCache, mCacheKeyFactory, paramProducer);
  }
  
  public LocalAssetFetchProducer newLocalAssetFetchProducer()
  {
    return new LocalAssetFetchProducer(mExecutorSupplier.forLocalStorageRead(), mPooledByteBufferFactory, mAssetManager);
  }
  
  public LocalContentUriFetchProducer newLocalContentUriFetchProducer()
  {
    return new LocalContentUriFetchProducer(mExecutorSupplier.forLocalStorageRead(), mPooledByteBufferFactory, mContentResolver);
  }
  
  public LocalContentUriThumbnailFetchProducer newLocalContentUriThumbnailFetchProducer()
  {
    return new LocalContentUriThumbnailFetchProducer(mExecutorSupplier.forLocalStorageRead(), mPooledByteBufferFactory, mContentResolver);
  }
  
  public LocalExifThumbnailProducer newLocalExifThumbnailProducer()
  {
    return new LocalExifThumbnailProducer(mExecutorSupplier.forLocalStorageRead(), mPooledByteBufferFactory, mContentResolver);
  }
  
  public LocalFileFetchProducer newLocalFileFetchProducer()
  {
    return new LocalFileFetchProducer(mExecutorSupplier.forLocalStorageRead(), mPooledByteBufferFactory);
  }
  
  public LocalResourceFetchProducer newLocalResourceFetchProducer()
  {
    return new LocalResourceFetchProducer(mExecutorSupplier.forLocalStorageRead(), mPooledByteBufferFactory, mResources);
  }
  
  public LocalVideoThumbnailProducer newLocalVideoThumbnailProducer()
  {
    return new LocalVideoThumbnailProducer(mExecutorSupplier.forLocalStorageRead(), mContentResolver);
  }
  
  public MediaVariationsFallbackProducer newMediaVariationsProducer(Producer<EncodedImage> paramProducer)
  {
    return new MediaVariationsFallbackProducer(mDefaultBufferedDiskCache, mSmallImageBufferedDiskCache, mCacheKeyFactory, mMediaVariationsIndex, paramProducer);
  }
  
  public NetworkFetchProducer newNetworkFetchProducer(NetworkFetcher paramNetworkFetcher)
  {
    return new NetworkFetchProducer(mPooledByteBufferFactory, mByteArrayPool, paramNetworkFetcher);
  }
  
  public PartialDiskCacheProducer newPartialDiskCacheProducer(Producer<EncodedImage> paramProducer)
  {
    return new PartialDiskCacheProducer(mDefaultBufferedDiskCache, mCacheKeyFactory, mPooledByteBufferFactory, mByteArrayPool, paramProducer);
  }
  
  public PostprocessedBitmapMemoryCacheProducer newPostprocessorBitmapMemoryCacheProducer(Producer<CloseableReference<CloseableImage>> paramProducer)
  {
    return new PostprocessedBitmapMemoryCacheProducer(mBitmapMemoryCache, mCacheKeyFactory, paramProducer);
  }
  
  public PostprocessorProducer newPostprocessorProducer(Producer<CloseableReference<CloseableImage>> paramProducer)
  {
    return new PostprocessorProducer(paramProducer, mPlatformBitmapFactory, mExecutorSupplier.forBackgroundTasks());
  }
  
  public QualifiedResourceFetchProducer newQualifiedResourceFetchProducer()
  {
    return new QualifiedResourceFetchProducer(mExecutorSupplier.forLocalStorageRead(), mPooledByteBufferFactory, mContentResolver);
  }
  
  public ResizeAndRotateProducer newResizeAndRotateProducer(Producer<EncodedImage> paramProducer, boolean paramBoolean1, boolean paramBoolean2)
  {
    Executor localExecutor = mExecutorSupplier.forBackgroundTasks();
    PooledByteBufferFactory localPooledByteBufferFactory = mPooledByteBufferFactory;
    if ((paramBoolean1) && (!mDownsampleEnabled)) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    return new ResizeAndRotateProducer(localExecutor, localPooledByteBufferFactory, paramBoolean1, paramProducer, paramBoolean2);
  }
  
  public <T> ThrottlingProducer<T> newThrottlingProducer(Producer<T> paramProducer)
  {
    return new ThrottlingProducer(5, mExecutorSupplier.forLightweightBackgroundTasks(), paramProducer);
  }
  
  public ThumbnailBranchProducer newThumbnailBranchProducer(ThumbnailProducer<EncodedImage>[] paramArrayOfThumbnailProducer)
  {
    return new ThumbnailBranchProducer(paramArrayOfThumbnailProducer);
  }
  
  public WebpTranscodeProducer newWebpTranscodeProducer(Producer<EncodedImage> paramProducer)
  {
    return new WebpTranscodeProducer(mExecutorSupplier.forBackgroundTasks(), mPooledByteBufferFactory, paramProducer);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.core.ProducerFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */