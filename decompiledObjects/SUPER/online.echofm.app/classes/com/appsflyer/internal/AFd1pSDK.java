package com.appsflyer.internal;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler.PurchaseValidationCallback;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public abstract class AFd1pSDK
  extends AFd1oSDK<String>
{
  private final String AFLogger$LogLevel;
  private final AFe1vSDK AFVersionDeclaration;
  @NonNull
  private final Map<String, Object> afErrorLogForExcManagerOnly;
  private final AFb1gSDK afInfoLog;
  private final AFb1dSDK afWarnLog;
  private final PurchaseHandler.PurchaseValidationCallback getLevel;
  private final String onInstallConversionDataLoadedNative;
  
  public AFd1pSDK(@NonNull AFd1vSDK paramAFd1vSDK, @NonNull AFd1vSDK[] paramArrayOfAFd1vSDK, @NonNull AFc1xSDK paramAFc1xSDK, String paramString, Map<String, Object> paramMap, PurchaseHandler.PurchaseValidationCallback paramPurchaseValidationCallback)
  {
    super(paramAFd1vSDK, paramArrayOfAFd1vSDK, paramAFc1xSDK, paramString);
    AFb1gSDK localAFb1gSDK = paramAFc1xSDK.AFInAppEventParameterName();
    afInfoLog = localAFb1gSDK;
    AFb1dSDK localAFb1dSDK = paramAFc1xSDK.values();
    afWarnLog = localAFb1dSDK;
    paramAFc1xSDK = paramAFc1xSDK.AFLogger();
    AFVersionDeclaration = paramAFc1xSDK;
    boolean bool = paramMap.containsKey("billing_library_version");
    paramString = null;
    if (bool) {
      paramAFd1vSDK = (String)paramMap.remove("billing_library_version");
    } else {
      paramAFd1vSDK = null;
    }
    AFLogger$LogLevel = paramAFd1vSDK;
    if (paramMap.containsKey("connector_version")) {
      paramArrayOfAFd1vSDK = (String)paramMap.remove("connector_version");
    } else {
      paramArrayOfAFd1vSDK = null;
    }
    onInstallConversionDataLoadedNative = paramArrayOfAFd1vSDK;
    paramMap = new HashMap(new HashMap(paramMap));
    paramMap.put("app_id", valueOf.AFInAppEventType.getPackageName());
    paramMap.put("event_timestamp", Long.valueOf(paramAFc1xSDK.valueOf()));
    paramAFc1xSDK = AFb1gSDK.AFKeystoreWrapper();
    if (paramAFc1xSDK != null) {
      paramMap.put("cuid", paramAFc1xSDK);
    }
    paramAFc1xSDK = valueOf.AFInAppEventType;
    paramMap.put("app_version_name", AFa1fSDK.AFKeystoreWrapper(paramAFc1xSDK, paramAFc1xSDK.getPackageName()));
    HashMap localHashMap = new HashMap();
    paramAFc1xSDK = AFa1cSDK.values(valueOf.AFInAppEventType, new HashMap());
    if (paramAFc1xSDK != null) {
      paramAFc1xSDK = valueOf;
    } else {
      paramAFc1xSDK = null;
    }
    if (!AFb1uSDK.values(paramAFc1xSDK)) {
      localHashMap.put("advertising_id", paramAFc1xSDK);
    }
    paramAFc1xSDK = AFa1cSDK.AFInAppEventParameterName(valueOf.AFInAppEventType.getContentResolver());
    if (paramAFc1xSDK != null) {
      paramAFc1xSDK = valueOf;
    } else {
      paramAFc1xSDK = null;
    }
    if (!AFb1uSDK.values(paramAFc1xSDK)) {
      localHashMap.put("oaid", paramAFc1xSDK);
    }
    AFc1uSDK.AFa1wSDK localAFa1wSDK = AFa1cSDK.AFInAppEventParameterName(valueOf.AFInAppEventType.getContentResolver());
    paramAFc1xSDK = paramString;
    if (localAFa1wSDK != null) {
      paramAFc1xSDK = valueOf;
    }
    if (!AFb1uSDK.values(paramAFc1xSDK)) {
      localHashMap.put("amazon_aid", paramAFc1xSDK);
    }
    if (!AppsFlyerProperties.getInstance().getBoolean("deviceTrackingDisabled", false))
    {
      paramAFc1xSDK = afDebugLog.valueOf(localAFb1dSDK);
      if (!AFb1uSDK.values(paramAFc1xSDK)) {
        localHashMap.put("imei", paramAFc1xSDK);
      }
    }
    localHashMap.put("appsflyer_id", AFb1zSDK.valueOf(valueOf, AFInAppEventType));
    paramAFc1xSDK = new StringBuilder();
    paramAFc1xSDK.append(Build.VERSION.SDK_INT);
    localHashMap.put("os_version", paramAFc1xSDK.toString());
    localHashMap.put("sdk_version", "6.12.2");
    if (!AFb1uSDK.values(paramArrayOfAFd1vSDK)) {
      localHashMap.put("sdk_connector_version", paramArrayOfAFd1vSDK);
    }
    paramMap.put("device_data", localHashMap);
    if (!AFb1uSDK.values(paramAFd1vSDK)) {
      paramMap.put("billing_lib_version", paramAFd1vSDK);
    }
    afErrorLogForExcManagerOnly = paramMap;
    getLevel = paramPurchaseValidationCallback;
  }
  
  public boolean AFInAppEventParameterName()
  {
    AFc1gSDK localAFc1gSDK = afErrorLog;
    if ((localAFc1gSDK != null) && (localAFc1gSDK.getStatusCode() == 503)) {
      return true;
    }
    return super.AFInAppEventParameterName();
  }
  
  public final void AFInAppEventType(String paramString)
  {
    String str = new JSONObject(afErrorLogForExcManagerOnly).toString();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this);
    localStringBuilder.append(": preparing data: ");
    localStringBuilder.append(str);
    AFa1aSDK.values(localStringBuilder.toString());
    afRDLog.valueOf(paramString, str);
  }
  
  public final String afErrorLogForExcManagerOnly()
  {
    return AFLogger$LogLevel;
  }
  
  public final boolean afInfoLog()
  {
    return true;
  }
  
  public final AppsFlyerRequestListener afRDLog()
  {
    return null;
  }
  
  @NonNull
  public final Map<String, Object> afWarnLog()
  {
    return afErrorLogForExcManagerOnly;
  }
  
  public final void values()
  {
    super.values();
    Object localObject = afDebugLog();
    PurchaseHandler.PurchaseValidationCallback localPurchaseValidationCallback;
    if (localObject != null)
    {
      localPurchaseValidationCallback = getLevel;
      if (localPurchaseValidationCallback != null) {
        localPurchaseValidationCallback.onFailure((Throwable)localObject);
      }
    }
    localObject = afErrorLog;
    if (localObject != null)
    {
      localPurchaseValidationCallback = getLevel;
      if (localPurchaseValidationCallback != null) {
        localPurchaseValidationCallback.onResponse((ResponseNetwork)localObject);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFd1pSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */