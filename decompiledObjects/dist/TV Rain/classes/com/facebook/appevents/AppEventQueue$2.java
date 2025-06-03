package com.facebook.appevents;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

final class AppEventQueue$2
  implements Runnable
{
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      AppEventStore.persistEvents(AppEventQueue.access$100());
      AppEventCollection localAppEventCollection = new com/facebook/appevents/AppEventCollection;
      localAppEventCollection.<init>();
      AppEventQueue.access$102(localAppEventCollection);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.AppEventQueue.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */