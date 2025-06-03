package com.facebook.appevents.internal;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

final class ActivityLifecycleTracker$5
  implements Runnable
{
  public ActivityLifecycleTracker$5(long paramLong, String paramString) {}
  
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
        ((SessionInfo)???).<init>(Long.valueOf(val$currentTime), null);
        ActivityLifecycleTracker.access$402((SessionInfo)???);
      }
      ActivityLifecycleTracker.access$400().setSessionLastEventTime(Long.valueOf(val$currentTime));
      if (ActivityLifecycleTracker.access$700().get() <= 0)
      {
        Runnable local1 = new com/facebook/appevents/internal/ActivityLifecycleTracker$5$1;
        local1.<init>(this);
        synchronized (ActivityLifecycleTracker.access$800())
        {
          ActivityLifecycleTracker.access$902(ActivityLifecycleTracker.access$1000().schedule(local1, ActivityLifecycleTracker.access$600(), TimeUnit.SECONDS));
        }
      }
      long l1 = ActivityLifecycleTracker.access$1100();
      long l2 = 0L;
      if (l1 > 0L) {
        l2 = (val$currentTime - l1) / 1000L;
      }
      AutomaticAnalyticsLogger.logActivityTimeSpentEvent(val$activityName, l2);
      ActivityLifecycleTracker.access$400().writeSessionToDisk();
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.internal.ActivityLifecycleTracker.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */