package com.facebook.internal;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

final class FetchedAppGateKeepersManager$2
  implements Runnable
{
  public FetchedAppGateKeepersManager$2(FetchedAppGateKeepersManager.Callback paramCallback) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      val$callback.onCompleted();
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.FetchedAppGateKeepersManager.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */