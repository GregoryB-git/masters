package com.facebook;

import android.content.Context;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

final class FacebookSdk$9
  implements Runnable
{
  public FacebookSdk$9(Context paramContext, String paramString) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      FacebookSdk.publishInstallAndWaitForResponse(val$applicationContext, val$applicationId);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.FacebookSdk.9
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */