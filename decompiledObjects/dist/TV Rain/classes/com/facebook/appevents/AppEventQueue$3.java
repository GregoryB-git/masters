package com.facebook.appevents;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

final class AppEventQueue$3
  implements Runnable
{
  public AppEventQueue$3(FlushReason paramFlushReason) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      AppEventQueue.flushAndWait(val$reason);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.AppEventQueue.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */