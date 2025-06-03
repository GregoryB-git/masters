package com.facebook.imagepipeline.cache;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.common.util.HashCodeUtil;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
public class BitmapMemoryCacheKey
  implements CacheKey
{
  private final long mCacheTime;
  private final Object mCallerContext;
  private final int mHash;
  private final ImageDecodeOptions mImageDecodeOptions;
  @Nullable
  private final CacheKey mPostprocessorCacheKey;
  @Nullable
  private final String mPostprocessorName;
  @Nullable
  private final ResizeOptions mResizeOptions;
  private final RotationOptions mRotationOptions;
  private final String mSourceString;
  
  public BitmapMemoryCacheKey(String paramString1, @Nullable ResizeOptions paramResizeOptions, RotationOptions paramRotationOptions, ImageDecodeOptions paramImageDecodeOptions, @Nullable CacheKey paramCacheKey, @Nullable String paramString2, Object paramObject)
  {
    mSourceString = ((String)Preconditions.checkNotNull(paramString1));
    mResizeOptions = paramResizeOptions;
    mRotationOptions = paramRotationOptions;
    mImageDecodeOptions = paramImageDecodeOptions;
    mPostprocessorCacheKey = paramCacheKey;
    mPostprocessorName = paramString2;
    int i = paramString1.hashCode();
    int j;
    if (paramResizeOptions != null) {
      j = paramResizeOptions.hashCode();
    } else {
      j = 0;
    }
    mHash = HashCodeUtil.hashCode(Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramRotationOptions.hashCode()), paramImageDecodeOptions, paramCacheKey, paramString2);
    mCallerContext = paramObject;
    mCacheTime = RealtimeSinceBootClock.get().now();
  }
  
  public boolean containsUri(Uri paramUri)
  {
    return getUriString().contains(paramUri.toString());
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof BitmapMemoryCacheKey;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (BitmapMemoryCacheKey)paramObject;
    bool1 = bool2;
    if (mHash == mHash)
    {
      bool1 = bool2;
      if (mSourceString.equals(mSourceString))
      {
        bool1 = bool2;
        if (Objects.equal(mResizeOptions, mResizeOptions))
        {
          bool1 = bool2;
          if (Objects.equal(mRotationOptions, mRotationOptions))
          {
            bool1 = bool2;
            if (Objects.equal(mImageDecodeOptions, mImageDecodeOptions))
            {
              bool1 = bool2;
              if (Objects.equal(mPostprocessorCacheKey, mPostprocessorCacheKey))
              {
                bool1 = bool2;
                if (Objects.equal(mPostprocessorName, mPostprocessorName)) {
                  bool1 = true;
                }
              }
            }
          }
        }
      }
    }
    return bool1;
  }
  
  public Object getCallerContext()
  {
    return mCallerContext;
  }
  
  public long getInBitmapCacheSince()
  {
    return mCacheTime;
  }
  
  @Nullable
  public String getPostprocessorName()
  {
    return mPostprocessorName;
  }
  
  public String getUriString()
  {
    return mSourceString;
  }
  
  public int hashCode()
  {
    return mHash;
  }
  
  public String toString()
  {
    return String.format(null, "%s_%s_%s_%s_%s_%s_%d", new Object[] { mSourceString, mResizeOptions, mRotationOptions, mImageDecodeOptions, mPostprocessorCacheKey, mPostprocessorName, Integer.valueOf(mHash) });
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.cache.BitmapMemoryCacheKey
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */