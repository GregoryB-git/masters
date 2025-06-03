package com.facebook.internal;

import android.graphics.Bitmap;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

final class ImageDownloader$1
  implements Runnable
{
  public ImageDownloader$1(ImageRequest paramImageRequest, Exception paramException, boolean paramBoolean, Bitmap paramBitmap, ImageRequest.Callback paramCallback) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      ImageResponse localImageResponse = new com/facebook/internal/ImageResponse;
      localImageResponse.<init>(val$request, val$error, val$isCachedRedirect, val$bitmap);
      val$callback.onCompleted(localImageResponse);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.ImageDownloader.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */