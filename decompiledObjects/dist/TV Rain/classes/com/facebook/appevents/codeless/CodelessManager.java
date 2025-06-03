package com.facebook.appevents.codeless;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.BaseBundle;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class CodelessManager
{
  private static CodelessSessionChecker codelessSessionChecker = new CodelessSessionChecker()
  {
    public void checkCodelessSession(String paramAnonymousString)
    {
      CodelessManager.checkCodelessSession(paramAnonymousString);
    }
  };
  @Nullable
  private static String deviceSessionID;
  private static final AtomicBoolean isAppIndexingEnabled;
  private static volatile Boolean isCheckingSession;
  private static final AtomicBoolean isCodelessEnabled;
  @Nullable
  private static SensorManager sensorManager;
  @Nullable
  private static ViewIndexer viewIndexer;
  private static final ViewIndexingTrigger viewIndexingTrigger = new ViewIndexingTrigger();
  
  static
  {
    isCodelessEnabled = new AtomicBoolean(true);
    isAppIndexingEnabled = new AtomicBoolean(false);
    isCheckingSession = Boolean.FALSE;
  }
  
  public static void checkCodelessSession(String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
      return;
    }
    try
    {
      if (isCheckingSession.booleanValue()) {
        return;
      }
      isCheckingSession = Boolean.TRUE;
      Executor localExecutor = FacebookSdk.getExecutor();
      Runnable local3 = new com/facebook/appevents/codeless/CodelessManager$3;
      local3.<init>(paramString);
      localExecutor.execute(local3);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, CodelessManager.class);
    }
  }
  
  public static void disable()
  {
    if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
      return;
    }
    try
    {
      isCodelessEnabled.set(false);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, CodelessManager.class);
    }
  }
  
  public static void enable()
  {
    if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
      return;
    }
    try
    {
      isCodelessEnabled.set(true);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, CodelessManager.class);
    }
  }
  
  public static String getCurrentDeviceSessionID()
  {
    if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
      return null;
    }
    try
    {
      if (deviceSessionID == null) {
        deviceSessionID = UUID.randomUUID().toString();
      }
      String str = deviceSessionID;
      return str;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, CodelessManager.class);
    }
    return null;
  }
  
  public static boolean getIsAppIndexingEnabled()
  {
    if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
      return false;
    }
    try
    {
      boolean bool = isAppIndexingEnabled.get();
      return bool;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, CodelessManager.class);
    }
    return false;
  }
  
  public static boolean isDebugOnEmulator()
  {
    CrashShieldHandler.isObjectCrashing(CodelessManager.class);
    return false;
  }
  
  public static void onActivityDestroyed(Activity paramActivity)
  {
    if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
      return;
    }
    try
    {
      CodelessMatcher.getInstance().destroy(paramActivity);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramActivity, CodelessManager.class);
    }
  }
  
  public static void onActivityPaused(Activity paramActivity)
  {
    if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
      return;
    }
    try
    {
      if (!isCodelessEnabled.get()) {
        return;
      }
      CodelessMatcher.getInstance().remove(paramActivity);
      paramActivity = viewIndexer;
      if (paramActivity != null) {
        paramActivity.unschedule();
      }
      paramActivity = sensorManager;
      if (paramActivity != null) {
        paramActivity.unregisterListener(viewIndexingTrigger);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramActivity, CodelessManager.class);
    }
  }
  
  public static void onActivityResumed(Activity paramActivity)
  {
    if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
      return;
    }
    try
    {
      if (!isCodelessEnabled.get()) {
        return;
      }
      CodelessMatcher.getInstance().add(paramActivity);
      Object localObject1 = paramActivity.getApplicationContext();
      String str = FacebookSdk.getApplicationId();
      FetchedAppSettings localFetchedAppSettings = FetchedAppSettingsManager.getAppSettingsWithoutQuery(str);
      if (((localFetchedAppSettings != null) && (localFetchedAppSettings.getCodelessEventsEnabled())) || (isDebugOnEmulator()))
      {
        localObject1 = (SensorManager)((Context)localObject1).getSystemService("sensor");
        sensorManager = (SensorManager)localObject1;
        if (localObject1 == null) {
          return;
        }
        localObject1 = ((SensorManager)localObject1).getDefaultSensor(1);
        Object localObject2 = new com/facebook/appevents/codeless/ViewIndexer;
        ((ViewIndexer)localObject2).<init>(paramActivity);
        viewIndexer = (ViewIndexer)localObject2;
        localObject2 = viewIndexingTrigger;
        paramActivity = new com/facebook/appevents/codeless/CodelessManager$2;
        paramActivity.<init>(localFetchedAppSettings, str);
        ((ViewIndexingTrigger)localObject2).setOnShakeListener(paramActivity);
        sensorManager.registerListener((SensorEventListener)localObject2, (Sensor)localObject1, 2);
        if ((localFetchedAppSettings != null) && (localFetchedAppSettings.getCodelessEventsEnabled())) {
          viewIndexer.schedule();
        }
      }
      if ((isDebugOnEmulator()) && (!isAppIndexingEnabled.get())) {
        codelessSessionChecker.checkCodelessSession(str);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramActivity, CodelessManager.class);
    }
  }
  
  @VisibleForTesting
  public static void setCodelessSessionChecker(CodelessSessionChecker paramCodelessSessionChecker)
  {
    if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
      return;
    }
    try
    {
      codelessSessionChecker = paramCodelessSessionChecker;
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramCodelessSessionChecker, CodelessManager.class);
    }
  }
  
  public static void updateAppIndexing(Boolean paramBoolean)
  {
    if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
      return;
    }
    try
    {
      isAppIndexingEnabled.set(paramBoolean.booleanValue());
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramBoolean, CodelessManager.class);
    }
  }
  
  @VisibleForTesting
  public static abstract interface CodelessSessionChecker
  {
    public abstract void checkCodelessSession(String paramString);
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.codeless.CodelessManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */