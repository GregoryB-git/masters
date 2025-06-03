package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class AFa1gSDK
  implements Runnable
{
  private static String AFInAppEventType = "https://%ssdk-services.%s/validate-android-signature";
  private static String AFKeystoreWrapper;
  private final String AFInAppEventParameterName;
  private final String AFLogger;
  private final String afDebugLog;
  private final String afErrorLog;
  private final Map<String, String> afErrorLogForExcManagerOnly;
  private final String afInfoLog;
  private final String afRDLog;
  private final WeakReference<Context> valueOf;
  private final Intent values;
  
  static
  {
    StringBuilder localStringBuilder = new StringBuilder("https://%svalidate.%s/api/v");
    localStringBuilder.append(AFa1eSDK.AFKeystoreWrapper);
    localStringBuilder.append("/androidevent?buildnumber=6.12.2&app_id=");
    AFKeystoreWrapper = localStringBuilder.toString();
  }
  
  public AFa1gSDK(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, Map<String, String> paramMap, Intent paramIntent)
  {
    valueOf = new WeakReference(paramContext);
    AFInAppEventParameterName = paramString1;
    afRDLog = paramString2;
    AFLogger = paramString4;
    afInfoLog = paramString5;
    afErrorLog = paramString6;
    afErrorLogForExcManagerOnly = paramMap;
    afDebugLog = paramString3;
    values = paramIntent;
  }
  
  private static AFd1hSDK values(Context paramContext, @NonNull AFe1dSDK paramAFe1dSDK)
  {
    AFa1eSDK.valueOf().AFKeystoreWrapper(paramContext);
    paramContext = AFa1eSDK.valueOf().AFInAppEventType();
    paramAFe1dSDK.AFInAppEventParameterName(AFInAppEventParameterNameAFInAppEventType.values("appsFlyerCount", 0));
    paramAFe1dSDK = new AFd1hSDK(paramAFe1dSDK, paramContext);
    paramContext = paramContext.AFVersionDeclaration();
    AFKeystoreWrapper.execute(new AFc1bSDK.4(paramContext, paramAFe1dSDK));
    return paramAFe1dSDK;
  }
  
  private static void values(boolean paramBoolean, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    if (AFa1eSDK.valueOf != null)
    {
      StringBuilder localStringBuilder = new StringBuilder("Validate callback parameters: ");
      localStringBuilder.append(paramString1);
      localStringBuilder.append(" ");
      localStringBuilder.append(paramString2);
      localStringBuilder.append(" ");
      localStringBuilder.append(paramString3);
      AFLogger.afDebugLog(localStringBuilder.toString());
      if (paramBoolean)
      {
        AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(paramString4)));
        AFa1eSDK.valueOf.onValidateInApp();
        return;
      }
      AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(paramString4)));
      paramString2 = AFa1eSDK.valueOf;
      paramString1 = paramString4;
      if (paramString4 == null) {
        paramString1 = "Failed validating";
      }
      paramString2.onValidateInAppFailure(paramString1);
    }
  }
  
  public final void run()
  {
    Object localObject1 = AFInAppEventParameterName;
    if ((localObject1 != null) && (((String)localObject1).length() != 0))
    {
      if (AppsFlyerLib.getInstance().isStopped()) {
        return;
      }
      Object localObject5;
      Object localObject6;
      AFe1cSDK localAFe1cSDK;
      Map localMap;
      try
      {
        localObject1 = (Context)valueOf.get();
        if (localObject1 == null) {
          return;
        }
        localObject2 = new java/util/HashMap;
        ((HashMap)localObject2).<init>();
        ((Map)localObject2).put("public-key", afRDLog);
        ((Map)localObject2).put("sig-data", AFLogger);
        ((Map)localObject2).put("signature", afDebugLog);
        localObject3 = new java/util/HashMap;
        ((HashMap)localObject3).<init>((Map)localObject2);
        localObject4 = afErrorLogForExcManagerOnly;
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        ((StringBuilder)localObject5).append(String.format(AFKeystoreWrapper, new Object[] { AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName() }));
        ((StringBuilder)localObject5).append(((Context)localObject1).getPackageName());
        localObject5 = localObject5.toString();
        localObject6 = AFa1eSDK.valueOf().AFInAppEventType().values().values("referrer", "");
        localAFe1cSDK = new com/appsflyer/internal/AFe1cSDK;
        localAFe1cSDK.<init>();
        afErrorLog = ((String)localObject6);
        localObject6 = AFa1eSDK.valueOf();
        localMap = ((AFa1eSDK)localObject6).AFInAppEventParameterName(localAFe1cSDK);
        localMap.put("price", afInfoLog);
        localMap.put("currency", afErrorLog);
        localMap.put("receipt_data", localObject3);
        if (localObject4 != null) {
          localMap.put("extra_prms", localObject4);
        }
      }
      finally
      {
        break label476;
      }
      localMap.putAll(((AFa1eSDK)localObject6).AFInAppEventType().afWarnLog().valueOf());
      values(localContext, (AFe1cSDK)localAFe1cSDK.values(localMap).AFKeystoreWrapper((String)localObject5));
      ((Map)localObject2).put("dev_key", AFInAppEventParameterName);
      ((Map)localObject2).put("app_id", localContext.getPackageName());
      ((Map)localObject2).put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(localContext));
      Object localObject4 = AppsFlyerProperties.getInstance().getString("advertiserId");
      if (localObject4 != null) {
        ((Map)localObject2).put("advertiserId", localObject4);
      }
      Object localObject3 = String.format(AFInAppEventType, new Object[] { AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName() });
      localObject4 = new com/appsflyer/internal/AFe1eSDK;
      ((AFe1eSDK)localObject4).<init>();
      Object localObject2 = (AFe1eSDK)((AFa1qSDK)localObject4).values((Map)localObject2).AFKeystoreWrapper((String)localObject3);
      localObject4 = values(localContext, (AFe1dSDK)localObject2);
      AppsFlyerRequestListener local2 = new com/appsflyer/internal/AFa1gSDK$2;
      local2.<init>(this, (AFd1hSDK)localObject4);
      AFInAppEventParameterName = local2;
      return;
      label476:
      if (AFa1eSDK.valueOf != null)
      {
        AFLogger.afErrorLog("Failed Validate request + ex", local2);
        values(false, AFLogger, afInfoLog, afErrorLog, local2.getMessage());
      }
      AFLogger.afErrorLog(local2.getMessage(), local2);
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFa1gSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */