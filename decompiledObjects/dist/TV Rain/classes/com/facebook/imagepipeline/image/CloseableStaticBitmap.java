package com.facebook.imagepipeline.image;

import android.graphics.Bitmap;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.ResourceReleaser;
import com.facebook.imageutils.BitmapUtil;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class CloseableStaticBitmap
  extends CloseableBitmap
{
  private volatile Bitmap mBitmap;
  @GuardedBy("this")
  private CloseableReference<Bitmap> mBitmapReference;
  private final int mExifOrientation;
  private final QualityInfo mQualityInfo;
  private final int mRotationAngle;
  
  public CloseableStaticBitmap(Bitmap paramBitmap, ResourceReleaser<Bitmap> paramResourceReleaser, QualityInfo paramQualityInfo, int paramInt)
  {
    this(paramBitmap, paramResourceReleaser, paramQualityInfo, paramInt, 0);
  }
  
  public CloseableStaticBitmap(Bitmap paramBitmap, ResourceReleaser<Bitmap> paramResourceReleaser, QualityInfo paramQualityInfo, int paramInt1, int paramInt2)
  {
    mBitmap = ((Bitmap)Preconditions.checkNotNull(paramBitmap));
    mBitmapReference = CloseableReference.of(mBitmap, (ResourceReleaser)Preconditions.checkNotNull(paramResourceReleaser));
    mQualityInfo = paramQualityInfo;
    mRotationAngle = paramInt1;
    mExifOrientation = paramInt2;
  }
  
  public CloseableStaticBitmap(CloseableReference<Bitmap> paramCloseableReference, QualityInfo paramQualityInfo, int paramInt)
  {
    this(paramCloseableReference, paramQualityInfo, paramInt, 0);
  }
  
  public CloseableStaticBitmap(CloseableReference<Bitmap> paramCloseableReference, QualityInfo paramQualityInfo, int paramInt1, int paramInt2)
  {
    paramCloseableReference = (CloseableReference)Preconditions.checkNotNull(paramCloseableReference.cloneOrNull());
    mBitmapReference = paramCloseableReference;
    mBitmap = ((Bitmap)paramCloseableReference.get());
    mQualityInfo = paramQualityInfo;
    mRotationAngle = paramInt1;
    mExifOrientation = paramInt2;
  }
  
  private CloseableReference<Bitmap> detachBitmapReference()
  {
    try
    {
      CloseableReference localCloseableReference = mBitmapReference;
      mBitmapReference = null;
      mBitmap = null;
      return localCloseableReference;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private static int getBitmapHeight(@Nullable Bitmap paramBitmap)
  {
    int i;
    if (paramBitmap == null) {
      i = 0;
    } else {
      i = paramBitmap.getHeight();
    }
    return i;
  }
  
  private static int getBitmapWidth(@Nullable Bitmap paramBitmap)
  {
    int i;
    if (paramBitmap == null) {
      i = 0;
    } else {
      i = paramBitmap.getWidth();
    }
    return i;
  }
  
  @Nullable
  public CloseableReference<Bitmap> cloneUnderlyingBitmapReference()
  {
    try
    {
      CloseableReference localCloseableReference = CloseableReference.cloneOrNull(mBitmapReference);
      return localCloseableReference;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void close()
  {
    CloseableReference localCloseableReference = detachBitmapReference();
    if (localCloseableReference != null) {
      localCloseableReference.close();
    }
  }
  
  public CloseableReference<Bitmap> convertToBitmapReference()
  {
    try
    {
      Preconditions.checkNotNull(mBitmapReference, "Cannot convert a closed static bitmap");
      CloseableReference localCloseableReference = detachBitmapReference();
      return localCloseableReference;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public int getExifOrientation()
  {
    return mExifOrientation;
  }
  
  public int getHeight()
  {
    if (mRotationAngle % 180 == 0)
    {
      int i = mExifOrientation;
      if ((i != 5) && (i != 7)) {
        return getBitmapHeight(mBitmap);
      }
    }
    return getBitmapWidth(mBitmap);
  }
  
  public QualityInfo getQualityInfo()
  {
    return mQualityInfo;
  }
  
  public int getRotationAngle()
  {
    return mRotationAngle;
  }
  
  public int getSizeInBytes()
  {
    return BitmapUtil.getSizeInBytes(mBitmap);
  }
  
  public Bitmap getUnderlyingBitmap()
  {
    return mBitmap;
  }
  
  public int getWidth()
  {
    if (mRotationAngle % 180 == 0)
    {
      int i = mExifOrientation;
      if ((i != 5) && (i != 7)) {
        return getBitmapWidth(mBitmap);
      }
    }
    return getBitmapHeight(mBitmap);
  }
  
  public boolean isClosed()
  {
    try
    {
      CloseableReference localCloseableReference = mBitmapReference;
      boolean bool;
      if (localCloseableReference == null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.image.CloseableStaticBitmap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */