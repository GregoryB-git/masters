package com.facebook.applinks;

import android.content.Context;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

final class AppLinkData$1
  implements Runnable
{
  public AppLinkData$1(Context paramContext, String paramString, AppLinkData.CompletionHandler paramCompletionHandler) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      AppLinkData.access$000(val$applicationContext, val$applicationIdCopy, val$completionHandler);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.applinks.AppLinkData.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */