package com.facebook.appevents.suggestedevents;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.FacebookSdk;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class PredictionHistoryManager
{
  private static final String CLICKED_PATH_STORE = "com.facebook.internal.SUGGESTED_EVENTS_HISTORY";
  private static final String SUGGESTED_EVENTS_HISTORY = "SUGGESTED_EVENTS_HISTORY";
  private static final Map<String, String> clickedViewPaths = new HashMap();
  private static final AtomicBoolean initialized = new AtomicBoolean(false);
  private static SharedPreferences shardPreferences;
  
  public static void addPrediction(String paramString1, String paramString2)
  {
    if (CrashShieldHandler.isObjectCrashing(PredictionHistoryManager.class)) {
      return;
    }
    try
    {
      if (!initialized.get()) {
        initAndWait();
      }
      Map localMap = clickedViewPaths;
      localMap.put(paramString1, paramString2);
      shardPreferences.edit().putString("SUGGESTED_EVENTS_HISTORY", Utility.mapToJsonStr(localMap)).apply();
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString1, PredictionHistoryManager.class);
    }
  }
  
  @Nullable
  public static String getPathID(View paramView, String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(PredictionHistoryManager.class)) {
      return null;
    }
    for (;;)
    {
      try
      {
        localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>();
      }
      finally
      {
        JSONObject localJSONObject;
        CrashShieldHandler.handleThrowable(paramView, PredictionHistoryManager.class);
        return null;
      }
      try
      {
        localJSONObject.put("text", paramString);
        paramString = new org/json/JSONArray;
        paramString.<init>();
        if (paramView != null)
        {
          paramString.put(paramView.getClass().getSimpleName());
          paramView = ViewHierarchy.getParentOfView(paramView);
        }
        else
        {
          localJSONObject.put("classname", paramString);
        }
      }
      catch (JSONException paramView) {}
    }
    paramView = Utility.sha256hash(localJSONObject.toString());
    return paramView;
  }
  
  private static void initAndWait()
  {
    if (CrashShieldHandler.isObjectCrashing(PredictionHistoryManager.class)) {
      return;
    }
    try
    {
      AtomicBoolean localAtomicBoolean = initialized;
      if (localAtomicBoolean.get()) {
        return;
      }
      SharedPreferences localSharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
      shardPreferences = localSharedPreferences;
      clickedViewPaths.putAll(Utility.JsonStrToMap(localSharedPreferences.getString("SUGGESTED_EVENTS_HISTORY", "")));
      localAtomicBoolean.set(true);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, PredictionHistoryManager.class);
    }
  }
  
  @Nullable
  public static String queryEvent(String paramString)
  {
    boolean bool = CrashShieldHandler.isObjectCrashing(PredictionHistoryManager.class);
    String str = null;
    if (bool) {
      return null;
    }
    try
    {
      Map localMap = clickedViewPaths;
      if (localMap.containsKey(paramString)) {
        str = (String)localMap.get(paramString);
      }
      return str;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, PredictionHistoryManager.class);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.suggestedevents.PredictionHistoryManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */