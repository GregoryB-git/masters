package com.appsflyer.internal;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

public final class AFe1qSDK
{
  public final AFd1aSDK AFInAppEventParameterName;
  @NonNull
  public final String AFInAppEventType;
  private final boolean AFKeystoreWrapper;
  @NonNull
  public final String valueOf;
  @NonNull
  public final AFe1aSDK values;
  
  public AFe1qSDK() {}
  
  public AFe1qSDK(String paramString)
  {
    if (paramString != null)
    {
      try
      {
        localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        String str = localJSONObject.getString("ver");
        valueOf = str;
        AFKeystoreWrapper = localJSONObject.optBoolean("test_mode");
        AFInAppEventType = paramString;
        if (str.startsWith("default")) {
          paramString = AFe1aSDK.AFInAppEventType;
        }
      }
      catch (JSONException paramString)
      {
        break label104;
      }
      paramString = AFe1aSDK.AFKeystoreWrapper;
      values = paramString;
      JSONObject localJSONObject = localJSONObject.optJSONObject("features");
      if (localJSONObject != null)
      {
        paramString = new com/appsflyer/internal/AFd1aSDK;
        paramString.<init>(localJSONObject);
      }
      else
      {
        paramString = null;
      }
      AFInAppEventParameterName = paramString;
      return;
      label104:
      AFLogger.afErrorLogForExcManagerOnly("Error in RC config parsing", paramString);
      throw new JSONException("Failed to parse remote configuration JSON");
    }
    throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
  }
  
  public static boolean AFKeystoreWrapper(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return t.a(paramContext.getPackageManager());
    }
    try
    {
      paramContext.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
      return true;
    }
    catch (ClassNotFoundException paramContext)
    {
      AFLogger.afErrorLogForExcManagerOnly("InstantAppsRuntime not found", paramContext, true);
    }
    return false;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (AFe1qSDK.class == paramObject.getClass()))
    {
      paramObject = (AFe1qSDK)paramObject;
      if (AFKeystoreWrapper != AFKeystoreWrapper) {
        return false;
      }
      if (!valueOf.equals(valueOf)) {
        return false;
      }
      return AFInAppEventType.equals(AFInAppEventType);
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = (AFKeystoreWrapper * true + valueOf.hashCode()) * 31 + AFInAppEventType.hashCode();
    AFd1aSDK localAFd1aSDK = AFInAppEventParameterName;
    int j = i;
    if (localAFd1aSDK != null) {
      j = i * 31 + localAFd1aSDK.hashCode();
    }
    return j;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFe1qSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */