package com.facebook.internal;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

final class FetchedAppSettingsManager$2
  implements Runnable
{
  public FetchedAppSettingsManager$2(FetchedAppSettingsManager.FetchedAppSettingsCallback paramFetchedAppSettingsCallback) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      val$callback.onError();
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.FetchedAppSettingsManager.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */