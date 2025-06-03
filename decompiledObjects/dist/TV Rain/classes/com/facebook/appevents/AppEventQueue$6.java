package com.facebook.appevents;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

final class AppEventQueue$6
  implements Runnable
{
  public AppEventQueue$6(AccessTokenAppIdPair paramAccessTokenAppIdPair, SessionEventsState paramSessionEventsState) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      AppEventStore.persistEvents(val$accessTokenAppId, val$appEvents);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.AppEventQueue.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */