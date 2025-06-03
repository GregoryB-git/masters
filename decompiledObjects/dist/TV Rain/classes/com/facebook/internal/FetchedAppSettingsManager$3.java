package com.facebook.internal;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

final class FetchedAppSettingsManager$3
  implements Runnable
{
  public FetchedAppSettingsManager$3(FetchedAppSettingsManager.FetchedAppSettingsCallback paramFetchedAppSettingsCallback, FetchedAppSettings paramFetchedAppSettings) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      val$callback.onSuccess(val$appSettings);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.FetchedAppSettingsManager.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */