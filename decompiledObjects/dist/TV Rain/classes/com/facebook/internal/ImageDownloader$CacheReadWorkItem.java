package com.facebook.internal;

import android.content.Context;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

class ImageDownloader$CacheReadWorkItem
  implements Runnable
{
  private boolean allowCachedRedirects;
  private Context context;
  private ImageDownloader.RequestKey key;
  
  public ImageDownloader$CacheReadWorkItem(Context paramContext, ImageDownloader.RequestKey paramRequestKey, boolean paramBoolean)
  {
    context = paramContext;
    key = paramRequestKey;
    allowCachedRedirects = paramBoolean;
  }
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      ImageDownloader.access$100(key, context, allowCachedRedirects);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.ImageDownloader.CacheReadWorkItem
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */