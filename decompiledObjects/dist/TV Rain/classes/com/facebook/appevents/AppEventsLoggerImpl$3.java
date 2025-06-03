package com.facebook.appevents;

import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

final class AppEventsLoggerImpl$3
  implements Runnable
{
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      HashSet localHashSet = new java/util/HashSet;
      localHashSet.<init>();
      Iterator localIterator = AppEventQueue.getKeySet().iterator();
      while (localIterator.hasNext()) {
        localHashSet.add(((AccessTokenAppIdPair)localIterator.next()).getApplicationId());
      }
      localIterator = localHashSet.iterator();
      while (localIterator.hasNext()) {
        FetchedAppSettingsManager.queryAppSettings((String)localIterator.next(), true);
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
 * Qualified Name:     com.facebook.appevents.AppEventsLoggerImpl.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */