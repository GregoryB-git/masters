package com.facebook.appevents.internal;

import android.content.Context;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

final class ActivityLifecycleTracker$4
  implements Runnable
{
  public ActivityLifecycleTracker$4(long paramLong, String paramString, Context paramContext) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      SessionInfo localSessionInfo;
      if (ActivityLifecycleTracker.access$400() == null)
      {
        localSessionInfo = new com/facebook/appevents/internal/SessionInfo;
        localSessionInfo.<init>(Long.valueOf(val$currentTime), null);
        ActivityLifecycleTracker.access$402(localSessionInfo);
        SessionLogger.logActivateApp(val$activityName, null, ActivityLifecycleTracker.access$500(), val$appContext);
      }
      else if (ActivityLifecycleTracker.access$400().getSessionLastEventTime() != null)
      {
        long l = val$currentTime - ActivityLifecycleTracker.access$400().getSessionLastEventTime().longValue();
        if (l > ActivityLifecycleTracker.access$600() * 1000)
        {
          SessionLogger.logDeactivateApp(val$activityName, ActivityLifecycleTracker.access$400(), ActivityLifecycleTracker.access$500());
          SessionLogger.logActivateApp(val$activityName, null, ActivityLifecycleTracker.access$500(), val$appContext);
          localSessionInfo = new com/facebook/appevents/internal/SessionInfo;
          localSessionInfo.<init>(Long.valueOf(val$currentTime), null);
          ActivityLifecycleTracker.access$402(localSessionInfo);
        }
        else if (l > 1000L)
        {
          ActivityLifecycleTracker.access$400().incrementInterruptionCount();
        }
      }
      ActivityLifecycleTracker.access$400().setSessionLastEventTime(Long.valueOf(val$currentTime));
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
 * Qualified Name:     com.facebook.appevents.internal.ActivityLifecycleTracker.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */