package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.Logger;

final class ActivityLifecycleTracker$2
  implements Application.ActivityLifecycleCallbacks
{
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    Logger.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.access$000(), "onActivityCreated");
    AppEventUtility.assertIsMainThread();
    ActivityLifecycleTracker.onActivityCreated(paramActivity);
  }
  
  public void onActivityDestroyed(Activity paramActivity)
  {
    Logger.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.access$000(), "onActivityDestroyed");
    ActivityLifecycleTracker.access$300(paramActivity);
  }
  
  public void onActivityPaused(Activity paramActivity)
  {
    Logger.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.access$000(), "onActivityPaused");
    AppEventUtility.assertIsMainThread();
    ActivityLifecycleTracker.access$200(paramActivity);
  }
  
  public void onActivityResumed(Activity paramActivity)
  {
    Logger.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.access$000(), "onActivityResumed");
    AppEventUtility.assertIsMainThread();
    ActivityLifecycleTracker.onActivityResumed(paramActivity);
  }
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    Logger.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.access$000(), "onActivitySaveInstanceState");
  }
  
  public void onActivityStarted(Activity paramActivity)
  {
    ActivityLifecycleTracker.access$108();
    Logger.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.access$000(), "onActivityStarted");
  }
  
  public void onActivityStopped(Activity paramActivity)
  {
    Logger.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.access$000(), "onActivityStopped");
    AppEventsLogger.onContextStop();
    ActivityLifecycleTracker.access$110();
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.internal.ActivityLifecycleTracker.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */