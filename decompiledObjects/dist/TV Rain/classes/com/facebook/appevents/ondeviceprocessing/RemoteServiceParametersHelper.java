package com.facebook.appevents.ondeviceprocessing;

import android.os.BaseBundle;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.eventdeactivation.EventDeactivationManager;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

class RemoteServiceParametersHelper
{
  private static final String TAG = "RemoteServiceWrapper";
  
  @Nullable
  public static Bundle buildEventsBundle(RemoteServiceWrapper.EventType paramEventType, String paramString, List<AppEvent> paramList)
  {
    if (CrashShieldHandler.isObjectCrashing(RemoteServiceParametersHelper.class)) {
      return null;
    }
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(paramList);
      paramList = new android/os/Bundle;
      paramList.<init>();
      paramList.putString("event", paramEventType.toString());
      paramList.putString("app_id", paramString);
      if (RemoteServiceWrapper.EventType.CUSTOM_APP_EVENTS == paramEventType)
      {
        paramEventType = buildEventsJson(localArrayList, paramString);
        if (paramEventType.length() == 0) {
          return null;
        }
        paramList.putString("custom_events", paramEventType.toString());
      }
      return paramList;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramEventType, RemoteServiceParametersHelper.class);
    }
    return null;
  }
  
  private static JSONArray buildEventsJson(List<AppEvent> paramList, String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(RemoteServiceParametersHelper.class)) {
      return null;
    }
    try
    {
      JSONArray localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>();
      EventDeactivationManager.processEvents(paramList);
      boolean bool = includeImplicitEvents(paramString);
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        paramString = (AppEvent)localIterator.next();
        if (paramString.isChecksumValid())
        {
          if (((paramString.getIsImplicit() ^ true)) || ((paramString.getIsImplicit()) && (bool))) {
            localJSONArray.put(paramString.getJSONObject());
          }
        }
        else
        {
          paramList = TAG;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder.append("Event with invalid checksum: ");
          localStringBuilder.append(paramString.toString());
          Utility.logd(paramList, localStringBuilder.toString());
        }
      }
      return localJSONArray;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramList, RemoteServiceParametersHelper.class);
    }
    return null;
  }
  
  private static boolean includeImplicitEvents(String paramString)
  {
    boolean bool1 = CrashShieldHandler.isObjectCrashing(RemoteServiceParametersHelper.class);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    try
    {
      paramString = FetchedAppSettingsManager.queryAppSettings(paramString, false);
      if (paramString != null) {
        bool2 = paramString.supportsImplicitLogging();
      }
      return bool2;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, RemoteServiceParametersHelper.class);
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.ondeviceprocessing.RemoteServiceParametersHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */