package com.facebook.imagepipeline.request;

import android.net.Uri;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.core.ImagePipelineConfig.DefaultImageRequestConfig;
import com.facebook.imagepipeline.listener.RequestListener;
import javax.annotation.Nullable;
import z2;

public class ImageRequestBuilder
{
  @Nullable
  private BytesRange mBytesRange = null;
  private ImageRequest.CacheChoice mCacheChoice = ImageRequest.CacheChoice.DEFAULT;
  private boolean mDiskCacheEnabled = true;
  private ImageDecodeOptions mImageDecodeOptions = ImageDecodeOptions.defaults();
  private boolean mLocalThumbnailPreviewsEnabled = false;
  private ImageRequest.RequestLevel mLowestPermittedRequestLevel = ImageRequest.RequestLevel.FULL_FETCH;
  @Nullable
  private MediaVariations mMediaVariations = null;
  @Nullable
  private Postprocessor mPostprocessor = null;
  private boolean mProgressiveRenderingEnabled = ImagePipelineConfig.getDefaultImageRequestConfig().isProgressiveRenderingEnabled();
  @Nullable
  private RequestListener mRequestListener;
  private Priority mRequestPriority = Priority.HIGH;
  @Nullable
  private ResizeOptions mResizeOptions = null;
  @Nullable
  private RotationOptions mRotationOptions = null;
  private Uri mSourceUri = null;
  
  public static ImageRequestBuilder fromRequest(ImageRequest paramImageRequest)
  {
    return newBuilderWithSource(paramImageRequest.getSourceUri()).setImageDecodeOptions(paramImageRequest.getImageDecodeOptions()).setBytesRange(paramImageRequest.getBytesRange()).setCacheChoice(paramImageRequest.getCacheChoice()).setLocalThumbnailPreviewsEnabled(paramImageRequest.getLocalThumbnailPreviewsEnabled()).setLowestPermittedRequestLevel(paramImageRequest.getLowestPermittedRequestLevel()).setMediaVariations(paramImageRequest.getMediaVariations()).setPostprocessor(paramImageRequest.getPostprocessor()).setProgressiveRenderingEnabled(paramImageRequest.getProgressiveRenderingEnabled()).setRequestPriority(paramImageRequest.getPriority()).setResizeOptions(paramImageRequest.getResizeOptions()).setRequestListener(paramImageRequest.getRequestListener()).setRotationOptions(paramImageRequest.getRotationOptions());
  }
  
  public static ImageRequestBuilder newBuilderWithResourceId(int paramInt)
  {
    return newBuilderWithSource(UriUtil.getUriForResourceId(paramInt));
  }
  
  public static ImageRequestBuilder newBuilderWithSource(Uri paramUri)
  {
    return new ImageRequestBuilder().setSource(paramUri);
  }
  
  public ImageRequest build()
  {
    validate();
    return new ImageRequest(this);
  }
  
  public ImageRequestBuilder disableDiskCache()
  {
    mDiskCacheEnabled = false;
    return this;
  }
  
  @Nullable
  public BytesRange getBytesRange()
  {
    return mBytesRange;
  }
  
  public ImageRequest.CacheChoice getCacheChoice()
  {
    return mCacheChoice;
  }
  
  public ImageDecodeOptions getImageDecodeOptions()
  {
    return mImageDecodeOptions;
  }
  
  public ImageRequest.RequestLevel getLowestPermittedRequestLevel()
  {
    return mLowestPermittedRequestLevel;
  }
  
  @Nullable
  public MediaVariations getMediaVariations()
  {
    return mMediaVariations;
  }
  
  @Nullable
  public Postprocessor getPostprocessor()
  {
    return mPostprocessor;
  }
  
  @Nullable
  public RequestListener getRequestListener()
  {
    return mRequestListener;
  }
  
  public Priority getRequestPriority()
  {
    return mRequestPriority;
  }
  
  @Nullable
  public ResizeOptions getResizeOptions()
  {
    return mResizeOptions;
  }
  
  @Nullable
  public RotationOptions getRotationOptions()
  {
    return mRotationOptions;
  }
  
  public Uri getSourceUri()
  {
    return mSourceUri;
  }
  
  public boolean isDiskCacheEnabled()
  {
    boolean bool;
    if ((mDiskCacheEnabled) && (UriUtil.isNetworkUri(mSourceUri))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isLocalThumbnailPreviewsEnabled()
  {
    return mLocalThumbnailPreviewsEnabled;
  }
  
  public boolean isProgressiveRenderingEnabled()
  {
    return mProgressiveRenderingEnabled;
  }
  
  @Deprecated
  public ImageRequestBuilder setAutoRotateEnabled(boolean paramBoolean)
  {
    if (paramBoolean) {
      return setRotationOptions(RotationOptions.autoRotate());
    }
    return setRotationOptions(RotationOptions.disableRotation());
  }
  
  public ImageRequestBuilder setBytesRange(@Nullable BytesRange paramBytesRange)
  {
    mBytesRange = paramBytesRange;
    return this;
  }
  
  public ImageRequestBuilder setCacheChoice(ImageRequest.CacheChoice paramCacheChoice)
  {
    mCacheChoice = paramCacheChoice;
    return this;
  }
  
  public ImageRequestBuilder setImageDecodeOptions(ImageDecodeOptions paramImageDecodeOptions)
  {
    mImageDecodeOptions = paramImageDecodeOptions;
    return this;
  }
  
  public ImageRequestBuilder setLocalThumbnailPreviewsEnabled(boolean paramBoolean)
  {
    mLocalThumbnailPreviewsEnabled = paramBoolean;
    return this;
  }
  
  public ImageRequestBuilder setLowestPermittedRequestLevel(ImageRequest.RequestLevel paramRequestLevel)
  {
    mLowestPermittedRequestLevel = paramRequestLevel;
    return this;
  }
  
  public ImageRequestBuilder setMediaVariations(MediaVariations paramMediaVariations)
  {
    mMediaVariations = paramMediaVariations;
    return this;
  }
  
  public ImageRequestBuilder setMediaVariationsForMediaId(String paramString)
  {
    return setMediaVariations(MediaVariations.forMediaId(paramString));
  }
  
  public ImageRequestBuilder setPostprocessor(Postprocessor paramPostprocessor)
  {
    mPostprocessor = paramPostprocessor;
    return this;
  }
  
  public ImageRequestBuilder setProgressiveRenderingEnabled(boolean paramBoolean)
  {
    mProgressiveRenderingEnabled = paramBoolean;
    return this;
  }
  
  public ImageRequestBuilder setRequestListener(RequestListener paramRequestListener)
  {
    mRequestListener = paramRequestListener;
    return this;
  }
  
  public ImageRequestBuilder setRequestPriority(Priority paramPriority)
  {
    mRequestPriority = paramPriority;
    return this;
  }
  
  public ImageRequestBuilder setResizeOptions(@Nullable ResizeOptions paramResizeOptions)
  {
    mResizeOptions = paramResizeOptions;
    return this;
  }
  
  public ImageRequestBuilder setRotationOptions(@Nullable RotationOptions paramRotationOptions)
  {
    mRotationOptions = paramRotationOptions;
    return this;
  }
  
  public ImageRequestBuilder setSource(Uri paramUri)
  {
    Preconditions.checkNotNull(paramUri);
    mSourceUri = paramUri;
    return this;
  }
  
  public void validate()
  {
    Uri localUri = mSourceUri;
    if (localUri != null)
    {
      if (UriUtil.isLocalResourceUri(localUri)) {
        if (mSourceUri.isAbsolute())
        {
          if (!mSourceUri.getPath().isEmpty()) {
            try
            {
              Integer.parseInt(mSourceUri.getPath().substring(1));
            }
            catch (NumberFormatException localNumberFormatException)
            {
              throw new BuilderException("Resource URI path must be a resource id.");
            }
          } else {
            throw new BuilderException("Resource URI must not be empty");
          }
        }
        else {
          throw new BuilderException("Resource URI path must be absolute.");
        }
      }
      if ((UriUtil.isLocalAssetUri(mSourceUri)) && (!mSourceUri.isAbsolute())) {
        throw new BuilderException("Asset URI path must be absolute.");
      }
      return;
    }
    throw new BuilderException("Source must be set!");
  }
  
  public static class BuilderException
    extends RuntimeException
  {
    public BuilderException(String paramString)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.request.ImageRequestBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */