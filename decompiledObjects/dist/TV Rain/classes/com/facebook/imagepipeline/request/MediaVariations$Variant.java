package com.facebook.imagepipeline.request;

import android.net.Uri;
import com.facebook.common.internal.Objects;
import javax.annotation.Nullable;

public final class MediaVariations$Variant
{
  @Nullable
  private final ImageRequest.CacheChoice mCacheChoice;
  private final int mHeight;
  private final Uri mUri;
  private final int mWidth;
  
  public MediaVariations$Variant(Uri paramUri, int paramInt1, int paramInt2)
  {
    this(paramUri, paramInt1, paramInt2, null);
  }
  
  public MediaVariations$Variant(Uri paramUri, int paramInt1, int paramInt2, @Nullable ImageRequest.CacheChoice paramCacheChoice)
  {
    mUri = paramUri;
    mWidth = paramInt1;
    mHeight = paramInt2;
    mCacheChoice = paramCacheChoice;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof Variant;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (Variant)paramObject;
    bool1 = bool2;
    if (Objects.equal(mUri, mUri))
    {
      bool1 = bool2;
      if (mWidth == mWidth)
      {
        bool1 = bool2;
        if (mHeight == mHeight)
        {
          bool1 = bool2;
          if (mCacheChoice == mCacheChoice) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  @Nullable
  public ImageRequest.CacheChoice getCacheChoice()
  {
    return mCacheChoice;
  }
  
  public int getHeight()
  {
    return mHeight;
  }
  
  public Uri getUri()
  {
    return mUri;
  }
  
  public int getWidth()
  {
    return mWidth;
  }
  
  public int hashCode()
  {
    return (mUri.hashCode() * 31 + mWidth) * 31 + mHeight;
  }
  
  public String toString()
  {
    return String.format(null, "%dx%d %s %s", new Object[] { Integer.valueOf(mWidth), Integer.valueOf(mHeight), mUri, mCacheChoice });
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.request.MediaVariations.Variant
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */