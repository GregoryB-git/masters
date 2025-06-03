package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.aam.MetadataIndexer;
import com.facebook.appevents.codeless.CodelessManager;
import com.facebook.appevents.suggestedevents.SuggestedEventsManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FeatureManager.Callback;
import com.facebook.internal.FeatureManager.Feature;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class ActivityLifecycleTracker
{
  private static final String INCORRECT_IMPL_WARNING = "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method";
  private static final long INTERRUPTION_THRESHOLD_MILLISECONDS = 1000L;
  private static final String TAG = "com.facebook.appevents.internal.ActivityLifecycleTracker";
  private static int activityReferences = 0;
  private static String appId;
  private static WeakReference<Activity> currActivity;
  private static long currentActivityAppearTime;
  private static volatile ScheduledFuture currentFuture;
  private static final Object currentFutureLock;
  private static volatile SessionInfo currentSession;
  private static AtomicInteger foregroundActivityCount;
  private static final ScheduledExecutorService singleThreadExecutor = ;
  private static AtomicBoolean tracking;
  
  static
  {
    currentFutureLock = new Object();
    foregroundActivityCount = new AtomicInteger(0);
    tracking = new AtomicBoolean(false);
  }
  
  private static void cancelCurrentTask()
  {
    synchronized (currentFutureLock)
    {
      if (currentFuture != null) {
        currentFuture.cancel(false);
      }
      currentFuture = null;
      return;
    }
  }
  
  @Nullable
  public static Activity getCurrentActivity()
  {
    Object localObject = currActivity;
    if (localObject != null) {
      localObject = (Activity)((Reference)localObject).get();
    } else {
      localObject = null;
    }
    return (Activity)localObject;
  }
  
  public static UUID getCurrentSessionGuid()
  {
    UUID localUUID;
    if (currentSession != null) {
      localUUID = currentSession.getSessionId();
    } else {
      localUUID = null;
    }
    return localUUID;
  }
  
  private static int getSessionTimeoutInSeconds()
  {
    FetchedAppSettings localFetchedAppSettings = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
    if (localFetchedAppSettings == null) {
      return Constants.getDefaultAppEventsSessionTimeoutInSeconds();
    }
    return localFetchedAppSettings.getSessionTimeoutInSeconds();
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static boolean isInBackground()
  {
    boolean bool;
    if (activityReferences == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean isTracking()
  {
    return tracking.get();
  }
  
  public static void onActivityCreated(Activity paramActivity)
  {
    singleThreadExecutor.execute(new Runnable()
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
    });
  }
  
  private static void onActivityDestroyed(Activity paramActivity)
  {
    CodelessManager.onActivityDestroyed(paramActivity);
  }
  
  private static void onActivityPaused(Activity paramActivity)
  {
    if (foregroundActivityCount.decrementAndGet() < 0)
    {
      foregroundActivityCount.set(0);
      Log.w(TAG, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
    }
    cancelCurrentTask();
    long l = System.currentTimeMillis();
    String str = Utility.getActivityName(paramActivity);
    CodelessManager.onActivityPaused(paramActivity);
    paramActivity = new Runnable()
    {
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
    };
    singleThreadExecutor.execute(paramActivity);
  }
  
  public static void onActivityResumed(Activity paramActivity)
  {
    currActivity = new WeakReference(paramActivity);
    foregroundActivityCount.incrementAndGet();
    cancelCurrentTask();
    long l = System.currentTimeMillis();
    currentActivityAppearTime = l;
    String str = Utility.getActivityName(paramActivity);
    CodelessManager.onActivityResumed(paramActivity);
    MetadataIndexer.onActivityResumed(paramActivity);
    SuggestedEventsManager.trackActivity(paramActivity);
    paramActivity = new Runnable()
    {
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
    };
    singleThreadExecutor.execute(paramActivity);
  }
  
  public static void startTracking(Application paramApplication, String paramString)
  {
    if (!tracking.compareAndSet(false, true)) {
      return;
    }
    FeatureManager.checkFeature(FeatureManager.Feature.CodelessEvents, new FeatureManager.Callback()
    {
      public void onCompleted(boolean paramAnonymousBoolean)
      {
        if (paramAnonymousBoolean) {
          CodelessManager.enable();
        } else {
          CodelessManager.disable();
        }
      }
    });
    appId = paramString;
    paramApplication.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks()
    {
      public void onActivityCreated(Activity paramAnonymousActivity, Bundle paramAnonymousBundle)
      {
        Logger.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.access$000(), "onActivityCreated");
        AppEventUtility.assertIsMainThread();
        ActivityLifecycleTracker.onActivityCreated(paramAnonymousActivity);
      }
      
      public void onActivityDestroyed(Activity paramAnonymousActivity)
      {
        Logger.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.access$000(), "onActivityDestroyed");
        ActivityLifecycleTracker.access$300(paramAnonymousActivity);
      }
      
      public void onActivityPaused(Activity paramAnonymousActivity)
      {
        Logger.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.access$000(), "onActivityPaused");
        AppEventUtility.assertIsMainThread();
        ActivityLifecycleTracker.access$200(paramAnonymousActivity);
      }
      
      public void onActivityResumed(Activity paramAnonymousActivity)
      {
        Logger.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.access$000(), "onActivityResumed");
        AppEventUtility.assertIsMainThread();
        ActivityLifecycleTracker.onActivityResumed(paramAnonymousActivity);
      }
      
      public void onActivitySaveInstanceState(Activity paramAnonymousActivity, Bundle paramAnonymousBundle)
      {
        Logger.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.access$000(), "onActivitySaveInstanceState");
      }
      
      public void onActivityStarted(Activity paramAnonymousActivity)
      {
        ActivityLifecycleTracker.access$108();
        Logger.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.access$000(), "onActivityStarted");
      }
      
      public void onActivityStopped(Activity paramAnonymousActivity)
      {
        Logger.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.access$000(), "onActivityStopped");
        AppEventsLogger.onContextStop();
        ActivityLifecycleTracker.access$110();
      }
    });
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.internal.ActivityLifecycleTracker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */