package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.PurchaseHandler.PurchaseValidationCallback;
import java.util.Map;
import java.util.Set;

public final class AFd1wSDK
  extends AFd1pSDK
{
  public AFd1wSDK(@NonNull Map<String, Object> paramMap, PurchaseHandler.PurchaseValidationCallback paramPurchaseValidationCallback, @NonNull AFc1xSDK paramAFc1xSDK)
  {
    super(AFd1vSDK.AppsFlyer2dXConversionCallback, new AFd1vSDK[] { AFd1vSDK.values }, paramAFc1xSDK, null, paramMap, paramPurchaseValidationCallback);
    paramMap = AFd1vSDK.AFInAppEventParameterName;
    AFKeystoreWrapper.add(paramMap);
  }
  
  public final boolean AFInAppEventParameterName()
  {
    AFc1gSDK localAFc1gSDK = afErrorLog;
    if ((localAFc1gSDK != null) && (localAFc1gSDK.getStatusCode() == 424)) {
      return true;
    }
    return super.AFInAppEventParameterName();
  }
  
  public final AFc1qSDK<String> values(@NonNull String paramString)
  {
    paramString = AFLogger.values(afWarnLog(), paramString, afErrorLogForExcManagerOnly());
    if (paramString != null) {
      AFInAppEventType(valueOf.valueOf);
    }
    return paramString;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFd1wSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */