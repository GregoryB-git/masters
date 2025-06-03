package com.facebook.appevents.internal;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.concurrent.atomic.AtomicInteger;

class ActivityLifecycleTracker$5$1
  implements Runnable
{
  public ActivityLifecycleTracker$5$1(ActivityLifecycleTracker.5 param5) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      if (ActivityLifecycleTracker.access$400() == null)
      {
        ??? = new com/facebook/appevents/internal/SessionInfo;
        ((SessionInfo)???).<init>(Long.valueOf(this$0.val$currentTime), null);
        ActivityLifecycleTracker.access$402((SessionInfo)???);
      }
      if (ActivityLifecycleTracker.access$700().get() <= 0)
      {
        SessionLogger.logDeactivateApp(this$0.val$activityName, ActivityLifecycleTracker.access$400(), ActivityLifecycleTracker.access$500());
        SessionInfo.clearSavedSessionFromDisk();
        ActivityLifecycleTracker.access$402(null);
      }
      synchronized (ActivityLifecycleTracker.access$800())
      {
        ActivityLifecycleTracker.access$902(null);
        return;
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
 * Qualified Name:     com.facebook.appevents.internal.ActivityLifecycleTracker.5.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */