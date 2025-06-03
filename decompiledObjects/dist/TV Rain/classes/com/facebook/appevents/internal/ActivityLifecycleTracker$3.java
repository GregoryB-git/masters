package com.facebook.appevents.internal;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

final class ActivityLifecycleTracker$3
  implements Runnable
{
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      if (ActivityLifecycleTracker.access$400() == null) {
        ActivityLifecycleTracker.access$402(SessionInfo.getStoredSessionInfo());
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.internal.ActivityLifecycleTracker.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */