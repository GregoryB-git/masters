package com.facebook.imagepipeline.image;

import com.facebook.common.logging.FLog;
import java.io.Closeable;

public abstract class CloseableImage
  implements Closeable, ImageInfo
{
  private static final String TAG = "CloseableImage";
  
  public abstract void close();
  
  public void finalize()
    throws Throwable
  {
    if (isClosed()) {
      return;
    }
    FLog.w("CloseableImage", "finalize: %s %x still open.", new Object[] { getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)) });
    try
    {
      close();
      return;
    }
    finally
    {
      super.finalize();
    }
  }
  
  public QualityInfo getQualityInfo()
  {
    return ImmutableQualityInfo.FULL_QUALITY;
  }
  
  public abstract int getSizeInBytes();
  
  public abstract boolean isClosed();
  
  public boolean isStateful()
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.image.CloseableImage
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */