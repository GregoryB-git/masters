package com.facebook.imagepipeline.core;

import android.content.ContentResolver;
import android.net.Uri;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.media.MediaUtils;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.webp.WebpSupportStatus;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.producers.DataFetchProducer;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.imagepipeline.producers.Producer;
import com.facebook.imagepipeline.producers.RemoveImageTransformMetaDataProducer;
import com.facebook.imagepipeline.producers.SwallowResultProducer;
import com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue;
import com.facebook.imagepipeline.producers.ThumbnailProducer;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;
import java.util.HashMap;
import java.util.Map;
import z2;

public class ProducerSequenceFactory
{
  @VisibleForTesting
  public Producer<EncodedImage> mBackgroundLocalFileFetchToEncodedMemorySequence;
  @VisibleForTesting
  public Producer<EncodedImage> mBackgroundNetworkFetchToEncodedMemorySequence;
  @VisibleForTesting
  public Map<Producer<CloseableReference<CloseableImage>>, Producer<CloseableReference<CloseableImage>>> mBitmapPrepareSequences;
  @VisibleForTesting
  public Map<Producer<CloseableReference<CloseableImage>>, Producer<Void>> mCloseableImagePrefetchSequences;
  private Producer<EncodedImage> mCommonNetworkFetchToEncodedMemorySequence;
  private final ContentResolver mContentResolver;
  @VisibleForTesting
  public Producer<CloseableReference<CloseableImage>> mDataFetchSequence;
  @VisibleForTesting
  public Producer<CloseableReference<CloseableImage>> mLocalAssetFetchSequence;
  @VisibleForTesting
  public Producer<CloseableReference<CloseableImage>> mLocalContentUriFetchSequence;
  @VisibleForTesting
  public Producer<CloseableReference<PooledByteBuffer>> mLocalFileEncodedImageProducerSequence;
  @VisibleForTesting
  public Producer<Void> mLocalFileFetchToEncodedMemoryPrefetchSequence;
  @VisibleForTesting
  public Producer<CloseableReference<CloseableImage>> mLocalImageFileFetchSequence;
  @VisibleForTesting
  public Producer<CloseableReference<CloseableImage>> mLocalResourceFetchSequence;
  @VisibleForTesting
  public Producer<CloseableReference<CloseableImage>> mLocalVideoFileFetchSequence;
  @VisibleForTesting
  public Producer<CloseableReference<PooledByteBuffer>> mNetworkEncodedImageProducerSequence;
  @VisibleForTesting
  public Producer<CloseableReference<CloseableImage>> mNetworkFetchSequence;
  @VisibleForTesting
  public Producer<Void> mNetworkFetchToEncodedMemoryPrefetchSequence;
  private final NetworkFetcher mNetworkFetcher;
  private final boolean mPartialImageCachingEnabled;
  @VisibleForTesting
  public Map<Producer<CloseableReference<CloseableImage>>, Producer<CloseableReference<CloseableImage>>> mPostprocessorSequences;
  private final ProducerFactory mProducerFactory;
  @VisibleForTesting
  public Producer<CloseableReference<CloseableImage>> mQualifiedResourceFetchSequence;
  private final boolean mResizeAndRotateEnabledForNetwork;
  private final ThreadHandoffProducerQueue mThreadHandoffProducerQueue;
  private final boolean mUseBitmapPrepareToDraw;
  private final boolean mUseDownsamplingRatio;
  private final boolean mWebpSupportEnabled;
  
  public ProducerSequenceFactory(ContentResolver paramContentResolver, ProducerFactory paramProducerFactory, NetworkFetcher paramNetworkFetcher, boolean paramBoolean1, boolean paramBoolean2, ThreadHandoffProducerQueue paramThreadHandoffProducerQueue, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5)
  {
    mContentResolver = paramContentResolver;
    mProducerFactory = paramProducerFactory;
    mNetworkFetcher = paramNetworkFetcher;
    mResizeAndRotateEnabledForNetwork = paramBoolean1;
    mWebpSupportEnabled = paramBoolean2;
    mPostprocessorSequences = new HashMap();
    mCloseableImagePrefetchSequences = new HashMap();
    mBitmapPrepareSequences = new HashMap();
    mThreadHandoffProducerQueue = paramThreadHandoffProducerQueue;
    mUseDownsamplingRatio = paramBoolean3;
    mUseBitmapPrepareToDraw = paramBoolean4;
    mPartialImageCachingEnabled = paramBoolean5;
  }
  
  private Producer<EncodedImage> getBackgroundLocalFileFetchToEncodeMemorySequence()
  {
    try
    {
      if (mBackgroundLocalFileFetchToEncodedMemorySequence == null)
      {
        localProducer = newEncodedCacheMultiplexToTranscodeSequence(mProducerFactory.newLocalFileFetchProducer());
        mBackgroundLocalFileFetchToEncodedMemorySequence = mProducerFactory.newBackgroundThreadHandoffProducer(localProducer, mThreadHandoffProducerQueue);
      }
      Producer localProducer = mBackgroundLocalFileFetchToEncodedMemorySequence;
      return localProducer;
    }
    finally {}
  }
  
  private Producer<EncodedImage> getBackgroundNetworkFetchToEncodedMemorySequence()
  {
    try
    {
      if (mBackgroundNetworkFetchToEncodedMemorySequence == null) {
        mBackgroundNetworkFetchToEncodedMemorySequence = mProducerFactory.newBackgroundThreadHandoffProducer(getCommonNetworkFetchToEncodedMemorySequence(), mThreadHandoffProducerQueue);
      }
      Producer localProducer = mBackgroundNetworkFetchToEncodedMemorySequence;
      return localProducer;
    }
    finally {}
  }
  
  private Producer<CloseableReference<CloseableImage>> getBasicDecodedImageSequence(ImageRequest paramImageRequest)
  {
    Preconditions.checkNotNull(paramImageRequest);
    Uri localUri = paramImageRequest.getSourceUri();
    Preconditions.checkNotNull(localUri, "Uri is null.");
    int i = paramImageRequest.getSourceUriType();
    if (i != 0)
    {
      switch (i)
      {
      default: 
        paramImageRequest = z2.t("Unsupported uri scheme! Uri is: ");
        paramImageRequest.append(getShortenedUriString(localUri));
        throw new IllegalArgumentException(paramImageRequest.toString());
      case 8: 
        return getQualifiedResourceFetchSequence();
      case 7: 
        return getDataFetchSequence();
      case 6: 
        return getLocalResourceFetchSequence();
      case 5: 
        return getLocalAssetFetchSequence();
      case 4: 
        if (MediaUtils.isVideo(mContentResolver.getType(localUri))) {
          return getLocalVideoFileFetchSequence();
        }
        return getLocalContentUriFetchSequence();
      case 3: 
        return getLocalImageFileFetchSequence();
      }
      return getLocalVideoFileFetchSequence();
    }
    return getNetworkFetchSequence();
  }
  
  private Producer<CloseableReference<CloseableImage>> getBitmapPrepareSequence(Producer<CloseableReference<CloseableImage>> paramProducer)
  {
    try
    {
      Producer localProducer = (Producer)mBitmapPrepareSequences.get(paramProducer);
      Object localObject = localProducer;
      if (localProducer == null)
      {
        localObject = mProducerFactory.newBitmapPrepareProducer(paramProducer);
        mBitmapPrepareSequences.put(paramProducer, localObject);
      }
      return (Producer<CloseableReference<CloseableImage>>)localObject;
    }
    finally {}
  }
  
  private Producer<EncodedImage> getCommonNetworkFetchToEncodedMemorySequence()
  {
    try
    {
      if (mCommonNetworkFetchToEncodedMemorySequence == null)
      {
        localObject1 = ProducerFactory.newAddImageTransformMetaDataProducer(newEncodedCacheMultiplexToTranscodeSequence(mProducerFactory.newNetworkFetchProducer(mNetworkFetcher)));
        mCommonNetworkFetchToEncodedMemorySequence = ((Producer)localObject1);
        mCommonNetworkFetchToEncodedMemorySequence = mProducerFactory.newResizeAndRotateProducer((Producer)localObject1, mResizeAndRotateEnabledForNetwork, mUseDownsamplingRatio);
      }
      Object localObject1 = mCommonNetworkFetchToEncodedMemorySequence;
      return (Producer<EncodedImage>)localObject1;
    }
    finally {}
  }
  
  private Producer<CloseableReference<CloseableImage>> getDataFetchSequence()
  {
    try
    {
      if (mDataFetchSequence == null)
      {
        DataFetchProducer localDataFetchProducer = mProducerFactory.newDataFetchProducer();
        localObject1 = localDataFetchProducer;
        if (WebpSupportStatus.sIsWebpSupportRequired) {
          if (mWebpSupportEnabled)
          {
            localObject1 = localDataFetchProducer;
            if (WebpSupportStatus.sWebpBitmapFactory != null) {}
          }
          else
          {
            localObject1 = mProducerFactory.newWebpTranscodeProducer(localDataFetchProducer);
          }
        }
        localObject1 = ProducerFactory.newAddImageTransformMetaDataProducer((Producer)localObject1);
        mDataFetchSequence = newBitmapCacheGetToDecodeSequence(mProducerFactory.newResizeAndRotateProducer((Producer)localObject1, true, mUseDownsamplingRatio));
      }
      Object localObject1 = mDataFetchSequence;
      return (Producer<CloseableReference<CloseableImage>>)localObject1;
    }
    finally {}
  }
  
  private Producer<Void> getDecodedImagePrefetchSequence(Producer<CloseableReference<CloseableImage>> paramProducer)
  {
    try
    {
      if (!mCloseableImagePrefetchSequences.containsKey(paramProducer))
      {
        SwallowResultProducer localSwallowResultProducer = ProducerFactory.newSwallowResultProducer(paramProducer);
        mCloseableImagePrefetchSequences.put(paramProducer, localSwallowResultProducer);
      }
      paramProducer = (Producer)mCloseableImagePrefetchSequences.get(paramProducer);
      return paramProducer;
    }
    finally {}
  }
  
  private Producer<CloseableReference<CloseableImage>> getLocalAssetFetchSequence()
  {
    try
    {
      if (mLocalAssetFetchSequence == null) {
        mLocalAssetFetchSequence = newBitmapCacheGetToLocalTransformSequence(mProducerFactory.newLocalAssetFetchProducer());
      }
      Producer localProducer = mLocalAssetFetchSequence;
      return localProducer;
    }
    finally {}
  }
  
  private Producer<CloseableReference<CloseableImage>> getLocalContentUriFetchSequence()
  {
    try
    {
      if (mLocalContentUriFetchSequence == null) {
        mLocalContentUriFetchSequence = newBitmapCacheGetToLocalTransformSequence(mProducerFactory.newLocalContentUriFetchProducer(), new ThumbnailProducer[] { mProducerFactory.newLocalContentUriThumbnailFetchProducer(), mProducerFactory.newLocalExifThumbnailProducer() });
      }
      Producer localProducer = mLocalContentUriFetchSequence;
      return localProducer;
    }
    finally {}
  }
  
  private Producer<Void> getLocalFileFetchToEncodedMemoryPrefetchSequence()
  {
    try
    {
      if (mLocalFileFetchToEncodedMemoryPrefetchSequence == null) {
        mLocalFileFetchToEncodedMemoryPrefetchSequence = ProducerFactory.newSwallowResultProducer(getBackgroundLocalFileFetchToEncodeMemorySequence());
      }
      Producer localProducer = mLocalFileFetchToEncodedMemoryPrefetchSequence;
      return localProducer;
    }
    finally {}
  }
  
  private Producer<CloseableReference<CloseableImage>> getLocalImageFileFetchSequence()
  {
    try
    {
      if (mLocalImageFileFetchSequence == null) {
        mLocalImageFileFetchSequence = newBitmapCacheGetToLocalTransformSequence(mProducerFactory.newLocalFileFetchProducer());
      }
      Producer localProducer = mLocalImageFileFetchSequence;
      return localProducer;
    }
    finally {}
  }
  
  private Producer<CloseableReference<CloseableImage>> getLocalResourceFetchSequence()
  {
    try
    {
      if (mLocalResourceFetchSequence == null) {
        mLocalResourceFetchSequence = newBitmapCacheGetToLocalTransformSequence(mProducerFactory.newLocalResourceFetchProducer());
      }
      Producer localProducer = mLocalResourceFetchSequence;
      return localProducer;
    }
    finally {}
  }
  
  private Producer<CloseableReference<CloseableImage>> getLocalVideoFileFetchSequence()
  {
    try
    {
      if (mLocalVideoFileFetchSequence == null) {
        mLocalVideoFileFetchSequence = newBitmapCacheGetToBitmapCacheSequence(mProducerFactory.newLocalVideoThumbnailProducer());
      }
      Producer localProducer = mLocalVideoFileFetchSequence;
      return localProducer;
    }
    finally {}
  }
  
  private Producer<CloseableReference<CloseableImage>> getNetworkFetchSequence()
  {
    try
    {
      if (mNetworkFetchSequence == null) {
        mNetworkFetchSequence = newBitmapCacheGetToDecodeSequence(getCommonNetworkFetchToEncodedMemorySequence());
      }
      Producer localProducer = mNetworkFetchSequence;
      return localProducer;
    }
    finally {}
  }
  
  private Producer<Void> getNetworkFetchToEncodedMemoryPrefetchSequence()
  {
    try
    {
      if (mNetworkFetchToEncodedMemoryPrefetchSequence == null) {
        mNetworkFetchToEncodedMemoryPrefetchSequence = ProducerFactory.newSwallowResultProducer(getBackgroundNetworkFetchToEncodedMemorySequence());
      }
      Producer localProducer = mNetworkFetchToEncodedMemoryPrefetchSequence;
      return localProducer;
    }
    finally {}
  }
  
  private Producer<CloseableReference<CloseableImage>> getPostprocessorSequence(Producer<CloseableReference<CloseableImage>> paramProducer)
  {
    try
    {
      if (!mPostprocessorSequences.containsKey(paramProducer))
      {
        Object localObject = mProducerFactory.newPostprocessorProducer(paramProducer);
        localObject = mProducerFactory.newPostprocessorBitmapMemoryCacheProducer((Producer)localObject);
        mPostprocessorSequences.put(paramProducer, localObject);
      }
      paramProducer = (Producer)mPostprocessorSequences.get(paramProducer);
      return paramProducer;
    }
    finally {}
  }
  
  private Producer<CloseableReference<CloseableImage>> getQualifiedResourceFetchSequence()
  {
    try
    {
      if (mQualifiedResourceFetchSequence == null) {
        mQualifiedResourceFetchSequence = newBitmapCacheGetToLocalTransformSequence(mProducerFactory.newQualifiedResourceFetchProducer());
      }
      Producer localProducer = mQualifiedResourceFetchSequence;
      return localProducer;
    }
    finally {}
  }
  
  private static String getShortenedUriString(Uri paramUri)
  {
    String str = String.valueOf(paramUri);
    paramUri = str;
    if (str.length() > 30)
    {
      paramUri = new StringBuilder();
      paramUri.append(str.substring(0, 30));
      paramUri.append("...");
      paramUri = paramUri.toString();
    }
    return paramUri;
  }
  
  private Producer<CloseableReference<CloseableImage>> newBitmapCacheGetToBitmapCacheSequence(Producer<CloseableReference<CloseableImage>> paramProducer)
  {
    paramProducer = mProducerFactory.newBitmapMemoryCacheProducer(paramProducer);
    paramProducer = mProducerFactory.newBitmapMemoryCacheKeyMultiplexProducer(paramProducer);
    paramProducer = mProducerFactory.newBackgroundThreadHandoffProducer(paramProducer, mThreadHandoffProducerQueue);
    return mProducerFactory.newBitmapMemoryCacheGetProducer(paramProducer);
  }
  
  private Producer<CloseableReference<CloseableImage>> newBitmapCacheGetToDecodeSequence(Producer<EncodedImage> paramProducer)
  {
    return newBitmapCacheGetToBitmapCacheSequence(mProducerFactory.newDecodeProducer(paramProducer));
  }
  
  private Producer<CloseableReference<CloseableImage>> newBitmapCacheGetToLocalTransformSequence(Producer<EncodedImage> paramProducer)
  {
    return newBitmapCacheGetToLocalTransformSequence(paramProducer, new ThumbnailProducer[] { mProducerFactory.newLocalExifThumbnailProducer() });
  }
  
  private Producer<CloseableReference<CloseableImage>> newBitmapCacheGetToLocalTransformSequence(Producer<EncodedImage> paramProducer, ThumbnailProducer<EncodedImage>[] paramArrayOfThumbnailProducer)
  {
    return newBitmapCacheGetToDecodeSequence(newLocalTransformationsSequence(newEncodedCacheMultiplexToTranscodeSequence(paramProducer), paramArrayOfThumbnailProducer));
  }
  
  private Producer<EncodedImage> newDiskCacheSequence(Producer<EncodedImage> paramProducer)
  {
    if (mPartialImageCachingEnabled)
    {
      paramProducer = mProducerFactory.newPartialDiskCacheProducer(paramProducer);
      paramProducer = mProducerFactory.newDiskCacheWriteProducer(paramProducer);
    }
    else
    {
      paramProducer = mProducerFactory.newDiskCacheWriteProducer(paramProducer);
    }
    paramProducer = mProducerFactory.newMediaVariationsProducer(paramProducer);
    return mProducerFactory.newDiskCacheReadProducer(paramProducer);
  }
  
  private Producer<EncodedImage> newEncodedCacheMultiplexToTranscodeSequence(Producer<EncodedImage> paramProducer)
  {
    Object localObject = paramProducer;
    if (WebpSupportStatus.sIsWebpSupportRequired) {
      if (mWebpSupportEnabled)
      {
        localObject = paramProducer;
        if (WebpSupportStatus.sWebpBitmapFactory != null) {}
      }
      else
      {
        localObject = mProducerFactory.newWebpTranscodeProducer(paramProducer);
      }
    }
    paramProducer = newDiskCacheSequence((Producer)localObject);
    paramProducer = mProducerFactory.newEncodedMemoryCacheProducer(paramProducer);
    return mProducerFactory.newEncodedCacheKeyMultiplexProducer(paramProducer);
  }
  
  private Producer<EncodedImage> newLocalThumbnailProducer(ThumbnailProducer<EncodedImage>[] paramArrayOfThumbnailProducer)
  {
    paramArrayOfThumbnailProducer = mProducerFactory.newThumbnailBranchProducer(paramArrayOfThumbnailProducer);
    return mProducerFactory.newResizeAndRotateProducer(paramArrayOfThumbnailProducer, true, mUseDownsamplingRatio);
  }
  
  private Producer<EncodedImage> newLocalTransformationsSequence(Producer<EncodedImage> paramProducer, ThumbnailProducer<EncodedImage>[] paramArrayOfThumbnailProducer)
  {
    paramProducer = ProducerFactory.newAddImageTransformMetaDataProducer(paramProducer);
    paramProducer = mProducerFactory.newResizeAndRotateProducer(paramProducer, true, mUseDownsamplingRatio);
    paramProducer = mProducerFactory.newThrottlingProducer(paramProducer);
    return ProducerFactory.newBranchOnSeparateImagesProducer(newLocalThumbnailProducer(paramArrayOfThumbnailProducer), paramProducer);
  }
  
  private static void validateEncodedImageRequest(ImageRequest paramImageRequest)
  {
    Preconditions.checkNotNull(paramImageRequest);
    boolean bool;
    if (paramImageRequest.getLowestPermittedRequestLevel().getValue() <= ImageRequest.RequestLevel.ENCODED_MEMORY_CACHE.getValue()) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool);
  }
  
  public Producer<Void> getDecodedImagePrefetchProducerSequence(ImageRequest paramImageRequest)
  {
    Producer localProducer = getBasicDecodedImageSequence(paramImageRequest);
    paramImageRequest = localProducer;
    if (mUseBitmapPrepareToDraw) {
      paramImageRequest = getBitmapPrepareSequence(localProducer);
    }
    return getDecodedImagePrefetchSequence(paramImageRequest);
  }
  
  public Producer<CloseableReference<CloseableImage>> getDecodedImageProducerSequence(ImageRequest paramImageRequest)
  {
    Producer localProducer1 = getBasicDecodedImageSequence(paramImageRequest);
    Producer localProducer2 = localProducer1;
    if (paramImageRequest.getPostprocessor() != null) {
      localProducer2 = getPostprocessorSequence(localProducer1);
    }
    paramImageRequest = localProducer2;
    if (mUseBitmapPrepareToDraw) {
      paramImageRequest = getBitmapPrepareSequence(localProducer2);
    }
    return paramImageRequest;
  }
  
  public Producer<Void> getEncodedImagePrefetchProducerSequence(ImageRequest paramImageRequest)
  {
    validateEncodedImageRequest(paramImageRequest);
    int i = paramImageRequest.getSourceUriType();
    if (i != 0)
    {
      if ((i != 2) && (i != 3))
      {
        Uri localUri = paramImageRequest.getSourceUri();
        paramImageRequest = z2.t("Unsupported uri scheme for encoded image fetch! Uri is: ");
        paramImageRequest.append(getShortenedUriString(localUri));
        throw new IllegalArgumentException(paramImageRequest.toString());
      }
      return getLocalFileFetchToEncodedMemoryPrefetchSequence();
    }
    return getNetworkFetchToEncodedMemoryPrefetchSequence();
  }
  
  public Producer<CloseableReference<PooledByteBuffer>> getEncodedImageProducerSequence(ImageRequest paramImageRequest)
  {
    validateEncodedImageRequest(paramImageRequest);
    Uri localUri = paramImageRequest.getSourceUri();
    int i = paramImageRequest.getSourceUriType();
    if (i != 0)
    {
      if ((i != 2) && (i != 3))
      {
        paramImageRequest = z2.t("Unsupported uri scheme for encoded image fetch! Uri is: ");
        paramImageRequest.append(getShortenedUriString(localUri));
        throw new IllegalArgumentException(paramImageRequest.toString());
      }
      return getLocalFileFetchEncodedImageProducerSequence();
    }
    return getNetworkFetchEncodedImageProducerSequence();
  }
  
  public Producer<CloseableReference<PooledByteBuffer>> getLocalFileFetchEncodedImageProducerSequence()
  {
    try
    {
      if (mLocalFileEncodedImageProducerSequence == null)
      {
        RemoveImageTransformMetaDataProducer localRemoveImageTransformMetaDataProducer = new com/facebook/imagepipeline/producers/RemoveImageTransformMetaDataProducer;
        localRemoveImageTransformMetaDataProducer.<init>(getBackgroundLocalFileFetchToEncodeMemorySequence());
        mLocalFileEncodedImageProducerSequence = localRemoveImageTransformMetaDataProducer;
      }
      return mLocalFileEncodedImageProducerSequence;
    }
    finally {}
  }
  
  public Producer<CloseableReference<PooledByteBuffer>> getNetworkFetchEncodedImageProducerSequence()
  {
    try
    {
      if (mNetworkEncodedImageProducerSequence == null)
      {
        RemoveImageTransformMetaDataProducer localRemoveImageTransformMetaDataProducer = new com/facebook/imagepipeline/producers/RemoveImageTransformMetaDataProducer;
        localRemoveImageTransformMetaDataProducer.<init>(getBackgroundNetworkFetchToEncodedMemorySequence());
        mNetworkEncodedImageProducerSequence = localRemoveImageTransformMetaDataProducer;
      }
      return mNetworkEncodedImageProducerSequence;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.core.ProducerSequenceFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */