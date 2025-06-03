package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
public final class AFb1vSDK
{
  @NotNull
  private final Map<String, Object> AFInAppEventParameterName;
  @NotNull
  private final String AFInAppEventType;
  private final PackageManager values;
  
  public AFb1vSDK() {}
  
  public AFb1vSDK(AFb1bSDK paramAFb1bSDK, AFb1gSDK paramAFb1gSDK)
  {
    AFInAppEventParameterName = new LinkedHashMap();
    paramAFb1bSDK = AFInAppEventType;
    if (paramAFb1bSDK != null) {
      paramAFb1bSDK = paramAFb1bSDK.getPackageManager();
    } else {
      paramAFb1bSDK = null;
    }
    values = paramAFb1bSDK;
    paramAFb1bSDK = valueOf.AFInAppEventType.getPackageName();
    Intrinsics.checkNotNullExpressionValue(paramAFb1bSDK, "");
    AFInAppEventType = paramAFb1bSDK;
  }
  
  public static JSONObject AFKeystoreWrapper(String paramString)
  {
    paramString = AFa1rSDK.valueOf(paramString);
    if (paramString != null)
    {
      Object localObject1;
      try
      {
        boolean bool1 = AppsFlyerProperties.getInstance().getBoolean("disableProxy", false);
        boolean bool2 = paramString.optBoolean("monitor", false);
        localObject1 = AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly();
        if ((bool2) && (!bool1)) {
          ((AFb1tSDK)localObject1).AFKeystoreWrapper();
        }
      }
      finally
      {
        break label154;
      }
      ((AFb1tSDK)localObject1).AFInAppEventType();
      ((AFb1tSDK)localObject1).values();
      if (paramString.has("ol_id"))
      {
        String str2 = paramString.optString("ol_scheme", null);
        localObject1 = paramString.optString("ol_domain", null);
        String str1 = paramString.optString("ol_ver", null);
        if (str2 != null) {
          AppsFlyerProperties.getInstance().set("onelinkScheme", str2);
        }
        if (localObject1 != null) {
          AppsFlyerProperties.getInstance().set("onelinkDomain", (String)localObject1);
        }
        if (str1 != null)
        {
          AppsFlyerProperties.getInstance().set("onelinkVersion", str1);
          return paramString;
          label154:
          localObject1 = new StringBuilder("Error in handleResponse: ");
          ((StringBuilder)localObject1).append(str1.getMessage());
          AFLogger.afErrorLogForExcManagerOnly(localObject1.toString(), str1);
          AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventType();
          AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly().values();
        }
      }
    }
    return paramString;
  }
  
  @NotNull
  public final Map<String, Object> AFInAppEventParameterName()
  {
    if (AFInAppEventParameterName.isEmpty())
    {
      try
      {
        Object localObject1 = values;
        if (localObject1 != null)
        {
          localObject1 = ((PackageManager)localObject1).getInstallerPackageName(AFInAppEventType);
          if (localObject1 != null) {
            AFInAppEventParameterName.put("installer_package", localObject1);
          }
        }
      }
      catch (Exception localException)
      {
        AFLogger.afErrorLog("Exception while getting the app's installer package. ", localException);
      }
      if (Build.VERSION.SDK_INT >= 30)
      {
        Map localMap = AFInAppEventParameterName;
        LinkedHashMap localLinkedHashMap = new LinkedHashMap();
        Object localObject3 = AFInAppEventType;
        PackageManager localPackageManager = values;
        Object localObject2 = localLinkedHashMap;
        if (localPackageManager != null)
        {
          localObject3 = k.a(localPackageManager, (String)localObject3);
          localObject2 = localLinkedHashMap;
          if (localObject3 != null)
          {
            Intrinsics.checkNotNullExpressionValue(localObject3, "");
            localLinkedHashMap = new LinkedHashMap();
            localObject2 = l.a((InstallSourceInfo)localObject3);
            if (localObject2 != null) {
              localLinkedHashMap.put("initiating_package", localObject2);
            }
            localObject2 = m.a((InstallSourceInfo)localObject3);
            if (localObject2 != null) {
              localLinkedHashMap.put("installing_package", localObject2);
            }
            localObject3 = n.a((InstallSourceInfo)localObject3);
            localObject2 = localLinkedHashMap;
            if (localObject3 != null)
            {
              localLinkedHashMap.put("originating_package", localObject3);
              localObject2 = localLinkedHashMap;
            }
          }
        }
        localMap.put("install_source_info", localObject2);
      }
    }
    return AFInAppEventParameterName;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFb1vSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */