package com.facebook.internal;

import android.content.Context;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

class ImageDownloader$DownloadImageWorkItem
  implements Runnable
{
  private Context context;
  private ImageDownloader.RequestKey key;
  
  public ImageDownloader$DownloadImageWorkItem(Context paramContext, ImageDownloader.RequestKey paramRequestKey)
  {
    context = paramContext;
    key = paramRequestKey;
  }
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      ImageDownloader.access$200(key, context);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.ImageDownloader.DownloadImageWorkItem
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */