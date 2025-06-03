package com.facebook.appevents.suggestedevents;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

final class ViewObserver
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  private static final int MAX_TEXT_LENGTH = 300;
  private static final String TAG = ViewObserver.class.getCanonicalName();
  private static final Map<Integer, ViewObserver> observers = new HashMap();
  private WeakReference<Activity> activityWeakReference;
  private AtomicBoolean isTracking;
  private final Handler uiThreadHandler;
  
  private ViewObserver(Activity paramActivity)
  {
    activityWeakReference = new WeakReference(paramActivity);
    uiThreadHandler = new Handler(Looper.getMainLooper());
    isTracking = new AtomicBoolean(false);
  }
  
  private void process()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      Runnable local1 = new com/facebook/appevents/suggestedevents/ViewObserver$1;
      local1.<init>(this);
      if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
        local1.run();
      } else {
        uiThreadHandler.post(local1);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
  
  private void startTracking()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      if (isTracking.getAndSet(true)) {
        return;
      }
      Object localObject = AppEventUtility.getRootView((Activity)activityWeakReference.get());
      if (localObject == null) {
        return;
      }
      localObject = ((View)localObject).getViewTreeObserver();
      if (((ViewTreeObserver)localObject).isAlive())
      {
        ((ViewTreeObserver)localObject).addOnGlobalLayoutListener(this);
        process();
        localObject = (Activity)activityWeakReference.get();
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
  
  public static void startTrackingActivity(Activity paramActivity)
  {
    if (CrashShieldHandler.isObjectCrashing(ViewObserver.class)) {
      return;
    }
    try
    {
      int i = paramActivity.hashCode();
      Map localMap = observers;
      if (!localMap.containsKey(Integer.valueOf(i)))
      {
        ViewObserver localViewObserver = new com/facebook/appevents/suggestedevents/ViewObserver;
        localViewObserver.<init>(paramActivity);
        localMap.put(Integer.valueOf(i), localViewObserver);
        localViewObserver.startTracking();
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramActivity, ViewObserver.class);
    }
  }
  
  private void stopTracking()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      if (!isTracking.getAndSet(false)) {
        return;
      }
      Object localObject = AppEventUtility.getRootView((Activity)activityWeakReference.get());
      if (localObject == null) {
        return;
      }
      localObject = ((View)localObject).getViewTreeObserver();
      if (!((ViewTreeObserver)localObject).isAlive()) {
        return;
      }
      ((ViewTreeObserver)localObject).removeOnGlobalLayoutListener(this);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
  
  public static void stopTrackingActivity(Activity paramActivity)
  {
    if (CrashShieldHandler.isObjectCrashing(ViewObserver.class)) {
      return;
    }
    try
    {
      int i = paramActivity.hashCode();
      Map localMap = observers;
      if (localMap.containsKey(Integer.valueOf(i)))
      {
        paramActivity = (ViewObserver)localMap.get(Integer.valueOf(i));
        localMap.remove(Integer.valueOf(i));
        paramActivity.stopTracking();
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramActivity, ViewObserver.class);
    }
  }
  
  public void onGlobalLayout()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      process();
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.suggestedevents.ViewObserver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */