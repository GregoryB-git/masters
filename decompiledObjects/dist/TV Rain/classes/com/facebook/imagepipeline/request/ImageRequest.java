package com.facebook.imagepipeline.request;

import android.net.Uri;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Objects.ToStringHelper;
import com.facebook.common.media.MediaUtils;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.listener.RequestListener;
import java.io.File;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
public class ImageRequest
{
  @Nullable
  private final BytesRange mBytesRange;
  private final CacheChoice mCacheChoice;
  private final ImageDecodeOptions mImageDecodeOptions;
  private final boolean mIsDiskCacheEnabled;
  private final boolean mLocalThumbnailPreviewsEnabled;
  private final RequestLevel mLowestPermittedRequestLevel;
  @Nullable
  private final MediaVariations mMediaVariations;
  private final Postprocessor mPostprocessor;
  private final boolean mProgressiveRenderingEnabled;
  @Nullable
  private final RequestListener mRequestListener;
  private final Priority mRequestPriority;
  @Nullable
  private final ResizeOptions mResizeOptions;
  private final RotationOptions mRotationOptions;
  private File mSourceFile;
  private final Uri mSourceUri;
  private final int mSourceUriType;
  
  public ImageRequest(ImageRequestBuilder paramImageRequestBuilder)
  {
    mCacheChoice = paramImageRequestBuilder.getCacheChoice();
    Object localObject = paramImageRequestBuilder.getSourceUri();
    mSourceUri = ((Uri)localObject);
    mSourceUriType = getSourceUriType((Uri)localObject);
    mMediaVariations = paramImageRequestBuilder.getMediaVariations();
    mProgressiveRenderingEnabled = paramImageRequestBuilder.isProgressiveRenderingEnabled();
    mLocalThumbnailPreviewsEnabled = paramImageRequestBuilder.isLocalThumbnailPreviewsEnabled();
    mImageDecodeOptions = paramImageRequestBuilder.getImageDecodeOptions();
    mResizeOptions = paramImageRequestBuilder.getResizeOptions();
    if (paramImageRequestBuilder.getRotationOptions() == null) {
      localObject = RotationOptions.autoRotate();
    } else {
      localObject = paramImageRequestBuilder.getRotationOptions();
    }
    mRotationOptions = ((RotationOptions)localObject);
    mBytesRange = paramImageRequestBuilder.getBytesRange();
    mRequestPriority = paramImageRequestBuilder.getRequestPriority();
    mLowestPermittedRequestLevel = paramImageRequestBuilder.getLowestPermittedRequestLevel();
    mIsDiskCacheEnabled = paramImageRequestBuilder.isDiskCacheEnabled();
    mPostprocessor = paramImageRequestBuilder.getPostprocessor();
    mRequestListener = paramImageRequestBuilder.getRequestListener();
  }
  
  public static ImageRequest fromFile(@Nullable File paramFile)
  {
    if (paramFile == null) {
      paramFile = null;
    } else {
      paramFile = fromUri(UriUtil.getUriForFile(paramFile));
    }
    return paramFile;
  }
  
  public static ImageRequest fromUri(@Nullable Uri paramUri)
  {
    if (paramUri == null) {
      paramUri = null;
    } else {
      paramUri = ImageRequestBuilder.newBuilderWithSource(paramUri).build();
    }
    return paramUri;
  }
  
  public static ImageRequest fromUri(@Nullable String paramString)
  {
    if ((paramString != null) && (paramString.length() != 0)) {
      paramString = fromUri(Uri.parse(paramString));
    } else {
      paramString = null;
    }
    return paramString;
  }
  
  private static int getSourceUriType(Uri paramUri)
  {
    if (paramUri == null) {
      return -1;
    }
    if (UriUtil.isNetworkUri(paramUri)) {
      return 0;
    }
    if (UriUtil.isLocalFileUri(paramUri))
    {
      if (MediaUtils.isVideo(MediaUtils.extractMime(paramUri.getPath()))) {
        return 2;
      }
      return 3;
    }
    if (UriUtil.isLocalContentUri(paramUri)) {
      return 4;
    }
    if (UriUtil.isLocalAssetUri(paramUri)) {
      return 5;
    }
    if (UriUtil.isLocalResourceUri(paramUri)) {
      return 6;
    }
    if (UriUtil.isDataUri(paramUri)) {
      return 7;
    }
    if (UriUtil.isQualifiedResourceUri(paramUri)) {
      return 8;
    }
    return -1;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof ImageRequest;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (ImageRequest)paramObject;
    bool1 = bool2;
    if (Objects.equal(mSourceUri, mSourceUri))
    {
      bool1 = bool2;
      if (Objects.equal(mCacheChoice, mCacheChoice))
      {
        bool1 = bool2;
        if (Objects.equal(mMediaVariations, mMediaVariations))
        {
          bool1 = bool2;
          if (Objects.equal(mSourceFile, mSourceFile)) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  @Deprecated
  public boolean getAutoRotateEnabled()
  {
    return mRotationOptions.useImageMetadata();
  }
  
  @Nullable
  public BytesRange getBytesRange()
  {
    return mBytesRange;
  }
  
  public CacheChoice getCacheChoice()
  {
    return mCacheChoice;
  }
  
  public ImageDecodeOptions getImageDecodeOptions()
  {
    return mImageDecodeOptions;
  }
  
  public boolean getLocalThumbnailPreviewsEnabled()
  {
    return mLocalThumbnailPreviewsEnabled;
  }
  
  public RequestLevel getLowestPermittedRequestLevel()
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
  
  public int getPreferredHeight()
  {
    ResizeOptions localResizeOptions = mResizeOptions;
    int i;
    if (localResizeOptions != null) {
      i = height;
    } else {
      i = 2048;
    }
    return i;
  }
  
  public int getPreferredWidth()
  {
    ResizeOptions localResizeOptions = mResizeOptions;
    int i;
    if (localResizeOptions != null) {
      i = width;
    } else {
      i = 2048;
    }
    return i;
  }
  
  public Priority getPriority()
  {
    return mRequestPriority;
  }
  
  public boolean getProgressiveRenderingEnabled()
  {
    return mProgressiveRenderingEnabled;
  }
  
  @Nullable
  public RequestListener getRequestListener()
  {
    return mRequestListener;
  }
  
  @Nullable
  public ResizeOptions getResizeOptions()
  {
    return mResizeOptions;
  }
  
  public RotationOptions getRotationOptions()
  {
    return mRotationOptions;
  }
  
  public File getSourceFile()
  {
    try
    {
      if (mSourceFile == null)
      {
        localFile = new java/io/File;
        localFile.<init>(mSourceUri.getPath());
        mSourceFile = localFile;
      }
      File localFile = mSourceFile;
      return localFile;
    }
    finally {}
  }
  
  public Uri getSourceUri()
  {
    return mSourceUri;
  }
  
  public int getSourceUriType()
  {
    return mSourceUriType;
  }
  
  public int hashCode()
  {
    return Objects.hashCode(new Object[] { mCacheChoice, mSourceUri, mMediaVariations, mSourceFile });
  }
  
  public boolean isDiskCacheEnabled()
  {
    return mIsDiskCacheEnabled;
  }
  
  public String toString()
  {
    return Objects.toStringHelper(this).add("uri", mSourceUri).add("cacheChoice", mCacheChoice).add("decodeOptions", mImageDecodeOptions).add("postprocessor", mPostprocessor).add("priority", mRequestPriority).add("resizeOptions", mResizeOptions).add("rotationOptions", mRotationOptions).add("bytesRange", mBytesRange).add("mediaVariations", mMediaVariations).toString();
  }
  
  public static enum CacheChoice
  {
    static
    {
      CacheChoice localCacheChoice1 = new CacheChoice("SMALL", 0);
      SMALL = localCacheChoice1;
      CacheChoice localCacheChoice2 = new CacheChoice("DEFAULT", 1);
      DEFAULT = localCacheChoice2;
      $VALUES = new CacheChoice[] { localCacheChoice1, localCacheChoice2 };
    }
    
    private CacheChoice() {}
  }
  
  public static enum RequestLevel
  {
    private int mValue;
    
    static
    {
      RequestLevel localRequestLevel1 = new RequestLevel("FULL_FETCH", 0, 1);
      FULL_FETCH = localRequestLevel1;
      RequestLevel localRequestLevel2 = new RequestLevel("DISK_CACHE", 1, 2);
      DISK_CACHE = localRequestLevel2;
      RequestLevel localRequestLevel3 = new RequestLevel("ENCODED_MEMORY_CACHE", 2, 3);
      ENCODED_MEMORY_CACHE = localRequestLevel3;
      RequestLevel localRequestLevel4 = new RequestLevel("BITMAP_MEMORY_CACHE", 3, 4);
      BITMAP_MEMORY_CACHE = localRequestLevel4;
      $VALUES = new RequestLevel[] { localRequestLevel1, localRequestLevel2, localRequestLevel3, localRequestLevel4 };
    }
    
    private RequestLevel(int paramInt)
    {
      mValue = paramInt;
    }
    
    public static RequestLevel getMax(RequestLevel paramRequestLevel1, RequestLevel paramRequestLevel2)
    {
      if (paramRequestLevel1.getValue() <= paramRequestLevel2.getValue()) {
        paramRequestLevel1 = paramRequestLevel2;
      }
      return paramRequestLevel1;
    }
    
    public int getValue()
    {
      return mValue;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.request.ImageRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */