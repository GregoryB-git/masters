package com.facebook.appevents.ondeviceprocessing;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEvent;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class OnDeviceProcessingManager
{
  private static final Set<String> ALLOWED_IMPLICIT_EVENTS = new HashSet(Arrays.asList(new String[] { "fb_mobile_purchase", "StartTrial", "Subscribe" }));
  
  private static boolean isEventEligibleForOnDeviceProcessing(AppEvent paramAppEvent)
  {
    boolean bool1 = CrashShieldHandler.isObjectCrashing(OnDeviceProcessingManager.class);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    try
    {
      int i;
      if ((paramAppEvent.getIsImplicit()) && (ALLOWED_IMPLICIT_EVENTS.contains(paramAppEvent.getName()))) {
        i = 1;
      } else {
        i = 0;
      }
      bool1 = paramAppEvent.getIsImplicit();
      if (((bool1 ^ true)) || (i != 0)) {
        bool2 = true;
      }
      return bool2;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramAppEvent, OnDeviceProcessingManager.class);
    }
    return false;
  }
  
  public static boolean isOnDeviceProcessingEnabled()
  {
    boolean bool1 = CrashShieldHandler.isObjectCrashing(OnDeviceProcessingManager.class);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    try
    {
      int i;
      if ((!FacebookSdk.getLimitEventAndDataUsage(FacebookSdk.getApplicationContext())) && (!Utility.isDataProcessingRestricted())) {
        i = 1;
      } else {
        i = 0;
      }
      bool1 = bool2;
      if (i != 0)
      {
        boolean bool3 = RemoteServiceWrapper.isServiceAvailable();
        bool1 = bool2;
        if (bool3) {
          bool1 = true;
        }
      }
      return bool1;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, OnDeviceProcessingManager.class);
    }
    return false;
  }
  
  public static void sendCustomEventAsync(String paramString, AppEvent paramAppEvent)
  {
    if (CrashShieldHandler.isObjectCrashing(OnDeviceProcessingManager.class)) {
      return;
    }
    try
    {
      if (isEventEligibleForOnDeviceProcessing(paramAppEvent))
      {
        Executor localExecutor = FacebookSdk.getExecutor();
        Runnable local2 = new com/facebook/appevents/ondeviceprocessing/OnDeviceProcessingManager$2;
        local2.<init>(paramString, paramAppEvent);
        localExecutor.execute(local2);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, OnDeviceProcessingManager.class);
    }
  }
  
  public static void sendInstallEventAsync(String paramString1, String paramString2)
  {
    if (CrashShieldHandler.isObjectCrashing(OnDeviceProcessingManager.class)) {
      return;
    }
    try
    {
      Context localContext = FacebookSdk.getApplicationContext();
      if ((localContext != null) && (paramString1 != null) && (paramString2 != null))
      {
        Executor localExecutor = FacebookSdk.getExecutor();
        Runnable local1 = new com/facebook/appevents/ondeviceprocessing/OnDeviceProcessingManager$1;
        local1.<init>(localContext, paramString2, paramString1);
        localExecutor.execute(local1);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString1, OnDeviceProcessingManager.class);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */