package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z2;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class FetchedAppGateKeepersManager
{
  private static final String APPLICATION_FIELDS = "fields";
  private static final long APPLICATION_GATEKEEPER_CACHE_TIMEOUT = 3600000L;
  private static final String APPLICATION_GATEKEEPER_EDGE = "mobile_sdk_gk";
  private static final String APPLICATION_GATEKEEPER_FIELD = "gatekeepers";
  private static final String APPLICATION_GRAPH_DATA = "data";
  private static final String APPLICATION_PLATFORM = "platform";
  private static final String APPLICATION_SDK_VERSION = "sdk_version";
  private static final String APP_GATEKEEPERS_PREFS_KEY_FORMAT = "com.facebook.internal.APP_GATEKEEPERS.%s";
  private static final String APP_GATEKEEPERS_PREFS_STORE = "com.facebook.internal.preferences.APP_GATEKEEPERS";
  private static final String APP_PLATFORM = "android";
  private static final String TAG = "com.facebook.internal.FetchedAppGateKeepersManager";
  private static final ConcurrentLinkedQueue<Callback> callbacks = new ConcurrentLinkedQueue();
  private static final Map<String, JSONObject> fetchedAppGateKeepers = new ConcurrentHashMap();
  private static final AtomicBoolean isLoading = new AtomicBoolean(false);
  @Nullable
  private static Long timestamp;
  
  @Nullable
  private static JSONObject getAppGateKeepersQueryResponse(String paramString)
  {
    Bundle localBundle = z2.d("platform", "android");
    localBundle.putString("sdk_version", FacebookSdk.getSdkVersion());
    localBundle.putString("fields", "gatekeepers");
    paramString = GraphRequest.newGraphPathRequest(null, String.format("%s/%s", new Object[] { paramString, "mobile_sdk_gk" }), null);
    paramString.setSkipClientToken(true);
    paramString.setParameters(localBundle);
    return paramString.executeAndWait().getJSONObject();
  }
  
  public static boolean getGateKeeperForKey(String paramString1, String paramString2, boolean paramBoolean)
  {
    paramString2 = getGateKeepersForApplication(paramString2);
    if (!paramString2.containsKey(paramString1)) {
      return paramBoolean;
    }
    paramString1 = (Boolean)paramString2.get(paramString1);
    if (paramString1 == null) {
      return paramBoolean;
    }
    return paramString1.booleanValue();
  }
  
  public static Map<String, Boolean> getGateKeepersForApplication(String paramString)
  {
    
    if (paramString != null)
    {
      Object localObject = fetchedAppGateKeepers;
      if (((Map)localObject).containsKey(paramString))
      {
        HashMap localHashMap = new HashMap();
        JSONObject localJSONObject = (JSONObject)((Map)localObject).get(paramString);
        if (localJSONObject == null) {
          return new HashMap();
        }
        paramString = localJSONObject.keys();
        while (paramString.hasNext())
        {
          localObject = (String)paramString.next();
          localHashMap.put(localObject, Boolean.valueOf(localJSONObject.optBoolean((String)localObject)));
        }
        return localHashMap;
      }
    }
    return new HashMap();
  }
  
  private static boolean isTimestampValid(@Nullable Long paramLong)
  {
    boolean bool = false;
    if (paramLong == null) {
      return false;
    }
    if (System.currentTimeMillis() - paramLong.longValue() < 3600000L) {
      bool = true;
    }
    return bool;
  }
  
  public static void loadAppGateKeepersAsync()
  {
    loadAppGateKeepersAsync(null);
  }
  
  public static void loadAppGateKeepersAsync(@Nullable Callback paramCallback)
  {
    if (paramCallback != null) {}
    try
    {
      callbacks.add(paramCallback);
      if (isTimestampValid(timestamp))
      {
        pollCallbacks();
        return;
      }
      Context localContext = FacebookSdk.getApplicationContext();
      String str1 = FacebookSdk.getApplicationId();
      String str2 = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", new Object[] { str1 });
      if (localContext == null) {
        return;
      }
      Object localObject = localContext.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0);
      paramCallback = null;
      String str3 = ((SharedPreferences)localObject).getString(str2, null);
      boolean bool = Utility.isNullOrEmpty(str3);
      if (!bool)
      {
        try
        {
          localObject = new org/json/JSONObject;
          ((JSONObject)localObject).<init>(str3);
          paramCallback = (Callback)localObject;
        }
        catch (JSONException localJSONException)
        {
          Utility.logd("FacebookSDK", localJSONException);
        }
        if (paramCallback != null) {
          parseAppGateKeepersFromJSON(str1, paramCallback);
        }
      }
      Executor localExecutor = FacebookSdk.getExecutor();
      if (localExecutor == null) {
        return;
      }
      bool = isLoading.compareAndSet(false, true);
      if (!bool) {
        return;
      }
      paramCallback = new com/facebook/internal/FetchedAppGateKeepersManager$1;
      paramCallback.<init>(str1, localContext, str2);
      localExecutor.execute(paramCallback);
      return;
    }
    finally {}
  }
  
  public static JSONObject parseAppGateKeepersFromJSON(String paramString, JSONObject paramJSONObject)
  {
    try
    {
      Object localObject1 = fetchedAppGateKeepers;
      if (((Map)localObject1).containsKey(paramString)) {
        localObject1 = (JSONObject)((Map)localObject1).get(paramString);
      } else {
        localObject1 = new JSONObject();
      }
      Object localObject2 = paramJSONObject.optJSONArray("data");
      paramJSONObject = null;
      int i = 0;
      if (localObject2 != null) {
        paramJSONObject = ((JSONArray)localObject2).optJSONObject(0);
      }
      if ((paramJSONObject != null) && (paramJSONObject.optJSONArray("gatekeepers") != null))
      {
        paramJSONObject = paramJSONObject.optJSONArray("gatekeepers");
        for (;;)
        {
          int j = paramJSONObject.length();
          if (i >= j) {
            break;
          }
          try
          {
            localObject2 = paramJSONObject.getJSONObject(i);
            ((JSONObject)localObject1).put(((JSONObject)localObject2).getString("key"), ((JSONObject)localObject2).getBoolean("value"));
          }
          catch (JSONException localJSONException)
          {
            Utility.logd("FacebookSDK", localJSONException);
          }
          i++;
        }
      }
      fetchedAppGateKeepers.put(paramString, localObject1);
      return (JSONObject)localObject1;
    }
    finally {}
  }
  
  private static void pollCallbacks()
  {
    Handler localHandler = new Handler(Looper.getMainLooper());
    for (;;)
    {
      Object localObject = callbacks;
      if (((ConcurrentLinkedQueue)localObject).isEmpty()) {
        break;
      }
      localObject = (Callback)((ConcurrentLinkedQueue)localObject).poll();
      if (localObject != null) {
        localHandler.post(new Runnable()
        {
          public void run()
          {
            if (CrashShieldHandler.isObjectCrashing(this)) {
              return;
            }
            try
            {
              val$callback.onCompleted();
              return;
            }
            finally
            {
              CrashShieldHandler.handleThrowable(localThrowable, this);
            }
          }
        });
      }
    }
  }
  
  @Nullable
  public static JSONObject queryAppGateKeepers(String paramString, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      localObject = fetchedAppGateKeepers;
      if (((Map)localObject).containsKey(paramString)) {
        return (JSONObject)((Map)localObject).get(paramString);
      }
    }
    JSONObject localJSONObject = getAppGateKeepersQueryResponse(paramString);
    if (localJSONObject == null) {
      return null;
    }
    Context localContext = FacebookSdk.getApplicationContext();
    Object localObject = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", new Object[] { paramString });
    localContext.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString((String)localObject, localJSONObject.toString()).apply();
    return parseAppGateKeepersFromJSON(paramString, localJSONObject);
  }
  
  public static abstract interface Callback
  {
    public abstract void onCompleted();
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.FetchedAppGateKeepersManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */