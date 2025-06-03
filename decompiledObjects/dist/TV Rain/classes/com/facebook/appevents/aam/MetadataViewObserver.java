package com.facebook.appevents.aam;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalFocusChangeListener;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

final class MetadataViewObserver
  implements ViewTreeObserver.OnGlobalFocusChangeListener
{
  private static final int MAX_TEXT_LENGTH = 100;
  private static final String TAG = MetadataViewObserver.class.getCanonicalName();
  private static final Map<Integer, MetadataViewObserver> observers = new HashMap();
  private WeakReference<Activity> activityWeakReference;
  private AtomicBoolean isTracking;
  private final Set<String> processedText = new HashSet();
  private final Handler uiThreadHandler;
  
  private MetadataViewObserver(Activity paramActivity)
  {
    activityWeakReference = new WeakReference(paramActivity);
    uiThreadHandler = new Handler(Looper.getMainLooper());
    isTracking = new AtomicBoolean(false);
  }
  
  private static String preNormalize(String paramString1, String paramString2)
  {
    if (CrashShieldHandler.isObjectCrashing(MetadataViewObserver.class)) {
      return null;
    }
    try
    {
      if ("r2".equals(paramString1))
      {
        paramString1 = paramString2.replaceAll("[^\\d.]", "");
        return paramString1;
      }
      return paramString2;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString1, MetadataViewObserver.class);
    }
    return null;
  }
  
  private void process(View paramView)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      Runnable local1 = new com/facebook/appevents/aam/MetadataViewObserver$1;
      local1.<init>(this, paramView);
      runOnUIThread(local1);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramView, this);
    }
  }
  
  private void processEditText(View paramView)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      String str1 = ((EditText)paramView).getText().toString().trim().toLowerCase();
      if ((!str1.isEmpty()) && (!processedText.contains(str1)) && (str1.length() <= 100))
      {
        processedText.add(str1);
        HashMap localHashMap = new java/util/HashMap;
        localHashMap.<init>();
        List localList = MetadataMatcher.getCurrentViewIndicators(paramView);
        Object localObject1 = null;
        Iterator localIterator = MetadataRule.getRules().iterator();
        while (localIterator.hasNext())
        {
          MetadataRule localMetadataRule = (MetadataRule)localIterator.next();
          String str2 = preNormalize(localMetadataRule.getName(), str1);
          if ((localMetadataRule.getValRule().isEmpty()) || (MetadataMatcher.matchValue(str2, localMetadataRule.getValRule()))) {
            if (MetadataMatcher.matchIndicator(localList, localMetadataRule.getKeyRules()))
            {
              putUserData(localHashMap, localMetadataRule.getName(), str2);
            }
            else
            {
              Object localObject2 = localObject1;
              if (localObject1 == null) {
                localObject2 = MetadataMatcher.getAroundViewIndicators(paramView);
              }
              localObject1 = localObject2;
              if (MetadataMatcher.matchIndicator((List)localObject2, localMetadataRule.getKeyRules()))
              {
                putUserData(localHashMap, localMetadataRule.getName(), str2);
                localObject1 = localObject2;
              }
            }
          }
        }
        InternalAppEventsLogger.setInternalUserData(localHashMap);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramView, this);
    }
  }
  
  private static void putUserData(Map<String, String> paramMap, String paramString1, String paramString2)
  {
    if (CrashShieldHandler.isObjectCrashing(MetadataViewObserver.class)) {
      return;
    }
    int i = -1;
    try
    {
      switch (paramString1.hashCode())
      {
      default: 
        break;
      case 3588: 
        if (paramString1.equals("r6")) {
          i = 3;
        }
        break;
      case 3587: 
        if (paramString1.equals("r5")) {
          i = 2;
        }
        break;
      case 3586: 
        if (paramString1.equals("r4")) {
          i = 1;
        }
        break;
      case 3585: 
        boolean bool = paramString1.equals("r3");
        if (bool) {
          i = 0;
        }
        break;
      }
      String str;
      if (i != 0)
      {
        if ((i != 1) && (i != 2))
        {
          if (i != 3)
          {
            str = paramString2;
          }
          else
          {
            str = paramString2;
            if (paramString2.contains("-")) {
              str = paramString2.split("-")[0];
            }
          }
        }
        else {
          str = paramString2.replaceAll("[^a-z]+", "");
        }
      }
      else if ((!paramString2.startsWith("m")) && (!paramString2.startsWith("b")) && (!paramString2.startsWith("ge"))) {
        str = "f";
      } else {
        str = "m";
      }
      paramMap.put(paramString1, str);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramMap, MetadataViewObserver.class);
    }
  }
  
  private void runOnUIThread(Runnable paramRunnable)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
        paramRunnable.run();
      } else {
        uiThreadHandler.post(paramRunnable);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramRunnable, this);
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
      if (((ViewTreeObserver)localObject).isAlive()) {
        ((ViewTreeObserver)localObject).addOnGlobalFocusChangeListener(this);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
  
  @UiThread
  public static void startTrackingActivity(Activity paramActivity)
  {
    if (CrashShieldHandler.isObjectCrashing(MetadataViewObserver.class)) {
      return;
    }
    try
    {
      int i = paramActivity.hashCode();
      Map localMap = observers;
      if (!localMap.containsKey(Integer.valueOf(i)))
      {
        MetadataViewObserver localMetadataViewObserver = new com/facebook/appevents/aam/MetadataViewObserver;
        localMetadataViewObserver.<init>(paramActivity);
        localMap.put(Integer.valueOf(paramActivity.hashCode()), localMetadataViewObserver);
        paramActivity = localMetadataViewObserver;
      }
      else
      {
        paramActivity = (MetadataViewObserver)localMap.get(Integer.valueOf(i));
      }
      paramActivity.startTracking();
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramActivity, MetadataViewObserver.class);
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
      ((ViewTreeObserver)localObject).removeOnGlobalFocusChangeListener(this);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
  
  @UiThread
  public static void stopTrackingActivity(Activity paramActivity)
  {
    if (CrashShieldHandler.isObjectCrashing(MetadataViewObserver.class)) {
      return;
    }
    try
    {
      int i = paramActivity.hashCode();
      Map localMap = observers;
      if (localMap.containsKey(Integer.valueOf(i)))
      {
        paramActivity = (MetadataViewObserver)localMap.get(Integer.valueOf(paramActivity.hashCode()));
        localMap.remove(Integer.valueOf(i));
        paramActivity.stopTracking();
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramActivity, MetadataViewObserver.class);
    }
  }
  
  public void onGlobalFocusChanged(@Nullable View paramView1, @Nullable View paramView2)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    if (paramView1 != null) {
      try
      {
        process(paramView1);
      }
      finally
      {
        break label36;
      }
    }
    if (paramView2 != null)
    {
      process(paramView2);
      return;
      label36:
      CrashShieldHandler.handleThrowable(paramView1, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.aam.MetadataViewObserver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */